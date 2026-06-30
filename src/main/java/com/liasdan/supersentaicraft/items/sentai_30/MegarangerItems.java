package com.liasdan.supersentaicraft.items.sentai_30;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MegarangerItems {

        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // Logo and Collectibles
        // 1. Logo
        // 1. Logo

        // Logo and Collectibles
        // 1. Logo

        // Logo and Collectibles
        // 1. Logo
        public static final DeferredItem<Item> MEGARANGER_LOGO = ITEMS.register("megaranger_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MEGARANGER));

        // 2. Collectibles
        public static final DeferredItem<Item> MEGA_RED_DISK = ITEMS.register("mega_red_disk",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_BLACK_DISK = ITEMS.register("mega_black_disk",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_BLUE_DISK = ITEMS.register("mega_blue_disk",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_YELLOW_DISK = ITEMS.register("mega_yellow_disk",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_PINK_DISK = ITEMS.register("mega_pink_disk",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_SILVER_DISK = ITEMS.register("mega_silver_disk",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_TECTOR_DISK = ITEMS.register("mega_tector_disk",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> BATTLERAIZER = ITEMS.register("battleraizer",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MEGARANGER));

        // 3. Armors
        public static final DeferredItem<Item> MEGARANGER_HELMET = ITEMS.register("megaranger_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGARANGER_CHESTPLATE = ITEMS.register("megaranger_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGARANGER_LEGGINGS = ITEMS.register("megaranger_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.MEGARANGER));

        // 4. Changers & Form Items
        public static final DeferredItem<Item> MEGA_RED_FORM = ITEMS.register("mega_red_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "mega_red", "in_space_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 2, true, false)));
        public static final DeferredItem<Item> MEGA_BLACK_FORM = ITEMS.register("mega_black_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "mega_black", "in_space_belt",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false)));
        public static final DeferredItem<Item> MEGA_BLUE_FORM = ITEMS.register("mega_blue_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "mega_blue", "in_space_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false)));
        public static final DeferredItem<Item> MEGA_YELLOW_FORM = ITEMS.register("mega_yellow_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "mega_yellow", "in_space_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 3, true, false)));
        public static final DeferredItem<Item> MEGA_PINK_FORM = ITEMS.register("mega_pink_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "mega_pink", "in_space_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false)));
        public static final DeferredItem<Item> MEGA_SILVER_FORM = ITEMS.register("mega_silver_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "mega_silver", "in_space_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false)));
        public static final DeferredItem<Item> MEGA_TECTOR_FORM = ITEMS.register("mega_tector_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "mega_tector", "in_space_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false)));
        public static final DeferredItem<Item> RED_DIGITAIZER = ITEMS.register("red_digitaizer",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "mega_red", MEGA_RED_FORM,
                                        MEGARANGER_HELMET, MEGARANGER_CHESTPLATE, MEGARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> BLACK_DIGITAIZER = ITEMS.register("black_digitaizer",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "mega_black", MEGA_BLACK_FORM,
                                        MEGARANGER_HELMET, MEGARANGER_CHESTPLATE, MEGARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> BLUE_DIGITAIZER = ITEMS.register("blue_digitaizer",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "mega_blue", MEGA_BLUE_FORM,
                                        MEGARANGER_HELMET, MEGARANGER_CHESTPLATE, MEGARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> YELLOW_DIGITAIZER = ITEMS.register("yellow_digitaizer",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "mega_yellow", MEGA_YELLOW_FORM,
                                        MEGARANGER_HELMET, MEGARANGER_CHESTPLATE, MEGARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> PINK_DIGITAIZER = ITEMS.register("pink_digitaizer",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "mega_pink", MEGA_PINK_FORM,
                                        MEGARANGER_HELMET, MEGARANGER_CHESTPLATE, MEGARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> KEITAIZER = ITEMS.register("keitaizer",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "mega_silver", MEGA_SILVER_FORM,
                                        MEGARANGER_HELMET, MEGARANGER_CHESTPLATE, MEGARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.MEGARANGER));

        // 5. Weapons & Mechas
        public static final DeferredItem<Item> MEGA_MAGNUM = ITEMS.register("mega_magnum",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_SHOT = ITEMS.register("mega_shot",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_SNIPER = ITEMS.register("mega_sniper",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(MEGA_MAGNUM.get()))
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> DRILL_SABER = ITEMS.register("drill_saber",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_ROD = ITEMS.register("mega_rod",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_TOMAHAWK = ITEMS.register("mega_tomahawk",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_SLING = ITEMS.register("mega_sling",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> MEGA_CAPTURE = ITEMS.register("mega_capture",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> SILVER_BLAZER = ITEMS.register("silver_blazer",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun()
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> DRILL_SNIPER = ITEMS.register("drill_sniper",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(DRILL_SABER.get()))
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> ROD_SNIPER = ITEMS.register("rod_sniper",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(MEGA_ROD.get()))
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> TOMAHAWK_SNIPER = ITEMS.register("tomahawk_sniper",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(MEGA_TOMAHAWK.get()))
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> SLING_SNIPER = ITEMS.register("sling_sniper",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(MEGA_SLING.get()))
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));
        public static final DeferredItem<Item> CAPTURE_SNIPER = ITEMS.register("capture_sniper",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(MEGA_CAPTURE.get()))
                                        .ChangeRepairItem(MEGARANGER_LOGO.get()).AddToTabList(RangerTabs.MEGARANGER));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
