package net.haltocarrick.vanillamaterialresources;

import net.fabricmc.api.ModInitializer;
import net.haltocarrick.vanillamaterialresources.block.ModBlocks;
import net.haltocarrick.vanillamaterialresources.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaMaterialResources implements ModInitializer {
	public static final String MOD_ID = "vanillamaterialresources";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
