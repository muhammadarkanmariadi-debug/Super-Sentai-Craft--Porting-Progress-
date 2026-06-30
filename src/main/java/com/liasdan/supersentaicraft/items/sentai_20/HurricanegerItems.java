package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class HurricanegerItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

    // 1. Logo
    public static final DeferredItem<Item> HURRICANEGER_LOGO = ITEMS.register("hurricaneger_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.HURRICANEGER));

    // 2. Forms
    public static final DeferredItem<Item> SHINOBI_MEDAL_RED = ITEMS.register("shinobi_medal_red",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "hurricane_red", "hurricane_red_belt")
                    .ChangeBeltModel("rangerbelt2.geo.json")
                    .ChangeRangerName("hurricane_red")
                    .AddToTabList(RangerTabs.HURRICANEGER));

    public static final DeferredItem<Item> SHINOBI_MEDAL_BLUE = ITEMS.register("shinobi_medal_blue",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "hurricane_blue", "hurricane_blue_belt")
                    .ChangeBeltModel("rangerbelt2.geo.json")
                    .ChangeRangerName("hurricane_blue")
                    .AddToTabList(RangerTabs.HURRICANEGER));

    public static final DeferredItem<Item> SHURIKENGER_FIRE_MEDAL = ITEMS.register("shurikenger_fire_medal",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "shurikenger_fire_mode", "blank")
                    .ChangeRangerName("shurikenger_fire_mode")
                    .addSwitchForm(OtherItems.BLANK_FORM.get()));

    public static final DeferredItem<Item> SHURIKENGER_MEDAL = ITEMS.register("shurikenger_medal",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "shurikenger", "shurikenger_belt")
                    .ChangeRangerName("shurikenger")
                    .addAlternative(SHURIKENGER_FIRE_MEDAL.get())
                    .AddToTabList(RangerTabs.HURRICANEGER));

    // 3. Armor
    public static final DeferredItem<Item> HURRICANEGER_HELMET = ITEMS.register("hurricaneger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                    .AddToTabList(RangerTabs.HURRICANEGER).ChangeRepairItem(HURRICANEGER_LOGO.get()));
    public static final DeferredItem<Item> HURRICANEGER_CHESTPLATE = ITEMS.register("hurricaneger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
                    .AddToTabList(RangerTabs.HURRICANEGER).ChangeRepairItem(HURRICANEGER_LOGO.get()));
    public static final DeferredItem<Item> HURRICANEGER_LEGGINGS = ITEMS.register("hurricaneger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.HURRICANEGER).ChangeRepairItem(HURRICANEGER_LOGO.get()));

    // 4. Changers
    public static final DeferredItem<Item> HURRICANE_GYROTE_RED = ITEMS.register("hurricane_gyrote_red",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "hurricane_red", SHINOBI_MEDAL_RED,
                    HURRICANEGER_HELMET, HURRICANEGER_CHESTPLATE, HURRICANEGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.HURRICANEGER).ChangeRepairItem(HURRICANEGER_LOGO.get()));

    public static final DeferredItem<Item> HURRICANE_GYROTE_BLUE = ITEMS.register("hurricane_gyrote_blue",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "hurricane_blue", SHINOBI_MEDAL_BLUE,
                    HURRICANEGER_HELMET, HURRICANEGER_CHESTPLATE, HURRICANEGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.HURRICANEGER).ChangeRepairItem(HURRICANEGER_LOGO.get()));

    public static final DeferredItem<Item> SHURIKENBALL = ITEMS.register("shurikenball",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "shurikenger", SHURIKENGER_MEDAL,
                    HURRICANEGER_HELMET, HURRICANEGER_CHESTPLATE, HURRICANEGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.HURRICANEGER).ChangeRepairItem(HURRICANEGER_LOGO.get()));

    // 5. Weapons
    public static final DeferredItem<Item> DRY_GUN = ITEMS.register("dry_gun",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                    .setProjectile(BaseBlasterItem.BlasterProjectile.WIND_CHARGE)
                    .AddToTabList(RangerTabs.HURRICANEGER).ChangeRepairItem(HURRICANEGER_LOGO.get()));

    public static final DeferredItem<Item> HAYATEMARU = ITEMS.register("hayatemaru", HurricanegerItems::createHayatemaru);
    public static final DeferredItem<Item> HAYATEMARU_BLASTER = ITEMS.register("hayatemaru_blaster", HurricanegerItems::createHayatemaruBlaster);

    private static Item createHayatemaru() {
        return new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                .IsDualWeapon().KeepDifItemSupplier(() -> HAYATEMARU_BLASTER.get())
                .AddToTabList(RangerTabs.HURRICANEGER).ChangeRepairItem(HURRICANEGER_LOGO.get());
    }

    private static Item createHayatemaruBlaster() {
        return new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                .IsSwordGun().IsDualWeapon().KeepDifItemSupplier(() -> HAYATEMARU.get())
                .AddToTabList(RangerTabs.HURRICANEGER).ChangeRepairItem(HURRICANEGER_LOGO.get());
    }

    public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
