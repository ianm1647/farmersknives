package com.ianm1647.farmersknives.fabric.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.NotNull;

public final class FKDataGenerator implements DataGeneratorEntrypoint {

	@Override
	public void onInitializeDataGenerator(@NotNull FabricDataGenerator dataGenerator) {

		final FabricDataGenerator.Pack pack = dataGenerator.createPack();

		pack.addProvider(FKModelProvider::new);

	}
}