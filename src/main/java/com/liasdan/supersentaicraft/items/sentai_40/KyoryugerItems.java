package com.liasdan.supersentaicraft.items.sentai_40;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GaburiChangerItem;
import com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GaburivolverItem;
import com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.ZyudenchiItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.effect.MobEffects;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class KyoryugerItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        public static final DeferredItem<Item> KYORYUGER_LOGO = ITEMS.register("kyoryuger_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYORYUGER));

        // ==========================================
        // COLLECTIBLE ITEMS / ZYUDENCHI
        // ==========================================
        public static final DeferredItem<Item> EMPTY_ZYUDENCHI = ITEMS.register("empty_zyudenchi",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> GABUTYRA_ZYUDENCHI = ITEMS.register("gabutyra_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_red", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false), new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> GIGA_BRAGIGAS_ZYUDENCHI = ITEMS.register("giga_bragigas_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_silver", "kyoryuger_belt", new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.SLASH, 40, 1, true, false), new MobEffectInstance(EffectCore.FLYING, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> CARNIVAL_ZYUDENCHI = ITEMS.register("carnival_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_red_carnival",
                                        "kyoryuger_belt",
                                        new MobEffectInstance(EffectCore.SLASH, 40, 1, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 1, true, false))
                                        .ChangeModel("ranger.geo.json").ChangeRangerName("kyoryuger_red_carnival")
                                        .AddCompatibilityList(new String[] { "kyoryuger" })
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> TOBASPINO_ZYUDENCHI = ITEMS.register("tobaspino_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_navy", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.SLASH, 40, 2, true, false))
                                        .ChangeRangerName("kyoryuger_navy")
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> DEBOTH_TOBASPINO_ZYUDENCHI = ITEMS.register("deboth_tobaspino_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "deathryuger", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false), new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false), new MobEffectInstance(EffectCore.SLASH, 40, 1, true, false))
                                        .ChangeRangerName("deathryuger")
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> ANKYDON_ZYUDENCHI = ITEMS.register("ankydon_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_cyan", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> BUNPACHY_ZYUDENCHI = ITEMS.register("bunpachy_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_grey", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.PUNCH, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> PLEZUON_ZYUDENCHI = ITEMS.register("plezuon_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_violet", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false), new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false), new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> BRAGIGAS_ZYUDENCHI = ITEMS.register("bragigas_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_silver", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.SLASH, 40, 1, true, false), new MobEffectInstance(EffectCore.FLYING, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> PARASAGUN_ZYUDENCHI = ITEMS.register("parasagun_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_black", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false), new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> STEGOTCHI_ZYUDENCHI = ITEMS.register("stegotchi_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_blue", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> ZAKUTOR_ZYUDENCHI = ITEMS.register("zakutor_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_green", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.SLASH, 40, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> DRICERA_ZYUDENCHI = ITEMS.register("dricera_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_pink", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false), new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> PTERAGORDON_ZYUDENCHI = ITEMS.register("pteragordon_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_gold", "kyoryu_gold_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 1, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 1, true, false), new MobEffectInstance(EffectCore.FLYING, 40, 1, true, false), new MobEffectInstance(MobEffects.JUMP, 40, 1, true, false), new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 1, true, false), new MobEffectInstance(EffectCore.SLASH, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> CYAN_SPIRIT_ZYUDENCHI = ITEMS.register("cyan_spirit_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryu_cyan_spirit", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryu_cyan_spirit").AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> GREY_SPIRIT_ZYUDENCHI = ITEMS.register("grey_spirit_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryu_grey_spirit", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryu_grey_spirit").AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> DEINOSGRANDER_ZYUDENCHI = ITEMS.register("deinosgrander_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3, true, false), new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3, true, false), new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> DEINOCHASER_ZYUDENCHI = ITEMS.register("deinochaser_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.others.SummonBikeItem(new Item.Properties(),
                                        MobsCore.DEINOCHASER).AddToList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> DEBOTH_DEINOCHASER_ZYUDENCHI = ITEMS
                        .register("deboth_deinochaser_zyudenchi",
                                        () -> new com.liasdan.supersentaicraft.items.others.SummonBikeItem(
                                                        new Item.Properties(), MobsCore.DEINOCHASER)
                                                        .AddToList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> DEBOTH_DEINOSGRANDER_ZYUDENCHI = ITEMS.register(
                        "deboth_deinosgrander_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt")
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> BLANK_BRAVE_ZYUDENCHI = ITEMS.register("blank_brave_zyudenchi",
                        () -> new Item(new Item.Properties()));

        public static final DeferredItem<Item> GUNTYRA_ZYUDENCHI = ITEMS.register("guntyra_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "brave_kyoryu_red", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> STEGONSAW_ZYUDENCHI = ITEMS.register("stegonsaw_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "brave_kyoryu_black", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 600, 0, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> SHOVECERA_ZYUDENCHI = ITEMS.register("shovecera_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "brave_kyoryu_blue", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 600, 0, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> PARASASER_ZYUDENCHI = ITEMS.register("parasaser_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "brave_kyoryu_green", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.JUMP, 600, 0, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> RAPX_ZYUDENCHI = ITEMS.register("rapx_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "brave_kyoryu_pink", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 600, 0, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> PTERAVOLTON_ZYUDENCHI = ITEMS.register("pteravolton_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "brave_kyoryu_gold", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600, 0, true, false))
                                        .AddCompatibilityList(new String[] { "brave_kyoryu_gold" })
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> SPEEDRUS_ZYUDENCHI = ITEMS.register("speedrus_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 9, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> PRISUKEOS_ZYUDENCHI = ITEMS.register("prisukeos_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 10, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> FUWANYCTO_ZYUDENCHI = ITEMS.register("fuwanycto_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 11, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> KACHICOX_ZYUDENCHI = ITEMS.register("kachicox_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 12, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> KARATETA_ZYUDENCHI = ITEMS.register("karateta_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 13, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> TAEKWONDONTO_ZYUDENCHI = ITEMS.register("taekwondonto_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 14, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> DOUBLE_GABUTYRA_ZYUDENCHI = ITEMS.register("double_gabutyra_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_red", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3, true, false), new MobEffectInstance(MobEffects.SATURATION, 40, 3, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> SPIRIT_PLEZUON_ZYUDENCHI = ITEMS.register("spirit_plezuon_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_violet", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false), new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false), new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 2, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        public static final DeferredItem<Item> DEBOTH_GABUTYRA_ZYUDENCHI = ITEMS.register("deboth_gabutyra_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_red", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .AddToTabList(RangerTabs.KYORYUGER));

        // ==========================================
        // HIDDEN FORMS (NOT IN CREATIVE TAB)
        // ==========================================
        // ==========================================
        // EXTRA ZYUDENCHIS
        // ==========================================
        public static final DeferredItem<Item> ALLOMERUS_ZYUDENCHI = ITEMS.register("allomerus_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 11)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> ARCHENOLON_ZYUDENCHI = ITEMS.register("archenolon_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 9)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> BEYONSMO_ZYUDENCHI = ITEMS.register("beyonsmo_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 12)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> FUTABAIN_ZYUDENCHI = ITEMS.register("futabain_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 10)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> GURUMONITE_ZYUDENCHI = ITEMS.register("gurumonite_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 7)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> IGERANODON_ZYUDENCHI = ITEMS.register("igeranodon_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 3)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> KENTROSPIKER_ZYUDENCHI = ITEMS.register("kentrospiker_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 8)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> OVIRAPPOO_ZYUDENCHI = ITEMS.register("ovirappoo_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 2)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> PUKUPTOR_ZYUDENCHI = ITEMS.register("pukuptor_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 4)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> STYMERO_ZYUDENCHI = ITEMS.register("stymero_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> TUPERANDA_ZYUDENCHI = ITEMS.register("tuperanda_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 6)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> VICTORY_ZYUDENCHI = ITEMS.register("victory_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> MAXIMUM_ZYUDENCHI = ITEMS.register("maximum_zyudenchi",
                        () -> new com.liasdan.supersentaicraft.items.sentai_30.kyoryuger.GuardianZyudenchiItem(new Item.Properties(), 14)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> SP_ZYUDENCHI = ITEMS.register("sp_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> BLANK_DEBOTH_ZYUDENCHI = ITEMS.register("blank_deboth_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_ALLOMERUS_ZYUDENCHI = ITEMS.register("deboth_allomerus_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_ANKYDON_ZYUDENCHI = ITEMS.register("deboth_ankydon_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_ARCHENOLON_ZYUDENCHI = ITEMS.register(
                        "deboth_archenolon_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_BEYONSMO_ZYUDENCHI = ITEMS.register("deboth_beyonsmo_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_BRAGIGAS_ZYUDENCHI = ITEMS.register("deboth_bragigas_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_BUNPACHY_ZYUDENCHI = ITEMS.register("deboth_bunpachy_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_DRICERA_ZYUDENCHI = ITEMS.register("deboth_dricera_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_FUTABAIN_ZYUDENCHI = ITEMS.register("deboth_futabain_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_GURUMONITE_ZYUDENCHI = ITEMS.register(
                        "deboth_gurumonite_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_IGERANODON_ZYUDENCHI = ITEMS.register(
                        "deboth_igeranodon_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_KENTROSPIKER_ZYUDENCHI = ITEMS.register(
                        "deboth_kentrospiker_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_OVIRAPPOO_ZYUDENCHI = ITEMS.register("deboth_ovirappoo_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_PARASAGUN_ZYUDENCHI = ITEMS.register("deboth_parasagun_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_PLEZUON_ZYUDENCHI = ITEMS.register("deboth_plezuon_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_PTERAGORDON_ZYUDENCHI = ITEMS.register(
                        "deboth_pteragordon_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_PUKUPTOR_ZYUDENCHI = ITEMS.register("deboth_pukuptor_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_STEGOTCHI_ZYUDENCHI = ITEMS.register("deboth_stegotchi_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_STYMERO_ZYUDENCHI = ITEMS.register("deboth_stymero_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_TUPERANDA_ZYUDENCHI = ITEMS.register("deboth_tuperanda_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> DEBOTH_ZAKUTOR_ZYUDENCHI = ITEMS.register("deboth_zakutor_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> GHOST_STEGOTCHI_ZYUDENCHI = ITEMS.register("ghost_stegotchi_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));
        public static final DeferredItem<Item> SPIRIT_PTERAGORDON_ZYUDENCHI = ITEMS.register(
                        "spirit_pteragordon_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "", "kyoryuger_belt", null, null)
                                        .AddToTabList(RangerTabs.KYORYUGER));

        // ==========================================
        // RE-ADDED ZYUDENCHIS (Gabutyra Human, Cursed, Ghost)
        // ==========================================
        public static final DeferredItem<Item> RED_GABUTYRA_ZYUDENCHI = ITEMS.register("red_gabutyra_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_red_gabutyra",
                                        "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryuger_red_gabutyra"));

        public static final DeferredItem<Item> CURSED_RED_ZYUDENCHI = ITEMS.register("cursed_red_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_red_cursed", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryuger_red_cursed"));

        public static final DeferredItem<Item> CURSED_BLACK_ZYUDENCHI = ITEMS.register("cursed_black_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_black_cursed",
                                        "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryuger_black_cursed"));

        public static final DeferredItem<Item> CURSED_BLUE_ZYUDENCHI = ITEMS.register("cursed_blue_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_blue_cursed", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryuger_blue_cursed"));

        public static final DeferredItem<Item> CURSED_GREEN_ZYUDENCHI = ITEMS.register("cursed_green_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_green_cursed",
                                        "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryuger_green_cursed"));

        public static final DeferredItem<Item> CURSED_PINK_ZYUDENCHI = ITEMS.register("cursed_pink_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_pink_cursed", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryuger_pink_cursed"));

        public static final DeferredItem<Item> CURSED_GOLD_ZYUDENCHI = ITEMS.register("cursed_gold_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_gold_cursed", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryuger_gold_cursed"));

        public static final DeferredItem<Item> GHOST_BLUE_ZYUDENCHI = ITEMS.register("ghost_blue_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryu_blue_ghost", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryu_blue_ghost"));

        public static final DeferredItem<Item> VIOLET_GUY_ZYUDENCHI = ITEMS.register("violet_guy_zyudenchi",
                        () -> new ZyudenchiItem(new Item.Properties(), 0, "", "kyoryuger_violet_guy", "kyoryuger_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 1, true, false))
                                        .ChangeRangerName("kyoryuger_violet_guy"));

        // ==========================================
        // ARMOR
        // ==========================================
        public static final DeferredItem<Item> KYORYUGER_HELMET = ITEMS.register("kyoryuger_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));
        public static final DeferredItem<Item> KYORYUGER_CHESTPLATE = ITEMS.register("kyoryuger_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties()).AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));
        public static final DeferredItem<Item> KYORYUGER_LEGGINGS = ITEMS.register("kyoryuger_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties()).AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        // ==========================================
        // CHANGERS
        // ==========================================
        public static final DeferredItem<Item> KYORYU_RED_GABURIVOLVER = ITEMS.register("kyoryu_red_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "kyoryuger_red", GABUTYRA_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> KYORYU_BLACK_GABURIVOLVER = ITEMS.register("kyoryu_black_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "kyoryuger_black", PARASAGUN_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> KYORYU_BLUE_GABURIVOLVER = ITEMS.register("kyoryu_blue_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "kyoryuger_blue", STEGOTCHI_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> KYORYU_GREEN_GABURIVOLVER = ITEMS.register("kyoryu_green_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "kyoryuger_green", ZAKUTOR_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> KYORYU_PINK_GABURIVOLVER = ITEMS.register("kyoryu_pink_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "kyoryuger_pink", DRICERA_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> KYORYU_GOLD_GABURICHANGER = ITEMS.register("kyoryu_gold_gaburichanger",
                        () -> new GaburiChangerItem(ArmorMaterials.DIAMOND, "kyoryuger_gold", PTERAGORDON_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> CYAN_GABURIVOLVER = ITEMS.register("cyan_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "kyoryuger_cyan", ANKYDON_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> GREY_GABURIVOLVER = ITEMS.register("grey_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "kyoryuger_grey", BUNPACHY_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> VIOLET_GABURIVOLVER = ITEMS.register("violet_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "kyoryuger_violet", PLEZUON_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> SILVER_GIGA_GABURIVOLVER = ITEMS.register("silver_giga_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "kyoryuger_silver", BRAGIGAS_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> NAVY_GABURIVOLVER = ITEMS.register("navy_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "kyoryuger_navy", TOBASPINO_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> DEATH_FLUTE_BUSTER = ITEMS.register("death_flute_buster",
                        () -> new com.liasdan.supersentaicraft.items.others.RangerChangerItem(ArmorMaterials.DIAMOND,
                                        "deathryuger", DEBOTH_TOBASPINO_ZYUDENCHI, KYORYUGER_HELMET,
                                        KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS, new Item.Properties())
                                        .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER).ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> RED_GABU_GABURIVOLVER = ITEMS.register("red_gabu_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "brave_kyoryu_red", GUNTYRA_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        public static final DeferredItem<Item> BLACK_GABU_GABURIVOLVER = ITEMS.register("black_gabu_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "brave_kyoryu_black", STEGONSAW_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        public static final DeferredItem<Item> BLUE_GABU_GABURIVOLVER = ITEMS.register("blue_gabu_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "brave_kyoryu_blue", SHOVECERA_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        public static final DeferredItem<Item> GREEN_GABU_GABURIVOLVER = ITEMS.register("green_gabu_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "brave_kyoryu_green", PARASASER_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        public static final DeferredItem<Item> PINK_GABU_GABURIVOLVER = ITEMS.register("pink_gabu_gaburivolver",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "brave_kyoryu_pink", RAPX_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        public static final DeferredItem<Item> GOLD_GABU_GABUCHANGER = ITEMS.register("gold_gabu_gabuchanger",
                        () -> new GaburivolverItem(ArmorMaterials.DIAMOND, "brave_kyoryu_gold", PTERAVOLTON_ZYUDENCHI,
                                        KYORYUGER_HELMET, KYORYUGER_CHESTPLATE, KYORYUGER_LEGGINGS,
                                        new Item.Properties()).Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        // ==========================================
        // WEAPONS
        // ==========================================
        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseBlasterItem> GABURIVOLVER = ITEMS
                        .register("gaburivolver",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 12, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseBlasterItem> GABURICHANGER = ITEMS
                        .register("gaburichanger",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 12, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));
        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> GABURICALIBUR = ITEMS
                        .register("gaburicalibur",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 5, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> ZANDAR_THUNDER = ITEMS
                        .register("zandar_thunder",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 6, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> GOLDER_ZANDAR_THUNDER = ITEMS
                        .register("golder_zandar_thunder",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 7, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> GABUTYRA_FANG = ITEMS
                        .register("gabutyra_fang",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 5, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseBlasterItem> PARASA_SHOT = ITEMS
                        .register("parasa_shot",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 5, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseShieldItem> STEGO_SHIELD = ITEMS
                        .register("stego_shield",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseShieldItem(
                                                        new Item.Properties()
                                                                        .attributes(net.minecraft.world.item.SwordItem
                                                                                        .createAttributes(
                                                                                                        net.minecraft.world.item.Tiers.DIAMOND,
                                                                                                        5, -2.4F)))
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> ZAKUTOR_SLASHER = ITEMS
                        .register("zakutor_slasher",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 5, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> DRICE_LANCE = ITEMS
                        .register("drice_lance",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 11, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> FEATHER_EDGE = ITEMS
                        .register("feather_edge",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 13, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseBlasterItem> FANG_SHOT = ITEMS
                        .register("fang_shot",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 10, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> SHIELD_LAN_SLASHER = ITEMS
                        .register("shield_lan_slasher",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 11, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> SLASH_SHIELD_SHOT = ITEMS
                        .register("slash_shield_shot",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 13, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseCannonItem> KENTROSPIKER = ITEMS
                        .register("kentrospiker",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseCannonItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 20, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseBlasterItem> GABURU_CANNON = ITEMS
                        .register("gaburu_cannon",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 15, -2.4F,
                                                        new Item.Properties().craftRemainder(GABURICALIBUR.get()))
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseBlasterItem> GABURU_CANNON_BAYONET = ITEMS
                        .register("gaburu_cannon_bayonet",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 15, -2.4F,
                                                        new Item.Properties().craftRemainder(GABURICALIBUR.get()))
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseBlasterItem> GABUTYRA_DE_CARNIVAL = ITEMS
                        .register("gabutyra_de_carnival",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 15, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseBlasterItem> GABUTYRA_DE_CARNIVAL_GUN = ITEMS
                        .register("gabutyra_de_carnival_gun",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 15, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseBlasterItem> GABURI_CARNIVAL = ITEMS
                        .register("gaburi_carnival",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 20, -2.4F,
                                                        new Item.Properties()
                                                                        .craftRemainder(GABUTYRA_DE_CARNIVAL.get()))
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseBlasterItem> GIGA_GABURIVOLVER = ITEMS
                        .register("giga_gaburivolver",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 15, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseDualSwordItem> FLUTE_BUSTER = ITEMS
                        .register("flute_buster",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseDualSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 13, -2.4F,
                                                        new Item.Properties())
                                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                                        .AddToTabList(RangerTabs.KYORYUGER)
                                                        .ChangeRepairItem(EMPTY_ZYUDENCHI.get()));

        public static final DeferredItem<Item> GABU_GABURIVOLVER = ITEMS.register("gabu_gaburivolver",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                        net.minecraft.world.item.Tiers.DIAMOND, 3, -2.4f, new Item.Properties())
                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        public static final DeferredItem<Item> GABU_GABUCHANGER = ITEMS.register("gabu_gabuchanger",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                        net.minecraft.world.item.Tiers.DIAMOND, 3, -2.4f, new Item.Properties())
                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        public static final DeferredItem<Item> GABU_GABUCALIBUR = ITEMS.register("gabu_gabucalibur",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                        net.minecraft.world.item.Tiers.DIAMOND, 3, -2.4f, new Item.Properties())
                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        public static final DeferredItem<Item> GABU_GABUCANNON = ITEMS.register("gabu_gabucannon",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseBlasterItem(
                                        net.minecraft.world.item.Tiers.DIAMOND, 3, -2.4f,
                                        new Item.Properties().craftRemainder(GABU_GABUCALIBUR.get()))
                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        public static final DeferredItem<Item> BRAVE_ZANDAR_THUNDER = ITEMS.register("brave_zandar_thunder",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                        net.minecraft.world.item.Tiers.DIAMOND, 3, -2.4f, new Item.Properties())
                                        .AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM)
                                        .AddToTabList(RangerTabs.KYORYUGER)
                                        .ChangeRepairItem(BLANK_BRAVE_ZYUDENCHI.get()));

        // ==========================================
        // MISC
        // ==========================================

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);

        }
        // ==========================================
        // FUTURE GABURIVOLVERS

        public static final DeferredItem<Item> MO_BUCKLE = ITEMS.register("mo_buckle",
                        () -> new BaseItem(new Item.Properties()));
        public static final DeferredItem<Item> GOLD_MO_BUCKLE = ITEMS.register("gold_mo_buckle",
                        () -> new BaseItem(new Item.Properties()));
        public static final DeferredItem<Item> SPIRIT_MO_BUCKLE = ITEMS.register("spirit_mo_buckle",
                        () -> new BaseItem(new Item.Properties()));
        public static final DeferredItem<Item> KYORYU_SILVER_WINGS = ITEMS.register("kyoryu_silver_wings",
                        () -> new BaseItem(new Item.Properties()));

        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> CHAOS_CALIBUR = ITEMS
                        .register("chaos_calibur",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 3, -2.4F,
                                                        new Item.Properties()).AddToTabList(RangerTabs.MISC));
        public static final DeferredItem<Item> CHAOS_STONE = ITEMS.register("chaos_stone",
                        () -> new com.liasdan.supersentaicraft.items.others.BaseItem(new Item.Properties())
                                        .AddToTabList(RangerTabs.MISC));
        public static final DeferredItem<com.liasdan.supersentaicraft.items.others.BaseSwordItem> KENKA_JOUTOU = ITEMS
                        .register("kenka_joutou",
                                        () -> new com.liasdan.supersentaicraft.items.others.BaseSwordItem(
                                                        net.minecraft.world.item.Tiers.DIAMOND, 3, -2.4F,
                                                        new Item.Properties()).AddToTabList(RangerTabs.MISC));

        // ==========================================

}
