package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.boukenger.AccellularItem;
import com.liasdan.supersentaicraft.items.boukenger.GoGoChangerItem;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.shinkenger.SecretDiskItem;
import com.liasdan.supersentaicraft.items.shinkenger.ShodoPhoneItem;
import com.liasdan.supersentaicraft.items.shinkenger.SushiChangerItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BoukengerItems {

	public static String[] BOUKENGER= new String[] {"bouken_red","bouken_black","bouken_blue","bouken_yellow","bouken_pink","bouken_silver"};

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

	public static final DeferredItem<Item> BOUKENGER_LOGO = ITEMS.register("boukenger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BOUKENGER));

	public static final DeferredItem<Item> BOUKEN_RED_LOGO = ITEMS.register("bouken_red_logo",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","bouken_red","boukenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.BOUKENGER));

    public static final DeferredItem<Item> BOUKEN_BLACK_LOGO = ITEMS.register("bouken_black_logo",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","bouken_black","boukenger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false))
                    .alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.BOUKENGER));

    public static final DeferredItem<Item> BOUKEN_BLUE_LOGO = ITEMS.register("bouken_blue_logo",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","bouken_blue","boukenger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
                    new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false))
                    .alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.BOUKENGER));

    public static final DeferredItem<Item> BOUKEN_YELLOW_LOGO = ITEMS.register("bouken_yellow_logo",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","bouken_yellow","boukenger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
                    .alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.BOUKENGER));

    public static final DeferredItem<Item> BOUKEN_PINK_LOGO = ITEMS.register("bouken_pink_logo",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","bouken_pink","boukenger_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.WATER_BREATHING, 40, 2,true,false))
                    .alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.BOUKENGER));

    public static final DeferredItem<Item> BOUKEN_SILVER_LOGO = ITEMS.register("bouken_silver_logo",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","bouken_silver","bouken_silver_belt",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false))
                    .alsoChange2ndSlot(OtherItems.BLANK_FORM.get()).ChangeBeltModel("geo/rangerbeltextra1.geo.json").AddToTabList(RangerTabs.BOUKENGER));

    public static final DeferredItem<Item> ZUBAAN = ITEMS.register("zubaan",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","zubaan","blank",
                    new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
                    new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
                    new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
                    new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false)).AddToTabList(RangerTabs.BOUKENGER));

    public static final DeferredItem<Item> SCALE_OF_THE_SALAMANDER = ITEMS.register("scale_of_the_salamander",
    		() -> new BaseItem(new Item.Properties().rarity(Rarity.RARE)).AddToTabList(RangerTabs.BOUKENGER));

	public static final DeferredItem<Item> ACCEL_TECTOR = ITEMS.register("accel_tector",
            () -> new RangerFormChangeItem(new Item.Properties().rarity(Rarity.RARE),0,"bouken_accel_tector","","boukenger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false))
            .ChangeSlot(2).BackToBase().AddCompatibilityList(BOUKENGER).AddToTabList(RangerTabs.BOUKENGER));

	public static final DeferredItem<Item> BOUKENGER_HELMET = ITEMS.register("boukenger_head",
    		() -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));
    public static final DeferredItem<Item> BOUKENGER_CHESTPLATE = ITEMS.register("boukenger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));
    public static final DeferredItem<Item> BOUKENGER_LEGGINGS = ITEMS.register("boukenger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static final DeferredItem<Item> RED_ACCELLULAR = ITEMS.register("red_accellular",
    		() -> new AccellularItem(ArmorMaterials.DIAMOND,"bouken_red",BOUKEN_RED_LOGO,BOUKENGER_HELMET,BOUKENGER_CHESTPLATE,BOUKENGER_LEGGINGS,new Item.Properties())
    		.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));
    public static final DeferredItem<Item> BLACK_ACCELLULAR = ITEMS.register("black_accellular",
            () -> new AccellularItem(ArmorMaterials.DIAMOND,"bouken_black",BOUKEN_BLACK_LOGO,BOUKENGER_HELMET,BOUKENGER_CHESTPLATE,BOUKENGER_LEGGINGS,new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));
    public static final DeferredItem<Item> BLUE_ACCELLULAR = ITEMS.register("blue_accellular",
            () -> new AccellularItem(ArmorMaterials.DIAMOND,"bouken_blue",BOUKEN_BLUE_LOGO,BOUKENGER_HELMET,BOUKENGER_CHESTPLATE,BOUKENGER_LEGGINGS,new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_ACCELLULAR = ITEMS.register("yellow_accellular",
            () -> new AccellularItem(ArmorMaterials.DIAMOND,"bouken_yellow",BOUKEN_YELLOW_LOGO,BOUKENGER_HELMET,BOUKENGER_CHESTPLATE,BOUKENGER_LEGGINGS,new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));
    public static final DeferredItem<Item> PINK_ACCELLULAR = ITEMS.register("pink_accellular",
            () -> new AccellularItem(ArmorMaterials.DIAMOND,"bouken_pink",BOUKEN_PINK_LOGO,BOUKENGER_HELMET,BOUKENGER_CHESTPLATE,BOUKENGER_LEGGINGS,new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));
    public static final DeferredItem<Item> GOGO_CHANGER = ITEMS.register("gogo_changer",
            () -> new GoGoChangerItem(ArmorMaterials.DIAMOND,"bouken_silver",BOUKEN_SILVER_LOGO,BOUKENGER_HELMET,BOUKENGER_CHESTPLATE,BOUKENGER_LEGGINGS,new Item.Properties())
                    .Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));
    public static final DeferredItem<Item> ZUBAAN_CRYSTAL = ITEMS.register("zubaan_crystal",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND,"zubaan",ZUBAAN,BOUKENGER_HELMET,BOUKENGER_CHESTPLATE,BOUKENGER_LEGGINGS,new Item.Properties())
                    .AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

//    public static final DeferredItem<SwordItem> SHINKENMARU = ITEMS.register("shinkenmaru",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
//
//    public static final DeferredItem<SwordItem> REKKA_DAIZANTOU = ITEMS.register("rekka_daizantou",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
//    public static final DeferredItem<BaseBlasterItem> WATER_ARROW = ITEMS.register("water_arrow",
//			() -> new BaseBlasterItem(Tiers.DIAMOND, 2, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
//    public static final DeferredItem<SwordItem> HEAVEN_FAN = ITEMS.register("heaven_fan",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
//    public static final DeferredItem<SwordItem> WOOD_SPEAR = ITEMS.register("wood_spear",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
//    public static final DeferredItem<BaseThrowableItem> LAND_SLICER = ITEMS.register("land_slicer",
//			() -> new BaseThrowableItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
//    public static final DeferredItem<SwordItem> SAKANAMARU = ITEMS.register("sakanamaru",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties().rarity(Rarity.UNCOMMON)).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
//
//    public static final DeferredItem<SwordItem> SUPER_SHINKENMARU = ITEMS.register("super_shinkenmaru",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties().rarity(Rarity.RARE)).KeepDifItem(SHINKENMARU.get()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
//
//    public static final DeferredItem<SwordItem> KYORYUMARU = ITEMS.register("kyoryumaru",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 16, -2.4F, new Item.Properties().rarity(Rarity.EPIC)).KeepDifItem(SHINKENMARU.get()).AddToTabList(RangerTabs.SHINKENGER).ChangeRepairItem(KYOUTSU_DISK.get()));
//    public static final DeferredItem<SwordItem> KYORYUMARU_SAKANAMARU = ITEMS.register("kyoryumaru_sakanamaru",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 16, -2.4F, new Item.Properties().rarity(Rarity.EPIC)).KeepDifItem(SAKANAMARU.get()).ChangeRepairItem(KYOUTSU_DISK.get()));

    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}