package net.nhatjs.js_furniture_mod.block.core;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class PCHorizontalBlock extends HorizontalDirectionalBlock {
    public static MapCodec<PCHorizontalBlock> CODEC = simpleCodec(PCHorizontalBlock::new);

    public PCHorizontalBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> box(4, 0, 1.65, 12, 13.5, 14.35);
            case SOUTH -> box(4, 0, 1.65, 12, 13.5, 14.35);
            case EAST -> box(1.65, 0, 4, 14.35, 13.5, 12);
            case WEST -> box(1.65, 0, 4, 14.35, 13.5, 12);
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }
}
