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
import net.nhatjs.js_furniture_mod.block.LEDFloorLampBlock;
import net.nhatjs.js_furniture_mod.blockentity.LampBlockEntity;
import net.nhatjs.js_furniture_mod.core.ModBlocks;

public class LampRenderer implements BlockEntityRenderer<LampBlockEntity> {
    private final Minecraft mc = Minecraft.getInstance();
    private final BakedModel ledFloorLampOnEmissive;
    private final BakedModel ledFloorLampRGBOnEmissive;
    private final BakedModel ledFloorLampRGBOn2Emissive;
    private final BakedModel ledRGBTrianglePanelOnEmissive;
    private final BakedModel studioLightOnEmissive;

    public LampRenderer(BlockEntityRendererProvider.Context ctx) {
        ledFloorLampOnEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.LED_FLOOR_LAMP_ON_EMISSIVE);
        ledFloorLampRGBOnEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.LED_FLOOR_LAMP_RGB_ON_EMISSIVE);
        ledFloorLampRGBOn2Emissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.LED_FLOOR_LAMP_RGB_ON_2_EMISSIVE);
        ledRGBTrianglePanelOnEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.LED_RGB_TRIANGLE_PANEL_ON_EMISSIVE);
        studioLightOnEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.STUDIO_LIGHT_ON_EMISSIVE);
    }

    @Override
    public void render(LampBlockEntity entity, float tickDelta, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay) {
        Level level = entity.getLevel();
        if (level == null) return;

        BlockPos pos = entity.getBlockPos();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        Block blockState = (level.getBlockState(BlockPos.containing(x, y, z))).getBlock();

        BlockState state = entity.getBlockState();
        float rotation = switch (state.getValue(LEDFloorLampBlock.FACING)) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };
        ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
        boolean powered = entity.isPowered();
        VertexConsumer vc = vertexConsumers.getBuffer(RenderType.CUTOUT);

        matrices.pushPose();
        matrices.translate(0.5, 0, 0.5);
        matrices.mulPose(Axis.YP.rotationDegrees(rotation));
        matrices.translate(-0.5, 0, -0.5);
        if (powered) {
            if (blockState == ModBlocks.LED_FLOOR_LAMP.get()) {
                bmr.renderModel(matrices.last(), vc, state, ledFloorLampOnEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
            else if (blockState == ModBlocks.LED_FLOOR_LAMP_RGB_OFF.get()) {
                bmr.renderModel(matrices.last(), vc, state, ledFloorLampRGBOnEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
            else if (blockState == ModBlocks.LED_FLOOR_LAMP_RGB_OFF_2.get()) {
                bmr.renderModel(matrices.last(), vc, state, ledFloorLampRGBOn2Emissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
            else if (blockState == ModBlocks.LED_RGB_TRIANGLE_PANEL.get()) {
                bmr.renderModel(matrices.last(), vc, state, ledRGBTrianglePanelOnEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
            else if (blockState == ModBlocks.STUDIO_LIGHT.get()) {
                bmr.renderModel(matrices.last(), vc, state, studioLightOnEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
        }
        matrices.popPose();
    }
}
