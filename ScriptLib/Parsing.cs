using System.Collections.Generic;

namespace ScriptLib
{
    public class Parsing
    {
        Deque<string> m_phase = new Deque<string>();

        public int GetNum()
        {
            return m_phase.Count;
        }

        bool Get(string line)
        {
            /*if (m_phase.empty()) return false;
			strcpy(line, (*m_phase.begin()).c_str());
			m_phase.pop_front();*/
            return true;
        }

        public string Get(int pos)
        {
            return m_phase[pos];
        }

        public bool Run(string line, string reg)
        {
            m_phase.Clear();
            Stack<string> phase = new Stack<string>();
            int flag = 0;
            int depth = 0;
            int regPos = 0;
            string cur = "";
            foreach (var pc in line)
            {
                if (flag != 0)
                {
                    if (pc == '"')
                    {
                        flag = 0;
                    }

                    cur += pc;
                }
                else
                {
                    switch (pc)
                    {
                        case '"':
                            cur += pc;
                            flag = 1;
                            break;

                        case '(':
                            cur += " ";
                            cur += string.Format("{0}{1}", reg, regPos);
                            phase.Push(cur);
                            cur = string.Format("{0}{1}=", reg, regPos);
                            regPos++;
                            depth++;
                            break;

                        case ')':
                            if (depth <= 0)
                            {
                                return false;
                            }
                            m_phase.AddToBack(cur);
                            cur = phase.Peek();
                            phase.Pop();
                            depth--;
                            break;

                        default:
                            cur += pc;
                            break;
                    }
                }
            }

            m_phase.AddToBack(cur);
            if (depth != 0)
            {
                return false;
            }

            return true;
        }
    }
}
