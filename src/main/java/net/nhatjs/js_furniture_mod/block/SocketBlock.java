package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureDirectionalBlock;

public class SocketBlock extends FurnitureDirectionalBlock {
    public SocketBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(6, 5, 15.75, 10, 11, 16);
            case SOUTH -> Block.box(6, 5, 0, 10, 11, 0.25);
            case EAST -> Block.box(0, 5, 6, 0.25, 11, 10);
            case WEST -> Block.box(15.75, 5, 6, 16, 11, 10);
            case UP -> Block.box(6, 0, 5, 10, 0.25, 11);
            case DOWN -> Block.box(6, 15.75, 5, 10, 16, 11);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}