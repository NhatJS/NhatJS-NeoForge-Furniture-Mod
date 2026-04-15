package net.nhatjs.js_furniture_mod.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.ModelBlockRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureModClient;
import net.nhatjs.js_furniture_mod.block.BlackMirrorBlock;
import net.nhatjs.js_furniture_mod.blockentity.MirrorBlockEntity;

public class MirrorRenderer implements BlockEntityRenderer<MirrorBlockEntity> {
    private Minecraft mc = Minecraft.getInstance();
    private BakedModel mirror;

    public MirrorRenderer(BlockEntityRendererProvider.Context ctx) {
        mirror = mc.getModelManager().getModel(NhatJSFurnitureModClient.MIRROR_BLACK);
    }

    @Override
    public void render(MirrorBlockEntity entity, float tickDelta, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay) {
        Level level = entity.getLevel();
        if (level == null) return;

        BlockState state = entity.getBlockState();
        float rotation = switch (state.getValue(BlackMirrorBlock.FACING)) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };
        boolean stand = entity.makeStand();
        ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
        VertexConsumer vc = vertexConsumers.getBuffer(RenderType.CUTOUT);

        matrices.pushPose();
        matrices.translate(0.5, 0.5, 0.5);
        matrices.mulPose(Axis.YP.rotationDegrees(rotation));
        matrices.translate(-0.5, -0.5, -0.5);

        matrices.pushPose();
        if (!stand) {
            bmr.tesselateWithAO(level, mirror, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        }
        else if (stand) {
            matrices.translate(0.5, 0.32, 0.2);
            matrices.mulPose(Axis.XP.rotationDegrees(15));
            matrices.translate(-0.5, -0.5, -0.5);
            bmr.tesselateWithAO(level, mirror, state, entity.getBlockPos(), matrices, vc, false, level.random, light, overlay);
        }
        matrices.popPose();
        matrices.popPose();
    }
}
