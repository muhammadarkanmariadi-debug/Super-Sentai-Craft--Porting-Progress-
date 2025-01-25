package com.liasdan.supersentaicraft.items;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.maskman.MaskingBraceItem;
import com.liasdan.supersentaicraft.items.others.*;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterials;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class OtherItems {

	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperSentaiCraftCore.MODID);

	public static String[] SentaiRobo = new String[] {"sun_vulcan_robo","gao_king","gao_muscle","gao_hunter","gao_hunter_blue_moon",
			"gao_icarus","gao_god","gao_knight"};

	public static final DeferredItem<Item> MECHA_GEAR = ITEMS.register("mecha_gear",
			() -> new BaseItem(new Item.Properties()).AddToTabList(RangerTabs.MISC));

	public static final DeferredItem<Item> BLANK_FORM = ITEMS.register("blank_form",
			() -> new RangerFormChangeItem(new Item.Properties(),0,"","",""));

	public static final DeferredItem<Item> SUPER_SENTAI_LOGO = ITEMS.register("super_sentai_logo",
			() -> new RangerFormChangeItem(new Item.Properties(), 0, "", "", "",
					new MobEffectInstance(EffectCore.BIG, 40, 2,true,false))
					.ChangeSlot(2).addSwitchForm(BLANK_FORM.get()).AddCompatibilityList(SentaiRobo).AddToTabList(RangerTabs.MISC));

	public static final DeferredItem<Item> SUPER_SENTAI_BOOK = ITEMS.register("super_sentai_book",
			() -> new SuperSentaiBookItem(new Item.Properties()).AddToTabList(RangerTabs.MISC));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}

}