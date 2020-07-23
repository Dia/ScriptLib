using System.IO;
using System.Text;

namespace ScriptLib
{
	public class Asm
	{
		private Stream _fs;
		private StreamWriter _sw;

		public void Line(int addr)
		{
			Putf("\n{0:x8}: ", addr);
		}

		public void Put(string str)
		{
			_sw.Write(str);
			_sw.Flush();
			_fs.Flush();
		}

		public void Putf(string str, params object[] args)
		{
			if (_fs == null) return;

			Put(string.Format(str, args));
		}

		public void Error(string str)
		{
			Put("\n// Error: ");
			Put(str);
		}

		public void Errorf(string str, params object[] args)
		{
			if (_fs == null) return;

			Error(string.Format(str, args));
		}

		public void Comment(string str)
		{
			Put("\n// ");
			Put(str);
		}

		public void Commentf(string str, params object[] args)
		{
			if (_fs == null) return;

			Comment(string.Format(str, args));
		}

		public bool Set(string fName)
		{
			if (_fs != null)
			{
				_sw.Flush();
				_fs.Flush();
				_fs.Close();
			}

			_fs = new FileStream(fName, FileMode.Create, FileAccess.Write);
			_sw = new StreamWriter(_fs, Encoding.GetEncoding(1252));
			if (_fs == null) return false;
			return true;
		}

		public bool Set(Stream s)
		{
			_fs = s;
			_sw = new StreamWriter(_fs, Encoding.GetEncoding(1252));
			if (_fs == null) return false;
			return true;
		}

		public void Release()
		{
			_sw.Flush();
			_fs.Flush();
			_fs.Close();
			_sw = null;
			_fs = null;
		}
	}
}
