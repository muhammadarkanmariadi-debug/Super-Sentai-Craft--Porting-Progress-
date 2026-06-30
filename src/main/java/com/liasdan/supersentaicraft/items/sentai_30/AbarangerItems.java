package com.liasdan.supersentaicraft.items.sentai_30;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_30.abaranger.AbarangerChangerItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.sentai_30.abaranger.AbarangerMechaItem;
import com.liasdan.supersentaicraft.items.sentai_30.abaranger.BakuryuuJointItem;
import com.liasdan.supersentaicraft.items.OtherItems;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class AbarangerItems {

        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // Logo and Collectibles
        // 1. Logo
        // 1. Logo

        // Logo and Collectibles
        // 1. Logo

        // Logo and Collectibles
        // 1. Logo
        public static final DeferredItem<Item> ABARANGER_LOGO = ITEMS.register("abaranger_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));

        // 2. Collectibles
        public static final DeferredItem<Item> TYRANNO_DINO_GUTS = ITEMS.register("tyranno_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> TRICERA_DINO_GUTS = ITEMS.register("tricera_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> PTERA_DINO_GUTS = ITEMS.register("ptera_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> BRACHIO_DINO_GUTS = ITEMS.register("brachio_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> TOP_DINO_GUTS = ITEMS.register("top_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> BACHYCELO_DINO_GUTS = ITEMS.register("bachycelo_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> DIMENOKO_DINO_GUTS = ITEMS.register("dimenoko_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> STEGO_DINO_GUTS = ITEMS.register("stego_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> PARASA_DINO_GUTS = ITEMS.register("parasa_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ANKYLO_DINO_GUTS = ITEMS.register("ankylo_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> FIRENOKO_DINO_GUTS = ITEMS.register("firenoko_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> MAX_TYRANNO_DINO_GUTS = ITEMS.register("max_tyranno_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> MAX_TRICERA_DINO_GUTS = ITEMS.register("max_tricera_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> MAX_PTERA_DINO_GUTS = ITEMS.register("max_ptera_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> CARNO_DINO_GUTS = ITEMS.register("carno_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> CHASMO_DINO_GUTS = ITEMS.register("chasmo_dino_guts",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> OO_ABAREN_OH_WINGS = ITEMS.register("oo_abaren_oh_wings",
                        () -> new BaseItem(new Item.Properties()));

        // 3. Armors
        public static final DeferredItem<Item> ABARANGER_HELMET = ITEMS.register("abaranger_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ABARANGER_CHESTPLATE = ITEMS.register("abaranger_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ABARANGER_LEGGINGS = ITEMS.register("abaranger_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));

        // 4. Changers & Form Items
        public static final DeferredItem<Item> ABA_RED_FORM = ITEMS.register("aba_red_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "aba_red", "aba_red_belt",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false))
                                        .ChangeBeltModel("abaranger_belt.geo.json"));
        public static final DeferredItem<Item> RED_DINO_BRACE = ITEMS.register("red_dino_brace",
                        () -> new AbarangerChangerItem(ArmorMaterials.DIAMOND, "aba_red", ABA_RED_FORM,
                                        ABARANGER_HELMET, ABARANGER_CHESTPLATE, ABARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ABARE_BLUE_FORM = ITEMS.register("abare_blue_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "abare_blue", "aba_blue_belt",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, true, false))
                                        .ChangeBeltModel("abaranger_belt.geo.json"));
        public static final DeferredItem<Item> BLUE_DINO_BRACE = ITEMS.register("blue_dino_brace",
                        () -> new AbarangerChangerItem(ArmorMaterials.DIAMOND, "abare_blue", ABARE_BLUE_FORM,
                                        ABARANGER_HELMET, ABARANGER_CHESTPLATE, ABARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ABARE_YELLOW_FORM = ITEMS.register("abare_yellow_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "abare_yellow", "aba_yellow_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(EffectCore.FLYING, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false))
                                        .ChangeBeltModel("abaranger_belt.geo.json"));
        public static final DeferredItem<Item> YELLOW_DINO_BRACE = ITEMS.register("yellow_dino_brace",
                        () -> new AbarangerChangerItem(ArmorMaterials.DIAMOND, "abare_yellow", ABARE_YELLOW_FORM,
                                        ABARANGER_HELMET, ABARANGER_CHESTPLATE, ABARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ABARE_BLACK_FORM = ITEMS.register("abare_black_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "abare_black", "aba_black_belt",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.INVISIBILITY, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false))
                                        .ChangeBeltModel("abaranger_belt.geo.json"));
        public static final DeferredItem<Item> DINO_COMMANDER = ITEMS.register("dino_commander",
                        () -> new AbarangerChangerItem(ArmorMaterials.DIAMOND, "abare_black", ABARE_BLACK_FORM,
                                        ABARANGER_HELMET, ABARANGER_CHESTPLATE, ABARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ABARE_KILLER_FORM = ITEMS.register("abare_killer_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "abare_killer", "dino_minder",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .ChangeBeltModel("abaranger_belt.geo.json"));
        public static final DeferredItem<Item> DINO_MINDER = ITEMS.register("dino_minder",
                        () -> new AbarangerChangerItem(ArmorMaterials.DIAMOND, "abare_killer", ABARE_KILLER_FORM,
                                        ABARANGER_HELMET, ABARANGER_CHESTPLATE, ABARANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ABARE_MAX_FORM = ITEMS.register("abare_max_form",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "aba_red", "aba_red_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false))
                                        .ChangeRangerName("abare_max")
                                        .ChangeBeltModel("abaranger_belt.geo.json")
                                        .AddCompatibilityList(new String[] { "aba_red" }));

        // 5. Weapons & Mechas
        public static final DeferredItem<Item> ABA_LASER = ITEMS.register("aba_laser",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun()
                                        .ChangeRepairItem(ABARANGER_LOGO.get()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> BAKU_LASER = ITEMS.register("baku_laser",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun()
                                        .ChangeRepairItem(ABARANGER_LOGO.get()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> TYRANNO_ROD = ITEMS.register("tyranno_rod",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ABARANGER_LOGO.get()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> TRICERA_BUNKER = ITEMS.register("tricera_bunker",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ABARANGER_LOGO.get()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> PTERA_DAGGER = ITEMS.register("ptera_dagger",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ABARANGER_LOGO.get()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> DINO_THRUSTER = ITEMS.register("dino_thruster",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ABARANGER_LOGO.get()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> WING_PENTACT = ITEMS.register("wing_pentact",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ABARANGER_LOGO.get()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> STY_RISER = ITEMS.register("sty_riser",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()) {
                                @Override
                                public net.minecraft.world.InteractionResultHolder<ItemStack> use(
                                                net.minecraft.world.level.Level p_41128_,
                                                net.minecraft.world.entity.player.Player player,
                                                net.minecraft.world.InteractionHand hand) {
                                        ItemStack itemstack = player.getItemInHand(hand);

                                        return super.use(p_41128_, player, hand);
                                }
                        }.ChangeRepairItem(ABARANGER_LOGO.get()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> STY_RISER_SHIELD = ITEMS.register("sty_riser_shield",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseShieldItem(new Item.Properties()) {
                                @Override
                                public net.minecraft.world.InteractionResultHolder<ItemStack> use(
                                                net.minecraft.world.level.Level p_41128_,
                                                net.minecraft.world.entity.player.Player player,
                                                net.minecraft.world.InteractionHand hand) {
                                        ItemStack itemstack = player.getItemInHand(hand);
                                        return super.use(p_41128_, player, hand);
                                }
                        }.ChangeRepairItem(ABARANGER_LOGO.get()).AddToTabList(RangerTabs.ABARANGER));

        public static final DeferredItem<Item> TRICERA_SHIELD = ITEMS.register("tricera_shield",
                        () -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> CHASMO_SHIELD = ITEMS.register("chasmo_shield",
                        () -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.ABARANGER));

        // Mecha Items
        public static final DeferredItem<Item> ABAREN_OH_BOOTS = ITEMS.register("abaren_oh_boots",
                        () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ABAREN_OH_LEGGINGS = ITEMS.register("abaren_oh_legs",
                        () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ABAREN_OH_CHESTPLATE = ITEMS.register("abaren_oh_torso",
                        () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));

        public static final DeferredItem<Item> ABAREN_OH_HELMET = ITEMS.register("abaren_oh_head",
                        () -> new AbarangerMechaItem(ArmorMaterials.NETHERITE, "abaren_oh", OtherItems.BLANK_FORM,
                                        ABAREN_OH_CHESTPLATE, ABAREN_OH_LEGGINGS, ABAREN_OH_BOOTS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> ABAREN_OHJI_HELMET = ITEMS.register("abaren_ohji_head",
                        () -> new AbarangerMechaItem(ArmorMaterials.NETHERITE, "abaren_ohji", OtherItems.BLANK_FORM,
                                        ABAREN_OH_CHESTPLATE, ABAREN_OH_LEGGINGS, ABAREN_OH_BOOTS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> KILLER_OH_HELMET = ITEMS.register("killer_oh_head",
                        () -> new AbarangerMechaItem(ArmorMaterials.NETHERITE, "killer_oh", OtherItems.BLANK_FORM,
                                        ABAREN_OH_CHESTPLATE, ABAREN_OH_LEGGINGS, ABAREN_OH_BOOTS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> MAX_OHJA_HELMET = ITEMS.register("max_ohja_head",
                        () -> new AbarangerMechaItem(ArmorMaterials.NETHERITE, "max_ohja", OtherItems.BLANK_FORM,
                                        ABAREN_OH_CHESTPLATE, ABAREN_OH_LEGGINGS, ABAREN_OH_BOOTS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> MAX_RYUOH_HELMET = ITEMS.register("max_ryuoh_head",
                        () -> new AbarangerMechaItem(ArmorMaterials.NETHERITE, "max_ryuoh", OtherItems.BLANK_FORM,
                                        ABAREN_OH_CHESTPLATE, ABAREN_OH_LEGGINGS, ABAREN_OH_BOOTS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> OO_ABAREN_OH_HELMET = ITEMS.register("oo_abaren_oh_head",
                        () -> new AbarangerMechaItem(ArmorMaterials.NETHERITE, "oo_abaren_oh", OtherItems.BLANK_FORM,
                                        ABAREN_OH_CHESTPLATE, ABAREN_OH_LEGGINGS, ABAREN_OH_BOOTS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> BAKUREN_OH_HELMET = ITEMS.register("bakuren_oh_head",
                        () -> new AbarangerMechaItem(ArmorMaterials.NETHERITE, "bakuren_oh", OtherItems.BLANK_FORM,
                                        ABAREN_OH_CHESTPLATE, ABAREN_OH_LEGGINGS, ABAREN_OH_BOOTS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));

        // Mecha Weapons
        public static final DeferredItem<Item> DOUBLE_TALL_SWORD = ITEMS.register("double_tall_sword",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 7, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> GALE_SPEAR = ITEMS.register("gale_spear",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 7, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> BAKURYU_AXE = ITEMS.register("bakuryu_axe",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 7, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> BAKURYU_SPEAR = ITEMS.register("bakuryu_spear",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 7, -2.4F,
                                        new Item.Properties().craftRemainder(BAKURYU_AXE.get()))
                                        .AddToTabList(RangerTabs.ABARANGER));
        public static final DeferredItem<Item> DOUBLE_TALL_SWORD_BAKUREN_OH = ITEMS.register(
                        "double_tall_sword_bakuren_oh",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 7, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ABARANGER));

        // Bakuryuu Joints
        public static final DeferredItem<Item> ABAREN_NAGURUS = ITEMS.register("abaren_nagurus",
                        () -> new BakuryuuJointItem(1, "right", new Item.Properties()));
        public static final DeferredItem<Item> ABAREN_VEILUS = ITEMS.register("abaren_veilus",
                        () -> new BakuryuuJointItem(2, "right", new Item.Properties()));
        public static final DeferredItem<Item> ABAREN_GALER = ITEMS.register("abaren_galer",
                        () -> new BakuryuuJointItem(3, "right", new Item.Properties()));
        public static final DeferredItem<Item> ABAREN_NOKODON = ITEMS.register("abaren_nokodon",
                        () -> new BakuryuuJointItem(1, "left", new Item.Properties()));
        public static final DeferredItem<Item> ABAREN_ROKKIRU = ITEMS.register("abaren_rokkiru",
                        () -> new BakuryuuJointItem(2, "left", new Item.Properties()));
        public static final DeferredItem<Item> ABAREN_NOKODON_FIRE = ITEMS.register("abaren_nokodon_fire",
                        () -> new BakuryuuJointItem(3, "left", new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
