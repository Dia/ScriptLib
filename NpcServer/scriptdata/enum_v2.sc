;
; script event list
# 1
	OnStartHolding:
	OnStartEquip:
	OnFinishHolding:
	OnFinishEquip:
	OnUseItem:
	OnAttacked:
	OnConsume:
	OnAttack:
	OnActiveWeapon:
	OnDeactiveWeapon:
	OnActiveMWeapon:
	OnDeactiveMWeapon:
	OnActiveArmor:
	OnDeactiveArmor:
	OnActiveMArmor:
	OnDeactiveMArmor:
	OnActiveSkill:
	OnDeactiveSkill:
# 19
	OnStartPretendEquip:
	OnFinishPretendEquip:
;
; handicapstate list
# 1
	BODYStoneCurse
	BODYFreezing
	BODYStun
	BODYSleep
	BODYUndead
	HEALTHPoison
	HEALTHCurse
	HEALTHSilence
	HEALTHConfusion
	HEALTHBlind
	HEALTHHeavyPoison
	HEALTHBlooding
	EFFECTEndure
	EFFECTHaste
	EFFECTHasteAttack
	EFFECTSlowPotion
	EFFECTHastePotion
	EFFECTSanta
	EFFECTAngelus
	EFFECTPushcart
	EFFECTConcentrate
	EFFECTHide
	EFFECTWedding
	EFFECTPlusAttackPower
	EFFECTPlusMagicPower
	EFFECTClairvoyance
	EFFECTHasteHorse
	EFFECTSummer
	HEALTHFear
	BODYBurnning
	BODYImprison
	HANDICAPSTATE_DEEPSLEEP
	HANDICAPSTATE_FROSTMISTY
	HANDICAPSTATE_COLD
	HANDICAPSTATE_NORECOVER
	EFFECTHasteAttack_Cash
# 37
	HANDICAPSTATE_ICEEXPLO
# 38
	EFFECTHanbok
;
#0
	BADSTATE_EFST_MLEATK
	BADSTATE_EFST_MLEATKED
	BADSTATE_EFST_MATK
	BADSTATE_EFST_MATKED
	BADSTATE_EFST_ARROWATK
;
;DRESS_UP
# 1
	SUMMER_EVENT2
;
; property list
# 0
	PROPERTY_Nothing
	PROPERTY_Water
	PROPERTY_Ground
	PROPERTY_Fire
	PROPERTY_Wind
	PROPERTY_Poison
	PROPERTY_Saint
	PROPERTY_Darkness
	PROPERTY_Telekinesis
	PROPERTY_Undead
	PROPERTY_All
;
; scale list
# 0
	Small
	Medium
	Large
;
; race list
# 0
	RACE_Nothing
	RACE_Undead
	RACE_Animal
	RACE_Plant
	RACE_Insect
	RACE_Fish
	RACE_Demon
	RACE_Human
	RACE_Angel
	RACE_Dragon
	RACE_HumanPlayer
	RACE_DoramPlayer
# 9999
	RACE_All
;
; object list
# 0
	User
	Target
	Ground
;
; class list
# 0
	CLASS_Normal
	CLASS_Boss
	CLASS_Guardian
;
; location list
# 1
	LOCATION_HEAD
	LOCATION_BODY
	LOCATION_LARM
	LOCATION_RARM
	LOCATION_ROBE
	LOCATION_SHOES
	LOCATION_ACCESSORY1
	LOCATION_ACCESSORY2
# 10
	LOCATION_HEAD2
	LOCATION_HEAD3
# 20
	LOCATION_COSTUME_HEAD2
	LOCATION_COSTUME_HEAD3
	LOCATION_COSTUME_HEAD
	LOCATION_COSTUME_ROBE
#30
	 LOCATION_ARMOR_SHADOW
	 LOCATION_WEAPON_SHADOW
	 LOCATION_SHIELD_SHADOW
	 LOCATION_SHOES_SHADOW
	 LOCATION_R_ACCESSORY_SHADOW
	 LOCATION_L_ACCESSORY_SHADOW
#9999
	LOCATION_CARD
;
; effect list
# 53
	REFINING_SUCCESS_EFFECT
	REFINING_FAIL_EFFECT
# 58
	JOBLEVELUP_EFFECT
