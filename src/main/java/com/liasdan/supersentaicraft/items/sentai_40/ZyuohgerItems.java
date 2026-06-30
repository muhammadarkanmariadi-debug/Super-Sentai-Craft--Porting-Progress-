package com.liasdan.supersentaicraft.items.sentai_40;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_40.zyuohger.ZyuohChangerItem;
import com.liasdan.supersentaicraft.items.sentai_40.zyuohger.ZyuohWhaleChangeGunItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import com.liasdan.supersentaicraft.effect.EffectCore;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ZyuohgerItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

        // 1. Logo
        // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    
    // Logo and Collectibles
    // 1. Logo
    // 1. Logo
    public static final DeferredItem<Item> ZYUOHGER_LOGO = ITEMS.register("zyuohger_logo",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> KING_S_CREDENTIAL = ITEMS.register("king_s_credential",
            () -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.ZYUOHGER));

    // 2. Collectibles
    public static final DeferredItem<Item> ZYUOHGER_BELT = ITEMS.register("zyuohger_belt",
            () -> new BaseItem(new Item.Properties()));
    public static final DeferredItem<Item> ZYUOH_EAGLE_WING = ITEMS.register("zyuoh_eagle_wing",
            () -> new BaseItem(new Item.Properties()));
    public static final DeferredItem<Item> ZYUOH_BIRD_WING = ITEMS.register("zyuoh_bird_wing",
            () -> new BaseItem(new Item.Properties()));
    public static final DeferredItem<Item> ZYUOH_CONDOR_WING = ITEMS.register("zyuoh_condor_wing",
            () -> new BaseItem(new Item.Properties()));
    public static final DeferredItem<Item> ZENKAI_ZYUOH_WINGS = ITEMS.register("zenkai_zyuoh_wings",
            () -> new BaseItem(new Item.Properties()));

    // 3. Armors
    public static final DeferredItem<Item> ZYUOHGER_HELMET = ITEMS.register("zyuohger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties())
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> ZYUOHGER_CHESTPLATE = ITEMS.register("zyuohger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties())
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> ZYUOHGER_LEGGINGS = ITEMS.register("zyuohger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties())
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));

    // 4. Changers & Form Items
    public static final DeferredItem<Item> EAGLE_CUBE = ITEMS.register("eagle_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_eagle", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                    new MobEffectInstance(EffectCore.GLIDE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false))
                    .addShiftFormDeferred(ZyuohgerItems.EAGLE_YASEI_DAI_KAIHOU_CUBE).ChangeRangerName("zyuoh_eagle")
                    .ifFlyingModelResource("zyuoh_eagle_wing.geo.json")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> SHARK_CUBE = ITEMS.register("shark_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_shark", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 20, 2, true, false))
                    .addShiftFormDeferred(ZyuohgerItems.SHARK_YASEI_KAIHOU_CUBE).ChangeRangerName("zyuoh_shark")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> LION_CUBE = ITEMS.register("lion_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_lion", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false))
                    .addShiftFormDeferred(ZyuohgerItems.LION_YASEI_KAIHOU_CUBE).ChangeRangerName("zyuoh_lion")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> ELEPHANT_CUBE = ITEMS.register("elephant_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_elephant", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, true, false))
                    .addShiftFormDeferred(ZyuohgerItems.ELEPHANT_YASEI_KAIHOU_CUBE).ChangeRangerName("zyuoh_elephant")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> TIGER_CUBE = ITEMS.register("tiger_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_tiger", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 2, true, false))
                    .addShiftFormDeferred(ZyuohgerItems.TIGER_YASEI_KAIHOU_CUBE).ChangeRangerName("zyuoh_tiger")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> GORILLA_CUBE = ITEMS.register("gorilla_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_gorilla", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, true, false))
                    .AddCompatibilityList(new String[]{"zyuoh_eagle"}).ChangeRangerName("zyuoh_gorilla")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> CROCODILE_CUBE = ITEMS.register("crocodile_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_the_world_crocodile", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 20, 2, true, false))
                    .AddCompatibilityList(new String[]{"zyuoh_the_world"}).ChangeRangerName("zyuoh_the_world_crocodile")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> WOLF_CUBE = ITEMS.register("wolf_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_the_world_wolf", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false))
                    .AddCompatibilityList(new String[]{"zyuoh_the_world"}).ChangeRangerName("zyuoh_the_world_wolf")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> RHINOS_CUBE = ITEMS.register("rhinos_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_the_world", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false))
                    .addShiftFormDeferred(ZyuohgerItems.THE_WORLD_YASEI_DAI_KAIHOU_CUBE).ChangeRangerName("zyuoh_the_world")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> WHALE_CUBE = ITEMS.register("whale_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_whale", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 3, true, false))
                    .AddCompatibilityList(new String[]{"zyuoh_eagle", "zyuoh_whale"}).ChangeRangerName("zyuoh_whale")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> CONDOR_CUBE = ITEMS.register("condor_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_condor", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 5, true, false),
                    new MobEffectInstance(EffectCore.GLIDE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 4, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 4, true, false))
                    .AddCompatibilityList(new String[]{"zyuoh_eagle", "zyuoh_bird"}).ChangeRangerName("zyuoh_condor")
                    .ifFlyingModelResource("zyuoh_condor_wing.geo.json")
                    .AddToTabList(RangerTabs.ZYUOHGER));
    public static final DeferredItem<Item> BUD_KING_S_CREDENTIAL = ITEMS.register("bud_king_s_credential",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_bird", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 2, true, false),
                    new MobEffectInstance(EffectCore.GLIDE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false))
                    .AddCompatibilityList(new String[]{"zyuoh_eagle", "zyuoh_condor"}).ChangeRangerName("zyuoh_bird")
                    .ifFlyingModelResource("zyuoh_bird_wing.geo.json")
                    .AddToTabList(RangerTabs.ZYUOHGER));

    // Yasei Kaihou Cubes
    public static final DeferredItem<Item> SHARK_YASEI_KAIHOU_CUBE = ITEMS.register("shark_yasei_kaihou_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_shark_yasei_kaihou", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DOLPHINS_GRACE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 4, true, false))
                    .AddCompatibilityList(new String[]{"zyuoh_shark"}).ChangeRangerName("zyuoh_shark"));
    public static final DeferredItem<Item> LION_YASEI_KAIHOU_CUBE = ITEMS.register("lion_yasei_kaihou_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_lion_yasei_kaihou", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 4, true, false))
                    .AddCompatibilityList(new String[]{"zyuoh_lion"}).ChangeRangerName("zyuoh_lion"));
    public static final DeferredItem<Item> ELEPHANT_YASEI_KAIHOU_CUBE = ITEMS.register("elephant_yasei_kaihou_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_elephant_yasei_kaihou", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 20, 2, true, false))
                    .AddCompatibilityList(new String[]{"zyuoh_elephant"}).ChangeRangerName("zyuoh_elephant"));
    public static final DeferredItem<Item> TIGER_YASEI_KAIHOU_CUBE = ITEMS.register("tiger_yasei_kaihou_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_tiger_yasei_kaihou", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 3, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.JUMP, 20, 4, true, false))
                    .AddCompatibilityList(new String[]{"zyuoh_tiger"}).ChangeRangerName("zyuoh_tiger"));
    public static final DeferredItem<Item> EAGLE_YASEI_DAI_KAIHOU_CUBE = ITEMS.register("eagle_yasei_dai_kaihou_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_eagle_yasei_dai_kaihou", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 2, true, false),
                    new MobEffectInstance(EffectCore.GLIDE, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 5, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 6, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 2, true, false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 20, 5, true, false))
                    .addNeedItemDeferred(ZyuohgerItems.WHALE_CHANGE_GUN).addNeedItemDeferred(GORILLA_CUBE)
                    .AddCompatibilityList(new String[]{"zyuoh_eagle"}).ChangeRangerName("zyuoh_eagle_yasei_dai_kaihou_base")
                    .ifFlyingModelResource("zyuoh_eagle_wing.geo.json"));
    public static final DeferredItem<Item> THE_WORLD_YASEI_DAI_KAIHOU_CUBE = ITEMS.register("the_world_yasei_dai_kaihou_cube",
            () -> new RangerFormChangeItem(new Item.Properties(), 0, "", "zyuoh_the_world_yasei_dai_kaihou", "zyuohger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 20, 5, true, false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 250, 2, true, false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 20, 4, true, false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 20, 4, true, false))
                    .addNeedItemDeferred(CROCODILE_CUBE).addNeedItemDeferred(WOLF_CUBE)
                    .AddCompatibilityList(new String[]{"zyuoh_the_world"}).ChangeRangerName("zyuoh_the_world"));

    // Changers
    public static final DeferredItem<Item> WHALE_CHANGE_GUN = ITEMS.register("whale_change_gun",
            () -> new ZyuohWhaleChangeGunItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(ZYUOHGER_LOGO.get()));
    public static final DeferredItem<Item> EAGLE_ZYUOH_CHANGER = ITEMS.register("eagle_zyuoh_changer",
            () -> new ZyuohChangerItem(ArmorMaterials.DIAMOND, "zyuoh_eagle", EAGLE_CUBE,
                    ZYUOHGER_HELMET, ZYUOHGER_CHESTPLATE, ZYUOHGER_LEGGINGS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(GORILLA_CUBE, WHALE_CUBE, CONDOR_CUBE)
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> SHARK_ZYUOH_CHANGER = ITEMS.register("shark_zyuoh_changer",
            () -> new ZyuohChangerItem(ArmorMaterials.DIAMOND, "zyuoh_shark", SHARK_CUBE,
                    ZYUOHGER_HELMET, ZYUOHGER_CHESTPLATE, ZYUOHGER_LEGGINGS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> LION_ZYUOH_CHANGER = ITEMS.register("lion_zyuoh_changer",
            () -> new ZyuohChangerItem(ArmorMaterials.DIAMOND, "zyuoh_lion", LION_CUBE,
                    ZYUOHGER_HELMET, ZYUOHGER_CHESTPLATE, ZYUOHGER_LEGGINGS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> ELEPHANT_ZYUOH_CHANGER = ITEMS.register("elephant_zyuoh_changer",
            () -> new ZyuohChangerItem(ArmorMaterials.DIAMOND, "zyuoh_elephant", ELEPHANT_CUBE,
                    ZYUOHGER_HELMET, ZYUOHGER_CHESTPLATE, ZYUOHGER_LEGGINGS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> TIGER_ZYUOH_CHANGER = ITEMS.register("tiger_zyuoh_changer",
            () -> new ZyuohChangerItem(ArmorMaterials.DIAMOND, "zyuoh_tiger", TIGER_CUBE,
                    ZYUOHGER_HELMET, ZYUOHGER_CHESTPLATE, ZYUOHGER_LEGGINGS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> CONDOR_ZYUOH_CHANGER = ITEMS.register("condor_zyuoh_changer",
            () -> new ZyuohChangerItem(ArmorMaterials.DIAMOND, "zyuoh_condor", CONDOR_CUBE,
                    ZYUOHGER_HELMET, ZYUOHGER_CHESTPLATE, ZYUOHGER_LEGGINGS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> ZYUOH_CHANGER_FINAL = ITEMS.register("zyuoh_changer_final",
            () -> new ZyuohChangerItem(ArmorMaterials.DIAMOND, "zyuoh_bird", BUD_KING_S_CREDENTIAL,
                    ZYUOHGER_HELMET, ZYUOHGER_CHESTPLATE, ZYUOHGER_LEGGINGS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM)
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> THE_WORLD_ZYUOH_CHANGER = ITEMS.register("zyuoh_the_light",
            () -> new ZyuohChangerItem(ArmorMaterials.DIAMOND, "zyuoh_the_world", RHINOS_CUBE,
                    ZYUOHGER_HELMET, ZYUOHGER_CHESTPLATE, ZYUOHGER_LEGGINGS, new Item.Properties())
                    .Add_Extra_Base_Form_Items(CROCODILE_CUBE, WOLF_CUBE)
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));

    // 5. Weapons & Mechas
    public static final DeferredItem<Item> EAG_RISER = ITEMS.register("eag_riser",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> CONDOR_EAG_RISER = ITEMS.register("condor_eag_riser",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                    .AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));

    public static final DeferredItem<Item> ZYUOH_BUSTER_BLASTER = ITEMS.register("zyuoh_buster_blaster",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> ZYUOH_BUSTER = ITEMS.register("zyuoh_buster",
            () -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties().craftRemainder(ZYUOH_BUSTER_BLASTER.get()))
                    .IsDualWeapon().AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));

    public static final DeferredItem<Item> ZYUOH_THE_GUN = ITEMS.register("zyuoh_the_gun",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties())
                    .ChangeRepairItem(KING_S_CREDENTIAL.get()));
    public static final DeferredItem<Item> ZYUOH_THE_ROD = ITEMS.register("zyuoh_the_rod",
            () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties().craftRemainder(ZYUOH_THE_GUN.get()))
                    .IsDualWeapon().AddToTabList(RangerTabs.ZYUOHGER).ChangeRepairItem(KING_S_CREDENTIAL.get()));

public static void register(net.neoforged.bus.api.IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
