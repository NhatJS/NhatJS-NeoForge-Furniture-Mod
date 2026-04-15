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
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureModClient;
import net.nhatjs.js_furniture_mod.block.DesktopBlock;
import net.nhatjs.js_furniture_mod.blockentity.DesktopBlockEntity;
import net.nhatjs.js_furniture_mod.core.ModBlocks;

public class DesktopRenderer implements BlockEntityRenderer<DesktopBlockEntity> {
    private final Minecraft mc = Minecraft.getInstance();
    private final BakedModel pcEmissive;
    private final BakedModel pcRGB1Emissive;

    public DesktopRenderer(BlockEntityRendererProvider.Context ctx) {
        pcEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.PC_EMISSIVE);
        pcRGB1Emissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.PC_RGB1_EMISSIVE);
    }

    @Override
    public void render(DesktopBlockEntity entity, float tickDelta, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay) {
        Level level = entity.getLevel();
        if (level == null) return;

        BlockPos pos = entity.getBlockPos();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        BlockState state = entity.getBlockState();
        float rotation = switch (state.getValue(DesktopBlock.FACING)) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };
        boolean powered = entity.isPowered();
        ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
        VertexConsumer vc = vertexConsumers.getBuffer(RenderType.CUTOUT);
        Block blockState = (level.getBlockState(BlockPos.containing(x, y, z))).getBlock();

        matrices.pushPose();
        matrices.translate(0.5, 0.5, 0.5);
        matrices.mulPose(Axis.YP.rotationDegrees(rotation));
        matrices.translate(-0.5, -0.5, -0.5);
        if (powered) {
            if (blockState == ModBlocks.PC.get()) {
                bmr.renderModel(matrices.last(), vc, state, pcEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
            else if (blockState == ModBlocks.PC_RGB1_OFF.get()) {
                bmr.renderModel(matrices.last(), vc, state, pcRGB1Emissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
        }
        matrices.popPose();
    }
}
