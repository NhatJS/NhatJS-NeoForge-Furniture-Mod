package net.nhatjs.js_furniture_mod.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.js_furniture_mod.block.CoffeeTableBlock;
import net.nhatjs.js_furniture_mod.block.ModBlocks;
import net.nhatjs.js_furniture_mod.blockentity.client.CoffeeTableBlockEntity;

import java.util.HashMap;
import java.util.Map;

public class CoffeeTableRenderer implements BlockEntityRenderer<CoffeeTableBlockEntity> {
    public CoffeeTableRenderer(BlockEntityRendererProvider.Context ctx) {}

    private final Map<BlockPos, Integer> lastNonce = new HashMap<>();

    @Override
    public void render(CoffeeTableBlockEntity be, float tickDelta, PoseStack ps,
                       MultiBufferSource buf, int light, int overlay) {
        if (be.isRemoved() || be.getLevel() == null) return;

        BlockState st = be.getBlockState();
        ItemStack stack = be.getItem();
        if (stack.isEmpty()) return;
        if (st.hasProperty(CoffeeTableBlock.HAS_ITEM) &&  !st.getValue(CoffeeTableBlock.HAS_ITEM)) return;

        int now = be.getRenderNonce();
        Integer prev = lastNonce.get(be.getBlockPos());
        if (prev == null || prev != now) {
            lastNonce.put(be.getBlockPos(), now);
            return;
        }

        ps.pushPose();
        ps.translate(0.5, 0.6, 0.5);
        if (st.hasProperty(CoffeeTableBlock.FACING)) {
            Direction facing = st.getValue(CoffeeTableBlock.FACING);
            float rotation = switch (facing) {
                default -> 0f;
                case SOUTH -> 180f;
                case WEST -> 90f;
                case EAST -> 270f;
            };
            ps.mulPose(Axis.YP.rotationDegrees(rotation));
        }
        ps.mulPose(Axis.XP.rotationDegrees(90));
        if (stack.is(ModBlocks.LAPTOP.asItem()) || stack.is(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.asItem())
                || stack.is(ModBlocks.PLANT_POT.asItem()) || stack.is(ModBlocks.PORTABLE_LAPTOP_STAND.asItem())
                || stack.is(ModBlocks.MIDI_STANDALONE_GROOVEBOX.asItem()) || stack.is(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.asItem())
                || stack.is(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.asItem()) || stack.is(ModBlocks.MIDI_KEYBOARD_CONTROLLER.asItem())) {
            ps.scale(1.0f, 1.0f, 1.0f);
        }
        else {
            ps.scale(0.5f, 0.5f, 0.5f);
        }


        Minecraft.getInstance().getItemRenderer()
                .renderStatic(stack, ItemDisplayContext.FIXED, light, overlay, ps, buf, be.getLevel(), 0);
        ps.popPose();
    }
}
