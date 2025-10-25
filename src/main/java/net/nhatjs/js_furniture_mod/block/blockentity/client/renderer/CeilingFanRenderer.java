package net.nhatjs.js_furniture_mod.block.blockentity.client.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.nhatjs.js_furniture_mod.block.blockentity.client.CeilingFanBlockEntity;

import static net.nhatjs.js_furniture_mod.NhatJSFurnitureMod.MOD_ID;

public class CeilingFanRenderer implements BlockEntityRenderer<CeilingFanBlockEntity> {
    private final BakedModel blades;

    public CeilingFanRenderer(BlockEntityRendererProvider.Context ctx) {
        blades = Minecraft.getInstance().getModelManager().getModel(ModelResourceLocation.standalone(
                ResourceLocation.fromNamespaceAndPath(MOD_ID, "block/ceiling_fan_blades")));
    }

    @Override
    public void render(CeilingFanBlockEntity be, float tickDelta,
                       PoseStack ps, MultiBufferSource buf, int light, int overlay) {
        Level level = be.getLevel();
        if (level == null) return;

        Minecraft.getInstance().getBlockRenderer().renderSingleBlock(be.getBlockState(), ps, buf, light, overlay);

        if (blades == null || blades == Minecraft.getInstance().getModelManager().getMissingModel()) {
            return;
        }

        ps.pushPose();
        ps.translate(0.5, 0.9375, 0.5);
        ps.mulPose(Axis.YP.rotationDegrees(be.getAngle(tickDelta)));

        float blur = Math.min(be.speed / 27f, 1f);
        float alpha = 1.0f - (blur * 0.4f);
        ps.translate(-0.5, -0.9375, -0.5);

        VertexConsumer vc = buf.getBuffer(RenderType.cutoutMipped());
        Minecraft.getInstance().getBlockRenderer().getModelRenderer().renderModel(ps.last(), vc, null, blades, 1,1,1, light, overlay);
        ps.popPose();
    }
}