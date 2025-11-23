package net.nhatjs.js_furniture_mod.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.item.ItemModelResolver;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LightLayer;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.nhatjs.js_furniture_mod.block.CoffeeTableBlock;
import net.nhatjs.js_furniture_mod.block.ModBlocks;
import net.nhatjs.js_furniture_mod.blockentity.client.CoffeeTableBlockEntity;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.Map;

public class CoffeeTableRenderer implements BlockEntityRenderer<CoffeeTableBlockEntity, CoffeeTableRenderState> {
    private final ItemModelResolver itemModelResolver;

    public CoffeeTableRenderer(BlockEntityRendererProvider.Context ctx) {
        itemModelResolver = ctx.itemModelResolver();
    }

    private final Map<BlockPos, Integer> lastNonce = new HashMap<>();

    @Override
    public CoffeeTableRenderState createRenderState() {
        return new CoffeeTableRenderState();
    }

    @Override
    public void extractRenderState(CoffeeTableBlockEntity blockEntity,
                                   CoffeeTableRenderState state,
                                   float tickProgress, Vec3 cameraPos,
                                   @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(blockEntity, state, tickProgress, cameraPos, crumblingOverlay);

        state.pos = blockEntity.getBlockPos();
        state.level = blockEntity.getLevel();
        state.stack = blockEntity.getItem();

        BlockState st = blockEntity.getBlockState();
        Direction f = st.getValue(CoffeeTableBlock.FACING);
        state.yaw = switch (f) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST  -> 90f;
            case EAST  -> 270f;
        };
        ItemStack stack = blockEntity.getItem();
        if (stack.isEmpty()) {
            state.itemStackRenderState.clear();
            return;
        }

        itemModelResolver.updateForTopItem(state.itemStackRenderState,
                blockEntity.getItem(), ItemDisplayContext.FIXED, blockEntity.getLevel(), null, 0);
    }

    @Override
    public void submit(CoffeeTableRenderState state, PoseStack pose, SubmitNodeCollector queue, CameraRenderState cameraState) {
        pose.pushPose();

        pose.translate(0.5f, 0.6f, 0.5f);
        pose.mulPose(Axis.YP.rotationDegrees(state.yaw));
        pose.mulPose(Axis.XP.rotationDegrees(90f));
        if (state.stack.is(ModBlocks.LAPTOP.asItem()) || state.stack.is(ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.asItem())
                || state.stack.is(ModBlocks.PLANT_POT.asItem()) || state.stack.is(ModBlocks.PORTABLE_LAPTOP_STAND.asItem())
                || state.stack.is(ModBlocks.MIDI_STANDALONE_GROOVEBOX.asItem()) || state.stack.is(ModBlocks.MIDI_STANDALONE_GROOVEBOX_2.asItem())
                || state.stack.is(ModBlocks.MIDI_STANDALONE_GROOVEBOX_3.asItem()) || state.stack.is(ModBlocks.MIDI_KEYBOARD_CONTROLLER.asItem())) {
            pose.scale(1.0f, 1.0f, 1.0f);
        }
        else {
            pose.scale(0.5f, 0.5f, 0.5f);
        }

        state.itemStackRenderState.submit(pose, queue, getLightLevel(state.level, state.pos), OverlayTexture.NO_OVERLAY, 0);

        pose.popPose();
    }

    private int getLightLevel(Level level, BlockPos pos) {
        int bLight = level.getBrightness(LightLayer.BLOCK, pos);
        int sLight = level.getBrightness(LightLayer.SKY, pos);
        return LightTexture.pack(bLight, sLight);
    }
}
