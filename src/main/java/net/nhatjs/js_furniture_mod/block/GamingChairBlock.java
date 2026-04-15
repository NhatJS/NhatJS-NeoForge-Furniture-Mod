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

public class GamingChairBlock extends FurnitureHorizontalBlock {
    public GamingChairBlock(Properties settings) {
        super(settings);
    }

    private static final VoxelShape DEFAULT = Shapes.or(
            box(2, 0, 2.1, 14, 2.7, 13.9),
            box(6.5, 2.7, 6.5, 9.5, 8.5, 9.5)
    );

    private static final VoxelShape NORTH = Shapes.or(
            box(4.45, 8.5, 2.4, 11.55, 10, 13.3),
            box(2, 10, 12.35, 14, 28.2, 13.3),
            box(2.8, 8.5, 2.4, 4.45, 11.35, 13.3),
            box(11.55, 8.5, 2.4, 13.2, 11.35, 13.3),
            box(13.05, 14.85, 2.8, 15.1, 15.35, 9.2),
            box(0.9, 14.85, 2.8, 2.953, 15.35, 9.2),
            box(1.55, 8.1, 5.1, 2.3, 14.85, 6.8),
            box(13.7, 8.1, 5.1, 14.45, 14.85, 6.8),
            box(2.3, 8.1, 5.6, 13.7, 8.5, 6.3)
    );

    private static final VoxelShape SOUTH = Shapes.or(
            box(4.45, 8.5, 2.7, 11.55, 10, 13.6),
            box(2, 10, 2.7, 14, 28.2, 3.65),
            box(11.55, 8.5, 2.7, 13.2, 11.35, 13.6),
            box(2.6, 8.5, 2.7, 4.45, 11.35, 13.6),
            box(0.9, 14.85, 6.8, 2.95, 15.35, 13.2),
            box(13.05, 14.85, 6.8, 15.1, 15.35, 13.2),
            box(13.7, 8.1, 9.2, 14.45, 14.85, 10.9),
            box(1.55, 8.1, 9.2, 2.3, 14.85, 10.9),
            box(2.3, 8.1, 9.7, 13.7, 8.5, 10.4)
    );

    private static final VoxelShape EAST = Shapes.or(
            box(2.7, 8.5, 4.45, 13.6, 10, 11.55),
            box(2.7, 10, 2, 3.65, 28.2, 14),
            box(2.7, 8.5, 2.8, 13.6, 11.35, 4.45),
            box(2.7, 8.5, 11.55, 13.6, 11.35, 13.2),
            box(6.8, 14.85, 13.05, 13.2, 15.35, 15.1),
            box(6.8, 14.85, 0.9, 13.2, 15.35, 2.95),
            box(9.2, 8.1, 1.55, 10.9, 14.85, 2.3),
            box(9.2, 8.1, 13.7, 10.9, 14.85, 14.45),
            box(9.7, 8.1, 2.3, 10.4, 8.5, 13.7)
    );

    private static final VoxelShape WEST = Shapes.or(
            box(2.4, 8.5, 4.45, 13.3, 10, 11.55),
            box(12.35, 10, 2, 13.3, 28.2, 14),
            box(2.4, 8.5, 11.55, 13.3, 11.35, 13.2),
            box(2.4, 8.5, 2.6, 13.3, 11.35, 4.45),
            box(2.6, 14.85, 0.9, 9.2, 15.35, 2.95),
            box(2.6, 14.85, 13.05, 9.2, 15.35, 15.1),
            box(5.1, 8.1, 13.7, 6.8, 14.85, 14.45),
            box(5.1, 8.1, 1.55, 6.8, 14.85, 2.3),
            box(5.6, 8.1, 2.3, 6.3, 8.5, 13.7)
    );

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Shapes.or(DEFAULT, NORTH);
            case SOUTH -> Shapes.or(DEFAULT, SOUTH);
            case EAST -> Shapes.or(DEFAULT, EAST);
            case WEST -> Shapes.or(DEFAULT, WEST);
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
                entity = ModEntities.GAMING_CHAIR.get().spawn((ServerLevel) level, pos, MobSpawnType.TRIGGERED);
            } else {
                entity = entities.get(0);
            }

            player.startRiding(entity);
        }
        return InteractionResult.SUCCESS;
    }
}
