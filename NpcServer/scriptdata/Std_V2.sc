define ENUM 0
declare return . ENUM++
declare item n ENUM++	blockcheck
declare event n ENUM++	blockcheck
declare get n ENUM++
declare inc nn ENUM++
declare dec nn ENUM++
declare EnableSkill nn ENUM++
declare DisableSkill nn ENUM++
declare Summon . ENUM++
declare Skill nn ENUM++
declare CreateItem . ENUM++
declare LostItem n ENUM++
declare HealHP n ENUM++
declare HealSP n ENUM++
declare HealAll . ENUM++
declare Condition nnn ENUM++
declare Cure nn ENUM++
declare AddExtParam nnn ENUM++
declare SubExtParam nnn ENUM++
declare SetMakableWpnItemList . ENUM++
declare SetMakableMtlItemList . ENUM++
declare RaceAddDamage nn ENUM++
declare RaceSubDamage nn ENUM++
declare AddAttrTolerace n? ENUM++
declare SubAttrTolerace n? ENUM++
declare AddRaceTolerace nn ENUM++
declare SubRaceTolerace nn ENUM++
declare AddDamage_Property nnn ENUM++
declare SubDamage_Property nnn ENUM++
declare AddDamage_Size nnn ENUM++
declare SubDamage_Size nnn ENUM++
declare AddDamage_Name nsn ENUM++
declare SubDamage_Name nsn ENUM++
declare AddDamage_SKID nnn ENUM++
declare SubDamage_SKID nnn ENUM++
declare AddDamage_CRI nn ENUM++
declare SubDamage_CRI nn ENUM++
declare AddState_MLEATK nnn ENUM++
declare SubState_MLEATK nnn ENUM++
declare AddState_MLEAttacked nnn ENUM++
declare SubState_MLEAttacked nnn ENUM++
declare AddHealPercent_ITEM nsn ENUM++
declare SubHealPercent_ITEM nsn ENUM++
declare AddHealAmount_Kill nn ENUM++
declare SubHealAmount_Kill nn ENUM++
declare IndestructibleArmor n ENUM++
declare IndestructibleWeapon n ENUM++
declare AddStateTolerace nn ENUM++
declare SubStateTolerace nn ENUM++
declare BodyAttribute n ENUM++
declare SubRangeAttackDamage nn ENUM++
declare AddRangeAttackDamage nn ENUM++
declare NoDispell n ENUM++
declare AddHPdrain nn ENUM++
declare SubHPdrain nn ENUM++
declare Magicimmune n ENUM++
declare NoJamstone n ENUM++
declare AddSPdrain nn ENUM++
declare SubSPdrain nn ENUM++
declare AddMeleeAttackReflect n ENUM++
declare SubMeleeAttackReflect n ENUM++
declare PerfectDamage n ENUM++
declare Reincarnation n ENUM++
declare SubSpellCastTime n ENUM++
declare AddSpellCastTime n ENUM++
declare SplashAttack n ENUM++
declare SubSPconsumption n? ENUM++
declare AddSPconsumption n? ENUM++
declare StartCapture s ENUM++
declare Incubation . ENUM++
declare AddAtk_DamageWeapon nn ENUM++
declare SubAtk_DamageWeapon nn ENUM++
declare AddAtk_DamageArmor nn ENUM++
declare SubAtk_DamageArmor nn ENUM++
declare AddReceiveItem_Race nsn ENUM++
declare SubReceiveItem_Race nsn ENUM++
declare SetIgnoreDEFRace n ENUM++
declare ResetIgnoreDEFRace n ENUM++
declare SetIgnoreDEFClass n ENUM++
declare ResetIgnoreDEFClass n ENUM++
declare SetDisappearHPAmount snn ENUM++
declare ResetDisappearHPAmount s ENUM++
declare SetDisappearSPAmount snn ENUM++
declare ResetDisappearSPAmount s ENUM++
declare SetAutoSpell n ENUM++
declare AddAtk_ComaRace nn ENUM++
declare SubAtk_ComaRace nn ENUM++
declare AddAtk_Coma n ENUM++
declare SubAtk_Coma n ENUM++
declare SubSPAmount_Action nn ENUM++
declare AddSPAmount_Action nn ENUM++
declare SubSPAmount_Attack nn ENUM++
declare AddSPAmount_Attack nn ENUM++
declare AddSPAmount_AtkRace nnn ENUM++
declare SubSPAmount_AtkRace nnn ENUM++
declare AddDestroySP_Attack nnn ENUM++
declare SubDestroySP_Attack nnn ENUM++
declare AddSPAmount_KillRace nn ENUM++
declare SubSPAmount_KillRace nn ENUM++
declare AddEXPPercent_KillRace nn ENUM++
declare SubEXPPercent_KillRace nn ENUM++
declare ClassAddDamage nnn ENUM++
declare ClassSubDamage nnn ENUM++
declare RaceAddDamageSelf nn ENUM++
declare RaceSubDamageSelf nn ENUM++
declare SetInvestigate . ENUM++
declare ResetInvestigate . ENUM++
declare ModifyDEF_Fraction nn ENUM++
declare AddGuideAttack n ENUM++
declare SubGuideAttack n ENUM++
declare AddChangeMonster n ENUM++
declare SubChangeMonster n ENUM++
declare AddCRIPercent_Race nn ENUM++
declare SubCRIPercent_Race nn ENUM++
declare SetPushingSkill nn ENUM++
declare ResetPushingSkill n ENUM++
declare GetZeny_Range nn ENUM++
declare MulticastEffect n ENUM++
declare SetExtParamTime nnn ENUM++
declare unused_SetAutoSpellTarget nnn ENUM++
declare unused_SetAutoSpellSelf nnn ENUM++
declare SetReceiveZENY_Kill nnn ENUM++
declare AddCRI_RANGEATK n ENUM++
declare SubCRI_RANGEATK n ENUM++
declare AddState_RANGEATK nn ENUM++
declare SubState_RANGEATK nn ENUM++
declare AddGuildEXP nn ENUM++
declare SetReceiveItem_Group n ENUM++
declare AddReflectMagic n ENUM++
declare SubReflectMagic n ENUM++
declare ItemCreate sn ENUM++
declare IsCompleteCombination s ENUM++
declare IsBreakCombination s ENUM++
declare unused_SetAutoSpell_MLEATKED nnnn ENUM++
declare GetRefineLevel n ENUM++
declare GetSkillLevel n ENUM++
declare GetPureJob . ENUM++
declare AddGetItem_Kill sn ENUM++
declare SubGetItem_Kill sn ENUM++
declare AddParameterValue nn ENUM++
declare EvolutionHomun . ENUM++
declare AddParamTime n? ENUM++
declare SubParamTime nnn ENUM++
declare AddDamageTM_Prop nnnn ENUM++
declare SubDamageTM_Prop nnnn ENUM++
declare Cooking n ENUM++
declare SummonNPC n ENUM++
declare trace s ENUM++
declare v n ENUM++
declare lv s ENUM++
declare npcv sn ENUM++
declare IncLocalVar sn ENUM++
declare DecLocalVar sn ENUM++
declare SetLocalVar sn ENUM++
declare GetEquipIsIdentify n ENUM++
declare GetEquipRefineryCnt n ENUM++
declare GetEquipPercentRefinery n ENUM++
declare GetEquipRefineryCost n ENUM++
declare GetEquipIsSuccessRefinery n ENUM++
declare GetEquipName n ENUM++
declare GetEquipItemIdx n ENUM++
declare GetEquipWeaponLv n ENUM++
declare GetEquipIsEnableRef n ENUM++
declare LastNpcName s ENUM++
declare PcName . ENUM++
declare OnInit: . ENUM++	blockcheck
declare OnClick: . ENUM++	blockcheck
declare OnTouch: . ENUM++	blockcheck
declare OnMyMobDead: . ENUM++	blockcheck
declare OnTimer: n ENUM++	blockcheck
declare OnCommand: s ENUM++	blockcheck
declare OnStartArena: . ENUM++	blockcheck
declare rand nn ENUM++
declare lot nn ENUM++
declare GetPCCount s ENUM++
declare OnTouchNPC: . ENUM++	blockcheck
declare OnTouch2: . ENUM++	blockcheck
declare guide ssnnnn ENUM++	blockcheck
declare npc ssnnnnnn ENUM++	blockcheck
declare mob nsnnnnn ENUM++	blockcheck
declare warp ssnnnn ENUM++	blockcheck
declare trader ssnnnn ENUM++	blockcheck
declare arenaguide ssnnnnnn ENUM++	blockcheck
declare hiddenwarp ssnnnn ENUM++	blockcheck
declare effect snnnnnn ENUM++	blockcheck
declare dialog s ENUM++
declare putmob snnnnnnnnn? ENUM++
declare moveto snn ENUM++
declare say s ENUM++
declare menu s? ENUM++
declare getgold n ENUM++
declare dropgold n ENUM++
declare getitem nn ENUM++
declare dropitem nn ENUM++
declare setitem nn ENUM++
declare wait . ENUM++
declare close . ENUM++
declare hpfullheal . ENUM++
declare spfullheal . ENUM++
declare hpheal n ENUM++
declare spheal n ENUM++
declare poisonheal . ENUM++
declare stoneeal . ENUM++
declare curseheal . ENUM++
declare freezingheal . ENUM++
declare silenceheal . ENUM++
declare confusionheal . ENUM++
declare sellitem n ENUM++
declare buyitem n ENUM++
declare jobchange n ENUM++
declare exchange nnnn ENUM++
declare error . ENUM++
declare checkpoint snn ENUM++
declare store . ENUM++
declare cart n ENUM++
declare dlgwrite nn ENUM++
declare input . ENUM++
declare inputstr . ENUM++
declare compass nnnns ENUM++
declare nude . ENUM++
declare showimage sn ENUM++
declare changepallete nn ENUM++
declare callmonster snsnn? ENUM++
declare addskill nnnn ENUM++
declare cmdothernpc ss ENUM++
declare strlocalvar ns ENUM++
declare InitTimer . ENUM++
declare setarenaeventsize n ENUM++
declare makewaitingroom sn ENUM++
declare enablearena . ENUM++
declare disablearena . ENUM++
declare warpwaitingpctoarena snn ENUM++
declare resetmymob . ENUM++
declare warpallpcinthemap snn ENUM++
declare broadcastinmap s ENUM++
declare stoptimer . ENUM++
declare addnpctimer sn ENUM++
declare subnpctimer sn ENUM++
declare enablenpc s ENUM++
declare disablenpc s ENUM++
declare callnpc snsnnn ENUM++
declare SetFeeZeny n ENUM++
declare SetFeeItem nn ENUM++
declare SetReqLevel nn ENUM++
declare SetTexJob n ENUM++
declare DisableItemMove . ENUM++
declare EnableItemMove . ENUM++
declare SuccessRefItem n ENUM++
declare FailedRefItem n ENUM++
declare SetEffectStatus n ENUM++
declare ResetStat . ENUM++
declare ResetSkill . ENUM++
declare menu2 s? ENUM++
declare ShowDigit n ENUM++
declare EventAddSkill nn ENUM++
declare EventDelSkill n ENUM++
declare SetParameter nn ENUM++
declare Emotion sn ENUM++
declare ChangeSpr sn ENUM++
declare GetEquipCount n ENUM++
declare AgitGet n ENUM++
declare AgitGet2 sn ENUM++
declare AgitSet nn ENUM++
declare AgitFunc nnn ENUM++
declare AgitNpcGet nn ENUM++
declare AgitNpcSet nnn ENUM++
declare IsGuildMaster n ENUM++
declare putmob2 snnnnnnnnns? ENUM++
declare AgitRegister s ENUM++
declare broadcastinmap2 snnnns ENUM++
declare broadcastserver snnnns ENUM++
declare sound snnn ENUM++
declare dlgwritestr . ENUM++
declare GetDamagedItemNum . ENUM++
declare RepairDamagedItem . ENUM++
declare SavePPL n ENUM++
declare AgitEmblemFlag s ENUM++
declare hpdrain n ENUM++
declare spdrain n ENUM++
declare getexp n ENUM++
declare dropexp n ENUM++
declare ServerTime . ENUM++
declare GetLocalVarName n ENUM++
declare GetMarried . ENUM++
declare countdown n ENUM++
declare GuildName . ENUM++
declare GetNeighborPcNumber n ENUM++
declare getnameditem nn ENUM++
declare dropnameditem nn ENUM++
declare GetCountOfMyNameItem n ENUM++
declare ChangeHairStyle n ENUM++
declare ShowEffect sn ENUM++
declare falcon n ENUM++
declare peco n ENUM++
declare CheckMaxWeight nn ENUM++
declare CheckMaxCount nn ENUM++
declare CheckMaxZeny n ENUM++
declare GetMEventZenyName n ENUM++
declare GetMEventItemName n ENUM++
declare GetMEventZeny n ENUM++
declare GetMEventItem n ENUM++
declare CreateGuild s ENUM++
declare CreateGlobalVar sn ENUM++
declare GetGlobalVar s ENUM++
declare SetGlobalVar sn ENUM++
declare StrCmp ss ENUM++
declare StrStr ss ENUM++
declare UpgradeGuildLevel . ENUM++
declare CreateGlobalStr ss ENUM++
declare GetGlobalStr s ENUM++
declare SetGlobalStr ss ENUM++
declare divorce . ENUM++
declare GetTablePoint . ENUM++
declare AddTablePoint n ENUM++
declare DelTablePoint n ENUM++
declare DataMoveToPVP . ENUM++
declare GetPVPPoint . ENUM++
declare SetPVPPoint n ENUM++
declare GetMEventItemID n ENUM++
declare getJexp n ENUM++
declare dropJexp n ENUM++
declare ChkSkill n ENUM++
declare GetBODYSTATE nn ENUM++
declare GetHEALTHSTATE nn ENUM++
declare UseSkillToPC nnnn ENUM++
declare IsBaby . ENUM++
declare GetLotto n ENUM++
declare SetLotto nnnnnn ENUM++
declare InitLotto . ENUM++
declare OpenAuction . ENUM++
declare OpenMailing . ENUM++
declare StripPC n ENUM++
declare PushPC nn ENUM++
declare ItemDown nnnn ENUM++
declare SetNumArray nn ENUM++
declare GetNumArray n ENUM++
declare ShuffleNumbers nn ENUM++
declare PartyName . ENUM++
declare ChangeSpeed nn ENUM++
declare IsSiegeTime . ENUM++
declare ConsumeSpecialItem n ENUM++
declare SetItemPartyInMap nn ENUM++
declare IsHuntingListFull . ENUM++
declare FindHuntingList n ENUM++
declare AddHuntingList n ENUM++
declare DeleteHuntingList n ENUM++
declare DisplayHuntingList . ENUM++
declare DisplayHuntingList2 . ENUM++
declare SetHuntingList nn ENUM++
declare ClearHuntingList . ENUM++
declare IsTimeListFull . ENUM++
declare FindTimeList n ENUM++
declare AddTimeList n ENUM++
declare DeleteTimeList n ENUM++
declare DisplayTimeList . ENUM++
declare SetTimeList nn ENUM++
declare ClearTimeList . ENUM++
declare ChangeCellType nnn ENUM++
declare GetCellType nn ENUM++
declare IsPcCafe . ENUM++
declare GetPayType . ENUM++
declare GetConnectionArea . ENUM++
declare GetConnectionState . ENUM++
declare GetPetEgg n ENUM++
declare CashTrader ssnnnn ENUM++	blockcheck
declare CashShop s ENUM++
declare AddexpTime nn ENUM++
declare SubexpTime n ENUM++
declare AddReceiveItem nn ENUM++
declare GetAdvEquipIsSuccessRefinery n ENUM++
declare Partycall . ENUM++
declare putboss snnnnnnnnn? ENUM++
declare UseBossPerception n ENUM++
declare SkillToMe nn ENUM++
declare UseHuntingList . ENUM++
declare CheckHuntingList n ENUM++
declare item2 n ENUM++	blockcheck
declare WeaponProperty nn ENUM++
declare ReadBook nn ENUM++
declare Mercenary_Summon n ENUM++
declare Mercenary_HealHP n ENUM++
declare Mercenary_HealSP n ENUM++
declare GetMercenaryTotalSummonNum n ENUM++
declare GetMercenaryFaith n ENUM++
declare SubMercenaryFaith nn ENUM++
declare AddMercenaryFaith nn ENUM++
declare npc2_XXX ssnnnnnnn ENUM++	blockcheck
declare OnMoveNpcCmd:_XXX . ENUM++	blockcheck
declare MovePos_XXX nn ENUM++
declare MoveWait_XXX n ENUM++
declare Refinery n ENUM++
declare Mercenary_Condition nnn ENUM++
declare AddNeverknockback n ENUM++
declare GetAdvEquipPercentRefinery n ENUM++
declare ReLoadMobileEvent . ENUM++
declare SetTempTime n ENUM++
declare ElapseTempTime n ENUM++
declare SubNeverknockback n ENUM++
declare GetWeaponClass n ENUM++
declare GetEquipSlotAmount n ENUM++
declare AddHealValue n ENUM++
declare SubHealValue n ENUM++
declare unused_SetAutoSpell_MAGATKED nnnn ENUM++
declare AddHPAmount_MAGKill n ENUM++
declare SubHPAmount_MAGKill n ENUM++
declare AddSPAmount_MAGKill n ENUM++
declare SubSPAmount_MAGKill n ENUM++
declare AddSpellDelay n ENUM++
declare SubSpellDelay n ENUM++
declare AddSpecificSpellCastTime nn ENUM++
declare SubSpecificSpellCastTime nn ENUM++
declare AddMdamage_Race nn ENUM++
declare SubMdamage_Race nn ENUM++
declare AddMdamage_Class nn ENUM++
declare SubMdamage_Class nn ENUM++
declare SetIgnoreMdefRace nn ENUM++
declare ResetIgnoreMdefRace nn ENUM++
declare SetIgnoreMdefClass nn ENUM++
declare ResetIgnoreMdefClass nn ENUM++
declare SetHPAmountTime nnn ENUM++
declare ResetHPAmountTime nnn ENUM++
declare SetSPAmountTime nnn ENUM++
declare ResetSPAmountTime nnn ENUM++
declare SetIgnoreDefRace_Percent nn ENUM++
declare ResetIgnoreDefRace_Percent nn ENUM++
declare SetIgnoreDefClass_Percent nn ENUM++
declare ResetIgnoreDefClass_Percent nn ENUM++
declare GetInventoryRemainCount nn ENUM++
declare SetAutoWeapon nnn ENUM++
declare ResetAutoWeapon nnn ENUM++
declare SetAutoMweapon nnn ENUM++
declare ResetAutoMweapon nnn ENUM++
declare SetAutoAttacked nnn ENUM++
declare ResetAutoAttacked nnn ENUM++
declare SetAutoMAttacked nnn ENUM++
declare ResetAutoMAttacked nnn ENUM++
declare ResetReceiveItem_Group n ENUM++
declare Buff s ENUM++	blockcheck
declare SetBuff sn? ENUM++
declare GetBuffValue s ENUM++
declare AddHealModifyPercent n ENUM++
declare SubHealModifyPercent n ENUM++
declare SetHPPercentTime nnn ENUM++
declare ResetHPPercentTime nnn ENUM++
declare SetSPPercentTime nnn ENUM++
declare ResetSPPercentTime nnn ENUM++
declare LoudSpeaker snnnns ENUM++
declare SetTargetAttacked_Buff nnsnn ENUM++
declare ResetTargetAttacked_Buff nnsnn ENUM++
declare GetMapName . ENUM++
declare setquest n ENUM++
declare changequest nn ENUM++
declare erasequest n ENUM++
declare completequest n ENUM++
declare completequest_between nn ENUM++
declare recall_completequest n ENUM++
declare isbegin_quest n ENUM++
declare checkquest_hunting n ENUM++
declare checkquest_playtime n ENUM++
declare GetLastSiegeMsg s ENUM++
declare DataMoveTo_Sakray . ENUM++
declare callguardian snsnn ENUM++
declare IsPremiumPcCafe . ENUM++
declare MD_Subscription s ENUM++
declare MD_Enter s ENUM++
declare CampCode snn ENUM++
declare GetCampCode . ENUM++
declare CallCampMob nnnss ENUM++
declare SetRP2 nn ENUM++
declare MassSetRP2 snn ENUM++
declare PlayerToRP n ENUM++
declare GetMEventZenyName_Exculusive n ENUM++
declare GetMEventItemName_Exculusive n ENUM++
declare GetMEventZeny_Exculusive n ENUM++
declare GetMEventItem_Exculusive n ENUM++
declare GetMEventItemID_Exculusive n ENUM++
declare ReLoadMobileEvent_Exculusive . ENUM++
declare MD_List sss ENUM++
declare MD_Destroy s ENUM++
declare PlusCampPoint sn ENUM++
declare MinusCampPoint sn ENUM++
declare GetCampPoint s ENUM++
declare ResetCampPoint . ENUM++
declare CheckSiegeTime n ENUM++
declare AddState_MATK nnn ENUM++
declare SubState_MATK nnn ENUM++
declare AddState_MAttacked nnn ENUM++
declare SubState_MAttacked nnn ENUM++
declare GetMDMapName s ENUM++
declare GetMDNpcName s ENUM++
declare MD_Npc ssnnnnnn ENUM++	blockcheck
declare MD_Warp ssnnnn ENUM++	blockcheck
declare MD_Hiddenwarp ssnnnn ENUM++	blockcheck
declare MD_Putmob snnnnnnnnn ENUM++
declare Mymobskilluse snnnn ENUM++
declare WhereMymobX s ENUM++
declare WhereMymobY s ENUM++
declare WideMobskilluse nnnnnnn ENUM++
declare WideMobskilluse2 nnnsnnnn ENUM++
declare MD_OpenState n ENUM++
declare AddHPDrain_100 n ENUM++
declare SubHPDrain_100 n ENUM++
declare CreatePackage . ENUM++
declare IsBender . ENUM++
declare MoveResume_XXX . ENUM++
declare MoveReturn_XXX . ENUM++
declare MoveSpeed_XXX n ENUM++
declare GetNpcPosition s ENUM++
declare AddReceiveItem_Equip n ENUM++
declare SubReceiveItem_Equip n ENUM++
declare AddOnlyJobExpTime nn ENUM++
declare progress_bar sn ENUM++
declare MercenaryCheck . ENUM++
declare MercenaryType . ENUM++
declare IsFreeServer . ENUM++
declare SetSkillAutoSpell nnnnn ENUM++
declare ResetSkillAutoSpell nnnnn ENUM++
declare SetSkillActivate nnnn ENUM++
declare ResetSkillActivate nnnn ENUM++
declare GetActivated_Skill . ENUM++
declare GetDeactivated_Skill . ENUM++
declare AddState_SKID nnnn ENUM++
declare SubState_SKID nnnn ENUM++
declare SetAutoSpellMagic nnnn ENUM++
declare ResetAutoSpellMagic nnnn ENUM++
declare run_npc_XXX ssnnnnnn ENUM++
declare run_npctrader_XXX ssnnnnnn ENUM++
declare OnCampCommand: . ENUM++	blockcheck
declare check_partyjob . ENUM++
declare clearbuff . ENUM++
declare check_alive s ENUM++
declare kvm_npc ssnnnnnn ENUM++	blockcheck
declare kvm_start_alivecheck . ENUM++
declare pvprankcheck . ENUM++
declare unused_SetAutoSpell_MLEATK nnnn ENUM++
declare unused_SetAutoSpell_RANGEATK nnnn ENUM++
declare kvm_npc_noti s ENUM++
declare getarenaeventsize . ENUM++
declare SetMakableRuneItemList n ENUM++
declare IsSuccessRuneUse n ENUM++
declare SetMakableNewPoisonList . ENUM++
declare GetItemSocket nnnnn ENUM++
declare GetPetRelationship . ENUM++
declare AddMDamage_Name nsn ENUM++
declare SubMDamage_Name nsn ENUM++
declare GetNonSlotItemSock nnnnn ENUM++
declare IsEffectStatus n ENUM++
declare GetMyMercenary . ENUM++
declare ErrorLog s ENUM++
declare AddReceiveItem_Name ssn ENUM++
declare SubReceiveItem_Name ssn ENUM++
declare IsMadogear . ENUM++
declare SetMadogear s ENUM++
declare AddSFCTConsumeAmount nnn ENUM++
declare SubSFCTConsumeAmount nnn ENUM++
declare AddSFCTConsumePermill nnn ENUM++
declare SubSFCTConsumePermill nnn ENUM++
declare AddSFCTEquipAmount nnn ENUM++
declare SubSFCTEquipAmount nnn ENUM++
declare AddSFCTEquipPermill nnn ENUM++
declare SubSFCTEquipPermill nnn ENUM++
declare AddAttrTolerace_Disregard n? ENUM++
declare SubAttrTolerace_Disregard n? ENUM++
declare GetExdEquipIsSuccessRefinery n ENUM++
declare GetExdAdvEquipIsSuccessRefinery n ENUM++
declare DownRefItem n ENUM++
declare DownAdvRefItem n ENUM++
declare SuccessRandomRefItem nnn ENUM++
declare SuccessRandomAdvRefItem nnn ENUM++
declare FinalBattlePlay s ENUM++
declare OnCampCommand2: s ENUM++	blockcheck
declare InterOther nnnn ENUM++
declare unused_SetAutoSpell_MLEATKED_V2 nnnn ENUM++
declare unused_SetAutoSpell_RANGEATKED_V2 nnnn ENUM++
declare AddSkillSP nn ENUM++
declare SubSkillSP nn ENUM++
declare AddSkillDelay nn ENUM++
declare SubSkillDelay nn ENUM++
declare PlayBGM s ENUM++
declare StripPC2 n ENUM++
declare AddStateCastTime nn ENUM++
declare SubStateCastTime nn ENUM++
declare AddSkillMDamage nn ENUM++
declare SubSkillMDamage nn ENUM++
declare GetLocation . ENUM++
declare BroadcastInZone nss ENUM++
declare BroadcastInMap nss ENUM++
declare SetEffect sn ENUM++
declare ResetEffect s ENUM++
declare SetReadyMutationHomun . ENUM++
declare MutationHomun n ENUM++
declare ModifyMDEF_Fraction nn ENUM++
declare AddAllDEF_Fluctuation n ENUM++
declare SubAllDEF_Fluctuation n ENUM++
declare AddAllMDEF_Fluctuation n ENUM++
declare SubAllMDEF_Fluctuation n ENUM++
declare OpenSearchStoreInfo nn ENUM++
declare ChangeRP snn ENUM++
declare IsAllianceGuild n ENUM++
declare OpenHour_SiegeMode nn ENUM++
declare CheckHomunLevel . ENUM++
declare CheckHomunMutation . ENUM++
declare CheckHomunCall . ENUM++
declare SetBattleFieldMovePosition ssnn ENUM++
declare GetEquipcompositionType nn ENUM++
declare GetEquipDBName n ENUM++
declare GetEquipcardID nn ENUM++
declare dropequipitem n ENUM++
declare getrefitem ns ENUM++
declare ResetBuff s? ENUM++
declare AddState_EFSTATK nsnnn ENUM++
declare SubState_EFSTATK nsnn ENUM++
declare GetNonSlotItemSock2 nnnnnn ENUM++
declare getitem2 nnnn ENUM++
declare ShowScript ss ENUM++
declare ShowEmotion sn ENUM++
declare StartCollection n ENUM++
declare Montransform nns? ENUM++
declare DeleteAllBodyItem . ENUM++
declare OnAgitInvest: . ENUM++	blockcheck
declare IncGlobalVar sn ENUM++
declare DecGlobalVar sn ENUM++
declare GetAgitInvestMsg . ENUM++
declare AddHandicapState_Race nnnn ENUM++
declare SubHandicapState_Race nnnn ENUM++
declare SetNumDEF_Race nnnn ENUM++
declare ResetNumDEF_Race nnnn ENUM++
declare SetNumMDEF_Race nnnn ENUM++
declare ResetNumMDEF_Race nnnn ENUM++
declare SetPerDEF_Self nn ENUM++
declare SetPerMDEF_Self nn ENUM++
declare SetMHPPerDamage_Race nn ENUM++
declare ReSetMHPPerDamage_Race nn ENUM++
declare SetMSPPerDamage_Race nn ENUM++
declare ReSetMSPPerDamage_Race nn ENUM++
declare GetAgitEconomy s ENUM++
declare IncAgitEconomy sn ENUM++
declare DecAgitEconomy sn ENUM++
declare EQ_Make snnnn ENUM++
declare EQ_CheckUser sn ENUM++
declare EQ_NotifyAdmission s ENUM++
declare EQ_IsReady s ENUM++
declare EQ_MoveToRoom ssnn ENUM++
declare EQ_ReturnToPreSpace s ENUM++
declare EQ_MoveToLobby ssn ENUM++
declare Lobby_Make s ENUM++
declare Lobby_UserCount s ENUM++
declare Lobby_NotifyAdmission ssnn ENUM++
declare Lobby_IsReady sn ENUM++
declare Lobby_MoveToRoom ssnn ENUM++
declare Lobby_ReturnToPreSpace s ENUM++
declare Lobby_Init s ENUM++
declare clear . ENUM++
declare Navigation_Active snnnnn? ENUM++
declare Active_Montransform n ENUM++
declare DeActive_Montransform n ENUM++
declare SetAutoSpell2 nnnn ENUM++
declare SetAutoSpell2_MLEATKED nnnn ENUM++
declare SetAutoSpell2_MLEATKED_Short nnnn ENUM++
declare SetAutoSpell2_MLEATKED_Long nnnn ENUM++
declare SetAutoSpell2_MAGATKED nnnn ENUM++
declare SetAutoSpell2_MLEATK nnnn ENUM++
declare SetAutoSpell2_RANGEATK nnnn ENUM++
declare ResetAutoSpell2 nn ENUM++
declare ResetAutoSpell2_MLEATKED nn ENUM++
declare ResetAutoSpell2_MLEATKED_Short nn ENUM++
declare ResetAutoSpell2_MLEATKED_Long nn ENUM++
declare ResetAutoSpell2_MAGATKED nn ENUM++
declare ResetAutoSpell2_MLEATK nn ENUM++
declare ResetAutoSpell2_RANGEATK nn ENUM++
declare PauseAutoSpell2 nn ENUM++
declare PauseAutoSpell2_MLEATKED nn ENUM++
declare PauseAutoSpell2_MLEATKED_Short nn ENUM++
declare PauseAutoSpell2_MLEATKED_Long nn ENUM++
declare PauseAutoSpell2_MAGATKED nn ENUM++
declare PauseAutoSpell2_MLEATK nn ENUM++
declare PauseAutoSpell2_RANGEATK nn ENUM++
declare ResumeAutoSpell2 nn ENUM++
declare ResumeAutoSpell2_MLEATKED nn ENUM++
declare ResumeAutoSpell2_MLEATKED_Short nn ENUM++
declare ResumeAutoSpell2_MLEATKED_Long nn ENUM++
declare ResumeAutoSpell2_MAGATKED nn ENUM++
declare ResumeAutoSpell2_MLEATK nn ENUM++
declare ResumeAutoSpell2_RANGEATK nn ENUM++
declare CheckJobGroup n ENUM++
declare GetPremiumCampaign_Grade n ENUM++
declare GetBaseJob . ENUM++
declare GetCategoryJob n ENUM++
declare EQ_JobControl sn ENUM++
declare AddMDamage_Property nnn ENUM++
declare SubMDamage_Property nnn ENUM++
declare Lobby_CampCode ssnn ENUM++
declare InsertAliveMember . ENUM++
declare EQ_UserInfo_Init . ENUM++

