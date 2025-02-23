package net.eldargods.resurgencecore.item;

import net.eldargods.resurgencecore.ResurgenceCore;
import net.eldargods.resurgencecore.item.custom.HeartOfAetherItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {
    public static final Item AETHER_SHARD = registerItem("aether_shard", new Item(new Item.Settings()));
    public static final Item RAW_ANIMA = registerItem("raw_anima", new Item(new Item.Settings()));
    public static final Item ANIMA_INGOT = registerItem("anima_ingot", new Item(new Item.Settings()));

    public static final Item HEART_OF_AETHER = registerItem("heart_of_aether", new HeartOfAetherItem(new Item.Settings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(ResurgenceCore.MOD_ID, name), item);
    }


    public static void registerModItems() {
        ResurgenceCore.LOGGER.info("Registering Mod Items for " + ResurgenceCore.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(AETHER_SHARD);
            fabricItemGroupEntries.add(ANIMA_INGOT);
            fabricItemGroupEntries.add(RAW_ANIMA);
        });
    }
}



