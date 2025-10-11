package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DeskBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;

    public DeskBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape NORTH = Shapes.or(
            Block.box(-8, 12.925, 0, 24, 16, 16),
            Block.box(23, 0, 0, 24, 12.925, 1),
            Block.box(23, 0, 15, 24, 12.925, 16),
            Block.box(-8, 0, 0, -7, 12.925, 1),
            Block.box(-8, 0, 15, -7, 12.925, 16),
            Block.box(23.1, 12.125, 1, 23.9, 12.925, 15),
            Block.box(-7.9, 12.125, 1, -7.1, 12.925, 15),
            Block.box(-7.9, 2.2, 1, -7.1, 3, 15),
            Block.box(23.1, 2.2, 1, 23.9, 3, 15),
            Block.box(-7, 2.2, 15.1, 23, 3, 15.9),
            Block.box(-7, 12.125, 15.1, 23, 12.925, 15.9)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            Block.box(-8, 12.925, 0, 24, 16, 16),
            Block.box(23, 0, 15, 24, 12.925, 16),
            Block.box(23, 0, 0, 24, 12.925, 1),
            Block.box(-8, 0, 15, -7, 12.925, 16),
            Block.box(-8, 0, 0, -7, 12.925, 1),
            Block.box(23.1, 12.125, 1, 23.9, 12.925, 15),
            Block.box(-7.9, 12.125, 1, -7.1, 12.925, 15),
            Block.box(-7.9, 2.2, 1, -7.1, 3, 15),
            Block.box(23.1, 2.2, 1, 23.9, 3, 15),
            Block.box(-7, 2.2, 0.1, 23, 3, 0.9),
            Block.box(-7, 12.125, 0.1, 23, 12.925, 0.9)
    );

    private static final VoxelShape EAST = Shapes.or(
            Block.box(-0.025, 12.925, -7.975, 15.975, 16, 24.025),
            Block.box(14.975, 0, 23.025, 15.975, 12.925, 24.025),
            Block.box(-0.025, 0, 23.025, 0.975, 12.925, 24.025),
            Block.box(14.975, 0, -7.975, 15.975, 12.925, -6.975),
            Block.box(-0.025, 0, -7.975, 0.975, 12.925, -6.975),
            Block.box(0.975, 12.125, 23.125, 14.975, 12.925, 23.925),
            Block.box(0.975, 12.125, -7.875, 14.975, 12.925, -7.075),
            Block.box(0.975, 2.2, -7.875, 14.975, 3, -7.075),
            Block.box(0.975, 2.2, 23.125, 14.975, 3, 23.925),
            Block.box(0.075, 2.2, -6.975, 0.875, 3, 23.025),
            Block.box(0.075, 12.125, -6.975, 0.875, 12.925, 23.025)
    );

    private static final VoxelShape WEST = Shapes.or(
            Block.box(0, 12.925, -8, 16, 16, 24),
            Block.box(0, 0, -8, 1, 12.925, -7),
            Block.box(15, 0, -8, 16, 12.925, -7),
            Block.box(0, 0, 23, 1, 12.925, 24),
            Block.box(15, 0, 23, 16, 12.925, 24),
            Block.box(1, 12.125, -7.9, 15, 12.925, -7.1),
            Block.box(1, 12.125, 23.1, 15, 12.925, 23.9),
            Block.box(1, 2.2, 23.1, 15, 3, 23.9),
            Block.box(1, 2.2, -7.9, 15, 3, -7.1),
            Block.box(15.1, 2.2, -7, 15.9, 3, 23),
            Block.box(15.1, 12.125, -7, 15.9, 12.925, 23)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> NORTH;
            case SOUTH -> SOUTH;
            case EAST -> EAST;
            case WEST -> WEST;
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}