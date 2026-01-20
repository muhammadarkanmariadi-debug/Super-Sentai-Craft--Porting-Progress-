package com.liasdan.supersentaicraft.items.go_busters;

import com.google.common.collect.ImmutableMultimap;
import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.effect.EffectCore;
import com.liasdan.supersentaicraft.items.GoBustersItems;
import com.liasdan.supersentaicraft.items.GorangerItems;
import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.core.BlockPos;
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
import net.minecraft.world.entity.projectile.windcharge.WindCharge;
import net.minecraft.world.item.*;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.neoforged.neoforge.event.EventHooks;

import javax.annotation.Nullable;
import java.util.List;

public class MorphinBlasterItem extends BaseBlasterItem {

	public MorphinBlasterItem(Tier toolTier, int Atk, float Spd, Properties prop) {
		super(toolTier, Atk, Spd, prop);
	}

	public void releaseUsing(ItemStack stack, Level level, LivingEntity entityLiving, int timeLeft) {
		super.releaseUsing(stack, level, entityLiving, timeLeft);
		if (entityLiving instanceof Player player && level instanceof ServerLevel serverlevel) {
			if (player.getItemBySlot(EquipmentSlot.FEET) == ItemStack.EMPTY) {
				if (player.getOffhandItem().getItem() == GoBustersItems.SILVER_ENETRON.get() | player.getOffhandItem().getItem() == GoBustersItems.STAG_ANIMAL_DISK.get())
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(GoBustersItems.STAG_MORPHIN_BLASTER.get(), 1));
				else if (player.getOffhandItem().getItem() == GoBustersItems.BEETLE_ANIMAL_DISK.get())
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(GoBustersItems.BEETLE_MORPHIN_BLASTER.get(), 1));
				else if (player.getOffhandItem().getItem() == GoBustersItems.VAGLASS_LOGO.get())
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(GoBustersItems.ENTER_MORPHIN_BLASTER.get(), 1));
				else
					player.setItemSlot(EquipmentSlot.FEET, new ItemStack(GoBustersItems.BEET_MORPHIN_BLASTER.get(), 1));
			}
		}
	}
}