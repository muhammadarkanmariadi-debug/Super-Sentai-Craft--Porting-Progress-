package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.goranger.GorangerBeltItem;
import com.liasdan.supersentaicraft.items.gozyuger.TegaSwordItem;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GozyugerItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> GOZYUGER_LOGO = ITEMS.register("gozyuger_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYUGER_RING = ITEMS.register("gozyuger_ring",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_WOLF_RING = ITEMS.register("gozyu_wolf_ring",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_wolf","gozyuger_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_LEON_RING = ITEMS.register("gozyu_leon_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_leon","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(EffectCore.SHOTBOOST, 40, 2,true,false)).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_TYRANNO_RING = ITEMS.register("gozyu_tyranno_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_tyranno","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 2,true,false)).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> GOZYU_EAGLE_RING = ITEMS.register("gozyu_eagle_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_eagle","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.NIGHT_VISION, 400, 0,true,false),
					new MobEffectInstance(EffectCore.FLYING, 40, 2,true,false)).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> JETMAN_RING = ITEMS.register("jetman_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_jetman","don_momotarou","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeModel("geo/rangerwing1.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> OHRANGER_RING = ITEMS.register("ohranger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_tyranno","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("oh_red").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> DONBROTHERS_RING_GOZYU = ITEMS.register("donbrothers_ring_gozyu",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"_gozyu","don_momotarou","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)));

	public static final DeferredItem<Item> DONBROTHERS_RING = ITEMS.register("donbrothers_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","don_momotarou","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.addSwitchForm(DONBROTHERS_RING_GOZYU.get()).AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> KING_OHGER_RING = ITEMS.register("king_ohger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","kuwagata_ohger","gozyuger_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeModel("geo/king_ohger.geo.json").AddToTabList(RangerTabs.GOZYUGER));

	public static final DeferredItem<Item> BOONBOOMGER_RING = ITEMS.register("boonboomger_ring",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","gozyu_leon","gozyuger_belt_boonboomger",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false))
			.ChangeRangerName("boon_red").ChangeBeltModel("geo/rangerbeltchanger.geo.json").AddToTabList(RangerTabs.GOZYUGER));
	
	public static final DeferredItem<Item> GOZYUGER_HELMET = ITEMS.register("gozyuger_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
    public static final DeferredItem<Item> GOZYUGER_CHESTPLATE = ITEMS.register("gozyuger_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
    public static final DeferredItem<Item> GOZYUGER_LEGGINGS = ITEMS.register("gozyuger_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
    
    public static final DeferredItem<Item> WOLF_TEGA_SWORD = ITEMS.register("wolf_tega_sword",
    		() -> new TegaSwordItem(ArmorMaterials.DIAMOND,"gozyu_wolf",GOZYU_WOLF_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<Item> LEON_TEGA_SWORD = ITEMS.register("leon_tega_sword",
			() -> new TegaSwordItem(ArmorMaterials.DIAMOND,"gozyu_leon",GOZYU_LEON_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<Item> TYRANNO_TEGA_SWORD = ITEMS.register("tyranno_tega_sword",
			() -> new TegaSwordItem(ArmorMaterials.DIAMOND,"gozyu_tyranno",GOZYU_TYRANNO_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<Item> EAGLE_TEGA_SWORD = ITEMS.register("eagle_tega_sword",
			() -> new TegaSwordItem(ArmorMaterials.DIAMOND,"gozyu_eagle",GOZYU_TYRANNO_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<Item> KUWAGATA_OHGER_TEGA_SWORD_SILVER = ITEMS.register("kuwagata_ohger_tega_sword_silver",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"kuwagata_ohger",KING_OHGER_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));
	public static final DeferredItem<Item> DON_MOMOTAROU_TEGA_SWORD_SILVER = ITEMS.register("don_momotarou_tega_sword_silver",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"don_momotarou",DONBROTHERS_RING,GOZYUGER_HELMET,GOZYUGER_CHESTPLATE,GOZYUGER_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> TEGA_SWORD = ITEMS.register("tega_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static final DeferredItem<SwordItem> TEGA_SWORD_SILVER = ITEMS.register("tega_sword_silver",
			() -> new BaseSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GOZYUGER).ChangeRepairItem(GOZYUGER_RING.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}