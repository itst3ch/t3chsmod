package net.heyt3ch.t3chsmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.tag.convention.v1.ConventionalBiomeTags;
import net.heyt3ch.t3chsmod.block.ModdedBlocks;
import net.heyt3ch.t3chsmod.item.ModdedItems;
import net.heyt3ch.t3chsmod.util.ModdedLootTableModifiers;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class T3CHsMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "t3chsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Identifier SAND_GRASS_ID = new Identifier("t3chsmod", "sand_grass");

	@Override
	public void onInitialize()
	{
		ModdedItems.registerModItems();
		ModdedBlocks.registerModBlocks();

		ModdedLootTableModifiers.modifyLootTable();

		BiomeModifications.addFeature(
				BiomeSelectors.tag(ConventionalBiomeTags.DESERT),
				GenerationStep.Feature.VEGETAL_DECORATION,
				RegistryKey.of(RegistryKeys.PLACED_FEATURE, SAND_GRASS_ID));
	}
}