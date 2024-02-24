package net.heyt3ch.t3chsmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.heyt3ch.t3chsmod.item.ModdedItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter)
    {
        for(Item item : Registries.ITEM)
        {
            if (RegistryEntry.of(item).isIn(ModItemTagProvider.ARMOR))
            {
                //create smithing recipe
                String recipeId = "t3chsmod:" + item.toString().toLowerCase() + "_halite_infusion_recipe";
                SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(ModdedItems.HALITE_UPGRADE), Ingredient.ofItems(item), Ingredient.ofItems(ModdedItems.HALITE_CRYSTAL), RecipeCategory.COMBAT, Items.ACACIA_BOAT)
                        .offerTo(exporter, recipeId);
                System.out.println(item); //debug
            }
        }
    }
}
