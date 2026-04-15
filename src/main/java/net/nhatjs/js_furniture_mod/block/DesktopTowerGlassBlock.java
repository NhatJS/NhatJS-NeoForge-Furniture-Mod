package net.nhatjs.js_furniture_mod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;

public class DesktopTowerGlassBlock extends FurnitureHorizontalBlock {
    public DesktopTowerGlassBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }
}