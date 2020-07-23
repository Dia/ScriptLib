using System.Text;

namespace ScriptLib
{
    public partial class Interpreter
    {
        public bool PeekByte(ref byte data)
        {
            int size = sizeof(byte);
            if (m_pos + size > m_size)
            {
                Error("PeekByte error %d + %d/%d", m_pos, size, m_size);
                return false;
            }

            data = (byte)m_bin[m_pos];
            return true;
        }

        public bool GetByte(ref byte data)
        {
            int size = sizeof(byte);
            if (m_pos + size > m_size)
            {
                Error("GetByte error %d + %d/%d", m_pos, size, m_size);
                return false;
            }

            data = (byte)m_bin[m_pos];
            m_pos += size;
            return true;
        }

        public bool GetWord(ref ushort data)
        {
            int size = sizeof(ushort);
            if (m_pos + size > m_size)
            {
                Error("GetWord error %d + %d/%d", m_pos, size, m_size);
                return false;
            }

            data = (ushort)((m_bin[m_pos + 1] << 8) | m_bin[m_pos]);
            m_pos += size;
            return true;
        }

        public bool GetDword(ref uint data)
        {
            int size = sizeof(uint);
            if (m_pos + size > m_size)
            {
                Error("GetDword error %d + %d/%d", m_pos, size, m_size);
                return false;
            }
            /*
			string pc = m_bin + m_pos;
			m_pos += size;
			data = (uint)pc;
			*/
            return true;
        }

        public bool GetNum(ref long data)
        {
            int size = sizeof(long);
            if (m_pos + size > m_size)
            {
                Error("GetNum error %d + %d/%d", m_pos, size, m_size);
                return false;
            }

            data = m_bin[m_pos] | (m_bin[m_pos + 1] << 8) | (m_bin[m_pos + 2] << 16) | (m_bin[m_pos + 3] << 24) | (m_bin[m_pos + 4] << 32) | (m_bin[m_pos + 5] << 40) | (m_bin[m_pos + 6] << 48) | (m_bin[m_pos + 7] << 56);
            m_pos += size;
            return true;
        }

        public bool GetStr(ref string str)
        {
            ushort size = 0;
            if (!GetWord(ref size))
            {
                Error("GetNum error %d + %d/%d", m_pos, size, m_size);
                return false;
            }

            if (m_pos + size > m_size)
            {
                return false;
            }

            str = Encoding.GetEncoding(1252).GetString(m_bin, (int)m_pos, size - 1);
            m_pos += size;
            return true;
        }

        public long GetCurPos()
        {
            return m_pos;
        }

    }
}
