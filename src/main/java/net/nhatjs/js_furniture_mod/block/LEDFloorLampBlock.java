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
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;
import net.nhatjs.js_furniture_mod.blockentity.LampBlockEntity;
import org.jetbrains.annotations.Nullable;

public class LEDFloorLampBlock extends FurnitureHorizontalBlock implements EntityBlock {
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");

    public LEDFloorLampBlock(Properties settings) {
        super(settings.lightLevel(st -> st.getValue(TURN_ON) ? 12 : 0));
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TURN_ON, false));
    }

    private static final VoxelShape HORIZONTAL = Shapes.or(
            Block.box(7, 0.5, 7.5, 9, 29.75, 8.5),
            Block.box(5.75, 0, 5.75, 10.25, 0.5, 10.25)
    );

    private static final VoxelShape VERTICAL = Shapes.or(
            Block.box(7.5, 0.5, 7, 8.5, 29.75, 9),
            Block.box(5.75, 0, 5.75, 10.25, 0.5, 10.25)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> HORIZONTAL;
            case SOUTH -> HORIZONTAL;
            case EAST -> VERTICAL;
            case WEST -> VERTICAL;
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
    public InteractionResult useWithoutItem(BlockState state, Level world, BlockPos pos, Player player, BlockHitResult hit) {
        if (!world.isClientSide()) {
            boolean current = state.getValue(TURN_ON);
            world.setBlock(pos, state.setValue(TURN_ON, !current), Block.UPDATE_ALL);
            BlockEntity entity = world.getBlockEntity(pos);
            if (!(entity instanceof LampBlockEntity floorLamp)) return InteractionResult.PASS;
            floorLamp.setPowered(!floorLamp.isPowered());
            world.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
        }
        return InteractionResult.SUCCESS;
    }
}
