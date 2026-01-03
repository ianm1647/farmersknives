package com.ianm1647.farmersknives;

import com.ianm1647.farmersknives.registry.FKCreativeTab;
import com.ianm1647.farmersknives.registry.FKItems;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.Identifier;

public final class FarmersKnives {
    public static final String MOD_ID = "farmersknives";
    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }

    public static void init() {
        // Write common init code here.
        FKItems.init();
        FKCreativeTab.init();
    }
}
