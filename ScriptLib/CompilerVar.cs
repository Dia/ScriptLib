using System;
using System.Text.RegularExpressions;

namespace ScriptLib
{
    public partial class Compiler
    {
        public bool Value(ScriptLine line, bool flag = true)
        {
            var data = string.Empty;
            var op = string.Empty;
            while (true)
            {
                line.Skip(" \t[");
                if (line.GetParse(ref data, '"'))
                {
                    if (data.Length >= 250)
                    {
                        Error("Value: 250 strlen(data) >= 250 {0}", data);
                        return false;
                    }
                    WriteStr(data);
                }
                else if (line.GetParse(ref data, '#'))
                {
                    TokenInfo tokenInfo;
                    if (!m_tokenMap.Get(data, out tokenInfo))
                    {
                        Error("Value: [{0}]  is not in a token map - GetParse", data);
                        return false;
                    }
                    if (tokenInfo.num > 0)
                        WriteNum(Convert.ToInt32(tokenInfo.GetStr()));
                    else WriteStr(tokenInfo.GetStr());
                }
                else if (line.GetWord(ref data, "%!=+-/*&|>< \t[],"))
                {
                    if (IsNum(data)) WriteNum(Convert.ToInt32(data));
                    else
                    {
                        TokenInfo tokenInfo;

                        if (!m_tokenMap.Get(data, out tokenInfo))
                        {
                            Error("Value: [{0}] is not in a token map - GetWord", data);
                            return false;
                        }
                        switch (tokenInfo.type)
                        {
                            case TOKENTYPE.TOKENTYPE_VAR:
                                WriteVar(data);
                                break;

                            case TOKENTYPE.TOKENTYPE_DEFINE:
                                if (tokenInfo.num > 0)
                                {
                                    WriteNum(Convert.ToInt32(tokenInfo.GetStr()));
                                }
                                else
                                {
                                    WriteStr(tokenInfo.GetStr());
                                }
                                break;

                            case TOKENTYPE.TOKENTYPE_FUNC:
                                WriteCall(data);
                                if (!OnFunc(line, tokenInfo.num, tokenInfo.GetStr()))
                                {
                                    Error("Value: Func not found");
                                    return false;
                                }
                                break;
                            default:
                                {
                                    //						    Error("Value: %s 토큰은 사용될수 없습니다 line:%s", data, line.GetBase());
                                    Error("Value: {0} tokenInfo->type not found line:{1}", data, line.GetBase());
                                    return false;
                                }
                        }
                    }
                }
                else
                {
                    //			if (flag) Error("Value:값이 없습니다 line:%s", line.GetBase());
                    return false;
                }

                line.Skip(" \t,");
                if (!line.GetOperator(ref op, "%=+-/*&|><!")) break;
                if (string.IsNullOrEmpty(op)) break;

                if (!WriteOp(op))
                {
                    Error("Value: write error!");
                    return false;
                }
            }
            line.Skip("]");
            WriteOp(";");
            return true;
        }

        public override bool OnVar(ScriptLine line, string name)
        {
            var op = string.Empty;
            line.Skip(" \t");
            if (!line.GetOperator(ref op, "=+-*/%"))
            {
                //if (!op[0]) return true;
                //Error("OnVar1: !op [{0}] ", op);
                //return false;
                return true;
            }

            CODE code = 0;
            if (op.Equals("=")) code = CODE.CODE_MOV;
            else if (op.Equals("+=")) code = CODE.CODE_ADD;
            else if (op.Equals("-=")) code = CODE.CODE_SUB;
            else if (op.Equals("*=")) code = CODE.CODE_MUL;
            else if (op.Equals("/=")) code = CODE.CODE_DIV;
            else if (op.Equals("++")) code = CODE.CODE_INC;
            else if (op.Equals("--")) code = CODE.CODE_DEC;
            else if (op.Equals("%=")) code = CODE.CODE_MOD;
            else
            {
                Error("OnVar2: [{0}]  operator error1", op);
                return false;
            }

            WriteCode(code);
            WriteVar(name);
            if (code == CODE.CODE_INC || code == CODE.CODE_DEC) return true;
            if (!Value(line))
            {
                Error("{0} OnVar: !Value(line)", name);
                return false;
            }
            return true;
        }

        public bool IsNum(string str)
        {
            Regex r = new Regex(@"(^[-+]?\d+(,?\d*)*\.?\d*([Ee][-+]\d*)?$)|(^[-+]?\d?(,?\d*)*\.\d+([Ee][-+]\d*)?$)");
            return r.Match(str).Success;
        }
    }
}
