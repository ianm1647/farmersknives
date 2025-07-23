package com.ianm1647.farmersknives.registry;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import com.ianm1647.farmersknives.FarmersKnives;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class FKCreativeTab {
    public static final DeferredRegister<CreativeModeTab> TABS =
            DeferredRegister.create(FarmersKnives.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab> FARMERS_KNIVES_TAB = TABS.register(
            "farmersknives", // Tab ID
            () -> CreativeTabRegistry.create(
                    Component.translatable("category.farmersknives"), // Tab Name
                    () -> new ItemStack(FKItems.CREATIVE_TAB_KNIFE) // Icon
            )
    );

    public static void init() {
        TABS.register();
    }
}
