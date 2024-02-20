package net.heyt3ch.t3chsmod;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.heyt3ch.t3chsmod.datagen.ModBlockTagProvider;
import net.heyt3ch.t3chsmod.datagen.ModItemTagProvider;
import net.heyt3ch.t3chsmod.datagen.ModModelProvider;
import net.heyt3ch.t3chsmod.datagen.ModRecipeProvider;

public class T3CHsModDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModItemTagProvider::new);
        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModRecipeProvider::new);

    }
}
