package com.liasdan.supersentaicraft.items.sentai_30;

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

public class GoseigerItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

    // 1. Logo
    public static final DeferredItem<Item> GOSEIGER_LOGO = ITEMS.register("goseiger_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOSEIGER));

    // 2. Forms (Gosei Cards)
    public static final DeferredItem<Item> GOSEI_CARD_RED = ITEMS.register("gosei_card_red",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "gosei_red", "goseiger_belt")
                    .ChangeBeltModel("rangerbelt2.geo.json")
                    .ChangeRangerName("gosei_red")
                    .AddToTabList(RangerTabs.GOSEIGER));

    // 3. Armor
    public static final DeferredItem<Item> GOSEIGER_HELMET = ITEMS.register("goseiger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                    .AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(GOSEIGER_LOGO.get()));
    public static final DeferredItem<Item> GOSEIGER_CHESTPLATE = ITEMS.register("goseiger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
                    .AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(GOSEIGER_LOGO.get()));
    public static final DeferredItem<Item> GOSEIGER_LEGGINGS = ITEMS.register("goseiger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(GOSEIGER_LOGO.get()));

    // 4. Changer
    public static final DeferredItem<Item> TENSOUDER = ITEMS.register("tensouder",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "gosei_red", GOSEI_CARD_RED,
                    GOSEIGER_HELMET, GOSEIGER_CHESTPLATE, GOSEIGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.GOSEIGER).ChangeRepairItem(GOSEIGER_LOGO.get()));

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
