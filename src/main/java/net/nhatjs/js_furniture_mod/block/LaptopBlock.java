package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class LaptopBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");
    public static final BooleanProperty OPEN = BooleanProperty.create("open");

    public LaptopBlock(Properties settings) {
        super(settings.lightLevel(st -> st.getValue(TURN_ON) ? 3 : 0));
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TURN_ON, false)
                .setValue(OPEN, false));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TURN_ON, OPEN);
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(1.975, 0, 3, 14.025, 1.25, 12.25);
            case SOUTH -> Block.box(1.975, 0, 3.75, 14.025, 1.25, 13);
            case EAST -> Block.box(3.75, 0, 1.975, 13, 1.25, 14.025);
            case WEST -> Block.box(3, 0, 1.975, 12.25, 1.25, 14.025);
        };
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return this.defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
                                            Player player, BlockHitResult hit) {
        if (level.isClientSide()) return InteractionResult.SUCCESS;

        boolean open = state.getValue(OPEN);
        boolean turnOn = state.getValue(TURN_ON);

        if (player.isShiftKeyDown()) {
            if (open == false) {
                level.setBlock(pos, state.setValue(OPEN, true), Block.UPDATE_ALL);
                return InteractionResult.CONSUME;
            }
            if (open == true) {
                if (turnOn) return InteractionResult.CONSUME;
                level.setBlock(pos, state.setValue(OPEN, false), Block.UPDATE_ALL);
                return InteractionResult.CONSUME;
            }
            return InteractionResult.CONSUME;
        }

        if (open == true) {
            if (turnOn) {
                level.setBlock(pos, state.setValue(TURN_ON, false), Block.UPDATE_ALL);
            } else {
                level.setBlock(pos, state.setValue(TURN_ON, true), Block.UPDATE_ALL);
                return InteractionResult.CONSUME;
            }
            return InteractionResult.CONSUME;
        }

        return InteractionResult.CONSUME;
    }
}
