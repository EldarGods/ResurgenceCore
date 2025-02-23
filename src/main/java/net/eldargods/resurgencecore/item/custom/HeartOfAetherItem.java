package net.eldargods.resurgencecore.item.custom;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.tooltip.Tooltip;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class HeartOfAetherItem extends Item {
    public HeartOfAetherItem(Settings settings) {
        super(new Item.Settings().maxCount(1).rarity(Rarity.EPIC).fireproof());

    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.translatable("tooltip.resurgence-core.heartofaether.line1"));
            tooltip.add(Text.translatable("tooltip.resurgence-core.heartofaether.line2"));
            tooltip.add(Text.translatable("tooltip.resurgence-core.heartofaether.line4"));
            tooltip.add(Text.translatable("tooltip.resurgence-core.heartofaether.shift_down1"));
            tooltip.add(Text.translatable("tooltip.resurgence-core.heartofaether.shift_down2"));
        } else {
            tooltip.add(Text.translatable("tooltip.resurgence-core.heartofaether.line1"));
            tooltip.add(Text.translatable("tooltip.resurgence-core.heartofaether.line2"));
            tooltip.add(Text.translatable("tooltip.resurgence-core.heartofaether.line4"));
            tooltip.add(Text.translatable("tooltip.resurgence-core.heartofaether.line3"));
        }

        super.appendTooltip(stack, world, tooltip, context);
    }
}
