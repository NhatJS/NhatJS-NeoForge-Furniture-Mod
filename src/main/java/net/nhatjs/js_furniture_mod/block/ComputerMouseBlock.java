package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;

public class ComputerMouseBlock extends FurnitureHorizontalBlock {
    public ComputerMouseBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> box(7.35, 0, 6.875, 8.65, 0.725, 9.125);
            case SOUTH -> box(7.35, 0, 6.875, 8.65, 0.725, 9.125);
            case EAST -> box(6.875, 0, 7.35, 9.125, 0.725, 8.65);
            case WEST -> box(6.875, 0, 7.35, 9.125, 0.725, 8.65);
        };
    } 
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}