package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.maskman.MaskingBraceItem;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.BaseItem;
import com.liasdan.supersentaicraft.items.others.BasePickaxeItem;
import com.liasdan.supersentaicraft.items.others.BaseShieldItem;
import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class MobsItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);
    
	public static final DeferredItem<SwordItem> ZOLDERS_SWORD = ITEMS.register("zolders_sword",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static final DeferredItem<SwordItem> CRIMERS_SWORD = ITEMS.register("crimers_sword",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static final DeferredItem<SwordItem> MACHINEMEN_KNIFE = ITEMS.register("machinemen_knife",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static final DeferredItem<SwordItem> UNGLER_LANCE = ITEMS.register("ungler_lance",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static final DeferredItem<SwordItem> WUMPERS_SWORD = ITEMS.register("wumpers_sword",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static final DeferredItem<SwordItem> YARTOTS_SABER = ITEMS.register("yartots_saber",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static final DeferredItem<SwordItem> ORGETTES_CLUB = ITEMS.register("orgettes_club",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static final DeferredItem<SwordItem> NANASHI_DAO = ITEMS.register("nanashi_dao",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static final DeferredItem<SwordItem> PORDERMAN_SWORD = ITEMS.register("porderman_sword",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static final DeferredItem<SwordItem> DRUNN_SPEAR = ITEMS.register("drunn_spear",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));
    public static final DeferredItem<Item> DRUNN_SHIELD = ITEMS.register("drunn_shield",
			() -> new BaseShieldItem(new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static final DeferredItem<SwordItem> MUFFLAMBO = ITEMS.register("mufflambo",
			() -> new BaseSwordItem(Tiers.IRON, 5, -2.4F, new Item.Properties()).AddToTabList(RangerTabs.MISC).ChangeRepairItem(Items.IRON_INGOT));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}