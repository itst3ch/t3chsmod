package net.heyt3ch.t3chsmod.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.heyt3ch.t3chsmod.item.ModdedItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModdedLootTableModifiers
{
    private static final Identifier JUNGLE_LEAVES_ID = new Identifier("minecraft", "blocks/jungle_leaves");

    public static void modifyLootTable(){
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(JUNGLE_LEAVES_ID.equals(id)){
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.05f))
                        .with(ItemEntry.builder(ModdedItems.MANGO))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder);
            }


        });
    }
}
