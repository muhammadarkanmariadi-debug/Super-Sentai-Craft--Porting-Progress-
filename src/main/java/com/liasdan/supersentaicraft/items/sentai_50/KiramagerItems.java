package com.liasdan.supersentaicraft.items.sentai_50;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import com.liasdan.supersentaicraft.effect.EffectCore;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import com.liasdan.supersentaicraft.items.sentai_50.kiramager.KanaemaStoneItem;
import com.liasdan.supersentaicraft.items.sentai_50.kiramager.KirafulGoArrowItem;
import com.liasdan.supersentaicraft.items.sentai_50.kiramager.ShinyBreakerToolItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KiramagerItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // 1. Logo
        // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    public static final DeferredItem<Item> KIRAMEIGER_LOGO = ITEMS.register("kirameiger_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KIRAMEIGER));


    public static final DeferredItem<Item> KIRAFUL_GO_ARROW = ITEMS.register("kiraful_go_arrow",
            () -> new KirafulGoArrowItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));

    // 3. Armors
    public static final DeferredItem<Item> KIRAMEIGER_HELMET = ITEMS.register("kirameiger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> KIRAMEIGER_CHESTPLATE = ITEMS.register("kirameiger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> KIRAMEIGER_LEGGINGS = ITEMS.register("kirameiger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));

    // 4. Changers & Form Items
    public static final DeferredItem<Item> GO_KIRAMEI_RED = ITEMS.register("go_kiramei_red",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_red", "kiramei_red_belt",
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 4, true, false))
                    .ChangeRangerName("kiramei_red_go").addSwitchForm(OtherItems.BLANK_FORM.get()));
    public static final DeferredItem<Item> GO_KIRAMEI_BLUE = ITEMS.register("go_kiramei_blue",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_blue", "kiramei_blue_belt",
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 4, true, false),
                    new MobEffectInstance(EffectCore.SLASH, 20, 4, true, false))
                    .ChangeRangerName("kiramei_blue_go").addSwitchForm(OtherItems.BLANK_FORM.get()));
    public static final DeferredItem<Item> GO_KIRAMEI_YELLOW = ITEMS.register("go_kiramei_yellow",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_yellow", "kiramei_yellow_belt",
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 4, true, false),
                    new MobEffectInstance(EffectCore.SHOTBOOST, 20, 4, true, false))
                    .ChangeRangerName("kiramei_yellow_go").addSwitchForm(OtherItems.BLANK_FORM.get()));
    public static final DeferredItem<Item> GO_KIRAMEI_GREEN = ITEMS.register("go_kiramei_green",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_green", "kiramei_green_belt",
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 4, true, false))
                    .ChangeRangerName("kiramei_green_go").addSwitchForm(OtherItems.BLANK_FORM.get()));
    public static final DeferredItem<Item> GO_KIRAMEI_PINK = ITEMS.register("go_kiramei_pink",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_pink", "kiramei_pink_belt",
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 4, true, false))
                    .ChangeRangerName("kiramei_pink_go").addSwitchForm(OtherItems.BLANK_FORM.get()));
    public static final DeferredItem<Item> GO_KIRAMEI_SILVER = ITEMS.register("go_kiramei_silver",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_silver", "kiramei_silver_belt",
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 4, true, false))
                    .ChangeRangerName("kiramei_silver_go").addSwitchForm(OtherItems.BLANK_FORM.get()));
    public static final DeferredItem<Item> KIRAMEI_SILVER_VISOR = ITEMS.register("kiramei_silver_visor",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_silver_visor", "kiramei_silver_belt")
                    .ChangeRangerName("kiramei_silver_visor").addSwitchForm(OtherItems.BLANK_FORM.get()));
    public static final DeferredItem<Item> RED_KIRAMEI_STONE = ITEMS.register("red_kiramei_stone",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_red", "kiramei_red_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false))
                    .addShiftForm(GO_KIRAMEI_RED.get()).ChangeRangerName("kiramei_red").AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> BLUE_KIRAMEI_STONE = ITEMS.register("blue_kiramei_stone",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_blue", "kiramei_blue_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                    new MobEffectInstance(EffectCore.SLASH, 20, 2, true, false))
                    .addShiftForm(GO_KIRAMEI_BLUE.get()).ChangeRangerName("kiramei_blue").AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> YELLOW_KIRAMEI_STONE = ITEMS.register("yellow_kiramei_stone",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_yellow", "kiramei_yellow_belt",
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                    new MobEffectInstance(EffectCore.SHOTBOOST, 20, 2, true, false))
                    .addShiftForm(GO_KIRAMEI_YELLOW.get()).ChangeRangerName("kiramei_yellow").AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> GREEN_KIRAMEI_STONE = ITEMS.register("green_kiramei_stone",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_green", "kiramei_green_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                    .addShiftForm(GO_KIRAMEI_GREEN.get()).ChangeRangerName("kiramei_green").AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> PINK_KIRAMEI_STONE = ITEMS.register("pink_kiramei_stone",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_pink", "kiramei_pink_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false))
                    .addShiftForm(GO_KIRAMEI_PINK.get()).ChangeRangerName("kiramei_pink").AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> SHINY_KIRAMEI_STONE = ITEMS.register("shiny_kiramei_stone",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_silver", "kiramei_silver_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 2, true, false))
                    .addSwitchForm(KIRAMEI_SILVER_VISOR.get())
                    .addShiftForm(GO_KIRAMEI_SILVER.get()).ChangeRangerName("kiramei_silver").AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> GOLD_KIRAMEI_STONE = ITEMS.register("gold_kiramei_stone",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiramei_gold", "kiramei_gold_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 2, true, false))
                    .ChangeRangerName("kiramei_gold").AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> DARK_KIRAMEI_STONE = ITEMS.register("dark_kiramei_stone",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "dark_kiramei_silver", "kiramei_silver_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.WITHER, 20, 2, true, false))
                    .ChangeRangerName("dark_kiramei_silver").AddToTabList(RangerTabs.KIRAMEIGER));

    public static final DeferredItem<Item> DESTORIA_KANAEMA_STONE = ITEMS.register("destoria_kanaema_stone",
            () -> new KanaemaStoneItem(new Item.Properties(), 1).AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> REVERSIA_KANAEMA_STONE = ITEMS.register("reversia_kanaema_stone",
            () -> new KanaemaStoneItem(new Item.Properties(), 2).AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> ENERGIA_KANAEMA_STONE = ITEMS.register("energia_kanaema_stone",
            () -> new KanaemaStoneItem(new Item.Properties(), 3).AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> ILLUSIA_KANAEMA_STONE = ITEMS.register("illusia_kanaema_stone",
            () -> new KanaemaStoneItem(new Item.Properties(), 4).AddToTabList(RangerTabs.KIRAMEIGER));
    public static final DeferredItem<Item> RED_KIRAMEI_CHANGER = ITEMS.register("red_kiramei_changer",
            () -> new com.liasdan.supersentaicraft.items.sentai_50.kiramager.KiramagerChangerItem(ArmorMaterials.DIAMOND, "kiramei_red", RED_KIRAMEI_STONE,
                    KIRAMEIGER_HELMET, KIRAMEIGER_CHESTPLATE, KIRAMEIGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> BLUE_KIRAMEI_CHANGER = ITEMS.register("blue_kiramei_changer",
            () -> new com.liasdan.supersentaicraft.items.sentai_50.kiramager.KiramagerChangerItem(ArmorMaterials.DIAMOND, "kiramei_blue", BLUE_KIRAMEI_STONE,
                    KIRAMEIGER_HELMET, KIRAMEIGER_CHESTPLATE, KIRAMEIGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> GREEN_KIRAMEI_CHANGER = ITEMS.register("green_kiramei_changer",
            () -> new com.liasdan.supersentaicraft.items.sentai_50.kiramager.KiramagerChangerItem(ArmorMaterials.DIAMOND, "kiramei_green", GREEN_KIRAMEI_STONE,
                    KIRAMEIGER_HELMET, KIRAMEIGER_CHESTPLATE, KIRAMEIGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_KIRAMEI_CHANGER = ITEMS.register("yellow_kiramei_changer",
            () -> new com.liasdan.supersentaicraft.items.sentai_50.kiramager.KiramagerChangerItem(ArmorMaterials.DIAMOND, "kiramei_yellow", YELLOW_KIRAMEI_STONE,
                    KIRAMEIGER_HELMET, KIRAMEIGER_CHESTPLATE, KIRAMEIGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> PINK_KIRAMEI_CHANGER = ITEMS.register("pink_kiramei_changer",
            () -> new com.liasdan.supersentaicraft.items.sentai_50.kiramager.KiramagerChangerItem(ArmorMaterials.DIAMOND, "kiramei_pink", PINK_KIRAMEI_STONE,
                    KIRAMEIGER_HELMET, KIRAMEIGER_CHESTPLATE, KIRAMEIGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> SHINY_KIRAMEI_CHANGER = ITEMS.register("shiny_kiramei_changer",
            () -> new com.liasdan.supersentaicraft.items.sentai_50.kiramager.KiramagerChangerItem(ArmorMaterials.DIAMOND, "kiramei_silver", SHINY_KIRAMEI_STONE,
                    KIRAMEIGER_HELMET, KIRAMEIGER_CHESTPLATE, KIRAMEIGER_LEGGINGS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(DARK_KIRAMEI_STONE)
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> YODON_CHANGER = ITEMS.register("yodon_changer",
            () -> new com.liasdan.supersentaicraft.items.sentai_50.kiramager.KiramagerChangerItem(ArmorMaterials.DIAMOND, "dark_kiramei_silver", DARK_KIRAMEI_STONE,
                    KIRAMEIGER_HELMET, KIRAMEIGER_CHESTPLATE, KIRAMEIGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> GOLD_KIRAFUL_GO_ARROW = ITEMS.register("gold_kiraful_go_arrow",
            () -> new com.liasdan.supersentaicraft.items.sentai_50.kiramager.KiramagerChangerItem(ArmorMaterials.DIAMOND, "kiramei_gold", GOLD_KIRAMEI_STONE,
                    KIRAMEIGER_HELMET, KIRAMEIGER_CHESTPLATE, KIRAMEIGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));

    // 5. Weapons & Mechas
    public static final DeferredItem<Item> KIRAMEI_BUSTER = ITEMS.register("kiramei_buster",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> KIRAMEI_SHOT = ITEMS.register("kiramei_shot",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> KIRAMEI_SWORD = ITEMS.register("kiramei_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_STONE_HAMMER = ITEMS.register("yellow_stone_hammer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 8, -3.0F, new Item.Properties())
                    .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get()));
    public static final DeferredItem<Item> SHINY_BREAKER = ITEMS.register("shiny_breaker", KiramagerItems::createShinyBreaker);
    public static final DeferredItem<Item> SHINY_BREAKER_TOOL = ITEMS.register("shiny_breaker_tool", KiramagerItems::createShinyBreakerTool);

    private static Item createShinyBreaker() {
        return new BaseBlasterItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).IsSwordGun()
                .IsDualWeapon().KeepDifItemSupplier(() -> SHINY_BREAKER_TOOL.get())
                .AddToTabList(RangerTabs.KIRAMEIGER).ChangeRepairItem(KIRAMEIGER_LOGO.get());
    }

    private static Item createShinyBreakerTool() {
        return new ShinyBreakerToolItem(Tiers.DIAMOND, new Item.Properties())
                .IsDualWeapon().KeepDifItemSupplier(() -> SHINY_BREAKER.get())
                .AddToTabList(RangerTabs.KIRAMEIGER);
    }

public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
