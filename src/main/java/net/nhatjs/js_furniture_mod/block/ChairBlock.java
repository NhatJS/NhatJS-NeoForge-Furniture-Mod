package net.nhatjs.js_furniture_mod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.block.core.FurnitureHorizontalBlock;
import net.nhatjs.js_furniture_mod.core.ModEntities;
import net.nhatjs.js_furniture_mod.entity.SeatBlockEntity;

import java.util.List;

public class ChairBlock extends FurnitureHorizontalBlock {
    public ChairBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape NORTH = Shapes.or(
            box(4, 9, 12.5, 12, 11, 14.25),
            box(4, 21.5, 12.75, 12, 23.5, 13.75),
            box(4, 18.5, 12.75, 12, 20.5, 13.75),
            box(4, 15.5, 12.75, 12, 17.5, 13.75),
            box(2.25, 9, 1.75, 13.75, 11, 12.5),
            box(12, 0, 12.5, 13.75, 24, 14.25),
            box(12, 0, 1.75, 13.75, 9, 3.5),
            box(2.5, 6, 3.5, 3.5, 8, 12.5),
            box(12.5, 6, 3.5, 13.5, 8, 12.5),
            box(3.75, 6, 2.25, 12.25, 8, 3.25),
            box(2.25, 0, 1.75, 4, 9, 3.5),
            box(2.25, 0, 12.5, 4, 24, 14.25)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            box(4, 9, 1.75, 12, 11, 3.5),
            box(4, 21.5, 2.25, 12, 23.5, 3.25),
            box(4, 18.5, 2.25, 12, 20.5, 3.25),
            box(4, 15.5, 2.25, 12, 17.5, 3.25),
            box(2.25, 9, 3.5, 13.75, 11, 14.25),
            box(2.25, 0, 1.75, 4, 24, 3.5),
            box(2.25, 0, 12.5, 4, 9, 14.25),
            box(12.5, 6, 3.5, 13.5, 8, 12.5),
            box(2.5, 6, 3.5, 3.5, 8, 12.5),
            box(3.75, 6, 12.75, 12.25, 8, 13.75),
            box(12, 0, 12.5, 13.75, 9, 14.25),
            box(12, 0, 1.75, 13.75, 24, 3.5)
    );

    private static final VoxelShape EAST = Shapes.or(
            box(1.75, 9, 4, 3.5, 11, 12),
            box(2.25, 21.5, 4, 3.25, 23.5, 12),
            box(2.25, 18.5, 4, 3.25, 20.5, 12),
            box(2.25, 15.5, 4, 3.25, 17.5, 12),
            box(3.5, 9, 2.25, 14.25, 11, 13.75),
            box(1.75, 0, 12, 3.5, 24, 13.75),
            box(12.5, 0, 12, 14.25, 9, 13.75),
            box(3.5, 6, 2.5, 12.5, 8, 3.5),
            box(3.5, 6, 12.5, 12.5, 8, 13.5),
            box(12.75, 6, 3.75, 13.75, 8, 12.25),
            box(12.5, 0, 2.25, 14.25, 9, 4),
            box(1.75, 0, 2.25, 3.5, 24, 4)
    );

    private static final VoxelShape WEST = Shapes.or(
            box(12.5, 9, 4, 14.25, 11, 12),
            box(12.75, 21.5, 4, 13.75, 23.5, 12),
            box(12.75, 18.5, 4, 13.75, 20.5, 12),
            box(12.75, 15.5, 4, 13.75, 17.5, 12),
            box(1.75, 9, 2.25, 12.5, 11, 13.75),
            box(12.5, 0, 2.25, 14.25, 24, 4),
            box(1.75, 0, 2.25, 3.5, 9, 4),
            box(3.5, 6, 12.5, 12.5, 8, 13.5),
            box(3.5, 6, 2.5, 12.5, 8, 3.5),
            box(2.25, 6, 3.75, 3.25, 8, 12.25),
            box(1.75, 0, 12, 3.5, 9, 13.75),
            box(12.5, 0, 12, 14.25, 24, 13.75)
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
        builder.add(FACING);
    }

    @Override
    protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (!level.isClientSide()) {
            Entity entity = null;
            List<SeatBlockEntity> entities = level.getEntities(ModEntities.CHAIR.get(), new AABB(pos), seatBlockEntity -> true);
            if(entities.isEmpty()) {
                entity = ModEntities.CHAIR.get().spawn((ServerLevel) level, pos, MobSpawnType.TRIGGERED);
            } else {
                entity = entities.get(0);
            }

            player.startRiding(entity);
        }
        return InteractionResult.SUCCESS;
    }
}
