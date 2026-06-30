package com.liasdan.supersentaicraft.blocks.machine;

import java.util.function.Supplier;

import com.liasdan.supersentaicraft.blocks.MachineBlock;
import com.liasdan.supersentaicraft.items.sentai_40.KyoryugerItems;

import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ZyudenchiCharger extends MachineBlock {

    public static final List<Supplier<Item>> KYORYUGER = Arrays.asList(
            KyoryugerItems.GABUTYRA_ZYUDENCHI,
            KyoryugerItems.PARASAGUN_ZYUDENCHI,
            KyoryugerItems.STEGOTCHI_ZYUDENCHI,
            KyoryugerItems.ZAKUTOR_ZYUDENCHI,
            KyoryugerItems.DRICERA_ZYUDENCHI,
            KyoryugerItems.PTERAGORDON_ZYUDENCHI,
            KyoryugerItems.ANKYDON_ZYUDENCHI,
            KyoryugerItems.BUNPACHY_ZYUDENCHI,
            KyoryugerItems.PLEZUON_ZYUDENCHI,
            KyoryugerItems.BRAGIGAS_ZYUDENCHI,
            KyoryugerItems.TOBASPINO_ZYUDENCHI,
            KyoryugerItems.CARNIVAL_ZYUDENCHI,
            KyoryugerItems.GIGA_BRAGIGAS_ZYUDENCHI,
            KyoryugerItems.CYAN_SPIRIT_ZYUDENCHI,
            KyoryugerItems.GREY_SPIRIT_ZYUDENCHI,
            KyoryugerItems.DEINOSGRANDER_ZYUDENCHI
    );

    public static final List<Supplier<Item>> DEBOTH = Arrays.asList(
            KyoryugerItems.DEBOTH_TOBASPINO_ZYUDENCHI,
            KyoryugerItems.DEBOTH_DEINOCHASER_ZYUDENCHI,
            KyoryugerItems.DEBOTH_DEINOSGRANDER_ZYUDENCHI
    );

    public static final List<Supplier<Item>> BRAVE = Arrays.asList(
            KyoryugerItems.GUNTYRA_ZYUDENCHI,
            KyoryugerItems.STEGONSAW_ZYUDENCHI,
            KyoryugerItems.SHOVECERA_ZYUDENCHI,
            KyoryugerItems.PARASASER_ZYUDENCHI,
            KyoryugerItems.RAPX_ZYUDENCHI,
            KyoryugerItems.PTERAVOLTON_ZYUDENCHI,
            KyoryugerItems.SPEEDRUS_ZYUDENCHI,
            KyoryugerItems.PRISUKEOS_ZYUDENCHI,
            KyoryugerItems.FUWANYCTO_ZYUDENCHI,
            KyoryugerItems.KACHICOX_ZYUDENCHI,
            KyoryugerItems.KARATETA_ZYUDENCHI,
            KyoryugerItems.TAEKWONDONTO_ZYUDENCHI
    );

    public static VoxelShape SHAPE = Block.box(0, 0, 0, 16, 16, 16);

    public ZyudenchiCharger(Properties properties, VoxelShape shape) {
        super(properties);
        SHAPE = shape;
    }

    public ZyudenchiCharger(Properties properties) {
        super(properties);
    }

    @Override
    public VoxelShape getShape(BlockState pState, net.minecraft.world.level.BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        return SHAPE;
    }

    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }

    private Item getZyudenchiDrop(int num) {
        Random generator = new Random();
        if (num == 0) {
            int rand = generator.nextInt(KYORYUGER.size());
            return KYORYUGER.get(rand).get();
        } else if (num == 1) {
            int rand = generator.nextInt(DEBOTH.size());
            return DEBOTH.get(rand).get();
        } else {
            int rand = generator.nextInt(BRAVE.size());
            return BRAVE.get(rand).get();
        }
    }

    @Override
    protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {
        if (!level.isClientSide()) {
            if (player.getItemInHand(hand).getItem() == KyoryugerItems.EMPTY_ZYUDENCHI.get()) {
                process(player, level, pos, hand, getZyudenchiDrop(0));
                return ItemInteractionResult.SUCCESS;
            } else if (player.getItemInHand(hand).getItem() == KyoryugerItems.BLANK_BRAVE_ZYUDENCHI.get()) {
                process(player, level, pos, hand, getZyudenchiDrop(2));
                return ItemInteractionResult.SUCCESS;
            }
            // Add DEBOTH zyudenchi logic if a blank deboth zyudenchi exists in KyoryugerItems.
            // KyoryugerItems doesn't seem to have a BLANK_DEBOTH_ZYUDENCHI currently. If it does, we can add it here.
        }
        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }

    public ZyudenchiCharger AddToTabList(List<Block> TabList) {
        TabList.add(this);
        return this;
    }
}
