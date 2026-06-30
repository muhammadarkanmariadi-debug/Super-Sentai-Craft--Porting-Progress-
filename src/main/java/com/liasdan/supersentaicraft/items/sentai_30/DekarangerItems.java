package com.liasdan.supersentaicraft.items.sentai_30;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_30.dekaranger.DekarangerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_30.dekaranger.SPBadgeItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DekarangerItems {

        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // Logo and Collectibles
        // 2. Collectibles
        // 2. Collectibles

        // 2. Collectibles

        // 2. Collectibles
        public static final DeferredItem<Item> DEKARANGER_BADGE = ITEMS.register("dekaranger_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_RED_BADGE = ITEMS.register("deka_red_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_BLUE_BADGE = ITEMS.register("deka_blue_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_GREEN_BADGE = ITEMS.register("deka_green_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_YELLOW_BADGE = ITEMS.register("deka_yellow_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_PINK_BADGE = ITEMS.register("deka_pink_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_BREAK_BADGE = ITEMS.register("deka_break_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_MASTER_BADGE = ITEMS.register("deka_master_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_SWAN_BADGE = ITEMS.register("deka_swan_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_BRIGHT_BADGE = ITEMS.register("deka_bright_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_GOLD_BADGE = ITEMS.register("deka_gold_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_RED_FIRE_SQUAD_BADGE = ITEMS.register("deka_red_fire_squad_badge",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DEKARANGER));

        // 3. Armors
        public static final DeferredItem<Item> DEKARANGER_HELMET = ITEMS.register("dekaranger_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKARANGER_CHESTPLATE = ITEMS.register("dekaranger_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKARANGER_LEGGINGS = ITEMS.register("dekaranger_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));

        // 4. Changers & Form Items
        public static final DeferredItem<Item> DEKA_RED_FORM = ITEMS.register("deka_red_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "deka_red", "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false)));
        public static final DeferredItem<Item> DEKA_RED_SWAT_FORM = ITEMS.register("deka_red_swat_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_swat", "deka_red", "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false)));
        public static final DeferredItem<Item> DEKA_RED_SWAT_BADGE = ITEMS.register("deka_red_swat_badge",
                        () -> new SPBadgeItem(DEKA_RED_FORM, DEKA_RED_SWAT_FORM, new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_BLUE_SWAT_FORM = ITEMS.register("deka_blue_swat_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_swat", "deka_blue",
                                        "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false)));
        public static final DeferredItem<Item> DEKA_BLUE_FORM = ITEMS.register("deka_blue_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "deka_blue", "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false)));
        public static final DeferredItem<Item> DEKA_BLUE_SWAT_BADGE = ITEMS.register("deka_blue_swat_badge",
                        () -> new SPBadgeItem(DEKA_BLUE_FORM, DEKA_BLUE_SWAT_FORM, new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_GREEN_SWAT_FORM = ITEMS.register("deka_green_swat_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_swat", "deka_green",
                                        "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false)));
        public static final DeferredItem<Item> DEKA_GREEN_FORM = ITEMS.register("deka_green_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "deka_green", "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false)));
        public static final DeferredItem<Item> DEKA_GREEN_SWAT_BADGE = ITEMS.register("deka_green_swat_badge",
                        () -> new SPBadgeItem(DEKA_GREEN_FORM, DEKA_GREEN_SWAT_FORM, new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_YELLOW_FORM = ITEMS.register("deka_yellow_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "deka_yellow", "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false)));
        public static final DeferredItem<Item> DEKA_YELLOW_SWAT_FORM = ITEMS.register("deka_yellow_swat_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_swat", "deka_yellow",
                                        "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false)));
        public static final DeferredItem<Item> DEKA_YELLOW_SWAT_BADGE = ITEMS.register("deka_yellow_swat_badge",
                        () -> new SPBadgeItem(DEKA_YELLOW_FORM, DEKA_YELLOW_SWAT_FORM, new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_PINK_SWAT_FORM = ITEMS.register("deka_pink_swat_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_swat", "deka_pink",
                                        "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false)));
        public static final DeferredItem<Item> DEKA_PINK_FORM = ITEMS.register("deka_pink_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "deka_pink", "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false)));
        public static final DeferredItem<Item> DEKA_PINK_SWAT_BADGE = ITEMS.register("deka_pink_swat_badge",
                        () -> new SPBadgeItem(DEKA_PINK_FORM, DEKA_PINK_SWAT_FORM, new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_RED_BATTLIZER_FORM = ITEMS.register("deka_red_battlizer_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_battlizer_armor", "deka_red",
                                        "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false),
                                        new MobEffectInstance(EffectCore.FLYING, 20, 2, true, false),
                                        new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 2, true, false)));
        public static final DeferredItem<Item> DEKA_RED_BATTLIZER_BADGE = ITEMS.register("deka_red_battlizer_badge",
                        () -> new SPBadgeItem(DEKA_RED_FORM, DEKA_RED_BATTLIZER_FORM, new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> DEKA_BREAK_FORM = ITEMS.register("deka_break_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "deka_break", "deka_break_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false)));
        public static final DeferredItem<Item> DEKA_MASTER_FORM = ITEMS.register("deka_master_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "deka_master", "deka_master_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                                        new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false)));
        public static final DeferredItem<Item> DEKA_SWAN_FORM = ITEMS.register("deka_swan_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "deka_swan", "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false)));
        public static final DeferredItem<Item> DEKA_BRIGHT_FORM = ITEMS.register("deka_bright_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "deka_bright", "deka_break_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false)));
        public static final DeferredItem<Item> DEKA_GOLD_FORM = ITEMS.register("deka_gold_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "deka_gold", "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false)));
        public static final DeferredItem<Item> DEKA_RED_FIRE_SQUAD_FORM = ITEMS.register("deka_red_fire_squad_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_fire_squad_armor", "deka_red",
                                        "deka_fire_squad_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 2, true, false)));
        public static final DeferredItem<Item> NEO_DEKA_RED_FORM = ITEMS.register("neo_deka_red_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "neo_deka_red", "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false)));
        public static final DeferredItem<Item> NEO_DEKA_YELLOW_FORM = ITEMS.register("neo_deka_yellow_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "neo_deka_yellow",
                                        "dekaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false)));
        public static final DeferredItem<Item> SP_LICENSE = ITEMS.register("red_sp_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_red", DEKA_RED_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> SP_LICENSE_B = ITEMS.register("blue_sp_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_blue", DEKA_BLUE_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> SP_LICENSE_G = ITEMS.register("green_sp_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_green", DEKA_GREEN_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> SP_LICENSE_Y = ITEMS.register("yellow_sp_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_yellow", DEKA_YELLOW_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> SP_LICENSE_P = ITEMS.register("pink_sp_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_pink", DEKA_PINK_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> MASTER_LICENSE = ITEMS.register("master_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_master", DEKA_MASTER_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> SWAN_SP_LICENSE = ITEMS.register("swan_sp_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_swan", DEKA_SWAN_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> BREAK_BRACE_THROTTLE = ITEMS.register("break_brace_throttle",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_break", DEKA_BREAK_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> BRIGHT_BRACE_THROTTLE = ITEMS.register("bright_brace_throttle",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_bright", DEKA_BRIGHT_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> GOLD_SP_LICENSE = ITEMS.register("gold_sp_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_gold", DEKA_GOLD_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> FS_LICENSE = ITEMS.register("fs_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "deka_red", DEKA_RED_FIRE_SQUAD_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> NEO_RED_SP_LICENSE = ITEMS.register("neo_red_sp_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "neo_deka_red", NEO_DEKA_RED_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> NEO_YELLOW_SP_LICENSE = ITEMS.register("neo_yellow_sp_license",
                        () -> new DekarangerChangerItem(ArmorMaterials.DIAMOND, "neo_deka_yellow", NEO_DEKA_YELLOW_FORM,
                                        DEKARANGER_HELMET, DEKARANGER_CHESTPLATE, DEKARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DEKARANGER));

        // 5. Weapons & Mechas
        public static final DeferredItem<Item> SP_SHOOTER = ITEMS.register("sp_shooter",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> BATTLIZER_GUN = ITEMS.register("battlizer_gun",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> BATTLIZER_SWORD = ITEMS.register("battlizer_sword",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_MAGNUM_1 = ITEMS.register("d_magnum_1",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_MAGNUM_2 = ITEMS.register("d_magnum_2",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> HYBRID_MAGNUM = ITEMS.register("hybrid_magnum",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(D_MAGNUM_2.get()))
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_SWORD_VEGA = ITEMS.register("d_sword_vega",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_KNUCKLE = ITEMS.register("d_knuckle",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_SNIPER = ITEMS.register("d_sniper",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(D_KNUCKLE.get()))
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_BLASTER = ITEMS.register("d_blaster",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(D_KNUCKLE.get()))
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_SHOT_PINK = ITEMS.register("d_shot_pink",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(D_KNUCKLE.get()))
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_SHOT_YELLOW = ITEMS.register("d_shot_yellow",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(D_KNUCKLE.get()))
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_ROD_BLUE = ITEMS.register("d_rod_blue",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_ROD_GREEN = ITEMS.register("d_rod_green",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_STICK_PINK = ITEMS.register("d_stick_pink",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_STICK_YELLOW = ITEMS.register("d_stick_yellow",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_SMASHER = ITEMS.register("d_smasher",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));
        public static final DeferredItem<Item> D_REVOLVER = ITEMS.register("d_revolver",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(DEKARANGER_BADGE.get()).AddToTabList(RangerTabs.DEKARANGER));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
