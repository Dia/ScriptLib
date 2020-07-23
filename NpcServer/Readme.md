This is an attempt to rebuild the AEGIS Script Compiler in C#.

Currently I got some issues
* CNPC - This is somehow mixed and I need to recheck it GetActionScriptPos might have to check the TokenData as well for OnCommand
* ZoneServer::NPCScripts - check where the handler is set and how to prevent OnFunc of NpcServer getting called for init run
* NpcEvent::Run - This just sets the position of the npc in the npc.bin buffer, It does not call proc() to execute it and if it calls proc() it just executes one line of the script. Is this called from ZoneServer:Process()?