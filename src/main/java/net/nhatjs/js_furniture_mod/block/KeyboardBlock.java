package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;

public class KeyboardBlock extends FurnitureHorizontalBlock {
    public KeyboardBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> box(3.0375, 0, 6.175, 12.9625, 0.275, 9.825);
            case SOUTH -> box(3.0375, 0, 6.175, 12.9625, 0.275, 9.825);
            case EAST -> box(6.175, 0, 3.0375, 9.825, 0.275, 12.9625);
            case WEST -> box(6.175, 0, 3.0375, 9.825, 0.275, 12.9625);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}