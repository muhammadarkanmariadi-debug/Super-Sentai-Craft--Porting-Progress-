package com.liasdan.supersentaicraft.items.sentai_20;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.RangerTabs;
import com.liasdan.supersentaicraft.items.sentai_20.maskman.MaskingBraceItem;
import com.liasdan.supersentaicraft.items.others.*;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MaskmanItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<Item> MASKMAN_LOGO = ITEMS.register("maskman_logo",
    		() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MASKMAN));

	public static final DeferredItem<Item> RED_AURA_POWER = ITEMS.register("red_aura_power",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","red_mask","maskman_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.MASKMAN));

	public static final DeferredItem<Item> BLACK_AURA_POWER = ITEMS.register("black_aura_power",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","black_mask","maskman_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.MASKMAN));

	public static final DeferredItem<Item> BLUE_AURA_POWER = ITEMS.register("blue_aura_power",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","blue_mask","maskman_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.MASKMAN));

	public static final DeferredItem<Item> YELLOW_AURA_POWER = ITEMS.register("yellow_aura_power",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","yellow_mask","maskman_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.MASKMAN));

	public static final DeferredItem<Item> PINK_AURA_POWER = ITEMS.register("pink_aura_power",
            () -> new RangerFormChangeItem(new Item.Properties(),0,"","pink_mask","maskman_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false)).ChangeBeltModel("rangerbeltextra.geo.json").AddToTabList(RangerTabs.MASKMAN));
    
	public static final DeferredItem<Item> X1_AURA_POWER = ITEMS.register("x1_aura_power",
            () -> new RangerFormChangeItem(new Item.Properties().rarity(Rarity.UNCOMMON),0,"","x1_mask","x1_mask_belt",
            		new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.DIG_SPEED, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 40, 2,true,false),
            		new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 40, 2,true,false)).AddToTabList(RangerTabs.MASKMAN));
    
    public static final DeferredItem<Item> MASKMAN_HELMET = ITEMS.register("maskman_head",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.HELMET, new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<Item> MASKMAN_CHESTPLATE = ITEMS.register("maskman_torso",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.CHESTPLATE, new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<Item> MASKMAN_LEGGINGS = ITEMS.register("maskman_legs",
            () -> new RangerArmorItem(ArmorMaterials.DIAMOND, ArmorItem.Type.LEGGINGS, new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    
    public static final DeferredItem<Item> RED_MASKING_BRACE = ITEMS.register("red_masking_brace",
    		() -> new MaskingBraceItem(ArmorMaterials.DIAMOND,"red_mask",RED_AURA_POWER,MASKMAN_HELMET,MASKMAN_CHESTPLATE,MASKMAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<Item> BLACK_MASKING_BRACE = ITEMS.register("black_masking_brace",
    		() -> new MaskingBraceItem(ArmorMaterials.DIAMOND,"black_mask",BLACK_AURA_POWER,MASKMAN_HELMET,MASKMAN_CHESTPLATE,MASKMAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<Item> BLUE_MASKING_BRACE = ITEMS.register("blue_masking_brace",
    		() -> new MaskingBraceItem(ArmorMaterials.DIAMOND,"blue_mask",BLUE_AURA_POWER,MASKMAN_HELMET,MASKMAN_CHESTPLATE,MASKMAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<Item> YELLOW_MASKING_BRACE = ITEMS.register("yellow_masking_brace",
    		() -> new MaskingBraceItem(ArmorMaterials.DIAMOND,"yellow_mask",YELLOW_AURA_POWER,MASKMAN_HELMET,MASKMAN_CHESTPLATE,MASKMAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<Item> PINK_MASKING_BRACE = ITEMS.register("pink_masking_brace",
    		() -> new MaskingBraceItem(ArmorMaterials.DIAMOND,"pink_mask",PINK_AURA_POWER,MASKMAN_HELMET,MASKMAN_CHESTPLATE,MASKMAN_LEGGINGS,new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<Item> X1_MASKING_BRACE = ITEMS.register("x1_masking_brace",
    		() -> new RangerChangerItem(ArmorMaterials.DIAMOND,"x1_mask",X1_AURA_POWER,MASKMAN_HELMET,MASKMAN_CHESTPLATE,MASKMAN_LEGGINGS,new Item.Properties().rarity(Rarity.UNCOMMON)).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    
    public static final DeferredItem<BaseBlasterItem> LASER_MAGNUM = ITEMS.register("laser_magnum",
			() -> new BaseBlasterItem(Tiers.DIAMOND, 0, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<SwordItem> LASER_MAGNUM_SWORD = ITEMS.register("laser_magnum_sword",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    
    public static final DeferredItem<SwordItem> MASKY_BLADE = ITEMS.register("masky_blade",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<SwordItem> MASKY_ROD = ITEMS.register("masky_rod",
			() -> new BaseDualSwordItem(Tiers.DIAMOND, 4, -2.4F, new Item.Properties()).IsDualWeapon().AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<SwordItem> MASKY_TONFA = ITEMS.register("masky_tonfa",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<BaseSwordItem> MASKY_ROTOR = ITEMS.register("masky_rotor",
			() -> new BaseSwordItem(Tiers.DIAMOND, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));
    public static final DeferredItem<SwordItem> MASKY_RIBBON = ITEMS.register("masky_ribbon",
			() -> new BaseSwordItem(Tiers.DIAMOND, 6, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MASKMAN).ChangeRepairItem(MASKMAN_LOGO.get()));


	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}