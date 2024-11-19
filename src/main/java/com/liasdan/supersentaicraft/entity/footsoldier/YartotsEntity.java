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

public class YartotsEntity extends BaseFootsoldierEntity {
	
    public YartotsEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="yartots";
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(MobsItems.YARTOTS_SABER.get()));
    }
}