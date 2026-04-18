package org.bowserfartgif.cugmod.content.swine;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.state.BlockState;
import org.bowserfartgif.cugmod.registry.DoodooBlocks;
import org.jetbrains.annotations.Nullable;

public class WretchedSwineBlockItem extends BlockItem {
    
    private final WretchedSwineBlock.Mood mood;
    
    public WretchedSwineBlockItem(Properties properties, WretchedSwineBlock.Mood mood) {
        super(DoodooBlocks.SWINE.get(), properties);
        this.mood = mood;
    }
    
    @Nullable
    @Override
    protected BlockState getPlacementState(BlockPlaceContext context) {
        BlockState state = super.getPlacementState(context);
        if (state == null) {
            return null;
        }
        return state.setValue(WretchedSwineBlock.MOOD, this.mood);
    }
}
