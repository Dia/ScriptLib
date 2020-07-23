using System.Collections.Generic;

namespace ZoneProcess
{
    static class NpcMgr
    {
        private static Dictionary<int, Npc> _npcs = new Dictionary<int, Npc>();

        static internal Npc Get(int npcId)
        {
            return _npcs[npcId];
        }

        internal static Npc Add(int aid)
        {
            var npc = new Npc();
            _npcs.Add(aid, npc);
            return npc;
        }
    }
}
