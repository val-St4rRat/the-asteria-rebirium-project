package net.rat.asteriarebirium;

import net.fabricmc.api.ModInitializer;

import net.rat.asteriarebirium.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheAsteriaRebiriumProject implements ModInitializer {
	public static final String MOD_ID = "asteriarebirium";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!"); {

			ModItems.registerModItems();
		}
	}
}