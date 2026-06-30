package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.particle.ModParticles;
import net.minecraft.world.item.Tiers;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import com.liasdan.supersentaicraft.effect.EffectCore;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem;

public class JetmanItems {

        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // Logo and Collectibles
        // 1. Logo
        // 1. Logo

        // Logo and Collectibles
        // 1. Logo

        // Logo and Collectibles
        // 1. Logo
        public static final DeferredItem<Item> JETMAN_LOGO = ITEMS.register("jetman_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.JETMAN));

        // 2. Collectibles
        public static final DeferredItem<Item> RED_HAWK_WING = ITEMS.register("red_hawk_wing",
                        () -> new BaseItem(new Item.Properties()));
        public static final DeferredItem<Item> BLACK_CONDOR_WING = ITEMS.register("black_condor_wing",
                        () -> new BaseItem(new Item.Properties()));
        public static final DeferredItem<Item> YELLOW_OWL_WING = ITEMS.register("yellow_owl_wing",
                        () -> new BaseItem(new Item.Properties()));
        public static final DeferredItem<Item> WHITE_SWAN_WING = ITEMS.register("white_swan_wing",
                        () -> new BaseItem(new Item.Properties()));
        public static final DeferredItem<Item> BLUE_SWALLOW_WING = ITEMS.register("blue_swallow_wing",
                        () -> new BaseItem(new Item.Properties()));
        public static final DeferredItem<Item> JETMAN_BELT = ITEMS.register("jetman_belt",
                        () -> new BaseItem(new Item.Properties()));
        public static final DeferredItem<Item> BIRDONIC_WAVE = ITEMS.register("birdonic_wave",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.JETMAN));
        public static final DeferredItem<Item> HAWK_BIRDONIC_WAVE = ITEMS.register("hawk_birdonic_wave",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "red_hawk", "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .ifFlyingModelResource("jetman_wing.geo.json")
                                        .AddToTabList(RangerTabs.JETMAN));
        public static final DeferredItem<Item> CONDOR_BIRDONIC_WAVE = ITEMS.register("condor_birdonic_wave",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "black_condor", "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .ifFlyingModelResource("jetman_wing.geo.json")
                                        .AddToTabList(RangerTabs.JETMAN));
        public static final DeferredItem<Item> OWL_BIRDONIC_WAVE = ITEMS.register("owl_birdonic_wave",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "yellow_owl", "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .ifFlyingModelResource("jetman_wing.geo.json")
                                        .AddToTabList(RangerTabs.JETMAN));
        public static final DeferredItem<Item> SWAN_BIRDONIC_WAVE = ITEMS.register("swan_birdonic_wave",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "white_swan", "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .ifFlyingModelResource("jetman_wing.geo.json")
                                        .AddToTabList(RangerTabs.JETMAN));

        public static final DeferredItem<Item> SWALLOW_BIRDONIC_WAVE = ITEMS.register("swallow_birdonic_wave",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "blue_swallow", "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .ifFlyingModelResource("jetman_wing.geo.json")
                                        .AddToTabList(RangerTabs.JETMAN));

