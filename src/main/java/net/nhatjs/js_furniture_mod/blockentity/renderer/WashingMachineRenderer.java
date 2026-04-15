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
import net.nhatjs.js_furniture_mod.block.WashingMachineBlock;
import net.nhatjs.js_furniture_mod.blockentity.WashingMachineBlockEntity;

public class WashingMachineRenderer implements BlockEntityRenderer<WashingMachineBlockEntity> {
    private Minecraft mc = Minecraft.getInstance();
    private BakedModel washingMachineScreen;

    public WashingMachineRenderer(BlockEntityRendererProvider.Context ctx) {
        washingMachineScreen = mc.getModelManager().getModel(NhatJSFurnitureModClient.WASHING_MACHINE_AI_SCREEN);
    }

    @Override
    public void render(WashingMachineBlockEntity entity, float tickDelta, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay) {
        Level level = entity.getLevel();
        if (level == null) return;

        BlockState state = entity.getBlockState();
        float rotation = switch (state.getValue(WashingMachineBlock.FACING)) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };
        boolean powered = entity.isPowered();
        ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
        VertexConsumer vc = vertexConsumers.getBuffer(RenderType.CUTOUT);

        matrices.pushPose();
        matrices.translate(0.5, 0.5, 0.5);
        matrices.mulPose(Axis.YP.rotationDegrees(rotation));
        matrices.translate(-0.5, -0.5, -0.5);
        if (powered) {
            bmr.renderModel(matrices.last(), vc, state, washingMachineScreen, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
        }
        matrices.popPose();
    }
}
