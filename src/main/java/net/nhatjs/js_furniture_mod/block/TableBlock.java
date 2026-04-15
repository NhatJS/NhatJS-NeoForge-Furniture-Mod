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

public class TableBlock extends FurnitureHorizontalBlock {
    public TableBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            box(-16, 14, 0, 32, 16, 16),
            box(-16, 0, 0, -14, 14, 2),
            box(30, 0, 0, 32, 14, 2),
            box(30, 0, 14, 32, 14, 16),
            box(-16, 0, 14, -14, 14, 16)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            box(0, 14, -16, 16, 16, 32),
            box(14, 0, -16, 16, 14, -14),
            box(14, 0, 30, 16, 14, 32),
            box(0, 0, 30, 2, 14, 32),
            box(0, 0, -16, 2, 14, -14)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> HORIZONTAL;
            case SOUTH -> HORIZONTAL;
            case EAST -> VERTICAL;
            case WEST -> VERTICAL;
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}