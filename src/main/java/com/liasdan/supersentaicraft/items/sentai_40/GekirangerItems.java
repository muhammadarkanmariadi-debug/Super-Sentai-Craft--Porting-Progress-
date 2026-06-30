package com.liasdan.supersentaicraft.items.sentai_40;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_40.gekiranger.SuperGekiClawItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GekirangerItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

	    // 1. Logo
        // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    public static final DeferredItem<Item> GEKIRANGER_LOGO = ITEMS.register("gekiranger_logo",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));

    // 2. Collectibles
    public static final DeferredItem<Item> TIGER_SPIRIT = ITEMS.register("tiger_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));
    public static final DeferredItem<Item> CHEETAH_SPIRIT = ITEMS.register("cheetah_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));
    public static final DeferredItem<Item> JAGUAR_SPIRIT = ITEMS.register("jaguar_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));
    public static final DeferredItem<Item> WOLF_SPIRIT = ITEMS.register("wolf_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));
    public static final DeferredItem<Item> RHINO_SPIRIT = ITEMS.register("rhino_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));
    public static final DeferredItem<Item> ELEPHANT_SPIRIT = ITEMS.register("elephant_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));
    public static final DeferredItem<Item> BAT_SPIRIT = ITEMS.register("bat_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));
    public static final DeferredItem<Item> SHARK_SPIRIT = ITEMS.register("shark_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));
    public static final DeferredItem<Item> GORILLA_SPIRIT = ITEMS.register("gorilla_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));
    public static final DeferredItem<Item> PENGUIN_SPIRIT = ITEMS.register("penguin_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));
    public static final DeferredItem<Item> GAZELLE_SPIRIT = ITEMS.register("gazelle_spirit", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER));

    // 3. Armors
    public static final DeferredItem<Item> GEKIRANGER_HELMET = ITEMS.register("gekiranger_head",
			() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GEKIRANGER_CHESTPLATE = ITEMS.register("gekiranger_torso",
			() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GEKIRANGER_LEGGINGS = ITEMS.register("gekiranger_legs",
			() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));

    // 4. Changers & Form Items
    public static final DeferredItem<Item> GEKI_RED_FORM = ITEMS.register("geki_red_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "geki_red", "empty",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false)).ChangeBeltModel("empty_belt.geo.json"));
    public static final DeferredItem<Item> GEKI_YELLOW_FORM = ITEMS.register("geki_yellow_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "geki_yellow", "empty",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false)).ChangeBeltModel("empty_belt.geo.json"));
    public static final DeferredItem<Item> GEKI_BLUE_FORM = ITEMS.register("geki_blue_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "geki_blue", "empty",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false)).ChangeBeltModel("empty_belt.geo.json"));
    public static final DeferredItem<Item> GEKI_VIOLET_FORM = ITEMS.register("geki_violet_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "geki_violet", "empty",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false)).ChangeBeltModel("empty_belt.geo.json"));
    public static final DeferredItem<Item> GEKI_CHOPPER_FORM = ITEMS.register("geki_chopper_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "geki_chopper", "empty",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false)).ChangeBeltModel("empty_belt.geo.json"));

    public static final DeferredItem<Item> GEKI_RED_SUPER_FORM = ITEMS.register("geki_red_super_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "_super_mode", "geki_red", "empty",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 5, true, false),
                    new MobEffectInstance(com.liasdan.supersentaicraft.effect.EffectCore.BOOST, 20, 2, true, false)).ChangeBeltModel("empty_belt.geo.json"));
    public static final DeferredItem<Item> GEKI_YELLOW_SUPER_FORM = ITEMS.register("geki_yellow_super_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "_super_mode", "geki_yellow", "empty",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 5, true, false),
                    new MobEffectInstance(com.liasdan.supersentaicraft.effect.EffectCore.BOOST, 20, 2, true, false)).ChangeBeltModel("empty_belt.geo.json"));
    public static final DeferredItem<Item> GEKI_BLUE_SUPER_FORM = ITEMS.register("geki_blue_super_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "_super_mode", "geki_blue", "empty",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 5, true, false),
                    new MobEffectInstance(com.liasdan.supersentaicraft.effect.EffectCore.BOOST, 20, 2, true, false)).ChangeBeltModel("empty_belt.geo.json"));

    public static final DeferredItem<Item> RED_GEKI_CHANGER = ITEMS.register("red_geki_changer",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND, "geki_red", GEKI_RED_FORM, GEKIRANGER_HELMET, GEKIRANGER_CHESTPLATE, GEKIRANGER_LEGGINGS, new Item.Properties())
			.AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_GEKI_CHANGER = ITEMS.register("yellow_geki_changer",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND, "geki_yellow", GEKI_YELLOW_FORM, GEKIRANGER_HELMET, GEKIRANGER_CHESTPLATE, GEKIRANGER_LEGGINGS, new Item.Properties())
			.AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> BLUE_GEKI_CHANGER = ITEMS.register("blue_geki_changer",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND, "geki_blue", GEKI_BLUE_FORM, GEKIRANGER_HELMET, GEKIRANGER_CHESTPLATE, GEKIRANGER_LEGGINGS, new Item.Properties())
			.AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GONG_CHANGER = ITEMS.register("gong_changer",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND, "geki_violet", GEKI_VIOLET_FORM, GEKIRANGER_HELMET, GEKIRANGER_CHESTPLATE, GEKIRANGER_LEGGINGS, new Item.Properties())
			.AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> CHOPPER_SAI_BLADE = ITEMS.register("chopper_sai_blade",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND, "geki_chopper", GEKI_CHOPPER_FORM, GEKIRANGER_HELMET, GEKIRANGER_CHESTPLATE, GEKIRANGER_LEGGINGS, new Item.Properties())
			.AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
            
    public static final DeferredItem<Item> RED_SUPER_GEKI_CLAW = ITEMS.register("red_super_geki_claw", () -> new SuperGekiClawItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties(), GEKI_RED_SUPER_FORM).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_SUPER_GEKI_CLAW = ITEMS.register("yellow_super_geki_claw", () -> new SuperGekiClawItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties(), GEKI_YELLOW_SUPER_FORM).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> BLUE_SUPER_GEKI_CLAW = ITEMS.register("blue_super_geki_claw", () -> new SuperGekiClawItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties(), GEKI_BLUE_SUPER_FORM).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));

    // 5. Weapons & Mechas
    public static final DeferredItem<Item> SAI_BLADE_CUTTER = ITEMS.register("sai_blade_cutter",
			() -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsDualWeapon().AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GEKI_TONFA_BATON = ITEMS.register("geki_tonfa_baton", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GEKI_TONFA_LONG_BATON = ITEMS.register("geki_tonfa_long_baton", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties().craftRemainder(GEKI_TONFA_BATON.get())).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GEKI_TONFA = ITEMS.register("geki_tonfa", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GEKI_HAMMER = ITEMS.register("geki_hammer", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GEKI_FAN = ITEMS.register("geki_fan", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GEKI_SABER_TWIN_B = ITEMS.register("geki_saber_twin_b", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GEKI_SABER_TWIN_A = ITEMS.register("geki_saber_twin_a", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> GEKI_SABER_TWIN_COMBO = ITEMS.register("geki_saber_twin_combo", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties().craftRemainder(GEKI_SABER_TWIN_B.get())).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));
    public static final DeferredItem<Item> VIRTUOUS_BEAST_SWORD = ITEMS.register("virtuous_beast_sword", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GEKIRANGER).ChangeRepairItem(GEKIRANGER_LOGO.get()));

public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
