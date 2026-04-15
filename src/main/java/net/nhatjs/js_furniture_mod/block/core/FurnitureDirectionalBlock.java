package net.nhatjs.js_furniture_mod.block.core;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.state.BlockState;

public class FurnitureDirectionalBlock extends DirectionalBlock {
    public static MapCodec<FurnitureDirectionalBlock> CODEC = simpleCodec(FurnitureDirectionalBlock::new);

    public FurnitureDirectionalBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends DirectionalBlock> codec() {
        return CODEC;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getNearestLookingDirection().getOpposite());
    }
}