        // 3. Armors
        public static final DeferredItem<Item> JETMAN_HELMET = ITEMS.register("jetman_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.JETMAN).ChangeRepairItem(JETMAN_LOGO.get()));
        public static final DeferredItem<Item> JETMAN_CHESTPLATE = ITEMS.register("jetman_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties()).AddToTabList(RangerTabs.JETMAN)
                                        .ChangeRepairItem(JETMAN_LOGO.get()));
        public static final DeferredItem<Item> JETMAN_LEGGINGS = ITEMS.register("jetman_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties()).AddToTabList(RangerTabs.JETMAN)
                                        .ChangeRepairItem(JETMAN_LOGO.get()));

        // 4. Changers & Form Items

        public static final DeferredItem<Item> RED_CROSS_CHANGER = ITEMS.register("red_cross_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem(
                                        ArmorMaterials.DIAMOND, "red_hawk", HAWK_BIRDONIC_WAVE, JETMAN_HELMET,
                                        JETMAN_CHESTPLATE, JETMAN_LEGGINGS, new Item.Properties(), () -> null,
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .Override_belt_text("jetman_belt").AddToTabList(RangerTabs.JETMAN)
                                        .ChangeRepairItem(JETMAN_LOGO.get()));

        public static final DeferredItem<Item> BLACK_CROSS_CHANGER = ITEMS.register("black_cross_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem(
                                        ArmorMaterials.DIAMOND, "black_condor", CONDOR_BIRDONIC_WAVE, JETMAN_HELMET,
                                        JETMAN_CHESTPLATE, JETMAN_LEGGINGS, new Item.Properties(), () -> null,
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .Override_belt_text("jetman_belt").AddToTabList(RangerTabs.JETMAN)
                                        .ChangeRepairItem(JETMAN_LOGO.get()));

        public static final DeferredItem<Item> YELLOW_CROSS_CHANGER = ITEMS.register("yellow_cross_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem(
                                        ArmorMaterials.DIAMOND, "yellow_owl", OWL_BIRDONIC_WAVE, JETMAN_HELMET,
                                        JETMAN_CHESTPLATE, JETMAN_LEGGINGS, new Item.Properties(), () -> null,
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .Override_belt_text("jetman_belt").AddToTabList(RangerTabs.JETMAN)
                                        .ChangeRepairItem(JETMAN_LOGO.get()));

        public static final DeferredItem<Item> WHITE_CROSS_CHANGER = ITEMS.register("white_cross_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem(
                                        ArmorMaterials.DIAMOND, "white_swan", SWAN_BIRDONIC_WAVE, JETMAN_HELMET,
                                        JETMAN_CHESTPLATE, JETMAN_LEGGINGS, new Item.Properties(), () -> null,
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .Override_belt_text("jetman_belt").AddToTabList(RangerTabs.JETMAN)
                                        .ChangeRepairItem(JETMAN_LOGO.get()));

        public static final DeferredItem<Item> BLUE_CROSS_CHANGER = ITEMS.register("blue_cross_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem(
                                        ArmorMaterials.DIAMOND, "blue_swallow", SWALLOW_BIRDONIC_WAVE, JETMAN_HELMET,
                                        JETMAN_CHESTPLATE, JETMAN_LEGGINGS, new Item.Properties(), () -> null,
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .Override_belt_text("jetman_belt").AddToTabList(RangerTabs.JETMAN)
                                        .ChangeRepairItem(JETMAN_LOGO.get()));
        public static final DeferredItem<Item> RED_HAWK_MANGA = ITEMS.register("red_hawk_manga",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_manga", "red_hawk_manga", "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .AddCompatibilityList(new String[] { "red_hawk" })
                                        .ChangeRangerName("red_hawk")
                                        .ifFlyingModelResource("jetman_wing.geo.json")
                                        .SetShowFace());
        public static final DeferredItem<Item> RED_HAWK_MANGA_CHANGER = ITEMS.register("red_hawk_manga_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem(
                                        ArmorMaterials.DIAMOND, "red_hawk", RED_HAWK_MANGA, JETMAN_HELMET,
                                        JETMAN_CHESTPLATE, JETMAN_LEGGINGS, new Item.Properties(), () -> null,
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .Override_belt_text("jetman_belt")
                                        .ChangeRepairItem(JETMAN_LOGO.get()));
        public static final DeferredItem<Item> BLUE_SWALLOW_MANGA = ITEMS.register("blue_swallow_manga",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_manga", "blue_swallow_manga",
                                        "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .AddCompatibilityList(new String[] { "blue_swallow" })
                                        .ChangeRangerName("blue_swallow")
                                        .ifFlyingModelResource("jetman_wing.geo.json")
                                        .SetShowFace());
        public static final DeferredItem<Item> BLUE_SWALLOW_MANGA_CHANGER = ITEMS.register("blue_swallow_manga_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem(
                                        ArmorMaterials.DIAMOND, "blue_swallow", BLUE_SWALLOW_MANGA, JETMAN_HELMET,
                                        JETMAN_CHESTPLATE, JETMAN_LEGGINGS, new Item.Properties(), () -> null,
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .Override_belt_text("jetman_belt")
                                        .ChangeRepairItem(JETMAN_LOGO.get()));
        public static final DeferredItem<Item> WHITE_SWAN_MANGA = ITEMS.register("white_swan_manga",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_manga", "white_swan_manga", "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .AddCompatibilityList(new String[] { "white_swan" })
                                        .ChangeRangerName("white_swan")
                                        .ifFlyingModelResource("jetman_wing.geo.json")
                                        .SetShowFace());
        public static final DeferredItem<Item> WHITE_SWAN_MANGA_CHANGER = ITEMS.register("white_swan_manga_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem(
                                        ArmorMaterials.DIAMOND, "white_swan", WHITE_SWAN_MANGA, JETMAN_HELMET,
                                        JETMAN_CHESTPLATE, JETMAN_LEGGINGS, new Item.Properties(), () -> null,
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .Override_belt_text("jetman_belt")
                                        .ChangeRepairItem(JETMAN_LOGO.get()));
        public static final DeferredItem<Item> YELLOW_OWL_MANGA = ITEMS.register("yellow_owl_manga",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_manga", "yellow_owl_manga", "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .AddCompatibilityList(new String[] { "yellow_owl" })
                                        .ChangeRangerName("yellow_owl")
                                        .ifFlyingModelResource("jetman_wing.geo.json")
                                        .SetShowFace());
        public static final DeferredItem<Item> YELLOW_OWL_MANGA_CHANGER = ITEMS.register("yellow_owl_manga_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem(
                                        ArmorMaterials.DIAMOND, "yellow_owl", YELLOW_OWL_MANGA, JETMAN_HELMET,
                                        JETMAN_CHESTPLATE, JETMAN_LEGGINGS, new Item.Properties(), () -> null,
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .Override_belt_text("jetman_belt")
                                        .ChangeRepairItem(JETMAN_LOGO.get()));
        public static final DeferredItem<Item> BLACK_CONDOR_MANGA = ITEMS.register("black_condor_manga",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_manga", "black_condor_manga",
                                        "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .AddCompatibilityList(new String[] { "black_condor" })
                                        .ChangeRangerName("black_condor")
                                        .ifFlyingModelResource("jetman_wing.geo.json")
                                        .SetShowFace());
        public static final DeferredItem<Item> BLACK_CONDOR_MANGA_CHANGER = ITEMS.register("black_condor_manga_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_20.jetman.CrossChangerItem(
                                        ArmorMaterials.DIAMOND, "black_condor", BLACK_CONDOR_MANGA, JETMAN_HELMET,
                                        JETMAN_CHESTPLATE, JETMAN_LEGGINGS, new Item.Properties(), () -> null,
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .Override_belt_text("jetman_belt")
                                        .ChangeRepairItem(JETMAN_LOGO.get()));
        public static final DeferredItem<Item> JETMAN_MANGA = ITEMS.register("jetman_manga",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_manga", "red_hawk_manga", "blank",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .SetShowFace()
                                        .AddCompatibilityList(new String[] { "red_hawk" })
                                        .addAlternative(BLACK_CONDOR_MANGA.get())
                                        .addAlternative(BLUE_SWALLOW_MANGA.get())
                                        .addAlternative(WHITE_SWAN_MANGA.get())
                                        .addAlternative(YELLOW_OWL_MANGA.get())
                                        .AddToTabList(RangerTabs.JETMAN));
        public static final DeferredItem<Item> JET_ICARUS = ITEMS.register("jet_icarus",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "jet_icarus", "blank",
                                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0, true, false)));

        // 5. Weapons & Mechas
        public static final DeferredItem<Item> JET_ICARUS_LEGGINGS = ITEMS.register("jet_icarus_legs",
                        () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
        public static final DeferredItem<Item> JET_ICARUS_CHESTPLATE = ITEMS.register("jet_icarus_torso",
                        () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
        public static final DeferredItem<Item> JET_ICARUS_BOOTS = ITEMS.register("jet_icarus_boots",
                        () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties())
                                        .ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
        public static final DeferredItem<Item> JET_ICARUS_HELMET = ITEMS.register("jet_icarus_head",
                        () -> new MechaGattaiItem(ArmorMaterials.NETHERITE, "jet_icarus", JET_ICARUS,
                                        JET_ICARUS_CHESTPLATE, JET_ICARUS_LEGGINGS, JET_ICARUS_BOOTS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
        public static final DeferredItem<Item> BIRD_BLASTER = ITEMS.register("bird_blaster",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(JETMAN_LOGO.get()).AddToTabList(RangerTabs.JETMAN));
        public static final DeferredItem<Item> BRINGER_SWORD = ITEMS.register("bringer_sword",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(JETMAN_LOGO.get()).AddToTabList(RangerTabs.JETMAN));
        public static final DeferredItem<Item> JET_HAND_CANNON = ITEMS.register("jet_hand_cannon",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(JETMAN_LOGO.get()).AddToTabList(RangerTabs.JETMAN));
        public static final DeferredItem<Item> BEAK_SMASHER = ITEMS.register("beak_smasher",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(JETMAN_LOGO.get()).AddToTabList(RangerTabs.JETMAN));
        public static final DeferredItem<Item> SMASH_BOMBER = ITEMS.register("smash_bomber",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(JETMAN_LOGO.get()).AddToTabList(RangerTabs.JETMAN));
        public static final DeferredItem<Item> WING_GAUNTLET = ITEMS.register("wing_gauntlet",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(JETMAN_LOGO.get()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
