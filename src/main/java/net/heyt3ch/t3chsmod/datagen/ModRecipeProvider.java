package net.heyt3ch.t3chsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter)
    {
        for(Item item : Registries.ITEM)
        {
            if (Registries.ITEM.getEntry(item).isIn(ModItemTagProvider.ARMOR))
            {
                //create smithing recipe
            }
        }
    }
}
