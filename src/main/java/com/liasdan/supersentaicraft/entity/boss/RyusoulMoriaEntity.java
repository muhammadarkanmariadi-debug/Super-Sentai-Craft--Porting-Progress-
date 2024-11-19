package com.liasdan.supersentaicraft.entity.boss;

import java.util.Random;

import com.liasdan.supersentaicraft.entity.footsoldier.BaseFootsoldierEntity;
import com.liasdan.supersentaicraft.items.MobsItems;
import com.liasdan.supersentaicraft.items.RyusoulgerItems;
import com.liasdan.supersentaicraft.items.ShinkengerItems;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class RyusoulMoriaEntity extends BaseFootsoldierEntity {
	
    public RyusoulMoriaEntity(EntityType<? extends BaseFootsoldierEntity> type, Level level) {
        super(type, level);
        NAME="ld_ryusoul_moria";
        this.setItemSlot(EquipmentSlot.HEAD, new ItemStack(RyusoulgerItems.RYUSOULGER_HELMET.get()));
        this.setItemSlot(EquipmentSlot.CHEST, new ItemStack(RyusoulgerItems.RYUSOULGER_CHESTPLATE.get()));
        this.setItemSlot(EquipmentSlot.LEGS, new ItemStack(RyusoulgerItems.RYUSOULGER_LEGGINGS.get()));
        this.setItemSlot(EquipmentSlot.FEET, new ItemStack(RyusoulgerItems.MORIA_RYUSOUL_CHANGER.get()));
        this.setItemSlot(EquipmentSlot.MAINHAND, new ItemStack(RyusoulgerItems.RYUSOUL_KEN.get()));
    }
}