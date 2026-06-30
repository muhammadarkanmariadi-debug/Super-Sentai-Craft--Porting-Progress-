package com.liasdan.supersentaicraft.items.sentai_50;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseThrowableItem;
import com.liasdan.supersentaicraft.items.others.BaseShieldItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_50.don_brothers.AvatarouGearItem;
import com.liasdan.supersentaicraft.items.sentai_50.don_brothers.AlterGearItem;
import com.liasdan.supersentaicraft.items.sentai_50.don_brothers.DonGearItem;
import com.liasdan.supersentaicraft.items.sentai_50.don_brothers.DonBlasterItem;
import com.liasdan.supersentaicraft.items.sentai_50.don_brothers.FutureDonBlasterItem;
import com.liasdan.supersentaicraft.items.sentai_50.don_brothers.SonoShieldItem;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import com.liasdan.supersentaicraft.effect.EffectCore;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class DonbrothersItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // 1. Logo and Basic Items

        public static final DeferredItem<Item> DONBRO_BUCKLE = ITEMS.register("donbro_buckle",
                        () -> new BaseItem(new Item.Properties()));

        public static final DeferredItem<Item> KIJI_BROTHER_WINGS = ITEMS.register("kiji_brother_wings",
                        () -> new BaseItem(new Item.Properties()));

        public static final DeferredItem<Item> KIJI_BROTHER_WINGS_CLOSE = ITEMS.register("kiji_brother_wings_close",
                        () -> new BaseItem(new Item.Properties()));

        public static final DeferredItem<Item> NINJARK_SWORD_BACK = ITEMS.register("ninjark_sword_back",
                        () -> new BaseItem(new Item.Properties()));

        public static final DeferredItem<Item> DON_BROTHERS_LOGO = ITEMS.register("don_brothers_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.DONBROTHERS));
        public static final DeferredItem<Item> BLANK_AVATAROU_GEAR = ITEMS.register("blank_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "blank", "blank", "")
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        // Forms
        public static final DeferredItem<Item> DON_MOMOTAROU_ALTER = ITEMS.register("don_momotarou_alter",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "don_momotarou_alter",
                                        "donbro_buckle")
                                        .ChangeRangerName("don_momotarou_alter")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "don_momotarou" }));

        public static final DeferredItem<Item> DON_MOMOTAROU_GOLDON = ITEMS.register("don_momotarou_goldon",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "don_momotarou_goldon",
                                        "donbro_buckle")
                                        .ChangeRangerName("don_momotarou_goldon")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "don_momotarou" }));

        public static final DeferredItem<Item> DON_NINNIN_ALTER = ITEMS.register("don_ninnin_alter",
                        () -> new BaseItem(new Item.Properties()));

        public static final DeferredItem<Item> DON_ZYUOH_ALTER = ITEMS.register("don_zyuoh_alter",
                        () -> new BaseItem(new Item.Properties()));

        public static final DeferredItem<Item> DON_MOMOTAROU_AVATAROU_GEAR = ITEMS.register(
                        "don_momotarou_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "don_momotarou", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.SLASH, 20, 1, true, false))
                                        .ChangeRangerName("don_momotarou")
                                        .AddCompatibilityList(new String[] { "don_momotarou" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> SARU_BROTHER_AVATAROU_GEAR = ITEMS.register("saru_brother_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "saru_brother", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false))
                                        .ChangeRangerName("saru_brother")
                                        .AddCompatibilityList(new String[] { "saru_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ONI_SISTER_AVATAROU_GEAR = ITEMS.register("oni_sister_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "oni_sister", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 1, true, false))
                                        .ChangeRangerName("oni_sister")
                                        .AddCompatibilityList(new String[] { "oni_sister" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> INU_BROTHER_AVATAROU_GEAR = ITEMS.register("inu_brother_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "inu_brother", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false))
                                        .ChangeRangerName("inu_brother").ChangeModel("inu_brother.geo.json")
                                        .ChangeBeltModel("inu_belt.geo.json")
                                        .AddCompatibilityList(new String[] { "inu_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KIJI_BROTHER_AVATAROU_GEAR = ITEMS.register("kiji_brother_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "kiji_brother", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 20, 1, true, false))
                                        .ChangeRangerName("kiji_brother").ChangeModel("kiji_brother.geo.json")
                                        .ifFlyingModelResource("kiji_brother_wing.geo.json")
                                        .ChangeBeltModel("kiji_belt.geo.json")
                                        .AddCompatibilityList(new String[] { "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_DORAGOKU_AVATAROU_GEAR = ITEMS.register("don_doragoku_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "don_doragoku", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false))
                                        .ChangeRangerName("don_doragoku")
                                        .AddCompatibilityList(new String[] { "don_doragoku", "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_TORABOLT_AVATAROU_GEAR = ITEMS.register("don_torabolt_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "don_torabolt", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false))
                                        .ChangeRangerName("don_torabolt")
                                        .AddCompatibilityList(new String[] { "don_torabolt", "don_doragoku" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_MURASAME_AVATAROU_GEAR = ITEMS.register("don_murasame_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_don_murasame", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] {}).AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ZENKAIZER_BLACK_AVATAROU_GEAR = ITEMS.register(
                        "zenkaizer_black_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_zenkaizer_black", "",
                                        "donbro_buckle")
                                        .AddCompatibilityList(new String[] {}).AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> OMIKOSHI_PHOENIX = ITEMS.register("omikoshi_phoenix", () -> new DonGearItem(new Item.Properties(), 0, "", "omikoshi_phoenix", "donbro_buckle").ChangeRangerName("omikoshi_phoenix").AddCompatibilityList(new String[] { "omikoshi_phoenix" }).AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_MOMOTAROU_AVATAROU_GEAR_ALTER = ITEMS.register("don_momotarou_avatarou_gear_alter", () -> new AlterGearItem(new Item.Properties(), 1).AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_DORAGOKU_AVATAROU_GEAR_ALTER = ITEMS.register("don_doragoku_avatarou_gear_alter", () -> new AlterGearItem(new Item.Properties(), 2).AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_MURASAME_AVATAROU_GEAR_ALTER = ITEMS.register("don_murasame_avatarou_gear_alter", () -> new AlterGearItem(new Item.Properties(), 3).AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ONI_SISTER_MANGA_AVATAROU_GEAR = ITEMS.register("oni_sister_manga_avatarou_gear", () -> new DonGearItem(new Item.Properties(), 0, "_oni_sister_manga", "", "donbro_buckle").AddCompatibilityList(new String[] {}).AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GORANGER_AVATAROU_GEAR = ITEMS.register("goranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_goranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.BOOST, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> JAKQ_AVATAROU_GEAR = ITEMS.register("jakq_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_jakq", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> BATTLE_FEVER_AVATAROU_GEAR = ITEMS.register("battle_fever_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_battle_fever", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DENZIMAN_AVATAROU_GEAR = ITEMS.register("denziman_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_denziman", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> SUN_VULCAN_AVATAROU_GEAR = ITEMS.register("sun_vulcan_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_sun_vulcan", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.FLYING, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.SLASH, 20, 1, true, false))
                                        .AddCompatibilityList(
                                                        new String[] { "don_momotarou", "saru_brother", "oni_sister" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GOGGLE_V_AVATAROU_GEAR = ITEMS.register("goggle_v_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_goggle_v", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DYNAMAN_AVATAROU_GEAR = ITEMS.register("dynaman_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_dynaman", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> BIOMAN_AVATAROU_GEAR = ITEMS.register("bioman_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_bioman", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.SLASH, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> CHANGEMAN_AVATAROU_GEAR = ITEMS.register("changeman_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_changeman", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> FLASHMAN_AVATAROU_GEAR = ITEMS.register("flashman_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_flashman", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> MASKMAN_AVATAROU_GEAR = ITEMS.register("maskman_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_maskman", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> LIVEMAN_AVATAROU_GEAR = ITEMS.register("liveman_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_liveman", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> TURBORANGER_AVATAROU_GEAR = ITEMS.register("turboranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_turboranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> FIVEMAN_AVATAROU_GEAR = ITEMS.register("fiveman_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_fiveman", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> JETMAN_AVATAROU_GEAR = ITEMS.register("jetman_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_jetman", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.FLYING, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ZYURANGER_AVATAROU_GEAR = ITEMS.register("zyuranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_zyuranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DAIRANGER_AVATAROU_GEAR = ITEMS.register("dairanger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_dairanger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.FIREPUNCH, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KAKURANGER_AVATAROU_GEAR = ITEMS.register("kakuranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_kakuranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> OHRANGER_AVATAROU_GEAR = ITEMS.register("ohranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_ohranger", "", "donbro_buckle")
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> CARRANGER_AVATAROU_GEAR = ITEMS.register("carranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_carranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> MEGARANGER_AVATAROU_GEAR = ITEMS.register("megaranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_megaranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GINGAMAN_AVATAROU_GEAR = ITEMS.register("gingaman_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_gingaman", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.SLASH, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GOGO_V_AVATAROU_GEAR = ITEMS.register("gogo_v_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_gogo_v", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> TIMERANGER_AVATAROU_GEAR = ITEMS.register("timeranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_timeranger", "", "donbro_buckle")
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GAORANGER_AVATAROU_GEAR = ITEMS.register("gaoranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_gaoranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> HURRICANEGER_AVATAROU_GEAR = ITEMS.register("hurricaneger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_hurricaneger", "", "donbro_buckle")
                                        .AddCompatibilityList(
                                                        new String[] { "don_momotarou", "saru_brother", "oni_sister" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ABARANGER_AVATAROU_GEAR = ITEMS.register("abaranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_abaranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.PUNCH, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "don_murasame" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DEKARANGER_AVATAROU_GEAR = ITEMS.register("dekaranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_dekaranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> MAGIRANGER_AVATAROU_GEAR = ITEMS.register("magiranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_magiranger", "", "donbro_buckle")
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> BOUKENGER_AVATAROU_GEAR = ITEMS.register("boukenger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_boukenger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GEKIRANGER_AVATAROU_GEAR = ITEMS.register("gekiranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_gekiranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false))
                                        .AddCompatibilityList(
                                                        new String[] { "don_momotarou", "saru_brother", "oni_sister" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GO_ONGER_AVATAROU_GEAR = ITEMS.register("go_onger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_go_onger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> SHINKENGER_AVATAROU_GEAR = ITEMS.register("shinkenger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_shinkenger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.SLASH, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.FIRESLASH, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GOSEIGER_AVATAROU_GEAR = ITEMS.register("goseiger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_goseiger", "", "donbro_buckle")
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GOKAIGER_AVATAROU_GEAR = ITEMS.register("gokaiger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_gokaiger", "", "donbro_buckle")
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GO_BUSTERS_AVATAROU_GEAR = ITEMS.register("go_busters_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_go_busters", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .AddCompatibilityList(
                                                        new String[] { "don_momotarou", "saru_brother", "oni_sister" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KYORYUGER_AVATAROU_GEAR = ITEMS.register("kyoryuger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_kyoryuger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> TOQGER_AVATAROU_GEAR = ITEMS.register("toqger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_toqger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> NINNINGER_AVATAROU_GEAR = ITEMS.register("ninninger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_ninninger", "", "donbro_buckle")
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ZYUOHGER_AVATAROU_GEAR = ITEMS.register("zyuohger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_zyuohger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.FLYING, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false))
                                        .AddCompatibilityList(
                                                        new String[] { "don_momotarou", "saru_brother", "oni_sister" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KYURANGER_AVATAROU_GEAR = ITEMS.register("kyuranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_kyuranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.LUCK, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> LUPINRANGER_AVATAROU_GEAR = ITEMS.register("lupinranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_lupinranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false))
                                        .AddCompatibilityList(
                                                        new String[] { "don_momotarou", "saru_brother", "oni_sister" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> PATRANGER_AVATAROU_GEAR = ITEMS.register("patranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_patranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 0, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> RYUSOULGER_AVATAROU_GEAR = ITEMS.register("ryusoulger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_ryusoulger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "inu_brother", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KIRAMEIGER_AVATAROU_GEAR = ITEMS.register("kirameiger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_kirameiger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "saru_brother",
                                                        "oni_sister", "kiji_brother" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ZENKAIGER_AVATAROU_GEAR = ITEMS.register("zenkaiger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_zenkaiger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DRAGON_RANGER_AVATAROU_GEAR = ITEMS.register(
                        "dragon_ranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_dragon_ranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KIBA_RANGER_AVATAROU_GEAR = ITEMS.register("kiba_ranger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_kiba_ranger", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.FIREPUNCH, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GOKAI_SILVER_AVATAROU_GEAR = ITEMS.register("gokai_silver_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_gokai_silver", "", "donbro_buckle")
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> BEET_BUSTER_AVATAROU_GEAR = ITEMS.register("beet_buster_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_beet_buster", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KYORYU_GOLD_AVATAROU_GEAR = ITEMS.register("kyoryu_gold_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_kyoryu_gold", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> TOQ_6GOU_AVATAROU_GEAR = ITEMS.register("toq_6gou_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_toq_6gou", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> STAR_NINGER_AVATAROU_GEAR = ITEMS.register("star_ninger_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_star_ninger", "", "donbro_buckle")
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ZYUOH_THE_WORLD_AVATAROU_GEAR = ITEMS.register(
                        "zyuoh_the_world_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_zyuoh_the_world", "",
                                        "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(EffectCore.FLYING, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> HOUOU_SOLDIER_AVATAROU_GEAR = ITEMS.register(
                        "houou_soldier_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_houou_soldier", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.LUCK, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> LUPIN_X_AVATAROU_GEAR = ITEMS.register("lupin_x_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_lupin_x", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> PATREN_X_AVATAROU_GEAR = ITEMS.register("patren_x_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_patren_x", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 0, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> RYUSOUL_GOLD_AVATAROU_GEAR = ITEMS.register("ryusoul_gold_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_ryusoul_gold", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KIRAMEI_SILVER_AVATAROU_GEAR = ITEMS.register(
                        "kiramei_silver_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_kiramei_silver", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> TWOKAIZER_AVATAROU_GEAR = ITEMS.register("twokaizer_avatarou_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_twokaizer", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 1, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_torabolt" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GOKAIGER_AVATAROU_GEAR_ALTER = ITEMS.register(
                        "gokaiger_avatarou_gear_alter",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_alter_gokai", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_murasame" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> GO_BUSTERS_AVATAROU_GEAR_ALTER = ITEMS.register(
                        "go_busters_avatarou_gear_alter",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_alter_go_busters", "",
                                        "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .AddCompatibilityList(new String[] {}).AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KYORYUGER_AVATAROU_GEAR_ALTER = ITEMS.register(
                        "kyoryuger_avatarou_gear_alter",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_alter_kyoryu", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_murasame" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> TOQGER_AVATAROU_GEAR_ALTER = ITEMS.register("toqger_avatarou_gear_alter",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_alter_toq", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_murasame" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> NINNINGER_AVATAROU_GEAR_ALTER = ITEMS
                        .register("ninninger_avatarou_gear_alter",
                                        () -> new RangerFormChangeItem(
                                                        new Item.Properties(), 0, "_alter_ninnin", "", "donbro_buckle",
                                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true,
                                                                        false),
                                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true,
                                                                        false),
                                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true,
                                                                        false))
                                                        .Has_Static_Wings(true)
                                                        .AddCompatibilityList(new String[] { "don_momotarou",
                                                                        "don_doragoku", "don_murasame" })
                                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ZYUOHGER_AVATAROU_GEAR_ALTER = ITEMS
                        .register("zyuohger_avatarou_gear_alter",
                                        () -> new RangerFormChangeItem(
                                                        new Item.Properties(), 0, "_alter_zyuoh", "", "donbro_buckle",
                                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true,
                                                                        false),
                                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true,
                                                                        false),
                                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true,
                                                                        false),
                                                        new MobEffectInstance(EffectCore.GLIDE, 20, 0, true, false),
                                                        new MobEffectInstance(EffectCore.FLYING, 20, 0, true, false))
                                                        .Has_Static_Wings(true)
                                                        .AddCompatibilityList(new String[] { "don_momotarou",
                                                                        "don_doragoku", "don_murasame" })
                                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KYURANGER_AVATAROU_GEAR_ALTER = ITEMS.register(
                        "kyuranger_avatarou_gear_alter",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_alter_kyuranger", "",
                                        "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku", "don_murasame" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> LUPINRANGER_AVATAROU_GEAR_ALTER = ITEMS.register(
                        "lupinranger_avatarou_gear_alter",
                        () -> new AvatarouGearItem(new Item.Properties(), 0, "_alter_lupin", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .Has_Static_Wings(true)
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku", "don_murasame" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> PATRANGER_AVATAROU_GEAR_ALTER = ITEMS.register(
                        "patranger_avatarou_gear_alter",
                        () -> new AvatarouGearItem(new Item.Properties(), 0, "_alter_patren", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .Has_Static_Wings(true)
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku", "don_murasame" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> RYUSOULGER_AVATAROU_GEAR_ALTER = ITEMS.register(
                        "ryusoulger_avatarou_gear_alter",
                        () -> new AvatarouGearItem(new Item.Properties(), 0, "_alter_ryusoul", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_murasame" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KIRAMEIGER_AVATAROU_GEAR_ALTER = ITEMS.register(
                        "kirameiger_avatarou_gear_alter",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_alter_kiramei", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku",
                                                        "don_murasame" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ZENKAIGER_AVATAROU_GEAR_ALTER = ITEMS.register(
                        "zenkaiger_avatarou_gear_alter",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "_alter_zenkai", "", "donbro_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                                        new MobEffectInstance(EffectCore.SMALL, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 3, true, false))
                                        .AddCompatibilityList(new String[] { "don_momotarou", "don_doragoku", "don_murasame" })
                                        .AddToTabList(RangerTabs.DONBROTHERS));
        public static final DeferredItem<Item> TIGUARDORA = ITEMS.register("tiguardora",
                        () -> new BaseShieldItem(new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        // Armors
        public static final DeferredItem<Item> DONBROTHERS_HELMET = ITEMS.register("don_brothers_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));
        public static final DeferredItem<Item> DONBROTHERS_CHESTPLATE = ITEMS.register("don_brothers_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));
        public static final DeferredItem<Item> DONBROTHERS_LEGGINGS = ITEMS.register("don_brothers_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        // Changers (Belts)
        public static final DeferredItem<Item> MOMOTAROU_DON_BLASTER = ITEMS.register("momotarou_don_blaster",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "don_momotarou",
                                        DonbrothersItems.DON_MOMOTAROU_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> SARU_DON_BLASTER = ITEMS.register("saru_don_blaster",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "saru_brother",
                                        DonbrothersItems.SARU_BROTHER_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ONI_DON_BLASTER = ITEMS.register("oni_don_blaster",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "oni_sister",
                                        DonbrothersItems.ONI_SISTER_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> INU_DON_BLASTER = ITEMS.register("inu_don_blaster",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "inu_brother",
                                        DonbrothersItems.INU_BROTHER_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KIJI_DON_BLASTER = ITEMS.register("kiji_don_blaster",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "kiji_brother",
                                        DonbrothersItems.KIJI_BROTHER_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> TORADORA_RYUKO_NO_GEKI = ITEMS.register("toradora_ryuko_no_geki",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "don_doragoku",
                                        DonbrothersItems.DON_DORAGOKU_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> MURASAME_NINJARK_SWORD = ITEMS.register("murasame_ninjark_sword",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "don_murasame", DON_MURASAME_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> FUTURE_NINJARK_SWORD = ITEMS.register("future_ninjark_sword",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "future_don_murasame",
                                        DON_MURASAME_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> BLACK_GEARTLINGER = ITEMS.register("black_geartlinger",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "zenkaizer_black",
                                        ZENKAIZER_BLACK_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> SONOI_NOUTO_BRACE = ITEMS.register("sonoi_nouto_brace",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "sonoi", BLANK_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> SONONI_NOUTO_BRACE = ITEMS.register("sononi_nouto_brace",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "sononi", BLANK_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> SONOZA_NOUTO_BRACE = ITEMS.register("sonoza_nouto_brace",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "sonoza", BLANK_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> FUTURE_DON_BLASTER = ITEMS.register("future_don_blaster",
                        () -> new FutureDonBlasterItem(ArmorMaterials.DIAMOND, "future_oni_sister",
                                        ONI_SISTER_AVATAROU_GEAR,
                                        DONBROTHERS_HELMET, DONBROTHERS_CHESTPLATE, DONBROTHERS_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> ZANGLAS_SWORD = ITEMS.register("zanglas_sword",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_BLASTER = ITEMS.register("don_blaster",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.0F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> RYUKO_NO_GEKI = ITEMS.register("ryuko_no_geki",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                        .AddToTabList(RangerTabs.DONBROTHERS));
        public static final DeferredItem<Item> RYUKO_NO_GEKI_AXE = ITEMS.register("ryuko_no_geki_bolt",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM));
        public static final DeferredItem<Item> NINJARK_SWORD = ITEMS.register("ninjark_sword",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> SONO_SHIELD = ITEMS.register("sono_shield",
                        () -> new SonoShieldItem(new Item.Properties().stacksTo(1)));

        public static final DeferredItem<Item> FULL_KONBOU = ITEMS.register("full_konbou",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> INU_BROTHER_SHURIKEN = ITEMS.register("inu_brother_shuriken",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> BARON_SWORD = ITEMS.register("baron_sword",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> CONDOR_ARROW = ITEMS.register("condor_arrow",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> CONDOR_SWORD = ITEMS.register("condor_sword",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> KAGE_SPEAR = ITEMS.register("kage_spear",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_LUPIN_ALTER = ITEMS.register("don_lupin_alter",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_PATREN_ALTER = ITEMS.register("don_patren_alter",
                        () -> new BaseShieldItem(new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_RYUSOUL_ALTER = ITEMS.register("don_ryusoul_alter",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static final DeferredItem<Item> DON_RYUSOUL_ALTER_SHIELD = ITEMS.register("don_ryusoul_alter_shield",
                        () -> new BaseShieldItem(new Item.Properties())
                                        .AddToTabList(RangerTabs.DONBROTHERS));

        public static void register(net.neoforged.bus.api.IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
