using System.Collections.Generic;

namespace ScriptLib
{
    class Block
    {
		int m_alloc;
		int m_pos;
		int m_step;
		int m_depth;

		Stack<int> m_posStack = new Stack<int>();
		Stack<int> m_stepStack = new Stack<int>();
		SortedDictionary<int, int> m_infoMap = new SortedDictionary<int, int>();

		public Block()
		{
			m_alloc = 0;
			m_pos = 0;
			m_step = 0;
			m_depth = 0;
		}

		public bool IsComplete()
		{
			if (m_depth != 0)
			{
				return false;
			}

			return true;
		}

		public void GetStrInfo(ref string buf)
		{
			buf = string.Format("index {0:D}-{1:D} depth {2:D}", m_pos, m_step, m_depth);
		}

		public bool GetInfo(int id, ref int info)
		{
			if (!m_infoMap.ContainsKey(id)) return false;
			info = m_infoMap[id];
			return true;
		}

		public int GetStartId()
		{
			return (m_pos << 8) | 0;
		}

		public int GetCurId()
		{
			return (m_pos << 8) | m_step;
		}

		public int GetNextId()
		{
			return (m_pos << 8) | (m_step + 1);
		}

		public int GetEndId()
		{
			return (m_pos << 8) | 0xff;
		}

		public void Label(int id, int info)
		{
			m_infoMap[id] = info;
		}

		public bool Start(int info)
		{
			if (m_alloc >= 0xffffff)
			{
				return false;
			}

			m_stepStack.Push(m_step);
			m_posStack.Push(m_pos);
			m_pos = m_alloc;
			m_alloc++;
			m_step = 0;
			m_depth++;

			Label(GetCurId(), info);
			return true;
		}

		public bool Link(int info)
		{
			if (m_step >= 255)
			{
				return false;
			}

			m_step++;
			Label(GetCurId(), info);
			return true;
		}

		public bool End(int info)
		{
			Label(GetEndId(), info);

			if (m_depth == 0)
			{
				return false;
			}

			m_step = m_stepStack.Pop();
			m_pos = m_posStack.Pop();

			m_depth--;
			if (m_depth < 0)
			{
				return false;
			}
			return true;
		}
	}
}
