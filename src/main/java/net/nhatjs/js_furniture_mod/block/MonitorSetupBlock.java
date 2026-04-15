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
import net.nhatjs.js_furniture_mod.blockentity.MonitorBlockEntity;
import org.jetbrains.annotations.Nullable;

public class MonitorSetupBlock extends FurnitureHorizontalBlock implements EntityBlock {
    public static final BooleanProperty TURN_ON = BooleanProperty.create("turn_on");

    public MonitorSetupBlock(Properties settings) {
        super(settings);
        this.registerDefaultState(this.getStateDefinition().any()
                .setValue(FACING, Direction.NORTH)
                .setValue(TURN_ON, false));
    }

    private static VoxelShape NORTH = Shapes.or(
            box(4.1, 0, 9.1, 11.9, 0.75, 15),
            box(6.9, 0.75, 12, 9.1, 10.95, 14.25),
            box(7.15, 7.7, 11.15, 8.85, 8.75, 12),
            box(0.1, 3.525, 9.8, 15.9, 12.475, 11.15),
            box(1.675, 0, 3.375, 2.975, 0.725, 5.625),
            box(4.7, 0, 2.75, 14.625, 0.275, 6.4)
    );

    private static VoxelShape SOUTH = Shapes.or(
            box(4.1, 0, 1, 11.9, 0.75, 6.9),
            box(6.9, 0.75, 1.75, 9.1, 10.95, 4),
            box(7.15, 7.7, 4, 8.85, 8.75, 4.85),
            box(0.1, 3.525, 4.85, 15.9, 12.475, 6.2),
            box(12.975, 0, 10.375, 14.275, 0.725, 12.625),
            box(1.325, 0, 9.6, 11.25, 0.275, 13.25)
    );

    private static VoxelShape EAST = Shapes.or(
            box(1, 0, 4.1, 6.9, 0.75, 11.9),
            box(1.75, 0.75, 6.9, 4, 10.95, 9.1),
            box(4, 7.7, 7.15, 4.85, 8.75, 8.85),
            box(4.85, 3.525, 0.1, 6.2, 12.475, 15.9),
            box(10.35, 0, 1.7, 12.6, 0.725, 3),
            box(9.575, 0, 4.725, 13.225, 0.275, 14.65)
    );

    private static VoxelShape WEST = Shapes.or(
            box(9.1, 0, 4.1, 15, 0.75, 11.9),
            box(12, 0.75, 6.9, 14.25, 10.95, 9.1),
            box(11.15, 7.7, 7.15, 12, 8.75, 8.85),
            box(9.8, 3.525, 0.1, 11.15, 12.475, 15.9),
            box(3.35, 0, 13, 5.6, 0.725, 14.3),
            box(2.725, 0, 1.35, 6.375, 0.275, 11.275)
    );
    
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> NORTH;
            case SOUTH -> SOUTH;
            case EAST -> EAST;
            case WEST -> WEST;
        };
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, TURN_ON);
    }

    @Override
    public @Nullable BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new MonitorBlockEntity(pos, state);
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
            if (!(entity instanceof MonitorBlockEntity monitor)) return InteractionResult.PASS;
            monitor.setPowered(!monitor.isPowered());
            level.sendBlockUpdated(pos, state, state, Block.UPDATE_ALL);
        }
        return InteractionResult.SUCCESS;
    }
}
