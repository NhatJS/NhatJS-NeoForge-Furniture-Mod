package net.nhatjs.js_furniture_mod.block.blockentity.client.renderer;

import net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState;
import net.minecraft.client.renderer.item.ItemStackRenderState;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;

public class CoffeeTableRenderState extends BlockEntityRenderState {
    public final ItemStackRenderState itemStackRenderState = new ItemStackRenderState();
    public Level level;
    public BlockPos pos;
    public float yaw;
    public ItemStack stack;
}