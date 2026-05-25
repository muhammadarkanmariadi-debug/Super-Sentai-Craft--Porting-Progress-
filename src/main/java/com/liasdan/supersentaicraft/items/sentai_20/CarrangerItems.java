package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.sentai_20.carranger.AccelChangerItem;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class CarrangerItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> CARRANGER_LOGO = ITEMS.register("carranger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.CARRANGER));

	public static final DeferredItem<Item> RED_RACER_BADGE = ITEMS.register("red_racer_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","red_racer","carranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.CARRANGER));

	public static final DeferredItem<Item> BLUE_RACER_BADGE = ITEMS.register("blue_racer_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","blue_racer","carranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.CARRANGER));

	public static final DeferredItem<Item> GREEN_RACER_BADGE = ITEMS.register("green_racer_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","green_racer","carranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.CARRANGER));

	public static final DeferredItem<Item> YELLOW_RACER_BADGE = ITEMS.register("yellow_racer_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","yellow_racer","carranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.CARRANGER));

	public static final DeferredItem<Item> PINK_RACER_BADGE = ITEMS.register("pink_racer_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","pink_racer","carranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
					.ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.CARRANGER));

	public static final DeferredItem<Item> WHITE_RACER_BADGE = ITEMS.register("white_racer_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","white_racer","white_racer_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false))
			.SetShowUnder().AddToTabList(RangerTabs.CARRANGER));

	public static final DeferredItem<Item> SIGNALMAN_BADGE = ITEMS.register("signalman_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","signalman","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RangerTabs.CARRANGER));

	public static final DeferredItem<Item> VRV_MASTER_BADGE = ITEMS.register("vrv_master_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","vrv_master","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).AddToTabList(RangerTabs.CARRANGER));

	public static final DeferredItem<Item> CARRANGER_HELMET = ITEMS.register("carranger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
    public static final DeferredItem<Item> CARRANGER_CHESTPLATE = ITEMS.register("carranger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
    public static final DeferredItem<Item> CARRANGER_LEGGINGS = ITEMS.register("carranger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
    
    public static final DeferredItem<Item> RED_ACCEL_CHANGER = ITEMS.register("red_accel_changer",
    		() -> new AccelChangerItem(ArmorMaterials.DIAMOND,"red_racer",RED_RACER_BADGE,CARRANGER_HELMET,CARRANGER_CHESTPLATE,CARRANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<Item> BLUE_ACCEL_CHANGER = ITEMS.register("blue_accel_changer",
			() -> new AccelChangerItem(ArmorMaterials.DIAMOND,"blue_racer",BLUE_RACER_BADGE,CARRANGER_HELMET,CARRANGER_CHESTPLATE,CARRANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<Item> GREEN_ACCEL_CHANGER = ITEMS.register("green_accel_changer",
			() -> new AccelChangerItem(ArmorMaterials.DIAMOND,"green_racer",GREEN_RACER_BADGE,CARRANGER_HELMET,CARRANGER_CHESTPLATE,CARRANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<Item> YELLOW_ACCEL_CHANGER = ITEMS.register("yellow_accel_changer",
			() -> new AccelChangerItem(ArmorMaterials.DIAMOND,"yellow_racer",YELLOW_RACER_BADGE,CARRANGER_HELMET,CARRANGER_CHESTPLATE,CARRANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<Item> PINK_ACCEL_CHANGER = ITEMS.register("pink_accel_changer",
			() -> new AccelChangerItem(ArmorMaterials.DIAMOND,"pink_racer",PINK_RACER_BADGE,CARRANGER_HELMET,CARRANGER_CHESTPLATE,CARRANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<Item> WHITE_RACER_WAND = ITEMS.register("white_racer_changer",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND, "white_racer",WHITE_RACER_BADGE,CARRANGER_HELMET,CARRANGER_CHESTPLATE,CARRANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));

	public static final DeferredItem<Item> SIGNAL_WHISTLE = ITEMS.register("signal_whistle",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND, "signalman",SIGNALMAN_BADGE,CARRANGER_HELMET,CARRANGER_CHESTPLATE,CARRANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<Item> SIGNAL_WHISTLE_EVIL = ITEMS.register("signal_whistle_evil",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND, "signalman_evil",SIGNALMAN_BADGE,CARRANGER_HELMET,CARRANGER_CHESTPLATE,CARRANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<Item> VRV_MODULE = ITEMS.register("vrv_module",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND, "vrv_master",VRV_MASTER_BADGE,CARRANGER_HELMET,CARRANGER_CHESTPLATE,CARRANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));

	public static final DeferredItem<BaseBlasterItem> AUTO_BLASTER = ITEMS.register("auto_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).IsChargeWeapon().AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<SwordItem> VI_BLADE = ITEMS.register("vi_blade",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));

	public static final DeferredItem<SwordItem> FENDER_SWORD = ITEMS.register("fender_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> MUFFLER_GUN = ITEMS.register("muffler_gun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> ENGINE_CANNON = ITEMS.register("engine_cannon",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.LARGE_FIREBALL).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<SwordItem> SIDE_KNUCKLE = ITEMS.register("side_knuckle",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> BUMPER_BOW = ITEMS.register("bumper_bow",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));

	public static final DeferredItem<BaseBlasterItem> NAVIC_SHOT = ITEMS.register("navic_shot",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> NAVIC_BLASTER = ITEMS.register("navic_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).KeepDifItem(NAVIC_SHOT.get()).AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));

	public static final DeferredItem<BaseBlasterItem> SIGNAIZER = ITEMS.register("signaizer",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.CARRANGER).ChangeRepairItem(CARRANGER_LOGO.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}