using System.Collections.Generic;

namespace ScriptLib
{
	public class VarMap
	{
		public SortedDictionary<string, TokenData> data = new SortedDictionary<string, TokenData>();

		public VarMap()
		{
			Clear();
		}

		public bool IsEmpty()
		{
			return data.Count == 0;
		}

		public void Clear()
		{
			data.Clear();
			data["NULL"] = null;
		}

		public void Set(string str, TokenData t)
		{
			data[str] = t;
		}

		public bool Get(string str, ref TokenData t)
		{
			if (!data.ContainsKey(str)) return false;
			t = data[str];
			return true;
		}

		public bool IsExist(string str)
		{
			return data.ContainsKey(str);
		}
	}

}