declare AddQuestInfo nnn ENUM++		// [QuestId] [ShowMiniMap (0 = none, 1 = orange, 2 = green, 3 = blue)]
declare AddQuestInfo2 nnnsnn ENUM++
declare SetQuestJob nn ENUM++		// [QuestId] [Job]
declare SetQuestSex nn ENUM++
declare SetQuestLevel nnn ENUM++	// [QuestId] [MinLevel] [MaxLevel]
declare SetQuestJobLevel nnn ENUM++	// [QuestId] [MinJobLevel] [MaxLevel]
declare SetQuestItem nnn ENUM++		// [QuestId] [ItemId] [Amount]
declare SetQuestHomunLevel nnn ENUM++	// 
declare SetQuestHomunType nn ENUM++		//
declare SetQuestQuestItem nnns? ENUM++	//
declare IsSetQuest n ENUM++
declare IsLowLevelSiegeJob . ENUM++
declare ResetBuffLowLevelSiege . ENUM++
declare EQ_MoveToLobbyJobMatching sss ENUM++
declare GetYear . ENUM++
declare GetMonth . ENUM++
declare GetDay . ENUM++
declare GetWeekDay . ENUM++
declare MergeItem . ENUM++
declare dialog2 sn ENUM++
declare wait2 n ENUM++
declare store_V2 ns ENUM++
declare CallFalcon . ENUM++
declare SetPRNpcWinner nn ENUM++
declare PD_SubScription s ENUM++
declare PD_Enter s ENUM++
declare SetQuestQuest nnn ENUM++	// [QuestId] [QuestId] [Status]
declare TalkShow ss ENUM++
declare RentItem nnnnnnn ENUM++
declare ProvideExp nnnn ENUM++
declare GetMonsterHP s ENUM++
declare MonsterTalkShow ss ENUM++
declare CheckJobGroup2 . ENUM++
declare JoinClan . ENUM++
declare LeaveClan . ENUM++
declare SetMonsterHP sn ENUM++
declare ItemDown2 nnnnnnnn ENUM++
declare GetElapsedTimer . ENUM++
declare IsEnableNpc s ENUM++
declare GetNpcMonster_X ss ENUM++
declare GetNpcMonster_Y ss ENUM++
declare DelayTime n ENUM++
declare SetClanMaster . ENUM++
declare SavePosition . ENUM++
declare MovotoSavePosition . ENUM++