# 305
	MAKEITEM_AM_SUCCESS_EFFECT
	MAKEITEM_AM_FAIL_EFFECT
# 371
	LEVELUP_EFFECT
	GAME_OVER_EFFECT
# 0
	EF_HIT1, EF_HIT2, EF_HIT3, EF_HIT4, EF_HIT5, EF_HIT6, EF_ENTRY, EF_EXIT, EF_WARP, EF_ENHANCE, EF_COIN,
	EF_ENDURE,
	EF_BEGINSPELL,
	EF_GLASSWALL,
	EF_HEALSP,
	EF_SOULSTRIKE,
	EF_BASH,
	EF_MAGNUMBREAK,
	EF_STEAL,
	EF_HIDING,
	EF_PATTACK,
	EF_DETOXICATION,
	EF_SIGHT,
	EF_STONECURSE,
	EF_FIREBALL,
	EF_FIREWALL,
	EF_ICEARROW,
	EF_FROSTDIVER,
	EF_FROSTDIVER2,
	EF_LIGHTBOLT,
	EF_THUNDERSTORM,
	EF_FIREARROW,
	EF_NAPALMBEAT,
	EF_RUWACH,
	EF_TELEPORTATION,
	EF_READYPORTAL,
	EF_PORTAL,
	EF_INCAGILITY,
	EF_DECAGILITY,
	EF_AQUA,
	EF_SIGNUM,
	EF_ANGELUS,
	EF_BLESSING,
	EF_INCAGIDEX,
	EF_SMOKE, EF_FIREFLY, EF_SANDWIND,
	EF_TORCH, EF_SPRAYPOND,
	EF_FIREHIT, EF_FIRESPLASHHIT, 
	EF_COLDHIT,	EF_WINDHIT, EF_POISONHIT,
	EF_BEGINSPELL2, EF_BEGINSPELL3, EF_BEGINSPELL4,
	EF_BEGINSPELL5, EF_BEGINSPELL6, EF_BEGINSPELL7,
	EF_LOCKON,
	EF_WARPZONE,
	EF_SIGHTRASHER, EF_BARRIER, EF_ARROWSHOT,
	EF_INVENOM, EF_CURE, EF_PROVOKE, EF_MVP,
	EF_SKIDTRAP, EF_BRANDISHSPEAR, EF_CONE,
	EF_SPHERE, EF_BOWLINGBASH, EF_ICEWALL, EF_GLORIA,
	EF_MAGNIFICAT, EF_RESURRECTION, EF_RECOVERY,
	EF_EARTHSPIKE, EF_SPEARBMR, EF_PIERCE, EF_TURNUNDEAD,
	EF_SANCTUARY, EF_IMPOSITIO, EF_LEXAETERNA, EF_ASPERSIO,
	EF_LEXDIVINA, EF_SUFFRAGIUM, EF_STORMGUST,
	EF_LORD, EF_BENEDICTIO, EF_METEORSTORM, EF_YUFITEL,
	EF_YUFITELHIT, EF_QUAGMIRE, EF_FIREPILLAR,
	EF_FIREPILLARBOMB, EF_HASTEUP, EF_FLASHER,
	EF_REMOVETRAP, EF_REPAIRWEAPON, EF_CRASHEARTH,
	EF_PERFECTION, EF_MAXPOWER, EF_BLASTMINE, EF_BLASTMINEBOMB,
	EF_CLAYMORE, EF_FREEZING, EF_BUBBLE, EF_GASPUSH,
	EF_SPRINGTRAP, EF_KYRIE, EF_MAGNUS, EF_BOTTOM,
	EF_BLITZBEAT, EF_WATERBALL, EF_WATERBALL2, EF_FIREIVY,
	EF_DETECTING, EF_CLOAKING, EF_SONICBLOW, EF_SONICBLOWHIT,
	EF_GRIMTOOTH, EF_VENOMDUST,	EF_ENCHANTPOISON,
	EF_POISONREACT, EF_POISONREACT2, EF_OVERTHRUST,
	EF_SPLASHER, EF_TWOHANDQUICKEN, EF_AUTOCOUNTER,
	EF_GRIMTOOTHATK, EF_FREEZE, EF_FREEZED, EF_ICECRASH,
	EF_SLOWPOISON,	EF_BOTTOM2, EF_FIREPILLARON, EF_SANDMAN,
	EF_REVIVE, EF_PNEUMA, EF_HEAVENSDRIVE, EF_SONICBLOW2,
	EF_BRANDISH2, EF_SHOCKWAVE, EF_SHOCKWAVEHIT,
	EF_EARTHHIT, EF_PIERCESELF, EF_BOWLINGSELF,
	EF_SPEARSTABSELF, EF_SPEARBMRSELF, EF_HOLYHIT,
	EF_CONCENTRATION, EF_REFINEOK, EF_REFINEFAIL,
	EF_JOBCHANGE, EF_LVUP, EF_JOBLVUP, EF_TOPRANK,
	EF_PARTY,
	EF_RAIN, EF_SNOW, EF_SAKURA,
	EF_STATUS_STATE, EF_BANJJAKII,
	EF_MAKEBLUR,
	EF_TAMINGSUCCESS, EF_TAMINGFAILED,
	EF_ENERGYCOAT, EF_CARTREVOLUTION,
	EF_VENOMDUST2,
	EF_CHANGEDARK, EF_CHANGEFIRE, EF_CHANGECOLD,
	EF_CHANGEWIND, EF_CHANGEFLAME, EF_CHANGEEARTH, EF_CHAINGEHOLY,
	EF_CHANGEPOISON, EF_HITDARK, EF_MENTALBREAK, EF_MAGICALATTHIT,
	EF_SUI_EXPLOSION , EF_DARKATTACK,
	EF_SUICIDE, EF_COMBOATTACK1, EF_COMBOATTACK2, EF_COMBOATTACK3,
	EF_COMBOATTACK4, EF_COMBOATTACK5, EF_GUIDEDATTACK,
	EF_POISONATTACK,EF_SILENCEATTACK, EF_STUNATTACK,
	EF_PETRIFYATTACK, EF_CURSEATTACK, EF_SLEEPATTACK, EF_TELEKHIT,
	EF_PONG,
	EF_LEVEL99, EF_LEVEL99_2, EF_LEVEL99_3, EF_GUMGANG,
	EF_POTION1, EF_POTION2, EF_POTION3, EF_POTION4, EF_POTION5,
	EF_POTION6, EF_POTION7, EF_POTION8,
	EF_DARKBREATH, EF_DEFFENDER, EF_KEEPING, EF_SUMMONSLAVE,
	EF_BLOODDRAIN, EF_ENERGYDRAIN,
	EF_POTION_CON, EF_POTION_,
	EF_POTION_BERSERK, EF_POTIONPILLAR,
	EF_DEFENDER, EF_SAINTCASTING, EF_WIND, EF_VOLCANO, EF_GRANDCROSS, EF_INTIMIDATE,
	EF_CHOOKGI,
	EF_CLOUD, EF_CLOUD2, EF_MAPPILLAR,
	EF_LINELINK, EF_CLOUD3,
	EF_SPELLBREAKER, EF_DISPELL,
	EF_DELUGE, EF_VIOLENTGALE, EF_LANDPROTECTOR,
	EF_BOTTOM_VO, EF_BOTTOM_DE, EF_BOTTOM_VI, EF_BOTTOM_LA,
	EF_FASTMOVE,
	EF_MAGICROD, EF_HOLYCROSS, EF_SHIELDCHARGE,
	EF_MAPPILLAR2,
	EF_PROVIDENCE, EF_SHIELDBOOMERANG, EF_SPEARQUICKEN, EF_DEVOTION, EF_REFLECTSHIELD ,
	EF_ABSORBSPIRITS, EF_STEELBODY,
	EF_FLAMELAUNCHER, EF_FROSTWEAPON, EF_LIGHTNINGLOADER, EF_SEISMICWEAPON,
	EF_MAPPILLAR3,EF_MAPPILLAR4,
	EF_GUMGANG2, EF_TEIHIT1,EF_GUMGANG3, EF_TEIHIT2, EF_TANJI, EF_TEIHIT1X,
	EF_CHIMTO, EF_STEALCOIN,
	EF_STRIPWEAPON,EF_STRIPSHIELD,EF_STRIPARMOR,EF_STRIPHELM,EF_CHAINCOMBO, EF_RG_COIN,
	EF_BACKSTAP, EF_TEIHIT3,
	EF_BOTTOM_DISSONANCE,EF_BOTTOM_LULLABY,EF_BOTTOM_RICHMANKIM,EF_BOTTOM_ETERNALCHAOS,
	EF_BOTTOM_DRUMBATTLEFIELD,EF_BOTTOM_RINGNIBELUNGEN,EF_BOTTOM_ROKISWEIL,EF_BOTTOM_INTOABYSS,
	EF_BOTTOM_SIEGFRIED,EF_BOTTOM_WHISTLE,EF_BOTTOM_ASSASSINCROSS,EF_BOTTOM_POEMBRAGI,
	EF_BOTTOM_APPLEIDUN,EF_BOTTOM_UGLYDANCE,EF_BOTTOM_HUMMING,EF_BOTTOM_DONTFORGETME,
	EF_BOTTOM_FORTUNEKISS,EF_BOTTOM_SERVICEFORYOU,
	EF_TALK_FROSTJOKE, EF_TALK_SCREAM ,
	EF_POKJUK, EF_THROWITEM, EF_THROWITEM2, EF_CHEMICALPROTECTION,
	EF_POKJUK_SOUND, EF_DEMONSTRATION,
	EF_CHEMICAL2, EF_TELEPORTATION2,
	EF_PHARMACY_OK, EF_PHARMACY_FAIL,
	EF_FORESTLIGHT, EF_THROWITEM3,
	EF_FIRSTAID,
	EF_SPRINKLESAND, EF_LOUD,
	EF_HEAL, EF_HEAL2, EF_EXIT2, EF_GLASSWALL2,
	EF_READYPORTAL2,
	EF_PORTAL2,
	EF_BOTTOM_MAG, EF_BOTTOM_SANC,
	EF_HEAL3, EF_WARPZONE2,
	EF_FORESTLIGHT2,EF_FORESTLIGHT3,EF_FORESTLIGHT4,
	EF_HEAL4, EF_FOOT, EF_FOOT2, EF_BEGINASURA, EF_TRIPLEATTACK,
	EF_HITLINE, EF_HPTIME, EF_SPTIME, EF_MAPLE,
	EF_BLIND,EF_POISON, EF_GUARD, EF_JOBLVUP50, EF_ANGEL2,
	EF_MAGNUM2, EF_CALLZONE, EF_PORTAL3, EF_COUPLECASTING, EF_HEARTCASTING,
	EF_ENTRY2, EF_SAINTWING, EF_SPHEREWIND, EF_COLORPAPER, EF_LIGHTSPHERE,
	EF_WATERFALL, EF_WATERFALL_90, EF_WATERFALL_SMALL, EF_WATERFALL_SMALL_90,
	EF_WATERFALL_T2, EF_WATERFALL_T2_90, EF_WATERFALL_SMALL_T2, EF_WATERFALL_SMALL_T2_90,
	EF_MINI_TETRIS, EF_GHOST, EF_BAT, EF_BAT2,
	EF_SOULBREAKER, EF_LEVEL99_4, EF_VALLENTINE, EF_VALLENTINE2, EF_PRESSURE,
	EF_BASH3D, EF_AURABLADE, EF_REDBODY, EF_LKCONCENTRATION, EF_BOTTOM_GOSPEL,
	EF_ANGEL, EF_DEVIL, EF_DRAGONSMOKE,
	EF_BOTTOM_BASILICA, EF_ASSUMPTIO, EF_HITLINE2, EF_BASH3D2,
