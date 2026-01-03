package com.ianm1647.farmersknives.fabric.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import com.ianm1647.farmersknives.registry.FKItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import org.jetbrains.annotations.NotNull;

public final class FKModelProvider extends FabricModelProvider {
	public FKModelProvider(FabricDataOutput output) {
		super(output);
	}

	@Override
	public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {}

	@Override
	public void generateItemModels(@NotNull ItemModelGenerators generator) {

		generator.generateFlatItem(FKItems.FEATHERZEAL_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(FKItems.REMNANT_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

		generator.generateFlatItem(FKItems.ROSE_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

		generator.generateFlatItem(FKItems.ENDERITE_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

		generator.generateFlatItem(FKItems.NETHERITE_DIAMOND_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(FKItems.NETHERITE_EMERALD_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(FKItems.NETHERITE_GOLD_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
		generator.generateFlatItem(FKItems.NETHERITE_IRON_KNIFE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

	}
}