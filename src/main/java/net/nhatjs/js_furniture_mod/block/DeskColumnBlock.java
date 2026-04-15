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

public class DeskColumnBlock extends FurnitureHorizontalBlock {
    public DeskColumnBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            box(6.975, 0.15, 0.25, 9.025, 1, 15.75),
            box(7.125, 0, 0.4, 8.875, 0.15, 2.15),
            box(7.125, 0, 13.85, 8.875, 0.15, 15.6)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            box(0.25, 0.15, 6.975, 15.75, 1, 9.025),
            box(13.85, 0, 7.125, 15.6, 0.15, 8.875),
            box(0.4, 0, 7.125, 2.15, 0.15, 8.875)
    );

    private static final VoxelShape NORTH = Shapes.or(
            box(7.125, 1, 8.75, 8.875, 13.55, 11),
            box(3.475, 13.55, 8.6, 9.375, 13.725, 11.175),
            box(3.475, 13.725, 8.2, 9.375, 13.825, 11.575),
            box(3.475, 13.825, 8.725, 9.375, 14.925, 11.05)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            box(7.125, 1, 5, 8.875, 13.55, 7.25),
            box(6.625, 13.55, 4.825, 12.525, 13.725, 7.4),
            box(6.625, 13.725, 4.425, 12.525, 13.825, 7.8),
            box(6.625, 13.825, 4.959, 12.525, 14.925, 7.275)
    );

    private static final VoxelShape EAST = Shapes.or(
            box(5, 1, 7.125, 7.25, 13.55, 8.875),
            box(4.825, 13.55, 3.475, 7.4, 13.725, 9.375),
            box(4.425, 13.725, 3.475, 7.8, 13.825, 9.375),
            box(4.95, 13.825, 3.475, 7.275, 14.925, 9.375)
    );

    private static final VoxelShape WEST = Shapes.or(
            box(8.75, 1, 7.125, 11, 13.55, 8.875),
            box(8.6, 13.55, 6.625, 11.175, 13.725, 12.525),
            box(8.2, 13.725, 6.625, 11.575, 13.825, 12.525),
            box(8.725, 13.825, 6.625, 11.05, 14.925, 12.525)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(HORIZONTAL, NORTH);
            case SOUTH -> Shapes.or(HORIZONTAL, SOUTH);
            case EAST -> Shapes.or(VERTICAL, EAST);
            case WEST -> Shapes.or(VERTICAL, WEST);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}