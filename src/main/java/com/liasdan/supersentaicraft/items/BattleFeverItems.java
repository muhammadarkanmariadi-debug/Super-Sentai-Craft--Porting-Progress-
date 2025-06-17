package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.goranger.GorangerBeltItem;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class BattleFeverItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> BATTLE_FEVER_LOGO = ITEMS.register("battle_fever_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER));

	public static final DeferredItem<Item> JAPAN_BADGE = ITEMS.register("japan_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","battle_japan","battle_japan_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RangerTabs.BATTLE_FEVER));

	public static final DeferredItem<Item> COSSACK_BADGE = ITEMS.register("cossack_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","battle_cossack","battle_cossack_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RangerTabs.BATTLE_FEVER));

	public static final DeferredItem<Item> FRANCE_BADGE = ITEMS.register("france_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","battle_france","battle_france_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RangerTabs.BATTLE_FEVER));

	public static final DeferredItem<Item> KENYA_BADGE = ITEMS.register("kenya_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","battle_kenya","battle_kenya_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 3,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RangerTabs.BATTLE_FEVER));

	public static final DeferredItem<Item> AMERICA_BADGE = ITEMS.register("america_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","miss_america","miss_america_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false)).AddToTabList(RangerTabs.BATTLE_FEVER));
	
	public static final DeferredItem<Item> BATTLE_FEVER_HELMET = ITEMS.register("battle_fever_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> BATTLE_FEVER_CHESTPLATE = ITEMS.register("battle_fever_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> BATTLE_FEVER_LEGGINGS = ITEMS.register("battle_fever_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    
    public static final DeferredItem<Item> JAPAN_BATTLECEIVER = ITEMS.register("japan_battleceiver",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"battle_japan",JAPAN_BADGE,BATTLE_FEVER_HELMET,BATTLE_FEVER_CHESTPLATE,BATTLE_FEVER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> COSSACK_BATTLECEIVER = ITEMS.register("cossack_battleceiver",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"battle_cossack",COSSACK_BADGE,BATTLE_FEVER_HELMET,BATTLE_FEVER_CHESTPLATE,BATTLE_FEVER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> FRANCE_BATTLECEIVER = ITEMS.register("france_battleceiver",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"battle_france",FRANCE_BADGE,BATTLE_FEVER_HELMET,BATTLE_FEVER_CHESTPLATE,BATTLE_FEVER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> KENYA_BATTLECEIVER = ITEMS.register("kenya_battleceiver",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"battle_kenya",KENYA_BADGE,BATTLE_FEVER_HELMET,BATTLE_FEVER_CHESTPLATE,BATTLE_FEVER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));
    public static final DeferredItem<Item> AMERICA_BATTLECEIVER = ITEMS.register("america_battleceiver",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"miss_america",AMERICA_BADGE,BATTLE_FEVER_HELMET,BATTLE_FEVER_CHESTPLATE,BATTLE_FEVER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.BATTLE_FEVER).ChangeRepairItem(BATTLE_FEVER_LOGO.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}