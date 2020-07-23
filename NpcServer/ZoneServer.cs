using ScriptLib;
using System.Diagnostics;
using System.IO;

namespace ZoneProcess
{
    class ZoneServer
    {
        public void ZsvrStartup2()
        {
            if (!Directory.Exists("scriptbin"))
            {
                Directory.CreateDirectory("scriptbin");
            }

            NpcScripts();
        }

        private void NpcScripts()
        {
            var compiler = new Compiler();
            compiler.SetGlobalErrorFunc(OnError);
            compiler.LoadEnum("scriptdata\\enum_v2.sc", 20030414);
            compiler.LoadDef("scriptdata\\itp.def");
            compiler.LoadDef("scriptdata\\mobname.def");
            compiler.LoadDef("scriptdata\\npcspr.def");
            compiler.LoadDef("scriptdata\\skill.def");

            compiler.SetAsm("scriptbin\\common.asm");
            compiler.SetBin("scriptbin\\common.bin");
            compiler.Run("scriptdata\\Std_V2.sc");
            compiler.Complete();
            compiler.SetAsm("scriptbin\\npc.asm");
            compiler.SetBin("scriptbin\\npc.bin");
            compiler.Run(".\\scriptdata\\mobdef.sc", 20021009);

            var list = File.ReadAllLines(".\\npcdata\\list.txt");
            foreach (var line in list)
            {
                if (line.StartsWith(";") || line.StartsWith("//")) continue;
                if (string.IsNullOrEmpty(line)) continue;
                compiler.Run(line);
            }

            compiler.Complete();
            var npcsvr = new NpcSvr();
            npcsvr.Start();

            // todo: if we set the handler here, it will receive every script command.
            // it got no player at this moment, so I am not sure how to handle the OnFunc since they are used to
            // return player values
            var i = new Interpreter();
            i.RegisterHandler(npcsvr.NpcEvent);
            i.Scan(npcsvr.BinBuf, 0);

            // Test
            npcsvr.RunEvent(0, 6, (int)NPCACTION.ONINIT, 0, 0);
        }
        private void OnError(string message)
        {
            Debug.Assert(true, message);
        }
    }
}
