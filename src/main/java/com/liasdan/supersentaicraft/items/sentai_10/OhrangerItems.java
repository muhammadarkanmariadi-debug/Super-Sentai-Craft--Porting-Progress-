package com.liasdan.supersentaicraft.items.sentai_10;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class OhrangerItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

    // 1. Logo & Collectibles
    public static final DeferredItem<Item> OHRANGER_LOGO = ITEMS.register("ohranger_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.OHRANGER));

    public static final DeferredItem<Item> OHRANGER_POWER_COIN = ITEMS.register("ohranger_power_coin",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.OHRANGER));

    public static final DeferredItem<Item> OHRANGER_CRYSTAL_SHARD = ITEMS.register("ohranger_crystal_shard",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.OHRANGER));

    // 2. Forms (Storage Crystals)
    public static final DeferredItem<Item> STORAGE_CRYSTAL_RED = ITEMS.register("storage_crystal_red",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "oh_red", "ohranger_belt")
                    .ChangeRangerName("oh_red")
                    .AddToTabList(RangerTabs.OHRANGER));

    public static final DeferredItem<Item> STORAGE_CRYSTAL_YELLOW = ITEMS.register("storage_crystal_yellow",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "oh_yellow", "ohranger_belt")
                  
                    .ChangeRangerName("oh_yellow")
                    .AddToTabList(RangerTabs.OHRANGER));

    // 3. Armor
    public static final DeferredItem<Item> OHRANGER_HELMET = ITEMS.register("ohranger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                    .AddToTabList(RangerTabs.OHRANGER).ChangeRepairItem(OHRANGER_LOGO.get()));
    public static final DeferredItem<Item> OHRANGER_CHESTPLATE = ITEMS.register("ohranger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
                    .AddToTabList(RangerTabs.OHRANGER).ChangeRepairItem(OHRANGER_LOGO.get()));
    public static final DeferredItem<Item> OHRANGER_LEGGINGS = ITEMS.register("ohranger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.OHRANGER).ChangeRepairItem(OHRANGER_LOGO.get()));

    // 4. Changers
    public static final DeferredItem<Item> POWER_BRACE_RED = ITEMS.register("power_brace",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "oh_red", STORAGE_CRYSTAL_RED,
                    OHRANGER_HELMET, OHRANGER_CHESTPLATE, OHRANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.OHRANGER).ChangeRepairItem(OHRANGER_LOGO.get()));

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
