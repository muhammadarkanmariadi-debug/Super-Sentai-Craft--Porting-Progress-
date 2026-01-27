package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import javax.swing.*;

import static com.liasdan.supersentaicraft.items.OtherItems.SUPER_SENTAI_LOGO;
import static com.liasdan.supersentaicraft.items.SunVulcanItems.SUN_VULCAN_LOGO;

public class GavanInfinityItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
//	public static final DeferredItem<Item> SUN_VULCAN_LOGO = ITEMS.register("sun_vulcan_logo",
//    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN));

	public static final DeferredItem<Item> GEKIDO_EMORGEAR = ITEMS.register("gekido_emorgear",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","gavan_infinity","blank",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).AddToTabList(RangerTabs.GAVAN_INFINITY));

	public static final DeferredItem<Item> HISOO_EMORGEAR = ITEMS.register("hisoo_emorgear",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gavan_bushido","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).AddToTabList(RangerTabs.GAVAN_INFINITY));

	public static final DeferredItem<Item> KANKI_EMORGEAR = ITEMS.register("kanki_emorgear",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gavan_luminous","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false)).AddToTabList(RangerTabs.GAVAN_INFINITY));

	public static final DeferredItem<Item> GAVAN_INFINITY_HELMET = ITEMS.register("gavan_infinity_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GAVAN_INFINITY).ChangeRepairItem(SUPER_SENTAI_LOGO.get()));
    public static final DeferredItem<Item> GAVAN_INFINITY_CHESTPLATE = ITEMS.register("gavan_infinity_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GAVAN_INFINITY).ChangeRepairItem(SUPER_SENTAI_LOGO.get()));
    public static final DeferredItem<Item> GAVAN_INFINITY_LEGGINGS = ITEMS.register("gavan_infinity_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GAVAN_INFINITY).ChangeRepairItem(SUPER_SENTAI_LOGO.get()));
    
    public static final DeferredItem<Item> INFINITY_GAVARION_TRIGGER = ITEMS.register("infinity_gavarion_trigger",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gavan_infinity",GEKIDO_EMORGEAR,GAVAN_INFINITY_HELMET,GAVAN_INFINITY_CHESTPLATE,GAVAN_INFINITY_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAVAN_INFINITY).ChangeRepairItem(SUPER_SENTAI_LOGO.get()));
	public static final DeferredItem<Item> BUSHIDO_GAVARION_TRIGGER = ITEMS.register("bushido_gavarion_trigger",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gavan_bushido",HISOO_EMORGEAR,GAVAN_INFINITY_HELMET,GAVAN_INFINITY_CHESTPLATE,GAVAN_INFINITY_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAVAN_INFINITY).ChangeRepairItem(SUPER_SENTAI_LOGO.get()));
	public static final DeferredItem<Item> LUMINOUS_GAVARION_TRIGGER = ITEMS.register("luminous_gavarion_trigger",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"gavan_luminous",KANKI_EMORGEAR,GAVAN_INFINITY_HELMET,GAVAN_INFINITY_CHESTPLATE,GAVAN_INFINITY_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GAVAN_INFINITY).ChangeRepairItem(SUPER_SENTAI_LOGO.get()));

	public static final DeferredItem<BaseBlasterItem> GAVARION_TRIGGER = ITEMS.register("gavarion_trigger",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties().rarity(Rarity.UNCOMMON)).AddToTabList(SuperSentaiCraftCore.FORM_WEAPON_ITEM).AddToTabList(RangerTabs.GAVAN_INFINITY).ChangeRepairItem(SUPER_SENTAI_LOGO.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}