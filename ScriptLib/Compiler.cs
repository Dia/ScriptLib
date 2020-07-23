using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text.RegularExpressions;

namespace ScriptLib
{
    public partial class Compiler : ScriptHandler
    {
        public delegate void GLOBAL_ERROR_FUNC(string message);

        class GotoInfo
        {
            public int pos;
            public int id;
        };

        bool m_isError;
        int m_nSwitch;
        bool m_isCase;

        List<GotoInfo> m_gotoInfo = new List<GotoInfo>();
        Block m_block = new Block();
        Dictionary<int, bool> m_blockCheckMap = new Dictionary<int, bool>();
        Stack<int> m_whileStack = new Stack<int>();
        Script m_script = new Script();
        Asm m_asm = new Asm();
        Bin m_bin = new Bin();

        int m_nIf;
        int[] m_nSwitchInIf = new int[Globals.MAX_SWITCH];
        int m_whileBlock;
        CMD m_nCmd;

        GLOBAL_ERROR_FUNC m_globalErrorFunc;

        public Compiler()
        {
            m_script.RegisterHandler(this);
            m_globalErrorFunc = null;

            SetCmd(CMD.CMD_BLOCKBREAK, "__block");
            SetCmd(CMD.CMD_END, "end");
            SetCmd(CMD.CMD_VAR, "var");
            SetCmd(CMD.CMD_IF, "if");
            SetCmd(CMD.CMD_ELSEIF, "elseif");
            SetCmd(CMD.CMD_ELSE, "else");
            SetCmd(CMD.CMD_ENDIF, "endif");
            SetCmd(CMD.CMD_DECLARE, "declare");
            SetCmd(CMD.CMD_DEFINE, "define");
            SetCmd(CMD.CMD_SWITCH, "choose");
            SetCmd(CMD.CMD_CASE, "case");
            SetCmd(CMD.CMD_BREAK, "break");
            SetCmd(CMD.CMD_DEFAULT, "default");
            SetCmd(CMD.CMD_ENDSWITCH, "endchoose");
            SetCmd(CMD.CMD_DEFCMD, "defcmd");
            SetCmd(CMD.CMD_WHILE, "while");
            SetCmd(CMD.CMD_ENDWHILE, "endwhile");
            SetCmd(CMD.CMD_EXITWHILE, "exitwhile");

            m_whileBlock = 0;
            m_nSwitch = 0;
        }

        public void Complete()
        {
            Optimize();
            Release();
        }

        public override void Error(string str, params object[] args)
        {
            m_isError = true;
            m_asm.Error(string.Format(str, args));
            m_globalErrorFunc?.Invoke(string.Format(str, args));
        }

        public void Optimize()
        {
            WriteCode(CODE.CODE_END);

            m_asm.Put("\n\n\n");
            m_asm.Comment("optimize");
            m_asm.Comment("===================================================================");

            int count = m_gotoInfo.Count;
            for (int i = 0; i < count; i++)
            {
                int addr = 0;
                m_bin.Seek(m_gotoInfo[i].pos);
                m_block.GetInfo(m_gotoInfo[i].id, ref addr);
                m_asm.Commentf("optimize: move {0:x} - block {1} -> addr hex {2:x}:dec ", m_gotoInfo[i].pos, m_gotoInfo[i].id, addr);
                WriteNum(addr);
            }
        }

