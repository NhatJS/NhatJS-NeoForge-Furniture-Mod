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

public class DeskBlock extends FurnitureHorizontalBlock {
    public DeskBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            box(-8, 0, 0, -6.25, 13, 1.75),
            box(22.25, 0, 0, 24, 13, 1.75),
            box(-8, 0, 14.25, -6.25, 13, 16),
            box(22.25, 0, 14.25, 24, 13, 16),
            box(-8, 13, 0, 24, 16, 16),
            box(-7.5, 9, 1.75, -6.75, 10, 14.25),
            box(22.75, 9, 1.75, 23.5, 10, 14.25)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            box(14.25, 0, -8, 16, 13, -6.25),
            box(14.25, 0, 22.25, 16, 13, 24),
            box(0, 0, -8, 1.75, 13, -6.25),
            box(0, 0, 22.25, 1.75, 13, 24),
            box(0, 13, -8, 16, 16, 24),
            box(1.75, 9, -7.5, 14.25, 10, -6.75),
            box(1.75, 9, 22.75, 14.25, 10, 23.5)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(HORIZONTAL, box(-6.25, 3, 14.75, 22.25, 4, 15.5));
            case SOUTH -> Shapes.or(HORIZONTAL, box(-6.25, 3, 0.5, 22.25, 4, 1.25));
            case EAST -> Shapes.or(VERTICAL, box(0.5, 3, -6.25, 1.25, 4, 22.25));
            case WEST -> Shapes.or(VERTICAL, box(14.75, 3, -6.25, 15.5, 4, 22.25));
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}