package net.heyt3ch.t3chsmod.mixin;

import net.minecraft.item.SmithingTemplateItem;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.Inject;

import java.util.List;

@Mixin(SmithingTemplateItem.class)
public abstract class MixinSmithingTemplateItem implements SmithingUpgradeItemAccess
{


    
    @Unique
    protected abstract List<Identifier> getNetheriteUpgradeEmptyBaseSlotTextures();

    @Unique
    protected abstract List<Identifier> getNetheriteUpgradeEmptyAdditionsSlotTextures();

    @Unique
    private static final Formatting DESCRIPTION_FORMATTING = Formatting.BLUE;
    @Unique
    private static final Formatting TITLE_FORMATTING = Formatting.GRAY;
    @Unique
    private static final Text HALITE_UPGRADE_APPLIES_TO_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.applies_to"))).formatted(DESCRIPTION_FORMATTING);
    @Unique
    private static final Text HALITE_UPGRADE_INGREDIENTS_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.ingredients"))).formatted(DESCRIPTION_FORMATTING);
    @Unique
    private static final Text HALITE_UPGRADE_TEXT = Text.translatable(Util.createTranslationKey("upgrade", new Identifier("halite_upgrade"))).formatted(TITLE_FORMATTING);
    @Unique
    private static final Text HALITE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.base_slot_description")));
    @Unique
    private static final Text HALITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT = Text.translatable(Util.createTranslationKey("item", new Identifier("smithing_template.halite_upgrade.additions_slot_description")));

    @Override
    public SmithingTemplateItem createHaliteUpgrade()
    {
        return new SmithingTemplateItem(HALITE_UPGRADE_APPLIES_TO_TEXT, HALITE_UPGRADE_INGREDIENTS_TEXT, HALITE_UPGRADE_TEXT, HALITE_UPGRADE_BASE_SLOT_DESCRIPTION_TEXT, HALITE_UPGRADE_ADDITIONS_SLOT_DESCRIPTION_TEXT, this.getNetheriteUpgradeEmptyBaseSlotTextures(), this.getNetheriteUpgradeEmptyAdditionsSlotTextures());
    }
}
