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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureModClient;
import net.nhatjs.js_furniture_mod.block.MonitorSetupBlock;
import net.nhatjs.js_furniture_mod.blockentity.MonitorBlockEntity;

public class MonitorSetupRenderer implements BlockEntityRenderer<MonitorBlockEntity> {
    private final Minecraft mc = Minecraft.getInstance();
    private final BakedModel monitorScreenBack1;
    private final BakedModel monitorScreenBack2;
    private final BakedModel monitorScreenBack3;
    private final BakedModel monitorScreenBack4;
    private final BakedModel monitorStandMainCenter;
    private final BakedModel monitorStandMainLeft;
    private final BakedModel monitorStandMainRight;
    private final BakedModel monitorStandPart1;
    private final BakedModel monitorStandPart2;
    private final BakedModel monitorStandPart3;
    private final BakedModel monitorStandPart4;
    private final BakedModel monitorStandPart5;
    private final BakedModel monitorStandPart6;
    private final BakedModel monitorStandPart7;
    private final BakedModel monitorStandPart8;
    private final BakedModel monitorStandPart9;
    private final BakedModel monitorArmPart1;
    private final BakedModel monitorArmPart2;
    private final BakedModel monitorArmPart3;
    private final BakedModel monitorArmPart4a;
    private final BakedModel monitorArmPart4b;
    private final BakedModel monitorArmPart5a;
    private final BakedModel monitorArmPart5b;
    private final BakedModel monitorArmPart6a;
    private final BakedModel monitorArmPart6b;
    private final BakedModel monitorArmPart7a;
    private final BakedModel monitorArmPart7b;
    private final BakedModel monitorArmPart8;
    private final BakedModel monitorArmPart9;
    private final BakedModel monitorSetupOnEmissive;

