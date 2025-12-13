package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.entity.MobsCore;
import com.liasdan.supersentaicraft.items.boukenger.AccellularItem;
import com.liasdan.supersentaicraft.items.boukenger.GoGoChangerItem;
import com.liasdan.supersentaicraft.items.boukenger.SeikenZubaanItem;
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

    public static final DeferredItem<Item> ZUBAAN_CRYSTAL = ITEMS.register("zubaan_crystal",
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
    public static final DeferredItem<Item> ZUBAAN = ITEMS.register("zubaan",
            () -> new RangerChangerItem(ArmorMaterials.DIAMOND,"zubaan",ZUBAAN_CRYSTAL,BOUKENGER_HELMET,BOUKENGER_CHESTPLATE,BOUKENGER_LEGGINGS,new Item.Properties())
                    .AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static final DeferredItem<BaseBlasterItem> SURVI_BUSTER = ITEMS.register("survi_blade",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static final DeferredItem<SwordItem> BOUKEN_BO = ITEMS.register("bouken_bo",
            () -> new BaseDualSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsDualWeapon().AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static final DeferredItem<SwordItem> RADIAL_HAMMER = ITEMS.register("radial_hammer",
            () -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static final DeferredItem<BaseBlasterItem> BLOW_KNUCKLE = ITEMS.register("blow_knuckle",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).setProjectile(BaseBlasterItem.BlasterProjectile.WIND_CHARGE).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static final DeferredItem<SwordItem> BUCKET_SCOOPER = ITEMS.register("bucket_scooper",
            () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));
    public static final DeferredItem<SwordItem> BUCKET_SCOOPER1 = ITEMS.register("bucket_scooper1",
            () -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static final DeferredItem<BaseBlasterItem> HYDRO_SHOOTER = ITEMS.register("hydro_shooter",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static final DeferredItem<BaseBlasterItem> SAGASNIPER = ITEMS.register("sagaspear",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsSwordGun().AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static final DeferredItem<BaseBlasterItem> DUAL_CRUSHER = ITEMS.register("dual_crusher_mixer",
            () -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).IsSuperGun().IsDualWeapon().AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static final DeferredItem<SwordItem> SEIKEN_ZUBAAN = ITEMS.register("seiken_zubaan",
            () -> new SeikenZubaanItem(Tiers.DIAMOND, 12, -2.4F, new Item.Properties(), MobsCore.ZUBAAN).AddToTabList(RangerTabs.BOUKENGER).ChangeRepairItem(BOUKENGER_LOGO.get()));

    public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}