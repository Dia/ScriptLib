namespace ScriptLib
{
    public abstract class ScriptHandler
    {
        const int STR_MAXLEN = 1024;

        public TokenMap m_tokenMap = new TokenMap();
        public abstract bool OnControl(ScriptLine line, int cmd);
        public abstract bool OnCommand(ScriptLine line, CMD cmd);
        public abstract bool OnFunc(ScriptLine line, int func, string parm);
        public abstract bool OnVar(ScriptLine line, string var);
        public abstract void Error(string str, params object[] args);

        public void SetTokenMap(TokenMap tokenMap)
        {
        }

        public bool AnalyzeLine(string str)
        {
            ScriptLine line = new ScriptLine(str);
            string word = new string(new char[STR_MAXLEN]);
            line.Skip(" \t");
            if (!line.GetWord(ref word, " \t(=+-*/[")) return true;

            TokenInfo tokenInfo;
            if (!m_tokenMap.Get(word, out tokenInfo))
            {
                Error("AnalyzeLine - [{0}] is not a tokenMap", word);
                return false;
            }

            if (tokenInfo.type == TOKENTYPE.TOKENTYPE_COMMAND)
            {
                if (!OnControl(line, tokenInfo.num))
                {
                    return false;
                }
            }

            Parsing Parse = new Parsing();
            if (!Parse.Run(line.GetBase(), "$"))
            {
                Error("(,) error type AnalyzeLine 1");
                return false;
            }

            for (int i = 0; i < Parse.GetNum(); i++)
            {
                var p = Parse.Get(i);
                if (!AnalyzeParse(ref p))
                {
                    return false;
                }
            }

            return true;
        }

        public bool AnalyzeParse(ref string str)
        {
            ScriptLine line = new ScriptLine(str);
            string word = new string(new char[STR_MAXLEN]);

            line.Skip(" \t");
            if (!line.GetWord(ref word, " \t(=+-*/%["))
            {
                return true;
            }

            TokenInfo tokenInfo = new TokenInfo();
            if (!m_tokenMap.Get(word, out tokenInfo))
            {
                if (word[0] != '$')
                {
                    Error("AnalyzeParse - 1:[%s] is not in a tokenMap", word);
                    return false;
                }

                m_tokenMap.Set(word, TOKENTYPE.TOKENTYPE_VAR);
                if (!m_tokenMap.Get(word, out tokenInfo))
                {
                    Error("AnalyzeParse - 2:[%s] is not in a tokenMap", word);
                    return false;
                }
            }

            switch (tokenInfo.type)
            {
                case TOKENTYPE.TOKENTYPE_COMMAND:
                    return OnCommand(line, (CMD)tokenInfo.num);

                case TOKENTYPE.TOKENTYPE_FUNC:
                    return OnFunc(line, tokenInfo.num, tokenInfo.str);

                case TOKENTYPE.TOKENTYPE_VAR:
                    return OnVar(line, word);
            }

            Error("[%s] token type not found", word, tokenInfo.type);
            return false;
        }
    }
}