declare MD_Trader ssnnnn ENUM++ blockcheck
declare SetMonsterHP2 ssn ENUM++
declare GetRankingPoint n ENUM++
declare IncRankingPoint nn ENUM++
declare DecRankingPoint nn ENUM++
declare NPC_Montransform nn ENUM++
declare PartyMapMove nsnn ENUM++
declare IsPremium . ENUM++
declare SkillOrder snnnnn ENUM++
declare ReducePCCafePlayTime n ENUM++
declare GetPCCafePlayTime . ENUM++
declare AddHealAmount_KillRange nn ENUM++
declare SubHealAmount_KillRange nn ENUM++
declare GetMEventItemName_V2 n ENUM++
declare GetNonSlotItemSock3 nsnnnn ENUM++
declare npcprogress_bar sn ENUM++
declare tradeitem nn ENUM++
declare tradebuy n ENUM++
declare tradesell . ENUM++
declare marketitem nnnn ENUM++
declare market n ENUM++
declare OpenGuildStorage . ENUM++
declare OpenGuildStorageLog . ENUM++
declare ChkMyClan . ENUM++
declare PlayTimeGet . ENUM++
declare PlayTimeAttendedDayCntLoad nn ENUM++
declare PlayTimeAttendedDayCntGet . ENUM++
declare PlayTimeOriginDateGet nnn ENUM++