# 1021
	EF_DUSTSTORM,
# 1038
	EF_COLORPAPER2,
# 1039
EF_EVILS_PAW
EF_GC_DARKCROW
EF_RK_DRAGONBREATH_WATER
EF_ALL_FULL_THROTTLE
EF_SR_FLASHCOMBO
EF_RK_LUXANIMA
EF_CLOUD10
EF_SO_ELEMENTAL_SHIELD
EF_AB_OFFERTORIUM
EF_WL_TELEKINESIS_INTENSE
EF_GN_ILLUSIONDOPING
EF_NC_MAGMA_ERUPTION
EF_LG_KINGS_GRACE
EF_BLOODDRAIN2
EF_NPC_WIDEWEB
EF_NPC_BURNT
EF_NPC_CHILL
EF_RA_UNLIMIT
EF_AB_OFFERTORIUM_RING
EF_SC_ESCAPE
EF_WM_FRIGG_SONG
EF_FLICKER
EF_C_MAKER
EF_HAMMER_OF_GOD
EF_MASS_SPIRAL
EF_FIRE_RAIN
EF_WHITEBODY
EF_BANISHING_BUSTER
EF_SLUGSHOT
EF_D_TAIL
EF_BIND_TRAP1
EF_BIND_TRAP2
EF_BIND_TRAP3
EF_JUMPBODY1
EF_ANIMATED_EMITTER
EF_RL_EXPLOSION
EF_C_MAKER_1
EF_QD_SHOT
EF_P_ALTER
EF_S_STORM
EF_MUSIC_HAT
;
; item group list
# 1
	ITMGROUP_ORE
	ITMGROUP_GEM
	ITMGROUP_HEAL
	ITMGROUP_FOOD
