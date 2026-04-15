package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;

public class CooktopBlock extends FurnitureHorizontalBlock {
    public CooktopBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(0, 0, 1, 16, 0.2, 15);
            case SOUTH -> Block.box(0, 0, 1, 16, 0.2, 15);
            case EAST -> Block.box(1, 0, 0, 15, 0.2, 16);
            case WEST -> Block.box(1, 0, 0, 15, 0.2, 16);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}
