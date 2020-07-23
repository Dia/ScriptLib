namespace ZoneProcess
{
    class NpcSvrNpcInfo
    {
        public string Zone { get; set; } = string.Empty;
        public string Name { get; set; } = string.Empty;
        public int Type { get; set; } = 0;
        public int X { get; set; } = 0;
        public int Y { get; set; } = 0;
        public int DX { get; set; } = 0;
        public int DY { get; set; } = 0;
        public int W { get; set; } = 0;
        public int H { get; set; } = 0;
        public int Sprite { get; set; } = 32;
        public int Direction { get; set; } = 0;
        public int RegenMin { get; set; } = 1000;
        public int RegenMax { get; set; } = 4000;
        public int RegenType { get; set; } = 0;
        public int NpcType { get; set; } = 0;
    }
}
