package com.liasdan.supersentaicraft.items.sentai_40;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_40.goonger.GoOngerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_40.goonger.GoOngerMechaItem;
import com.liasdan.supersentaicraft.items.sentai_40.goonger.EngineSoulItem;
import com.liasdan.supersentaicraft.items.OtherItems;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.liasdan.supersentaicraft.items.sentai_40.goonger.RocketDaggerItem;

public class GoOngerItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

    // Armor Parts
        // 1. Logo
        // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    public static final DeferredItem<Item> GO_ONGER_LOGO = ITEMS.register("go_onger_logo", () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));

    // 2. Collectibles
    public static final DeferredItem<Item> BLANK_ENGINE_SOUL = ITEMS.register("blank_engine_soul", () -> new EngineSoulItem(0, "blank", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> SPEEDOR_SOUL = ITEMS.register("speedor_soul", () -> new EngineSoulItem(0, "blank", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> BUSON_SOUL = ITEMS.register("buson_soul", () -> new EngineSoulItem(0, "blank", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> BEAR_RV_SOUL = ITEMS.register("bear_rv_soul", () -> new EngineSoulItem(0, "blank", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> BIRCA_SOUL = ITEMS.register("birca_soul", () -> new EngineSoulItem(1, "right", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GUNPHERD_SOUL = ITEMS.register("gunpherd_soul", () -> new EngineSoulItem(2, "left", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> TORIPTER_SOUL = ITEMS.register("toripter_soul", () -> new EngineSoulItem(3, "right", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> JETRAS_SOUL = ITEMS.register("jetras_soul", () -> new EngineSoulItem(3, "left", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> CARRIGATOR_SOUL = ITEMS.register("carrigator_soul", () -> new EngineSoulItem(0, "blank", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> JUMBOWHALE_SOUL = ITEMS.register("jumbowhale_soul", () -> new EngineSoulItem(0, "blank", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> KISHAMOTH_SOUL = ITEMS.register("kishamoth_soul", () -> new EngineSoulItem(0, "blank", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> T_LINE_SOUL = ITEMS.register("t_line_soul", () -> new EngineSoulItem(4, "right", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> K_LINE_SOUL = ITEMS.register("k_line_soul", () -> new EngineSoulItem(4, "left", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> DAISHOGUN_SOUL = ITEMS.register("daishogun_soul", () -> new EngineSoulItem(0, "blank", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> SKYDOR_SOUL = ITEMS.register("skydor_soul", () -> new EngineSoulItem(0, "blank", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> KEGALESIA_SOUL = ITEMS.register("kegalesia_soul", () -> new EngineSoulItem(0, "blank", new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));

    // 3. Armors
    public static final DeferredItem<Item> GO_ONGER_HELMET = ITEMS.register("go_onger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GO_ONGER_CHESTPLATE = ITEMS.register("go_onger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GO_ONGER_LEGGINGS = ITEMS.register("go_onger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));

    // 4. Changers & Form Items
    public static final DeferredItem<Item> GO_ON_RED_FORM = ITEMS.register("go_on_red_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "go_on_red", "rpm_cell_shift_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false)));
    public static final DeferredItem<Item> RED_GO_PHONE = ITEMS.register("red_go_phone",
            () -> new GoOngerChangerItem(ArmorMaterials.DIAMOND, "go_on_red", GO_ON_RED_FORM, GO_ONGER_HELMET, GO_ONGER_CHESTPLATE, GO_ONGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GO_ON_BLUE_FORM = ITEMS.register("go_on_blue_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "go_on_blue", "rpm_cell_shift_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false)));
    public static final DeferredItem<Item> BLUE_GO_PHONE = ITEMS.register("blue_go_phone",
            () -> new GoOngerChangerItem(ArmorMaterials.DIAMOND, "go_on_blue", GO_ON_BLUE_FORM, GO_ONGER_HELMET, GO_ONGER_CHESTPLATE, GO_ONGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GO_ON_YELLOW_FORM = ITEMS.register("go_on_yellow_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "go_on_yellow", "rpm_cell_shift_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false)));
    public static final DeferredItem<Item> YELLOW_GO_PHONE = ITEMS.register("yellow_go_phone",
            () -> new GoOngerChangerItem(ArmorMaterials.DIAMOND, "go_on_yellow", GO_ON_YELLOW_FORM, GO_ONGER_HELMET, GO_ONGER_CHESTPLATE, GO_ONGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GO_ON_GREEN_FORM = ITEMS.register("go_on_green_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "go_on_green", "rpm_cell_shift_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false)));
    public static final DeferredItem<Item> GREEN_SHIFT_CHANGER = ITEMS.register("green_shift_changer",
            () -> new GoOngerChangerItem(ArmorMaterials.DIAMOND, "go_on_green", GO_ON_GREEN_FORM, GO_ONGER_HELMET, GO_ONGER_CHESTPLATE, GO_ONGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GO_ON_BLACK_FORM = ITEMS.register("go_on_black_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "go_on_black", "rpm_cell_shift_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false)));
    public static final DeferredItem<Item> BLACK_SHIFT_CHANGER = ITEMS.register("black_shift_changer",
            () -> new GoOngerChangerItem(ArmorMaterials.DIAMOND, "go_on_black", GO_ON_BLACK_FORM, GO_ONGER_HELMET, GO_ONGER_CHESTPLATE, GO_ONGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GO_ON_GOLD_FORM = ITEMS.register("go_on_gold_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "go_on_gold", "go_on_gold_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                    new MobEffectInstance(EffectCore.BOOST, 20, 2, true, false)));
    public static final DeferredItem<Item> GOLD_WING_TRIGGER = ITEMS.register("gold_wing_trigger",
            () -> new GoOngerChangerItem(ArmorMaterials.DIAMOND, "go_on_gold", GO_ON_GOLD_FORM, GO_ONGER_HELMET, GO_ONGER_CHESTPLATE, GO_ONGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GO_ON_SILVER_FORM = ITEMS.register("go_on_silver_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "go_on_silver", "go_on_silver_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                    new MobEffectInstance(EffectCore.BOOST, 20, 2, true, false)));
    public static final DeferredItem<Item> SILVER_WING_TRIGGER = ITEMS.register("silver_wing_trigger",
            () -> new GoOngerChangerItem(ArmorMaterials.DIAMOND, "go_on_silver", GO_ON_SILVER_FORM, GO_ONGER_HELMET, GO_ONGER_CHESTPLATE, GO_ONGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> KEGA_YELLOW_FORM = ITEMS.register("kega_yellow_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kega_yellow", "rpm_cell_shift_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false)));
    public static final DeferredItem<Item> KEGA_GO_PHONE = ITEMS.register("kega_go_phone",
            () -> new GoOngerChangerItem(ArmorMaterials.DIAMOND, "kega_yellow", KEGA_YELLOW_FORM, GO_ONGER_HELMET, GO_ONGER_CHESTPLATE, GO_ONGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GO_ONGER));

    // 5. Weapons & Mechas
    public static final DeferredItem<Item> MANTAN_SWORD = ITEMS.register("mantan_sword", () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsDualWeapon().ChangeRepairItem(BLANK_ENGINE_SOUL.get()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> ROAD_SABRE = ITEMS.register("road_sabre", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(BLANK_ENGINE_SOUL.get()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GARAGE_LAUNCHER = ITEMS.register("garage_launcher", () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(BLANK_ENGINE_SOUL.get()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> BRIDGE_AXE = ITEMS.register("bridge_axe", () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).ChangeRepairItem(BLANK_ENGINE_SOUL.get()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> COWL_LASER = ITEMS.register("cowl_laser", () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(BLANK_ENGINE_SOUL.get()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> ROCKET_DAGGER = ITEMS.register("rocket_dagger", () -> new RocketDaggerItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(BLANK_ENGINE_SOUL.get()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> WING_BOOSTER = ITEMS.register("wing_booster", () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties().craftRemainder(ROCKET_DAGGER.get())).ChangeRepairItem(BLANK_ENGINE_SOUL.get()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> WING_BOOSTER_SILVER = ITEMS.register("wing_booster_silver", () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties().craftRemainder(ROCKET_DAGGER.get())).ChangeRepairItem(BLANK_ENGINE_SOUL.get()));
    public static final DeferredItem<Item> KANKANBAR = ITEMS.register("kankanbar", () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(BLANK_ENGINE_SOUL.get()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> KANKAN_MANTAN_GUN = ITEMS.register("kankan_mantan_gun", () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties().craftRemainder(MANTAN_SWORD.get())).ChangeRepairItem(BLANK_ENGINE_SOUL.get()).AddToTabList(RangerTabs.GO_ONGER));
    // Mecha Items
    public static final DeferredItem<Item> ENGINE_OH_BOOTS = ITEMS.register("engine_oh_boots", () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> ENGINE_OH_LEGGINGS = ITEMS.register("engine_oh_legs", () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> ENGINE_OH_CHESTPLATE = ITEMS.register("engine_oh_torso", () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));

    public static final DeferredItem<Item> ENGINE_OH_HELMET = ITEMS.register("engine_oh_head",
        () -> new GoOngerMechaItem(ArmorMaterials.NETHERITE, "engine_oh", OtherItems.BLANK_FORM, ENGINE_OH_CHESTPLATE, ENGINE_OH_LEGGINGS, ENGINE_OH_BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> GUNBIR_OH_HELMET = ITEMS.register("gunbir_oh_head",
        () -> new GoOngerMechaItem(ArmorMaterials.NETHERITE, "gunbir_oh", OtherItems.BLANK_FORM, ENGINE_OH_CHESTPLATE, ENGINE_OH_LEGGINGS, ENGINE_OH_BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> ENGINE_OH_G6_HELMET = ITEMS.register("engine_oh_g6_head",
        () -> new GoOngerMechaItem(ArmorMaterials.NETHERITE, "engine_oh_g6", OtherItems.BLANK_FORM, ENGINE_OH_CHESTPLATE, ENGINE_OH_LEGGINGS, ENGINE_OH_BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> SEIKUU_OH_HELMET = ITEMS.register("seikuu_oh_head",
        () -> new GoOngerMechaItem(ArmorMaterials.NETHERITE, "seikuu_oh", OtherItems.BLANK_FORM, ENGINE_OH_CHESTPLATE, ENGINE_OH_LEGGINGS, ENGINE_OH_BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> ENGINE_OH_G9_HELMET = ITEMS.register("engine_oh_g9_head",
        () -> new GoOngerMechaItem(ArmorMaterials.NETHERITE, "engine_oh_g9", OtherItems.BLANK_FORM, ENGINE_OH_CHESTPLATE, ENGINE_OH_LEGGINGS, ENGINE_OH_BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> KYORETSU_OH_HELMET = ITEMS.register("kyoretsu_oh_head",
        () -> new GoOngerMechaItem(ArmorMaterials.NETHERITE, "kyoretsu_oh", OtherItems.BLANK_FORM, ENGINE_OH_CHESTPLATE, ENGINE_OH_LEGGINGS, ENGINE_OH_BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> ENGINE_OH_G12_HELMET = ITEMS.register("engine_oh_g12_head",
        () -> new GoOngerMechaItem(ArmorMaterials.NETHERITE, "engine_oh_g12", OtherItems.BLANK_FORM, ENGINE_OH_CHESTPLATE, ENGINE_OH_LEGGINGS, ENGINE_OH_BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> ENGINE_DAISHOGUN_HELMET = ITEMS.register("engine_daishogun_head",
        () -> new GoOngerMechaItem(ArmorMaterials.NETHERITE, "engine_daishogun", OtherItems.BLANK_FORM, ENGINE_OH_CHESTPLATE, ENGINE_OH_LEGGINGS, ENGINE_OH_BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> SKYDOR_ENGINE_OH_HELMET = ITEMS.register("skydor_engine_oh_head",
        () -> new GoOngerMechaItem(ArmorMaterials.NETHERITE, "skydor_engine_oh", OtherItems.BLANK_FORM, ENGINE_OH_CHESTPLATE, ENGINE_OH_LEGGINGS, ENGINE_OH_BOOTS, new Item.Properties()).AddToTabList(RangerTabs.GO_ONGER));

    // Mecha Weapons
    public static final DeferredItem<Item> GO_ON_SWORD = ITEMS.register("go_on_sword", () -> new BaseSwordItem(Tiers.DIAMOND, 7, -2.4F, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> V_SHIELD = ITEMS.register("v_shield", () -> new BaseShieldItem(new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.GO_ONGER));
    public static final DeferredItem<Item> ENJIN_KEN = ITEMS.register("enjin_ken", () -> new BaseSwordItem(Tiers.DIAMOND, 7, -2.4F, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.GO_ONGER));

public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
