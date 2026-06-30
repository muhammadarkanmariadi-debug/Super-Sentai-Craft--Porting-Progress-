package com.liasdan.supersentaicraft.items.others;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraft.core.particles.ParticleTypes;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class BaseCannonItem extends SwordItem {
	private Item RepairItem = null;
	private final List<Supplier<Item>> splitItems;
	private boolean canLunge = true;

	@SafeVarargs
	public BaseCannonItem(Tier toolTier, int Atk, float Spd, Properties prop, Supplier<Item>... components) {
		super(toolTier, prop.attributes(SwordItem.createAttributes(toolTier, Atk, Spd)));
		this.splitItems = Arrays.asList(components);
	}

	public BaseCannonItem ChangeRepairItem(Item item) {
		RepairItem = item;
		return this;
	}

	public BaseCannonItem setCanLunge(boolean lunge) {
		this.canLunge = lunge;
		return this;
	}

	@Override
	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		if (RepairItem != null) {
			return p_40393_.getItem() == RepairItem;
		}
		return super.isValidRepairItem(p_40392_, p_40393_);
	}

	public BaseCannonItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
		ItemStack itemstack = player.getItemInHand(hand);

		if (player.isShiftKeyDown() && !splitItems.isEmpty()) {
			if (!level.isClientSide) {
				for (Supplier<Item> itemSupplier : splitItems) {
					ItemEntity entityItem = new ItemEntity(level, player.getX(), player.getY(), player.getZ(), new ItemStack(itemSupplier.get(), 1));
					level.addFreshEntity(entityItem);
				}
				itemstack.shrink(1);
			}
			return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
		} else if (canLunge) {
			player.fallDistance = 0;
			Vec3 look = player.getLookAngle();
			player.setDeltaMovement(look.x / 2, look.y / 2, look.z / 2);
			player.hurtMarked = true;
			
			if (level.isClientSide) {
				level.addParticle(ParticleTypes.FIREWORK, player.getX(), player.getY(), player.getZ(), 0.0D, 0.0D, 0.0D);
			}
			return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
		}

		return super.use(level, player, hand);
	}
}
