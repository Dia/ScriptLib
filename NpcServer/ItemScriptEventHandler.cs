using ScriptLib;

namespace ZoneProcess
{
    public class ItemScriptEventHandler : InterpretHandler
    {
        public override void OnError(string str)
        {
        }

        public override bool OnFunc(int func, Deque<TokenData> parm, ref TokenData ret)
        {
            return true;
        }
    }
}
