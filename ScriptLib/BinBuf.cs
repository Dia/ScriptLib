using System.IO;

namespace ScriptLib
{
    public class BinBuf
	{
		byte[] m_buf = null;
		int m_bufSize;

		public byte[] GetBase()
		{
			return m_buf;
		}

		public int GetSize()
		{
			return m_bufSize;
		}

		public void Clear()
		{
			if (m_buf != null)
			{
				m_buf = null;
				m_buf = null;
			}

			m_bufSize = 0;
		}

		public bool Load(string fName)
		{
			m_buf = File.ReadAllBytes(fName);
			m_bufSize = m_buf.Length;
			return true;
		}

		public BinBuf()
		{
			m_buf = null;
			Clear();
		}

		public void Dispose()
		{
			Clear();
		}

	}
}
