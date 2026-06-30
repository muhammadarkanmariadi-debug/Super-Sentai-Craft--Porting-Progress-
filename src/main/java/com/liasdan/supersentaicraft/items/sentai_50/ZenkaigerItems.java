package com.liasdan.supersentaicraft.items.sentai_50;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.SentaiGearItem;
import com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.DarkGearItem;
import com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.ZenkaiGearItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ZenkaigerItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // 1. Logo
        public static final DeferredItem<Item> ZENKAIGER_LOGO = ITEMS.register("zenkaiger_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> BLANK_SENTAI_GEAR = ITEMS.register("blank_sentai_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> BLANK_DARK_SENTAI_GEAR = ITEMS.register("blank_dark_sentai_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> TOJIRU_GEAR = ITEMS.register("tojiru_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));

        // Armors

        // Forms

        // Zenkaizer
        public static final DeferredItem<Item> ZENKAIZER_SUPER = ITEMS.register("zenkaizer_super",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkaizer_super",
                                        "zenkaizer_belt")
                                        .ChangeRangerName("zenkaizer_super").addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkaizer" }));
        public static final DeferredItem<Item> ZENKAIZER_JETMAN = ITEMS.register("zenkaizer_jetman",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkaizer_jetman",
                                        "zenkaizer_belt")
                                        .ChangeRangerName("zenkaizer_jetman").addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkaizer" }).HasCape());
        public static final DeferredItem<Item> ZENKAIZER_NORMAL = ITEMS.register("zenkaizer_normal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkaizer_normal",
                                        "zenkaizer_belt")
                                        .ChangeRangerName("zenkaizer_normal").addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkaizer" }).HasCape());
        public static final DeferredItem<Item> ZENKAIZER_GEAR = ITEMS.register("zenkaizer_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkaizer", "zenkaizer_belt")
                                        .addShiftForm(ZENKAIZER_NORMAL.get()).ChangeRangerName("zenkaizer")
                                        .AddCompatibilityList(new String[] { "zenkaizer" }).HasCape()
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Juran
        public static final DeferredItem<Item> ZENKAI_JURAN_JETMAN = ITEMS.register("zenkai_juran_jetman",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_juran_jetman",
                                        "zenkai_juran_belt")
                                        .ChangeRangerName("zenkai_juran_jetman")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkaizer" }));
        public static final DeferredItem<Item> ZENKAI_JURAN_NORMAL = ITEMS.register("zenkai_juran_normal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_juran_normal",
                                        "zenkai_juran_belt")
                                        .ChangeRangerName("zenkai_juran_normal")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkai_juran" }));
        public static final DeferredItem<Item> ZENKAI_JURAN_GEAR = ITEMS.register("zenkai_juran_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_juran",
                                        "zenkai_juran_belt")
                                        .addShiftForm(ZENKAI_JURAN_NORMAL.get()).ChangeRangerName("zenkai_juran")
                                        .AddCompatibilityList(new String[] { "zenkai_juran" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Gaon
        public static final DeferredItem<Item> ZENKAI_GAON_JETMAN = ITEMS.register("zenkai_gaon_jetman",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_gaon_jetman",
                                        "zenkai_juran_belt")
                                        .ChangeRangerName("zenkai_gaon_jetman")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkai_juran" }));
        public static final DeferredItem<Item> ZENKAI_GAON_NORMAL = ITEMS.register("zenkai_gaon_normal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_gaon_normal",
                                        "zenkai_juran_belt")
                                        .ChangeRangerName("zenkai_gaon_normal")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkai_gaon" }));
        public static final DeferredItem<Item> ZENKAI_GAON_GEAR = ITEMS.register("zenkai_gaon_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_gaon", "zenkai_juran_belt")
                                        .addShiftForm(ZENKAI_GAON_NORMAL.get()).ChangeRangerName("zenkai_gaon")
                                        .AddCompatibilityList(new String[] { "zenkai_gaon" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Magine
        public static final DeferredItem<Item> ZENKAI_MAGINE_JETMAN = ITEMS.register("zenkai_magine_jetman",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_magine_jetman",
                                        "zenkai_magine_belt")
                                        .ChangeRangerName("zenkai_magine_jetman")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkai_gaon" }));
        public static final DeferredItem<Item> ZENKAI_MAGINE_NORMAL = ITEMS.register("zenkai_magine_normal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_magine_normal",
                                        "zenkai_magine_belt")
                                        .ChangeRangerName("zenkai_magine_normal")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkai_magine" }));
        public static final DeferredItem<Item> ZENKAI_MAGINE_GEAR = ITEMS.register("zenkai_magine_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_magine",
                                        "zenkai_magine_belt")
                                        .addShiftForm(ZENKAI_MAGINE_NORMAL.get()).ChangeRangerName("zenkai_magine")
                                        .AddCompatibilityList(new String[] { "zenkai_magine" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Vroon
        public static final DeferredItem<Item> ZENKAI_VROON_JETMAN = ITEMS.register("zenkai_vroon_jetman",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_vroon_jetman",
                                        "zenkai_juran_belt")
                                        .ChangeRangerName("zenkai_vroon_jetman")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkai_magine" }));
        public static final DeferredItem<Item> ZENKAI_VROON_NORMAL = ITEMS.register("zenkai_vroon_normal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_vroon_normal",
                                        "zenkai_juran_belt")
                                        .ChangeRangerName("zenkai_vroon_normal")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkai_vroon" }));
        public static final DeferredItem<Item> ZENKAI_VROON_GEAR = ITEMS.register("zenkai_vroon_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_vroon",
                                        "zenkai_juran_belt")
                                        .addShiftForm(ZENKAI_VROON_NORMAL.get()).ChangeRangerName("zenkai_vroon")
                                        .AddCompatibilityList(new String[] { "zenkai_vroon" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Twokaizer
        public static final DeferredItem<Item> TWOKAIZER_CUTANNER = ITEMS.register("twokaizer_cutanner",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "twokaizer_cutanner",
                                        "twokaizer_belt")
                                        .ChangeRangerName("twokaizer_cutanner")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkai_vroon" }));
        public static final DeferredItem<Item> TWOKAIZER_RICKY = ITEMS.register("twokaizer_ricky",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "twokaizer_ricky",
                                        "twokaizer_belt")
                                        .ChangeRangerName("twokaizer_ricky").addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "twokaizer" }));
        public static final DeferredItem<Item> TWOKAIZER_SUPER = ITEMS.register("twokaizer_super",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "twokaizer_super",
                                        "twokaizer_belt")
                                        .ChangeRangerName("twokaizer_super").addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "twokaizer" }));
        public static final DeferredItem<Item> TWOKAIZER_JETMAN = ITEMS.register("twokaizer_jetman",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "twokaizer_jetman",
                                        "twokaizer_belt")
                                        .ChangeRangerName("twokaizer_jetman").addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "twokaizer" }));
        public static final DeferredItem<Item> TWOKAIZER_GEAR = ITEMS.register("twokaizer_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "twokaizer", "twokaizer_belt")
                                        .ChangeRangerName("twokaizer")
                                        .AddCompatibilityList(new String[] { "twokaizer" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Stacaesar
        public static final DeferredItem<Item> STACAESAR_KYOKA = ITEMS.register("stacaesar_kyoka",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "stacaesar_kyoka",
                                        "stacaesar_belt")
                                        .ChangeRangerName("stacaesar_kyoka").addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "stacaesar" }));
        public static final DeferredItem<Item> STACAESAR_GEAR = ITEMS.register("stacaesar_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "stacaesar", "stacaesar_belt")
                                        .addShiftForm(STACAESAR_KYOKA.get()).ChangeRangerName("stacaesar")
                                        .AddCompatibilityList(new String[] { "stacaesar" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Zenkai Red
        public static final DeferredItem<Item> ZENKAI_RED_GEAR = ITEMS.register("zenkai_red_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkai_red", "zenkai_juran_belt")
                                        .ChangeRangerName("zenkai_red")
                                        .AddCompatibilityList(new String[] { "zenkai_red" }).HasCape()
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Twokai Flint
        public static final DeferredItem<Item> TWOKAI_FLINT_CUTANNER = ITEMS.register("twokai_flint_cutanner",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "twokai_flint_cutanner",
                                        "twokaizer_belt")
                                        .ChangeRangerName("twokai_flint_cutanner")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "twokai_flint" }));
        public static final DeferredItem<Item> TWOKAI_FLINT_RICKY = ITEMS.register("twokai_flint_ricky",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "twokai_flint_ricky",
                                        "twokaizer_belt")
                                        .ChangeRangerName("twokai_flint_ricky")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "twokai_flint" }));
        public static final DeferredItem<Item> TWOKAI_FLINT_GEAR = ITEMS.register("twokai_flint_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "twokai_flint", "twokaizer_belt")
                                        .ChangeRangerName("twokai_flint")
                                        .AddCompatibilityList(new String[] { "twokai_flint" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Form Upgrade Gears
        public static final DeferredItem<Item> TWOKAI_CUTANNER_GEAR = ITEMS.register("twokai_cutanner_gear",
                        () -> new ZenkaiGearItem(new Item.Properties(), 0, "", "twokaizer_cutanner",
                                        "twokaizer_belt", 0, 2)
                                        .ChangeRangerName("twokaizer_cutanner")
                                        .addSwitchForm(OtherItems.BLANK_FORM.get()).ChangeSlot(2)
                                        .AddCompatibilityList(new String[] { "twokaizer", "twokai_flint" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> TWOKAI_RICKY_GEAR = ITEMS.register("twokai_ricky_gear",
                        () -> new ZenkaiGearItem(new Item.Properties(), 0, "", "twokaizer_ricky",
                                        "twokaizer_belt", 0, 3)
                                        .ChangeRangerName("twokaizer_ricky").addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .ChangeSlot(2)
                                        .AddCompatibilityList(new String[] { "twokaizer", "twokai_flint" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> KIRAMEKI_ZENKAI_ZYU_GEAR = ITEMS.register("kirameki_zenkai_zyu_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "twokaizer_super",
                                        "twokaizer_belt")
                                        .ChangeRangerName("twokaizer_super").ChangeSlot(2)
                                        .AddCompatibilityList(new String[] { "twokaizer" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> ZENKAI_ZYU_GEAR = ITEMS.register("zenkai_zyu_gear",
                        () -> new ZenkaiGearItem(new Item.Properties(), 0, "", "zenkaizer_super",
                                        "zenkaizer_belt", 0, 5)
                                        .ChangeRangerName("zenkaizer_super")
                                        .AddCompatibilityList(new String[] { "zenkaizer", "twokaizer" })
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Jetman Gear
        public static final DeferredItem<Item> JETMAN_GEAR = ITEMS.register("jetman_gear",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zenkaizer_jetman",
                                        "zenkaizer_belt")
                                        .ChangeRangerName("zenkaizer_jetman").addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "zenkaizer" }).HasCape()
                                        .AddToTabList(RangerTabs.ZENKAIGER));

        // Other Generic Sentai Gears (No Form Change natively)
        public static final DeferredItem<Item> GORANGER_GEAR = ITEMS.register("goranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 1, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> JAKQ_GEAR = ITEMS.register("jakq_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 2, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> BATTLE_FEVER_GEAR = ITEMS.register("battle_fever_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 3, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DENZIMAN_GEAR = ITEMS.register("denziman_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 4, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> SUN_VULCAN_GEAR = ITEMS.register("sun_vulcan_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 5, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> GOGGLE_V_GEAR = ITEMS.register("goggle_v_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 6, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DYNAMAN_GEAR = ITEMS.register("dynaman_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 7, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> BIOMAN_GEAR = ITEMS.register("bioman_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 8, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> CHANGEMAN_GEAR = ITEMS.register("changeman_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 9, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> FLASHMAN_GEAR = ITEMS.register("flashman_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 10, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> MASKMAN_GEAR = ITEMS.register("maskman_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 11, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> LIVEMAN_GEAR = ITEMS.register("liveman_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 12, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> TURBORANGER_GEAR = ITEMS.register("turboranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 13, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> FIVEMAN_GEAR = ITEMS.register("fiveman_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 14, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> ZYURANGER_GEAR = ITEMS.register("zyuranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 16, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DAIRANGER_GEAR = ITEMS.register("dairanger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 17, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> KAKURANGER_GEAR = ITEMS.register("kakuranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 18, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> OHRANGER_GEAR = ITEMS.register("ohranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 19, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> CARRANGER_GEAR = ITEMS.register("carranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 20, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> MEGARANGER_GEAR = ITEMS.register("megaranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 21, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> GINGAMAN_GEAR = ITEMS.register("gingaman_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 22, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> GOGO_V_GEAR = ITEMS.register("gogo_v_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 23, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> TIMERANGER_GEAR = ITEMS.register("timeranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 24, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> GAORANGER_GEAR = ITEMS.register("gaoranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 25, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> HURRICANEGER_GEAR = ITEMS.register("hurricaneger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 26, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> ABARANGER_GEAR = ITEMS.register("abaranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 27, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DEKARANGER_GEAR = ITEMS.register("dekaranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 28, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> MAGIRANGER_GEAR = ITEMS.register("magiranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 29, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> BOUKENGER_GEAR = ITEMS.register("boukenger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 30, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> GEKIRANGER_GEAR = ITEMS.register("gekiranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 31, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> GO_ONGER_GEAR = ITEMS.register("go_onger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 32, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> SHINKENGER_GEAR = ITEMS.register("shinkenger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 33, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> GOSEIGER_GEAR = ITEMS.register("goseiger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 34, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> GOKAIGER_GEAR = ITEMS.register("gokaiger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 35, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> GO_BUSTERS_GEAR = ITEMS.register("go_busters_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 36, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> KYORYUGER_GEAR = ITEMS.register("kyoryuger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 37, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> TOQGER_GEAR = ITEMS.register("toqger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 38, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> NINNINGER_GEAR = ITEMS.register("ninninger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 39, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> ZYUOHGER_GEAR = ITEMS.register("zyuohger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 40, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> KYURANGER_GEAR = ITEMS.register("kyuranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 41, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> LUPINRANGER_GEAR = ITEMS.register("lupinranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 42, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> PATRANGER_GEAR = ITEMS.register("patranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 42, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RYUSOULGER_GEAR = ITEMS.register("ryusoulger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 43, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> KIRAMEIGER_GEAR = ITEMS.register("kirameiger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 44, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DON_BROTHERS_GEAR = ITEMS.register("don_brothers_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 46, false).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> AKIBARANGER_GEAR = ITEMS.register("akibaranger_gear",
                        () -> new SentaiGearItem(new Item.Properties(), 0, false).AddToTabList(RangerTabs.ZENKAIGER));

        // Dark Gears
        public static final DeferredItem<Item> DARK_GORANGER_GEAR = ITEMS.register("dark_goranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 1).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_JAKQ_GEAR = ITEMS.register("dark_jakq_gear",
                        () -> new DarkGearItem(new Item.Properties(), 2).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_BATTLE_FEVER_GEAR = ITEMS.register("dark_battle_fever_gear",
                        () -> new DarkGearItem(new Item.Properties(), 3).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_DENZIMAN_GEAR = ITEMS.register("dark_denziman_gear",
                        () -> new DarkGearItem(new Item.Properties(), 4).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_SUN_VULCAN_GEAR = ITEMS.register("dark_sun_vulcan_gear",
                        () -> new DarkGearItem(new Item.Properties(), 5).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_GOGGLE_V_GEAR = ITEMS.register("dark_goggle_v_gear",
                        () -> new DarkGearItem(new Item.Properties(), 6).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_DYNAMAN_GEAR = ITEMS.register("dark_dynaman_gear",
                        () -> new DarkGearItem(new Item.Properties(), 7).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_BIOMAN_GEAR = ITEMS.register("dark_bioman_gear",
                        () -> new DarkGearItem(new Item.Properties(), 8).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_CHANGEMAN_GEAR = ITEMS.register("dark_changeman_gear",
                        () -> new DarkGearItem(new Item.Properties(), 9).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_FLASHMAN_GEAR = ITEMS.register("dark_flashman_gear",
                        () -> new DarkGearItem(new Item.Properties(), 10).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_MASKMAN_GEAR = ITEMS.register("dark_maskman_gear",
                        () -> new DarkGearItem(new Item.Properties(), 11).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_LIVEMAN_GEAR = ITEMS.register("dark_liveman_gear",
                        () -> new DarkGearItem(new Item.Properties(), 12).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_TURBORANGER_GEAR = ITEMS.register("dark_turboranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 13).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_FIVEMAN_GEAR = ITEMS.register("dark_fiveman_gear",
                        () -> new DarkGearItem(new Item.Properties(), 14).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_JETMAN_GEAR = ITEMS.register("dark_jetman_gear",
                        () -> new DarkGearItem(new Item.Properties(), 15).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_ZYURANGER_GEAR = ITEMS.register("dark_zyuranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 16).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_DAIRANGER_GEAR = ITEMS.register("dark_dairanger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 17).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_KAKURANGER_GEAR = ITEMS.register("dark_kakuranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 18).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_OHRANGER_GEAR = ITEMS.register("dark_ohranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 19).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_CARRANGER_GEAR = ITEMS.register("dark_carranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 20).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_MEGARANGER_GEAR = ITEMS.register("dark_megaranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 21).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_GINGAMAN_GEAR = ITEMS.register("dark_gingaman_gear",
                        () -> new DarkGearItem(new Item.Properties(), 22).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_GOGO_V_GEAR = ITEMS.register("dark_gogo_v_gear",
                        () -> new DarkGearItem(new Item.Properties(), 23).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_TIMERANGER_GEAR = ITEMS.register("dark_timeranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 24).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_GAORANGER_GEAR = ITEMS.register("dark_gaoranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 25).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_HURRICANEGER_GEAR = ITEMS.register("dark_hurricaneger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 26).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_ABARANGER_GEAR = ITEMS.register("dark_abaranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 27).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_DEKARANGER_GEAR = ITEMS.register("dark_dekaranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 28).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_MAGIRANGER_GEAR = ITEMS.register("dark_magiranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 29).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_BOUKENGER_GEAR = ITEMS.register("dark_boukenger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 30).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_GEKIRANGER_GEAR = ITEMS.register("dark_gekiranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 31).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_GO_ONGER_GEAR = ITEMS.register("dark_go_onger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 32).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_SHINKENGER_GEAR = ITEMS.register("dark_shinkenger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 33).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_GOSEIGER_GEAR = ITEMS.register("dark_goseiger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 34).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_GOKAIGER_GEAR = ITEMS.register("dark_gokaiger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 35).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_GO_BUSTERS_GEAR = ITEMS.register("dark_go_busters_gear",
                        () -> new DarkGearItem(new Item.Properties(), 36).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_KYORYUGER_GEAR = ITEMS.register("dark_kyoryuger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 37).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_TOQGER_GEAR = ITEMS.register("dark_toqger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 38).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_NINNINGER_GEAR = ITEMS.register("dark_ninninger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 39).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_ZYUOHGER_GEAR = ITEMS.register("dark_zyuohger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 40).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_KYURANGER_GEAR = ITEMS.register("dark_kyuranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 41).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_LUPINRANGER_GEAR = ITEMS.register("dark_lupinranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 42).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_PATRANGER_GEAR = ITEMS.register("dark_patranger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 42).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_RYUSOULGER_GEAR = ITEMS.register("dark_ryusoulger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 43).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_KIRAMEIGER_GEAR = ITEMS.register("dark_kirameiger_gear",
                        () -> new DarkGearItem(new Item.Properties(), 44).AddToTabList(RangerTabs.ZENKAIGER));

        public static final DeferredItem<Item> DARK_ZENKAI_JURAN_GEAR = ITEMS.register("dark_zenkai_juran_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_ZENKAI_GAON_GEAR = ITEMS.register("dark_zenkai_gaon_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_ZENKAI_MAGINE_GEAR = ITEMS.register("dark_zenkai_magine_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_ZENKAI_VROON_GEAR = ITEMS.register("dark_zenkai_vroon_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_TWOKAIZER_GEAR = ITEMS.register("dark_twokaizer_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_TWOKAI_CUTANNER_GEAR = ITEMS.register("dark_twokai_cutanner_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> DARK_TWOKAI_RICKY_GEAR = ITEMS.register("dark_twokai_ricky_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));

        // Red Gears
        public static final DeferredItem<Item> RED_GORANGER_GEAR = ITEMS.register("red_goranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_JAKQ_GEAR = ITEMS.register("red_jakq_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_BATTLE_FEVER_GEAR = ITEMS.register("red_battle_fever_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_DENZIMAN_GEAR = ITEMS.register("red_denziman_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_SUN_VULCAN_GEAR = ITEMS.register("red_sun_vulcan_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_GOGGLE_V_GEAR = ITEMS.register("red_goggle_v_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_DYNAMAN_GEAR = ITEMS.register("red_dynaman_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_BIOMAN_GEAR = ITEMS.register("red_bioman_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_CHANGEMAN_GEAR = ITEMS.register("red_changeman_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_FLASHMAN_GEAR = ITEMS.register("red_flashman_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_MASKMAN_GEAR = ITEMS.register("red_maskman_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_LIVEMAN_GEAR = ITEMS.register("red_liveman_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_TURBORANGER_GEAR = ITEMS.register("red_turboranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_FIVEMAN_GEAR = ITEMS.register("red_fiveman_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_JETMAN_GEAR = ITEMS.register("red_jetman_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_ZYURANGER_GEAR = ITEMS.register("red_zyuranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_DAIRANGER_GEAR = ITEMS.register("red_dairanger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_KAKURANGER_GEAR = ITEMS.register("red_kakuranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_OHRANGER_GEAR = ITEMS.register("red_ohranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_CARRANGER_GEAR = ITEMS.register("red_carranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_MEGARANGER_GEAR = ITEMS.register("red_megaranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_GINGAMAN_GEAR = ITEMS.register("red_gingaman_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_GOGO_V_GEAR = ITEMS.register("red_gogo_v_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_TIMERANGER_GEAR = ITEMS.register("red_timeranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_GAORANGER_GEAR = ITEMS.register("red_gaoranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_HURRICANEGER_GEAR = ITEMS.register("red_hurricaneger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_ABARANGER_GEAR = ITEMS.register("red_abaranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_DEKARANGER_GEAR = ITEMS.register("red_dekaranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_MAGIRANGER_GEAR = ITEMS.register("red_magiranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_BOUKENGER_GEAR = ITEMS.register("red_boukenger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_GEKIRANGER_GEAR = ITEMS.register("red_gekiranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_GO_ONGER_GEAR = ITEMS.register("red_go_onger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_SHINKENGER_GEAR = ITEMS.register("red_shinkenger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_GOSEIGER_GEAR = ITEMS.register("red_goseiger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_GOKAIGER_GEAR = ITEMS.register("red_gokaiger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_GO_BUSTERS_GEAR = ITEMS.register("red_go_busters_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_KYORYUGER_GEAR = ITEMS.register("red_kyoryuger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_TOQGER_GEAR = ITEMS.register("red_toqger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_NINNINGER_GEAR = ITEMS.register("red_ninninger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_ZYUOHGER_GEAR = ITEMS.register("red_zyuohger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_KYURANGER_GEAR = ITEMS.register("red_kyuranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_LUPINRANGER_GEAR = ITEMS.register("red_lupinranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_PATRANGER_GEAR = ITEMS.register("red_patranger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_RYUSOULGER_GEAR = ITEMS.register("red_ryusoulger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> RED_KIRAMEIGER_GEAR = ITEMS.register("red_kirameiger_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));

        // Metallic Gears
        public static final DeferredItem<Item> METALLIC_ZENKAIZER_GEAR = ITEMS.register("metallic_zenkaizer_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> METALLIC_ZENKAI_JURAN_GEAR = ITEMS.register("metallic_zenkai_juran_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> METALLIC_ZENKAI_GAON_GEAR = ITEMS.register("metallic_zenkai_gaon_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> METALLIC_ZENKAI_MAGINE_GEAR = ITEMS.register(
                        "metallic_zenkai_magine_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> METALLIC_ZENKAI_VROON_GEAR = ITEMS.register("metallic_zenkai_vroon_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> METALLIC_TWOKAIZER_GEAR = ITEMS.register("metallic_twokaizer_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));

        public static final DeferredItem<Item> SUPER_SENTAI_GEAR = ITEMS.register("super_sentai_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> ZENKAIGER_ASOBOU_GEAR = ITEMS.register("zenkaiger_asobou_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> SUPER_HERO_TIME_GEAR = ITEMS.register("super_hero_time_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));

        public static final DeferredItem<Item> ZI_O_GEAR = ITEMS.register("zi_o_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> ZERO_ONE_GEAR = ITEMS.register("zero_one_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> SABER_GEAR = ITEMS.register("saber_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));

        // New Zenkaizer
        public static final DeferredItem<Item> NEW_ZENKAIZER_GEAR = ITEMS.register("new_zenkaizer_gear",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZENKAIGER));
        public static final DeferredItem<Item> ZENKAIGER_HELMET = ITEMS.register("zenkaiger_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<Item> ZENKAIGER_CHESTPLATE = ITEMS.register("zenkaiger_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<Item> ZENKAIGER_LEGGINGS = ITEMS.register("zenkaiger_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        // Changers
        public static final DeferredItem<Item> ZENKAIZER_GEARTLINGER = ITEMS.register("zenkaizer_geartlinger",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "zenkaizer", ZENKAIZER_GEAR,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> JURAN_GEARTLINGER = ITEMS.register("juran_geartlinger",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "zenkai_juran", ZENKAI_JURAN_GEAR,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> GAON_GEARTLINGER = ITEMS.register("gaon_geartlinger",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "zenkai_gaon", ZENKAI_GAON_GEAR,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> MAGINE_GEARTLINGER = ITEMS.register("magine_geartlinger",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "zenkai_magine", ZENKAI_MAGINE_GEAR,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> VROON_GEARTLINGER = ITEMS.register("vroon_geartlinger",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "zenkai_vroon", ZENKAI_VROON_GEAR,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> RED_GEARTLINGER = ITEMS.register("red_geartlinger",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "zenkai_red", ZENKAI_RED_GEAR,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> TWOKAIZER_GEARDALINGER = ITEMS.register("twokaizer_geardalinger",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "twokaizer", TWOKAIZER_GEAR,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> TWOKAI_FLINT_GEARDALINGER = ITEMS.register("twokai_flint_geardalinger",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "twokai_flint", TWOKAI_FLINT_GEAR,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> STACAESAR_GEARTOZINGER = ITEMS.register("stacaeser_geartozinger",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "stacaesar", STACAESAR_GEAR,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> HAKAIZER_BELT = ITEMS.register("hakaizer_belt",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "hakaizer", OtherItems.BLANK_FORM,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .Override_belt_text("hakaizer_belt")
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        // Wait, Mecha Dark Gear isn't in Creative Tab.
        public static final DeferredItem<Item> MECHA_DARK_GEAR = ITEMS.register("mecha_dark_gear",
                        () -> new com.liasdan.supersentaicraft.items.sentai_50.zenkaiger.GeartlingerItem(
                                        ArmorMaterials.DIAMOND, "mecha", OtherItems.BLANK_FORM,
                                        ZENKAIGER_HELMET, ZENKAIGER_CHESTPLATE, ZENKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        // Weapons
        public static final DeferredItem<Item> GEARTLINGER = ITEMS.register("geartlinger",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<Item> GEARDALINGER = ITEMS.register("geardalinger",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsSwordGun()
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<Item> GEARTOZINGER = ITEMS.register("geartozinger",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> JURAN_SWORD = ITEMS.register("juran_sword",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<Item> JURAN_SHIELD = ITEMS.register("juran_shield",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseShieldItem(new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<Item> GAON_CLAW = ITEMS.register("gaon_claw",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<Item> MAGINE_STICK = ITEMS.register("magine_stick",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<Item> VROON_PICKER = ITEMS.register("vroon_picker",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 7, -3.0F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> TAIL_DRILL = ITEMS.register("tail_drill",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 7, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<Item> ZENRYOKU_ZENKAI_CANNON = ITEMS.register("zenryoku_zenkai_cannon",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 8, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));

        public static final DeferredItem<Item> STA_SHIELD = ITEMS.register("sta_shield",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseShieldItem(new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER).ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> V_MERANG = ITEMS
                        .register("v_merang",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(Tiers.DIAMOND,
                                                        6, -2.4F, new Item.Properties())
                                                        .AddToTabList(RangerTabs.ZENKAIGER)
                                                        .ChangeRepairItem(BLANK_SENTAI_GEAR.get()));
        public static final DeferredItem<Item> WHITE_RIBBON = ITEMS.register("white_ribbon",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZENKAIGER)); // repair item uses goggle v logo?

        public static void register(net.neoforged.bus.api.IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
