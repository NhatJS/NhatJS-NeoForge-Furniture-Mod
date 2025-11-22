package net.nhatjs.js_furniture_mod.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.util.StringRepresentable;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntitySpawnReason;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.*;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.nhatjs.js_furniture_mod.entity.ModEntities;
import net.nhatjs.js_furniture_mod.entity.client.SeatBlockEntity;

import java.util.List;

public class SofaBlock extends Block {
    public static final EnumProperty<Direction> FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<Part> PART = EnumProperty.create("part", Part.class);

    private static final MapCodec<SofaBlock> CODEC = RecordCodecBuilder.mapCodec(builder -> {
        return builder.group(DyeColor.CODEC.fieldOf("color").forGetter(block -> {
            return block.color;
        }), propertiesCodec()).apply(builder, SofaBlock::new);
    });

    private final DyeColor color;

    public SofaBlock(DyeColor color, Properties settings)
    {
        super(settings);
        this.color = color;
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH).setValue(PART, Part.SINGLE));
    }

    public DyeColor getColor()
    {
        return this.color;
    }

    @Override
    public MapCodec<SofaBlock> codec()
    {
        return CODEC;
    }

    public enum Part implements StringRepresentable
    {
        SINGLE("single"),
        LEFT("left"),
        RIGHT("right"),
        MIDDLE("middle"),
        CORNER_LEFT("corner_left"),
        CORNER_RIGHT("corner_right");

        private final String name;

        Part(String name)
        {
            this.name = name;
        }

        @Override
        public String getSerializedName()
        {
            return name;
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);
        builder.add(FACING, PART);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        Direction facing = ctx.getHorizontalDirection();
        BlockState state = this.defaultBlockState().setValue(FACING, facing);
        if(state != null)
        {
            return state.setValue(PART, this.getShape(state, ctx.getLevel(), ctx.getClickedPos()));
        }
        return null;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return switch (state.getValue(FACING)) {
            default -> Block.box(0, 0.5, 0, 16, 7.525, 16);
        };
    }

    @Override
    protected BlockState updateShape(BlockState state, LevelReader reader, ScheduledTickAccess access, BlockPos pos, Direction dir, BlockPos neighborPos, BlockState neighborState, RandomSource rand) {
        return state.setValue(PART, this.getShape(state, reader, pos));
    }

    public Part getShape(BlockState state, LevelReader level, BlockPos pos)
    {
        Direction facing = state.getValue(FACING);
        Direction front = this.getSofaState(level, pos, facing.getOpposite());
        if(front != null)
        {
            if(front == facing.getClockWise())
            {
                return Part.CORNER_RIGHT;
            }
            else if(front == facing.getCounterClockWise())
            {
                return Part.CORNER_LEFT;
            }
        }
        boolean left = this.isConnectable(level, pos, facing, facing.getCounterClockWise());
        boolean right = this.isConnectable(level, pos, facing, facing.getClockWise());
        if(left && right)
        {
            return Part.MIDDLE;
        }
        else if(left)
        {
            return Part.RIGHT;
        }
        else if(right)
        {
            return Part.LEFT;
        }
        return Part.SINGLE;
    }

    private Direction getSofaState(LevelReader level, BlockPos pos, Direction side)
    {
        BlockState relativeState = level.getBlockState(pos.relative(side));
        return relativeState.getBlock() instanceof SofaBlock ? relativeState.getValue(FACING) : null;
    }

    private boolean isConnectable(LevelReader level, BlockPos pos, Direction facing, Direction offset)
    {
        BlockPos relativePos = pos.relative(offset);
        BlockState relativeState = level.getBlockState(pos.relative(offset));
        if(relativeState.getBlock() instanceof SofaBlock)
        {
            Direction other = relativeState.getValue(FACING);
            return other == facing || other == offset;
        }
        return relativeState.isFaceSturdy(level, relativePos, offset.getOpposite());
    }

    @Override
    public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
        if (!level.isClientSide()) {
            Entity entity = null;
            List<SeatBlockEntity> entities = level.getEntities(ModEntities.SOFA.get(), new AABB(pos), seatBlockEntity -> true);
            if(entities.isEmpty()) {
                entity = ModEntities.SOFA.get().spawn((ServerLevel) level, pos, EntitySpawnReason.TRIGGERED);
            } else {
                entity = entities.get(0);
            }

            player.startRiding(entity);
        }
        return InteractionResult.SUCCESS;
    }
}