package net.heyt3ch.t3chsmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.heyt3ch.t3chsmod.block.ModdedBlocks;
import net.minecraft.client.render.RenderLayer;

public class T3CHsModClient implements ClientModInitializer
{

    @Override
    public void onInitializeClient()
    {
        BlockRenderLayerMap.INSTANCE.putBlock(ModdedBlocks.SAND_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModdedBlocks.RED_SAND_GRASS, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModdedBlocks.HALITE_INFUSED_GLASS, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModdedBlocks.HALITE_INFUSED_BEACON, RenderLayer.getTranslucent());
    }
}
