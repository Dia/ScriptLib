using System;
using System.Linq;

namespace ScriptLib
{
    public partial class Interpreter
    {
        public bool CodeMov()
        {
			string @var = new string(new char[Globals.STR_MAXLEN]);
			TokenData data = new TokenData();

			if (!ReadVar(ref @var))
			{
				Error("CodeMov : var error");
				return false;
			}

			if (!ReadValue(ref data))
			{
				Error("CodeMov : value error");
				return false;
			}

			if (m_scan)
			{
				return true;
			}

			m_varMap.data[@var] = data;
            return true;
        }

        public bool CodeAdd()
        {
			string @var = new string(new char[Globals.STR_MAXLEN]);
			TokenData data = new TokenData();

			if (!ReadVar(ref @var))
			{
				Error("CodeAdd : var error");
				return false;
			}
			if (!ReadValue(ref data))
			{
				Error("CodeAdd : value error");
				return false;
			}

			if (m_scan)
			{
				return true;
			}

			m_varMap.data[@var] += data;
            return true;
        }

        public bool CodeSub()
		{
			string @var = new string(new char[Globals.STR_MAXLEN]);
			TokenData data = new TokenData();

			if (!ReadVar(ref @var))
			{
				Error("CodeSub : var error");
				return false;
			}
			if (!ReadValue(ref data))
			{
				Error("CodeSub : value error");
				return false;
			}
			if (m_scan)
			{
				return true;
			}

			m_varMap.data[@var] -= data;
            return true;
        }

        public bool CodeMul()
		{
			string @var = new string(new char[Globals.STR_MAXLEN]);
			TokenData data = new TokenData();

			if (!ReadVar(ref @var))
			{
				Error("CodeMul : var error");
				return false;
			}
			if (!ReadValue(ref data))
			{
				Error("CodeMul : value error");
				return false;
			}
			if (m_scan)
			{
				return true;
			}

			m_varMap.data[@var] *= data;
            return true;
        }

        public bool CodeMod()
		{
			string @var = new string(new char[Globals.STR_MAXLEN]);
			TokenData data = new TokenData();

			if (!ReadVar(ref @var))
			{
				Error("CodeMod : var error");
				return false;
			}
			if (!ReadValue(ref data))
			{
				Error("CodeMod : value error");
				return false;
			}
			if (m_scan)
			{
				return true;
			}

			m_varMap.data[@var] %= data;
            return true;
        }

        public bool CodeDiv()
		{
			string @var = new string(new char[Globals.STR_MAXLEN]);
			TokenData data = new TokenData();
			if (!ReadVar(ref @var))
			{
				Error("CodeDiv : var error");
				return false;
			}
			if (!ReadValue(ref data))
			{
				Error("CodeDiv : value error");
				return false;
			}
			if (m_scan)
			{
				return true;
			}

			m_varMap.data[@var] /= data;
            return true;
        }

        public bool CodeInc()
		{
			string @var = new string(new char[Globals.STR_MAXLEN]);
			if (!ReadVar(ref @var))
			{
				Error("CodeInc : var error");
				return false;
			}
			if (m_scan)
			{
				return true;
			}

			m_varMap.data[@var]++;
            return true;
        }


        public bool CodeDec()
		{
			string @var = new string(new char[Globals.STR_MAXLEN]);
			if (!ReadVar(ref @var))
			{
				Error("CodeDec : var error");
				return false;
			}
			if (m_scan)
			{
				return true;
			}

			m_varMap.data[@var]--;
            return true;
        }

        public bool CodeCmp()
        {
			TokenData data = new TokenData();
			if (!ReadValue(ref data))
			{
				Error("CodeCmp : ReadValue");
				return false;
			}

			long addr = 0;
			if (!ReadNum(ref addr))
			{
				Error("CodeCmp : not goto ");
				return false;
			}
			if (m_scan)
			{
				return true;
			}

			if (data.GetNum() == 0) // 비교값이 거짓일때만..
			{
				if (!Goto(addr))
				{
					Error("CodeCmp : goto addr: hex[%x] dec[%d] ", addr, addr);
					return false;
				}
			}

            return true;
        }


        public bool CodePush()
        {
			string @var = new string(new char[Globals.STR_MAXLEN]);
			if (!ReadVar(ref @var))
			{
				Error("CodePop : var error");
				return false;
			}

			if (m_scan)
			{
				return true;
			}

			TokenData data = new TokenData();
			if (!m_varMap.Get(@var, ref data))
			{
				data = null;
			}

			m_tokenDataStack.Push(data);
            return true;
        }

        public bool CodePop()
		{
			string @var = new string(new char[Globals.STR_MAXLEN]);
			if (!ReadVar(ref @var))
			{
				Error("CodePop : var error");
				return false;
			}

			if (m_scan)
			{
				return true;
			}

			if (!m_tokenDataStack.Any())
			{
				return false;
			}

			m_varMap.Set(@var, m_tokenDataStack.Pop());
            return true;
        }


        public bool CodeCase()
        {
			TokenData data = new TokenData();
			if (!ReadValue(ref data))
			{
				Error("CodeCase : ReadValue");
				return false;
			}

			long addr = 0;
			if (!ReadNum(ref addr))
			{
				Error("CodeCmp : not goto ");
				return false;
			}

			if (m_scan)
			{
				return true;
			}

			if (m_varMap.data["$case"] != data)
			{
				if (!Goto(addr))
				{
					Error("CodeCase : goto addr: hex[%x] dec[%d] error", addr, addr);
					return false;
				}
			}

            return true;
        }

        public bool CodeGoto()
        {
			long addr = 0;
			if (!ReadNum(ref addr))
			{
				Error("CodeGoto : ReadNum(addr)");
				return false;
			}

			if (m_scan)
			{
				return true;
			}

			if (!Goto(addr))
			{
				Error("CodeGoto : goto addr: hex[%x] dec[%d] !Goto(addr)", addr, addr);
				return false;
			}

            return true;
        }

        public bool Goto(long pos)
        {
            if (m_gotoLock)
            {
                return true;
            }

            if (pos < 0)
            {
                Error("Goto : pos < 0 %d", pos);
                return false;
            }

            if (pos > m_size)
            {
                Error("Goto : pos > m_size %d", pos);
                return false;
            }

            m_pos = pos;
            return true;
        }


        public bool CodeFunc(ref TokenData ret)
        {
			ushort func = 0;
			if (!GetWord(ref func))
			{
				Error("CodeFunc : GetWordError1");
				return false;
			}

			Deque<TokenData> parm = new Deque<TokenData>();
			while (true)
			{
				TokenData data = new TokenData();
				byte type = 0;
				if (!GetByte(ref type))
				{
					Error("CodeFunc : GetByteError1");
					return false;
				}
				if (Convert.ToChar(type) == ';')
				{
					break;
				}

				var s = StringFunctions.StrChr("snfv?", Convert.ToChar(type));
				if (string.IsNullOrEmpty(s))
				{
					Error("CodeFunc: %c !strchr(\"snfv?\", type)", type);
					return false;
				}

				if (!ReadValue(ref data))
				{
					Error("CodeFunc: ReadValue(data)");
					return false;
				}

				switch (Convert.ToChar(type))
				{
					case 's':
						data.SetType(TokenData.TokenDataType.STR);
						break;

					case 'n':
						data.SetType(TokenData.TokenDataType.NUM);
						break;

					case 'f':
						break;
				}

				parm.AddToBack(data);
			}

			bool ret1 = m_handler.OnFunc(func, parm, ref ret);
            return ret1;
        }
    }
}
