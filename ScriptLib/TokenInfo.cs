namespace ScriptLib
{
    public class TokenInfo
    {
        public int num;
        public TOKENTYPE type;
        public string str;

        public void Set(TOKENTYPE t, int n, string s)
        {
            type = t;
            num = n;
            str = s;
        }

        public string GetStr()
        {
            return str;
        }
    }
}