;
; job list
# 6000
	MER_BEGIN,
	MER_LIF,			MER_AMISTR,			MER_FILIR,			MER_VANILMIRTH,
	MER_LIF2,			MER_AMISTR2,		MER_FILIR2,			MER_VANILMIRTH2,
	MER_LIF_H,			MER_AMISTR_H,		MER_FILIR_H,		MER_VANILMIRTH_H,
	MER_LIF_H2,			MER_AMISTR_H2,		MER_FILIR_H2,		MER_VANILMIRTH_H2,
	MER_ARCHER01,		MER_ARCHER02,		MER_ARCHER03,		MER_ARCHER04,
	MER_ARCHER05,		MER_ARCHER06,		MER_ARCHER07,		MER_ARCHER08,
	MER_ARCHER09,		MER_ARCHER10,
	MER_LANCER01,		MER_LANCER02,		MER_LANCER03,		MER_LANCER04,
	MER_LANCER05,		MER_LANCER06,		MER_LANCER07,		MER_LANCER08,
	MER_LANCER09,		MER_LANCER10,
	MER_SWORDMAN01,		MER_SWORDMAN02,		MER_SWORDMAN03,		MER_SWORDMAN04,
	MER_SWORDMAN05,		MER_SWORDMAN06,		MER_SWORDMAN07,		MER_SWORDMAN08,
	MER_SWORDMAN09,		MER_SWORDMAN10,
	MER_LAST,
