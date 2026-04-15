package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;
import net.nhatjs.js_furniture_mod.blockentity.WashingMachineBlockEntity;
import org.jetbrains.annotations.Nullable;

public class WashingMachineBlock extends FurnitureHorizontalBlock implements EntityBlock {
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");

    public WashingMachineBlock(Properties settings) {
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
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> box(0, 0, 0, 16, 23, 16);
        };
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new WashingMachineBlockEntity(pos, state);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (player.isShiftKeyDown()) {
            boolean current = state.getValue(TURN_ON);
            level.setBlock(pos, state.setValue(TURN_ON, !current), Block.UPDATE_ALL);
        }
        else {
            BlockEntity entity = level.getBlockEntity(pos);
            if (!(entity instanceof WashingMachineBlockEntity light)) return InteractionResult.PASS;
            light.setPowered(!light.isPowered());
            level.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
        }
        return InteractionResult.SUCCESS;
    }
}
