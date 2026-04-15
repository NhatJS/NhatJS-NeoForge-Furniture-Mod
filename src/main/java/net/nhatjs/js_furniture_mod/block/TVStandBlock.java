package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;

public class TVStandBlock extends FurnitureHorizontalBlock {
    public TVStandBlock(Properties settings) {
        super(settings);
    }

    private static VoxelShape NORTH = Shapes.or(
            box(-16, 0, 3, -14.5, 11, 16),
            box(-14.5, 9.5, 3, 24, 11, 16),
            box(16.5, 6, 4, 18, 9.5, 4.75),
            box(16.5, 6, 14.25, 18, 9.5, 15),
            box(16.5, 6, 4.75, 18, 6.75, 14.25),
            box(1.5, 0, 4.75, 3, 0.75, 14.25),
            box(1.5, 0, 14.25, 3, 4.5, 15),
            box(1.5, 0, 4, 3, 4.5, 4.75),
            box(-2, 4.5, 3, 32, 6, 16),
            box(30.5, 0, 3, 32, 4.5, 16)
    );

    private static VoxelShape SOUTH = Shapes.or(
            box(30.5, 0, 0, 32, 11, 13),
            box(-8, 9.5, 0, 30.5, 11, 13),
            box(-2, 6, 11.25, -0.5, 9.5, 12),
            box(-2, 6, 1, -0.5, 9.5, 1.75),
            box(-2, 6, 1.75, -0.5, 6.75, 11.25),
            box(13, 0, 1.75, 14.5, 0.75, 11.25),
            box(13, 0, 1, 14.5, 4.5, 1.75),
            box(13, 0, 11.25, 14.5, 4.5, 12),
            box(-16, 4.5, 0, 18, 6, 13),
            box(-16, 0, 0, -14.5, 4.5, 13)
    );

    private static VoxelShape EAST = Shapes.or(
            box(0, 0, -16, 13, 11, -14.5),
            box(0, 9.5, -14.5, 13, 11, 24),
            box(11.25, 6, 16.5, 12, 9.5, 18),
            box(1, 6, 16.5, 1.75, 9.5, 18),
            box(1.75, 6, 16.5, 11.25, 6.75, 18),
            box(1.75, 0, 1.5, 11.25, 0.75, 3),
            box(1, 0, 1.5, 1.75, 4.5, 3),
            box(11.25, 0, 1.5, 12, 4.5, 3),
            box(0, 4.5, -2, 13, 6, 32),
            box(0, 0, 30.5, 13, 4.5, 32)
    );

    private static VoxelShape WEST = Shapes.or(
            box(3, 0, 30.5, 16, 11, 32),
            box(3, 9.5, -8, 16, 11, 30.5),
            box(4, 6, -2, 4.75, 9.5, -0.5),
            box(14.25, 6, -2, 15, 9.5, -0.5),
            box(4.75, 6, -2, 14.25, 6.75, -0.5),
            box(4.75, 0, 13, 14.25, 0.75, 14.5),
            box(14.25, 0, 13, 15, 4.5, 14.5),
            box(4, 0, 13, 4.75, 4.5, 14.5),
            box(3, 4.5, -16, 16, 6, 18),
            box(3, 0, -16, 16, 4.5, -14.5)
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
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}