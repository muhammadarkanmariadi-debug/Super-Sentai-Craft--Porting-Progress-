package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.blocks.machine.BoonboomCarProgrammer;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.boonboomger.ZoonzoomShokaBlasterItem;
import com.liasdan.supersentaicraft.items.gozyuger.TegaSwordItem;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BoonboomgerItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> BOONBOOMGER_LOGO = ITEMS.register("boonboomger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER));

	public static final DeferredItem<Item> BOONBOOM_TRAILER = ITEMS.register("boonboom_trailer",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER));

	public static final DeferredItem<Item> BOONBOOM_SUPER_CAR = ITEMS.register("boonboom_super_car",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","bun_red","boonboomger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.AddToTabList(RangerTabs.BOONBOOMGER).AddToList(BoonboomCarProgrammer.BOONBOOM_CAR,25));

	public static final DeferredItem<Item> BOONBOOM_OFFROAD = ITEMS.register("boonboom_offroad",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","bun_blue","boonboomger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.AddToTabList(RangerTabs.BOONBOOMGER).AddToList(BoonboomCarProgrammer.BOONBOOM_CAR,25));

	public static final DeferredItem<Item> BOONBOOM_WAGON = ITEMS.register("boonboom_wagon",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","bun_pink","boonboomger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.AddToTabList(RangerTabs.BOONBOOMGER).AddToList(BoonboomCarProgrammer.BOONBOOM_CAR,25));

	public static final DeferredItem<Item> BOONBOOM_PATCAR_1 = ITEMS.register("boonboom_patcar_1",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","bun_black","boonboomger_belt_2",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.AddToTabList(RangerTabs.BOONBOOMGER).AddToList(BoonboomCarProgrammer.BOONBOOM_CAR,25));

	public static final DeferredItem<Item> BOONBOOM_PATCAR_2 = ITEMS.register("boonboom_patcar_2",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).AddToList(BoonboomCarProgrammer.BOONBOOM_CAR,15));

	public static final DeferredItem<Item> BOONBOOM_SHOVEL = ITEMS.register("boonboom_shovel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","bun_orange","boonboomger_belt_2",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.AddToTabList(RangerTabs.BOONBOOMGER).AddToList(BoonboomCarProgrammer.BOONBOOM_CAR,25));

	public static final DeferredItem<Item> BOONBOOM_DOZER = ITEMS.register("boonboom_dozer",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).AddToList(BoonboomCarProgrammer.BOONBOOM_CAR,15));

	public static final DeferredItem<Item> BYUNBYUM_MACH = ITEMS.register("byunbyum_mach",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","bun_violet","bun_violet_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.AddToTabList(RangerTabs.BOONBOOMGER).AddToList(BoonboomCarProgrammer.BOONBOOM_CAR,20));

	public static final DeferredItem<Item> BUN_BLACK_110 = ITEMS.register("bun_black_110",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_110","bun_black","boonboomger_belt_2",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)));

	public static final DeferredItem<Item> BUN_BLUE_007 = ITEMS.register("bun_blue_007",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_007","bun_blue","boonboomger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.addAlternative(BUN_BLACK_110.get()).ChangeBeltModel("geo/rangerbeltchanger.geo.json"));

	public static final DeferredItem<Item> BUN_RED_119 = ITEMS.register("bun_red_119",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_119","bun_red","boonboomger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.addAlternative(BUN_BLUE_007.get()).ChangeBeltModel("geo/rangerbeltchanger.geo.json"));

	public static final DeferredItem<Item> CHAMPION_CHANGER_3 = ITEMS.register("champion_changer_3",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_champion","bun_violet","bun_violet_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)));

	public static final DeferredItem<Item> CHAMPION_CHANGER_2 = ITEMS.register("champion_changer_2",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_champion","bun_black","boonboomger_belt_2",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.AddCompatibilityList(new String[] {"bun_orange"}).addAlternative(CHAMPION_CHANGER_3.get()));

	public static final DeferredItem<Item> CHAMPION_CHANGER = ITEMS.register("champion_changer",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_champion","bun_red","boonboomger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.AddCompatibilityList(new String[] {"bun_blue","bun_pink"}).addAlternative(CHAMPION_CHANGER_2.get()).AddToTabList(RangerTabs.BOONBOOMGER));
	
	public static final DeferredItem<Item> BOONBOOMGER_HELMET = ITEMS.register("boonboomger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));
    public static final DeferredItem<Item> BOONBOOMGER_CHESTPLATE = ITEMS.register("boonboomger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));
    public static final DeferredItem<Item> BOONBOOMGER_LEGGINGS = ITEMS.register("boonboomger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));

    public static final DeferredItem<Item> RED_BOONBOOM_CHANGER = ITEMS.register("red_boonboom_changer",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"bun_red",BOONBOOM_SUPER_CAR,BOONBOOMGER_HELMET,BOONBOOMGER_CHESTPLATE,BOONBOOMGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));
	public static final DeferredItem<Item> BLUE_BOONBOOM_CHANGER = ITEMS.register("blue_boonboom_changer",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"bun_blue",BOONBOOM_OFFROAD,BOONBOOMGER_HELMET,BOONBOOMGER_CHESTPLATE,BOONBOOMGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));
	public static final DeferredItem<Item> PINK_BOONBOOM_CHANGER = ITEMS.register("pink_boonboom_changer",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"bun_pink",BOONBOOM_WAGON,BOONBOOMGER_HELMET,BOONBOOMGER_CHESTPLATE,BOONBOOMGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));
	public static final DeferredItem<Item> BLACK_BOONBOOM_BOOSTER = ITEMS.register("black_boonboom_booster",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"bun_black",BOONBOOM_PATCAR_1,BOONBOOMGER_HELMET,BOONBOOMGER_CHESTPLATE,BOONBOOMGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));
	public static final DeferredItem<Item> ORANGE_BOONBOOM_BOOSTER = ITEMS.register("orange_boonboom_booster",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"bun_orange",BOONBOOM_SHOVEL,BOONBOOMGER_HELMET,BOONBOOMGER_CHESTPLATE,BOONBOOMGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));
	public static final DeferredItem<Item> VIOLET_BOONBOOM_CONTROLLER = ITEMS.register("violet_boonboom_controller",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"bun_violet",BYUNBYUM_MACH,BOONBOOMGER_HELMET,BOONBOOMGER_CHESTPLATE,BOONBOOMGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));

	public static final DeferredItem<BaseBlasterItem> BOONBOOM_HANDLE = ITEMS.register("boonboom_handle_sword",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));
	public static final DeferredItem<SwordItem> BOONBOOM_CHANGE_AXE = ITEMS.register("boonboom_change_axe",
			() -> new BaseDualSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsDualWeapon().AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));
	public static final DeferredItem<BaseBlasterItem> BOONBOOM_CONTROLLER = ITEMS.register("boonboom_controller_bowgun",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));

	public static final DeferredItem<BaseBlasterItem> ZOONZOOM_SHOKA_BLASTER = ITEMS.register("zoonzoom_shoka_blaster",
			() -> new ZoonzoomShokaBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BOONBOOMGER).ChangeRepairItem(BOONBOOM_TRAILER.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}