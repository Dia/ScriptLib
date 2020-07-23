using ScriptLib;
using System;
using System.Collections.Generic;
using System.Linq;

namespace ZoneProcess
{
    public class SkillEvent : InterpretHandler
    {
        public class Skill
        {
            public int Id { get; set; }
            public byte? Type { get; internal set; }
            public byte? MaxLevel { get; internal set; }
            public byte? Pattern { get; internal set; }
            public int[] Splash { get; internal set; }
            public int[] HitPer { get; internal set; }
            public int[] AtkPer { get; internal set; }
            public int[] Data1 { get; internal set; }
            public int[] Data2 { get; internal set; }
            public int[] Data3 { get; internal set; }
            public int[] Data4 { get; internal set; }
            public int[] Data5 { get; internal set; }
            public int[] Data6 { get; internal set; }
            public int? Flag { get; internal set; }
            public int[] Range { get; internal set; }
            public int[] Sp { get; internal set; }
            public bool Event { get; internal set; }
            public int[] FixedCastTime { get; internal set; }
            public int[] VariableCastTime { get; internal set; }
            public int[] GlobalCooldown { get; internal set; }
            public int[] Cooldown { get; internal set; }
            public byte? Property { get; internal set; }
        }

        private Skill _currentSkill;
        public List<Skill> Skills = new List<Skill>();

        enum Functions
        {
            Return = 0,
            OnInit = 165,
            SetSkill = 10000,
            OnUse,
            OnSuccess,
            SkillType,
            SkillMaxLv,
            SkillPattern,
            SkillSplash,
            SkillHitPer,
            SkillAtkPer,
            SkillData1,
            SkillData2,
            SkillFlag,
            SkillRange,
            SkillProperty,
            SkillHandicap,
            SkillKnockBack,
            SkillNoDamage,
            SkillSP,
            SkillPreDelayTime,
            SkillPostDelayTime,
            SkillResetHandicap,
            SkillDrainHP,
            SkillDrainSP,
            SkillEvent,
            SkillCastFixedDelay,
            SkillCastStatDelay,
            SkillGlobalPostDelay,
            SkillSinglePostDelay,
            SkillData3,
            SkillData4,
            SkillData5,
            SkillData6,
            SkillDataString
        }

        public override void OnError(string str)
        {
            throw new NotImplementedException();
        }

        private bool _onInit = false;

        public override bool OnFunc(int func, Deque<TokenData> parm, ref TokenData ret)
        {
            switch (func)
            {
                case (int)Functions.SetSkill:
                    _currentSkill = new Skill { Id = parm[0].num };
                    Skills.Add(_currentSkill);
                    _onInit = false;
                    break;

                case (int)Functions.SkillType:
                    _currentSkill.Type = (byte)parm[0].num;
                    break;

                case (int)Functions.SkillMaxLv:
                    _currentSkill.MaxLevel = (byte)parm[0].num;
                    break;

                case (int)Functions.SkillPattern:
                    _currentSkill.Pattern = (byte)parm[0].num;
                    break;

                case (int)Functions.SkillProperty:
                    _currentSkill.Property = (byte)parm[0].num;
                    break;

                case (int)Functions.SkillFlag:
                    var flag = 0;
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        flag += parm[i].num;
                    }

                    if (flag > 0)
                    {
                        _currentSkill.Flag = flag;
                    }
                    break;

                case (int)Functions.SkillEvent:
                    _currentSkill.Event = true;
                    break;

                case (int)Functions.SkillSinglePostDelay:
                    var cooldown = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        cooldown.Add(parm[i].num);
                    }

                    _currentSkill.Cooldown = cooldown.ToArray();
                    break;

                case (int)Functions.SkillGlobalPostDelay:
                    var globalCooldown = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        globalCooldown.Add(parm[i].num);
                    }

                    _currentSkill.GlobalCooldown = globalCooldown.ToArray();
                    break;

                case (int)Functions.SkillCastStatDelay:
                    var variableCastTime = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        variableCastTime.Add(parm[i].num);
                    }

                    _currentSkill.VariableCastTime = variableCastTime.ToArray();
                    break;

                case (int)Functions.SkillCastFixedDelay:
                    var fixedCastTime = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        fixedCastTime.Add(parm[i].num);
                    }

                    _currentSkill.FixedCastTime = fixedCastTime.ToArray();
                    break;

                case (int)Functions.SkillRange:
                    var range = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        range.Add(parm[i].num);
                    }

                    _currentSkill.Range = range.ToArray();
                    break;

                case (int)Functions.SkillSP:
                    var sp = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        sp.Add(parm[i].num);
                    }

                    _currentSkill.Sp = sp.ToArray();
                    break;

                case (int)Functions.SkillSplash:
                    var splash = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        splash.Add(parm[i].num);
                    }

                    _currentSkill.Splash = splash.ToArray();
                    break;

                case (int)Functions.SkillHitPer:
                    var hitPer = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        hitPer.Add(parm[i].num);
                    }

                    _currentSkill.HitPer = hitPer.ToArray();
                    break;

                case (int)Functions.SkillAtkPer:
                    var atkPer = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        atkPer.Add(parm[i].num);
                    }

                    _currentSkill.AtkPer = atkPer.ToArray();
                    break;

                case (int)Functions.SkillData1:
                    var data1 = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        data1.Add(parm[i].num);
                    }

                    _currentSkill.Data1 = data1.ToArray();
                    break;

                case (int)Functions.SkillData2:
                    var data2 = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        data2.Add(parm[i].num);
                    }

                    _currentSkill.Data2 = data2.ToArray();
                    break;

                case (int)Functions.SkillData3:
                    var data3 = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        data3.Add(parm[i].num);
                    }

                    _currentSkill.Data3 = data3.ToArray();
                    break;

                case (int)Functions.SkillData4:
                    var data4 = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        data4.Add(parm[i].num);
                    }

                    _currentSkill.Data4 = data4.ToArray();
                    break;

                case (int)Functions.SkillData5:
                    var data5 = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        data5.Add(parm[i].num);
                    }

                    _currentSkill.Data5 = data5.ToArray();
                    break;

                case (int)Functions.SkillData6:
                    var data6 = new List<int>();
                    for (var i = 0; i < parm.Count - 1; i++)
                    {
                        data6.Add(parm[i].num);
                    }

                    _currentSkill.Data6 = data6.ToArray();
                    break;

                case (int)Functions.OnSuccess:
                case (int)Functions.OnUse:
                case (int)Functions.SkillHandicap:
                case (int)Functions.SkillResetHandicap:
                case (int)Functions.SkillNoDamage:
                case (int)Functions.SkillKnockBack:
                case (int)Functions.SkillDrainHP:
                case (int)Functions.SkillDrainSP:
                case (int)Functions.SkillPostDelayTime:
                case (int)Functions.SkillPreDelayTime:
                case (int)Functions.SkillDataString:
                    break;

                case (int)Functions.OnInit:
                    _onInit = true;
                    break;

                case (int)Functions.Return:
                    _onInit = false;
                    break;

                default:
                    Console.WriteLine($"Unknown Function {func}");
                    break;
            }

            return true;
        }
    }
}
