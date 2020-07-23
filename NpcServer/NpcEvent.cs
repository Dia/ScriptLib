using ScriptLib;
using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace ZoneProcess
{
    public class NpcEvent : InterpretHandler
    {
        private int? _npcId;
        private BinBuf _binBuf;
        private int _waitType;
        private DateTime _waitTime;
        private bool _isDisableItemMove;

        public override void OnError(string str)
        {
            throw new NotImplementedException();
        }

        public override bool OnFunc(int func, Deque<TokenData> parm, ref TokenData ret)
        {
            switch (func)
            {
                case (int)Std._return:
                    return true;

                case (int)Std.trace:
                    return FuncTrace(parm[0].GetStr());

                case (int)Std.rand: // trace
                    return true;

                case (int)Std.lot: // lot
                    return FuncLot(parm[0].GetNum(), parm[1].GetNum());

                case (int)Std.OnInit: // OnInit
                    return FuncLabel(NPCACTION.ONINIT, parm);

                case (int)Std.OnClick: // OnClick
                    return FuncLabel(NPCACTION.ONCLICK, parm);

                case (int)Std.OnTouch: // OnTouch
                    return FuncLabel(NPCACTION.ONTOUCH, parm);

                case (int)Std.OnMyMobDead: // OnMyMobDead
                    return FuncLabel(NPCACTION.ONMYMOBDEAD, parm);

                case (int)Std.OnTimer: // OnTimer
                    return FuncLabel(NPCACTION.ONTIMER, parm);

                case (int)Std.OnCommand: // OnCommand
                    return FuncLabel(NPCACTION.ONCOMMAND, parm);

                case (int)Std.OnStartArena: // OnStartArena
                    return FuncLabel(NPCACTION.ONSTARTARENA, parm);

                case (int)Std.OnTouchNPC: // OnTouchNPC
                    return FuncLabel(NPCACTION.ONTOUCHNPC, parm);

                case (int)Std.OnTouch2: // OnTouch2
                    return FuncLabel(NPCACTION.ONTOUCH2, parm);

                case (int)Std.OnMoveNpcCmd_XXX: // OnMoveNpcCmd:_XXX
                    return FuncLabel(NPCACTION.ONMOVENPCCMD, parm);

                case (int)Std.OnCampCommand: // OnCampCommand
                    return FuncLabel(NPCACTION.ONCAMPCOMMAND, parm);

                case (int)Std.OnCampCommand2: // OnCampCommand2
                    return FuncLabel(NPCACTION.ONCAMPCOMMAND2, parm);

                case (int)Std.OnAgitInvest: // OnAgitInvest
                    return FuncLabel(NPCACTION.ONAGITINVEST, parm);

                case (int)Std.OnMyMobDead_NPC: // OnMyMobDead_NPC
                    return FuncLabel(NPCACTION.ONMYMOBDEAD_NPC, parm);

                case (int)Std.OnPlayerDead: // OnPlayerDead
                    return FuncLabel(NPCACTION.ONPLAYERDEAD, parm);

                case (int)Std.npc: // npc
                    {
                        var npcInfo = new NpcSvrNpcInfo
                        {
                            Zone = parm[0].GetStr(),
                            Name = parm[1].GetStr(),
                            Sprite = parm[2].GetNum(),
                            X = parm[3].GetNum(),
                            Y = parm[4].GetNum(),
                            Direction = parm[5].GetNum(),
                            W = parm[6].GetNum(),
                            H = parm[7].GetNum()
                        };
                        return FuncNpc(npcInfo);
                    }

                case (int)Std.mob:
                    return true;

                case (int)Std.warp:
                    {
                        var npcInfo = new NpcSvrNpcInfo
                        {
                            Zone = parm[0].GetStr(),
                            Name = parm[1].GetStr(),
                            X = parm[2].GetNum(),
                            Y = parm[3].GetNum(),
                            W = parm[4].GetNum(),
                            H = parm[5].GetNum()
                        };
                        return FuncNpc(npcInfo);
                    }

                case (int)Std.dialog:
                    Debug.Print($"dialog \"{parm[0].GetStr()}\"");
                    return true;

                case (int)Std.moveto:
                    return true;

                case (int)Std.wait:
                    _waitType = 1;
                    _waitTime = DateTime.UtcNow.AddMinutes(1);
                    return true;

                case (int)Std.close:
                    return true;

                case (int)Std.checkpoint:
                    return true;

                case (int)Std.DisableItemMove:
                    return FuncDisableItemMove();

                case (int)Std.EnableItemMove:
                    return FuncEnableItemMove();
            }

            //bool result = false;
            //if (_npcId != null)
            //    result = DefaultNpcFunc(_npcId, parm, func, ret);
            //else
            //    result = GlobalFunc(func, parm, v4, ret);

            Debug.Print($"Missing function: {func.ToString()}");
            return true;
        }

        private bool FuncNpc(NpcSvrNpcInfo npcInfo)
        {
            return FuncNpc2(npcInfo) >= 1;
        }

        static int id = 1;
        private int FuncNpc2(NpcSvrNpcInfo npcInfo)
        {
            // find zone by map
            var aid = id++;
            _npcId = aid;
            var npc = NpcMgr.Add(aid);
            npc.SetInfo(aid, npcInfo);
            ScriptEventHandler.AddNpc(aid, npcInfo, npcInfo.Zone);
            return aid;
        }

        internal bool FuncLabel(NPCACTION act, IEnumerable<TokenData> parm)
        {
            var npc = NpcMgr.Get(_npcId.Value);
            if (npc != null)
            {
                var pos = Interpreter.GetCurPos();
                if (npc.SetActionScript(act, parm, pos) > 0)
                {
                    if (act == NPCACTION.ONINIT)
                    {
                        //std::vector<int,std::allocator<int>>::push_back((std::vector<int,std::allocator<int> > *)(a2 + 188), &npcId);
                        //v7->m_OnInit = 0;
                    }

                    //v9 = CInterpreter::GetCurPos(*(N2FTAFile **)a2, a2 + 12);
                    //(*(void (**)(int, const char *, ...))(v10 + 64))(a2, "FuncLabel: action[%d] addr %x\n", act, v9);
                    return true;
                }
                else
                {
                    Debug.Print("FuncLabel: too many label.");
                }
            }

            return false;
        }

        internal void Run(BinBuf binBuf, int pcId, int npcId, int act)
        {
            _npcId = npcId;
            _binBuf = binBuf;
            if (npcId > 0)
            {
                var npc = NpcMgr.Get(npcId);
                if (npc != null)
                {
                    var actionScriptPos = npc.GetActionScriptPos(act);
                    if (actionScriptPos > 0)
                    {
                        var success = Interpreter.Run(binBuf, actionScriptPos, false) == false;
                        // Ok, we got the line now and Interpreter.Run will set the position the the npc.bin buffer, but who executes the dialog?
                    }
                }
            }
        }

        // run one line only? Will it get called everytime the zone processes the npcs? When does it end? Should be on return, but can't find it.
        public int Proc(bool isOnce)
        {
            if (_binBuf == null)
                return 0;

            if (_waitType > 0)
            {
                if (_waitTime > DateTime.UtcNow)
                    return 2;

                Stop();
                return 0;
            }

            if (!Interpreter.Proc())
                return 0;

            return 1;
        }

        private void Stop()
        {
            if (_isDisableItemMove)
            {
                FuncEnableItemMove();
            }

            _binBuf = null;
        }

        private bool FuncDisableItemMove()
        {
            _isDisableItemMove = true;
            return true;
        }

        private bool FuncEnableItemMove()
        {
            _isDisableItemMove = false;
            return true;
        }

        private bool FuncLot(int v1, int v2)
        {
            Debug.Print($"Lot {v1} {v2}");
            return true;
        }

        private bool FuncTrace(string v)
        {
            Debug.Print(v);
            return true;
        }
    }
}
