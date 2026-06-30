package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_20.turboranger.TurboBraceItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TurborangerItems {

	public static String[] TURBORANGER = new String[] {"red_turbo","black_turbo","blue_turbo","yellow_turbo","pink_turbo"};

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> TURBORANGER_LOGO = ITEMS.register("turboranger_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_powerless","red_turbo","turboranger_belt",
					new MobEffectInstance(MobEffects.WEAKNESS, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 1,true,false)).AddCompatibilityList(TURBORANGER).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> RED_TURBO_LOGO = ITEMS.register("red_turbo_logo",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","red_turbo","red_turbo_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> BLACK_TURBO_LOGO = ITEMS.register("black_turbo_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","black_turbo","black_turbo_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> BLUE_TURBO_LOGO = ITEMS.register("blue_turbo_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","blue_turbo","blue_turbo_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> YELLOW_TURBO_LOGO = ITEMS.register("yellow_turbo_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","yellow_turbo","yellow_turbo_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> PINK_TURBO_LOGO = ITEMS.register("pink_turbo_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","pink_turbo","pink_turbo_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> TURBORANGER_HELMET = ITEMS.register("turboranger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
    public static final DeferredItem<Item> TURBORANGER_CHESTPLATE = ITEMS.register("turboranger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
    public static final DeferredItem<Item> TURBORANGER_LEGGINGS = ITEMS.register("turboranger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
    
    public static final DeferredItem<Item> RED_TURBO_BRACE = ITEMS.register("red_turbo_brace",
    		() -> new TurboBraceItem(ArmorMaterials.DIAMOND,"red_turbo",RED_TURBO_LOGO,TURBORANGER_HELMET,TURBORANGER_CHESTPLATE,TURBORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<Item> BLACK_TURBO_BRACE = ITEMS.register("black_turbo_brace",
			() -> new TurboBraceItem(ArmorMaterials.DIAMOND,"black_turbo",BLACK_TURBO_LOGO,TURBORANGER_HELMET,TURBORANGER_CHESTPLATE,TURBORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<Item> BLUE_TURBO_BRACE = ITEMS.register("blue_turbo_brace",
			() -> new TurboBraceItem(ArmorMaterials.DIAMOND,"blue_turbo",BLUE_TURBO_LOGO,TURBORANGER_HELMET,TURBORANGER_CHESTPLATE,TURBORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<Item> YELLOW_TURBO_BRACE = ITEMS.register("yellow_turbo_brace",
			() -> new TurboBraceItem(ArmorMaterials.DIAMOND,"yellow_turbo",YELLOW_TURBO_LOGO,TURBORANGER_HELMET,TURBORANGER_CHESTPLATE,TURBORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<Item> PINK_TURBO_BRACE = ITEMS.register("pink_turbo_brace",
			() -> new TurboBraceItem(ArmorMaterials.DIAMOND,"pink_turbo",PINK_TURBO_LOGO,TURBORANGER_HELMET,TURBORANGER_CHESTPLATE,TURBORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));

    public static final DeferredItem<BaseBlasterItem> TURBO_LASER = ITEMS.register("turbo_laser_gun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
    public static final DeferredItem<SwordItem> TURBO_LASER_SWORD = ITEMS.register("turbo_laser_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));

	public static final DeferredItem<SwordItem> GT_SWORD = ITEMS.register("gt_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<SwordItem> T_HAMMER = ITEMS.register("t_hammer",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> J_GUN = ITEMS.register("j_gun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> B_BOWGUN = ITEMS.register("b_bowgun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<SwordItem> W_STICK = ITEMS.register("w_stick",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));

	public static final DeferredItem<BaseBlasterItem> TURBO_LASER_GT = ITEMS.register("turbo_laser_gt",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(TURBO_LASER.get()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> TURBO_LASER_T = ITEMS.register("turbo_laser_t",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(TURBO_LASER.get()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> TURBO_LASER_J = ITEMS.register("turbo_laser_j",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(TURBO_LASER.get()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> TURBO_LASER_B = ITEMS.register("turbo_laser_b",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(TURBO_LASER.get()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<BaseBlasterItem> TURBO_LASER_W = ITEMS.register("turbo_laser_w",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().KeepDifItem(TURBO_LASER.get()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));


	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}