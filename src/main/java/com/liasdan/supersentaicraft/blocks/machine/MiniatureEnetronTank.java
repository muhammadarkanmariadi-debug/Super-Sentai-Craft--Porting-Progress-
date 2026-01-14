package com.liasdan.supersentaicraft.blocks.machine;

import com.liasdan.supersentaicraft.blocks.MachineBlock;
import com.liasdan.supersentaicraft.blocks.RangerBlocks;
import com.liasdan.supersentaicraft.items.BoonboomgerItems;
import com.liasdan.supersentaicraft.items.GoBustersItems;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MiniatureEnetronTank extends MachineBlock {

	public static List<Item> ENETRON= new ArrayList<Item>();

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;


	  public static VoxelShape SHAPE = Block.box(0, 0, 0, 16,32, 16);

	public MiniatureEnetronTank(Properties properties, VoxelShape shape ) {
		
		super(properties);
		SHAPE =shape;
	}
	
	   @Override
	    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
	        return SHAPE;
	    }

	    @Override
	    public RenderShape getRenderShape(BlockState pState) {
	        return RenderShape.MODEL;
	    }

	   public static boolean isShapeFullBlock(VoxelShape p_49917_) {
		      return false;
		   }


    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> p_53681_) {
        p_53681_.add(FACING);
     }

     public BlockState getStateForPlacement(BlockPlaceContext p_53679_) {
        return this.defaultBlockState().setValue(FACING, p_53679_.getHorizontalDirection().getOpposite());
     }

     public PushReaction getPistonPushReaction(BlockState p_53683_) {
        return PushReaction.PUSH_ONLY;
     }

     private Item getEnetronDrop(int num) {
 		Random generator = new Random();
 			int rand = generator.nextInt(ENETRON.size());
 			return ENETRON.get(rand);

 	}

	@Override
	protected ItemInteractionResult useItemOn(ItemStack stack, BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hitResult) {

		if (!level.isClientSide()) {
			if (player.getItemInHand(hand).getItem() == RangerBlocks.UNREFINED_ENETRON.asItem() & player.getInventory().countItem(Items.IRON_INGOT) != 0) {
				player.getInventory().removeItem(player.getInventory().findSlotMatchingItem(new ItemStack(Items.IRON_INGOT)), 1);
				process(player, level, pos, hand, GoBustersItems.ENETRON.asItem());
				return ItemInteractionResult.SUCCESS;
			}
			if (player.getItemInHand(hand).getItem() == GoBustersItems.ENETRON.get()) {
				process(player, level, pos, hand, getEnetronDrop(0));
				return ItemInteractionResult.SUCCESS;
			}
		}
		return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
	}



	public MiniatureEnetronTank AddToTabList(List<Block> TabList) {
		TabList.add(this);
		return this;
	}

}