package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import com.liasdan.supersentaicraft.items.sentai_20.liveman.TwinBraceItem;
public class LivemanItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);


    // Logo and Collectibles
        // 1. Logo
        // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    public static final DeferredItem<Item> LIVEMAN_LOGO = ITEMS.register("liveman_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LIVEMAN));

    // 2. Collectibles
    public static final DeferredItem<Item> LIVEMAN_CIRCUIT = ITEMS.register("liveman_circuit",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> RED_FALCON_LOGO = ITEMS.register("red_falcon_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> YELLOW_LION_LOGO = ITEMS.register("yellow_lion_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> BLUE_DOLPHIN_LOGO = ITEMS.register("blue_dolphin_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> BLACK_BISON_LOGO = ITEMS.register("black_bison_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> GREEN_SAI_LOGO = ITEMS.register("green_sai_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.LIVEMAN));

    // 3. Armors
    public static final DeferredItem<Item> LIVEMAN_HELMET = ITEMS.register("liveman_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.LIVEMAN).ChangeRepairItem(LIVEMAN_LOGO.get()));
    public static final DeferredItem<Item> LIVEMAN_CHESTPLATE = ITEMS.register("liveman_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.LIVEMAN).ChangeRepairItem(LIVEMAN_LOGO.get()));
    public static final DeferredItem<Item> LIVEMAN_LEGGINGS = ITEMS.register("liveman_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.LIVEMAN).ChangeRepairItem(LIVEMAN_LOGO.get()));

    // 4. Changers & Form Items
    public static final DeferredItem<Item> LIVE_ROBO = ITEMS.register("live_robo",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "live_robo", "blank",
                    new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0, true, false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0, true, false)));
    public static final DeferredItem<Item> YELLOW_TWIN_BRACE = ITEMS.register("yellow_twin_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_20.liveman.TwinBraceItem(ArmorMaterials.DIAMOND, "yellow_lion", OtherItems.BLANK_FORM, LIVEMAN_HELMET, LIVEMAN_CHESTPLATE, LIVEMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false)).Override_belt_text("yellow_lion_belt").AddToTabList(RangerTabs.LIVEMAN).ChangeRepairItem(LIVEMAN_LOGO.get()));
    public static final DeferredItem<Item> BLUE_TWIN_BRACE = ITEMS.register("blue_twin_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_20.liveman.TwinBraceItem(ArmorMaterials.DIAMOND, "blue_dolphin", OtherItems.BLANK_FORM, LIVEMAN_HELMET, LIVEMAN_CHESTPLATE, LIVEMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 40, 2, true, false)).Override_belt_text("blue_dolphin_belt").AddToTabList(RangerTabs.LIVEMAN).ChangeRepairItem(LIVEMAN_LOGO.get()));
    public static final DeferredItem<Item> BLACK_TWIN_BRACE = ITEMS.register("black_twin_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_20.liveman.TwinBraceItem(ArmorMaterials.DIAMOND, "black_bison", OtherItems.BLANK_FORM, LIVEMAN_HELMET, LIVEMAN_CHESTPLATE, LIVEMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2, true, false)).Override_belt_text("black_bison_belt").AddToTabList(RangerTabs.LIVEMAN).ChangeRepairItem(LIVEMAN_LOGO.get()));
    public static final DeferredItem<Item> GREEN_TWIN_BRACE = ITEMS.register("green_twin_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_20.liveman.TwinBraceItem(ArmorMaterials.DIAMOND, "green_sai", OtherItems.BLANK_FORM, LIVEMAN_HELMET, LIVEMAN_CHESTPLATE, LIVEMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false)).Override_belt_text("green_sai_belt").AddToTabList(RangerTabs.LIVEMAN).ChangeRepairItem(LIVEMAN_LOGO.get()));
    public static final DeferredItem<Item> RED_TWIN_BRACE = ITEMS.register("red_twin_brace",
            () -> new com.liasdan.supersentaicraft.items.sentai_20.liveman.TwinBraceItem(ArmorMaterials.DIAMOND, "red_falcon", OtherItems.BLANK_FORM, LIVEMAN_HELMET, LIVEMAN_CHESTPLATE, LIVEMAN_LEGGINGS, new Item.Properties(), () -> null,
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 40, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2, true, false)).Override_belt_text("red_falcon_belt").AddToTabList(RangerTabs.LIVEMAN).ChangeRepairItem(LIVEMAN_LOGO.get()));

    // 5. Weapons & Mechas
    public static final DeferredItem<Item> LIBRASTAR = ITEMS.register("librastar",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun().ChangeRepairItem(LIVEMAN_CIRCUIT.get()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> FALCON_SWORD = ITEMS.register("falcon_sword",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).ChangeRepairItem(LIVEMAN_CIRCUIT.get()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> FALCON_SABER = ITEMS.register("falcon_saber",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).ChangeRepairItem(LIVEMAN_CIRCUIT.get()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> LION_PUNCH = ITEMS.register("lion_punch",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).ChangeRepairItem(LIVEMAN_CIRCUIT.get()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> LION_BAZOOKA = ITEMS.register("lion_bazooka",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(LIVEMAN_CIRCUIT.get()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> DOLPHIN_ARROW = ITEMS.register("dolphin_arrow",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).ChangeRepairItem(LIVEMAN_CIRCUIT.get()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> BISON_ROD = ITEMS.register("bison_rod",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).ChangeRepairItem(LIVEMAN_CIRCUIT.get()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> SAI_CUTTER = ITEMS.register("sai_cutter",
            () -> new BaseSwordItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).ChangeRepairItem(LIVEMAN_CIRCUIT.get()).AddToTabList(RangerTabs.LIVEMAN));

    public static final DeferredItem<Item> LIVE_ROBO_BOOTS = ITEMS.register("live_robo_boots",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> LIVE_ROBO_LEGGINGS = ITEMS.register("live_robo_legs",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> LIVE_ROBO_CHESTPLATE = ITEMS.register("live_robo_torso",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.LIVEMAN));
    public static final DeferredItem<Item> LIVE_ROBO_HELMET = ITEMS.register("live_robo_head",
            () -> new MechaGattaiItem(ArmorMaterials.NETHERITE, "live_robo", LIVE_ROBO, LIVE_ROBO_CHESTPLATE, LIVE_ROBO_LEGGINGS, LIVE_ROBO_BOOTS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).ChangeRepairItem(OtherItems.MECHA_GEAR.get()).AddToTabList(RangerTabs.LIVEMAN));

public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
