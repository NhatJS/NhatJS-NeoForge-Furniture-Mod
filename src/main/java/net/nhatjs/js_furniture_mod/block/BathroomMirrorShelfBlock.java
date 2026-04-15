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

public class BathroomMirrorShelfBlock extends FurnitureHorizontalBlock {
    public BathroomMirrorShelfBlock(Properties settings) {
        super(settings);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(box(3, 4.65, 14, 13, 5.5, 16), box(3.25, 7, 15.7, 12.75, 19, 16));
            case SOUTH -> Shapes.or(box(3, 4.65, 0, 13, 5.5, 2), box(3.25, 7, 0, 12.75, 19, 0.3));
            case EAST -> Shapes.or(box(0, 4.65, 3, 2, 5.5, 13), box(0, 7, 3.25, 0.3, 19, 12.75));
            case WEST -> Shapes.or(box(14, 4.65, 3, 16, 5.5, 13), box(15.7, 7, 3.25, 16, 19, 12.75));
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}