using System.Diagnostics;

namespace ZoneProcess
{
    static class NFileLog
    {
        internal static void WriteFmt(string file, int line, string text)
        {
            Debug.Print(text);
        }
    }
}
