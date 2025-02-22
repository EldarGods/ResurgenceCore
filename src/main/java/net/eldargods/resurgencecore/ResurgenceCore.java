package net.eldargods.resurgencecore;

import net.eldargods.resurgencecore.block.ModBlocks;
import net.eldargods.resurgencecore.item.ModItemGroups;
import net.eldargods.resurgencecore.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ResurgenceCore implements ModInitializer {
	public static final String MOD_ID = "resurgence-core";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}