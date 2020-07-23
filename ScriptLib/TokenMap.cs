using System.Collections.Generic;

namespace ScriptLib
{
    public class TokenMap
    {
        private Dictionary<string, TokenInfo> m_tokenMap = new Dictionary<string, TokenInfo>();

        public void Set(string name, TOKENTYPE type, int num = 0, string str = "")
        {
            if (!m_tokenMap.ContainsKey(name))
            {
                m_tokenMap[name] = new TokenInfo();
            }

            m_tokenMap[name].Set(type, num, str);
        }

        public void Set(string name, TokenInfo info)
        {
            m_tokenMap[name] = info;
        }

        public bool Get(string name, out TokenInfo pInfo)
        {
            pInfo = null;
            if (!m_tokenMap.ContainsKey(name)) return false;
            pInfo = m_tokenMap[name];
            return true;
        }
    }
}
