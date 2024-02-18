package net.heyt3ch.t3chsmod.mixin;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import net.heyt3ch.t3chsmod.item.ModdedItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PlayerEntity.class)
public abstract class MixinPlayerEntity
{
    @Shadow protected boolean isSubmergedInWater;

    @Shadow @Final private PlayerInventory inventory;

    @ModifyReturnValue(method = "getBlockBreakingSpeed", at = @At("RETURN"))
    private float modifyMiningSpeed(float original)
    {
        float MiningSpeed = original;
        if (this.isSubmergedInWater && this.inventory.getMainHandStack().getItem() == ModdedItems.BLUE_ROCK_SALT_PICKAXE)
        {
            MiningSpeed *= 10.0f;
        }
        return MiningSpeed;
    }
}