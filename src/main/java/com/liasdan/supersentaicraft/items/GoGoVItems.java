package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.gogo_v.GoGoBraceItem;
import com.liasdan.supersentaicraft.items.gogo_v.ZeekCrystalItem;
import com.liasdan.supersentaicraft.items.others.*;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class GoGoVItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> GOGO_V_LOGO = ITEMS.register("gogo_v_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> GO_RED_BADGE = ITEMS.register("go_red_badge",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","go_red","go_red_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> GO_BLUE_BADGE = ITEMS.register("go_blue_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","go_blue","go_blue_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> GO_GREEN_BADGE = ITEMS.register("go_green_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","go_green","go_green_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> GO_YELLOW_BADGE = ITEMS.register("go_yellow_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","go_yellow","go_yellow_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> GO_PINK_BADGE = ITEMS.register("go_pink_badge",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","go_pink","go_pink_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> ZEEK_CRYSTAL_FRAGMENT = ITEMS.register("zeek_fragment",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","zeek","zeek_belt",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)).AddToTabList(RangerTabs.GOGO_V));

	public static final DeferredItem<Item> JEANNE_CRYSTAL_FRAGMENT = ITEMS.register("jeanne_fragment",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","zeek_jeanne","blank",
					new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 3,true,false),
					new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
					new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 0,true,false)));

	public static final DeferredItem<Item> GOGO_V_HELMET = ITEMS.register("gogo_v_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
    public static final DeferredItem<Item> GOGO_V_CHESTPLATE = ITEMS.register("gogo_v_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
    public static final DeferredItem<Item> GOGO_V_LEGGINGS = ITEMS.register("gogo_v_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
    
    public static final DeferredItem<Item> RED_GOGO_BRACE = ITEMS.register("red_gogo_brace",
    		() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_red",GO_RED_BADGE,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> BLUE_GOGO_BRACE = ITEMS.register("blue_gogo_brace",
			() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_blue",GO_BLUE_BADGE,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> GREEN_GOGO_BRACE = ITEMS.register("green_gogo_brace",
			() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_green",GO_GREEN_BADGE,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> YELLOW_GOGO_BRACE = ITEMS.register("yellow_gogo_brace",
			() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_yellow",GO_YELLOW_BADGE,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> PINK_GOGO_BRACE = ITEMS.register("pink_gogo_brace",
			() -> new GoGoBraceItem(ArmorMaterials.DIAMOND,"go_pink",GO_PINK_BADGE,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static final DeferredItem<Item> ZEEK_CRYSTAL = ITEMS.register("zeek_crystal",
			() -> new ZeekCrystalItem(ArmorMaterials.DIAMOND,"zeek",ZEEK_CRYSTAL_FRAGMENT,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));
	public static final DeferredItem<Item> JEANNE_CRYSTAL = ITEMS.register("jeanne_crystal",
			() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"zeek_jeanne",JEANNE_CRYSTAL_FRAGMENT,GOGO_V_HELMET,GOGO_V_CHESTPLATE,GOGO_V_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.GOGO_V).ChangeRepairItem(GOGO_V_LOGO.get()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}