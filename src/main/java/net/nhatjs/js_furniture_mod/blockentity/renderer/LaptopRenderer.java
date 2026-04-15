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
import net.nhatjs.js_furniture_mod.block.LaptopBlock;
import net.nhatjs.js_furniture_mod.block.PortableLaptopStandAddedBlock;
import net.nhatjs.js_furniture_mod.blockentity.LaptopBlockEntity;
import net.nhatjs.js_furniture_mod.core.ModBlocks;

public class LaptopRenderer implements BlockEntityRenderer<LaptopBlockEntity> {
    private Minecraft mc = Minecraft.getInstance();
    private BakedModel laptopScreen;
    private BakedModel laptopScreenPortable;

    public LaptopRenderer(BlockEntityRendererProvider.Context ctx) {
        laptopScreen = mc.getModelManager().getModel(NhatJSFurnitureModClient.LAPTOP_OPENED_ON_EMISSIVE);
        laptopScreenPortable = mc.getModelManager().getModel(NhatJSFurnitureModClient.LAPTOP_OPENED_ON_PORTABLE_EMISSIVE);
    }

    @Override
    public void render(LaptopBlockEntity entity, float tickDelta, PoseStack matrices,
                       MultiBufferSource vertexConsumers, int light, int overlay) {
        Level level = entity.getLevel();
        if (level == null) return;

        BlockPos pos = entity.getBlockPos();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        BlockState state = entity.getBlockState();
        float rotation = switch (state.getValue(LaptopBlock.FACING)) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };
        float rotationPortable = switch (state.getValue(PortableLaptopStandAddedBlock.FACING)) {
            default -> 0f;
            case SOUTH -> 180f;
            case WEST -> 90f;
            case EAST -> 270f;
        };
        boolean powered = entity.isPowered();
        ModelBlockRenderer bmr = mc.getBlockRenderer().getModelRenderer();
        Block blockState = (level.getBlockState(BlockPos.containing(x, y, z))).getBlock();
        VertexConsumer vc = vertexConsumers.getBuffer(RenderType.CUTOUT);

        matrices.pushPose();
        if (blockState == ModBlocks.LAPTOP.get()) {
            matrices.translate(0.5, 0.5, 0.5);
            matrices.mulPose(Axis.YP.rotationDegrees(rotation));
            matrices.translate(-0.5, -0.5, -0.5);
            if (powered) {
                bmr.renderModel(matrices.last(), vc, state, laptopScreen, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
        }
        else if (blockState == ModBlocks.LAPTOP_CLOSED_PORTABLE_LAPTOP_STAND.get()) {
            matrices.translate(0.5, 0.5, 0.5);
            matrices.mulPose(Axis.YP.rotationDegrees(rotationPortable));
            matrices.translate(-0.5, -0.5, -0.5);
            if (powered) {
                bmr.renderModel(matrices.last(), vc, state, laptopScreenPortable, 1, 1, 1, LightTexture.FULL_BRIGHT, overlay);
            }
        }
        matrices.popPose();
    }
}
