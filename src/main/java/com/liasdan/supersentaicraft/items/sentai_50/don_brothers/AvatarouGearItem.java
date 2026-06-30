package com.liasdan.supersentaicraft.items.sentai_50.don_brothers;

import com.liasdan.supersentaicraft.SuperSentaiCraftCore;
import com.liasdan.supersentaicraft.items.others.RangerChangerItem;
import com.liasdan.supersentaicraft.items.others.RangerFormChangeItem;
import com.liasdan.supersentaicraft.items.sentai_50.DonbrothersItems;
import com.liasdan.supersentaicraft.items.sentai_50.ZenkaigerItems;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.level.Level;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class AvatarouGearItem extends RangerFormChangeItem {

    public int num;
    public int num2;
    public boolean alter = false;
    public boolean sixth = false;
    private Supplier<Item> alterGearSupplier;
    private Supplier<Item> sixthGearSupplier;

    public AvatarouGearItem(Properties properties, int belt, String formName, String rangername, String beltTex, MobEffectInstance... effects) {
        super(properties, belt, formName, rangername, beltTex, effects);
    }

    public AvatarouGearItem(Properties properties, int belt, String formName, String rangername, MobEffectInstance... effects) {
        super(properties, belt, formName, rangername, effects);
    }

    public AvatarouGearItem setNum(int num) {
        this.num = num;
        return this;
    }

    public AvatarouGearItem setNum2(int num2) {
        this.num2 = num2;
        return this;
    }

    public AvatarouGearItem alter(Supplier<Item> alterGear) {
        this.alter = true;
        this.alterGearSupplier = alterGear;
        return this;
    }

    public AvatarouGearItem sixth(Supplier<Item> sixthGear) {
        this.sixth = true;
        this.sixthGearSupplier = sixthGear;
        return this;
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack itemstack = player.getItemInHand(hand);

        if (!level.isClientSide()) {
            ItemStack feet = player.getItemBySlot(EquipmentSlot.FEET);

            if (!feet.isEmpty() && feet.getItem() instanceof RangerChangerItem) {
                Item belt = feet.getItem();

                if (belt == DonbrothersItems.MOMOTAROU_DON_BLASTER.get()) {
                    if (getNBT(feet, "alter") == 1) {
                        if (alter && alterGearSupplier != null) {
                            dropItemAndShrink(level, player, hand, itemstack, alterGearSupplier.get());
                        }
                    } else {
                        setNBT(feet, "avatar", num);
                        setNBT(feet, "lock", 0);
                        setNBT(feet, "core", 0);
                        setNBT(feet, "alter", 0);
                    }
                } else if (belt == DonbrothersItems.SARU_DON_BLASTER.get()) {
                    if (num == 46 || num == 43) {
                        setNBT(feet, "avatar", 0);
                    } else {
                        setNBT(feet, "avatar", num);
                    }
                } else if (belt == DonbrothersItems.ONI_DON_BLASTER.get()) {
                    if (num == 2 || num == 3 || num == 9 || num == 37 || num == 43 || num == 44 || num == 46) {
                        setNBT(feet, "avatar", 0);
                    } else {
                        setNBT(feet, "avatar", num);
                    }
                } else if (belt == DonbrothersItems.INU_DON_BLASTER.get()) {
                    if (num == 1 || num == 2 || num == 4 || num == 5 || num == 8 || num == 10 || num == 17 || num == 19 || num == 20 || num == 22 || num == 23 || num == 24 || num == 26 || num == 28 || num == 29 || num == 31 || num == 33 || num == 35 || num == 36 || num == 38 || num == 39 || num == 40 || num == 42 || num == 43 || num == 45 || num == 46) {
                        setNBT(feet, "avatar", 0);
                    } else {
                        setNBT(feet, "avatar", num);
                    }
                } else if (belt == DonbrothersItems.KIJI_DON_BLASTER.get()) {
                    if (num == 5 || num == 12 || num == 15 || num == 18 || num == 25 || num == 26 || num == 27 || num == 31 || num == 32 || num == 36 || num == 40 || num == 42 || num == 46) {
                        setNBT(feet, "avatar", 0);
                    } else {
                        setNBT(feet, "avatar", num);
                    }
                } else if (belt == DonbrothersItems.TORADORA_RYUKO_NO_GEKI.get()) {
                    if (num2 != 0) {
                        setNBT(feet, "core", num2);
                        setNBT(feet, "alter", 0);
                    }
                    if (getNBT(feet, "alter") == 1) {
                        if (alter && alterGearSupplier != null) {
                            dropItemAndShrink(level, player, hand, itemstack, alterGearSupplier.get());
                        }
                    }
                    int core = getNBT(feet, "core");
                    if (core == 0 || core == 1) {
                        if (sixth && sixthGearSupplier != null) {
                            dropItemAndShrink(level, player, hand, itemstack, sixthGearSupplier.get());
                        }
                    }
                } else if (belt == DonbrothersItems.MURASAME_NINJARK_SWORD.get()) {
                    if (getNBT(feet, "alter") == 1) {
                        if (alter && alterGearSupplier != null) {
                            dropItemAndShrink(level, player, hand, itemstack, alterGearSupplier.get());
                        }
                    } else {
                        if (num == 27) { // Abaranger
                            setNBT(feet, "avatar", num);
                        } else {
                            setNBT(feet, "avatar", 0);
                        }
                    }
                }
            }
        }
        return super.use(level, player, hand);
    }

    private void dropItemAndShrink(Level level, Player player, InteractionHand hand, ItemStack itemstack, Item itemToDrop) {
        if (!level.isClientSide) {
            player.drop(new ItemStack(itemToDrop, 1), false);
            if (!player.isCreative()) {
                itemstack.shrink(1);
            }
        }
    }

    @Override
    public void OnTransformation(ItemStack itemstack, LivingEntity entity) {
        super.OnTransformation(itemstack, entity);
        
        // This old logic was for giving alter gear items when holding standard gears
        // The proper logic from 1.12.2 is now in use() above. We keep this if the user
        // relies on the old behavior for some gears, but it's largely superseded by dropItemAndShrink
        if (entity instanceof Player player && !player.level().isClientSide()) {
            String gearName = BuiltInRegistries.ITEM.getKey(this).getPath();
            String dropName = null;
            String dropName2 = null;
            
            if (gearName.equals("patranger_avatarou_gear_alter")) dropName = "don_patren_alter";
            else if (gearName.equals("lupinranger_avatarou_gear_alter")) dropName = "don_lupin_alter";
            else if (gearName.equals("ryusoulger_avatarou_gear_alter")) {
                dropName = "don_ryusoul_alter";
                dropName2 = "don_ryusoul_alter_shield";
            }
            
            if (dropName != null) {
                ResourceLocation alterId = ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, dropName);
                if (BuiltInRegistries.ITEM.containsKey(alterId)) {
                    Item alterVariant = BuiltInRegistries.ITEM.get(alterId);
                    if (alterVariant != Items.AIR && alterVariant != null) {
                        ItemStack currentMain = player.getItemInHand(InteractionHand.MAIN_HAND);
                        if (!currentMain.isEmpty()) {
                            if (!player.getInventory().add(currentMain)) {
                                player.drop(currentMain, false);
                            }
                        }
                        player.setItemInHand(InteractionHand.MAIN_HAND, new ItemStack(alterVariant, 1));
                    }
                }
            }
            if (dropName2 != null) {
                ResourceLocation alterId2 = ResourceLocation.fromNamespaceAndPath(SuperSentaiCraftCore.MODID, dropName2);
                if (BuiltInRegistries.ITEM.containsKey(alterId2)) {
                    Item alterVariant2 = BuiltInRegistries.ITEM.get(alterId2);
                    if (alterVariant2 != Items.AIR && alterVariant2 != null) {
                        ItemStack currentOff = player.getItemInHand(InteractionHand.OFF_HAND);
                        if (!currentOff.isEmpty()) {
                            if (!player.getInventory().add(currentOff)) {
                                player.drop(currentOff, false);
                            }
                        }
                        player.setItemInHand(InteractionHand.OFF_HAND, new ItemStack(alterVariant2, 1));
                    }
                }
            }
        }
    }

    public static int getNBT(ItemStack stack, String key) {
        if (stack.has(DataComponents.CUSTOM_DATA)) {
            CompoundTag tag = stack.get(DataComponents.CUSTOM_DATA).copyTag();
            return tag.getInt(key);
        }
        return 0;
    }

    public static void setNBT(ItemStack stack, String key, int value) {
        Consumer<CompoundTag> data = tag -> tag.putInt(key, value);
        CustomData.update(DataComponents.CUSTOM_DATA, stack, data);
    }
}
