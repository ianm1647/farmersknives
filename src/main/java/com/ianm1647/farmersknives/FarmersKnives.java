package com.ianm1647.farmersknives;

import com.ianm1647.farmersknives.registry.ModRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FarmersKnives implements ModInitializer {
	public static final String MODID = "farmersknives";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		ModRegistry.registerThis();

		LOGGER.info("Farmer's Knives loaded!");
	}
}
