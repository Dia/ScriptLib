using System;

namespace ScriptLib
{
    public class TokenData
    {
        public override string ToString()
        {
            return $"str={str}, num={num}";
        }

        public enum TokenDataType
        {
            NUM,
            STR,
            FLOAT,
            DOUBLE,
        };

        public string str { get; set; }
        public int num { get; set; }
        public TokenDataType type { get; set; }

        public static bool operator &(TokenData a, TokenData b)
        {
            switch ((TokenDataType)a.type)
            {/*
                case TokenDataType.STR:
                    return (a.GetStr()[0] && b.GetStr()[0]);

                case TokenDataType.NUM:
                    return (a.GetNum() && b.GetNum());

                case TokenDataType.FLOAT:
                    return (a.GetFloat() && b.GetFloat());

                case TokenDataType.DOUBLE:
                    return (a.GetDouble() && b.GetDouble());*/
            }

            return false;
        }

        public static bool operator |(TokenData a, TokenData b)
        {
            switch (a.type)
            {/*
                case TokenDataType.STR:
                    return (a.GetStr()[0] || b.GetStr()[0]);

                case TokenDataType.NUM:
                    return (a.GetNum() || b.GetNum());

                case TokenDataType.FLOAT:
                    return (a.GetFloat() || b.GetFloat());

                case TokenDataType.DOUBLE:
                    return (a.GetDouble() || b.GetDouble());*/
            }

            return false;
        }

        public static bool operator !=(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                //		case	STR:	return (GetStr() == tokenData.GetStr()); break;
                case TokenDataType.STR:
                    return (string.Compare(a.GetStr(), b.GetStr()) != 0);

                case TokenDataType.NUM:
                    return (a.GetNum() != b.GetNum());

                case TokenDataType.FLOAT:
                    return (a.GetFloat() != b.GetFloat());

                case TokenDataType.DOUBLE:
                    return (a.GetDouble() != b.GetDouble());
            }

            return false;
        }

        public static bool operator ==(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                //		case	STR:	return (GetStr() == tokenData.GetStr()); break;
                case TokenDataType.STR:
                    return (string.Compare(a.GetStr(), b.GetStr()) == 0);

                case TokenDataType.NUM:
                    return (a.GetNum() == b.GetNum());

                case TokenDataType.FLOAT:
                    return (a.GetFloat() == b.GetFloat());

                case TokenDataType.DOUBLE:
                    return (a.GetDouble() == b.GetDouble());
            }

