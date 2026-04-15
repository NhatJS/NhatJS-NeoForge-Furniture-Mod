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

public class StandingDeskBlock extends FurnitureHorizontalBlock {
    public StandingDeskBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            box(-11.8, 0.15, 0.25, -9.75, 1, 15.75),
            box(-11.65, 0, 13.85, -9.9, 0.15, 15.6),
            box(25.75, 0.15, 0.25, 27.8, 1, 15.75),
            box(25.9, 0, 13.85, 27.65, 0.15, 15.6),
            box(25.9, 0, 0.4, 27.65, 0.15, 2.15),
            box(-11.65, 0, 0.4, -9.9, 0.15, 2.15),
            box(-12.75, 15, 0, 28.75, 16, 16)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            box(0.25, 0.15, -11.8, 15.75, 1, -9.75),
            box(0.4, 0, -11.65, 2.15, 0.15, -9.9),
            box(0.25, 0.15, 25.75, 15.75, 1, 27.8),
            box(0.4, 0, 25.9, 2.15, 0.15, 27.65),
            box(13.85, 0, 25.9, 15.6, 0.15, 27.65),
            box(13.85, 0, -11.65, 15.6, 0.15, -9.9),
            box(0, 15, -12.75, 16, 16, 28.75)
    );

    private static final VoxelShape NORTH = Shapes.or(
            box(-3.35, 13.45, 8.325, 19.35, 15, 11.45),
            box(-11.35, 14.05, 8.425, 27.35, 15, 11.35),
            box(-11.65, 1, 8.75, -9.9, 13.45, 11),
            box(25.9, 1, 8.75, 27.65, 13.45, 11),
            box(22.25, 13.725, 8.2, 28.15, 13.825, 11.575),
            box(22.25, 13.55, 8.6, 28.15, 14.925, 11.175),
            box(-12.15, 13.725, 8.2, -6.25, 13.825, 11.575),
            box(-12.15, 13.55, 8.6, -6.25, 14.925, 11.175)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            box(-3.35, 13.45, 4.55, 19.35, 15, 7.675),
            box(-11.35, 14.05, 4.65, 27.35, 15, 7.575),
            box(25.9, 1, 5, 27.65, 13.45, 7.25),
            box(-11.65, 1, 5, -9.9, 13.45, 7.25),
            box(-12.15, 13.725, 4.425, -6.25, 13.825, 7.8),
            box(-12.15, 13.55, 4.825, -6.25, 14.925, 7.4),
            box(22.25, 13.725, 4.425, 28.15, 13.825, 7.8),
            box(22.25, 13.55, 4.825, 28.15, 14.925, 7.4)
    );

    private static final VoxelShape EAST = Shapes.or(
            box(4.55, 13.45, -3.35, 7.675, 15, 19.35),
            box(4.65, 14.05, -11.35, 7.575, 15, 27.35),
            box(5, 1, -11.65, 7.25, 13.45, -9.9),
            box(5, 1, 25.9, 7.25, 13.45, 27.65),
            box(4.425, 13.725, 22.25, 7.80, 13.825, 28.15),
            box(4.825, 13.55, 22.25, 7.4, 14.925, 28.15),
            box(4.425, 13.725, -12.15, 7.80, 13.825, -6.25),
            box(4.825, 13.55, -12.15, 7.4, 14.925, -6.25)
    );

    private static final VoxelShape WEST = Shapes.or(
            box(8.325, 13.45, -3.35, 11.45, 15, 19.35),
            box(8.425, 14.05, -11.35, 11.35, 15, 27.35),
            box(8.75, 1, 25.9, 11, 13.45, 27.65),
            box(8.75, 1, -11.65, 11, 13.45, -9.9),
            box(8.2, 13.725, -12.15, 11.575, 13.825, -6.25),
            box(8.6, 13.55, -12.15, 11.175, 14.925, -6.25),
            box(8.2, 13.725, 22.25, 11.575, 13.825, 28.15),
            box(8.6, 13.55, 22.25, 11.175, 14.925, 28.15)
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