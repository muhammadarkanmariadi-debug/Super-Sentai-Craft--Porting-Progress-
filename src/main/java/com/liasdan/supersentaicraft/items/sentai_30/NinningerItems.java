package com.liasdan.supersentaicraft.items.sentai_30;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
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

public class NinningerItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

    // 1. Logo
    public static final DeferredItem<Item> NINNINGER_LOGO = ITEMS.register("ninninger_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.NINNINGER));

    // 2. Armors
    public static final DeferredItem<Item> NINNINGER_HELMET = ITEMS.register("ninninger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                    .AddToTabList(RangerTabs.NINNINGER));
    public static final DeferredItem<Item> NINNINGER_CHESTPLATE = ITEMS.register("ninninger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
                    .AddToTabList(RangerTabs.NINNINGER));
    public static final DeferredItem<Item> NINNINGER_LEGGINGS = ITEMS.register("ninninger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.NINNINGER));

    // 3. Form Change Items
    public static final DeferredItem<Item> AKA_NINGER_SHURIKEN = ITEMS.register("aka_ninger_shuriken",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "aka_ninger", "ninja_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false))
                    .ChangeRangerName("aka_ninger")
                    .AddToTabList(RangerTabs.NINNINGER));

    public static final DeferredItem<Item> CHOUZETSU_SHOUBU_CHANGER = ITEMS.register("chouzetsu_shoubu_changer",
            () -> new RangerFormChangeItem(new Item.Properties(), 1, "", "chouzetsu_aka_ninger", "ninja_belt")
                    .ChangeRangerName("chouzetsu_aka_ninger")
                    .AddToTabList(RangerTabs.NINNINGER));
    
    public static final DeferredItem<Item> DRIVE_SHURIKEN = ITEMS.register("drive_shuriken",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.NINNINGER));

    // 4. Changers
    public static final DeferredItem<Item> AKA_NINJA_ICHIBANTOU = ITEMS.register("aka_ninja_ichibantou",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "aka_ninger", AKA_NINGER_SHURIKEN,
                    NINNINGER_HELMET, NINNINGER_CHESTPLATE, NINNINGER_LEGGINGS,
                    new Item.Properties())
                    .AddToTabList(RangerTabs.NINNINGER));

    // 5. Weapons & Equipment
    public static final DeferredItem<Item> GAMA_GAMA_GUN = ITEMS.register("gama_gama_gun",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(NINNINGER_LOGO.get()).AddToTabList(RangerTabs.NINNINGER));
                    
    public static final DeferredItem<Item> NINJA_ICHIBANTOU = ITEMS.register("ninja_ichibantou",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(NINNINGER_LOGO.get()).AddToTabList(RangerTabs.NINNINGER));

    public static final DeferredItem<Item> KARAKURI_HENGEN = ITEMS.register("karakuri_hengen",
            () -> new BaseThrowableItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(NINNINGER_LOGO.get()).AddToTabList(RangerTabs.NINNINGER));
                    
    public static final DeferredItem<Item> KARAKURI_HENGEN_SWORD = ITEMS.register("karakuri_hengen_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(NINNINGER_LOGO.get()).AddToTabList(RangerTabs.NINNINGER));
                    
    public static final DeferredItem<Item> KARAKURI_HENGEN_BOW = ITEMS.register("karakuri_hengen_bow",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(NINNINGER_LOGO.get()).AddToTabList(RangerTabs.NINNINGER));
                    
    public static final DeferredItem<Item> KARAKURI_HENGEN_CLAW = ITEMS.register("karakuri_hengen_claw",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(NINNINGER_LOGO.get()).AddToTabList(RangerTabs.NINNINGER));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