;
; var list
# 0
	VAR_SPEED,
	VAR_EXP,
	VAR_JOBEXP,
	VAR_VIRTUE,
	VAR_HONOR,
	VAR_HP,
	VAR_MAXHP,
	VAR_SP,
	VAR_MAXSP,
	VAR_POINT,
	VAR_HAIRCOLOR,
	VAR_CLEVEL,
	VAR_SPPOINT,
	VAR_STR,
	VAR_AGI,
	VAR_VIT,
	VAR_INT,
	VAR_DEX,
	VAR_LUK,
	VAR_JOB,
	VAR_MONEY,
	VAR_SEX,
	VAR_MAXEXP,
	VAR_MAXJOBEXP,
	VAR_WEIGHT,
	VAR_MAXWEIGHT,
	VAR_POISON,
	VAR_STONE,
	VAR_CURSE,
	VAR_FREEZING,
	VAR_SILENCE,
	VAR_CONFUSION,
	VAR_STANDARD_STR,
	VAR_STANDARD_AGI,
	VAR_STANDARD_VIT,
	VAR_STANDARD_INT,
	VAR_STANDARD_DEX,
	VAR_STANDARD_LUK,
	VAR_ATTACKMT,
	VAR_ATTACKEDMT,
	VAR_NV_BASIC,
	VAR_ATTPOWER,
	VAR_REFININGPOWER,
	VAR_MAX_MATTPOWER,
	VAR_MIN_MATTPOWER,
	VAR_ITEMDEFPOWER,
	VAR_PLUSDEFPOWER,
	VAR_MDEFPOWER,
	VAR_PLUSMDEFPOWER,
	VAR_HITSUCCESSVALUE,
	VAR_AVOIDSUCCESSVALUE,
	VAR_PLUSAVOIDSUCCESSVALUE,
	VAR_CRITICALSUCCESSVALUE,
	VAR_ASPD,
	VAR_PLUSASPD,
	VAR_JOBLEVEL,
	VAR_ACCESSORY2,
	VAR_ACCESSORY3,
	VAR_HEADPALETTE,
	VAR_BODYPALETTE,
	VAR_SHIELD,
	VAR_CURXPOS, VAR_CURYPOS, VAR_CURDIR,
	VAR_CHARACTERID, VAR_ACCOUNTID, VAR_MAPID, VAR_MAPNAME, VAR_ACCOUNTNAME, VAR_CHARACTERNAME, VAR_ITEM_COUNT,
	VAR_ITEM_ITID,
	VAR_ITEM_SLOT1, VAR_ITEM_SLOT2, VAR_ITEM_SLOT3, VAR_ITEM_SLOT4,
	VAR_HEAD, VAR_WEAPON, VAR_ACCESSORY,
	VAR_STATE, VAR_MOVEREQTIME, VAR_GROUPID,
	VAR_ATTPOWERPLUSTIME, VAR_ATTPOWERPLUSPERCENT, VAR_DEFPOWERPLUSTIME, VAR_DEFPOWERPLUSPERCENT,
	VAR_DAMAGENOMOTIONTIME,
	VAR_BODYSTATE,
	VAR_HEALTHSTATE,
	VAR_RESETHEALTHSTATE,
	VAR_CURRENTSTATE,
	VAR_RESETEFFECTIVE,
	NOT_USED_VAR_GETEFFECTIVE,
	VAR_EFFECTSTATE,
	VAR_SIGHTABILITYEXPIREDTIME,
	VAR_SIGHTRANGE,
	VAR_SIGHTPLUSATTPOWER,
	VAR_STREFFECTIVETIME, VAR_AGIEFFECTIVETIME, VAR_VITEFFECTIVETIME, VAR_INTEFFECTIVETIME, VAR_DEXEFFECTIVETIME, VAR_LUKEFFECTIVETIME,
	VAR_STRAMOUNT, VAR_AGIAMOUNT, VAR_VITAMOUNT, VAR_INTAMOUNT, VAR_DEXAMOUNT, VAR_LUKAMOUNT, VAR_MAXHPAMOUNT, VAR_MAXSPAMOUNT,
	VAR_MAXHPPERCENT, VAR_MAXSPPERCENT, VAR_HPACCELERATION, VAR_SPACCELERATION,
	VAR_SPEEDAMOUNT,
	VAR_SPEEDDELTA,
	VAR_SPEEDDELTA2,
	VAR_PLUSATTRANGE, VAR_DISCOUNTPERCENT, VAR_AVOIDABLESUCCESSPERCENT, VAR_STATUSDEFPOWER, VAR_PLUSDEFPOWERINACOLYTE,
	VAR_MAGICITEMDEFPOWER, VAR_MAGICSTATUSDEFPOWER, VAR_CLASS, VAR_PLUSATTACKPOWEROFITEM, VAR_PLUSDEFPOWEROFITEM, VAR_PLUSMDEFPOWEROFITEM,
	VAR_PLUSARROWPOWEROFITEM, VAR_PLUSATTREFININGPOWEROFITEM, VAR_PLUSDEFREFININGPOWEROFITEM, VAR_IDENTIFYNUMBER, VAR_ISDAMAGED, VAR_ISIDENTIFIED, VAR_REFININGLEVEL, VAR_WEARSTATE,
	VAR_ISLUCKY,
	VAR_ATTACKPROPERTY,
	VAR_STORMGUSTCNT,
	VAR_MAGICATKPERCENT,
	VAR_MYMOBCOUNT,
	VAR_ISCARTON,
	VAR_GDID, VAR_NPCXSIZE, VAR_NPCYSIZE, VAR_RACE, VAR_SCALE, VAR_PROPERTY, VAR_PLUSATTACKPOWEROFITEM_RHAND, VAR_PLUSATTACKPOWEROFITEM_LHAND,
	VAR_PLUSATTREFININGPOWEROFITEM_RHAND, VAR_PLUSATTREFININGPOWEROFITEM_LHAND,
	VAR_TOLERACE,
	VAR_ARMORPROPERTY,
	VAR_ISMAGICIMMUNE,
	VAR_ISFALCON,
	VAR_ISRIDING,
	VAR_MODIFIED,
	VAR_FULLNESS,
	VAR_RELATIONSHIP,
	VAR_ACCESSARY,
	VAR_SIZETYPE,
	VAR_SHOES,
	VAR_STATUSATTACKPOWER,
	VAR_BASICAVOIDANCE,
	VAR_BASICHIT,
	VAR_PLUSASPDPERCENT,
	VAR_CPARTY,
	VAR_ISMARRIED,
	VAR_ISGUILD,
	VAR_ISFALCONON,
	VAR_ISPECOON,
	VAR_ISPARTYMASTER,
	VAR_ISGUILDMASTER,
	VAR_BODYSTATENORMAL,
	VAR_HEALTHSTATENORMAL,
	VAR_STUN,
	VAR_SLEEP,
	VAR_UNDEAD,
	VAR_BLIND,
	VAR_BLOODING,
	VAR_BSPOINT,
	VAR_ACPOINT,
	VAR_BSRANK,
	VAR_ACRANK,
	VAR_CHANGESPEED,
	VAR_CHANGESPEEDTIME,
	VAR_MAGICATKPOWER,
	VAR_MER_KILLCOUNT,
	VAR_MER_FAITH,
	VAR_MDEFPERCENT,
	VAR_CRITICAL_DEF,
	VAR_UNKNOWN_01,
	VAR_UNKNOWN_02,
	VAR_UNKNOWN_03,
	VAR_UNKNOWN_04,
	VAR_UNKNOWN_05,
	VAR_UNKNOWN_06,
	VAR_UNKNOWN_07,
	VAR_ATTMPOWER,
	VAR_CARTWEIGHT,
	VAR_HP_SELF,
	VAR_SP_SELF,
	VAR_COSTUME_BODY,
	VAR_RESET_COSTUMES,
	VAR_ROBE,
