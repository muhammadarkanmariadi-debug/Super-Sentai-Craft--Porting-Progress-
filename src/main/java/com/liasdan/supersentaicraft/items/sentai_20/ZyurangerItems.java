package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.sentai_20.zyuranger.DinoBucklerItem;
import com.liasdan.supersentaicraft.items.sentai_20.zyuranger.ZyusoukenItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.Tiers;
import com.liasdan.supersentaicraft.particle.ModParticles;
import com.liasdan.supersentaicraft.effect.EffectCore;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ZyurangerItems {

        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // Logo and Collectibles
        // 2. Collectibles
        // 2. Collectibles

        // 2. Collectibles

        // 2. Collectibles
        public static final DeferredItem<Item> ZYURANGER_MEDAL = ITEMS.register("zyuranger_medal",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZYURANGER));

        // 4. Changers & Form Items
        public static final DeferredItem<Item> TYRANNO_MEDAL = ITEMS.register("tyranno_medal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "tyranno_ranger",
                                        "zyuranger_red_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false))
                                        .ChangeBeltModel("zyuranger_belt_weapon.geo.json")
                                        .AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> MAMMOTH_MEDAL = ITEMS.register("mammoth_medal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "mammoth_ranger",
                                        "zyuranger_black_belt",
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 5, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2, true, false))
                                        .ChangeBeltModel("zyuranger_belt_weapon.geo.json")
                                        .AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> TRICERA_MEDAL = ITEMS.register("tricera_medal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "tricera_ranger",
                                        "zyuranger_blue_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false))
                                        .ChangeBeltModel("zyuranger_belt_weapon.geo.json")
                                        .AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> TIGER_MEDAL = ITEMS.register("tiger_medal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "tiger_ranger",
                                        "zyuranger_yellow_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false))
                                        .ChangeBeltModel("zyuranger_belt_weapon.geo.json")
                                        .AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> PTERA_MEDAL = ITEMS.register("ptera_medal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "ptera_ranger",
                                        "zyuranger_pink_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.JUMP, 40, 4, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2, true, false))
                                        .ChangeBeltModel("zyuranger_belt_weapon.geo.json")
                                        .AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> DRAGON_MEDAL = ITEMS.register("dragon_medal",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "dragon_ranger",
                                        "zyuranger_green_belt",
                                        new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3, true, false),
                                        new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2, true, false))
                                        .ChangeSlot(2).addSwitchForm(OtherItems.BLANK_FORM.get())
                                        .AddCompatibilityList(new String[] { "tyranno_ranger" })
                                        .ChangeBeltModel("zyuranger_belt_weapon.geo.json")
                                        .AddToTabList(RangerTabs.ZYURANGER));

        // 3. Armors
        public static final DeferredItem<Item> ZYURANGER_HELMET = ITEMS.register("zyuranger_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZYURANGER).ChangeRepairItem(ZYURANGER_MEDAL.get()));
        public static final DeferredItem<Item> ZYURANGER_CHESTPLATE = ITEMS.register("zyuranger_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZYURANGER).ChangeRepairItem(ZYURANGER_MEDAL.get()));
        public static final DeferredItem<Item> ZYURANGER_LEGGINGS = ITEMS.register("zyuranger_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZYURANGER).ChangeRepairItem(ZYURANGER_MEDAL.get()));
        public static final DeferredItem<Item> TYRANNO_DINO_BUCKLER = ITEMS.register("tyranno_dino_buckler",
                        () -> new DinoBucklerItem(ArmorMaterials.DIAMOND, "tyranno_ranger", TYRANNO_MEDAL,
                                        ZYURANGER_HELMET, ZYURANGER_CHESTPLATE, ZYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZYURANGER).ChangeRepairItem(ZYURANGER_MEDAL.get()));
        public static final DeferredItem<Item> MAMMOTH_DINO_BUCKLER = ITEMS.register("mammoth_dino_buckler",
                        () -> new DinoBucklerItem(ArmorMaterials.DIAMOND, "mammoth_ranger", MAMMOTH_MEDAL,
                                        ZYURANGER_HELMET, ZYURANGER_CHESTPLATE, ZYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZYURANGER).ChangeRepairItem(ZYURANGER_MEDAL.get()));
        public static final DeferredItem<Item> TRICERA_DINO_BUCKLER = ITEMS.register("tricera_dino_buckler",
                        () -> new DinoBucklerItem(ArmorMaterials.DIAMOND, "tricera_ranger", TRICERA_MEDAL,
                                        ZYURANGER_HELMET, ZYURANGER_CHESTPLATE, ZYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZYURANGER).ChangeRepairItem(ZYURANGER_MEDAL.get()));
        public static final DeferredItem<Item> TIGER_DINO_BUCKLER = ITEMS.register("tiger_dino_buckler",
                        () -> new DinoBucklerItem(ArmorMaterials.DIAMOND, "tiger_ranger", TIGER_MEDAL, ZYURANGER_HELMET,
                                        ZYURANGER_CHESTPLATE, ZYURANGER_LEGGINGS, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZYURANGER).ChangeRepairItem(ZYURANGER_MEDAL.get()));
        public static final DeferredItem<Item> PTERA_DINO_BUCKLER = ITEMS.register("ptera_dino_buckler",
                        () -> new DinoBucklerItem(ArmorMaterials.DIAMOND, "ptera_ranger", PTERA_MEDAL, ZYURANGER_HELMET,
                                        ZYURANGER_CHESTPLATE, ZYURANGER_LEGGINGS, new Item.Properties())
                                        .AddToTabList(RangerTabs.ZYURANGER).ChangeRepairItem(ZYURANGER_MEDAL.get()));
        public static final DeferredItem<Item> DRAGON_DINO_BUCKLER = ITEMS.register("dragon_dino_buckler",
                        () -> new DinoBucklerItem(ArmorMaterials.DIAMOND, "dragon_ranger", DRAGON_MEDAL,
                                        ZYURANGER_HELMET, ZYURANGER_CHESTPLATE, ZYURANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.ZYURANGER).ChangeRepairItem(ZYURANGER_MEDAL.get()));

        // 5. Weapons & Mechas
        public static final DeferredItem<Item> RANGER_SWORD = ITEMS.register("ranger_sword",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> THUNDER_SLINGER = ITEMS.register("thunder_slinger",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> RANGER_SLINGER = ITEMS.register("ranger_slinger",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> RYUGEKIKEN = ITEMS.register("ryugekiken",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> ZYUSOUKEN = ITEMS.register("zyusouken",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> MOTH_BREAKER = ITEMS.register("moth_breaker",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> TRICE_LANCE_TRIDENT = ITEMS.register("trice_lance_trident",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> TRICE_LANCE = ITEMS.register("trice_lance",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> SABER_DAGGER = ITEMS.register("saber_dagger",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> PTERA_ARROW = ITEMS.register("ptera_arrow",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));
        public static final DeferredItem<Item> HELLFRIEDE = ITEMS.register("hellfriede",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties())
                                        .ChangeRepairItem(ZYURANGER_MEDAL.get()).AddToTabList(RangerTabs.ZYURANGER));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
