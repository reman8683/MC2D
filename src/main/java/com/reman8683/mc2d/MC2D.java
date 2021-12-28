package com.reman8683.mc2d;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MC2D implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("mc2d");

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Discord world!");
	}
}
