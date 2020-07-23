using System.Linq;

namespace ScriptLib
{
    public class ScriptLine
    {
        string m_line;
        string m_cur;

        public ScriptLine(string str)
        {
            m_line = str;
            m_cur = str;
        }

        public void Skip(string v)
        {
            var idx = 0;
            while (idx < m_cur.Length)
            {
                if (v.Contains(m_cur[idx]))
                {
                    idx++;
                    continue;
                }

                break;
            }

            m_cur = m_cur.Substring(idx);
        }

        public string GetCur()
        {
            return m_cur;
        }

        public string GetBase()
        {
            return m_line;
        }

        internal bool GetWord(ref string word, string v)
        {
            if (string.IsNullOrEmpty(m_cur)) return false;
            if (m_cur.IndexOfAny(v.ToCharArray()) == -1)
            {
                word = m_cur;
            }
            else
            {
                word = m_cur.Substring(0, m_cur.IndexOfAny(v.ToCharArray()));
            }

            m_cur = m_cur.Substring(word.Length);
            return true;
        }

        internal bool GetParse(ref string data, char div)
        {
            if (m_cur.Length == 0) return false;
            if (m_cur[0] != div) return false;

            var idx = 1;
            while (true)
            {
                if (m_cur.Length <= idx) return false;
                if (m_cur[idx] == div)
                {
                    idx++;
                    break;
                }

                idx++;
            }

            if (1 == idx)
            {
                data = string.Empty;
            }
            else
            {
                data = m_cur.Substring(1, idx - 2);
            }

            m_cur = m_cur.Substring(data.Length+2);
            return true;
        }

        internal bool GetOperator(ref string op, string v)
        {
            var idx = 0;
            if (string.IsNullOrEmpty(m_cur)) return false;

            while (true)
            {
                if (idx >= m_cur.Length)
                {
                    break;
                }
                else if (v.Contains(m_cur[idx]))
                {
                    idx++;
                }
                else
                {
                    break;
                }
            }

            op = m_cur.Substring(0, idx);
            m_cur = m_cur.Substring(op.Length);

            return true;
        }
    }
}