        public bool LoadEnum(string fName, int verDate)
        {
            int iter = 0;
            int date;
            /*
            FILE fp = fopen(fName, "r");
            if (fp == null)
            {
                return false;
            }

            if (verDate != 0)
            {
                fscanf(fp, "%d\n", date);
                if (date != verDate)
                {
                    //return false;	 2008.02.26 scriptdata\enum_v2.sc 등 해외 버전 검사 부분에서 오류가 자주 발생하여 날짜가 있어도 무시하도록 수정
                }
            }
            */
            var content = File.ReadAllLines(fName);
            var firstLine = content[0];
            IEnumerable<string> lines;
            if (verDate != 0)
            {
                lines = content.Skip(1);
            }
            else
            {
                lines = content;
            }

            var rIter = new Regex("#\\s?([0-9]*)");
            var idx = 0;
            while (true)
            {
                if (idx >= lines.Count())
                {
                    break;
                }

                var line = lines.ElementAt(idx);
                if (string.IsNullOrEmpty(line))
                {
                    idx++;
                    continue;
                }

                if (line.StartsWith(";"))
                {
                    idx++;
                    continue;
                }
                else if (line.StartsWith("#"))
                {
                    var m = rIter.Match(line);
                    if (m.Success)
                    {
                        iter = int.Parse(m.Groups[1].Value);
                    }
                    else
                    {
                        Console.WriteLine();
                    }
                }
                else
                {
                    LinkedList<string> wordQ = new LinkedList<string>();
                    SplitString(line, ref wordQ, ", \t\n");

                    int count = wordQ.Count;
                    for (int i = 0; i < count; i++)
                    {
                        if (string.IsNullOrEmpty(wordQ.ElementAt(i))) continue;
                        if (wordQ.ElementAt(i).Substring(0, 2) == "//")
                        {
                            break;
                        }

                        string num = new string(new char[Globals.STR_MAXLEN]);
                        num = string.Format("{0:D}\n", iter);

                        m_tokenMap.Set(wordQ.ElementAt(i), TOKENTYPE.TOKENTYPE_DEFINE, 1, num);
                        //				Trace("%s %d", wordQ[i].c_str(), iter);
                        iter++;
                    }
                }

                idx++;
            }

            return true;
        }

        public bool LoadDef(string fName)
        {
            var content = File.ReadAllLines(fName);
            foreach (var line in content)
            {
                if (string.IsNullOrEmpty(line)) continue;
                if (line.StartsWith("//")) continue;

                var stringValues = line.Split(new char[] { ' ', '\t' }, StringSplitOptions.RemoveEmptyEntries);
                m_tokenMap.Set(stringValues[0], TOKENTYPE.TOKENTYPE_DEFINE, 1, stringValues[1]);
            }

            //sscanf(line, "%s %s %s %s %s %s %s %s %s %s %s %s", name, num, uselevel, att, def, weight, price, need_class, _property, sztype, magicAtk, magicDef);
            return true;
        }


        public bool Run(string fName, int verDate = 0)
        {
            m_isError = false;
            m_nSwitch = 0;
            m_nIf = 0;
            int i;
            for (i = 0; i < Globals.MAX_SWITCH; i++)
            {
                m_nSwitchInIf[i] = 0;
            }

            m_nCmd = 0;
            m_isCase = false;
            m_asm.Comment("===================================================================\n");
            m_asm.Commentf("Load {0}", fName);

            if (!m_script.Load(fName, verDate))
            {
                Error("Load Error %s", fName);
                return false;
            }

            m_asm.Comment("===================================================================\n");
            for (i = 0; i < m_script.GetLineNum(); i++)
            {
                if (!m_script.Analyze(i) || m_isError)
                {
                    Error("file {0} line {1}: {2}", fName, i + 1, m_script.GetLine(i));
                    return false;
                }
            }

            return true;
        }

        public void SetCmd(CMD cmd, string str)
        {
            m_tokenMap.Set(str, TOKENTYPE.TOKENTYPE_COMMAND, (int)cmd);
        }

        public bool SetBin(string fName)
        {
            return m_bin.Set(fName);
        }

        public bool SetAsm(string fName)
        {
            return m_asm.Set(fName);
        }

        public bool SetAsm(Stream stream)
        {
            return m_asm.Set(stream);
        }

        public void Release()
        {
            m_asm.Release();
            m_bin.Release();
            m_gotoInfo.Clear();
        }

        public void SetGlobalErrorFunc(GLOBAL_ERROR_FUNC func)
        {
            m_globalErrorFunc = func;
        }

        private void SplitString(string stSrc, ref LinkedList<string> sqRet, string szDiv)
        {
            sqRet = new LinkedList<string>(stSrc.Split(szDiv.ToCharArray()));
        }
    }
}
