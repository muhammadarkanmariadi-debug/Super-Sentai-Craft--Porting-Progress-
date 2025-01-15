package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.lupatranger.VSChangerItem;
import com.liasdan.supersentaicraft.items.lupatranger.VSVehicleItem;
import com.liasdan.supersentaicraft.items.lupatranger.XChangerItem;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class LuPatRangerItems {

	public static String[] LUPAT= new String[] {"lupin_red","lupin_blue","lupin_yellow","patren_1gou","patren_2gou","patren_3gou"
			,"ryusoul_red","ryusoul_blue","ryusoul_pink","ryusoul_green","ryusoul_black","ryusoul_gold"};
	public static String[] LUPINRANGER= new String[] {"lupin_red","lupin_blue","lupin_yellow"};
	public static String[] PATRANGER= new String[] {"patren_1gou","patren_2gou","patren_3gou"};

	public static String[] LUPINSOUL= new String[] {"lupin_red","lupin_blue","lupin_yellow","ryusoul_red","ryusoul_blue","ryusoul_pink","ryusoul_green","ryusoul_black","ryusoul_gold"};
	public static String[] PATRENSOUL= new String[] {"patren_1gou","patren_2gou","patren_3gou","ryusoul_red","ryusoul_blue","ryusoul_pink","ryusoul_green","ryusoul_black","ryusoul_gold"};

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

	public static final DeferredItem<Item> LUPAT_LOGO = ITEMS.register("lupat_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> LUPINRANGER_LOGO = ITEMS.register("lupinranger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LUPATRANGER));
	public static final DeferredItem<Item> PATRANGER_LOGO = ITEMS.register("patranger_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LUPATRANGER));
    
	public static final DeferredItem<Item> BLANK_STRIKER = ITEMS.register("blank_striker",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> RED_DIAL_FIGHTER = ITEMS.register("red_dial_fighter",
            () -> new VSVehicleItem(new Item.Properties(),0,"","lupin_red","lupinranger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
					.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeModel("geo/black_knight.geo.json").AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> BLUE_DIAL_FIGHTER = ITEMS.register("blue_dial_fighter",
			() -> new VSVehicleItem(new Item.Properties(),0,"","lupin_blue","lupinranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
					.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeModel("geo/black_knight.geo.json").AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> YELLOW_DIAL_FIGHTER = ITEMS.register("yellow_dial_fighter",
			() -> new VSVehicleItem(new Item.Properties(),0,"","lupin_yellow","lupinranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
					.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeModel("geo/black_knight.geo.json").AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> TRIGGER_MACHINE_ICHIGOU = ITEMS.register("ichigou_trigger_machine",
			() -> new VSVehicleItem(new Item.Properties(),0,"","patren_1gou","patren_1gou_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
					.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> TRIGGER_MACHINE_NIGOU = ITEMS.register("nigou_trigger_machine",
			() -> new VSVehicleItem(new Item.Properties(),0,"","patren_2gou","patren_2gou_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
					.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> TRIGGER_MACHINE_SANGOU = ITEMS.register("sangou_trigger_machine",
			() -> new VSVehicleItem(new Item.Properties(),0,"","patren_3gou","patren_3gou_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
					.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> X_TRAIN_SILVER = ITEMS.register("silver_x_train",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","lupin_x","lupin_x_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 3,true,false)).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> X_TRAIN_GOLD_LUPAT = ITEMS.register("gold_x_train_lupat",
			() -> new VSVehicleItem(new Item.Properties(),0,"lupat_gold","lupin_red","blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false))
					.ChangeSlot(2).AddCompatibilityList(LUPAT));

	public static final DeferredItem<Item> X_TRAIN_GOLD = ITEMS.register("gold_x_train",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","lupin_x","lupinranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 3,true,false))
					.addAlternative(X_TRAIN_GOLD_LUPAT.get()).ChangeRangerName("patren_x").AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> GOOD_STRIKER = ITEMS.register("good_striker",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_ugou","patren_1gou","patren_1gou_belt",
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 3,true,false))
					.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).AddCompatibilityList(PATRANGER).ChangeRangerName("patren").AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> JACKPOT_STRIKER = ITEMS.register("jackpot_striker",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_tricolor","lupin_red","lupinranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 3,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 3,true,false))
					.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).AddCompatibilityList(LUPINRANGER).ChangeRangerName("lupin").ChangeModel("geo/black_knight.geo.json").AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> SCISSOR_DIAL_FIGHTER = ITEMS.register("scissor_dial_fighter",
			() -> new VSVehicleItem(new Item.Properties(),0,"lupat_scissor","lupin_red","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false))
					.ChangeSlot(2).BackToBase().ChangeModel("geo/rangerwing.geo.json").AddCompatibilityList(LUPAT).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> MAGIC_DIAL_FIGHTER = ITEMS.register("magic_dial_fighter",
			() -> new VSVehicleItem(new Item.Properties(),0,"lupat_magic","lupin_red","blank",
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.EXPLOSIONSHOT, 40, 0,true,false))
					.ChangeSlot(2).BackToBase().AddCompatibilityList(LUPAT).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> TRIGGER_MACHINE_CRANE = ITEMS.register("crane_trigger_machine",
			() -> new VSVehicleItem(new Item.Properties(),0,"lupat_crane","lupin_red","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false))
					.ChangeSlot(2).BackToBase().AddCompatibilityList(LUPAT).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> TRIGGER_MACHINE_SPLASH = ITEMS.register("splash_trigger_machine",
			() -> new VSVehicleItem(new Item.Properties(),0,"lupat_splash","lupin_red","blank",
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false))
					.ChangeSlot(2).BackToBase().AddCompatibilityList(LUPAT).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> VICTORY_STRIKER_X = ITEMS.register("victory_striker_x",
			() -> new VSVehicleItem(new Item.Properties(),0,"_super","lupin_x","lupinranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 5,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false))
					.ChangeRangerName("patren_x").ChangeModel("geo/black_knight.geo.json"));

	public static final DeferredItem<Item> VICTORY_STRIKER = ITEMS.register("victory_striker",
			() -> new VSVehicleItem(new Item.Properties(),0,"_super","lupin_red","lupinranger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 5,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 5,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 5,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 0,true,false))
					.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).AddCompatibilityList(LUPINSOUL).addAlternative(VICTORY_STRIKER_X.get()).ChangeModel("geo/black_knight.geo.json").AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> SIREN_STRIKER_X = ITEMS.register("siren_striker_x",
			() -> new VSVehicleItem(new Item.Properties(),0,"_super","lupin_x","lupin_x_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 5,true,false)));

	public static final DeferredItem<Item> SIREN_STRIKER = ITEMS.register("siren_striker",
			() -> new VSVehicleItem(new Item.Properties(),0,"lupat_siren","patren_1gou","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 5,true,false))
					.ChangeSlot(2).BackToBase().AddCompatibilityList(PATRENSOUL).addAlternative(SIREN_STRIKER_X.get()).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> UNFINISHED_LUPIN_MAGNUM = ITEMS.register("unfinished_lupin_magnum",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LUPATRANGER));

	public static final DeferredItem<Item> LUPATRANGER_HELMET = ITEMS.register("lupat_head",
    		() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
    public static final DeferredItem<Item> LUPATRANGER_CHESTPLATE = ITEMS.register("lupat_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
    public static final DeferredItem<Item> LUPATRANGER_LEGGINGS = ITEMS.register("lupat_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
    
    public static final DeferredItem<Item> RED_VS_CHANGER = ITEMS.register("red_vs_changer",
    		() -> new VSChangerItem(ArmorMaterials.DIAMOND,"lupin_red",RED_DIAL_FIGHTER,LUPATRANGER_HELMET,LUPATRANGER_CHESTPLATE,LUPATRANGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
	public static final DeferredItem<Item> BLUE_VS_CHANGER = ITEMS.register("blue_vs_changer",
			() -> new VSChangerItem(ArmorMaterials.DIAMOND,"lupin_blue",BLUE_DIAL_FIGHTER,LUPATRANGER_HELMET,LUPATRANGER_CHESTPLATE,LUPATRANGER_LEGGINGS,new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
	public static final DeferredItem<Item> YELLOW_VS_CHANGER = ITEMS.register("yellow_vs_changer",
			() -> new VSChangerItem(ArmorMaterials.DIAMOND,"lupin_yellow",YELLOW_DIAL_FIGHTER,LUPATRANGER_HELMET,LUPATRANGER_CHESTPLATE,LUPATRANGER_LEGGINGS,new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));

	public static final DeferredItem<Item> ICHIGOU_VS_CHANGER = ITEMS.register("ichigou_vs_changer",
			() -> new VSChangerItem(ArmorMaterials.DIAMOND,"patren_1gou", TRIGGER_MACHINE_ICHIGOU,LUPATRANGER_HELMET,LUPATRANGER_CHESTPLATE,LUPATRANGER_LEGGINGS,new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
	public static final DeferredItem<Item> NIGOU_VS_CHANGER = ITEMS.register("nigou_vs_changer",
			() -> new VSChangerItem(ArmorMaterials.DIAMOND,"patren_2gou", TRIGGER_MACHINE_NIGOU,LUPATRANGER_HELMET,LUPATRANGER_CHESTPLATE,LUPATRANGER_LEGGINGS,new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
	public static final DeferredItem<Item> SANGOU_VS_CHANGER = ITEMS.register("sangou_vs_changer",
			() -> new VSChangerItem(ArmorMaterials.DIAMOND,"patren_3gou", TRIGGER_MACHINE_SANGOU,LUPATRANGER_HELMET,LUPATRANGER_CHESTPLATE,LUPATRANGER_LEGGINGS,new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));

	public static final DeferredItem<Item> LUPAT_X_CHANGER = ITEMS.register("lupin_x_changer",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"lupin_x",X_TRAIN_SILVER,LUPATRANGER_HELMET,LUPATRANGER_CHESTPLATE,LUPATRANGER_LEGGINGS,new Item.Properties()).CanChangeTexture().AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));

	public static final DeferredItem<BaseBlasterItem> VS_CHANGER = ITEMS.register("vs_changer",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
	public static final DeferredItem<BaseBlasterItem> X_CHANGER = ITEMS.register("x_changer",
			() -> new XChangerItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).isChanger(LUPAT_X_CHANGER.get()).AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));

	public static final DeferredItem<SwordItem> LUPIN_SWORD = ITEMS.register("lupin_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsDualWeapon().AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
	public static final DeferredItem<SwordItem> PAT_MEGABO = ITEMS.register("pat_megabo",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsDualWeapon().AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
	public static final DeferredItem<SwordItem> X_ROD_SWORD = ITEMS.register("x_rod_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsDualWeapon().AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));

	public static final DeferredItem<BaseShieldItem> SCISSOR_SHIELD = ITEMS.register("scissor_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));
	public static final DeferredItem<SwordItem> BLADE_BOOMERANG = ITEMS.register("blade_boomerang",
			() -> new BaseThrowableItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));

	public static final DeferredItem<BaseBlasterItem> LUPIN_MAGNUM = ITEMS.register("lupin_magnum",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).setProjectileFireball().AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.LUPATRANGER).ChangeRepairItem(BLANK_STRIKER.get()));

	public static final DeferredItem<Item> PATREN_X_CHANGER = ITEMS.register("patran_x_changer",
			() -> new BaseItem(new Item.Properties()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}