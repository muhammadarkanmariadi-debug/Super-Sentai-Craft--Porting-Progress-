package com.liasdan.supersentaicraft.entity.footsoldier;

import com.liasdan.supersentaicraft.items.MobsItems;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class UnglersEntity extends BaseFootsoldierEntity {
	
    public UnglersEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="ungler";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.UNGLER_LANCE.get()));
    }
}