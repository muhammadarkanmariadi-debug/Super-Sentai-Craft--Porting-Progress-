package com.liasdan.supersentaicraft.items.sentai_50.kiramager;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

public class ShinyBreakerToolItem extends PickaxeItem {

    private Item craftingRemainingItem = null;
    private java.util.function.Supplier<Item> craftingRemainingItemSupplier = null;
    private Boolean Dual = false;

    public ShinyBreakerToolItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        
        player.fallDistance = 0.0F;
        Vec3 look = player.getLookAngle();
        player.setDeltaMovement(look.x / 2.0D, look.y / 2.0D, look.z / 2.0D);
        player.hurtMarked = true; // Make sure the client sends the delta movement update to server
        
        if (level.isClientSide) {
            level.addParticle(ParticleTypes.FIREWORK, player.getX(), player.getY(), player.getZ(), 0.0D, 0.0D, 0.0D);
        }
        
        player.startUsingItem(hand);
        return InteractionResultHolder.success(itemstack);
    }

    public ShinyBreakerToolItem AddToTabList(java.util.List<Item> TabList) {
        TabList.add(this);
        return this;
    }

    public ShinyBreakerToolItem KeepDifItem(Item Dif) {
        craftingRemainingItem = Dif;
        return this;
    }

    public ShinyBreakerToolItem KeepDifItemSupplier(java.util.function.Supplier<Item> Dif) {
        craftingRemainingItemSupplier = Dif;
        return this;
    }

    public ShinyBreakerToolItem KeepItem() {
        craftingRemainingItem = this;
        return this;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack stack) {
        if (stack.getItem() instanceof ShinyBreakerToolItem) {
            if (!hasCraftingRemainingItem(stack)) {
                return ItemStack.EMPTY;
            }
            if (craftingRemainingItemSupplier != null) {
                return new ItemStack(craftingRemainingItemSupplier.get());
            }
            return new ItemStack(craftingRemainingItem);
        } else {
            return new ItemStack(this.getCraftingRemainingItem());
        }
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return ((ShinyBreakerToolItem)stack.getItem()).craftingRemainingItem != null || ((ShinyBreakerToolItem)stack.getItem()).craftingRemainingItemSupplier != null;
    }

    public ShinyBreakerToolItem IsDualWeapon() {
        Dual = true;
        com.liasdan.supersentaicraft.SuperSentaiCraftCore.MULTI_WEAPON_ITEM.add(this);
        return this;
    }
}