# 207
	VAR_ATKPERCENT,
# 208
	VAR_GUILDSTORAGE_LV,
# 209
	VAR_BODY,
# 210
	VAR_ATK1,
# 211
	VAR_ATK2,
# 212
	VAR_HEALPERCENT_BY_SKILL,
;
; effectstate list
# 0
	EFFECT_STATE_NOTHING,
	EFFECT_STATE_SIGHT_1,
	EFFECT_STATE_SIGHT_2,
	EFFECT_STATE_SIGHT_3,
	EFFECT_STATE_SIGHT_4,
	EFFECT_STATE_SIGHT_5,
	EFFECT_STATE_SIGHT_6,
	EFFECT_STATE_SIGHT_7,
	EFFECT_STATE_SIGHT_8,
	EFFECT_STATE_SIGHT_9,
	EFFECT_STATE_SIGHT_10,
	EFFECT_STATE_BURROW,
	EFFECT_STATE_HIDING,
	EFFECT_STATE_PUSHCART,
	EFFECT_STATE_BIRD,
	EFFECT_STATE_CHICKEN,
	EFFECT_STATE_SPECIALHIDING,
	EFFECT_STATE_DRAGON,
	EFFECT_STATE_WUG,
	EFFECT_STATE_WUGRIDER,
	EFFECT_STATE_MADOGEAR,
	EFFECT_STATE_LAST,
