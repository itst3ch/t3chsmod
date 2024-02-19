package net.heyt3ch.t3chsmod.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.heyt3ch.t3chsmod.item.ModdedItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.context.LootContextParameterSet;
import net.minecraft.loot.context.LootContextParameters;
import net.minecraft.registry.tag.BlockTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

import java.util.ArrayList;
import java.util.List;

@Mixin(AbstractBlock.class)
public abstract class MixinAbstractBlock
{

    @ModifyReturnValue(method = "getDroppedStacks", at = @At("RETURN"))
    public List<ItemStack> onGetDroppedStacks(List<ItemStack> originalDrops,
                                              BlockState state,
                                              LootContextParameterSet.Builder builder)
    {
        List<ItemStack> modifiedDrops = new ArrayList<>(originalDrops);

        if (state.isIn(BlockTags.CROPS) &&
                builder.get(LootContextParameters.TOOL).isOf(ModdedItems.GREEN_ROCK_SALT_HOE))
        {
            modifiedDrops.addAll(originalDrops);
        }
        return modifiedDrops;
    }
}