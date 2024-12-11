package com.liasdan.supersentaicraft.entity;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.entity.boss.GaisoulgEntity;
import com.liasdan.supersentaicraft.entity.boss.GedouShinkenRedEntity;
import com.liasdan.supersentaicraft.entity.boss.RyusoulMoriaEntity;
import com.liasdan.supersentaicraft.entity.footsoldier.*;
import com.liasdan.supersentaicraft.entity.projectile.ExplosiveProjectileEntity;
import com.liasdan.supersentaicraft.entity.projectile.ShurikenProjectileEntity;
import com.liasdan.supersentaicraft.entity.projectile.WeaponProjectileEntity;

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
	
	//01 Goranger
	public static final DeferredHolder<EntityType<?>, EntityType<ZoldersEntity>> ZOLDERS = MOBLIST.register("zolder",
            () -> EntityType.Builder.of(ZoldersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":zolder"));
    
    public static final DeferredItem<DeferredSpawnEggItem> ZOLDERS_SPAWN_EGG = ITEMS.register("zolder_spawn_egg",
            () -> new DeferredSpawnEggItem(ZOLDERS, 0x121212, 0xa1a1a1, new Item.Properties()));

	//02 JAKQ
	public static final DeferredHolder<EntityType<?>, EntityType<CrimersEntity>> CRIMERS = MOBLIST.register("crimer",
			() -> EntityType.Builder.of(CrimersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":crimer"));

	public static final DeferredItem<DeferredSpawnEggItem> CRIMERS_SPAWN_EGG = ITEMS.register("crimer_spawn_egg",
			() -> new DeferredSpawnEggItem(CRIMERS, 0x878583, 0x121212, new Item.Properties()));

	//05 Sun Vulcan
	public static final DeferredHolder<EntityType<?>, EntityType<MachinemenEntity>> MACHINEMEN = MOBLIST.register("machineman",
			() -> EntityType.Builder.of(MachinemenEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":machineman"));

	public static final DeferredItem<DeferredSpawnEggItem> MACHINEMEN_SPAWN_EGG = ITEMS.register("machineman_spawn_egg",
			() -> new DeferredSpawnEggItem(MACHINEMEN, 0x121212, 0xb81200, new Item.Properties()));

	//11 Maskman
	public static final DeferredHolder<EntityType<?>, EntityType<UnglersEntity>> UNGLERS = MOBLIST.register("ungler",
            () -> EntityType.Builder.of(UnglersEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ungler"));
    
    public static final DeferredItem<DeferredSpawnEggItem> UNGLERS_SPAWN_EGG = ITEMS.register("ungler_spawn_egg",
            () -> new DeferredSpawnEggItem(UNGLERS, 0x121212, 0xdcc568, new Item.Properties()));

    //22 Gingaman
	public static final DeferredHolder<EntityType<?>, EntityType<YartotsEntity>> YARTOTS = MOBLIST.register("yartots",
            () -> EntityType.Builder.of(YartotsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":yartots"));
    
    public static final DeferredItem<DeferredSpawnEggItem> YARTOTS_SPAWN_EGG = ITEMS.register("yartots_spawn_egg",
            () -> new DeferredSpawnEggItem(YARTOTS, 0xde7002, 0x2e1100, new Item.Properties()));

    //33 Shinkenger
	public static final DeferredHolder<EntityType<?>, EntityType<NanashisEntity>> NANASHIS = MOBLIST.register("nanashi",
            () -> EntityType.Builder.of(NanashisEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":nanashi"));
    
    public static final DeferredItem<DeferredSpawnEggItem> NANASHIS_SPAWN_EGG = ITEMS.register("nanashi_spawn_egg",
            () -> new DeferredSpawnEggItem(NANASHIS, 0xd6ba00, 0xa61a0b, new Item.Properties()));
    
	public static final DeferredHolder<EntityType<?>, EntityType<GedouShinkenRedEntity>> GEDOU_SHINKEN_RED = MOBLIST.register("gedou_shinken_red",
            () -> EntityType.Builder.of(GedouShinkenRedEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":gedou_shinken_red"));
    
    public static final DeferredItem<DeferredSpawnEggItem> GEDOU_SHINKEN_RED_SPAWN_EGG = ITEMS.register("gedou_shinken_red_spawn_egg",
            () -> new DeferredSpawnEggItem(GEDOU_SHINKEN_RED, 0x0f0f0f, 0xf00000, new Item.Properties()));

    //33 Shinkenger
	public static final DeferredHolder<EntityType<?>, EntityType<DrunnsEntity>> DRUNNS = MOBLIST.register("drunn",
            () -> EntityType.Builder.of(DrunnsEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":drunn"));
    
    public static final DeferredItem<DeferredSpawnEggItem> DRUNNS_SPAWN_EGG = ITEMS.register("drunn_spawn_egg",
            () -> new DeferredSpawnEggItem(DRUNNS, 0xbfbcb9, 0xc1a800, new Item.Properties()));
    
	public static final DeferredHolder<EntityType<?>, EntityType<GaisoulgEntity>> GAISOULG = MOBLIST.register("gaisoulg",
            () -> EntityType.Builder.of(GaisoulgEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":gaisoulg"));
    
    public static final DeferredItem<DeferredSpawnEggItem> GAISOULG_SPAWN_EGG = ITEMS.register("gaisoulg_spawn_egg",
            () -> new DeferredSpawnEggItem(GAISOULG, 0x56007f, 0x9c9c9c, new Item.Properties()));
    
	public static final DeferredHolder<EntityType<?>, EntityType<RyusoulMoriaEntity>> RYUSOUL_MORIA = MOBLIST.register("ryusoul_moria",
            () -> EntityType.Builder.of(RyusoulMoriaEntity::new, MobCategory.MONSTER).sized(0.6F, 1.95F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":ryusoul_moria"));
    
    public static final DeferredItem<DeferredSpawnEggItem> RYUSOUL_MORIA_SPAWN_EGG = ITEMS.register("ryusoul_moria_spawn_egg",
            () -> new DeferredSpawnEggItem(RYUSOUL_MORIA, 0x795548, 0x416e26, new Item.Properties()));
 
    
	public static final DeferredHolder<EntityType<?>, EntityType<ExplosiveProjectileEntity>> EXPLOSIVE_PROJECTILE =
			MOBLIST.register("explosive_projectile",() -> EntityType.Builder.<ExplosiveProjectileEntity>of(ExplosiveProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":explosive_projectile"));
	
	public static final DeferredHolder<EntityType<?>, EntityType<WeaponProjectileEntity>> WEAPON_PROJECTILE =
			MOBLIST.register("weapon_projectile",() -> EntityType.Builder.<WeaponProjectileEntity>of(WeaponProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":weapon_projectile"));
	
	public static final DeferredHolder<EntityType<?>, EntityType<ShurikenProjectileEntity>> SHURIKEN_PROJECTILE =
			MOBLIST.register("shuriken_projectile",() -> EntityType.Builder.<ShurikenProjectileEntity>of(ShurikenProjectileEntity::new, MobCategory.MISC)
					.sized(1F, 1F).clientTrackingRange(8).build(SuperSentaiCraftCore.MODID + ":shuriken_projectile"));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
