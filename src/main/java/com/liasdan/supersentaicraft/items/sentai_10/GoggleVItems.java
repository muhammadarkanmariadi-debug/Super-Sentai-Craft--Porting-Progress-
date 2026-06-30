package com.liasdan.supersentaicraft.items.sentai_10;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.particle.ModParticles;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.liasdan.supersentaicraft.items.sentai_10.goggle_v.GoggleBraceItem;
public class GoggleVItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);


    // Logo and Collectibles
        // 1. Logo
        // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    public static final DeferredItem<Item> GOGGLE_V_LOGO = ITEMS.register("goggle_v_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V));

    // 2. Collectibles
    public static final DeferredItem<Item> ATLANTIS_RUBY = ITEMS.register("atlantis_ruby",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V));
    public static final DeferredItem<Item> ANGKOR_WAT_EMERALD = ITEMS.register("angkor_wat_emerald",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V));
    public static final DeferredItem<Item> EGYPT_SAPHIRE = ITEMS.register("egypt_saphire",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V));
    public static final DeferredItem<Item> LEMURIA_OPAL = ITEMS.register("lemuria_opal",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V));
    public static final DeferredItem<Item> MAYAN_DIAMOND = ITEMS.register("mayan_diamond",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V));

    // 3. Armors
    public static final DeferredItem<Item> GOGGLE_V_HELMET = ITEMS.register("goggle_v_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> GOGGLE_V_CHESTPLATE = ITEMS.register("goggle_v_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> GOGGLE_V_LEGGINGS = ITEMS.register("goggle_v_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));

    // 4. Changers & Form Items
    public static final DeferredItem<Item> RED_GOGGLE_BRACE = ITEMS.register("red_goggle_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.goggle_v.GoggleBraceItem(ArmorMaterials.DIAMOND, "goggle_red", OtherItems.BLANK_FORM, GOGGLE_V_HELMET, GOGGLE_V_CHESTPLATE, GOGGLE_V_LEGGINGS, new Item.Properties(), () -> ModParticles.RED_MORPHIN_PARTICLES.get(),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false)).Override_belt_text("goggle_v_belt").AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> BLACK_GOGGLE_BRACE = ITEMS.register("black_goggle_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.goggle_v.GoggleBraceItem(ArmorMaterials.DIAMOND, "goggle_black", OtherItems.BLANK_FORM, GOGGLE_V_HELMET, GOGGLE_V_CHESTPLATE, GOGGLE_V_LEGGINGS, new Item.Properties(), () -> ModParticles.BLACK_SPARK_PARTICLES.get(),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false)).Override_belt_text("goggle_v_belt").AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> BLUE_GOGGLE_BRACE = ITEMS.register("blue_goggle_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.goggle_v.GoggleBraceItem(ArmorMaterials.DIAMOND, "goggle_blue", OtherItems.BLANK_FORM, GOGGLE_V_HELMET, GOGGLE_V_CHESTPLATE, GOGGLE_V_LEGGINGS, new Item.Properties(), () -> ModParticles.BLUE_MORPHIN_PARTICLES.get(),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false)).Override_belt_text("goggle_v_belt").AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_GOGGLE_BRACE = ITEMS.register("yellow_goggle_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.goggle_v.GoggleBraceItem(ArmorMaterials.DIAMOND, "goggle_yellow", OtherItems.BLANK_FORM, GOGGLE_V_HELMET, GOGGLE_V_CHESTPLATE, GOGGLE_V_LEGGINGS, new Item.Properties(), () -> ModParticles.YELLOW_MORPHIN_PARTICLES.get(),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false)).Override_belt_text("goggle_v_belt").AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> PINK_GOGGLE_BRACE = ITEMS.register("pink_goggle_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.goggle_v.GoggleBraceItem(ArmorMaterials.DIAMOND, "goggle_pink", OtherItems.BLANK_FORM, GOGGLE_V_HELMET, GOGGLE_V_CHESTPLATE, GOGGLE_V_LEGGINGS, new Item.Properties(), () -> ModParticles.PINK_SPARK_PARTICLES.get(),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false)).Override_belt_text("goggle_v_belt").AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));

    // 5. Weapons
    public static final DeferredItem<Item> GOGGLE_SABRE = ITEMS.register("goggle_sabre",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> GOGGLE_GOLDEN_SPEAR = ITEMS.register("goggle_golden_spear",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> RED_HAMMER = ITEMS.register("red_hammer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> RED_RIBBON = ITEMS.register("red_ribbon",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> BLACK_CLUB = ITEMS.register("black_club",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> BLACK_EMERALD_NUNCHUCK = ITEMS.register("black_emerald_nunchuck",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> BLACK_HAMMER = ITEMS.register("black_hammer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> BLACK_RIBBON = ITEMS.register("black_ribbon",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> BLUE_HAMMER = ITEMS.register("blue_hammer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> BLUE_RIBBON = ITEMS.register("blue_ribbon",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_HAMMER = ITEMS.register("yellow_hammer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_RIBBON = ITEMS.register("yellow_ribbon",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> PINK_HAMMER = ITEMS.register("pink_hammer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));
    public static final DeferredItem<Item> PINK_RIBBON = ITEMS.register("pink_ribbon",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOGGLE_V).ChangeRepairItem(GOGGLE_V_LOGO.get()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
