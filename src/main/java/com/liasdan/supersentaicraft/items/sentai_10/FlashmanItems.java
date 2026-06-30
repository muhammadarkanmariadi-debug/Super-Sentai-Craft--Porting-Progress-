package com.liasdan.supersentaicraft.items.sentai_10;

import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseShieldItem;
import net.minecraft.world.item.Tiers;


import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.liasdan.supersentaicraft.items.sentai_10.flashman.PrismFlashItem;
public class FlashmanItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);


    // Logo and Collectibles
        // 1. Logo
        // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    public static final DeferredItem<Item> FLASHMAN_LOGO = ITEMS.register("flashman_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.FLASHMAN));

    // 2. Collectibles
    public static final DeferredItem<Item> RED_FLASH_PRISM = ITEMS.register("red_flash_prism",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> GREEN_FLASH_PRISM = ITEMS.register("green_flash_prism",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> BLUE_FLASH_PRISM = ITEMS.register("blue_flash_prism",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> YELLOW_FLASH_PRISM = ITEMS.register("yellow_flash_prism",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> PINK_FLASH_PRISM = ITEMS.register("pink_flash_prism",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> PRISM_SHOOTER_SHIELD = ITEMS.register("prism_shooter_shield",
            () -> new BaseShieldItem(new Item.Properties()).ChangeRepairItem(FLASHMAN_LOGO.get()).AddToTabList(RangerTabs.FLASHMAN));

    // 3. Armors
    public static final DeferredItem<Item> FLASHMAN_HELMET = ITEMS.register("flashman_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.FLASHMAN).ChangeRepairItem(FLASHMAN_LOGO.get()));
    public static final DeferredItem<Item> FLASHMAN_CHESTPLATE = ITEMS.register("flashman_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.FLASHMAN).ChangeRepairItem(FLASHMAN_LOGO.get()));
    public static final DeferredItem<Item> FLASHMAN_LEGGINGS = ITEMS.register("flashman_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.FLASHMAN).ChangeRepairItem(FLASHMAN_LOGO.get()));

    // 4. Changers & Form Items
    public static final DeferredItem<Item> RED_PRISM_FLASH = ITEMS.register("red_prism_flash",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.flashman.PrismFlashItem(ArmorMaterials.DIAMOND, "red_flash", OtherItems.BLANK_FORM, FLASHMAN_HELMET, FLASHMAN_CHESTPLATE, FLASHMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3, true, false)).Override_belt_text("flashman_belt").AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> GREEN_PRISM_FLASH = ITEMS.register("green_prism_flash",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.flashman.PrismFlashItem(ArmorMaterials.DIAMOND, "green_flash", OtherItems.BLANK_FORM, FLASHMAN_HELMET, FLASHMAN_CHESTPLATE, FLASHMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4, true, false)).Override_belt_text("flashman_belt").AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> BLUE_PRISM_FLASH = ITEMS.register("blue_prism_flash",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.flashman.PrismFlashItem(ArmorMaterials.DIAMOND, "blue_flash", OtherItems.BLANK_FORM, FLASHMAN_HELMET, FLASHMAN_CHESTPLATE, FLASHMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false)).Override_belt_text("flashman_belt").AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> YELLOW_PRISM_FLASH = ITEMS.register("yellow_prism_flash",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.flashman.PrismFlashItem(ArmorMaterials.DIAMOND, "yellow_flash", OtherItems.BLANK_FORM, FLASHMAN_HELMET, FLASHMAN_CHESTPLATE, FLASHMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false)).Override_belt_text("flashman_belt").AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> PINK_PRISM_FLASH = ITEMS.register("pink_prism_flash",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.flashman.PrismFlashItem(ArmorMaterials.DIAMOND, "pink_flash", OtherItems.BLANK_FORM, FLASHMAN_HELMET, FLASHMAN_CHESTPLATE, FLASHMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false)).Override_belt_text("flashman_belt").AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> PRISM_KAIZER = ITEMS.register("prism_kaizer",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "_kaizer", "green_flash", new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5, true, false)).AddCompatibilityList(new String[]{"green_flash"}).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> PRISM_BOOTS = ITEMS.register("prism_boots",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "_boots", "pink_flash", new MobEffectInstance(MobEffects.JUMP, 40, 4, true, false)).AddCompatibilityList(new String[]{"pink_flash"}).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> FLASH_KING = ITEMS.register("flash_king",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "flash_king", "blank",
                    new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0, true, false)));

    // 5. Weapons & Mechas
    public static final DeferredItem<Item> FLASH_KING_BOOTS = ITEMS.register("flash_king_boots",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> FLASH_KING_LEGGINGS = ITEMS.register("flash_king_legs",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> FLASH_KING_CHESTPLATE = ITEMS.register("flash_king_torso",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> FLASH_KING_HELMET = ITEMS.register("flash_king_head",
            () -> new MechaGattaiItem(ArmorMaterials.NETHERITE, "flash_king", FLASH_KING, FLASH_KING_CHESTPLATE, FLASH_KING_LEGGINGS, FLASH_KING_BOOTS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> PRISM_SHOOTER = ITEMS.register("prism_shooter",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(FLASHMAN_LOGO.get()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> PRISM_SHOOTER_GUN = ITEMS.register("prism_shooter_gun",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(FLASHMAN_LOGO.get()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> PRISM_HOLY_SWORD = ITEMS.register("prism_holy_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(FLASHMAN_LOGO.get()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> PRISM_BATONS = ITEMS.register("prism_batons",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(FLASHMAN_LOGO.get()).AddToTabList(RangerTabs.FLASHMAN));
    public static final DeferredItem<Item> STAR_DARTS = ITEMS.register("star_darts",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(FLASHMAN_LOGO.get()).AddToTabList(RangerTabs.FLASHMAN));

public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
