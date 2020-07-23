using System;

namespace ScriptLib
{
    public partial class Compiler
    {
        public bool CheckSwitchBlock()
        {
            if (m_nSwitch > 0)
            {
                if (m_isCase)
                    return true;
                else
                    if (m_nCmd == CMD.CMD_ENDIF)
                {
                    if (m_nIf > 0) return true;
                }
                else
                {
                    //			Error("switch-endswitch 블럭에서는 case-break 안에서만 명령어 사용이 가능합니다");
                    Error("at switch-endswitch just can use command in case-break!");
                    return false;
                }
            }
            return true;
        }

        public bool CmdBlockBreak(ScriptLine line)
        {
            var info = string.Empty;
            m_block.GetStrInfo(ref info);
            //	Error("현재 블럭 정보 - %s", info);
            Error("current block info - %s", info);
            return false;
        }

        public bool CmdDefCmd(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;

            var name = string.Empty;
            var data = string.Empty;
            line.Skip(" \t");
            if (!line.GetWord(ref name, " \t"))
            {
                //		Error("정의될 명령어가 없습니다");
                Error("there are no define command");
                return false;
            }

            line.Skip(" \t");
            if (!line.GetWord(ref data, " \t"))
            {
                //		Error("기본 명령어가 없습니다");
                Error("there are no base command");
                return false;
            }

            TokenInfo pTokenInfo;
            if (!m_tokenMap.Get(data, out pTokenInfo))
            {
                //		Error("%s 라는 명령어는 존재하지 않습니다", data);
                Error("%s not exist", data);
                return false;
            }

            m_tokenMap.Set(name, pTokenInfo.type, pTokenInfo.num, pTokenInfo.GetStr());
            return true;
        }

        public bool GetDefVar(ScriptLine line, ref string data, ref int isNum)
        {
            if (!CheckSwitchBlock()) return false;

            if (!line.GetWord(ref data, " \t+-"))
            {
                //		Error("정의 또는 숫자 정보가 없습니다");
                Error("there are no define or number");
                return false;
            }

            if (IsNum(data))
            {
                isNum = 1;
                return true;
            }

            TokenInfo pTokenInfo;
            if (!m_tokenMap.Get(data, out pTokenInfo))
            {
                //		Error("%s 는 정의되지 않은 토큰입니다", data);
                Error("{0} - not defined token", data);
                return false;
            }

            data = pTokenInfo.str;
            isNum = pTokenInfo.num;
            var op = string.Empty;
            if (line.GetOperator(ref op, "+-"))
            {
                int n = Convert.ToInt32(data);
                if (op.Equals("++")) n++;
                else if (op.Equals("--")) n--;
                else
                {
                    //			Error("%s 는 사용될수 없는 정의 연산자입니다", op);
                    Error("%s can not use define operater", op);
                    return false;
                }

                pTokenInfo.str = n.ToString();
            }

            return true;
        }

        public bool CmdDefine(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;
            var name = string.Empty;
            var data = string.Empty;
            int isNum = 0;

            line.Skip(" \t");
            if (!line.GetWord(ref name, " \t"))
            {
                //		Error("정의어 이름이 없습니다");
                Error("no define name");
                return false;
            }

            line.Skip(" \t");
            if (line.GetParse(ref data, '"')) isNum = 0;
            else if (!GetDefVar(line, ref data, ref isNum))
            {
                //		Error("정의 선언 값 부분에 문제가 있습니다");
                Error("problem of define value");
                return false;
            }

            m_tokenMap.Set(name, TOKENTYPE.TOKENTYPE_DEFINE, isNum, data);

            m_asm.Commentf("define {0} {1}", name, data);
            return true;
        }

        public bool CmdDeclare(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;

            int isNum = 0;
            var func = string.Empty;
            var parm = string.Empty;
            var code = string.Empty;
            var sp = string.Empty;

            line.Skip(" \t");
            if (!line.GetWord(ref func, " \t"))
            {
                //		Error("함수 이름이 없습니다");
                Error("no func name");
                return false;
            }

            line.Skip(" \t");
            if (!line.GetWord(ref parm, " \t"))
            {
                //		Error("파라미터 정보가 없습니다");
                Error("no parameter info");
                return false;
            }

            line.Skip(" \t");
            if (!GetDefVar(line, ref code, ref isNum))
            {
                //		Error("함수 코드 부분에 문제가 있습니다");
                Error("there are problem func code part");
                return false;
            }

            line.Skip(" \t");
            line.GetWord(ref sp, " \t");

            /*
            if (isNum != 0)
            {
                //		Error("함수 코드에는 숫자만 올수 있습니다");
                Error("just only number at func code");
                return false;
            }*/

            m_tokenMap.Set(func, TOKENTYPE.TOKENTYPE_FUNC, int.Parse(code), parm);
            m_asm.Commentf("declare {0} {1} {2}", func, parm, code);

            if (sp.Equals("blockcheck"))
            {
                m_blockCheckMap[Convert.ToInt32(code)] = true;
                m_asm.Comment("block check func");
            }

            return true;
        }

