package com.gitlab.randomvanilla;

import com.gitlab.randomvanilla.init.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RandomVanilla implements ModInitializer {
	public static final String MOD_ID = "random-vanilla";
	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "item_group"), () -> new ItemStack(RVBlocks.FISH_BARREL));
	public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("[Random Vanilla] Loaded");

		// initialise stuff
		new RVBlocks();
	}
}
