package com.liasdan.supersentaicraft.items.boonboomger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.BoonboomgerItems;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;

public class BoonboomChangerItem extends RangerChangerItem{

	public BoonboomChangerItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item>torso, DeferredItem<Item> legs, Properties properties)
	{
		super(material, rider, baseFormItem, head, torso, legs, properties);
		Has_basic_belt_info=false;
	}

	@Override
	public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {

		Item formItem = this.get_Form_Item(stack, 1);

		if (formItem== BoonboomgerItems.CHAMPION_CHANGER.get()) {
			if (this == BoonboomgerItems.RED_BOONBOOM_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:champion_bun_red.form"));
			if (this == BoonboomgerItems.BLUE_BOONBOOM_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:champion_bun_blue.form"));
			if (this == BoonboomgerItems.PINK_BOONBOOM_CHANGER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:champion_bun_pink.form"));
		}
		else if (formItem== BoonboomgerItems.CHAMPION_CHANGER_2.get()) {
			if (this == BoonboomgerItems.BLACK_BOONBOOM_BOOSTER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:champion_bun_black.form"));
			if (this == BoonboomgerItems.ORANGE_BOONBOOM_BOOSTER.get()) tooltipComponents.add(Component.translatable("supersentaicraft:champion_bun_orange.form"));
		}
		else {
			tooltipComponents.add(Component.translatable(formItem.toString() + ".form"));
		}
		super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
	}
}