            return false;
        }

        public static bool operator >(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                //		case	STR:	return (GetStr() > tokenData.GetStr()); break;
                case TokenDataType.STR:
                    return (string.Compare(a.GetStr(), b.GetStr()) > 0);

                case TokenDataType.NUM:
                    return (a.GetNum() > b.GetNum());

                case TokenDataType.FLOAT:
                    return (a.GetFloat() > b.GetFloat());

                case TokenDataType.DOUBLE:
                    return (a.GetDouble() > b.GetDouble());
            }

            return false;
        }

        public static bool operator <(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                //		case	STR:	return (GetStr() > tokenData.GetStr()); break;
                case TokenDataType.STR:
                    return (string.Compare(a.GetStr(), b.GetStr()) < 0);

                case TokenDataType.NUM:
                    return (a.GetNum() < b.GetNum());

                case TokenDataType.FLOAT:
                    return (a.GetFloat() < b.GetFloat());

                case TokenDataType.DOUBLE:
                    return (a.GetDouble() < b.GetDouble());
            }

            return false;
        }

        public static bool operator >=(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                //		case	STR:	return (GetStr() > tokenData.GetStr()); break;
                case TokenDataType.STR:
                    return (string.Compare(a.GetStr(), b.GetStr()) >= 0);

                case TokenDataType.NUM:
                    return (a.GetNum() >= b.GetNum());

                case TokenDataType.FLOAT:
                    return (a.GetFloat() >= b.GetFloat());

                case TokenDataType.DOUBLE:
                    return (a.GetDouble() >= b.GetDouble());
            }

            return false;
        }

        public static bool operator <=(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                //		case	STR:	return (GetStr() > tokenData.GetStr()); break;
                case TokenDataType.STR:
                    return (string.Compare(a.GetStr(), b.GetStr()) <= 0);

                case TokenDataType.NUM:
                    return (a.GetNum() <= b.GetNum());

                case TokenDataType.FLOAT:
                    return (a.GetFloat() <= b.GetFloat());

                case TokenDataType.DOUBLE:
                    return (a.GetDouble() <= b.GetDouble());
            }

            return false;
        }

        //C++ TO C# CONVERTER NOTE: This 'CopyFrom' method was converted from the original copy assignment operator:
        //ORIGINAL LINE: void TokenData::operator =(const int n)
        private void CopyFrom(int n)
        {
            Set(n);
        }

        //C++ TO C# CONVERTER NOTE: This 'CopyFrom' method was converted from the original copy assignment operator:
        //ORIGINAL LINE: void TokenData::operator =(const char *s)
        private void CopyFrom(string s)
        {
            Set(s);
        }

        //C++ TO C# CONVERTER NOTE: This 'CopyFrom' method was converted from the original copy assignment operator:
        //ORIGINAL LINE: void TokenData::operator =(const float f)
        private void CopyFrom(float f)
        {
            Set(f);
        }

        //C++ TO C# CONVERTER NOTE: This 'CopyFrom' method was converted from the original copy assignment operator:
        //ORIGINAL LINE: void TokenData::operator =(const double d)
        private void CopyFrom(double d)
        {
            Set(d);
        }

        public static TokenData operator %(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                case TokenDataType.STR:
                    break;

                case TokenDataType.NUM:
                    a.num %= b.GetNum();
                    break;

                case TokenDataType.FLOAT:
                    break;

                case TokenDataType.DOUBLE:
                    break;
            }

            return a;
        }

        public static TokenData operator +(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                case TokenDataType.STR:
                    a.str += b.GetStr();
                    break;
                case TokenDataType.NUM:
                    a.num += b.GetNum();
                    break;
                case TokenDataType.FLOAT:
                    a.Set(a.GetFloat() + b.GetFloat());
                    break;
                case TokenDataType.DOUBLE:
                    a.Set(a.GetDouble() + b.GetDouble());
                    break;
            }

            return a;
        }

        public static TokenData operator -(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                case TokenDataType.STR:
                    break;
                case TokenDataType.NUM:
                    a.num -= b.GetNum();
                    break;
                case TokenDataType.FLOAT:
                    a.Set(a.GetFloat() - b.GetFloat());
                    break;
                case TokenDataType.DOUBLE:
                    a.Set(a.GetDouble() - b.GetDouble());
                    break;
            }

            return a;
        }

        public static TokenData operator *(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                case TokenDataType.STR:
                    break;
                case TokenDataType.NUM:
                    a.num *= b.GetNum();
                    break;
                case TokenDataType.FLOAT:
                    a.Set(a.GetFloat() * b.GetFloat());
                    break;
                case TokenDataType.DOUBLE:
                    a.Set(a.GetDouble() * b.GetDouble());
                    break;
            }

            return a;
        }

        public static TokenData operator /(TokenData a, TokenData b)
        {
            switch (a.type)
            {
                case TokenDataType.STR:
                    break;
                case TokenDataType.NUM:
                    {
                        int i = b.GetNum();
                        if (i != 0)
                        {
                            a.num /= i;
                        }
                        break;
                    }
                case TokenDataType.FLOAT:
                    {
                        float f = b.GetFloat();
                        if (f != 0F)
                        {
                            a.Set(a.GetFloat() / f);
                        }
                        break;
                    }
                case TokenDataType.DOUBLE:
                    double d = b.GetDouble();
                    if (d != 0)
                    {
                        a.Set(a.GetDouble() / d);
                    }
                    break;
            }

            return a;
        }

        /*
        private static TokenData operator ++(TokenData a, int UnnamedParameter)
        {
            switch (type)
            {
                case STR:
                    break;
                case NUM:
                    num++;
                    break;
                case float:
                    break;
                case double:
                    break;
            }
            return this;
        }*/

        public static TokenData operator ++(TokenData a)
        {
            switch (a.type)
            {
                case TokenDataType.STR:
                    break;
                case TokenDataType.NUM:
                    a.num++;
                    break;
                case TokenDataType.FLOAT:
                    break;
                case TokenDataType.DOUBLE:
                    break;
            }

            return a;
        }
        /*

        private static TokenData operator --(int UnnamedParameter)

        {
            switch (type)
            {
                case STR:
                    break;
                case NUM:
                    num--;
                    break;
                case float:
                    break;
                case double:
                    break;
            }
            return this;
        }*/

        public static TokenData operator --(TokenData a)
        {
            switch (a.type)
            {
                case TokenDataType.STR:
                    break;
                case TokenDataType.NUM:
                    a.num--;
                    break;
                case TokenDataType.FLOAT:
                    break;
                case TokenDataType.DOUBLE:
                    break;
            }

            return a;
        }

        //C++ TO C# CONVERTER WARNING: The original C++ declaration of the following method implementation was not found:
        //ORIGINAL LINE: void TokenData::SetType(int t)


        public void SetType(TokenData.TokenDataType t)
        {
            if (type == t)
            {
                return;
            }

            switch (t)
            {
                case TokenDataType.STR:
                    str = GetStr();
                    type = t;
                    break;

                case TokenDataType.NUM:
                    num = GetNum();
                    type = t;
                    break;

                case TokenDataType.FLOAT:
                    Set(GetFloat());
                    type = t;
                    break;

                case TokenDataType.DOUBLE:
                    Set(GetDouble());
                    type = t;
                    break;
            }
        }

        public void Set(string s)
        {
            if (s == null)
            {
                str = "";
                type = TokenDataType.STR;
            }
            else
            {
                str = s;
                type = TokenDataType.STR;
            }
        }

        public void Set(int n)
        {
            num = n;
            type = TokenDataType.NUM;
        }

        public void Set(bool n)
        {
            num = n ? 1 : 0;
            type = TokenDataType.NUM;
        }

        public void Set(long n)
        {
            Set((int)n);
        }

        public void Set(float f)
        {
            str = string.Format("{0:f}", f);
            type = TokenDataType.NUM;
        }

        public void Set(double d)
        {
            str = string.Format("{0:f}", d);
            type = TokenDataType.NUM;
        }

        public string GetStr()
        {
            if (type == TokenDataType.NUM)
            {
                str = string.Format("{0:D}", num);
            }

            return (string)str;
        }

        public int GetNum()
        {
            try
            {
                if (type == TokenDataType.STR)
                {
                    if (str == null || str == "")
                    {
                        return -1;
                    }

                    num = Convert.ToInt32(str);
                }

                return num;
            }
            catch { return 0; }
        }

        public float GetFloat()
        {
            if (type == TokenDataType.NUM)
            {
                return (float)num;
            }

            float f = 0;
            //sscanf(str.c_str(), "%f", f);
            return f;
        }

        public double GetDouble()
        {
            if (type == TokenDataType.NUM)
            {
                return (double)num;
            }

            double f = 0;
            //sscanf(str.c_str(), "%f", f);
            return f;
        }

        public bool IsNum()
        {
            if (type == TokenDataType.NUM)
            {
                return true;
            }

            return false;
        }

        public bool IsStr()
        {
            if (type == TokenDataType.STR)
            {
                return true;
            }

            return false;
        }

        public bool IsFloat()
        {
            if (type == TokenDataType.FLOAT)
            {
                return true;
            }

            return false;
        }
    }
}
