package com.liasdan.supersentaicraft.items.sentai_40.gekiranger;

import com.liasdan.supersentaicraft.items.others.BaseSwordItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
public class SuperGekiClawItem extends BaseSwordItem {

    private final DeferredItem<Item> superForm;

    public SuperGekiClawItem(Tier toolTier, int Atk, float Spd, Properties prop, DeferredItem<Item> superForm) {
        super(toolTier, Atk, Spd, prop);
        this.superForm = superForm;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        ItemStack belt = player.getItemBySlot(EquipmentSlot.FEET);

        if ( belt.getItem() instanceof RangerChangerItem) {
            if (!level.isClientSide()) {
                RangerFormChangeItem currentForm = RangerChangerItem.get_Form_Item(belt, 1);
                if (currentForm == superForm.get()) {
                    // Revert to base form
                    RangerChangerItem.reset_Form_Item(belt);
                } else {
                    // Change to super form
                    if (superForm.get() instanceof RangerFormChangeItem formItem) {
                        RangerChangerItem.set_Form_Item(belt, formItem, 1);
                    }
                }
            }
            return InteractionResultHolder.sidedSuccess(itemstack, level.isClientSide());
        }
        
        return super.use(level, player, hand);
    }
}
