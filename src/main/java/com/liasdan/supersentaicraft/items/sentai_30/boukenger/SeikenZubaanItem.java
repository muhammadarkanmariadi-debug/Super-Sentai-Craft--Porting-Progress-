package com.liasdan.supersentaicraft.items.sentai_30.boukenger;

import com.liasdan.supersentaicraft.entity.ally.BaseAllyEntity;
import com.liasdan.supersentaicraft.items.sentai_10.GorangerItems;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

import java.util.List;
import java.util.function.Supplier;

public class SeikenZubaanItem extends SwordItem {

	private java.util.function.Supplier<Item> RepairItem = GorangerItems.GORANGER_LOGO;

	private Item craftingRemainingItem = null;

    private Supplier<? extends EntityType<? extends BaseAllyEntity>> BOSS;

	public SeikenZubaanItem(Tier toolTier, int Atk, float Spd, Properties prop, Supplier<? extends EntityType<? extends BaseAllyEntity>> boss) {
		super(toolTier, prop.attributes(SwordItem.createAttributes(Tiers.DIAMOND, Atk, Spd)));

        BOSS =boss;
	}

    public InteractionResult useOn(UseOnContext context) {

        Player player = context.getPlayer();
        ItemStack itemstack = player.getItemInHand(context.getHand());
        Level level = player.level();

        if (!level.isClientSide()) {
            if (level instanceof ServerLevel) {
                if (player.isShiftKeyDown()) {
                    BlockPos pos = context.getClickedPos();
                    BaseAllyEntity boss = BOSS.get().create(level);
                    if (boss != null) {
                        boss.setTame(true, false);
                        boss.setOwnerUUID(player.getUUID());
                        boss.moveTo(pos.getX(), pos.getY() + 1, pos.getZ(), 0, 0.0F);
                        level.addFreshEntity(boss);
                        itemstack.consume(1, player);
                        player.awardStat(Stats.ITEM_USED.get(this));
                    }
                }
            }
        }
        return InteractionResult.PASS;
    }

	public SeikenZubaanItem ChangeRepairItem(Item item) {
		RepairItem = () -> item;
		return this;
	}

	public boolean isValidRepairItem(ItemStack p_40392_, ItemStack p_40393_) {
		return p_40393_.getItem()== RepairItem.get();
	}

	public SeikenZubaanItem AddToTabList(List<Item> TabList) {
		TabList.add(this);
		return this;
	}

	public SeikenZubaanItem KeepDifItem(Item Dif) {
		craftingRemainingItem=Dif;
		return this;
	}

	public SeikenZubaanItem KeepItem() {
		craftingRemainingItem=this;
		return this;
	}

	public ItemStack getCraftingRemainingItem(ItemStack stack)
	{
		if (stack.getItem() instanceof SeikenZubaanItem) {
			if (!hasCraftingRemainingItem(stack))
			{
				return ItemStack.EMPTY;
			}
			return new ItemStack(craftingRemainingItem);
		} else  return new ItemStack(this.getCraftingRemainingItem());
	}


	public boolean hasCraftingRemainingItem(ItemStack stack)
	{
		return ((SeikenZubaanItem)stack.getItem()).craftingRemainingItem!=null;
	}
}