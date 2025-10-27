package net.nhatjs.js_furniture_mod.block.blockentity.client.renderer;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;

public class CeilingFanRenderState extends BlockEntityRenderState {
    public float angle;
    public BlockState blockState;
    public BlockPos pos;
    public int light;
    public int overlay;
}