package com.liasdan.supersentaicraft.items.sentai_50;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SeizaBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.sentai_50.kyuranger.KyutamaItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KyurangerItems {

        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        public static final DeferredItem<Item> KYURANGER_LOGO = ITEMS.register("kyuranger_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));

        // ==========================================
        // BASE ARMORS
        // ==========================================

        // ==========================================
        // BASE ARMORS
        // ==========================================

        // ==========================================
        // BASE ARMORS
        // ==========================================

        // Logo and Collectibles
        // 1. Logo

        // Logo and Collectibles
        // 1. Logo
        // ==========================================
        // COLLECTIBLE ITEMS
        // ==========================================
        public static final DeferredItem<Item> BLANK_KYUTAMA = ITEMS.register("blank_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "blank", "kyuranger", "kyu_buckle"));
        public static final DeferredItem<Item> SHISHI_KYUTAMA = ITEMS.register("shishi_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.LUCK, 40, 1, true, false))
                                        .ChangeRangerName("shishi_red").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> SASORI_KYUTAMA = ITEMS.register("sasori_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false))
                                        .ChangeRangerName("sasori_orange").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> OOKAMI_KYUTAMA = ITEMS.register("ookami_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false))
                                        .ChangeRangerName("ookami_blue").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> TENBIN_KYUTAMA = ITEMS.register("tenbin_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false))
                                        .ChangeRangerName("tenbin_gold").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> OUSHI_KYUTAMA = ITEMS.register("oushi_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 1, true, false))
                                        .ChangeRangerName("oushi_black").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HEBITSUKAI_KYUTAMA = ITEMS.register("hebitsukai_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false))
                                        .ChangeRangerName("hebitsukai_silver").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> CHAMELEON_KYUTAMA = ITEMS.register("chameleon_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.INVISIBILITY, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false))
                                        .ChangeRangerName("chameleon_green").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> WASHI_KYUTAMA = ITEMS.register("washi_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                                        new MobEffectInstance(EffectCore.GLIDE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false))
                                        .ChangeRangerName("washi_pink")
                                        .ChangeModel("washi_pink.geo.json")
                                        .ifFlyingModelResource("washi_pink_wing.geo.json")
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KAJIKI_KYUTAMA = ITEMS.register("kajiki_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false))
                                        .ChangeRangerName("kajiki_yellow").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> RYU_KYUTAMA = ITEMS.register("ryu_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "ryu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false))
                                        .ChangeRangerName("ryu_commander").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KOGUMA_KYUTAMA = ITEMS.register("koguma_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false))
                                        .ChangeRangerName("koguma_sky_blue").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HOUOU_KYUTAMA = ITEMS.register("houou_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("houou_soldier").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> DARK_SHISHI_KYUTAMA = ITEMS.register("dark_shishi_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false))
                                        .ChangeRangerName("dark_shishi_red").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> SAIKO_KYUTAMA = ITEMS.register("saiko_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.LUCK, 20, 1, true, false))
                                        .ChangeRangerName("shishi_red_orion").ChangeSlot(2).HasCape()
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> DARK_SHISHI_RED_ORION_KYUTAMA = ITEMS.register(
                        "dark_shishi_red_orion_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 4, true, false),
                                        new MobEffectInstance(MobEffects.INVISIBILITY, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4, true, false),
                                        new MobEffectInstance(EffectCore.FLYING, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.LUCK, 40, 4, true, false))
                                        .ChangeRangerName("dark_shishi_red_orion").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HOUOU_RANGER_KYUTAMA = ITEMS.register("houou_ranger_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false))
                                        .ChangeRangerName("houou_ranger").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> SHISHI_RANGER_KYUTAMA = ITEMS.register("shishi_ranger_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 1, true, false))
                                        .ChangeRangerName("shishi_ranger").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYU_PEGASUS_KYUTAMA = ITEMS.register("kyu_pegasus_kyutama",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 3, true, false))
                                        .ChangeRangerName("kyu_pegasus").AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HIKARI_KYUTAMA_TAIYOU = ITEMS.register("hikari_kyutama_taiyou",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 20, 1, true, false))
                                        .ChangeRangerName("kyu_taiyou_mode").ChangeSlot(2)
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HIKARI_KYUTAMA_TSUKI = ITEMS.register("hikari_kyutama_tsuki",
                        () -> new KyutamaItem(new Item.Properties(), 0, "", "kyuranger", "ryu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 20, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false))
                                        .ChangeRangerName("kyu_tsuki_mode").ChangeSlot(2)
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYURANGER_KYUTAMA = ITEMS.register("kyuranger_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> EX_AID_KYUTAMA = ITEMS.register("ex_aid_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 37).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> ORION_KYUTAMA = ITEMS.register("orion_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> TOKEI_KYUTAMA = ITEMS.register("tokei_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> USHIKAI_KYUTAMA = ITEMS.register("ushikai_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 4).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HEBI_KYUTAMA = ITEMS.register("hebi_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> PUMP_KYUTAMA = ITEMS.register("pump_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HERCULES_KYUTAMA = ITEMS.register("hercules_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> RASHINBAN_KYUTAMA = ITEMS.register("rashinban_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> BOUENKYOU_KYUTAMA = ITEMS.register("bouenkyou_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 2).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KANI_KYUTAMA = ITEMS.register("kani_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> OOGUMA_KYUTAMA = ITEMS.register("ooguma_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 6).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> UO_KYUTAMA = ITEMS.register("uo_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> TATE_KYUTAMA = ITEMS.register("tate_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 8).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> FUTAGO_KYUTAMA = ITEMS.register("futago_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 9).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> OHITSUJI_KYUTAMA = ITEMS.register("ohitsuji_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> IKKAKUJU_KYUTAMA = ITEMS.register("ikkakuju_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> MIZUGAME_KYUTAMA = ITEMS.register("mizugame_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 3).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> YAGI_KYUTAMA = ITEMS.register("yagi_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KANMURI_KYUTAMA = ITEMS.register("kanmuri_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> CENTAURUS_KYUTAMA = ITEMS.register("centaurus_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KUJAKU_KYUTAMA = ITEMS.register("kujaku_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> PEGASUS_KYUTAMA = ITEMS.register("pegasus_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KAMINOKE_KYUTAMA = ITEMS.register("kaminoke_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> ITE_KYUTAMA = ITEMS.register("ite_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> PERSEUS_KYUTAMA = ITEMS.register("perseus_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KUJIRA_KYUTAMA = ITEMS.register("kujira_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 11).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> CASSIOPEIA_KYUTAMA = ITEMS.register("cassiopeia_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> TOKAGE_KYUTAMA = ITEMS.register("tokage_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> ANDROMEDA_KYUTAMA = ITEMS.register("andromeda_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> GENBIKYO_KYUTAMA = ITEMS.register("genbikyo_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 16).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> RYOKEN_KYUTAMA = ITEMS.register("ryoken_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KIRIN_KYUTAMA = ITEMS.register("kirin_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> TOBIUO_KYUTAMA = ITEMS.register("tobiuo_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KARASU_KYUTAMA = ITEMS.register("karasu_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 5).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> JYOGI_KYUTAMA = ITEMS.register("jyogi_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 35).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> CHOUKOKUSHITSU_KYUTAMA = ITEMS.register("choukokushitsu_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 34).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> IRUKA_KYUTAMA = ITEMS.register("iruka_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> COMPASS_KYUTAMA = ITEMS.register("compass_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 36).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> SAIDAN_KYUTAMA = ITEMS.register("saidan_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> OTOME_KYUTAMA = ITEMS.register("otome_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> OOINU_KYUTAMA = ITEMS.register("ooinu_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 27).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> SANKAKU_KYUTAMA = ITEMS.register("sankaku_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> CEPHEUS_KYUTAMA = ITEMS.register("cepheus_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KOTO_KYUTAMA = ITEMS.register("koto_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 22).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HAKUCHOU_KYUTAMA = ITEMS.register("hakuchou_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 30).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HAE_KYUTAMA = ITEMS.register("hae_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HATO_KYUTAMA = ITEMS.register("hato_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> GAKA_KYUTAMA = ITEMS.register("gaka_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 24).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> ERIDANUS_KYUTAMA = ITEMS.register("eridanus_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 15).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYOSHICHOU_KYUTAMA = ITEMS.register("kyoshichou_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> GYOSHA_KYUTAMA = ITEMS.register("gyosha_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 25).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KOUMA_KYUTAMA = ITEMS.register("kouma_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> CUP_KYUTAMA = ITEMS.register("cup_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> MIZUHEBI_KYUTAMA = ITEMS.register("mizuhebi_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KOINU_KYUTAMA = ITEMS.register("koinu_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> UMIHEBI_KYUTAMA = ITEMS.register("umihebi_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> USAGI_KYUTAMA = ITEMS.register("usagi_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 28).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> CHOKOKUGU_KYUTAMA = ITEMS.register("chokokugu_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> INDIAN_KYUTAMA = ITEMS.register("indian_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> TABLE_SAN_KYUTAMA = ITEMS.register("table_san_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> FUUCHOU_KYUTAMA = ITEMS.register("fuuchou_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> MINAMI_JUUJI_KYUTAMA = ITEMS.register("minami_juuji_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> MINAMI_NO_UO_KYUTAMA = ITEMS.register("minami_no_uo_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> MINAMI_NO_SANKAKU_KYUTAMA = ITEMS.register("minami_no_sankaku_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> MINAMI_NO_KANMURI_KYUTAMA = ITEMS.register("minami_no_kanmuri_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KOJISHI_KYUTAMA = ITEMS.register("kojishi_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> RETICLE_KYUTAMA = ITEMS.register("reticle_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> ROKUBUNGI_KYUTAMA = ITEMS.register("rokubungi_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 31).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HACHIBUNGI_KYUTAMA = ITEMS.register("hachibungi_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 32).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> TSURU_KYUTAMA = ITEMS.register("tsuru_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KOGITSUNE_KYUTAMA = ITEMS.register("kogitsune_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> RO_KYUTAMA = ITEMS.register("ro_kyutama",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SkillKyutamaItem(
                                        new Item.Properties(), 29).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> YA_KYUTAMA = ITEMS.register("ya_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> YAMANEKO_KYUTAMA = ITEMS.register("yamaneko_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HO_KYUTAMA = ITEMS.register("ho_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> RYUKOTSU_KYUTAMA = ITEMS.register("ryukotsu_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> TOMO_KYUTAMA = ITEMS.register("tomo_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> ARGO_KYUTAMA = ITEMS.register("argo_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> CERBERUS_KYUTAMA = ITEMS.register("cerberus_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HALLOWEEN_KYUTAMA = ITEMS.register("halloween_kyutama",
                        () -> new KyutamaItem(new Item.Properties().stacksTo(1), 0, "_halloween", "kyuranger",
                                        "kyu_buckle",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 4, true, false),
                                        new MobEffectInstance(MobEffects.INVISIBILITY, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4, true, false),
                                        new MobEffectInstance(EffectCore.FLYING, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.LUCK, 40, 4, true, false))
                                        .ChangeSlot(2)
                                        .addSwitchForm(com.liasdan.supersentaicraft.items.OtherItems.BLANK_FORM.get())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> SHISHI_SKILL_KYUTAMA = ITEMS.register("shishi_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> SASORI_SKILL_KYUTAMA = ITEMS.register("sasori_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> OOKAMI_SKILL_KYUTAMA = ITEMS.register("ookami_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> TENBIN_SKILL_KYUTAMA = ITEMS.register("tenbin_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> OUSHI_SKILL_KYUTAMA = ITEMS.register("oushi_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HEBITSUKAI_SKILL_KYUTAMA = ITEMS.register("hebitsukai_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> CHAMELEON_SKILL_KYUTAMA = ITEMS.register("chameleon_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> WASHI_SKILL_KYUTAMA = ITEMS.register("washi_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KAJIKI_SKILL_KYUTAMA = ITEMS.register("kajiki_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> RYU_SKILL_KYUTAMA = ITEMS.register("ryu_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KOGUMA_SKILL_KYUTAMA = ITEMS.register("koguma_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> HOUOU_SKILL_KYUTAMA = ITEMS.register("houou_skill_kyutama",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));

        // ==========================================
        // ARMOR
        // ==========================================
        public static final DeferredItem<Item> KYURANGER_HELMET = ITEMS.register("kyuranger_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYURANGER_CHESTPLATE = ITEMS.register("kyuranger_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYURANGER_LEGGINGS = ITEMS.register("kyuranger_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties()).AddToTabList(RangerTabs.KYURANGER));

        // ==========================================
        // CHANGERS
        // ==========================================
        public static final DeferredItem<Item> RED_SEIZA_BLASTER = ITEMS.register("red_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", SHISHI_KYUTAMA,
                                        KYURANGER_HELMET, KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> ORANGE_SEIZA_BLASTER = ITEMS.register("orange_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", SASORI_KYUTAMA,
                                        KYURANGER_HELMET, KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> BLUE_SEIZA_BLASTER = ITEMS.register("blue_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", OOKAMI_KYUTAMA,
                                        KYURANGER_HELMET, KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> GOLD_SEIZA_BLASTER = ITEMS.register("gold_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", TENBIN_KYUTAMA,
                                        KYURANGER_HELMET, KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> BLACK_SEIZA_BLASTER = ITEMS.register("black_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", OUSHI_KYUTAMA, KYURANGER_HELMET,
                                        KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> SILVER_SEIZA_BLASTER = ITEMS.register("silver_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", HEBITSUKAI_KYUTAMA,
                                        KYURANGER_HELMET, KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> GREEN_SEIZA_BLASTER = ITEMS.register("green_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", CHAMELEON_KYUTAMA,
                                        KYURANGER_HELMET, KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> PINK_SEIZA_BLASTER = ITEMS.register("pink_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", WASHI_KYUTAMA, KYURANGER_HELMET,
                                        KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(WASHI_KYUTAMA)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> YELLOW_SEIZA_BLASTER = ITEMS.register("yellow_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", KAJIKI_KYUTAMA,
                                        KYURANGER_HELMET, KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> COMMANDER_RYUTSUEDER = ITEMS.register("commander_ryutsueder",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", RYU_KYUTAMA, KYURANGER_HELMET,
                                        KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> SKY_BLUE_SEIZA_BLASTER = ITEMS.register("sky_blue_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", KOGUMA_KYUTAMA,
                                        KYURANGER_HELMET, KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> HOUOU_BLADE_SHIELD = ITEMS.register("houou_blade_shield",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", HOUOU_KYUTAMA, KYURANGER_HELMET,
                                        KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> METAL_DARK_SEIZA_BLASTER = ITEMS.register("metal_dark_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", HEBITSUKAI_KYUTAMA,
                                        KYURANGER_HELMET, KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> DARK_RED_SEIZA_BLASTER = ITEMS.register("dark_red_seiza_blaster",
                        () -> new SeizaBlasterItem(ArmorMaterials.DIAMOND, "kyuranger", DARK_SHISHI_KYUTAMA,
                                        KYURANGER_HELMET, KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));
        public static final DeferredItem<Item> HOUOU_BLADE = ITEMS.register("houou_blade",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.kyuranger.SeizaBlasterItem(
                                        ArmorMaterials.DIAMOND, "kyuranger", BLANK_KYUTAMA, KYURANGER_HELMET,
                                        KYURANGER_CHESTPLATE, KYURANGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYURANGER).ChangeRepairItem(BLANK_KYUTAMA.get()));

        // ==========================================
        // WEAPONS
        // ==========================================
        public static final DeferredItem<Item> HOUOU_SHIELD = ITEMS.register("houou_shield",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseShieldItem(new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));

        public static final DeferredItem<Item> RYUTSUEDER = ITEMS.register("ryutsueder",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                        net.minecraft.world.item.Tiers.IRON, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> DARK_SEIZA_BLASTER = ITEMS.register("dark_seiza_blaster",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                        net.minecraft.world.item.Tiers.IRON, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> SEIZA_BLASTER = ITEMS.register("seiza_blaster",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                        net.minecraft.world.item.Tiers.IRON, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYU_SWORD = ITEMS.register("kyu_sword",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYU_SPEAR = ITEMS.register("kyu_spear",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYU_CLAW = ITEMS.register("kyu_claw",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYU_CROSSBOW = ITEMS.register("kyu_crossbow",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYU_AXE = ITEMS.register("kyu_axe",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYU_SICKLE = ITEMS.register("kyu_sickle",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYU_RAPIER = ITEMS.register("kyu_rapier",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYU_SHOT = ITEMS.register("kyu_shot",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> KYU_SLASHER = ITEMS.register("kyu_slasher",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));
        public static final DeferredItem<Item> DARK_KYU_SICKLE = ITEMS.register("dark_kyu_sickle",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYURANGER));

        // ==========================================
        // MISC
        // ==========================================

        public static final DeferredItem<Item> YAGYUU_JUBEE_MASK = ITEMS.register("yagyuu_jubee_mask",
                        () -> new com.liasdan.supersentaicraft.items.others.RangerFormChangeItem(new Item.Properties(),
                                        0, "", "kyuranger", "kyu_buckle")
                                        .ChangeRangerName("yagyuu_jubee").ChangeSlot(2)
                                        .addNeedForm(OUSHI_KYUTAMA.get(), 1)
                                        .addSwitchForm(com.liasdan.supersentaicraft.items.OtherItems.BLANK_FORM.get())
                                        .AddToTabList(RangerTabs.KYURANGER));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
