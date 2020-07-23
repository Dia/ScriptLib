using ScriptLib;
using System.Collections.Generic;
using System.Linq;

namespace ZoneProcess
{
    class Npc
    {
        public int Id { get; set; }
        public int Type { get; set; }
        public string Name { get; set; }
        public int NpcType { get; set; }
        public string Mapname { get; set; }

        private int _actCount = 0;
        private int _onTimerActNo = 0;
        private readonly Dictionary<int, int> _actionScriptOnTimerActIdx = new Dictionary<int, int>();
        private readonly Dictionary<int, NPCACTION> _actionScriptAction = new Dictionary<int, NPCACTION>();
        private readonly Dictionary<int, long> _actionScriptPos = new Dictionary<int, long>();
        private readonly Dictionary<int, IEnumerable<TokenData>> _actionScriptParam = new Dictionary<int, IEnumerable<TokenData>>();

        internal long GetActionScriptPos(int index)
        {
            if (index > 0)
            {
                var idx = index - 1;
                if (idx < _actCount && idx >= 0)
                    return _actionScriptPos[idx];

                NFileLog.WriteFmt(
                  "NpcServer\\NpcObj.Cpp",
                  102,
                  "OUT OF RANGE: GetActionScriptPos(%d)");
            }

            return 0;
        }

        internal int SetActionScript(NPCACTION action, IEnumerable<TokenData> parm, long pos)
        {
            var cnt = _actCount;
            if (cnt >= 50)
            {
                return 0;
            }

            if (action == NPCACTION.ONTIMER)
            {
                _actionScriptOnTimerActIdx[_onTimerActNo++] = cnt;
            }

            _actionScriptAction[_actCount] = action;
            _actionScriptPos[_actCount] = pos;
            if (parm.Count() > 0)
            {
                _actionScriptParam[_actCount] = parm;
            }

            ++_actCount;
            return 1;
        }

        internal void SetInfo(int aid, NpcSvrNpcInfo npcInfo)
        {
            Id = aid;
            Type = npcInfo.Type;
            Name = npcInfo.Name;
            NpcType = npcInfo.NpcType;
            Mapname = npcInfo.Zone;
        }
    }
}
