package com.ianm1647.farmersknives;

import com.ianm1647.farmersknives.registry.FKCreativeTab;
import com.ianm1647.farmersknives.registry.FKItems;
import net.minecraft.resources.ResourceLocation;

public final class FarmersKnives {
    public static final String MOD_ID = "farmersknives";
    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }

    public static void init() {
        // Write common init code here.
        FKItems.init();
        FKCreativeTab.init();
    }
}