    public MonitorSetupRenderer(BlockEntityRendererProvider.Context ctx) {
        monitorScreenBack1 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_SCREEN_BACK_1);
        monitorScreenBack2 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_SCREEN_BACK_2);
        monitorScreenBack3 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_SCREEN_BACK_3);
        monitorScreenBack4 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_SCREEN_BACK_4);
        monitorStandMainCenter = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_MAIN_CENTER);
        monitorStandMainLeft = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_MAIN_LEFT);
        monitorStandMainRight = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_MAIN_RIGHT);
        monitorStandPart1 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_PART_1);
        monitorStandPart2 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_PART_2);
        monitorStandPart3 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_PART_3);
        monitorStandPart4 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_PART_4);
        monitorStandPart5 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_PART_5);
        monitorStandPart6 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_PART_6);
        monitorStandPart7 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_PART_7);
        monitorStandPart8 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_PART_8);
        monitorStandPart9 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_STAND_PART_9);
        monitorArmPart1 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_1);
        monitorArmPart2 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_2);
        monitorArmPart3 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_3);
        monitorArmPart4a = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_4A);
        monitorArmPart4b = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_4B);
        monitorArmPart5a = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_5A);
        monitorArmPart5b = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_5B);
        monitorArmPart6a = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_6A);
        monitorArmPart6b = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_6B);
        monitorArmPart7a = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_7A);
        monitorArmPart7b = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_7B);
        monitorArmPart8 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_8);
        monitorArmPart9 = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_ARM_PART_9);
        monitorSetupOnEmissive = mc.getModelManager().getModel(NhatJSFurnitureModClient.MONITOR_SETUP_ON_EMISSIVE);
    }

    @Override
    public void render(MonitorBlockEntity entity, float tickDelta, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay) {
        Level level = entity.getLevel();
        if (level == null) return;

        BlockState state = entity.getBlockState();
        float rotation = switch (state.getValue(MonitorSetupBlock.FACING)) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };
        ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
        VertexConsumer vc = vertexConsumers.getBuffer(RenderType.CUTOUT);
        boolean powered = entity.isPowered();

        matrices.pushPose();
        matrices.translate(0.5, 0, 0.5);
        matrices.mulPose(Axis.YP.rotationDegrees(rotation));
        matrices.translate(-0.5, 0, -0.5);

        matrices.pushPose();
        matrices.translate(0.1076, 0.72, 0.6715);
        matrices.mulPose(Axis.YP.rotationDegrees(-13.82865097f));
        matrices.translate(-0.5, -0.5, -0.5);
        bmr.tesselateWithAO(level, monitorScreenBack1, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.8924, 0.72, 0.6715);
        matrices.mulPose(Axis.YP.rotationDegrees(13.82865097f));
        matrices.translate(-0.5, -0.5, -0.5);
        bmr.tesselateWithAO(level, monitorScreenBack2, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(-0.0245, 0.69, 0.67);
        matrices.mulPose(Axis.ZP.rotationDegrees(34.75f));
        matrices.translate(-0.5, -0.5, -0.5);
        bmr.tesselateWithAO(level, monitorScreenBack3, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(1.0245, 0.69, 0.67);
        matrices.mulPose(Axis.ZP.rotationDegrees(-34.75f));
        matrices.translate(-0.5, -0.5, -0.5);
        bmr.tesselateWithAO(level, monitorScreenBack4, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.5, 0.532, 0.715);
        matrices.mulPose(Axis.XP.rotationDegrees(-4.25f));
        matrices.translate(-0.5, -0.5, -0.5);
        bmr.tesselateWithAO(level, monitorStandMainCenter, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.697, 0.022, 0.754);
        matrices.mulPose(Axis.XP.rotationDegrees(-4.1718f));
        matrices.mulPose(Axis.YP.rotationDegrees(1.4675f));
        matrices.mulPose(Axis.ZP.rotationDegrees(-28.1664f));
        matrices.translate(-0.5, -0, -0.5);
        bmr.tesselateWithAO(level, monitorStandMainLeft, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.303, 0.022, 0.754);
        matrices.mulPose(Axis.XP.rotationDegrees(-4.1718f));
        matrices.mulPose(Axis.YP.rotationDegrees(-1.4675f));
        matrices.mulPose(Axis.ZP.rotationDegrees(28.1664f));
        matrices.translate(-0.5, -0, -0.5);
        bmr.tesselateWithAO(level, monitorStandMainRight, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.5, 0.37, 0.932);
        matrices.mulPose(Axis.XP.rotationDegrees(44));
        matrices.translate(-0.5, -0.5, -0.5);
        bmr.tesselateWithAO(level, monitorStandPart1, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.416, 0, 0.88);
        matrices.mulPose(Axis.XP.rotationDegrees(46f));
        matrices.mulPose(Axis.YP.rotationDegrees(-3.75f));
        matrices.mulPose(Axis.ZP.rotationDegrees(3.75f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorStandPart2, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.584, 0, 0.88);
        matrices.mulPose(Axis.XP.rotationDegrees(46f));
        matrices.mulPose(Axis.YP.rotationDegrees(3.75f));
        matrices.mulPose(Axis.ZP.rotationDegrees(-3.75f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorStandPart3, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.688, 0.008, 0.7335);
        matrices.mulPose(Axis.ZP.rotationDegrees(13.748f));
        matrices.mulPose(Axis.YP.rotationDegrees(0.9713f));
        matrices.mulPose(Axis.XP.rotationDegrees(0.2377f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorStandPart4, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.312, 0.008, 0.7335);
        matrices.mulPose(Axis.ZP.rotationDegrees(-13.748f));
        matrices.mulPose(Axis.YP.rotationDegrees(-0.9713f));
        matrices.mulPose(Axis.XP.rotationDegrees(0.2377f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorStandPart5, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.322, 0, 0.856);
        matrices.mulPose(Axis.ZP.rotationDegrees(53.907f));
        matrices.mulPose(Axis.YP.rotationDegrees(30.284f));
        matrices.mulPose(Axis.XP.rotationDegrees(34.6727f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorStandPart6, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.678, 0, 0.856);
        matrices.mulPose(Axis.ZP.rotationDegrees(-53.907f));
        matrices.mulPose(Axis.YP.rotationDegrees(-30.284f));
        matrices.mulPose(Axis.XP.rotationDegrees(34.6727f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorStandPart7, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.32, 0.0015, 0.707);
        matrices.mulPose(Axis.ZP.rotationDegrees(40.5985f));
        matrices.mulPose(Axis.YP.rotationDegrees(-8.9747f));
        matrices.mulPose(Axis.XP.rotationDegrees(-7.6153f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorStandPart8, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.68, 0.0015, 0.707);
        matrices.mulPose(Axis.ZP.rotationDegrees(-40.5985f));
        matrices.mulPose(Axis.YP.rotationDegrees(8.9747f));
        matrices.mulPose(Axis.XP.rotationDegrees(-7.6153f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorStandPart9, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.5, 0.042, 0.8744);
        matrices.mulPose(Axis.XP.rotationDegrees(1));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart1, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.5, 0.6665, 0.807);
        matrices.mulPose(Axis.XP.rotationDegrees(-29.5f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart2, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.5, 0.034, 0.75);
        matrices.mulPose(Axis.XP.rotationDegrees(2.9f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart3, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.4666, 0.6442, 0.8548);
        matrices.mulPose(Axis.YP.rotationDegrees(-12.5f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart4a, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.5334, 0.6442, 0.8548);
        matrices.mulPose(Axis.YP.rotationDegrees(12.5f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart4b, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.4673, 0.6442, 0.807);
        matrices.mulPose(Axis.YP.rotationDegrees(10f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart5a, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.5327, 0.6442, 0.807);
        matrices.mulPose(Axis.YP.rotationDegrees(-10f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart5b, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.4469, 0.036, 0.8468);
        matrices.mulPose(Axis.ZP.rotationDegrees(-2.4127f));
        matrices.mulPose(Axis.YP.rotationDegrees(-67.4789f));
        matrices.mulPose(Axis.XP.rotationDegrees(2.6116f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart6a, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.5531, 0.036, 0.8468);
        matrices.mulPose(Axis.ZP.rotationDegrees(2.4127f));
        matrices.mulPose(Axis.YP.rotationDegrees(67.4789f));
        matrices.mulPose(Axis.XP.rotationDegrees(2.6116f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart6b, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.448, 0.03, 0.7835);
        matrices.mulPose(Axis.ZP.rotationDegrees(4.3459f));
        matrices.mulPose(Axis.YP.rotationDegrees(67.4359f));
        matrices.mulPose(Axis.XP.rotationDegrees(5.0757f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart7a, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.552, 0.03, 0.7835);
        matrices.mulPose(Axis.ZP.rotationDegrees(-4.3459f));
        matrices.mulPose(Axis.YP.rotationDegrees(-67.4359f));
        matrices.mulPose(Axis.XP.rotationDegrees(5.0757f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart7b, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.5, 0.656, 0.8332);
        matrices.mulPose(Axis.XP.rotationDegrees(-9f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart8, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        matrices.pushPose();
        matrices.translate(0.5, 0.3597, 0.7673);
        matrices.mulPose(Axis.XP.rotationDegrees(3.9603f));
        matrices.translate(-0.5, 0, -0.5);
        bmr.tesselateWithAO(level, monitorArmPart9, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        matrices.popPose();

        if (powered) {
            matrices.pushPose();
            matrices.translate(0.5, 0, 0.5);
            matrices.translate(-0.5, 0, -0.5);
            bmr.renderModel(matrices.last(), vc, state, monitorSetupOnEmissive, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            matrices.popPose();
        }
        matrices.popPose();
    }
}
