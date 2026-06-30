package com.liasdan.supersentaicraft.items.sentai_10;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BaseShieldItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.MechaArmorItem;
import com.liasdan.supersentaicraft.items.others.MechaGattaiItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_10.sun_vulcan.VulcanBraceItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class SunVulcanItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> SUN_VULCAN_LOGO = ITEMS.register("sun_vulcan_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN));

	public static final DeferredItem<Item> VUL_EAGLE_SYMBOL = ITEMS.register("vul_eagle_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","vul_eagle","vul_eagle_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.FLYING, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.SLASH, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.SUN_VULCAN));

	public static final DeferredItem<Item> VUL_SHARK_SYMBOL = ITEMS.register("vul_shark_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","vul_shark","vul_shark_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.PUNCH, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.SUN_VULCAN));

	public static final DeferredItem<Item> VUL_PANTHER_SYMBOL = ITEMS.register("vul_panther_medal",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","vul_panther","vul_panther_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(EffectCore.PUNCH, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.SUN_VULCAN));
	
	public static final DeferredItem<Item> SUN_VULCAN_HELMET = ITEMS.register("sun_vulcan_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    public static final DeferredItem<Item> SUN_VULCAN_CHESTPLATE = ITEMS.register("sun_vulcan_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    public static final DeferredItem<Item> SUN_VULCAN_LEGGINGS = ITEMS.register("sun_vulcan_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    
    public static final DeferredItem<Item> EAGLE_VULCAN_BRACE = ITEMS.register("eagle_vulcan_brace",
    		() -> new VulcanBraceItem(ArmorMaterials.DIAMOND,"vul_eagle",VUL_EAGLE_SYMBOL,SUN_VULCAN_HELMET,SUN_VULCAN_CHESTPLATE,SUN_VULCAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    public static final DeferredItem<Item> SHARK_VULCAN_BRACE = ITEMS.register("shark_vulcan_brace",
    		() -> new VulcanBraceItem(ArmorMaterials.DIAMOND,"vul_shark",VUL_SHARK_SYMBOL,SUN_VULCAN_HELMET,SUN_VULCAN_CHESTPLATE,SUN_VULCAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    public static final DeferredItem<Item> PANTHER_VULCAN_BRACE = ITEMS.register("panther_vulcan_brace",
    		() -> new VulcanBraceItem(ArmorMaterials.DIAMOND,"vul_panther",VUL_PANTHER_SYMBOL,SUN_VULCAN_HELMET,SUN_VULCAN_CHESTPLATE,SUN_VULCAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    
    public static final DeferredItem<SwordItem> VULCAN_STICK = ITEMS.register("vulcan_stick",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));
    public static final DeferredItem<SwordItem> VULCAN_STICK_EAGLE = ITEMS.register("vulcan_stick_eagle",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(SUN_VULCAN_LOGO.get()));

	public static final DeferredItem<Item> SUN_VULCAN_ROBO = ITEMS.register("sun_vulcan_robo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","sun_vulcan_robo", "blank",
					new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)));

	public static final DeferredItem<Item> SUN_VULCAN_ROBO_BOOTS = ITEMS.register("sun_vulcan_robo_boots",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.BOOTS, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<Item> SUN_VULCAN_ROBO_LEGGINGS = ITEMS.register("sun_vulcan_robo_legs",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<Item> SUN_VULCAN_ROBO_CHESTPLATE = ITEMS.register("sun_vulcan_robo_torso",
            () -> new MechaArmorItem(ArmorMaterials.NETHERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    
    public static final DeferredItem<Item> SUN_VULCAN_ROBO_HELMET = ITEMS.register("sun_vulcan_robo_head",
            () -> new MechaGattaiItem(ArmorMaterials.NETHERITE,"sun_vulcan_robo",SUN_VULCAN_ROBO,SUN_VULCAN_ROBO_CHESTPLATE,SUN_VULCAN_ROBO_LEGGINGS,SUN_VULCAN_ROBO_BOOTS, new Item.Properties())
					.Add_Extra_Base_Form_Items(OtherItems.BLANK_FORM).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    
    public static final DeferredItem<SwordItem> TAIYO_KEN = ITEMS.register("taiyo_ken",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<Item> VUL_SHIELD = ITEMS.register("vul_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));   
    public static final DeferredItem<SwordItem> VUL_TONFA = ITEMS.register("vul_tonfa",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));
    public static final DeferredItem<SwordItem> VUL_HAND = ITEMS.register("vul_hand",
			() -> new BaseSwordItem(Tiers.NETHERITE, 30, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.SUN_VULCAN).ChangeRepairItem(OtherItems.MECHA_GEAR.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}