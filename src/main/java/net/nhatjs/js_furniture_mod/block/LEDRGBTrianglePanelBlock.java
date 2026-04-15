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
import net.nhatjs.js_furniture_mod.blockentity.LampBlockEntity;
import org.jetbrains.annotations.Nullable;

public class LEDRGBTrianglePanelBlock extends FurnitureHorizontalBlock implements EntityBlock {
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");

    public LEDRGBTrianglePanelBlock(Properties settings) {
        super(settings.lightLevel(st -> st.getValue(TURN_ON) ? 12 : 0));
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TURN_ON, false));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(0, 0, 15.5, 16, 16, 16);
            case SOUTH -> Block.box(0, 0, 0, 16, 16, 0.5);
            case EAST -> Block.box(0, 0, 0, 0.5, 16, 16);
            case WEST -> Block.box(15.5, 0, 0, 16, 16, 16);
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TURN_ON);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new LampBlockEntity(pos, state);
    }

    @Override
    protected RenderShape getRenderShape(BlockState state) {
        return RenderShape.MODEL;
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (!level.isClientSide()) {
            boolean current = state.getValue(TURN_ON);
            level.setBlock(pos, state.setValue(TURN_ON, !current), Block.UPDATE_ALL);
            BlockEntity entity = level.getBlockEntity(pos);
            if (!(entity instanceof LampBlockEntity panelRGB)) return InteractionResult.PASS;
            panelRGB.setPowered(!panelRGB.isPowered());
            level.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
        }
        return InteractionResult.SUCCESS;
    }
}
