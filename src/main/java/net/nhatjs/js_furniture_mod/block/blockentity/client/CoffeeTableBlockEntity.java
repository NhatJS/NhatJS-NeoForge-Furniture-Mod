package net.nhatjs.js_furniture_mod.block.blockentity.client;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.network.protocol.game.ClientGamePacketListener;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.ValueInput;
import net.minecraft.world.level.storage.ValueOutput;
import net.nhatjs.js_furniture_mod.block.CoffeeTableBlock;
import net.nhatjs.js_furniture_mod.block.blockentity.ModBlockEntities;

public class CoffeeTableBlockEntity extends BlockEntity {
    private ItemStack stack = ItemStack.EMPTY;
    private int renderNonce = 0;

    public CoffeeTableBlockEntity(BlockPos pos, BlockState s) { super(ModBlockEntities.COFFEE_TABLE.get(), pos, s); }

    public ItemStack getItem() { return stack; }
    public int getRenderNonce() { return renderNonce; }

    public void setItem(ItemStack s) {
        this.stack = (s == null ? ItemStack.EMPTY : s);
        this.renderNonce++;
        setChanged();

        if (level != null && !level.isClientSide()) {
            level.setBlock(getBlockPos(), getBlockState().setValue(CoffeeTableBlock.HAS_ITEM, !stack.isEmpty()), 3);
            ((ServerLevel)level).getChunkSource().blockChanged(getBlockPos());
        }
    }

    @Override protected void saveAdditional(ValueOutput output) {
        super.saveAdditional(output);
        if (!stack.isEmpty()) output.store("it", ItemStack.CODEC, stack);
        output.putInt("rn", renderNonce);
    }

    @Override protected void loadAdditional(ValueInput input) {
        super.loadAdditional(input);
        stack = input.read("it", ItemStack.CODEC).orElse(ItemStack.EMPTY);
        renderNonce = input.getIntOr("rn", 0);
    }

    @Override public Packet<ClientGamePacketListener> getUpdatePacket() { return ClientboundBlockEntityDataPacket.create(this); }
    @Override public CompoundTag getUpdateTag(HolderLookup.Provider register) { return saveWithoutMetadata(register); }
}