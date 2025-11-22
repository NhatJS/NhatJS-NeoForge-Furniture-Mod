package net.nhatjs.js_furniture_mod.block.blockentity.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.SubmitNodeCollector;
import net.minecraft.client.renderer.block.model.BlockStateModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.feature.ModelFeatureRenderer;
import net.minecraft.client.renderer.state.CameraRenderState;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureModClient;
import net.nhatjs.js_furniture_mod.block.ModBlocks;
import net.nhatjs.js_furniture_mod.block.blockentity.client.CeilingFanBlockEntity;
import org.jetbrains.annotations.Nullable;

public class CeilingFanRenderer implements BlockEntityRenderer<CeilingFanBlockEntity, CeilingFanRenderState> {

    private final Minecraft mc = Minecraft.getInstance();

    public CeilingFanRenderer(BlockEntityRendererProvider.Context ctx) {
    }

    @Override
    public CeilingFanRenderState createRenderState() {
        return new CeilingFanRenderState();
    }

    @Override
    public void extractRenderState(CeilingFanBlockEntity be,
                                   CeilingFanRenderState state,
                                   float tickDelta, Vec3 cameraPos,
                                   @Nullable ModelFeatureRenderer.CrumblingOverlay crumblingOverlay) {
        BlockEntityRenderer.super.extractRenderState(be, state, tickDelta, cameraPos, crumblingOverlay);

        state.pos = be.getBlockPos();
        state.blockState = be.getBlockState();
        state.angle = be.getAngle(tickDelta);

        Level w = be.getLevel();
        if (w == null || state.blockState == null) {
            state.light = 0;
            state.overlay = OverlayTexture.NO_OVERLAY;
            return;
        }

        state.light = LevelRenderer.getLightColor(w, state.pos);
        state.overlay = OverlayTexture.NO_OVERLAY;
    }

    @Override
    public void submit(CeilingFanRenderState state,
                       PoseStack ps,
                       SubmitNodeCollector queue,
                       CameraRenderState cameraState) {
        if (state.blockState == null || state.pos == null) return;

        BlockStateModel blades_black = mc.getModelManager().getStandaloneModel(NhatJSFurnitureModClient.CEILING_FAN_BLADES_ID);
        BlockStateModel blades_white = mc.getModelManager().getStandaloneModel(NhatJSFurnitureModClient.CEILING_FAN_BLADES_B_ID);
        if (blades_black == null || blades_white == null ||
                blades_black == Minecraft.getInstance().getModelManager().getMissingBlockStateModel() ||
                blades_white == Minecraft.getInstance().getModelManager().getMissingBlockStateModel()) {
            return;
        }

        ps.pushPose();
        try {
            ps.translate(0.5, 0.9375, 0.5);
            ps.mulPose(Axis.YP.rotationDegrees(state.angle));
            ps.translate(-0.5, -0.9375, -0.5);

            CeilingFanBlockEntity be = (CeilingFanBlockEntity) mc.level.getBlockEntity(state.pos);
            float blur = 0f;
            float alpha = 1f;
            if (be != null) {
                blur = Math.min(be.speed / 27f, 1f);
                alpha = 1.0f - (blur * 0.4f);
            }
            if (state.blockState.getBlock() == ModBlocks.CEILING_FAN.get()) {
                queue.submitBlockModel(ps, RenderType.cutoutMipped(), blades_black, 1f, 1f, 1f, state.light,
                        state.overlay, 0);

            }
            else if (state.blockState.getBlock() == ModBlocks.CEILING_FAN_B.get()) {
                queue.submitBlockModel(ps, RenderType.cutoutMipped(), blades_white, 1f, 1f, 1f, state.light,
                        state.overlay, 0);
            }

        } finally {
            ps.popPose();
        }
    }
}