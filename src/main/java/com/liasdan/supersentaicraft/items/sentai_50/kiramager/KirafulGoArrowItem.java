package com.liasdan.supersentaicraft.items.sentai_50.kiramager;

import com.liasdan.supersentaicraft.items.others.BaseBlasterItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.core.component.DataComponents;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;

public class KirafulGoArrowItem extends BaseBlasterItem {

    public KirafulGoArrowItem(Tier toolTier, int Atk, float Spd, Properties prop) {
        super(toolTier, Atk, Spd, prop);
        this.setProjectile(BlasterProjectile.ARROW);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);
        ItemStack feetStack = player.getItemBySlot(EquipmentSlot.FEET);

        if (feetStack.isEmpty()) {
            ItemStack offhandStack = player.getItemInHand(InteractionHand.OFF_HAND);
            if (offhandStack.getItem() == com.liasdan.supersentaicraft.items.sentai_50.KiramagerItems.GOLD_KIRAMEI_STONE.get()) {
                player.setItemSlot(EquipmentSlot.FEET, new ItemStack(com.liasdan.supersentaicraft.items.sentai_50.KiramagerItems.GOLD_KIRAFUL_GO_ARROW.get()));
                return InteractionResultHolder.success(itemstack);
            }
        } else if (player.isShiftKeyDown() && feetStack.getItem() instanceof RangerChangerItem rangerChanger) {
            String rider = rangerChanger.Rider;
            if (rider.startsWith("kiramei_")) {
                String expectedGoForm = "go_" + rider;
                net.minecraft.resources.ResourceLocation resource = net.minecraft.resources.ResourceLocation.fromNamespaceAndPath(com.liasdan.supersentaicraft.SuperSentaiCraftCore.MODID, expectedGoForm);
                net.minecraft.world.item.Item formItem = net.minecraft.core.registries.BuiltInRegistries.ITEM.get(resource);
                
                if (formItem instanceof com.liasdan.supersentaicraft.items.others.RangerFormChangeItem rfc) {
                    com.liasdan.supersentaicraft.items.others.RangerFormChangeItem currentForm = RangerChangerItem.get_Form_Item(feetStack, 1);
                    if (currentForm != rfc) {
                        RangerChangerItem.set_Form_Item(feetStack, rfc, 1);
                    }
                }
            }
            return InteractionResultHolder.success(itemstack);
        }

        return super.use(level, player, hand);
    }
}
