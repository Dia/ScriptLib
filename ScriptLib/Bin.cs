using System.IO;
using System.Text;

namespace ScriptLib
{
    public class Bin
    {
        private FileStream _fs;
        private BinaryWriter _bw;

        public void Seek(int pos)
        {
            _fs.Seek(pos, SeekOrigin.Begin);
        }

        public bool Set(string fName)
        {
            if (_fs != null)
            {
                _fs.Close();
            }

            _fs = new FileStream(fName, FileMode.Create, FileAccess.Write);
            _bw = new BinaryWriter(_fs);
            if (_fs == null) return false;
            return true;
        }

        public int GetPos()
        {
            if (_fs == null) return 0;

            return (int)_fs.Position;
        }

        public void WriteNum(long n)
        {
            if (_fs == null) return;

            _bw.Write(n);
        }

        public void WriteStr(string str)
        {
            if (_fs == null) return;

            int len = str.Length + 1;
            WriteWord((short)len);
            _bw.Write(Encoding.Default.GetBytes(str));
            _bw.Write((byte)0);
        }

        public void WriteByte(byte n)
        {
            if (_fs == null) return;

            _bw.Write(n);
        }

        public void WriteByte(char n)
        {
            if (_fs == null) return;

            _bw.Write(n);
        }

        public void WriteWord(short n)
        {
            if (_fs == null) return;

            _bw.Write(n);
        }

        public void WriteDword(long n)
        {
            if (_fs == null) return;

            _bw.Write(n);
        }

        public void Release()
        {
            _bw.Flush();
            _fs.Flush();
            _fs.Close();
        }
    }
}
