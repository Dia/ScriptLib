using System;
using System.IO;
using System.Linq;
using System.Text;

namespace ScriptLib
{
    public class Script
    {
        const string BLOCKCOMMENT_BEGIN = "/*";
        const string BLOCKCOMMENT_END = "*/";
        const string LINECOMMENT = "//";
        const string STRING_BEGIN = "\"";
        const string STRING_END = "\"";

        TokenMap m_tokenMap;
        ScriptHandler m_handler;
        Deque<string> m_line = new Deque<string>();
        int m_bufSize;
        bool m_comment;

        public void RegisterHandler(ScriptHandler handler)
        {
            m_handler = handler;
            m_handler.SetTokenMap(m_tokenMap);
        }

        internal bool Load(string fName, int verDate)
        {
            Clear();
            int date;

            var content = File.ReadAllLines(fName, Encoding.GetEncoding(1252));
            if (content.Length == 0) return true;

            var firstLine = content[0];

            if (verDate != 0)
            {
                if (firstLine != verDate.ToString())
                {
                    //return	false;
                }
            }

            if (verDate != 0)
            { // version 날짜 있는경우 그건 빼고 계산한다.
              //fseek(fp, 8, SEEK_CUR); // XXXXXXXX(XXXX년XX월XX일)
              //m_bufSize -= 8;
                foreach (var line in content.Skip(1))
                {
                    m_line.AddToBack(line);
                }
            }
            else
            {
                foreach (var line in content)
                {
                    m_line.AddToBack(line);
                }
            }

            RemoveComment();
            return true;
        }

        private void RemoveComment()
        {
            bool flag = false;
            bool comment = false;
            int count = m_line.Count;

            for (int r = 0; r < count; r++)
            {
                if (flag == true)
                {
                    Console.WriteLine();
                }

                flag = false;
                string pc = m_line[r];
                int idx = 0;
                while (idx < pc.Length)
                {
                    var check = pc.Substring(idx);
                    if (comment)
                    {
                        if (check.IndexOf(BLOCKCOMMENT_END, StringComparison.Ordinal) > -1)
                        {
                            comment = false;
                            pc = pc.Substring(check.IndexOf(BLOCKCOMMENT_END, StringComparison.Ordinal) + BLOCKCOMMENT_END.Length);
                        }
                        else
                        {
                            pc = string.Empty;
                        }
                    }
                    else
                    {
                        if (flag)
                        {
                            if (check.StartsWith(STRING_END, StringComparison.Ordinal))
                                flag = false;
                        }
                        else
                        {
                            if (check.StartsWith(STRING_BEGIN, StringComparison.Ordinal))
                            {
                                flag = true;
                            }
                            else if (check.StartsWith(BLOCKCOMMENT_BEGIN, StringComparison.Ordinal))
                            {
                                comment = true;
                                pc = pc.Substring(0, idx);
                            }
                            else if (check.StartsWith(LINECOMMENT, StringComparison.Ordinal))
                            {
                                pc = pc.Substring(0, idx);
                                break;
                            }
                            /*
                            else if (pc.IndexOf(LINECOMMENT) > -1)
                            {
                                pc = pc.Substring(0, pc.IndexOf(LINECOMMENT));
                                break;
                            }*/
                            //else if (pc[idx] == '\n' || pc[idx] == '\r') *pc = 0;
                        }
                    }

                    idx++;
                }

                m_line[r] = pc;
            }
        }

        private void Clear()
        {
            //if (m_buf)
            //{
            //	delete[] m_buf;
            //	m_buf = NULL;
            //}

            m_line.Clear();
            m_bufSize = 0;
            m_comment = false;
        }

        internal int GetLineNum()
        {
            return m_line.Count;
        }

        internal string GetLine(int pos)
        {
            return m_line[pos];
        }

        internal bool Analyze(int pos)
        {
            return m_handler.AnalyzeLine(m_line[pos]);
        }
    }
}
