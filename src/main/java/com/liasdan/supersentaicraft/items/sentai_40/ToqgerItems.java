package com.liasdan.supersentaicraft.items.sentai_40;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_40.toqger.ResshaItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ToqgerItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
        public static final String[] Toqger = new String[] { "toq_1gou", "toq_2gou", "toq_3gou", "toq_4gou", "toq_5gou",
                        "toq_6gou", "toq_7gou", "yami_0gou" };

        public static final DeferredItem<Item> TOQGER_LOGO = ITEMS.register("toqger_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.TOQGER));

        // 1. Base Items & Materials

        // Logo and Collectibles
        // 1. Logo

        // Logo and Collectibles
        // 1. Logo
        // ==========================================
        // COLLECTIBLE ITEMS
        // ==========================================
        public static final DeferredItem<Item> BLANK_RESSHA = ITEMS.register("blank_ressha",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> RED_RESSHA = ITEMS.register("red_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "", "toq_1gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> BLUE_RESSHA = ITEMS.register("blue_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "", "toq_2gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> YELLOW_RESSHA = ITEMS.register("yellow_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "", "toq_3gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> GREEN_RESSHA = ITEMS.register("green_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "", "toq_4gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> RAINBOW_RESSHA = ITEMS.register("rainbow_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "", "toq_1gou_rainbow", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.PUNCH, 40, 3, true, false))
                                        .AddCompatibilityList(Toqger));
        public static final DeferredItem<Item> PINK_RESSHA = ITEMS.register("pink_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "", "toq_5gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> BUILD_RESSHA = ITEMS.register("build_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "", "toq_6gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> VIOLET_RESSHA = ITEMS.register("violet_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "", "toq_7gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 0, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> ZERO_RESSHA = ITEMS.register("zero_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "", "yami_0gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, true, false), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4, true, false), new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 0, true, false), new MobEffectInstance(MobEffects.REGENERATION, 40, 0, true, false), new MobEffectInstance(MobEffects.WITHER, 40, 0, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 4, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> HYPER_RESSHA = ITEMS.register("hyper_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "", "toq_hyper", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3, true, false))
                                        .ChangeModel("ranger.geo.json").ChangeRangerName("toq_hyper")
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> SCOPE_RESSHA = ITEMS.register("scope_ressha",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> DEN_O_RESSHA = ITEMS.register("den_o_ressha",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> LION_RESSHA = ITEMS.register("lion_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "_safari", "toq_1gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> EAGLE_RESSHA = ITEMS.register("eagle_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "_safari", "toq_2gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> WILDCAT_RESSHA = ITEMS.register("wildcat_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "_safari", "toq_3gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> ALLIGATOR_RESSHA = ITEMS.register("alligator_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "_safari", "toq_4gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> PANDA_RESSHA = ITEMS.register("panda_ressha",
                        () -> new ResshaItem(new Item.Properties(), 0, "_safari", "toq_5gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> RED_RESSHA_CORRUPTED = ITEMS.register("red_ressha_corrupted",
                        () -> new ResshaItem(new Item.Properties(), 0, "_darkness", "toq_1gou", "toq_belt",
                                        new MobEffectInstance(MobEffects.WITHER, 40, 1, true, false))
                                        .AddCompatibilityList(Toqger).AddToTabList(RangerTabs.TOQGER));

        // ==========================================
        // ARMOR
        // ==========================================
        public static final DeferredItem<Item> TOQGER_HELMET = ITEMS.register("toqger_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));
        public static final DeferredItem<Item> TOQGER_CHESTPLATE = ITEMS.register("toqger_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));
        public static final DeferredItem<Item> TOQGER_LEGGINGS = ITEMS.register("toqger_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));

        // ==========================================
        // CHANGERS
        // ==========================================
        public static final DeferredItem<Item> TOQ_1GOU_CHANGER = ITEMS.register("ichigou_toq_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_40.toqger.ToqChangerItem(
                                        ArmorMaterials.DIAMOND, "toq_1gou", RED_RESSHA,
                                        TOQGER_HELMET, TOQGER_CHESTPLATE, TOQGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));
        public static final DeferredItem<Item> TOQ_2GOU_CHANGER = ITEMS.register("nigou_toq_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_40.toqger.ToqChangerItem(
                                        ArmorMaterials.DIAMOND, "toq_2gou", BLUE_RESSHA,
                                        TOQGER_HELMET, TOQGER_CHESTPLATE, TOQGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));
        public static final DeferredItem<Item> TOQ_3GOU_CHANGER = ITEMS.register("sangou_toq_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_40.toqger.ToqChangerItem(
                                        ArmorMaterials.DIAMOND, "toq_3gou", YELLOW_RESSHA,
                                        TOQGER_HELMET, TOQGER_CHESTPLATE, TOQGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));
        public static final DeferredItem<Item> TOQ_4GOU_CHANGER = ITEMS.register("yongou_toq_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_40.toqger.ToqChangerItem(
                                        ArmorMaterials.DIAMOND, "toq_4gou", GREEN_RESSHA,
                                        TOQGER_HELMET, TOQGER_CHESTPLATE, TOQGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));
        public static final DeferredItem<Item> TOQ_5GOU_CHANGER = ITEMS.register("gogou_toq_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_40.toqger.ToqChangerItem(
                                        ArmorMaterials.DIAMOND, "toq_5gou", PINK_RESSHA,
                                        TOQGER_HELMET, TOQGER_CHESTPLATE, TOQGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));
        public static final DeferredItem<Item> TOQ_6GOU_APPLI_CHANGER = ITEMS.register("rokugou_appli_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_40.toqger.ToqChangerItem(
                                        ArmorMaterials.DIAMOND, "toq_6gou", BUILD_RESSHA,
                                        TOQGER_HELMET, TOQGER_CHESTPLATE, TOQGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));
        public static final DeferredItem<Item> TOQ_7GOU_CHANGER = ITEMS.register("nanagou_appli_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_40.toqger.ToqChangerItem(
                                        ArmorMaterials.DIAMOND, "toq_7gou", VIOLET_RESSHA,
                                        TOQGER_HELMET, TOQGER_CHESTPLATE, TOQGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));
        public static final DeferredItem<Item> YAMI_0GOU_CHANGER = ITEMS.register("zerogou_toq_changer",
                        () -> new com.liasdan.supersentaicraft.items.sentai_40.toqger.ToqChangerItem(
                                        ArmorMaterials.DIAMOND, "yami_0gou", ZERO_RESSHA,
                                        TOQGER_HELMET, TOQGER_CHESTPLATE, TOQGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.TOQGER).ChangeRepairItem(BLANK_RESSHA.get()));

        // ==========================================
        // WEAPONS
        // ==========================================
        public static final DeferredItem<Item> TOQ_BLASTER_SWORD = ITEMS.register("toq_blaster_sword",
                        () -> new BaseSwordItem(net.minecraft.world.item.Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(BLANK_RESSHA.get()));
        public static final DeferredItem<Item> TOQ_BLASTER = ITEMS.register("toq_blaster",
                        () -> new BaseBlasterItem(net.minecraft.world.item.Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties().craftRemainder(TOQ_BLASTER_SWORD.get())).IsDualWeapon()
                                        .ChangeRepairItem(BLANK_RESSHA.get()).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> RAIL_SLASHER = ITEMS.register("rail_slasher",
                        () -> new BaseSwordItem(net.minecraft.world.item.Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(BLANK_RESSHA.get()).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> HOME_TRIGGER = ITEMS.register("home_trigger",
                        () -> new BaseBlasterItem(net.minecraft.world.item.Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties()).ChangeRepairItem(BLANK_RESSHA.get())
                                        .AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> SHINGOU_HAMMER = ITEMS.register("shingou_hammer",
                        () -> new BaseSwordItem(net.minecraft.world.item.Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(BLANK_RESSHA.get()).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> TUNNEL_AXE = ITEMS.register("tunnel_axe",
                        () -> new BaseSwordItem(net.minecraft.world.item.Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(BLANK_RESSHA.get()).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> TEKKYOU_CLAW = ITEMS.register("tekkyou_claw",
                        () -> new BaseSwordItem(net.minecraft.world.item.Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(BLANK_RESSHA.get()).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> YUDO_BREAKER = ITEMS.register("yudo_breaker",
                        () -> new BaseSwordItem(net.minecraft.world.item.Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(BLANK_RESSHA.get()).AddToTabList(RangerTabs.TOQGER));
        public static final DeferredItem<Item> DAIKAITEN_CANNON = ITEMS.register("daikaiten_cannon",
                        () -> new BaseBlasterItem(net.minecraft.world.item.Tiers.DIAMOND, 4, -2.4F,
                                        new Item.Properties()).IsSuperGun().ChangeRepairItem(BLANK_RESSHA.get())
                                        .AddToTabList(RangerTabs.TOQGER));

        // ==========================================
        // MISC
        // ==========================================

        public static final DeferredItem<Item> TOQ_BUCKLE = ITEMS.register("toq_buckle",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.TOQGER));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        } 
}
