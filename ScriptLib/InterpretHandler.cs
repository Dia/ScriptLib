namespace ScriptLib
{
    public abstract class InterpretHandler
	{
		public void SetVarMap(VarMap varMap)
		{
			m_varMap = varMap;
		}

		public abstract bool OnFunc(int func, Deque<TokenData> parm, ref TokenData ret);

		public Interpreter Interpreter { get; internal set; }

		public abstract void OnError(string str);

		protected VarMap m_varMap;

	}
}
