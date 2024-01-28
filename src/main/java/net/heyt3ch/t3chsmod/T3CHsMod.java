package net.heyt3ch.t3chsmod;

import net.fabricmc.api.ModInitializer;

import net.heyt3ch.t3chsmod.item.ModdedItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class T3CHsMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "t3chsmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModdedItems.registerModItems();
	}
}