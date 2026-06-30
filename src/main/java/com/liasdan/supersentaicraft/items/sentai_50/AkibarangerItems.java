package com.liasdan.supersentaicraft.items.sentai_50;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AkibarangerItems {

        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // Logos
        public static final DeferredItem<Item> AKIBARANGER_LOGO = ITEMS.register("akibaranger_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> AKIBA_RED_LOGO = ITEMS.register("akiba_red_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> AKIBA_BLUE_LOGO = ITEMS.register("akiba_blue_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> AKIBA_YELLOW_LOGO = ITEMS.register("akiba_yellow_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.AKIBARANGER));

        // Armors
        public static final DeferredItem<Item> AKIBARANGER_HELMET = ITEMS.register("akibaranger_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> AKIBARANGER_CHESTPLATE = ITEMS.register("akibaranger_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties()).AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> AKIBARANGER_LEGGINGS = ITEMS.register("akibaranger_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties()).AddToTabList(RangerTabs.AKIBARANGER));

        // Form Items (Internal / Hidden from Creative Tab)
        public static final DeferredItem<Item> AKIBA_RED_GEAR = ITEMS.register("akiba_red_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "akiba_red", "akibaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false))
                                        .ChangeRangerName("akiba_red"));

        public static final DeferredItem<Item> AKIBA_RED_SUPER_GEAR = ITEMS.register("akiba_red_super_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "akiba_red_super",
                                        "akibaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4, true, false))
                                        .ChangeRangerName("akiba_red_super")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get()));

        public static final DeferredItem<Item> AKIBA_BLUE_GEAR = ITEMS.register("akiba_blue_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "akiba_blue", "akibaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false))
                                        .ChangeRangerName("akiba_blue"));

        public static final DeferredItem<Item> AKIBA_BLUE_S2_GEAR = ITEMS.register("akiba_blue_s2_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "akiba_blue_s2", "akibaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false))
                                        .ChangeRangerName("akiba_blue_s2")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get()));

        public static final DeferredItem<Item> AKIBA_YELLOW_GEAR = ITEMS.register("akiba_yellow_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "akiba_yellow", "akibaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false))
                                        .ChangeRangerName("akiba_yellow"));

        public static final DeferredItem<Item> AKIBA_YELLOW_S2_GEAR = ITEMS.register("akiba_yellow_s2_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "akiba_yellow_s2",
                                        "akibaranger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false))
                                        .ChangeRangerName("akiba_yellow_s2")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get()));

        public static final DeferredItem<Item> CHINA_RED_GEAR = ITEMS.register("china_red_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "china_red", "dairanger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .ChangeRangerName("china_red"));

        public static final DeferredItem<Item> AKIBA_WHITE_GEAR = ITEMS.register("akiba_white_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "akiba_white", "kiba_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false))
                                        .ChangeRangerName("akiba_white"));

        public static final DeferredItem<Item> RED_POWERFUL_RANGER_GEAR = ITEMS.register("red_powerful_ranger_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "red_powerful_ranger",
                                        "zyuranger_red_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false))
                                        .ChangeRangerName("red_powerful_ranger"));

        public static final DeferredItem<Item> GREEN_POWERFUL_RANGER_GEAR = ITEMS.register("green_powerful_ranger_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "green_powerful_ranger",
                                        "zyuranger_green_belt",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 5, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false))
                                        .ChangeRangerName("green_powerful_ranger"));

        // Changers (Added to Creative Tab as requested)
        public static final DeferredItem<Item> RED_MOE_MOE_Z_CUNE = ITEMS.register("red_moe_moe_z_cune",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "red_moe_moe_z_cune", AKIBA_RED_GEAR,
                                        AKIBARANGER_HELMET, AKIBARANGER_CHESTPLATE, AKIBARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> BLUE_MOE_MOE_Z_CUNE = ITEMS.register("blue_moe_moe_z_cune",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "blue_moe_moe_z_cune", AKIBA_BLUE_GEAR,
                                        AKIBARANGER_HELMET, AKIBARANGER_CHESTPLATE, AKIBARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> BLUE_S2_MOE_MOE_Z_CUNE = ITEMS.register("blue_s2_moe_moe_z_cune",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "blue_s2_moe_moe_z_cune",
                                        AKIBA_BLUE_S2_GEAR, AKIBARANGER_HELMET, AKIBARANGER_CHESTPLATE,
                                        AKIBARANGER_LEGGINGS, new Item.Properties())
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> YELLOW_MOE_MOE_Z_CUNE = ITEMS.register("yellow_moe_moe_z_cune",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "yellow_moe_moe_z_cune", AKIBA_YELLOW_GEAR,
                                        AKIBARANGER_HELMET, AKIBARANGER_CHESTPLATE, AKIBARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> YELLOW_S2_MOE_MOE_Z_CUNE = ITEMS.register("yellow_s2_moe_moe_z_cune",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "yellow_s2_moe_moe_z_cune",
                                        AKIBA_YELLOW_S2_GEAR, AKIBARANGER_HELMET, AKIBARANGER_CHESTPLATE,
                                        AKIBARANGER_LEGGINGS, new Item.Properties())
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> CHINA_AURA_CHANGER = ITEMS.register("china_aura_changer",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "ryuu_ranger", CHINA_RED_GEAR,
                                        AKIBARANGER_HELMET, AKIBARANGER_CHESTPLATE, AKIBARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Override_belt_text("dairanger_belt")
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> AKIBA_CHANGER = ITEMS.register("akiba_changer",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "kiba_ranger", AKIBA_WHITE_GEAR,
                                        AKIBARANGER_HELMET, AKIBARANGER_CHESTPLATE, AKIBARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Override_belt_text("kiba_belt")
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> RED_DINO_BUCKLER = ITEMS.register("red_dino_buckler",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "tyranno_ranger", RED_POWERFUL_RANGER_GEAR,
                                        AKIBARANGER_HELMET, AKIBARANGER_CHESTPLATE, AKIBARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Override_belt_text("zyuranger_red_belt")
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> GREEN_DINO_BUCKLER = ITEMS.register("green_dino_buckler",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "dragon_ranger", GREEN_POWERFUL_RANGER_GEAR,
                                        AKIBARANGER_HELMET, AKIBARANGER_CHESTPLATE, AKIBARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Override_belt_text("zyuranger_green_belt")
                                        .AddToTabList(RangerTabs.AKIBARANGER));

        // Weapons (Added to Tab)
        public static final DeferredItem<Item> MOE_MOE_Z_CUNE = ITEMS.register("moe_moe_z_cune",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> MUNYU_MUNYU_ZUBAAN = ITEMS.register("munyu_munyu_zubaan",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.AKIBARANGER));
        public static final DeferredItem<Item> MUNYU_MOE_ZUBAKYUN = ITEMS.register("munyu_moe_zubakyun",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.AKIBARANGER).KeepDifItem(MOE_MOE_Z_CUNE.get()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