;
; FSM(Finite State Machine) list
# 0
	WARP_NPC
	GUIDE_NPC
	TALK_NPC
	TRADER_NPC
	EFFECT_NPC
	ARENA_GUIDE_NPC
	MONSTER_TYPE_01
	MONSTER_TYPE_02
	MONSTER_TYPE_03
	MONSTER_TYPE_04
	MONSTER_TYPE_05
	MONSTER_TYPE_06
	MONSTER_TYPE_07
	MONSTER_TYPE_08
	MONSTER_TYPE_09
	MONSTER_TYPE_10
	MONSTER_TYPE_11
	MONSTER_TYPE_12
	MONSTER_TYPE_13
	MONSTER_TYPE_14
	MONSTER_TYPE_15
	MONSTER_TYPE_16
	MONSTER_TYPE_17
	MONSTER_TYPE_18
	MONSTER_TYPE_19
	MONSTER_TYPE_20
	MONSTER_TYPE_21
	MONSTER_TYPE_22
	MONSTER_TYPE_23
	MONSTER_TYPE_24
	MONSTER_TYPE_25
	MONSTER_TYPE_26
	MONSTER_TYPE_27
	HIDDEN_WARP_NPC
	MERCENARY_TYPE_01
	MERCENARY_TYPE_02
	CASHTRADER_NPC
	MOVE_NPC_TYPE01
	UNUSED_MOVE_NPC_TRADER
	LUA_AI_TYPE
	MONSTER_TYPE_28
