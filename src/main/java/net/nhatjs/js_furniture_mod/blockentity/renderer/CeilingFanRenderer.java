package net.nhatjs.js_furniture_mod.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BlockStateModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.nhatjs.js_furniture_mod.NhatJSFurnitureModClient;
import net.nhatjs.js_furniture_mod.block.ModBlocks;
import net.nhatjs.js_furniture_mod.blockentity.client.CeilingFanBlockEntity;

public class CeilingFanRenderer implements BlockEntityRenderer<CeilingFanBlockEntity> {
    private final BlockStateModel blades_black;
    private final BlockStateModel blades_white;

    public CeilingFanRenderer(BlockEntityRendererProvider.Context ctx) {
        blades_black = Minecraft.getInstance().getModelManager().getStandaloneModel(
                NhatJSFurnitureModClient.CEILING_FAN_BLADES_ID);
        blades_white = Minecraft.getInstance().getModelManager().getStandaloneModel(
                NhatJSFurnitureModClient.CEILING_FAN_BLADES_B_ID);
    }

    @Override
    public void render(CeilingFanBlockEntity be, float tickDelta,
                       PoseStack ps, MultiBufferSource buf, int light, int overlay, Vec3 vec3) {
        Level level = be.getLevel();
        if (level == null) return;

        BlockPos pos = be.getBlockPos();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        //Minecraft.getInstance().getBlockRenderer().renderSingleBlock(be.getBlockState(), ps, buf, light, overlay);

        if (blades_black == null || blades_white == null ||
                blades_black == Minecraft.getInstance().getModelManager().getMissingBlockStateModel() ||
                blades_white == Minecraft.getInstance().getModelManager().getMissingBlockStateModel()) {
            return;
        }

        ps.pushPose();
        ps.translate(0.5, 0.9375, 0.5);
        ps.mulPose(Axis.YP.rotationDegrees(be.getAngle(tickDelta)));

        float blur = Math.min(be.speed / 27f, 1f);
        float alpha = 1.0f - (blur * 0.4f);
        ps.translate(-0.5, -0.9375, -0.5);

        VertexConsumer vc = buf.getBuffer(RenderType.cutoutMipped());
        if ((level.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.CEILING_FAN.get()) {
            Minecraft.getInstance().getBlockRenderer().getModelRenderer().renderModel(
                    ps.last(), vc, blades_black, 1,1,1, light, overlay);

        }
        else if ((level.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ModBlocks.CEILING_FAN_B.get()) {
            Minecraft.getInstance().getBlockRenderer().getModelRenderer().renderModel(
                    ps.last(), vc, blades_white, 1,1,1, light, overlay);
        }
        ps.popPose();
    }
}