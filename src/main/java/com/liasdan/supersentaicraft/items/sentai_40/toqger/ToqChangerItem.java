package com.liasdan.supersentaicraft.items.sentai_40.toqger;

import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.registries.DeferredItem;

public class ToqChangerItem extends RangerChangerItem {

    public ToqChangerItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs, Properties properties) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        this.Unlimited_Textures = 1;
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        if (itemstack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA)) {
            net.minecraft.nbt.CompoundTag tag = itemstack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe();
            if (num == 1) { // overlay
                String overlay = tag.getString("toq_overlay");
                if (!overlay.isEmpty()) return overlay;
            }
        }
        return "blank";
    }

    @Override
    public String GET_TEXT(ItemStack itemstack, net.minecraft.world.entity.EquipmentSlot equipmentSlot, LivingEntity rider, String riderName) {
        String base = super.GET_TEXT(itemstack, equipmentSlot, rider, riderName);
        if (equipmentSlot != net.minecraft.world.entity.EquipmentSlot.FEET && itemstack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA)) {
            net.minecraft.nbt.CompoundTag tag = itemstack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe();
            String gender = tag.getString("toq_gender");
            if (gender.isEmpty()) {
                gender = "guy"; // fallback for existing items
            }
            if (!gender.isEmpty()) {
                if (base.contains("rainbow") || base.contains("darkness") || base.contains("safari") || base.contains("white") || base.contains("yami_0gou")) return base;
                if (base.endsWith("_guy") || base.endsWith("_girl")) return base;
                return base + "_" + gender;
            }
        }
        return base;
    }

    @Override
    public void inventoryTick(ItemStack stack, net.minecraft.world.level.Level level, net.minecraft.world.entity.Entity entity, int slotId, boolean isSelected) {
        super.inventoryTick(stack, level, entity, slotId, isSelected);
        if (entity instanceof net.minecraft.world.entity.player.Player player && slotId == net.minecraft.world.entity.EquipmentSlot.FEET.getIndex() && !level.isClientSide) {
            if (player.isShiftKeyDown() && this.Rider.equals("toq_1gou")) {
                if (player.getInventory().contains(new ItemStack(com.liasdan.supersentaicraft.items.sentai_40.ToqgerItems.RED_RESSHA.get())) &&
                    player.getInventory().contains(new ItemStack(com.liasdan.supersentaicraft.items.sentai_40.ToqgerItems.BLUE_RESSHA.get())) &&
                    player.getInventory().contains(new ItemStack(com.liasdan.supersentaicraft.items.sentai_40.ToqgerItems.YELLOW_RESSHA.get())) &&
                    player.getInventory().contains(new ItemStack(com.liasdan.supersentaicraft.items.sentai_40.ToqgerItems.GREEN_RESSHA.get())) &&
                    player.getInventory().contains(new ItemStack(com.liasdan.supersentaicraft.items.sentai_40.ToqgerItems.PINK_RESSHA.get())) &&
                    player.getInventory().contains(new ItemStack(com.liasdan.supersentaicraft.items.sentai_40.ToqgerItems.BUILD_RESSHA.get()))) {
                    
                    // Activate Rainbow form by setting the ItemBaseForm component
                    if (stack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA)) {
                        net.minecraft.nbt.CompoundTag tag = stack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe();
                        tag.putString("ItemBaseForm", net.minecraft.core.registries.BuiltInRegistries.ITEM.getKey(com.liasdan.supersentaicraft.items.sentai_40.ToqgerItems.RAINBOW_RESSHA.get()).toString());
                    } else {
                        net.minecraft.nbt.CompoundTag tag = new net.minecraft.nbt.CompoundTag();
                        tag.putString("ItemBaseForm", net.minecraft.core.registries.BuiltInRegistries.ITEM.getKey(com.liasdan.supersentaicraft.items.sentai_40.ToqgerItems.RAINBOW_RESSHA.get()).toString());
                        stack.set(net.minecraft.core.component.DataComponents.CUSTOM_DATA, net.minecraft.world.item.component.CustomData.of(tag));
                    }
                }
            }
        }
    }
}
