using ScriptLib;

namespace ZoneProcess
{
    class SpecialItemMgr
    {
        private readonly ItemScriptEventHandler _itemScriptEventHandler;
        public int RunEvent(int charID, int itemCode, int beginPos, int in_Identity)
        {
            return 0;
            //_itemScriptEventHandler.Set(null, charID, itemCode, in_Identity, 0);
            //if (_itemScriptEventHandler.Run(beginPos, v6, &binBuf))
            //    _scriptEventHandler.Proc(1);
            //else
            //    result = 0;

            //return result;
        }
    }
}
