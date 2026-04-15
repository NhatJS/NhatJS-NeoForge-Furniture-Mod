package net.nhatjs.js_furniture_mod.block.added;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.core.ModItems;
import net.minecraft.world.item.ItemStack;
import net.nhatjs.js_furniture_mod.core.ModBlocks;

public class PCAdded6Block extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public PCAdded6Block(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(4, 0, 1.65, 12, 13.5, 14.35);
            case SOUTH -> Block.box(4, 0, 1.65, 12, 13.5, 14.35);
            case EAST -> Block.box(1.65, 0, 4, 14.35, 13.5, 12);
            case WEST -> Block.box(1.65, 0, 4, 14.35, 13.5, 12);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos,
                                            Player player, BlockHitResult hit) {
        if (world.isClientSide()) return InteractionResult.SUCCESS;
        ItemStack held = player.getMainHandItem();

        if (held.is(ModItems.AIO_COOLER)) {
            Direction facing =  state.getValue(HorizontalDirectionalBlock.FACING);
            world.setBlock(pos, ModBlocks.PC_ADDED_7.get().defaultBlockState()
                    .setValue(HorizontalDirectionalBlock.FACING, facing), Block.UPDATE_ALL);
            return InteractionResult.SUCCESS;
        }
        return InteractionResult.SUCCESS;
    }
}
