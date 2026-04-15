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

public class DrawerSingleBlock extends FurnitureHorizontalBlock {
    public DrawerSingleBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape NORTH = Shapes.or(
            box(0.1, 0, 0.75, 15.9, 4.25, 1.75),
            box(2.1, 0, 1.75, 13.9, 1, 15.75),
            box(13.9, 0, 1.75, 14.9, 4, 15.75),
            box(1.1, 0, 1.75, 2.1, 4, 15.75),
            box(2.1, 1, 14.75, 13.9, 4, 15.75),
            box(6.1, 3, 0.25, 9.9, 3.75, 0.25),
            box(9.9, 3, 0.25, 9.9, 3.75, 0.75),
            box(6.1, 3, 0.25, 6.1, 3.75, 0.75)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            box(0.1, 0, 14.25, 15.9, 4.25, 15.25),
            box(2.1, 0, 0.25, 13.9, 1, 14.25),
            box(1.1, 0, 0.25, 2.1, 4, 14.25),
            box(13.9, 0, 0.25, 14.9, 4, 14.25),
            box(2.1, 1, 0.25, 13.9, 4, 1.25),
            box(6.1, 3, 15.75, 9.9, 3.75, 15.75),
            box(6.1, 3, 15.25, 6.1, 3.75, 15.75),
            box(9.9, 3, 15.25, 9.9, 3.75, 15.75)
    );

    private static final VoxelShape EAST = Shapes.or(
            box(14.25, 0, 0.1, 15.25, 4.25, 15.9),
            box(0.25, 0, 2.1, 14.25, 1, 13.9),
            box(0.25, 0, 13.9, 14.25, 4, 14.9),
            box(0.25, 0, 1.1, 14.25, 4, 2.1),
            box(0.25, 1, 2.1, 1.25, 4, 13.9),
            box(15.75, 3, 6.1, 15.75, 3.75, 9.9),
            box(15.25, 3, 9.9, 15.75, 3.75, 9.9),
            box(15.25, 3, 6.1, 15.75, 3.75, 6.1)
    );

    private static final VoxelShape WEST = Shapes.or(
            box(0.75, 0, 0.1, 1.75, 4.25, 15.9),
            box(1.75, 0, 2.1, 15.75, 1, 13.9),
            box(1.75, 0, 1.1, 15.75, 4, 2.1),
            box(1.75, 0, 13.9, 15.75, 4, 14.9),
            box(14.75, 1, 2.1, 15.75, 4, 13.9),
            box(0.25, 3, 6.1, 0.25, 3.75, 9.9),
            box(0.25, 3, 6.1, 0.75, 3.75, 6.1),
            box(0.25, 3, 9.9, 0.75, 3.75, 9.9)
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
