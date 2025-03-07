package net.eldargods.resurgencecore.item;

import net.eldargods.resurgencecore.ResurgenceCore;
import net.eldargods.resurgencecore.item.custom.HeartOfAetherItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RESURGENCE_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(ResurgenceCore.MOD_ID,"resurgence_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.HEART_OF_AETHER))
                    .displayName(Text.translatable("itemgroup.resurgence-core.resurgence_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.AETHER_SHARD);
                      entries.add(ModItems.HEART_OF_AETHER);

                    }).build());




    public static void registerItemGroups() {
        ResurgenceCore.LOGGER.info("Registering Item Groups for " + ResurgenceCore.MOD_ID);
    }
}