        public bool CmdVar(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;

            var var = string.Empty;

            line.Skip(" \t");
            if (!line.GetWord(ref var, "= \t"))
            {
                //Error("변수 이름이 없습니다");
                Error("no value name");
                return false;
            }

            m_tokenMap.Set(var, TOKENTYPE.TOKENTYPE_VAR);
            if (!OnVar(line, var)) return false;
            m_asm.Commentf("int {0}", var);
            return true;
        }

        public bool CmdWhile(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;

            m_whileStack.Push(m_whileBlock);

            WriteCode(CODE.CODE_CMP);
            if (!Value(line))
            {
                //		Error("if 에러"); 
                Error("if error");
                return false;
            }

            m_asm.Putf("not ");

            m_whileBlock = m_block.GetEndId();
            WriteGotoBlock(m_whileBlock);
            return true;
        }

        public bool CmdExitWhile(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;
            Goto(m_whileBlock);
            return true;
        }

        public bool CmdEndWhile(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;
            if (m_whileStack.Count == 0)
            {
                //		Error("while-endwhile개수가맞지않습니다"); 
                Error("while - endwhile not match number");
                return false;
            }

            m_whileBlock = m_whileStack.Pop();

            return true;
        }

        public bool CmdIf(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;

            WriteCode(CODE.CODE_CMP);
            if (!Value(line))
            {
                //		Error("if 에러"); 
                Error("if error");
                return false;
            }

            m_asm.Putf("not ");
            m_nIf++;
            WriteGotoBlock(m_block.GetNextId());
            return true;
        }

        public bool CmdElseIf(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;

            WriteCode(CODE.CODE_CMP);
            if (!Value(line))
            {
                //		Error("if 에러"); 
                Error("if error");
                return false;
            }
            m_asm.Putf("not ");
            WriteGotoBlock(m_block.GetNextId());
            return true;
        }

        public bool CmdElse(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;
            return true;
        }

        public bool CmdEndIf(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;

            if (m_nSwitchInIf[m_nIf] > 0)
            {
                Error("there are not endchoose commanded in if block!");
            }

            m_nIf--;
            return true;
        }

        public bool CmdEnd(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;

            WriteCode(CODE.CODE_END);
            return true;
        }

        public bool CmdSwitch(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;

            WriteCode(CODE.CODE_PUSH);
            WriteVar("$case");

            WriteCode(CODE.CODE_MOV);
            WriteVar("$case");

            if (!Value(line))
            {
                //		Error("switch에러"); 
                Error("switch error");
                return false;
            }

            m_nSwitch++;
            if (m_nIf > 0)
            {
                if (m_nSwitchInIf[m_nIf] < Globals.MAX_SWITCH)
                {
                    m_nSwitchInIf[m_nIf]++;
                }
                else
                {
                    Error("too many choosemenu command in if block");
                }
            }
            return true;
        }

        public bool CmdCase(ScriptLine line)
        {
            WriteCode(CODE.CODE_CASE);
            if (!Value(line))
            {
                //		Error("case 에러");
                Error("case error");
                return false;
            }

            m_asm.Putf("not ");
            WriteGotoBlock(m_block.GetNextId());
            m_isCase = true;
            return true;
        }

        public bool CmdBreak(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;

            if (m_nSwitch == 1) m_isCase = false;
            return true;
        }

        public bool CmdDefault(ScriptLine line)
        {
            if (!CheckSwitchBlock()) return false;
            return true;
        }

        public bool CmdEndSwitch(ScriptLine line)
        {
            if (m_nSwitch == 0)
            {
                Error("none choosemenu commanded before");
            }

            m_nSwitch--;
            if (m_nIf > 0)
            {
                m_nSwitchInIf[m_nIf]--;
            }
            WriteCode(CODE.CODE_POP);
            WriteVar("$case");
            return true;
        }

