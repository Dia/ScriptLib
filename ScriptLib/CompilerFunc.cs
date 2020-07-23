namespace ScriptLib
{
    public partial class Compiler
    {
        public override bool OnFunc(ScriptLine line, int func, string parm)
        {
            if (!CheckSwitchBlock()) return false;

            if (m_blockCheckMap.ContainsKey(func))
            {
                if (!m_block.IsComplete())
                {
                    Error("위쪽 부분에 if 나 다중 선택문 블럭이 완성되지 않았습니다.\n __block 으로 확인하세요");
                    return false;
                }
            }

            WriteCode(CODE.CODE_FUNC);
            WriteFunc((short)func);

            for (int i = 0; i < parm.Length; i++)
            {
                if (parm[i] == '.') break;
                if (parm[i] == 't')
                {
                    var temp = string.Empty;
                    line.Skip(" \t");
                    line.GetWord(ref temp, " \t");
                    continue;
                }

                //WriteType(parm[i]);

                bool flag;
                if (parm[i] == '?') flag = false;
                else flag = true;

                while (true)
                {

                    WriteType(parm[i]);
                    if (!Value(line, flag))
                    {
                        if (flag)
                        {
                            Error("function parament error {0} [{1}]", parm, parm[i]);
                        }
                        else
                        {
                            WriteVar("NULL");
                            WriteOp(";");
                            break;
                        }

                        return false;
                    }

                    if (flag) break;
                }
            }

            WriteType(';');

            return true;
        }
    }
}
