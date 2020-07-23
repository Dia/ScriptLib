namespace ScriptLib
{
    public partial class Compiler
    {
        public void WriteFunc(short func)
        {
            m_asm.Putf("[{0} {1:x}h] ", func, func);
            m_bin.WriteWord(func);
        }

        public void WriteType(char type)
        {
            switch (type)
            {
                case 's': m_asm.Put("str:"); break;
                case 'n': m_asm.Put("num:"); break;
                case 'f': m_asm.Put("float:"); break;
                case ';': m_asm.Put("end"); break;
            }

            m_bin.WriteByte(type);
        }

        public void WriteCode(CODE code)
        {
            m_asm.Line(m_bin.GetPos());

            switch (code)
            {
                case CODE.CODE_END: m_asm.Put("end "); break;
                case CODE.CODE_MOV: m_asm.Put("mov "); break;
                case CODE.CODE_ADD: m_asm.Put("add "); break;
                case CODE.CODE_SUB: m_asm.Put("sub "); break;
                case CODE.CODE_MUL: m_asm.Put("mul "); break;
                case CODE.CODE_DIV: m_asm.Put("div "); break;
                case CODE.CODE_INC: m_asm.Put("inc "); break;
                case CODE.CODE_DEC: m_asm.Put("dec "); break;
                case CODE.CODE_FUNC: m_asm.Put("func "); break;
                case CODE.CODE_CMP: m_asm.Put("cmp "); break;
                case CODE.CODE_GOTO: m_asm.Put("goto "); break;
                case CODE.CODE_PUSH: m_asm.Put("push "); break;
                case CODE.CODE_POP: m_asm.Put("pop "); break;
                case CODE.CODE_CASE: m_asm.Put("case "); break;
                default: m_asm.Put("Error"); break;
            }

            m_bin.WriteByte('c');
            m_bin.WriteByte((byte)code);
        }

        public void WriteVar(string var)
        {
            m_asm.Putf("v[{0}] ", var);
            m_bin.WriteByte('v');
            m_bin.WriteStr(var);
        }

        public void WriteNum(int n)
        {
            m_asm.Putf("[{0} {0:x}h]", n);
            m_bin.WriteByte('n');
            m_bin.WriteNum(n);
        }

        public void WriteStr(string str)
        {
            m_asm.Putf("\"{0}\" ", str);
            m_bin.WriteByte('s');
            m_bin.WriteStr(str);
        }

        public void WriteCall(string func)
        {
            m_asm.Putf("call {0}", func);
            m_bin.WriteByte('f');
        }

        public bool WriteOp(string op)
        {
            byte code = 0;
            if (string.Compare(op, ";") == 0) code = (byte)OP.OP_END;
            else if (string.Compare(op, "==") == 0) code = (byte)OP.OP_EQUAL;
            else if (string.Compare(op, "!=") == 0) code = (byte)OP.OP_NOTEQUAL;
            else if (string.Compare(op, "<>") == 0) code = (byte)OP.OP_NOTEQUAL;
            else if (string.Compare(op, ">=") == 0 || string.Compare(op, "=>") == 0) code = (byte)OP.OP_LARGE_OR_EQUAL;
            else if (string.Compare(op, "=<") == 0 || string.Compare(op, "<=") == 0) code = (byte)OP.OP_SMALL_OR_EQUAL;
            else if (string.Compare(op, ">") == 0) code = (byte)OP.OP_LARGE;
            else if (string.Compare(op, "<") == 0) code = (byte)OP.OP_SMALL;
            else if (string.Compare(op, "&&") == 0 || string.Compare(op, "&") == 0) code = (byte)OP.OP_AND;
            else if (string.Compare(op, "||") == 0 || string.Compare(op, "|") == 0) code = (byte)OP.OP_OR;
            else if (string.Compare(op, "+") == 0) code = (byte)OP.OP_ADD;
            else if (string.Compare(op, "-") == 0) code = (byte)OP.OP_SUB;
            else if (string.Compare(op, "*") == 0) code = (byte)OP.OP_MUL;
            else if (string.Compare(op, "/") == 0) code = (byte)OP.OP_DIV;
            else if (string.Compare(op, "%") == 0) code = (byte)OP.OP_MOD;
            else
            {
                Error("WriteOp: [{0}] not found", op);
                //	OutputDebugString(op);
                return false;
            }

            m_asm.Put(op);
            m_bin.WriteByte(code);
            return true;
        }

    }
}
