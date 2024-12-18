package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.gaoranger.goranger.GBracePhoneItem;
import com.liasdan.supersentaicraft.items.gaoranger.goranger.GPhoneItem;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sun_vulcan.VulcanBraceItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GaorangerItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

	public static final DeferredItem<Item> GAORANGER_LOGO = ITEMS.register("gaoranger_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GAORANGER));
    
	public static final DeferredItem<Item> EMPTY_GAO_JEWEL = ITEMS.register("empty_gao_jewel",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_LION_JEWEL = ITEMS.register("gao_lion_jewel",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_red","gao_red_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_EAGLE_JEWEL = ITEMS.register("gao_eagle_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_yellow","gao_yellow_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_SHARK_JEWEL = ITEMS.register("gao_shark_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_blue","gao_blue_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 0,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_BISON_JEWEL = ITEMS.register("gao_bison_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_black","gao_black_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_TIGER_JEWEL = ITEMS.register("gao_tiger_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_white","gao_white_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAO_WOLF_JEWEL = ITEMS.register("gao_wolf_jewel",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_silver","gao_silver_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("geo/rangerbeltweapon.geo.json").AddToTabList(RangerTabs.GAORANGER));

	public static final DeferredItem<Item> GAORANGER_HELMET = ITEMS.register("gaoranger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
    public static final DeferredItem<Item> GAORANGER_CHESTPLATE = ITEMS.register("gaoranger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
    public static final DeferredItem<Item> GAORANGER_LEGGINGS = ITEMS.register("gaoranger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
    
    public static final DeferredItem<Item> RED_G_PHONE = ITEMS.register("red_g_phone",
    		() -> new GPhoneItem(ArmorMaterials.DIAMOND,"gao_red", GAO_LION_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<Item> YELLOW_G_PHONE = ITEMS.register("yellow_g_phone",
			() -> new GPhoneItem(ArmorMaterials.DIAMOND,"gao_yellow", GAO_EAGLE_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<Item> BLUE_G_PHONE = ITEMS.register("blue_g_phone",
			() -> new GPhoneItem(ArmorMaterials.DIAMOND,"gao_blue", GAO_SHARK_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<Item> BLACK_G_PHONE = ITEMS.register("black_g_phone",
			() -> new GPhoneItem(ArmorMaterials.DIAMOND,"gao_black", GAO_BISON_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<Item> WHITE_G_PHONE = ITEMS.register("white_g_phone",
			() -> new GPhoneItem(ArmorMaterials.DIAMOND,"gao_white", GAO_TIGER_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<Item> G_BRACE_PHONE = ITEMS.register("g_brace_phone",
			() -> new GBracePhoneItem(ArmorMaterials.DIAMOND,"gao_silver", GAO_WOLF_JEWEL, GAORANGER_HELMET, GAORANGER_CHESTPLATE, GAORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

    public static final DeferredItem<SwordItem> JUUOUKEN = ITEMS.register("beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> JUUOUKEN_LION = ITEMS.register("lion_beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> JUUOUKEN_EAGLE = ITEMS.register("eagle_beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> JUUOUKEN_SHARK = ITEMS.register("shark_beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> JUUOUKEN_BISON = ITEMS.register("bison_beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> JUUOUKEN_TIGER = ITEMS.register("tiger_beast_king_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> LION_FANG = ITEMS.register("lion_fang",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> LION_FANG_CLAW = ITEMS.register("lion_fang_claw",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));
	public static final DeferredItem<SwordItem> LION_FANG_CLAW1 = ITEMS.register("lion_fang_claw1",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<BaseBlasterItem> GAO_MANE_BUSTER = ITEMS.register("gao_mane_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).IsChargeWeapon().AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> EAGLE_SWORD = ITEMS.register("eagle_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> SHARK_CUTTER = ITEMS.register("shark_cutter",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> BISON_AXE = ITEMS.register("bison_axe",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> TIGER_BATON = ITEMS.register("tiger_baton",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<SwordItem> HAJA_HYAKUJUUKEN = ITEMS.register("evil_crushing_hundred_beast_sword",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<BaseBlasterItem> GAO_HUSTLER_ROD = ITEMS.register("gao_hustler_rod",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<BaseBlasterItem> FALCON_SUMMONER = ITEMS.register("falcon_summoner",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).IsChargeWeapon().AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(EMPTY_GAO_JEWEL.get()));

	public static final DeferredItem<Item> GAO_KING = ITEMS.register("gao_king",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gao_king", "blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)));

	public static final DeferredItem<Item> GAO_KING_BOOTS = ITEMS.register("gao_king_boots",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<Item> GAO_KING_LEGGINGS = ITEMS.register("gao_king_legs",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<Item> GAO_KING_CHESTPLATE = ITEMS.register("gao_king_torso",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

    public static final DeferredItem<Item> GAO_KING_HELMET = ITEMS.register("gao_king_head",
            () -> new MechaGattaiItem(ArmorMaterials.NETHERITE,"gao_king",GAO_KING,GAO_KING_CHESTPLATE,GAO_KING_LEGGINGS,GAO_KING_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

//    public static final DeferredItem<SwordItem> TAIYO_KEN = ITEMS.register("taiyo_ken",
//			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
//    public static final DeferredItem<BaseShieldItem> VUL_SHIELD = ITEMS.register("vul_shield",
//			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.GAORANGER).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}