        public override bool OnCommand(ScriptLine line, CMD cmd)
        {
            switch (cmd)
            {
                case CMD.CMD_END: return CmdEnd(line);
                case CMD.CMD_VAR: return CmdVar(line);
                case CMD.CMD_IF: return CmdIf(line);
                case CMD.CMD_ELSEIF: return CmdElseIf(line);
                case CMD.CMD_ELSE: return CmdElse(line);
                case CMD.CMD_ENDIF: return CmdEndIf(line);
                case CMD.CMD_DECLARE: return CmdDeclare(line);
                case CMD.CMD_DEFINE: return CmdDefine(line);
                case CMD.CMD_SWITCH: return CmdSwitch(line);
                case CMD.CMD_CASE: return CmdCase(line);
                case CMD.CMD_BREAK: return CmdBreak(line);
                case CMD.CMD_DEFAULT: return CmdDefault(line);
                case CMD.CMD_ENDSWITCH: return CmdEndSwitch(line);
                case CMD.CMD_DEFCMD: return CmdDefCmd(line);
                case CMD.CMD_BLOCKBREAK: return CmdBlockBreak(line);
                case CMD.CMD_WHILE: return CmdWhile(line);
                case CMD.CMD_ENDWHILE: return CmdEndWhile(line);
                case CMD.CMD_EXITWHILE: return CmdExitWhile(line);
                default:
                    //			Error("알수 없는 명령 코드 %d", cmd);
                    Error("cant identify func code%d", cmd);
                    break;
            }

            return false;
        }

        public override bool OnControl(ScriptLine line, int cmd)
        {
            switch ((CMD)cmd)
            {
                case CMD.CMD_WHILE:
                case CMD.CMD_SWITCH:
                case CMD.CMD_IF:
                    if (!m_block.Start(m_bin.GetPos()))
                    {
                        //				Error("블럭 개수가 너무 많습니다");
                        Error("too many block number");
                        return false;
                    }
                    m_asm.Commentf("block {0}-{1} id{2}  addr hex[{3}]", m_block.GetCurId() >> 8, m_block.GetCurId() & 0xff, m_block.GetCurId(), m_bin.GetPos());
                    break;
                case CMD.CMD_BREAK:
                    Goto(m_block.GetEndId());
                    break;
                case CMD.CMD_DEFAULT:
                case CMD.CMD_CASE:
                    if (!m_block.Link(m_bin.GetPos()))
                    {
                        //				Error("연결된 블럭 개수가 너무 큽니다");
                        Error("too many linked block number");
                        return false;
                    }
                    m_asm.Commentf("block {0}-{1} id{2}  addr hex[{3}]", m_block.GetCurId() >> 8, m_block.GetCurId() & 0xff, m_block.GetCurId(), m_bin.GetPos());
                    break;
                case CMD.CMD_ELSEIF:
                case CMD.CMD_ELSE:
                    Goto(m_block.GetEndId());
                    if (!m_block.Link(m_bin.GetPos()))
                    {
                        //				Error("연결된 블럭 개수가 너무 큽니다");
                        Error("too many linked block number");
                        return false;
                    }
                    m_asm.Commentf("block {0}-{1} id{2}  addr hex[{3}]", m_block.GetCurId() >> 8, m_block.GetCurId() & 0xff, m_block.GetCurId(), m_bin.GetPos());
                    break;

                case CMD.CMD_ENDWHILE:
                case CMD.CMD_ENDSWITCH:
                case CMD.CMD_ENDIF:
                    if ((CMD)cmd == CMD.CMD_ENDWHILE)
                        Goto(m_block.GetStartId());

                    if (!m_block.Link(m_bin.GetPos()))
                    {
                        //				Error("연결된 블럭 개수가 너무 큽니다");
                        Error("too many linked block number");
                        return false;
                    }
                    m_asm.Commentf("block {0}-{1} id{2}  addr hex[{3}]", m_block.GetCurId() >> 8, m_block.GetCurId() & 0xff, m_block.GetCurId(), m_bin.GetPos());
                    m_asm.Commentf("block {0}-255 id{1}  addr hex[{2}]", m_block.GetCurId() >> 8, ((m_block.GetCurId() >> 8) << 8) | 0xff, m_bin.GetPos());
                    if (!m_block.End(m_bin.GetPos()))
                    {
                        //				Error("블럭 {} 개수가 맞지 않습니다");
                        Error("block {} not match number");
                        return false;
                    }
                    break;
            }

            return true;
        }

        public void Goto(int block)
        {
            WriteCode(CODE.CODE_GOTO);
            WriteGotoBlock(block);
        }

        public void WriteGotoBlock(int block)
        {
            GotoInfo gotoInfo = new GotoInfo { pos = m_bin.GetPos(), id = block };
            m_gotoInfo.Add(gotoInfo);
            m_asm.Putf("[addr {0:x}] goto {1}-{2}\tid", gotoInfo.pos, block >> 8, block & 0xff);
            WriteNum(block);
        }
    }
}
