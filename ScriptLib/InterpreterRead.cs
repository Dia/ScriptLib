using System;
using System.Collections.Generic;
using System.Linq;

namespace ScriptLib
{
    public partial class Interpreter
    {
        public bool CheckType(char c)
        {
            byte chk = 0;
            if (!GetByte(ref chk))
            {
                Error("CheckType: !GetByte");
                return false;
            }

            if (chk != c)
            {
                Error("CheckType: chk != c[{0}][{1}] != chk != c [{2}][{3}]", c, c, chk, chk);
                return false;
            }

            return true;
        }

        public bool ReadStr(ref string str)
        {
            if (!CheckType('s'))
            {
                Error("ReadStr: CheckType");
                return false;
            }

            if (!GetStr(ref str))
            {
                Error("ReadStr: !GetStr(str))");
                return false;
            }

            return true;
        }


        public bool ReadNum(ref long num)
        {
            if (!CheckType('n'))
            {
                Error("ReadNum: !CheckType");
                return false;
            }

            if (!GetNum(ref num))
            {
                Error("ReadNum: !GetNum");
                return false;
            }

            return true;
        }

        public bool ReadCode(ref int c)
        {
            if (!CheckType('c'))
            {
                Error("ReadCode:!CheckType");
                return false;
            }

            byte code = 0;
            if (!GetByte(ref code))
            {
                Error("ReadCode: !GetByte");
                return false;
            }

            c = code;
            return true;
        }

        public bool ReadVar(ref string @var)
        {
            if (!CheckType('v'))
            {
                Error("ReadVar: !CheckType");
                return false;
            }

            if (!GetStr(ref @var))
            {
                Error("ReadVar: !GetStr");
                return false;
            }

            return true;
        }

        public bool ReadValue(ref TokenData ret)
        {
            LinkedList<TokenData> dataQ = new LinkedList<TokenData>();
            List<byte> opQ = new List<byte>();

            byte type = 0;
            byte op = 0;
            string str = new string(new char[Globals.STR_MAXLEN]);
            long num = 0;

            while (true)
            {
                TokenData data = new TokenData();
                if (!PeekByte(ref type))
                {
                    Error("ReadValue: !PeekByte(type)");
                    return false;
                }

                //                Debug.Print(type.ToString());
                switch (Convert.ToChar(type))
                {
                    case 's':
                        if (!ReadStr(ref str))
                        {
                            Error("ReadValue: !ReadStr(str)");
                            return false;
                        }
                        data.Set(str);
                        //Debug.Print(Convert.ToChar(type).ToString() + ": " + str);
                        break;

                    case 'n':
                        if (!ReadNum(ref num))
                        {
                            Error("ReadValue: !ReadNum(num)");
                            return false;
                        }
                        data.Set(num);
                        //Debug.Print(Convert.ToChar(type).ToString() + ": " + num);
                        break;

                    case 'v':
                        if (!ReadVar(ref str))
                        {
                            Error("ReadValue: !ReadVar(str)");
                            return false;
                        }

                        if (!m_varMap.Get(str, ref data))
                        {
                            data = new TokenData();
                        }
                        break;

                    case 'f':
                        GetByte(ref type);
                        var n = 0;
                        if (!ReadCode(ref n))
                        {
                            Error("ReadValue: !ReadCode(num)");
                            return false;
                        }

                        num = n;
                        if (num != (int)CODE.CODE_FUNC)
                        {
                            Error("ReadValue: num != CODE_FUNC %d", num);
                            return false;
                        }

                        if (!CodeFunc(ref data))
                        {
                            Error("ReadValue: !CodeFunc(data)");
                            return false;
                        }
                        break;

                    default:
                        Error("ReadValue: not found c[%c] d[%d] h[%x] ", type, type, type);
                        return false;
                }

                dataQ.AddLast(data);
                if (!GetByte(ref op))
                {
                    Error("ReadValue:  !GetByte(op) %c", type);
                    return false;
                }

                if (op == (byte)OP.OP_END)
                {
                    break;
                }

                opQ.Add(op);
            }

            int count = opQ.Count;
            for (int i = 0; i < count; i++)
            {
                switch (opQ.ElementAt(i))
                {
                    case (byte)OP.OP_MUL:
                        {
                            var first = dataQ.ElementAt(i);
                            var second = dataQ.ElementAt(i + 1);

                            first.Set(first.GetNum() * second.GetNum());
                            second.Set(0);

                            opQ.RemoveAt(i);
                            opQ.Insert(i, (byte)OP.OP_ADD);
                        }
                        break;

                    case (byte)OP.OP_DIV:
                        {
                            var first = dataQ.ElementAt(i);
                            var second = dataQ.ElementAt(i + 1);

                            first.Set(first.GetNum() / second.GetNum());
                            second.Set(0);

                            opQ.RemoveAt(i);
                            opQ.Insert(i, (byte)OP.OP_ADD);
                        }
                        break;
                }
            }

            while (opQ.Any())
            {
                TokenData d1 = dataQ.First();
                dataQ.RemoveFirst();
                TokenData d2 = dataQ.First();
                dataQ.RemoveFirst();
                TokenData result = new TokenData();
                result.Set(0);

                switch (opQ.First())
                {
                    case (byte)OP.OP_ADD: result = d1 + d2; break;
                    case (byte)OP.OP_SUB: result = d1 - d2; break;
                    case (byte)OP.OP_MOD: result = d1 % d2; break;
                    case (byte)OP.OP_EQUAL: result.Set(d1 == d2); break;
                    case (byte)OP.OP_NOTEQUAL: result.Set(d1 != d2); break;
                    case (byte)OP.OP_LARGE: result.Set(d1 > d2); break;
                    case (byte)OP.OP_SMALL: result.Set(d1 < d2); break;
                    case (byte)OP.OP_LARGE_OR_EQUAL: result.Set(d1 >= d2); break;
                    case (byte)OP.OP_SMALL_OR_EQUAL: result.Set(d1 <= d2); break;
                    //case (byte)OP.OP_AND: result.Set(d1 && d2); break;
                    //case (byte)OP.OP_OR: result.Set(d1 || d2); break;
                    default: break;
                }

                dataQ.AddFirst(result);
                opQ.RemoveAt(0);
            }

            ret = dataQ.First.Value;
            return true;
        }
    }
}
