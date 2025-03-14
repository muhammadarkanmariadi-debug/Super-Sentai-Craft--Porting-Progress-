package com.liasdan.supersentaicraft.items.boonboomger;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.BoonboomgerItems;
import com.liasdan.supersentaicraft.items.GorangerItems;
import com.liasdan.supersentaicraft.items.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.Unit;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.*;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.event.EventHooks;

import javax.annotation.Nullable;
import java.util.List;

public class ZoonzoomShokaBlasterItem extends BaseBlasterItem {

	public ZoonzoomShokaBlasterItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);
	}

	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		super.use(level,player,hand);

		ItemStack itemstack = player.getItemInHand(hand);
		ItemStack BELT = player.getItemBySlot(EquipmentSlot.FEET);

		if (BELT.getItem() instanceof RangerChangerItem belt) {

			if (this== BoonboomgerItems.ZOONZOOM_SHOKA_BLASTER.get())
			{
				if (player.isShiftKeyDown())
				{
					if (RangerChangerItem.get_Form_Item(BELT, 1).getFormName(false)=="_119"|
							(RangerChangerItem.get_Form_Item(BELT, 1).getFormName(false)=="_007")|
							(RangerChangerItem.get_Form_Item(BELT, 1).getFormName(false)=="_110")) ((RangerFormChangeItem)belt.Base_Form_Item).use(level,player,hand);
					else ((RangerFormChangeItem)BoonboomgerItems.BUN_RED_119.get()).use(level,player,hand);

				}
			}
		}
		return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
	}
}