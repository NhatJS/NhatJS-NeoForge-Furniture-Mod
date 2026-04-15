package net.nhatjs.js_furniture_mod.block.core;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FurnitureHorizontalBlock extends HorizontalDirectionalBlock {
    public static MapCodec<FurnitureHorizontalBlock> CODEC = simpleCodec(FurnitureHorizontalBlock::new);

    public FurnitureHorizontalBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends HorizontalDirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }
}
