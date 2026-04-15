package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.BlockHitResult;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;
import net.nhatjs.js_furniture_mod.blockentity.DrawerBlockEntity;
import org.jetbrains.annotations.Nullable;

public class ThreeDrawerDresserBlock extends FurnitureHorizontalBlock implements EntityBlock {
    public ThreeDrawerDresserBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DrawerBlockEntity(pos, state);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (!world.isClientSide()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof DrawerBlockEntity drawerBlock) {
                player.openMenu(new SimpleMenuProvider((syncId, playerInventory, player1) ->
                        new ChestMenu(MenuType.GENERIC_9x1, syncId, playerInventory,
                                drawerBlock, 1), Component.translatable("container.js_furniture_mod.drawer")));
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    protected void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean moved) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof DrawerBlockEntity drawerBlock) {
                Containers.dropContents(world, pos, drawerBlock.getItems());
                world.removeBlockEntity(pos);
            }
            super.onRemove(state, world, pos, newState, moved);
        }
    }
}