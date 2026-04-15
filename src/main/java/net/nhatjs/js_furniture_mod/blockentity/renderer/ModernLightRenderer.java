package net.nhatjs.js_furniture_mod.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.LightTexture;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.core.Direction;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureModClient;
import net.nhatjs.js_furniture_mod.block.ModernLightBlock;
import net.nhatjs.js_furniture_mod.blockentity.LightBlockEntity;

public class ModernLightRenderer implements BlockEntityRenderer<LightBlockEntity> {
    private final Minecraft mc = Minecraft.getInstance();
    private final BakedModel modernLightEmissive;

    public ModernLightRenderer(BlockEntityRendererProvider.Context ctx) {
        modernLightEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.MODERN_LIGHT_EMISSIVE);
    }

    @Override
    public void render(LightBlockEntity entity, float tickDelta, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay) {
        Level level = entity.getLevel();
        if (level == null) return;

        BlockState state = entity.getBlockState();
        Direction f = state.getValue(ModernLightBlock.FACING);
        float yaw = 0f;
        float pitch = 0f;
        switch (f) {
            default -> yaw = 0f;
            case SOUTH -> yaw = 180f;
            case WEST -> yaw = 90f;
            case EAST -> yaw = 270f;
            case UP -> pitch = 90f;
            case DOWN -> pitch = -90f;
        }
        boolean powered = entity.isPowered();
        ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
        VertexConsumer vc = vertexConsumers.getBuffer(RenderType.CUTOUT);

        if (powered) {
            matrices.pushPose();
            matrices.translate(0.5, 0.5, 0.5);
            matrices.mulPose(Axis.XP.rotationDegrees(pitch));
            matrices.mulPose(Axis.YP.rotationDegrees(yaw));
            matrices.translate(-0.5, -0.5, -0.5);
            bmr.renderModel(matrices.last(), vc, state, modernLightEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            matrices.popPose();
        }
    }
}
