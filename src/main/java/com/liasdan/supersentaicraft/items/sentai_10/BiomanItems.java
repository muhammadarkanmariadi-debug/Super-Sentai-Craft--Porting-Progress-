package com.liasdan.supersentaicraft.items.sentai_10;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.effect.EffectCore;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.liasdan.supersentaicraft.items.sentai_10.bioman.TechnoBraceItem;
public class BiomanItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);


    // Logo and Collectibles
        // 1. Logo
        // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    public static final DeferredItem<Item> BIOMAN_LOGO = ITEMS.register("bioman_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BIOMAN));

    // 2. Collectibles
    public static final DeferredItem<Item> RED_BIO_PARTICLES = ITEMS.register("red_bio_particles",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BIOMAN));
    public static final DeferredItem<Item> GREEN_BIO_PARTICLES = ITEMS.register("green_bio_particles",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BIOMAN));
    public static final DeferredItem<Item> BLUE_BIO_PARTICLES = ITEMS.register("blue_bio_particles",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BIOMAN));
    public static final DeferredItem<Item> YELLOW_BIO_PARTICLES = ITEMS.register("yellow_bio_particles",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BIOMAN));
    public static final DeferredItem<Item> PINK_BIO_PARTICLES = ITEMS.register("pink_bio_particles",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BIOMAN));

    // 3. Armors
    public static final DeferredItem<Item> BIOMAN_HELMET = ITEMS.register("bioman_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> BIOMAN_CHESTPLATE = ITEMS.register("bioman_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> BIOMAN_LEGGINGS = ITEMS.register("bioman_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));

    // 4. Changers & Form Items
    public static final DeferredItem<Item> RED_TECHNO_BRACE = ITEMS.register("red_techno_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.bioman.TechnoBraceItem(ArmorMaterials.DIAMOND, "red_one", OtherItems.BLANK_FORM, BIOMAN_HELMET, BIOMAN_CHESTPLATE, BIOMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(EffectCore.SLASH, 40, 2, true, false)).Override_belt_text("bioman_belt").AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> GREEN_TECHNO_BRACE = ITEMS.register("green_techno_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.bioman.TechnoBraceItem(ArmorMaterials.DIAMOND, "green_two", OtherItems.BLANK_FORM, BIOMAN_HELMET, BIOMAN_CHESTPLATE, BIOMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false)).Override_belt_text("bioman_belt").AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> BLUE_TECHNO_BRACE = ITEMS.register("blue_techno_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.bioman.TechnoBraceItem(ArmorMaterials.DIAMOND, "blue_three", OtherItems.BLANK_FORM, BIOMAN_HELMET, BIOMAN_CHESTPLATE, BIOMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(EffectCore.BOOST, 40, 2, true, false)).Override_belt_text("bioman_belt").AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_TECHNO_BRACE = ITEMS.register("yellow_techno_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.bioman.TechnoBraceItem(ArmorMaterials.DIAMOND, "yellow_four", OtherItems.BLANK_FORM, BIOMAN_HELMET, BIOMAN_CHESTPLATE, BIOMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2, true, false)).Override_belt_text("bioman_belt").AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> PINK_TECHNO_BRACE = ITEMS.register("pink_techno_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.bioman.TechnoBraceItem(ArmorMaterials.DIAMOND, "pink_five", OtherItems.BLANK_FORM, BIOMAN_HELMET, BIOMAN_CHESTPLATE, BIOMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(EffectCore.PUNCH, 40, 2, true, false)).Override_belt_text("bioman_belt").AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> BIO_HUNTER_SILVA_CHANGER = ITEMS.register("bio_hunter_silva_changer",
            () -> new com.liasdan.supersentaicraft.items.sentai_10.bioman.TechnoBraceItem(ArmorMaterials.DIAMOND, "bio_hunter_silva", OtherItems.BLANK_FORM, BIOMAN_HELMET, BIOMAN_CHESTPLATE, BIOMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(EffectCore.SLASH, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2, true, false),
                    new MobEffectInstance(EffectCore.PUNCH, 40, 2, true, false)).Override_belt_text("bio_hunter_silva_belt").AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> BIO_ROBO = ITEMS.register("bio_robo",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "bio_robo", "blank",
                    new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0, true, false)));

    // 5. Weapons & Mechas
    public static final DeferredItem<Item> BIO_SWORD = ITEMS.register("bio_sword",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> FIRE_SWORD = ITEMS.register("fire_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> HURRICANE_SWORD = ITEMS.register("hurricane_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> ELEC_SWORD = ITEMS.register("elec_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> THUNDER_SWORD = ITEMS.register("thunder_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> LASER_SWORD = ITEMS.register("laser_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> BIO_ARROW = ITEMS.register("bio_arrow",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));
    public static final DeferredItem<Item> BI_BUSTER = ITEMS.register("bi_buster",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BIOMAN).ChangeRepairItem(BIOMAN_LOGO.get()));

    public static final DeferredItem<Item> BIO_ROBO_BOOTS = ITEMS.register("bio_robo_boots",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.BIOMAN));
    public static final DeferredItem<Item> BIO_ROBO_LEGGINGS = ITEMS.register("bio_robo_legs",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.BIOMAN));
    public static final DeferredItem<Item> BIO_ROBO_CHESTPLATE = ITEMS.register("bio_robo_torso",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.BIOMAN));
    public static final DeferredItem<Item> BIO_ROBO_HELMET = ITEMS.register("bio_robo_head",
            () -> new MechaGattaiItem(ArmorMaterials.NETHERITE, "bio_robo", BIO_ROBO, BIO_ROBO_CHESTPLATE, BIO_ROBO_LEGGINGS, BIO_ROBO_BOOTS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.BIOMAN));

public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
