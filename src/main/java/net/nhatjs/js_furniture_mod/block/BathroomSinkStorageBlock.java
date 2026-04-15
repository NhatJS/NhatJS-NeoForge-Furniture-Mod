package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;

public class BathroomSinkStorageBlock extends FurnitureHorizontalBlock {
    public BathroomSinkStorageBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(2, 5.75, 5.25, 14, 16, 16);
            case SOUTH -> Block.box(2, 5.75, 0, 14, 16, 10.75);
            case EAST -> Block.box(0, 5.75, 2, 10.75, 16, 14);
            case WEST -> Block.box(5.25, 5.75, 2, 16, 16, 14);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}