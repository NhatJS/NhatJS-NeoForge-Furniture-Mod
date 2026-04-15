package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;

public class FloorStandingSpeakerBlock extends FurnitureHorizontalBlock {
    public FloorStandingSpeakerBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(5.7, 0, 9.4, 10.3, 21.75, 14);
            case SOUTH -> Block.box(5.7, 0, 2, 10.3, 21.75, 6.6);
            case EAST -> Block.box(2, 0, 5.7, 6.6, 21.75, 10.3);
            case WEST -> Block.box(9.4, 0, 5.7, 14, 21.75, 10.3);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}