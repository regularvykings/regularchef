package net.turtlethefish.regularchef;

import net.fabricmc.api.ModInitializer;
import net.turtlethefish.regularchef.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RegularChef implements ModInitializer {

	public static final String MOD_ID = "regularchef";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