declare SubBaseStatus . ENUM++
declare IsPermGuildStorage . ENUM++
declare GetPermGuildStorage . ENUM++
declare SetMail . ENUM++
declare AddMailItem . ENUM++
declare SendMail . ENUM++
declare SetPlayerBody . ENUM++
declare SetLevelGapHandicapTolerance . ENUM++
declare ResetLevelGapHandicapTolerance . ENUM++
declare Dressroom_Open . ENUM++
declare GetUserAID . ENUM++
declare AddContactUserAID . ENUM++
declare RemoveContactUserAID . ENUM++
declare ClearContactUserAID . ENUM++
declare IsContactUserAID . ENUM++
declare ShowMobHP . ENUM++
declare GetMyPet . ENUM++
declare GoldPCCafePointGet . ENUM++
declare GoldPCCafePointReduce n ENUM++
declare Store_Readonly ns ENUM++
declare Set_Cinematic_Npc n ENUM++
declare Show_Cinematic_Npc sn ENUM++
declare Talk2me ss ENUM++
declare callDynamicNPC s ENUM++

declare EditAchievement nnn ENUM++
declare ShowAchievement nn ENUM++
declare SetEquipTempValue nn ENUM++
declare GetEquipTempValue n ENUM++
declare GetBronzePoint n ENUM++
declare GetSilverPoint n ENUM++
declare GetGoldPoint n ENUM++
declare OpenRodex . ENUM++
declare MD_Exist s ENUM++
declare homun_relationship_add nn ENUM++
declare WeaponAttribute n ENUM++
declare moveNPCto nn ENUM++
declare OpenUI n ENUM++
declare NormalAtkedAddSP n ENUM++
declare NormalAtkedSubSP n ENUM++
declare DeleteItem nn ENUM++
declare Mercenary_Delete n ENUM++
declare RemoveSFCTEquipAmount nn ENUM++
declare RemoveSFCTEquipPermill nn ENUM++
declare EQUIPMENT_EFFECT nnn ENUM++
declare NoMadogearfuel n ENUM++
declare AddMDamage_Size nnn ENUM++
declare SubMDamage_Size nnn ENUM++
declare separateCard nn ENUM++
declare mergeCard nns ENUM++
declare AddBowAttackDamage nn ENUM++
declare SubBowAttackDamage nn ENUM++
declare AddGetItem_Kill_LevelPenalty sn ENUM++
declare SubGetItem_Kill_LevelPenalty sn ENUM++
declare SetReceiveItem_Group_LevelPenalty n ENUM++
declare ResetReceiveItem_Group_LevelPenalty n ENUM++
declare AddReceiveItem_Race_LevelPenalty nsn ENUM++
declare SubReceiveItem_Race_LevelPenalty nsn ENUM++
declare AddReceiveItem_Name_LevelPenalty ssn ENUM++
declare SubReceiveItem_Name_LevelPenalty ssn ENUM++
declare AddQuestIDCondition n ENUM++
declare AddQuestIDCondition2 nsnn ENUM++
declare SetQuestConditionBegin nnn ENUM++
declare SetQuestConditionEnd . ENUM++
declare SetQuestConditionJob n ENUM++
declare SetQuestConditionSex n ENUM++
declare SetQuestConditionLevel nn ENUM++
declare SetQuestConditionJobLevel nn ENUM++
declare SetQuestConditionItem nns? ENUM++
declare SetQuestConditionHomunLevel nn ENUM++
declare SetQuestConditiontHomunType n ENUM++
declare SetQuestConditionQuest nn ENUM++
//declare OpenUI_StylingShop . ENUM++
declare AddResistDamage_SKID nnn ENUM++
declare SubResistDamage_SKID nnn ENUM++
declare UI_Open_LapineDdukddakBox n ENUM++
declare GetIsConfirmedJPN . ENUM++
declare OnMyMobDead_NPC: . ENUM++ blockcheck
declare ConsumePackageItem n ENUM++
declare JPN_GetPCBangGRADE . ENUM++
declare GetCntTradeitem n ENUM++
declare ClearTradeitem n ENUM++
declare GetMarried2 s ENUM++
declare SetPeriodBuff sn? ENUM++
declare GetBabyDays . ENUM++
declare BabyIndependence . ENUM++
declare GetMyPar1 . ENUM++
declare GetMyPar2 . ENUM++
declare GetMyBaby . ENUM++
declare GetNamedItem2 nn ENUM++
declare GetPartnerNamedItem n ENUM++
declare SetMonsterStat snn ENUM++
declare refiningUI . ENUM++
declare BabyIndependence2 . ENUM++
declare MarketGearItem nnsssssnn ENUM++
declare MarketGear n ENUM++
declare DownSetRefItem nn ENUM++
declare UI_Open_LapineUpgradeBox n ENUM++
declare AddWarpList n ENUM++
declare DelWarpList n ENUM++
declare GetWarpListStr . ENUM++
declare GetWarpListChk n ENUM++
declare SetWarpList nsnn ENUM++
declare mergeCard2 nssss ENUM++
declare GetRandomOptCnt n ENUM++
declare LevelUp nn ENUM++
declare OnPlayerDead: . ENUM++ blockcheck
declare LivePlayerCount . ENUM++
declare PickToNpc nnnnnnnnn ENUM++
declare AddAttackedWeaponPowerRaceTolerance nn ENUM++
declare SubAttackedWeaponPowerRaceTolerance nn ENUM++
declare AddAttackRangeWeaponPower n ENUM++
declare SubAttackRangeWeaponPower n ENUM++
declare AddAttackedRangeWeaponPower n ENUM++
declare SubAttackedRangeWeaponPower n ENUM++

define	MALE				1
define 	FEMALE				0
define	DEFAULT_WIDTH		10
define	DEFAULT_HEIGHT		10
define	DEFAULT_DIRECTION	0
define	DEFAULT_SPEED		300
define  on 1
define  off 0
define  FW_DONTCARE		0
define  FW_THIN			100
define  FW_EXTRALIGHT	200
define  FW_LIGHT		300
define  FW_NORMAL		400
define  FW_MEDIUM		500
define  FW_SEMIBOLD		600
define  FW_BOLD			700
define  FW_EXTRABOLD	800
define  FW_HEAVY		900
define  CELLINFO_DEFAULT	0
define	CELLINFO_RED		1
define	CELLINFO_BLUE		5
