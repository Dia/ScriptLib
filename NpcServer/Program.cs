namespace ZoneProcess
{
    class Program
    {
        static void Main(string[] args)
        {
            var zoneserver = new ZoneServer();
            zoneserver.ZsvrStartup2();
        }
    }
}