# 47
	MONSTER_TYPE_29
	MONSTER_TYPE_30
; FSM(Finite State Machine) state list
# 1
	IDLE_ST
	RMOVE_ST
	RUSH_ST
	SEARCH_ST
	BERSERK_ST
	FIGHT_ST
	MOVEENEMY_ST
	MOVEHELP_ST
	DEAD_ST
	MOVEITEM_ST
	ABNORMAL_ST
	MOVE_DEST_ST
	MOVE_STUCK_ST
;
; emotion list
# 0
 	ET_SURPRISE, ET_QUESTION, ET_DELIGHT, ET_THROB, ET_SWEAT, ET_AHA, ET_FRET, ET_ANGER, ET_MONEY, ET_THINK, ET_SCISSOR,
	ET_ROCK, ET_WRAP, ET_FLAG, ET_BIGTHROB, ET_THANKS, ET_KEK, ET_SORRY, ET_SMILE, ET_PROFUSELY_SWAT, ET_SCRATCH,
	ET_BEST, ET_STARE_ABOUT, ET_HUK, ET_O, ET_X, ET_HELP, ET_GO, ET_CRY, ET_KIK, ET_CHUP, ET_CHUPCHUP,
	ET_HNG, ET_OK
;
; agit relation list
# 0
	AGIT_E_DEGREE
	AGIT_E_FUNDING_OK
	AGIT_E_FUND
	AGIT_E_TRIGGER
	AGIT_D_DEGREE
	AGIT_D_FUNDING_OK
	AGIT_D_FUND
	AGIT_D_TRIGGER
	AGIT_GUILD
	AGIT_NAME
	AGIT_GUILDNAME
	AGIT_GUILDMASTER
	AGIT_KAFRA_SKILL
	AGIT_GUARDIAN_SKILL
	AGIT_EMBLEM_VER
	AGIT_ISDISABLE_SKILL
	AGIT_EMPELIUM_CONQUEROR
# 0
	AF_INVEST_E
	AF_INVEST_D
	AF_SET_PAY_TIME
# 0
	AN_VISIBLE
	AN_MAXHP
	AN_HP
	AN_MAXSP
	AN_SP
	AN_NAME
# 0
	AGIT_NPC_MASTER
	AGIT_NPC_EMPELIUM
	AGIT_NPC_CONTAINER
;
; weapon relation list
# 0
	WEAPONTYPE_NONE
	WEAPONTYPE_SHORTSWORD
	WEAPONTYPE_SWORD
	WEAPONTYPE_TWOHANDSWORD
	WEAPONTYPE_SPEAR
	WEAPONTYPE_TWOHANDSPEAR
	WEAPONTYPE_AXE
	WEAPONTYPE_TWOHANDAXE
	WEAPONTYPE_MACE
	WEAPONTYPE_TWOHANDMACE
	WEAPONTYPE_ROD
	WEAPONTYPE_BOW
	WEAPONTYPE_KNUKLE
	WEAPONTYPE_INSTRUMENT
	WEAPONTYPE_WHIP
	WEAPONTYPE_BOOK
	WEAPONTYPE_CATARRH
	WPCLASS_GUN_HANDGUN
	WPCLASS_GUN_RIFLE
	WPCLASS_GUN_GATLING
	WPCLASS_GUN_SHOTGUN
	WPCLASS_GUN_GRANADE
	WPCLASS_SYURIKEN
	WPCLASS_TWOHANDROD
#104
	WPCLASS_CARD_BOSS
;
; attack type
#1
	MELEE
	MAGIC
;
; Multi Language
#0
	DEFAULT
	ENGLISH
	GERMAN
	ITALIAN
	TURKISH
	FRENCH
	SPANISH
;
; UI
#0
	UI_BANK
	UI_STYLINGSHOP
	UI_MACRO_DETECTOR_REGISTER
	UI_MACRO_DETECTOR_REPOTER
	UI_ZENY_LOTTO
	UI_TIPBOX
	UI_QUEST
