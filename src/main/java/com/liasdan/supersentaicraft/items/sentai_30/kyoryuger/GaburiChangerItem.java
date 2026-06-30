package com.liasdan.supersentaicraft.items.sentai_30.kyoryuger;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.OtherItems;
import com.liasdan.supersentaicraft.items.others.RangerArmorItem;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import net.minecraft.core.Holder;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.neoforge.registries.DeferredItem;

import java.util.List;

public class GaburiChangerItem extends RangerChangerItem {
    public GaburiChangerItem(Holder<ArmorMaterial> material, String rider, DeferredItem<Item> baseFormItem, DeferredItem<Item> head, DeferredItem<Item> torso, DeferredItem<Item> legs, Properties properties) {
        super(material, rider, baseFormItem, head, torso, legs, properties);
        Has_basic_belt_info = false;
        Unlimited_Textures = 2;
    }

    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        Item formItem = this.get_Form_Item(stack, 1);
        Item formItem2 = this.get_Form_Item(stack, 2);

        if (formItem2 == OtherItems.BLANK_FORM.get()) {
            tooltipComponents.add(Component.literal("Ranger: " + Component.translatable(formItem.toString() + ".form").getString()));
        } else {
            tooltipComponents.add(Component.literal("Ranger: " + Component.translatable(formItem.toString() + ".form").getString()));
            tooltipComponents.add(Component.literal(Component.translatable(formItem2.toString() + ".form").getString()));
        }
        super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
    }

    @Override
    public String GET_TEXT(ItemStack itemstack, EquipmentSlot equipmentSlot, LivingEntity rider, String rangerName) {
        String belt = ((RangerChangerItem) itemstack.getItem()).BELT_TEXT;
        boolean fly = rider instanceof Player player && player.getAbilities().flying;

        if (equipmentSlot == EquipmentSlot.FEET) {
            if (((RangerChangerItem) itemstack.getItem()).BELT_TEXT == null) {
                belt = get_Form_Item(itemstack, 1).getBeltTex();
            }
            return "belts/" + belt;
        } else if (equipmentSlot == EquipmentSlot.HEAD) {
            if (get_Form_Item(itemstack, 2).getFormName(fly).equals("")) return "blank";
            return get_Form_Item(itemstack, 2).getFormName(fly);
        } else {
            return get_Form_Item(itemstack, 1).getRangerName(rangerName) + get_Form_Item(itemstack, 1).getFormName(fly);
        }
    }

    @Override
    public String getUnlimitedTextures(ItemStack itemstack, LivingEntity rider, String riderName, int num) {
        if (itemstack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA)) {
            net.minecraft.nbt.CompoundTag tag = itemstack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe();
            if (num == 1) { // right arm
                String overlay = tag.getString("overlay_right");
                if (!overlay.isEmpty()) return overlay;
            } else if (num == 2) { // left arm
                String overlay = tag.getString("overlay_left");
                if (!overlay.isEmpty()) return overlay;
            }
        }
        return "blank";
    }

    @Override
    public ResourceLocation getModelResource(ItemStack itemstack, RangerArmorItem animatable, EquipmentSlot slot, LivingEntity rider) {
        int num = 1;
        if (slot == EquipmentSlot.HEAD) num = 2;

        if (itemstack.has(net.minecraft.core.component.DataComponents.CUSTOM_DATA)) {
            net.minecraft.nbt.CompoundTag tag = itemstack.get(net.minecraft.core.component.DataComponents.CUSTOM_DATA).getUnsafe();
            boolean hasRight = !tag.getString("overlay_right").isEmpty();
            boolean hasLeft = !tag.getString("overlay_left").isEmpty();
            
            if (hasRight && hasLeft) {
                return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/carnival_both.geo.json");
            } else if (hasRight) {
                return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/carnival_right.geo.json");
            } else if (hasLeft) {
                return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/carnival_left.geo.json");
            }
        }

        if (get_Form_Item(itemstack, num).HasWingsIfFlying() && !rider.onGround()) {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/" + get_Form_Item(itemstack, num).get_FlyingModel(this.Rider));
        } else {
            return ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, "geo/" + get_Form_Item(itemstack, num).get_Model(this.Rider));
        }
    }

    @Override
    public boolean getPartsForSlot(ItemStack itemBySlot, EquipmentSlot currentSlot, String part) {
        switch (currentSlot) {
            case HEAD -> {
                if (part.equals("head")) return true;
                if (part.equals("body")) return true;
                if (part.equals("rightArm")) return true;
                if (part.equals("leftArm")) return true;
                if (part.equals("rightLeg")) return true;
                if (part.equals("leftLeg")) return true;
            }
            case CHEST -> {
                if (part.equals("head")) return true;
                if (part.equals("body")) return true;
                if (part.equals("rightArm")) return true;
                if (part.equals("leftArm")) return true;
            }
            case LEGS -> {
                if (part.equals("rightLeg")) return true;
                if (part.equals("leftLeg")) return true;
            }
            default -> {}
        }
        return false;
    }
}
