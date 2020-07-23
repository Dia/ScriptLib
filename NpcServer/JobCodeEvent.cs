using System;
using System.Collections.Generic;
using System.Diagnostics;

namespace ScriptLib
{
    public class JobCodeEvent : InterpretHandler
    {
        public Dictionary<int, List<int>> Groups = new Dictionary<int, List<int>>();
        public Dictionary<int, List<int>> JobCodes = new Dictionary<int, List<int>>();

        public override void OnError(string str)
        {
            throw new NotImplementedException();
        }

        public override bool OnFunc(int func, Deque<TokenData> parm, ref TokenData ret)
        {
            switch (func)
            {
                case 0: // SET
                    Set(parm);
                    break;

                case 1: // SetJC_EXN
                    SetJC_EXN(parm);
                    break;

                case 2: // SetJC_ALL
                    SetJC_ALL(parm);
                    break;

                case 3: // SetGroup
                    SetGroup(parm);
                    break;

                case 4: // SET2
                    Set2(parm);
                    break;

                default:
                    Debug.Print(GetFunctionName(func));
                    break;
            }

            return true;
        }

        private void SetJC_EXN(Deque<TokenData> parm)
        {
            var jc = parm[0].num;
            if (!JobCodes.ContainsKey(jc))
            {
                JobCodes.Add(jc, new List<int>());
            }
        }

        private void SetJC_ALL(Deque<TokenData> parm)
        {
            var jc = parm[0].num;
            if (!JobCodes.ContainsKey(jc))
            {
                JobCodes.Add(jc, new List<int>());
            }


        }

        private void Set(Deque<TokenData> parm)
        {
            var jc = parm[0].num;
            if (!JobCodes.ContainsKey(jc))
            {
                JobCodes.Add(jc, new List<int>());
            }

            for (var i = 1; i < parm.Count - 1; i++)
            {
                JobCodes[jc].Add(parm[i].num);
            }
        }

        private void Set2(Deque<TokenData> parm)
        {
            var jc = parm[0].num;
            if (!JobCodes.ContainsKey(jc))
            {
                JobCodes.Add(jc, new List<int>());
            }

            for (var i = 1; i < parm.Count - 1; i++)
            {
                var group = Groups[parm[i].num];
                foreach (var entry in group)
                {
                    JobCodes[jc].Add(entry);
                }
            }
        }

        private void SetGroup(Deque<TokenData> parm)
        {
            Groups.Add(parm[0].num, new List<int>());
            for (var i = 1; i < parm.Count - 1; i++)
            {
                Groups[parm[0].num].Add(parm[i].num);
            }
        }

        private string GetFunctionName(int func)
        {
            switch (func)
            {
                case 0: return "SET";
                case 1: return "SetJC_EXN";
                case 2: return "SetJC_ALL";
                case 3: return "SetGroup";
                case 4: return "SET2";
            }

            return $"Unknown {func}";
        }
    }
}
