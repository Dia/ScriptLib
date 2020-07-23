using System.Collections.Generic;

namespace ScriptLib
{
    public partial class Interpreter
	{
		byte[] m_bin;
		long m_pos;
		int m_size;

		readonly VarMap m_varMap = new VarMap();

		bool m_scan;
		bool m_gotoLock;
		InterpretHandler m_handler = null;
        readonly Stack<TokenData> m_tokenDataStack = new Stack<TokenData>();


		public bool Proc()
		{
			TokenData temp = new TokenData();
			if (m_bin == null)
			{
				Error("CInterpreter::Proc m_bin == null");
				return false;
			}

			if (m_pos == m_size)
			{
				return false;
			}

			if (m_pos < 0 || m_pos > m_size)
			{
				Error("CInterpreter::Proc %x pos error [0~%x] size=  %d", m_pos, m_size);
				return false;
			}

			int code = 0;
			if (!ReadCode(ref code))
			{
				Error("CInterpreter::Proc read code error pos%d", m_pos);
				return false;
			}

			switch ((CODE)code)
			{
				case CODE.CODE_FUNC:
					if (!CodeFunc(ref temp))
					{
						return false;
					}
					break;

				case CODE.CODE_GOTO:
					if (!CodeGoto())
					{
						return false;
					}
					break;

				case CODE.CODE_MOV:
					if (!CodeMov())
					{
						return false;
					}
					break;

				case CODE.CODE_CMP:
					if (!CodeCmp())
					{
						return false;
					}
					break;

				case CODE.CODE_ADD:
					if (!CodeAdd())
					{
						return false;
					}
					break;

				case CODE.CODE_SUB:
					if (!CodeSub())
					{
						return false;
					}
					break;

				case CODE.CODE_MUL:
					if (!CodeMul())
					{
						return false;
					}
					break;

				case CODE.CODE_DIV:
					if (!CodeDiv())
					{
						return false;
					}
					break;

				case CODE.CODE_MOD:
					if (!CodeMod())
					{
						return false;
					}
					break;

				case CODE.CODE_INC:
					if (!CodeInc())
					{
						return false;
					}
					break;

				case CODE.CODE_DEC:
					if (!CodeDec())
					{
						return false;
					}
					break;

				case CODE.CODE_PUSH:
					if (!CodePush())
					{
						return false;
					}
					break;

				case CODE.CODE_POP:
					if (!CodePop())
					{
						return false;
					}
					break;

				case CODE.CODE_CASE:
					if (!CodeCase())
					{
						return false;
					}
					break;

				case CODE.CODE_END:
					return false;

				default:
					Error("CInterpreter::Proc code error pos{0} code[{1}]", m_pos, code);
					return false;
			}

			return true;
		}


		public bool Scan(BinBuf binBuf, int pos)
		{
			if (!Run(binBuf, pos))
			{
				return false;
			}

			m_scan = true;
			while (Proc())
			{
			}

			m_scan = false;
			return true;
		}

		public bool Run(BinBuf binBuf, long pos, bool gotoLock = false)
		{
			m_scan = false;
			m_gotoLock = gotoLock;

			if (binBuf == null)
			{
				Error("CInterpreter::Run bin error");
				return false;
			}

			m_bin = binBuf.GetBase();
			m_size = binBuf.GetSize();
			m_pos = pos;

			if (m_pos < 0 || m_pos >= m_size)
			{
				Error("CInterpreter::Run {0} pos error [0~{1}] limit", pos, m_size);
				return false;
			}

			m_varMap.Clear();
			return true;
		}

		public void RegisterHandler(InterpretHandler handler)
		{
			m_handler = handler;
			m_handler.Interpreter = this;
			m_handler.SetVarMap(m_varMap);
		}

		public void Error(string str, params object[] args)
		{
			if (m_handler != null)
			{
				return;
			}

			m_handler.OnError(string.Format(str, args));
		}

	}
}
