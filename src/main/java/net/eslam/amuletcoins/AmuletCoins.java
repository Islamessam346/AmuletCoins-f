package net.eslam.amuletcoins;

import net.eslam.amuletcoins.block.ModBlocks;
import net.eslam.amuletcoins.item.ModItemGroups;
import net.eslam.amuletcoins.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fabricmc.loader.impl.FabricLoaderImpl.MOD_ID;

public class AmuletCoins implements ModInitializer {
	public static final String MOD_ID = "amuletcoins";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize(){
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}