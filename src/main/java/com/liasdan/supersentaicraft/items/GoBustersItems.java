package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.blocks.machine.BoonboomCarProgrammer;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.boonboomger.BoonboomChangerItem;
import com.liasdan.supersentaicraft.items.boonboomger.BoonboomControllerItem;
import com.liasdan.supersentaicraft.items.boonboomger.ZoonzoomShokaBlasterItem;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GoBustersItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> GO_BUSTERS_LOGO = ITEMS.register("go_busters_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> ENETRON = ITEMS.register("enetron",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS));
	public static final DeferredItem<Item> BLANK_ANIMAL_DISK = ITEMS.register("blank_animal_disk",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> RED_ENETRON = ITEMS.register("red_enetron",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","red_buster","go_busters_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false))
			.ChangeBeltModel("geo/rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> BLUE_ENETRON = ITEMS.register("blue_enetron",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","blue_buster","go_busters_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false))
			.ChangeBeltModel("geo/rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> YELLOW_ENETRON = ITEMS.register("yellow_enetron",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","yellow_buster","go_busters_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 2,true,false))
			.ChangeBeltModel("geo/rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> GOLD_ENETRON = ITEMS.register("gold_enetron",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","beet_buster","beet_buster_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 3,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> SILVER_ENETRON = ITEMS.register("silver_enetron",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","stag_buster","beet_buster_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> VAGLASS_LOGO = ITEMS.register("vaglass_logo",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","dark_buster","dark_buster_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 4,true,false),
					new MobEffectInstance(MobEffects.DAMAGE_BOOST, 40, 4,true,false),
					new MobEffectInstance(MobEffects.JUMP, 40, 4,true,false))
			.ChangeBeltModel("geo/rangerbelt1.geo.json").AddToTabList(RangerTabs.GO_BUSTERS));

	public static final DeferredItem<Item> GO_BUSTERS_HELMET = ITEMS.register("go_busters_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
    public static final DeferredItem<Item> GO_BUSTERS_CHESTPLATE = ITEMS.register("go_busters_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
    public static final DeferredItem<Item> GO_BUSTERS_LEGGINGS = ITEMS.register("go_busters_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

   	public static final DeferredItem<Item> RED_MORPHIN_BRACE = ITEMS.register("red_morphin_brace",
   		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"red_buster",RED_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> BLUE_MORPHIN_BRACE = ITEMS.register("blue_morphin_brace",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"blue_buster",BLUE_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> YELLOW_MORPHIN_BRACE = ITEMS.register("yellow_morphin_brace",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"yellow_buster",YELLOW_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> BEET_MORPHIN_BLASTER = ITEMS.register("beet_morphin_blaster",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"beet_buster",GOLD_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> STAG_MORPHIN_BLASTER = ITEMS.register("stag_morphin_blaster",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"stag_buster",SILVER_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<Item> ENTER_MORPHIN_BLASTER = ITEMS.register("enter_morphin_blaster",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"beet_buster_enter",GOLD_ENETRON,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<Item> DARK_MORPHIN_BRACE = ITEMS.register("dark_morphin_brace",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"dark_buster",VAGLASS_LOGO,GO_BUSTERS_HELMET,GO_BUSTERS_CHESTPLATE,GO_BUSTERS_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<SwordItem> SOUGAN_BLADE = ITEMS.register("sougan_blade",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<BaseBlasterItem> ICHIGAN_BUSTER = ITEMS.register("ichigan_buster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<BaseBlasterItem> ICHIGAN_BUSTER_SPECIAL = ITEMS.register("ichigan_buster_special",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsSuperGun().AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<BaseBlasterItem> MORPHIN_BLASTER = ITEMS.register("morphin_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<SwordItem> DRI_BLADE = ITEMS.register("dri_blade",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<BaseBlasterItem> LIO_BLASTER = ITEMS.register("lio_blaster",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).IsSuperGun().AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));
	public static final DeferredItem<BaseBlasterItem> LIO_BLASTER_FINAL = ITEMS.register("lio_blaster_final",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 3, -2.4F, new Item.Properties()).IsHyperGun().AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static final DeferredItem<SwordItem> DARK_BUSTER_SWORD = ITEMS.register("dark_buster_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.GO_BUSTERS).ChangeRepairItem(ENETRON.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}