package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.BlockHitResult;
import net.nhatjs.js_furniture_mod.block.core.PCHorizontalBlock;
import net.nhatjs.js_furniture_mod.blockentity.DesktopBlockEntity;
import net.nhatjs.js_furniture_mod.core.ModBlocks;
import net.nhatjs.js_furniture_mod.core.ModItems;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class DesktopBlock extends PCHorizontalBlock implements EntityBlock {
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");

    public DesktopBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TURN_ON, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TURN_ON);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new DesktopBlockEntity(pos, state);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                   Player player, BlockHitResult hit) {
        if (level.isClientSide()) return InteractionResult.SUCCESS;
        ItemStack held = player.getMainHandItem();
        boolean turnOn = state.getValue(TURN_ON);
        BlockEntity entity = level.getBlockEntity(pos);
        if (!(entity instanceof DesktopBlockEntity pc)) return InteractionResult.PASS;

        if (!held.is(ModItems.REMOTE_CONTROL_RGB)) {
            boolean current = state.getValue(TURN_ON);
            level.setBlock(pos, state.setValue(TURN_ON, !current), Block.UPDATE_ALL);
            pc.setPowered(!pc.isPowered());
            level.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
        }

        if (held.is(ModItems.REMOTE_CONTROL_RGB)) {
            Direction facing =  state.getValue(HorizontalDirectionalBlock.FACING);
            boolean wasPowered = pc.isPowered();
            pc.setPowered(pc.isPowered());
            BlockState newState = ModBlocks.PC_RGB1_OFF.get().defaultBlockState()
                    .setValue(HorizontalDirectionalBlock.FACING, facing)
                    .setValue(DesktopAltBlock.TURN_ON, turnOn);
            level.setBlock(pos, newState, Block.UPDATE_ALL);
            BlockEntity newEntity = level.getBlockEntity(pos);
            if (newEntity instanceof DesktopBlockEntity newPc) {
                newPc.setPowered(wasPowered);
            }
        }
        return InteractionResult.SUCCESS;
    }

    @Override
    public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
        return Collections.singletonList(new ItemStack(ModBlocks.PC));
    }
}
