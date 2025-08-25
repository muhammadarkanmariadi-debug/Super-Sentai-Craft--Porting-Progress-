package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.maskman.MaskingBraceItem;
import com.liasdan.supersentaicraft.items.others.*;
import com.liasdan.supersentaicraft.items.turboranger.TurboBraceItem;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class TurborangerItems {

	public static String[] TURBORANGER = new String[] {"red_turbo","black_turbo","blue_turbo","yellow_turbo","pink_turbo"};

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> TURBORANGER_LOGO = ITEMS.register("turboranger_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","red_turbo","turboranger_belt",
					new MobEffectInstance(MobEffects.WEAKNESS, 40, 1,true,false),
					new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 40, 1,true,false)).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> RED_TURBO_LOGO = ITEMS.register("red_turbo_logo",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","red_turbo","red_turbo_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> BLACK_TURBO_LOGO = ITEMS.register("black_turbo_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","black_turbo","black_turbo_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> BLUE_TURBO_LOGO = ITEMS.register("blue_turbo_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","blue_turbo","blue_turbo_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> YELLOW_TURBO_LOGO = ITEMS.register("yellow_turbo_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","yellow_turbo","yellow_turbo_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> PINK_TURBO_LOGO = ITEMS.register("pink_turbo_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","pink_turbo","pink_turbo_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false)).ChangeBeltModel("geo/rangerbeltextra.geo.json").AddToTabList(RangerTabs.TURBORANGER));

	public static final DeferredItem<Item> TURBORANGER_HELMET = ITEMS.register("turboranger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
    public static final DeferredItem<Item> TURBORANGER_CHESTPLATE = ITEMS.register("turboranger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
    public static final DeferredItem<Item> TURBORANGER_LEGGINGS = ITEMS.register("turboranger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
    
    public static final DeferredItem<Item> RED_TURBO_BRACE = ITEMS.register("red_turbo_brace",
    		() -> new TurboBraceItem(ArmorMaterials.DIAMOND,"red_turbo",RED_TURBO_LOGO,TURBORANGER_HELMET,TURBORANGER_CHESTPLATE,TURBORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<Item> BLACK_TURBO_BRACE = ITEMS.register("black_turbo_brace",
			() -> new TurboBraceItem(ArmorMaterials.DIAMOND,"black_turbo",BLACK_TURBO_LOGO,TURBORANGER_HELMET,TURBORANGER_CHESTPLATE,TURBORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<Item> BLUE_TURBO_BRACE = ITEMS.register("blue_turbo_brace",
			() -> new TurboBraceItem(ArmorMaterials.DIAMOND,"blue_turbo",BLUE_TURBO_LOGO,TURBORANGER_HELMET,TURBORANGER_CHESTPLATE,TURBORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<Item> YELLOW_TURBO_BRACE = ITEMS.register("yellow_turbo_brace",
			() -> new TurboBraceItem(ArmorMaterials.DIAMOND,"yellow_turbo",YELLOW_TURBO_LOGO,TURBORANGER_HELMET,TURBORANGER_CHESTPLATE,TURBORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
	public static final DeferredItem<Item> PINK_TURBO_BRACE = ITEMS.register("pink_turbo_brace",
			() -> new TurboBraceItem(ArmorMaterials.DIAMOND,"pink_turbo",PINK_TURBO_LOGO,TURBORANGER_HELMET,TURBORANGER_CHESTPLATE,TURBORANGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));

//    public static final DeferredItem<BaseBlasterItem> LASER_MAGNUM = ITEMS.register("laser_magnum",
//			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
//    public static final DeferredItem<SwordItem> LASER_MAGNUM_SWORD = ITEMS.register("laser_magnum_sword",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
//
//    public static final DeferredItem<SwordItem> MASKY_BLADE = ITEMS.register("masky_blade",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
//    public static final DeferredItem<SwordItem> MASKY_ROD = ITEMS.register("masky_rod",
//			() -> new BaseDualSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsDualWeapon().AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
//    public static final DeferredItem<SwordItem> MASKY_TONFA = ITEMS.register("masky_tonfa",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
//    public static final DeferredItem<BaseThrowableItem> MASKY_ROTOR = ITEMS.register("masky_rotor",
//			() -> new BaseThrowableItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).IsShuriken().AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));
//    public static final DeferredItem<SwordItem> MASKY_RIBBON = ITEMS.register("masky_ribbon",
//			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.TURBORANGER).ChangeRepairItem(TURBORANGER_LOGO.get()));


	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}