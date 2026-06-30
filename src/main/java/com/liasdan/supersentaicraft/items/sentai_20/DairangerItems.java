package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_20.dairanger.AuraChangerItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import com.liasdan.supersentaicraft.effect.EffectCore;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DairangerItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

    // Logo and Collectibles
    // 1. Logo
    public static final DeferredItem<Item> DAIRANGER_LOGO = ITEMS.register("dairanger_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DAIRANGER));

    // 2. Collectibles
    public static final DeferredItem<Item> RED_LAILAI_JEWEL = ITEMS.register("red_lailai_jewel",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> GREEN_LAILAI_JEWEL = ITEMS.register("green_lailai_jewel",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> BLUE_LAILAI_JEWEL = ITEMS.register("blue_lailai_jewel",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> YELLOW_LAILAI_JEWEL = ITEMS.register("yellow_lailai_jewel",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> PINK_LAILAI_JEWEL = ITEMS.register("pink_lailai_jewel",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> WHITE_LAILAI_JEWEL = ITEMS.register("white_lailai_jewel",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> DAIRANGER_BELT = ITEMS.register("dairanger_belt",
            () -> new BaseItem(new Item.Properties()));

    // 3. Armors
    public static final DeferredItem<Item> DAIRANGER_HELMET = ITEMS.register("dairanger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                    .AddToTabList(RangerTabs.DAIRANGER).ChangeRepairItem(DAIRANGER_LOGO.get()));
    public static final DeferredItem<Item> DAIRANGER_CHESTPLATE = ITEMS.register("dairanger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
                    .AddToTabList(RangerTabs.DAIRANGER).ChangeRepairItem(DAIRANGER_LOGO.get()));
    public static final DeferredItem<Item> DAIRANGER_LEGGINGS = ITEMS.register("dairanger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.DAIRANGER).ChangeRepairItem(DAIRANGER_LOGO.get()));

    // 4. Changers & Form Items
    public static final DeferredItem<Item> RYUU_FORM = ITEMS.register("ryuu_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "ryuu_ranger", "dairanger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                    new MobEffectInstance(EffectCore.FIREPUNCH, 40, 1, true, false))
                    .ChangeBeltModel("dairanger_belt.geo.json"));
    public static final DeferredItem<Item> SHISHI_FORM = ITEMS.register("shishi_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "shishi_ranger", "dairanger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                    new MobEffectInstance(EffectCore.FIREPUNCH, 40, 1, true, false))
                    .ChangeBeltModel("dairanger_belt.geo.json"));
    public static final DeferredItem<Item> TENMA_FORM = ITEMS.register("tenma_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "tenma_ranger", "dairanger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                    new MobEffectInstance(EffectCore.FIREPUNCH, 40, 1, true, false))
                    .ChangeBeltModel("dairanger_belt.geo.json"));
    public static final DeferredItem<Item> KIRIN_FORM = ITEMS.register("kirin_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kirin_ranger", "dairanger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                    new MobEffectInstance(EffectCore.FIREPUNCH, 40, 1, true, false))
                    .ChangeBeltModel("dairanger_belt.geo.json"));
    public static final DeferredItem<Item> HOUOU_FORM = ITEMS.register("houou_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "houou_ranger", "dairanger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                    new MobEffectInstance(EffectCore.FIREPUNCH, 40, 1, true, false))
                    .ChangeBeltModel("dairanger_belt.geo.json"));
    public static final DeferredItem<Item> KIBA_FORM = ITEMS.register("kiba_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiba_ranger", "kiba_belt",
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                    new MobEffectInstance(EffectCore.FIREPUNCH, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false))
                    .ChangeBeltModel("dairanger_belt.geo.json"));

    public static final DeferredItem<Item> RYUU_AURA_CHANGER = ITEMS.register("ryuu_aura_changer",
            () -> new AuraChangerItem(ArmorMaterials.DIAMOND, "ryuu_ranger", RYUU_FORM, DAIRANGER_HELMET, DAIRANGER_CHESTPLATE, DAIRANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.DAIRANGER).ChangeRepairItem(DAIRANGER_LOGO.get()));
    public static final DeferredItem<Item> SHISHI_AURA_CHANGER = ITEMS.register("shishi_aura_changer",
            () -> new AuraChangerItem(ArmorMaterials.DIAMOND, "shishi_ranger", SHISHI_FORM, DAIRANGER_HELMET, DAIRANGER_CHESTPLATE, DAIRANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.DAIRANGER).ChangeRepairItem(DAIRANGER_LOGO.get()));
    public static final DeferredItem<Item> TENMA_AURA_CHANGER = ITEMS.register("tenma_aura_changer",
            () -> new AuraChangerItem(ArmorMaterials.DIAMOND, "tenma_ranger", TENMA_FORM, DAIRANGER_HELMET, DAIRANGER_CHESTPLATE, DAIRANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.DAIRANGER).ChangeRepairItem(DAIRANGER_LOGO.get()));
    public static final DeferredItem<Item> KIRIN_AURA_CHANGER = ITEMS.register("kirin_aura_changer",
            () -> new AuraChangerItem(ArmorMaterials.DIAMOND, "kirin_ranger", KIRIN_FORM, DAIRANGER_HELMET, DAIRANGER_CHESTPLATE, DAIRANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.DAIRANGER).ChangeRepairItem(DAIRANGER_LOGO.get()));
    public static final DeferredItem<Item> HOUOU_AURA_CHANGER = ITEMS.register("houou_aura_changer",
            () -> new AuraChangerItem(ArmorMaterials.DIAMOND, "houou_ranger", HOUOU_FORM, DAIRANGER_HELMET, DAIRANGER_CHESTPLATE, DAIRANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.DAIRANGER).ChangeRepairItem(DAIRANGER_LOGO.get()));
    public static final DeferredItem<Item> KIBA_CHANGER = ITEMS.register("kiba_changer",
            () -> new AuraChangerItem(ArmorMaterials.DIAMOND, "kiba_ranger", KIBA_FORM, DAIRANGER_HELMET, DAIRANGER_CHESTPLATE, DAIRANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.DAIRANGER).ChangeRepairItem(DAIRANGER_LOGO.get()));

    // 5. Weapons & Mechas
    public static final DeferredItem<Item> STAR_CUTTER = ITEMS.register("star_cutter",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> STAR_SWORD = ITEMS.register("star_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> DAI_BUSTER = ITEMS.register("dai_buster",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> DAIREN_ROD_RYUU = ITEMS.register("dairen_rod_ryuu",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> DAIREN_ROD_SHISHI = ITEMS.register("dairen_rod_shishi",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> DAIREN_ROD_TENMA = ITEMS.register("dairen_rod_tenma",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> DAIREN_ROD_KIRIN = ITEMS.register("dairen_rod_kirin",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> DAIREN_ROD_HOUOU = ITEMS.register("dairen_rod_houou",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> DRAGON_SWORD = ITEMS.register("dragon_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> LION_CUDGEL = ITEMS.register("lion_cudgel",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> PEGASUS_NUNCHUCK = ITEMS.register("pegasus_nunchuck",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> KIRIN_9_PART_WHIP = ITEMS.register("kirin_9_part_whip",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> PHOENIX_SPEAR = ITEMS.register("phoenix_spear",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> DAIRINKEN = ITEMS.register("dairinken",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));
    public static final DeferredItem<Item> BYAKKOSHINKEN = ITEMS.register("byakkoshinken",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(DAIRANGER_LOGO.get()).AddToTabList(RangerTabs.DAIRANGER));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
