using ScriptLib;
using System.Windows.Forms;

namespace ZoneProcess
{
    public class NpcSvr
    {
        public NpcEvent NpcEvent = new NpcEvent();
        public BinBuf BinBuf;

        public bool Start()
        {
            BinBuf = new BinBuf();
            if (BinBuf.Load("scriptbin\\npc.bin"))
            {
                RunEvent(0, 0, 0, 0, 0);
                return true;
            }
            else
            {
                MessageBox.Show("LoadScript : failure", "error", 0);
                return false;
            }
        }

        public void RunEvent(int pcId, int npcId, int act, int reserveTime, int oninit)
        {
            NpcEvent.Run(BinBuf, pcId, npcId, act);
        }
    }
}
