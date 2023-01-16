package net.turtlethefish.regularchef;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.turtlethefish.regularchef.block.ModBlocks;

public class RegularChefClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DILL_CROP, RenderLayer.getCutout());
    }
}
