package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.OtherItems;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TimerangerItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // 1. Logo
        public static final DeferredItem<Item> TIMERANGER_LOGO = ITEMS.register("timeranger_logo",
                        () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.TIMERANGER));

        // 2. Armor
        public static final DeferredItem<Item> TIMERANGER_HELMET = ITEMS.register("timeranger_head",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                                        .AddToTabList(RangerTabs.TIMERANGER).ChangeRepairItem(TIMERANGER_LOGO.get()));
        public static final DeferredItem<Item> TIMERANGER_CHESTPLATE = ITEMS.register("timeranger_torso",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.TIMERANGER).ChangeRepairItem(TIMERANGER_LOGO.get()));
        public static final DeferredItem<Item> TIMERANGER_LEGGINGS = ITEMS.register("timeranger_legs",
                        () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.TIMERANGER).ChangeRepairItem(TIMERANGER_LOGO.get()));

        // 3. Badge (Form Changer)
        public static final DeferredItem<Item> TIMERANGER_BADGE_RED = ITEMS.register("timeranger_badge_red",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "time_red", "timeranger_belt",
                                        new MobEffectInstance(EffectCore.SLASH, 40, 1, true, false),
                                        new MobEffectInstance(EffectCore.PUNCH, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0, true, false))
                                        .ChangeBeltModel("rangerbelt2.geo.json")
                                        .AddToTabList(RangerTabs.TIMERANGER));

        public static final DeferredItem<Item> TIMERANGER_BADGE_FIRE = ITEMS.register("timeranger_badge_fire",
                        () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "time_fire",
                                        "timeranger_belt",
                                        new MobEffectInstance(EffectCore.SHOTBOOST, 40, 1, true, false),
                                        new MobEffectInstance(EffectCore.PUNCH, 40, 2, true, false),
                                        new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 0, true, false))
                                        .ChangeBeltModel("rangerbelt2.geo.json")
                                        .AddToTabList(RangerTabs.TIMERANGER));

        // 4. Changer
        public static final DeferredItem<Item> CHRONO_CHANGER = ITEMS.register("chrono_changer",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "time_red", TIMERANGER_BADGE_RED,
                                        TIMERANGER_HELMET, TIMERANGER_CHESTPLATE, TIMERANGER_LEGGINGS,
                                        new Item.Properties())
                                        .AddToTabList(RangerTabs.TIMERANGER).ChangeRepairItem(TIMERANGER_LOGO.get()));

        public static final DeferredItem<Item> V_COMMANDER = ITEMS.register("v_commander",
                        () -> new RangerChangerItem(ArmorMaterials.DIAMOND, "time_fire",
                                        TIMERANGER_BADGE_FIRE, TIMERANGER_HELMET, TIMERANGER_CHESTPLATE,
                                        TIMERANGER_LEGGINGS,
                                        new Item.Properties()).AddToTabList(RangerTabs.TIMERANGER)
                                        .ChangeRepairItem(TIMERANGER_LOGO.get()));

        // 5. Weapons
        public static final DeferredItem<SwordItem> DOUBLE_VECTOR_1 = ITEMS.register("double_vector_1",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.TIMERANGER).ChangeRepairItem(TIMERANGER_LOGO.get()));

        public static final DeferredItem<SwordItem> DOUBLE_VECTOR_2 = ITEMS.register("double_vector_2",
                        () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.0F, new Item.Properties())
                                        .AddToTabList(RangerTabs.TIMERANGER).ChangeRepairItem(TIMERANGER_LOGO.get()));

        public static final DeferredItem<BaseBlasterItem> DV_DEFENDER = ITEMS.register("dv_defender",
                        () -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                                        .AddToTabList(RangerTabs.TIMERANGER).ChangeRepairItem(TIMERANGER_LOGO.get()));

        public static void register(net.neoforged.bus.api.IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
