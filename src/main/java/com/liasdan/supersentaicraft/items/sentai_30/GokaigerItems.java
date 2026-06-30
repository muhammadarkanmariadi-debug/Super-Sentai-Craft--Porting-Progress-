package com.liasdan.supersentaicraft.items.sentai_30;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.OtherItems;
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

public class GokaigerItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // 1. Logo
        public static final DeferredItem<Item> GOKAIGER_LOGO = ITEMS.register("gokaiger_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MISC));

        // 2. Base Items
        public static final DeferredItem<Item> GOKAIGER_BELT = ITEMS.register("gokaiger_belt",
                        () -> new BaseItem(new Item.Properties()));

        // 3. Armors

        // 4. Form Change Items
        public static final DeferredItem<Item> GOKAI_RED_KEY = ITEMS.register("gokai_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "gokai_red", "gokaiger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false))
                                        .ChangeRangerName("gokai_red") // Assuming generic belt model fo              // now
                                        .AddToTabList(RangerTabs.GOKAIGER));

        public static final DeferredItem<Item> AKARANGER_KEY = ITEMS.register("akaranger_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "akaranger", "akaranger_belt")
                                        .ChangeRangerName("akaranger")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> SPADE_ACE_KEY = ITEMS.register("spade_ace_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "spade_ace", "jakq_belt")
                                        .ChangeRangerName("spade_ace")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> VUL_EAGLE_KEY = ITEMS.register("vul_eagle_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "vul_eagle", "sun_vulcan_belt")
                                        .ChangeRangerName("vul_eagle")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> DYNA_RED_KEY = ITEMS.register("dyna_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "dyna_red", "dynaman_belt")
                                        .ChangeRangerName("dyna_red")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> CHANGE_DRAGON_KEY = ITEMS.register("change_dragon_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "change_dragon", "changeman_belt")
                                        .ChangeRangerName("change_dragon")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> RED_MASK_KEY = ITEMS.register("red_mask_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "red_mask", "maskman_belt")
                                        .ChangeRangerName("red_mask")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> RED_FALCON_KEY = ITEMS.register("red_falcon_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "red_falcon", "liveman_belt")
                                        .ChangeRangerName("red_falcon")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> FIVE_RED_KEY = ITEMS.register("five_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "five_red", "fiveman_belt")
                                        .ChangeRangerName("five_red")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> OH_RED_KEY = ITEMS.register("oh_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "oh_red", "ohranger_belt")
                                        .ChangeRangerName("oh_red")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> RED_RACER_KEY = ITEMS.register("red_racer_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "red_racer", "carranger_belt")
                                        .ChangeRangerName("red_racer")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> GINGA_RED_KEY = ITEMS.register("ginga_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "ginga_red", "gingaman_belt")
                                        .ChangeRangerName("ginga_red")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> TIME_RED_KEY = ITEMS.register("time_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "time_red", "timeranger_belt")
                                        .ChangeRangerName("time_red")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> GAO_RED_KEY = ITEMS.register("gao_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "gao_red", "gaoranger_belt")
                                        .ChangeRangerName("gao_red")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> HURRICANE_RED_KEY = ITEMS.register("hurricane_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "hurricane_red",
                                        "hurricaneger_belt")
                                        .ChangeRangerName("hurricane_red")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> MAGI_RED_KEY = ITEMS.register("magi_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "magi_red", "magiranger_belt")
                                        .ChangeRangerName("magi_red")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> SHINKEN_RED_KEY = ITEMS.register("shinken_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "shinken_red", "shinkenger_belt")
                                        .ChangeRangerName("shinken_red")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> GOSEI_RED_KEY = ITEMS.register("gosei_red_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "gosei_red", "goseiger_belt")
                                        .ChangeRangerName("gosei_red")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> AKA_NINGER_KEY = ITEMS.register("aka_ninger_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "aka_ninger", "ninninger_belt")
                                        .ChangeRangerName("aka_ninger")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> GOLD_ANCHOR_KEY = ITEMS.register("gold_anchor_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "gold_anchor", "gokaiger_belt")
                                        .ChangeRangerName("gold_anchor")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> OOO_KEY = ITEMS.register("ooo_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "ooo", "ooo_belt")
                                        .ChangeRangerName("ooo")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> GATAKIRIBA_KEY = ITEMS.register("gatakiriba_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "gatakiriba", "ooo_belt")
                                        .ChangeRangerName("gatakiriba")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> LATORATAH_KEY = ITEMS.register("latoratah_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "latoratah", "ooo_belt")
                                        .ChangeRangerName("latoratah")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> SAGOZOU_KEY = ITEMS.register("sagozou_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "sagozou", "ooo_belt")
                                        .ChangeRangerName("sagozou")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> TAJADOL_KEY = ITEMS.register("tajadol_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "tajadol", "ooo_belt")
                                        .ChangeRangerName("tajadol")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> SHAUTA_KEY = ITEMS.register("shauta_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "shauta", "ooo_belt")
                                        .ChangeRangerName("shauta")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> PUTOTYRA_KEY = ITEMS.register("putotyra_key",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "putotyra", "ooo_belt")
                                        .ChangeRangerName("putotyra")
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> GOKAIGER_HELMET = ITEMS.register("gokai_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> GOKAIGER_CHESTPLATE = ITEMS.register("gokai_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.GOKAIGER));
        public static final DeferredItem<Item> GOKAIGER_LEGGINGS = ITEMS.register("gokai_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.GOKAIGER));

        // 5. Changers
        public static final DeferredItem<Item> RED_MOBIRATES = ITEMS.register("red_mobirates",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "gokai_red", GOKAI_RED_KEY,
                                        GOKAIGER_HELMET, GOKAIGER_CHESTPLATE, GOKAIGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.GOKAIGER));

        // 6. Weapons & Mechas
        public static final DeferredItem<Item> GOKAI_SABER = ITEMS.register("gokai_saber",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(GOKAIGER_LOGO.get()).AddToTabList(RangerTabs.GOKAIGER));

        public static final DeferredItem<Item> GOKAI_GUN = ITEMS.register("gokai_gun",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(GOKAIGER_LOGO.get()).AddToTabList(RangerTabs.GOKAIGER));

        public static final DeferredItem<Item> GOKAI_SPEAR_ANCHOR = ITEMS.register("gokai_spear_anchor",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(GOKAIGER_LOGO.get()).AddToTabList(RangerTabs.GOKAIGER));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
