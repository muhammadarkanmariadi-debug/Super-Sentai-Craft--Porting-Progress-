package com.liasdan.supersentaicraft.items.sentai_50.don_brothers;

import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;

public class DonBlasterItem extends BaseBlasterItem {

    public DonBlasterItem(Tier toolTier, int Atk, float Spd, Properties prop) {
        super(toolTier, Atk, Spd, prop);
        this.setProjectile(BlasterProjectile.SMALL_FIREBALL);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        ItemStack offhandStack = player.getItemInHand(InteractionHand.OFF_HAND);
        ItemStack feetStack = player.getItemBySlot(EquipmentSlot.FEET);

        if (offhandStack.getItem() instanceof RangerFormChangeItem rfc && feetStack.getItem() instanceof RangerChangerItem) {
            RangerFormChangeItem currentForm = RangerChangerItem.get_Form_Item(feetStack, 1);
            if (currentForm == rfc) {
                RangerChangerItem.reset_Form_Item(feetStack);
            } else {
                RangerChangerItem.set_Form_Item(feetStack, rfc, 1);
            }
            player.swing(hand, true);
            return InteractionResultHolder.success(itemstack);
        }

        return super.use(level, player, hand);
    }
}
