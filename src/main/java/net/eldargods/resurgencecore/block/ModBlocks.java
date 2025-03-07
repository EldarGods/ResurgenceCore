package net.eldargods.resurgencecore.block;

import net.eldargods.resurgencecore.ResurgenceCore;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    public static final Block ANIMA_BLOCK = registerBlock("anima_block",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()
                    .requiresTool().sounds(BlockSoundGroup.METAL)));

    public static final Block RAW_ANIMA_BLOCK  = registerBlock("raw_anima_block",
            new Block(AbstractBlock.Settings.create().strength(3f).requiresTool()
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    public static final Block ANIMA_ORE = registerBlock("anima_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().strength(3f).requiresTool(), UniformIntProvider.create(2, 5)));

    public static final Block DEEPSLATE_ANIMA_ORE = registerBlock("deepslate_anima_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.create().strength(3f).requiresTool(), UniformIntProvider.create(3, 6)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(ResurgenceCore.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(ResurgenceCore.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }


    public static void registerModBlocks() {
        ResurgenceCore.LOGGER.info("Registering Mod Blocks for " + ResurgenceCore.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.ANIMA_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RAW_ANIMA_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.DEEPSLATE_ANIMA_ORE);
            fabricItemGroupEntries.add(ModBlocks.ANIMA_ORE);
        });
    }
}
