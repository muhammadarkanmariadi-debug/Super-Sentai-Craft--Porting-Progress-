package com.liasdan.supersentaicraft.entity;

import com.liasdan.supersentaicraft.entity.footsoldier.DustlersEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.SpotmenEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.MechaclonesEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.ZolohsEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.JimmersEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.GrinamsEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.Golems1Entity;
import com.liasdan.supersentaicraft.entity.footsoldier.Golems2Entity;
import com.liasdan.supersentaicraft.entity.footsoldier.CotpotrosEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.DorodorosEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.KunekunesEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.BarmiasBlackEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.BarmiasWhiteEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.AnaroidsEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.IgaroidsEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.BatsuroidsEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.KarthsEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.RinshisEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.UgatzEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.DroansEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.KurosEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.MoebasEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.BechatsEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.KudakksEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.AnounisEntity;
import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.entity.ally.ZubaanEntity;
import com.liasdan.supersentaicraft.entity.boss.*;
import com.liasdan.supersentaicraft.entity.footsoldier.*;
import com.liasdan.supersentaicraft.entity.projectile.ExplosiveProjectileEntity;
import com.liasdan.supersentaicraft.entity.projectile.ShurikenProjectileEntity;
import com.liasdan.supersentaicraft.entity.projectile.WeaponProjectileEntity;
import com.liasdan.supersentaicraft.entity.bikes.DeinochaserEntity;
import com.liasdan.supersentaicraft.entity.bikes.GaruBikeEntity;
import com.liasdan.supersentaicraft.entity.ally.KyurangerAllyEntity;
import com.liasdan.supersentaicraft.entity.ally.MechaDarkGearAllyEntity;
import com.liasdan.supersentaicraft.entity.boss.DogoldEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.ZorimasEntity;
import com.liasdan.supersentaicraft.entity.boss.DeathryugerEntity;
import com.liasdan.supersentaicraft.entity.boss.ChaosRyugerEntity;
import com.liasdan.supersentaicraft.entity.boss.BraveKyoryuGoldEntity;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MobsCore {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
	public static final DeferredRegister<EntityType<?>> MOBLIST = DeferredRegister.create(BuiltInRegistries.ENTITY_TYPE, SuperSentaiCraftCore.MODID);
	
	//37 Kyoryuger
	public static final DeferredHolder<EntityType<?>, EntityType<DogoldEntity>> DOGOLD = MOBLIST.register("dogold",
			() -> EntityType.Builder.of(DogoldEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":dogold"));

	public static final DeferredHolder<EntityType<?>, EntityType<ZorimasEntity>> ZORIMAS = MOBLIST.register("zorimas",
			() -> EntityType.Builder.of(ZorimasEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":zorimas"));

	public static final DeferredHolder<EntityType<?>, EntityType<DeathryugerEntity>> DEATHRYUGER = MOBLIST.register("death_ryuger",
			() -> EntityType.Builder.of(DeathryugerEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":death_ryuger"));

	public static final DeferredHolder<EntityType<?>, EntityType<BraveKyoryuGoldEntity>> BRAVE_KYORYU_GOLD = MOBLIST.register("brave_kyoryu_gold",
			() -> EntityType.Builder.of(BraveKyoryuGoldEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":brave_kyoryu_gold"));

	public static final DeferredItem<Item> DOGOLD_SPAWN_EGG = ITEMS.register("dogold_spawn_egg",
			() -> new DeferredSpawnEggItem(DOGOLD, 15112192, 16108336, new Item.Properties()));

	public static final DeferredItem<Item> ZORIMAS_SPAWN_EGG = ITEMS.register("zorimas_spawn_egg",
			() -> new DeferredSpawnEggItem(ZORIMAS, 15112192, 16108336, new Item.Properties()));

	public static final DeferredItem<Item> DEATHRYUGER_SPAWN_EGG = ITEMS.register("death_ryuger_spawn_egg",
			() -> new DeferredSpawnEggItem(DEATHRYUGER, 15112192, 16108336, new Item.Properties()));

	public static final DeferredItem<Item> BRAVE_KYORYU_GOLD_SPAWN_EGG = ITEMS.register("brave_kyoryu_gold_spawn_egg",
			() -> new DeferredSpawnEggItem(BRAVE_KYORYU_GOLD, 15112192, 16108336, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<ChaosRyugerEntity>> CHAOS_RYUGER = MOBLIST.register("chaos_ryuger",
			() -> EntityType.Builder.of(ChaosRyugerEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":chaos_ryuger"));

	public static final DeferredItem<DeferredSpawnEggItem> CHAOS_RYUGER_SPAWN_EGG = ITEMS.register("chaos_ryuger_spawn_egg",
			() -> new DeferredSpawnEggItem(CHAOS_RYUGER,0xE60012, 0xFFFF00, new Item.Properties()));

	//01 Goranger
	public static final DeferredHolder<EntityType<?>, EntityType<ZoldersEntity>> ZOLDERS = MOBLIST.register("zolder",
            () -> EntityType.Builder.of(ZoldersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":zolder"));
    
    public static final DeferredItem<DeferredSpawnEggItem> ZOLDERS_SPAWN_EGG = ITEMS.register("zolder_spawn_egg",
            () -> new DeferredSpawnEggItem(ZOLDERS,0xFF0000, 0x0000FF, new Item.Properties()));

	//02 JAKQ
	public static final DeferredHolder<EntityType<?>, EntityType<CrimersEntity>> CRIMERS = MOBLIST.register("crimer",
			() -> EntityType.Builder.of(CrimersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":crimer"));

	public static final DeferredItem<DeferredSpawnEggItem> CRIMERS_SPAWN_EGG = ITEMS.register("crimer_spawn_egg",
			() -> new DeferredSpawnEggItem(CRIMERS,0xFF0000, 0x00FF00, new Item.Properties()));

	//03 Battle Fever
	public static final DeferredHolder<EntityType<?>, EntityType<CutmenEntity>> CUTMEN = MOBLIST.register("cutman",
			() -> EntityType.Builder.of(CutmenEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":cutman"));

	public static final DeferredItem<DeferredSpawnEggItem> CUTMEN_SPAWN_EGG = ITEMS.register("cutman_spawn_egg",
			() -> new DeferredSpawnEggItem(CUTMEN,0xFF0000, 0x888888, new Item.Properties()));

	//05 Sun Vulcan
	public static final DeferredHolder<EntityType<?>, EntityType<MachinemenEntity>> MACHINEMEN = MOBLIST.register("machineman",
			() -> EntityType.Builder.of(MachinemenEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":machineman"));

	public static final DeferredItem<DeferredSpawnEggItem> MACHINEMEN_SPAWN_EGG = ITEMS.register("machineman_spawn_egg",
			() -> new DeferredSpawnEggItem(MACHINEMEN,0xFF0000, 0x0000FF, new Item.Properties()));

	//11 Maskman
	public static final DeferredHolder<EntityType<?>, EntityType<UnglersEntity>> UNGLERS = MOBLIST.register("ungler",
            () -> EntityType.Builder.of(UnglersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ungler"));
    
    public static final DeferredItem<DeferredSpawnEggItem> UNGLERS_SPAWN_EGG = ITEMS.register("ungler_spawn_egg",
			() -> new DeferredSpawnEggItem(UNGLERS,0xFF0000, 0x000000, new Item.Properties()));

	//13 Turboranger
	public static final DeferredHolder<EntityType<?>, EntityType<UlarsEntity>> ULARS = MOBLIST.register("ular",
			() -> EntityType.Builder.of(UlarsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ular"));

	public static final DeferredItem<DeferredSpawnEggItem> ULARS_SPAWN_EGG = ITEMS.register("ular_spawn_egg",
			() -> new DeferredSpawnEggItem(ULARS,0xFF0000, 0x00FF00, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<UlarCaptainEntity>> ULAR_CAPTAIN = MOBLIST.register("ular_captain",
			() -> EntityType.Builder.of(UlarCaptainEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ular_captain"));

	public static final DeferredItem<DeferredSpawnEggItem> ULAR_CAPTAIN_SPAWN_EGG = ITEMS.register("ular_captain_spawn_egg",
			() -> new DeferredSpawnEggItem(ULAR_CAPTAIN,0xFF0000, 0x00FF00, new Item.Properties()));

	//20 Carranger
	public static final DeferredHolder<EntityType<?>, EntityType<WumpersEntity>> WUMPERS = MOBLIST.register("wumper",
			() -> EntityType.Builder.of(WumpersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":wumper"));

	public static final DeferredItem<DeferredSpawnEggItem> WUMPERS_SPAWN_EGG = ITEMS.register("wumper_spawn_egg",
			() -> new DeferredSpawnEggItem(WUMPERS,0xFF0000, 0xFFFFFF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<SignalmanEvilEntity>> SIGNALMAN_EVIL = MOBLIST.register("signalman_evil",
			() -> EntityType.Builder.of(SignalmanEvilEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":signalman_evil"));

	public static final DeferredItem<DeferredSpawnEggItem> SIGNALMAN_EVIL_SPAWN_EGG = ITEMS.register("signalman_evil_spawn_egg",
			() -> new DeferredSpawnEggItem(SIGNALMAN_EVIL,0xFF0000, 0xFFFFFF, new Item.Properties()));

	//22 Gingaman
	public static final DeferredHolder<EntityType<?>, EntityType<YartotsEntity>> YARTOTS = MOBLIST.register("yartots",
			() -> EntityType.Builder.of(YartotsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":yartots"));

	public static final DeferredItem<DeferredSpawnEggItem> YARTOTS_SPAWN_EGG = ITEMS.register("yartots_spawn_egg",
			() -> new DeferredSpawnEggItem(YARTOTS,0xFF0000, 0x0000FF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<BlackKnightEntity>> BLACK_KNIGHT = MOBLIST.register("black_knight",
			() -> EntityType.Builder.of(BlackKnightEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":black_knight"));

	public static final DeferredItem<DeferredSpawnEggItem> BLACK_KNIGHT_SPAWN_EGG = ITEMS.register("black_knight_spawn_egg",
			() -> new DeferredSpawnEggItem(BLACK_KNIGHT,0xFF0000, 0x0000FF, new Item.Properties()));

	//23 GoGo-V
	public static final DeferredHolder<EntityType<?>, EntityType<ImpsEntity>> IMPS = MOBLIST.register("imps",
			() -> EntityType.Builder.of(ImpsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":imps"));

	public static final DeferredItem<DeferredSpawnEggItem> IMPS_SPAWN_EGG = ITEMS.register("imps_spawn_egg",
			() -> new DeferredSpawnEggItem(IMPS,0xFF0000, 0x000000, new Item.Properties()));

	//25 Gaoranger
	public static final DeferredHolder<EntityType<?>, EntityType<OrgettesEntity>> ORGETTES = MOBLIST.register("orgettes",
			() -> EntityType.Builder.of(OrgettesEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":orgettes"));

	public static final DeferredItem<DeferredSpawnEggItem> ORGETTES_SPAWN_EGG = ITEMS.register("orgettes_spawn_egg",
			() -> new DeferredSpawnEggItem(ORGETTES,0xFF0000, 0x888888, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<DukeOrgRoukiEntity>> DUKE_ORG_ROUKI = MOBLIST.register("duke_org_rouki",
			() -> EntityType.Builder.of(DukeOrgRoukiEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":duke_org_rouki"));

	public static final DeferredItem<DeferredSpawnEggItem> DUKE_ORG_ROUKI_SPAWN_EGG = ITEMS.register("duke_org_rouki_spawn_egg",
			() -> new DeferredSpawnEggItem(DUKE_ORG_ROUKI,0xFF0000, 0x888888, new Item.Properties()));

    //30 Boukenger
    public static final DeferredHolder<EntityType<?>, EntityType<CursesEntity>> CURSES = MOBLIST.register("curse",
            () -> EntityType.Builder.of(CursesEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":curse"));

    public static final DeferredItem<DeferredSpawnEggItem> CURSES_SPAWN_EGG = ITEMS.register("curse_spawn_egg",
            () -> new DeferredSpawnEggItem(CURSES,0xFF0000, 0xFFFFFF, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<JaryuuEntity>> JARYUU = MOBLIST.register("jaryuu",
            () -> EntityType.Builder.of(JaryuuEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":jaryuu"));

    public static final DeferredItem<DeferredSpawnEggItem> JARYUU_SPAWN_EGG = ITEMS.register("jaryuu_spawn_egg",
            () -> new DeferredSpawnEggItem(JARYUU,0xFF0000, 0xFFFFFF, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<RyuuwonEntity>> RYUUWON = MOBLIST.register("ryuuwon",
            () -> EntityType.Builder.of(RyuuwonEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ryuuwon"));

    public static final DeferredItem<DeferredSpawnEggItem> RYUUWON_SPAWN_EGG = ITEMS.register("ryuuwon_spawn_egg",
            () -> new DeferredSpawnEggItem(RYUUWON,0xFF0000, 0xFFFFFF, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<ZubaanEntity>> ZUBAAN = MOBLIST.register("zubaan",
            () -> EntityType.Builder.of(ZubaanEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":zubaan"));

    public static final DeferredItem<DeferredSpawnEggItem> ZUBAAN_SPAWN_EGG = ITEMS.register("zubaan_spawn_egg",
            () -> new DeferredSpawnEggItem(ZUBAAN,0xFF0000, 0xFFFFFF, new Item.Properties()));

    //33 Shinkenger
	public static final DeferredHolder<EntityType<?>, EntityType<NanashisEntity>> NANASHIS = MOBLIST.register("nanashi",
            () -> EntityType.Builder.of(NanashisEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":nanashi"));
    
    public static final DeferredItem<DeferredSpawnEggItem> NANASHIS_SPAWN_EGG = ITEMS.register("nanashi_spawn_egg",
			() -> new DeferredSpawnEggItem(NANASHIS,0xFF0000, 0x000000, new Item.Properties()));
    
	public static final DeferredHolder<EntityType<?>, EntityType<GedouShinkenRedEntity>> GEDOU_SHINKEN_RED = MOBLIST.register("gedou_shinken_red",
            () -> EntityType.Builder.of(GedouShinkenRedEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":gedou_shinken_red"));
    
    public static final DeferredItem<DeferredSpawnEggItem> GEDOU_SHINKEN_RED_SPAWN_EGG = ITEMS.register("gedou_shinken_red_spawn_egg",
			() -> new DeferredSpawnEggItem(GEDOU_SHINKEN_RED,0xFF0000, 0x000000, new Item.Properties()));

	//36 Go-Busters
	public static final DeferredHolder<EntityType<?>, EntityType<BuglersEntity>> BUGLERS = MOBLIST.register("bugler",
			() -> EntityType.Builder.of(BuglersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":bugler"));

	public static final DeferredItem<DeferredSpawnEggItem> BUGLERS_SPAWN_EGG = ITEMS.register("bugler_spawn_egg",
			() -> new DeferredSpawnEggItem(BUGLERS,0xFF0000, 0x888888, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<DarkBusterEntity>> DARK_BUSTER = MOBLIST.register("dark_buster",
			() -> EntityType.Builder.of(DarkBusterEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":dark_buster"));

	public static final DeferredItem<DeferredSpawnEggItem> DARK_BUSTER_SPAWN_EGG = ITEMS.register("dark_buster_spawn_egg",
			() -> new DeferredSpawnEggItem(DARK_BUSTER,0xFF0000, 0x888888, new Item.Properties()));

	//42 LuPat
	public static final DeferredHolder<EntityType<?>, EntityType<PordermenEntity>> PORDERMEN = MOBLIST.register("porderman",
			() -> EntityType.Builder.of(PordermenEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":porderman"));

	public static final DeferredItem<DeferredSpawnEggItem> PORDERMEN_SPAWN_EGG = ITEMS.register("porderman_spawn_egg",
			() -> new DeferredSpawnEggItem(PORDERMEN,0xFF0000, 0xFF0000, new Item.Properties()));


	//43 Ryusoulger
	public static final DeferredHolder<EntityType<?>, EntityType<DrunnsEntity>> DRUNNS = MOBLIST.register("drunn",
            () -> EntityType.Builder.of(DrunnsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":drunn"));
    
    public static final DeferredItem<DeferredSpawnEggItem> DRUNNS_SPAWN_EGG = ITEMS.register("drunn_spawn_egg",
			() -> new DeferredSpawnEggItem(DRUNNS,0xFF0000, 0x00FF00, new Item.Properties()));
    
	public static final DeferredHolder<EntityType<?>, EntityType<GaisoulgEntity>> GAISOULG = MOBLIST.register("gaisoulg",
            () -> EntityType.Builder.of(GaisoulgEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":gaisoulg"));
    
    public static final DeferredItem<DeferredSpawnEggItem> GAISOULG_SPAWN_EGG = ITEMS.register("gaisoulg_spawn_egg",
			() -> new DeferredSpawnEggItem(GAISOULG,0xFF0000, 0x00FF00, new Item.Properties()));
    
	public static final DeferredHolder<EntityType<?>, EntityType<RyusoulMoriaEntity>> RYUSOUL_MORIA = MOBLIST.register("ryusoul_moria",
            () -> EntityType.Builder.of(RyusoulMoriaEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ryusoul_moria"));
    
    public static final DeferredItem<DeferredSpawnEggItem> RYUSOUL_MORIA_SPAWN_EGG = ITEMS.register("ryusoul_moria_spawn_egg",
			() -> new DeferredSpawnEggItem(RYUSOUL_MORIA,0xFF0000, 0x00FF00, new Item.Properties()));

	//47 King-Ohger
	public static final DeferredHolder<EntityType<?>, EntityType<SanagimsEntity>> SANAGIMS = MOBLIST.register("sanagim",
			() -> EntityType.Builder.of(SanagimsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":sanagim"));

	public static final DeferredItem<DeferredSpawnEggItem> SANAGIMS_SPAWN_EGG = ITEMS.register("sanagim_spawn_egg",
			() -> new DeferredSpawnEggItem(SANAGIMS,0xFF0000, 0x000000, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<OhKuwagataOhgerEntity>> OH_KUWAGATA_OHGER = MOBLIST.register("oh_kuwagata_ohger",
			() -> EntityType.Builder.of(OhKuwagataOhgerEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":oh_kuwagata_ohger"));

	public static final DeferredItem<DeferredSpawnEggItem> OH_KUWAGATA_OHGER_SPAWN_EGG = ITEMS.register("oh_kuwagata_ohger_spawn_egg",
			() -> new DeferredSpawnEggItem(OH_KUWAGATA_OHGER,0xFF0000, 0x000000, new Item.Properties()));

	//48 Boonboomger
	public static final DeferredHolder<EntityType<?>, EntityType<NejirettasEntity>> NEJIRETTAS = MOBLIST.register("nejiretta",
			() -> EntityType.Builder.of(NejirettasEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":nejiretta"));

	public static final DeferredItem<DeferredSpawnEggItem> NEJIRETTAS_SPAWN_EGG = ITEMS.register("nejiretta_spawn_egg",
			() -> new DeferredSpawnEggItem(NEJIRETTAS,0xFF0000, 0xFFFFFF, new Item.Properties()));


	//40 Kyuranger
	public static final DeferredHolder<EntityType<?>, EntityType<IndaverBlueEntity>> INDAVER_BLUE = MOBLIST.register("indaver_blue",
			() -> EntityType.Builder.of(IndaverBlueEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":indaver_blue"));
	public static final DeferredItem<DeferredSpawnEggItem> INDAVER_BLUE_SPAWN_EGG = ITEMS.register("indaver_blue_spawn_egg",
			() -> new DeferredSpawnEggItem(INDAVER_BLUE,0xFF0000, 0x0000FF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<IndaverGreenEntity>> INDAVER_GREEN = MOBLIST.register("indaver_green",
			() -> EntityType.Builder.of(IndaverGreenEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":indaver_green"));
	public static final DeferredItem<DeferredSpawnEggItem> INDAVER_GREEN_SPAWN_EGG = ITEMS.register("indaver_green_spawn_egg",
			() -> new DeferredSpawnEggItem(INDAVER_GREEN,0xFF0000, 0x0000FF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<IndaverWhiteEntity>> INDAVER_WHITE = MOBLIST.register("indaver_white",
			() -> EntityType.Builder.of(IndaverWhiteEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":indaver_white"));
	public static final DeferredItem<DeferredSpawnEggItem> INDAVER_WHITE_SPAWN_EGG = ITEMS.register("indaver_white_spawn_egg",
			() -> new DeferredSpawnEggItem(INDAVER_WHITE,0xFF0000, 0x0000FF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<DarkShishiRedEntity>> DARK_SHISHI_RED = MOBLIST.register("dark_shishi_red",
			() -> EntityType.Builder.of(DarkShishiRedEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":dark_shishi_red"));
	public static final DeferredItem<DeferredSpawnEggItem> DARK_SHISHI_RED_SPAWN_EGG = ITEMS.register("dark_shishi_red_spawn_egg",
			() -> new DeferredSpawnEggItem(DARK_SHISHI_RED,0xFF0000, 0x0000FF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<HebitsukaiMetalEntity>> HEBITSUKAI_METAL = MOBLIST.register("hebitsukai_metal",
			() -> EntityType.Builder.of(HebitsukaiMetalEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":hebitsukai_metal"));
	public static final DeferredItem<DeferredSpawnEggItem> HEBITSUKAI_METAL_SPAWN_EGG = ITEMS.register("hebitsukai_metal_spawn_egg",
			() -> new DeferredSpawnEggItem(HEBITSUKAI_METAL,0xFF0000, 0x0000FF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.ally.KyoryugerAllyEntity>> KYORYUGER = MOBLIST.register("kyoryuger",
			() -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.ally.KyoryugerAllyEntity::new, MobCategory.CREATURE).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":kyoryuger"));
	public static final DeferredItem<DeferredSpawnEggItem> KYORYUGER_SPAWN_EGG = ITEMS.register("kyoryuger_spawn_egg",
			() -> new DeferredSpawnEggItem(KYORYUGER,0xFF0000, 0x0000FF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.ally.ExAidAllyEntity>> EX_AID = MOBLIST.register("ex_aid",
			() -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.ally.ExAidAllyEntity::new, MobCategory.CREATURE).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ex_aid"));
	public static final DeferredItem<DeferredSpawnEggItem> EX_AID_SPAWN_EGG = ITEMS.register("ex_aid_spawn_egg",
			() -> new DeferredSpawnEggItem(EX_AID,0xFF0000, 0x0000FF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<KyurangerAllyEntity>> KYURANGER = MOBLIST.register("kyuranger",
			() -> EntityType.Builder.of(KyurangerAllyEntity::new, MobCategory.CREATURE).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":kyuranger"));
	public static final DeferredItem<DeferredSpawnEggItem> KYURANGER_SPAWN_EGG = ITEMS.register("kyuranger_spawn_egg",
			() -> new DeferredSpawnEggItem(KYURANGER,0xFF0000, 0x0000FF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<MechaDarkGearAllyEntity>> MECHA_DARK_GEAR = MOBLIST.register("mecha_dark_gear",
			() -> EntityType.Builder.of(MechaDarkGearAllyEntity::new, MobCategory.CREATURE).sized(0.6F, 1.8F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":mecha_dark_gear"));
	public static final DeferredItem<DeferredSpawnEggItem> MECHA_DARK_GEAR_SPAWN_EGG = ITEMS.register("mecha_dark_gear_spawn_egg",
			() -> new DeferredSpawnEggItem(MECHA_DARK_GEAR,0xFF0000, 0x0000FF, new Item.Properties()));


	public static final DeferredHolder<EntityType<?>, EntityType<GaruBikeEntity>> GARU_BIKE = MOBLIST.register("garu_bike",
			() -> EntityType.Builder.of(GaruBikeEntity::new, MobCategory.CREATURE).sized(0.7964844F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":garu_bike"));
	public static final DeferredItem<DeferredSpawnEggItem> GARU_BIKE_SPAWN_EGG = ITEMS.register("garu_bike_spawn_egg",
			() -> new DeferredSpawnEggItem(GARU_BIKE,0xFF0000, 0x0000FF, new Item.Properties()));

	public static final DeferredHolder<EntityType<?>, EntityType<DeinochaserEntity>> DEINOCHASER = MOBLIST.register("deinochaser",
			() -> EntityType.Builder.of(DeinochaserEntity::new, MobCategory.MISC).sized(1.2F, 1.2F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":deinochaser"));

	public static final DeferredHolder<EntityType<?>, EntityType<DustlersEntity>> DUSTLERS = MOBLIST.register("dustlers",
			() -> EntityType.Builder.of(DustlersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":dustlers"));
	public static final DeferredItem<DeferredSpawnEggItem> DUSTLERS_SPAWN_EGG = ITEMS.register("dustlers_spawn_egg",
			() -> new DeferredSpawnEggItem(DUSTLERS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<SpotmenEntity>> SPOTMEN = MOBLIST.register("spotmen",
			() -> EntityType.Builder.of(SpotmenEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":spotmen"));
	public static final DeferredItem<DeferredSpawnEggItem> SPOTMEN_SPAWN_EGG = ITEMS.register("spotmen_spawn_egg",
			() -> new DeferredSpawnEggItem(SPOTMEN,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<MechaclonesEntity>> MECHACLONES = MOBLIST.register("mechaclones",
			() -> EntityType.Builder.of(MechaclonesEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":mechaclones"));
	public static final DeferredItem<DeferredSpawnEggItem> MECHACLONES_SPAWN_EGG = ITEMS.register("mechaclones_spawn_egg",
			() -> new DeferredSpawnEggItem(MECHACLONES,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<ZolohsEntity>> ZOLOHS = MOBLIST.register("zolohs",
			() -> EntityType.Builder.of(ZolohsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":zolohs"));
	public static final DeferredItem<DeferredSpawnEggItem> ZOLOHS_SPAWN_EGG = ITEMS.register("zolohs_spawn_egg",
			() -> new DeferredSpawnEggItem(ZOLOHS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<JimmersEntity>> JIMMERS = MOBLIST.register("jimmers",
			() -> EntityType.Builder.of(JimmersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":jimmers"));
	public static final DeferredItem<DeferredSpawnEggItem> JIMMERS_SPAWN_EGG = ITEMS.register("jimmers_spawn_egg",
			() -> new DeferredSpawnEggItem(JIMMERS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<GrinamsEntity>> GRINAMS = MOBLIST.register("grinams",
			() -> EntityType.Builder.of(GrinamsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":grinams"));
	public static final DeferredItem<DeferredSpawnEggItem> GRINAMS_SPAWN_EGG = ITEMS.register("grinams_spawn_egg",
			() -> new DeferredSpawnEggItem(GRINAMS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<Golems1Entity>> GOLEMS_1 = MOBLIST.register("golems_1",
			() -> EntityType.Builder.of(Golems1Entity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":golems_1"));
	public static final DeferredItem<DeferredSpawnEggItem> GOLEMS_1_SPAWN_EGG = ITEMS.register("golems_1_spawn_egg",
			() -> new DeferredSpawnEggItem(GOLEMS_1,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<Golems2Entity>> GOLEMS_2 = MOBLIST.register("golems_2",
			() -> EntityType.Builder.of(Golems2Entity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":golems_2"));
	public static final DeferredItem<DeferredSpawnEggItem> GOLEMS_2_SPAWN_EGG = ITEMS.register("golems_2_spawn_egg",
			() -> new DeferredSpawnEggItem(GOLEMS_2,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<CotpotrosEntity>> COTPOTROS = MOBLIST.register("cotpotros",
			() -> EntityType.Builder.of(CotpotrosEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":cotpotros"));
	public static final DeferredItem<DeferredSpawnEggItem> COTPOTROS_SPAWN_EGG = ITEMS.register("cotpotros_spawn_egg",
			() -> new DeferredSpawnEggItem(COTPOTROS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<DorodorosEntity>> DORODOROS = MOBLIST.register("dorodoros",
			() -> EntityType.Builder.of(DorodorosEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":dorodoros"));
	public static final DeferredItem<DeferredSpawnEggItem> DORODOROS_SPAWN_EGG = ITEMS.register("dorodoros_spawn_egg",
			() -> new DeferredSpawnEggItem(DORODOROS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<KunekunesEntity>> KUNEKUNES = MOBLIST.register("kunekunes",
			() -> EntityType.Builder.of(KunekunesEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":kunekunes"));
	public static final DeferredItem<DeferredSpawnEggItem> KUNEKUNES_SPAWN_EGG = ITEMS.register("kunekunes_spawn_egg",
			() -> new DeferredSpawnEggItem(KUNEKUNES,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<BarmiasBlackEntity>> BARMIAS_BLACK = MOBLIST.register("barmias_black",
			() -> EntityType.Builder.of(BarmiasBlackEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":barmias_black"));
	public static final DeferredItem<DeferredSpawnEggItem> BARMIAS_BLACK_SPAWN_EGG = ITEMS.register("barmias_black_spawn_egg",
			() -> new DeferredSpawnEggItem(BARMIAS_BLACK,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<BarmiasWhiteEntity>> BARMIAS_WHITE = MOBLIST.register("barmias_white",
			() -> EntityType.Builder.of(BarmiasWhiteEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":barmias_white"));
	public static final DeferredItem<DeferredSpawnEggItem> BARMIAS_WHITE_SPAWN_EGG = ITEMS.register("barmias_white_spawn_egg",
			() -> new DeferredSpawnEggItem(BARMIAS_WHITE,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<AnaroidsEntity>> ANAROIDS = MOBLIST.register("anaroids",
			() -> EntityType.Builder.of(AnaroidsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":anaroids"));
	public static final DeferredItem<DeferredSpawnEggItem> ANAROIDS_SPAWN_EGG = ITEMS.register("anaroids_spawn_egg",
			() -> new DeferredSpawnEggItem(ANAROIDS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<IgaroidsEntity>> IGAROIDS = MOBLIST.register("igaroids",
			() -> EntityType.Builder.of(IgaroidsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":igaroids"));
	public static final DeferredItem<DeferredSpawnEggItem> IGAROIDS_SPAWN_EGG = ITEMS.register("igaroids_spawn_egg",
			() -> new DeferredSpawnEggItem(IGAROIDS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<BatsuroidsEntity>> BATSUROIDS = MOBLIST.register("batsuroids",
			() -> EntityType.Builder.of(BatsuroidsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":batsuroids"));
	public static final DeferredItem<DeferredSpawnEggItem> BATSUROIDS_SPAWN_EGG = ITEMS.register("batsuroids_spawn_egg",
			() -> new DeferredSpawnEggItem(BATSUROIDS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<KarthsEntity>> KARTHS = MOBLIST.register("karths",
			() -> EntityType.Builder.of(KarthsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":karths"));
	public static final DeferredItem<DeferredSpawnEggItem> KARTHS_SPAWN_EGG = ITEMS.register("karths_spawn_egg",
			() -> new DeferredSpawnEggItem(KARTHS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<RinshisEntity>> RINSHIS = MOBLIST.register("rinshis",
			() -> EntityType.Builder.of(RinshisEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":rinshis"));
	public static final DeferredItem<DeferredSpawnEggItem> RINSHIS_SPAWN_EGG = ITEMS.register("rinshis_spawn_egg",
			() -> new DeferredSpawnEggItem(RINSHIS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<UgatzEntity>> UGATZ = MOBLIST.register("ugatz",
			() -> EntityType.Builder.of(UgatzEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ugatz"));
	public static final DeferredItem<DeferredSpawnEggItem> UGATZ_SPAWN_EGG = ITEMS.register("ugatz_spawn_egg",
			() -> new DeferredSpawnEggItem(UGATZ,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<DroansEntity>> DROANS = MOBLIST.register("droans",
			() -> EntityType.Builder.of(DroansEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":droans"));
	public static final DeferredItem<DeferredSpawnEggItem> DROANS_SPAWN_EGG = ITEMS.register("droans_spawn_egg",
			() -> new DeferredSpawnEggItem(DROANS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<KurosEntity>> KUROS = MOBLIST.register("kuros",
			() -> EntityType.Builder.of(KurosEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":kuros"));
	public static final DeferredItem<DeferredSpawnEggItem> KUROS_SPAWN_EGG = ITEMS.register("kuros_spawn_egg",
			() -> new DeferredSpawnEggItem(KUROS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<MoebasEntity>> MOEBAS = MOBLIST.register("moebas",
			() -> EntityType.Builder.of(MoebasEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":moebas"));
	public static final DeferredItem<DeferredSpawnEggItem> MOEBAS_SPAWN_EGG = ITEMS.register("moebas_spawn_egg",
			() -> new DeferredSpawnEggItem(MOEBAS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<BechatsEntity>> BECHATS = MOBLIST.register("bechats",
			() -> EntityType.Builder.of(BechatsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":bechats"));
	public static final DeferredItem<DeferredSpawnEggItem> BECHATS_SPAWN_EGG = ITEMS.register("bechats_spawn_egg",
			() -> new DeferredSpawnEggItem(BECHATS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<KudakksEntity>> KUDAKKS = MOBLIST.register("kudakks",
			() -> EntityType.Builder.of(KudakksEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":kudakks"));
	public static final DeferredItem<DeferredSpawnEggItem> KUDAKKS_SPAWN_EGG = ITEMS.register("kudakks_spawn_egg",
			() -> new DeferredSpawnEggItem(KUDAKKS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<AnounisEntity>> ANOUNIS = MOBLIST.register("anounis",
			() -> EntityType.Builder.of(AnounisEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":anounis"));
	public static final DeferredItem<DeferredSpawnEggItem> ANOUNIS_SPAWN_EGG = ITEMS.register("anounis_spawn_egg",
			() -> new DeferredSpawnEggItem(ANOUNIS,0xFF0000, 0x0000FF, new Item.Properties()));
	public static final DeferredHolder<EntityType<?>, EntityType<ExplosiveProjectileEntity>> EXPLOSIVE_PROJECTILE =
			MOBLIST.register("explosive_projectile",() -> EntityType.Builder.<ExplosiveProjectileEntity>of(ExplosiveProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":explosive_projectile"));
	
	public static final DeferredHolder<EntityType<?>, EntityType<WeaponProjectileEntity>> WEAPON_PROJECTILE =
			MOBLIST.register("weapon_projectile",() -> EntityType.Builder.<WeaponProjectileEntity>of(WeaponProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":weapon_projectile"));
	
	public static final DeferredHolder<EntityType<?>, EntityType<ShurikenProjectileEntity>> SHURIKEN_PROJECTILE =
			MOBLIST.register("shuriken_projectile",() -> EntityType.Builder.<ShurikenProjectileEntity>of(ShurikenProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":shuriken_projectile"));

	
    // LuPatranger Mechas
    public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.mecha.RedDialFighterEntity>> RED_DIAL_FIGHTER = MOBLIST.register("red_dial_fighter",
            () -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.mecha.RedDialFighterEntity::new, MobCategory.CREATURE).sized(2.0F, 1.5F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":red_dial_fighter"));
    public static final DeferredItem<DeferredSpawnEggItem> RED_DIAL_FIGHTER_SPAWN_EGG = ITEMS.register("red_dial_fighter_spawn_egg",
            () -> new DeferredSpawnEggItem(RED_DIAL_FIGHTER, 0xFF0000, 0xFF0000, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.mecha.BlueDialFighterEntity>> BLUE_DIAL_FIGHTER = MOBLIST.register("blue_dial_fighter",
            () -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.mecha.BlueDialFighterEntity::new, MobCategory.CREATURE).sized(2.0F, 1.5F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":blue_dial_fighter"));
    public static final DeferredItem<DeferredSpawnEggItem> BLUE_DIAL_FIGHTER_SPAWN_EGG = ITEMS.register("blue_dial_fighter_spawn_egg",
            () -> new DeferredSpawnEggItem(BLUE_DIAL_FIGHTER, 0xFF0000, 0xFF0000, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.mecha.YellowDialFighterEntity>> YELLOW_DIAL_FIGHTER = MOBLIST.register("yellow_dial_fighter",
            () -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.mecha.YellowDialFighterEntity::new, MobCategory.CREATURE).sized(2.0F, 1.5F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":yellow_dial_fighter"));
    public static final DeferredItem<DeferredSpawnEggItem> YELLOW_DIAL_FIGHTER_SPAWN_EGG = ITEMS.register("yellow_dial_fighter_spawn_egg",
            () -> new DeferredSpawnEggItem(YELLOW_DIAL_FIGHTER, 0xFF0000, 0xFF0000, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.mecha.IchigouTriggerMachineEntity>> ICHIGO_TRIGGER_MACHINE = MOBLIST.register("ichigo_trigger_machine",
            () -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.mecha.IchigouTriggerMachineEntity::new, MobCategory.CREATURE).sized(3.5F, 2.5F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ichigo_trigger_machine"));
    public static final DeferredItem<DeferredSpawnEggItem> ICHIGO_TRIGGER_MACHINE_SPAWN_EGG = ITEMS.register("ichigo_trigger_machine_spawn_egg",
            () -> new DeferredSpawnEggItem(ICHIGO_TRIGGER_MACHINE, 0xFF0000, 0xFF0000, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.mecha.NigouTriggerMachineEntity>> NIGO_TRIGGER_MACHINE = MOBLIST.register("nigo_trigger_machine",
            () -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.mecha.NigouTriggerMachineEntity::new, MobCategory.CREATURE).sized(3.5F, 2.5F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":nigo_trigger_machine"));
    public static final DeferredItem<DeferredSpawnEggItem> NIGO_TRIGGER_MACHINE_SPAWN_EGG = ITEMS.register("nigo_trigger_machine_spawn_egg",
            () -> new DeferredSpawnEggItem(NIGO_TRIGGER_MACHINE, 0xFF0000, 0xFF0000, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.mecha.SangouTriggerMachineEntity>> SANGOU_TRIGGER_MACHINE = MOBLIST.register("sangou_trigger_machine",
            () -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.mecha.SangouTriggerMachineEntity::new, MobCategory.CREATURE).sized(3.5F, 2.5F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":sangou_trigger_machine"));
    public static final DeferredItem<DeferredSpawnEggItem> SANGOU_TRIGGER_MACHINE_SPAWN_EGG = ITEMS.register("sangou_trigger_machine_spawn_egg",
            () -> new DeferredSpawnEggItem(SANGOU_TRIGGER_MACHINE, 0xFF0000, 0xFF0000, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.mecha.GoodStrikerEntity>> GOOD_STRIKER = MOBLIST.register("good_striker",
            () -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.mecha.GoodStrikerEntity::new, MobCategory.CREATURE).sized(3.5F, 2.5F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":good_striker"));
    public static final DeferredItem<DeferredSpawnEggItem> GOOD_STRIKER_SPAWN_EGG = ITEMS.register("good_striker_spawn_egg",
            () -> new DeferredSpawnEggItem(GOOD_STRIKER, 0xFF0000, 0xFF0000, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.mecha.LupinKaiserEntity>> LUPIN_KAISER = MOBLIST.register("lupinkaiser",
            () -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.mecha.LupinKaiserEntity::new, MobCategory.CREATURE).sized(12.5F, 30.0F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":lupinkaiser"));
    public static final DeferredItem<DeferredSpawnEggItem> LUPIN_KAISER_SPAWN_EGG = ITEMS.register("lupinkaiser_spawn_egg",
            () -> new DeferredSpawnEggItem(LUPIN_KAISER, 0xFF0000, 0xFF0000, new Item.Properties()));

    public static final DeferredHolder<EntityType<?>, EntityType<com.liasdan.supersentaicraft.entity.mecha.PatKaiserEntity>> PAT_KAISER = MOBLIST.register("patkaiser",
            () -> EntityType.Builder.of(com.liasdan.supersentaicraft.entity.mecha.PatKaiserEntity::new, MobCategory.CREATURE).sized(12.5F, 30.0F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":patkaiser"));
    public static final DeferredItem<DeferredSpawnEggItem> PAT_KAISER_SPAWN_EGG = ITEMS.register("patkaiser_spawn_egg",
            () -> new DeferredSpawnEggItem(PAT_KAISER, 0xFF0000, 0xFF0000, new Item.Properties()));

    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
