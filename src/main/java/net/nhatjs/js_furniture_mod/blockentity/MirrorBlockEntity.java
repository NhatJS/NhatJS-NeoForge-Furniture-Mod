package net.nhatjs.js_furniture_mod.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.nhatjs.js_furniture_mod.core.ModBlockEntities;
import org.jetbrains.annotations.Nullable;

public class MirrorBlockEntity extends BlockEntity {
    private boolean stand;

    public MirrorBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.MIRROR.get(), pos, state);
    }

    public boolean makeStand() { return stand; }

    public void setStand(boolean s) {
        if (stand == s) return;
        stand = s;
        setChanged();
        sync();
    }

    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        tag.putBoolean("stand", stand);
    }

    @Override
    protected void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        stand = tag.getBoolean("stand");
    }

    private void sync() {
        if (level instanceof ServerLevel serverWorld) {
            serverWorld.getChunkSource().blockChanged(worldPosition);
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), Block.UPDATE_ALL);
        }
    }

    @Override
    public @Nullable Packet<ClientGamePacketListener> getUpdatePacket() {
        return ClientboundBlockEntityDataPacket.create(this);
    }

    @Override
    public CompoundTag getUpdateTag(HolderLookup.Provider registries) {
        return saveWithoutMetadata(registries);
    }
}
