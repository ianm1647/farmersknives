package com.ianm1647.farmersknives;

import com.ianm1647.farmersknives.registry.ModRegistry;
import com.terraformersmc.modmenu.gui.widget.entries.ModListEntry;
import dev.architectury.platform.Mod;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vectorwing.farmersdelight.common.registry.ModItems;

public class FarmersKnives implements ModInitializer {
	public static final String MODID = "farmersknives";
	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);
	public static final RegistryKey<ItemGroup> GROUP = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(MODID, "group"));


	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM_GROUP, GROUP, FabricItemGroup.builder()
				.displayName(Text.translatable("itemGroup.farmersknives.group"))
				.icon(() -> new ItemStack(ModItems.IRON_KNIFE.get()))
				.build());

		ModRegistry.registerThis();

		LOGGER.info("Farmer's Knives loaded!");
	}
}
