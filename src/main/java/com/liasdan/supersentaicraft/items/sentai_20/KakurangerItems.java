package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
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

public class KakurangerItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

    // 1. Logo
    public static final DeferredItem<Item> KAKURANGER_LOGO = ITEMS.register("kakuranger_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KAKURANGER));

    // 2. Collectibles
    public static final DeferredItem<Item> SASUKE_MEDAL = ITEMS.register("sasuke_medal",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> TSURUHIME_MEDAL = ITEMS.register("tsuruhime_medal",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> SEIKAI_MEDAL = ITEMS.register("seikai_medal",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> SAIZOU_MEDAL = ITEMS.register("saizou_medal",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> JIRAIYA_MEDAL = ITEMS.register("jiraiya_medal",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> NINJAMAN_MEDAL = ITEMS.register("ninjaman_medal",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> NINJA_RED_BELT = ITEMS.register("ninja_red_belt",
            () -> new BaseItem(new Item.Properties()));
    public static final DeferredItem<Item> NINJA_WHITE_BELT = ITEMS.register("ninja_white_belt",
            () -> new BaseItem(new Item.Properties()));
    public static final DeferredItem<Item> NINJA_YELLOW_BELT = ITEMS.register("ninja_yellow_belt",
            () -> new BaseItem(new Item.Properties()));
    public static final DeferredItem<Item> NINJA_BLUE_BELT = ITEMS.register("ninja_blue_belt",
            () -> new BaseItem(new Item.Properties()));
    public static final DeferredItem<Item> NINJA_BLACK_BELT = ITEMS.register("ninja_black_belt",
            () -> new BaseItem(new Item.Properties()));

    // 3. Armors
    public static final DeferredItem<Item> KAKURANGER_HELMET = ITEMS.register("kakuranger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                    .AddToTabList(RangerTabs.KAKURANGER).ChangeRepairItem(KAKURANGER_LOGO.get()));
    public static final DeferredItem<Item> KAKURANGER_CHESTPLATE = ITEMS.register("kakuranger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
                    .AddToTabList(RangerTabs.KAKURANGER).ChangeRepairItem(KAKURANGER_LOGO.get()));
    public static final DeferredItem<Item> KAKURANGER_LEGGINGS = ITEMS.register("kakuranger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KAKURANGER).ChangeRepairItem(KAKURANGER_LOGO.get()));

    // 4. Changers & Form Items
    public static final DeferredItem<Item> NINJA_RED_FORM = ITEMS.register("ninja_red_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "ninja_red", "ninja_red_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1, true, false)));
    public static final DeferredItem<Item> NINJA_WHITE_FORM = ITEMS.register("ninja_white_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "ninja_white", "ninja_white_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1, true, false),
                    new MobEffectInstance(EffectCore.FLYING, 40, 1, true, false)));
    public static final DeferredItem<Item> NINJA_YELLOW_FORM = ITEMS.register("ninja_yellow_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "ninja_yellow", "ninja_yellow_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1, true, false),
                    new MobEffectInstance(EffectCore.PUNCH, 40, 1, true, false)));
    public static final DeferredItem<Item> NINJA_BLUE_FORM = ITEMS.register("ninja_blue_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "ninja_blue", "ninja_blue_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1, true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 1, true, false)));
    public static final DeferredItem<Item> NINJA_BLACK_FORM = ITEMS.register("ninja_black_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "ninja_black", "ninja_black_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.INVISIBILITY, 40, 1, true, false)));
    public static final DeferredItem<Item> NINJA_MAN_FORM = ITEMS.register("ninja_man_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "ninja_man", "ninja_blue_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1, true, false)));
    public static final DeferredItem<Item> SAMURAI_MAN_FORM = ITEMS.register("samurai_man_form",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "samurai_man", "ninja_blue_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 1, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false)));

    public static final DeferredItem<Item> RED_DORON_CHANGER = ITEMS.register("red_doron_changer",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "ninja_red", NINJA_RED_FORM, KAKURANGER_HELMET, KAKURANGER_CHESTPLATE, KAKURANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KAKURANGER).ChangeRepairItem(KAKURANGER_LOGO.get()));
    public static final DeferredItem<Item> WHITE_DORON_CHANGER = ITEMS.register("white_doron_changer",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "ninja_white", NINJA_WHITE_FORM, KAKURANGER_HELMET, KAKURANGER_CHESTPLATE, KAKURANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KAKURANGER).ChangeRepairItem(KAKURANGER_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_DORON_CHANGER = ITEMS.register("yellow_doron_changer",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "ninja_yellow", NINJA_YELLOW_FORM, KAKURANGER_HELMET, KAKURANGER_CHESTPLATE, KAKURANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KAKURANGER).ChangeRepairItem(KAKURANGER_LOGO.get()));
    public static final DeferredItem<Item> BLUE_DORON_CHANGER = ITEMS.register("blue_doron_changer",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "ninja_blue", NINJA_BLUE_FORM, KAKURANGER_HELMET, KAKURANGER_CHESTPLATE, KAKURANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KAKURANGER).ChangeRepairItem(KAKURANGER_LOGO.get()));
    public static final DeferredItem<Item> BLACK_DORON_CHANGER = ITEMS.register("black_doron_changer",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "ninja_black", NINJA_BLACK_FORM, KAKURANGER_HELMET, KAKURANGER_CHESTPLATE, KAKURANGER_LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.KAKURANGER).ChangeRepairItem(KAKURANGER_LOGO.get()));
    public static final DeferredItem<Item> NINJAMAN_URN = ITEMS.register("ninjaman_urn",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "ninja_man", NINJA_MAN_FORM, KAKURANGER_HELMET, KAKURANGER_CHESTPLATE, KAKURANGER_LEGGINGS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(SAMURAI_MAN_FORM)
                    .AddToTabList(RangerTabs.KAKURANGER).ChangeRepairItem(KAKURANGER_LOGO.get()));

    // 5. Weapons & Mechas
    public static final DeferredItem<Item> KAKUREMARU = ITEMS.register("kakuremaru",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> KAKU_LASER = ITEMS.register("kaku_laser",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> NINJA_RED_SHURIKEN = ITEMS.register("ninja_red_shuriken",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> NINJA_WHITE_SHURIKEN = ITEMS.register("ninja_white_shuriken",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> NINJA_YELLOW_SHURIKEN = ITEMS.register("ninja_yellow_shuriken",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> NINJA_BLUE_SHURIKEN = ITEMS.register("ninja_blue_shuriken",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> NINJA_BLACK_SHURIKEN = ITEMS.register("ninja_black_shuriken",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> SHINOBI_KNUCKLE = ITEMS.register("shinobi_knuckle",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> RED_SLICER = ITEMS.register("red_slicer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> WHITE_BEAK = ITEMS.register("white_beak",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> YELLOW_CLAW = ITEMS.register("yellow_claw",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> BLUE_SHOT = ITEMS.register("blue_shot",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> BLACK_BOW = ITEMS.register("black_bow",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> HIKARIMARU = ITEMS.register("hikarimaru",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> NINJA_SWORD = ITEMS.register("ninja_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));
    public static final DeferredItem<Item> SAMURAI_JAVELIN = ITEMS.register("samurai_javelin",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KAKURANGER_LOGO.get()).AddToTabList(RangerTabs.KAKURANGER));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
