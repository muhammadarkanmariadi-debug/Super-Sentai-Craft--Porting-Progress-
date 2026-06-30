package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.OtherItems;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MagirangerItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

    // 1. Logo
    public static final DeferredItem<Item> MAGIRANGER_LOGO = ITEMS.register("magiranger_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MAGIRANGER));

    // 2. Armor
    public static final DeferredItem<Item> MAGIRANGER_HELMET = ITEMS.register("magiranger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                    .AddToTabList(RangerTabs.MAGIRANGER).ChangeRepairItem(MAGIRANGER_LOGO.get()));
    public static final DeferredItem<Item> MAGIRANGER_CHESTPLATE = ITEMS.register("magiranger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
                    .AddToTabList(RangerTabs.MAGIRANGER).ChangeRepairItem(MAGIRANGER_LOGO.get()));
    public static final DeferredItem<Item> MAGIRANGER_LEGGINGS = ITEMS.register("magiranger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.MAGIRANGER).ChangeRepairItem(MAGIRANGER_LOGO.get()));

    // 3. Changers
    public static final DeferredItem<Item> MAGIPHONE_RED = ITEMS.register("magiphone_red",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "magi_red", OtherItems.BLANK_FORM,
                    MAGIRANGER_HELMET, MAGIRANGER_CHESTPLATE, MAGIRANGER_LEGGINGS, new Item.Properties())
                    .Override_belt_text("magiranger_belt")
                    .Override_belt_model("rangerbelt2.geo.json")
                    .AddToTabList(RangerTabs.MAGIRANGER).ChangeRepairItem(MAGIRANGER_LOGO.get()));

    public static final DeferredItem<Item> MAGIPHONE_GREEN = ITEMS.register("magiphone_green",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "magi_green", OtherItems.BLANK_FORM,
                    MAGIRANGER_HELMET, MAGIRANGER_CHESTPLATE, MAGIRANGER_LEGGINGS, new Item.Properties())
                    .Override_belt_text("magiranger_belt")
                    .Override_belt_model("rangerbelt2.geo.json")
                    .AddToTabList(RangerTabs.MAGIRANGER).ChangeRepairItem(MAGIRANGER_LOGO.get()));

    public static final DeferredItem<Item> MAGIPHONE_RED_PLATE = ITEMS.register("magiphone_red_plate",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MAGIRANGER));
    public static final DeferredItem<Item> MAGIPHONE_GREEN_PLATE = ITEMS.register("magiphone_green_plate",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MAGIRANGER));

    // 4. Weapons
    public static final DeferredItem<SwordItem> MAGI_STICK_SWORD = ITEMS.register("magi_stick_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                    .AddToTabList(RangerTabs.MAGIRANGER).ChangeRepairItem(MAGIRANGER_LOGO.get()));

    public static final DeferredItem<Item> MAGI_STICK_RED = ITEMS.register("magi_stick_red",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MAGIRANGER));

    public static final DeferredItem<SwordItem> MAGI_STICK_AXE = ITEMS.register("magi_stick_axe",
            () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.8F, new Item.Properties())
                    .AddToTabList(RangerTabs.MAGIRANGER).ChangeRepairItem(MAGIRANGER_LOGO.get()));

    public static final DeferredItem<Item> MAGI_STICK_GREEN = ITEMS.register("magi_stick_green",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MAGIRANGER));

    public static final DeferredItem<SwordItem> MAGI_PUNCH = ITEMS.register("magi_punch",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.0F, new Item.Properties())
                    .AddToTabList(RangerTabs.MAGIRANGER).ChangeRepairItem(MAGIRANGER_LOGO.get()));
                    
    public static final DeferredItem<SwordItem> MAGI_PUNCH_ACTIVE = ITEMS.register("magi_punch_active",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.0F, new Item.Properties())
                    .AddToTabList(RangerTabs.MAGIRANGER).ChangeRepairItem(MAGIRANGER_LOGO.get()));

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
