package com.ianm1647.farmersknives;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class FKPlatform {
    @ExpectPlatform
    public static Item createKnifeItem(Tier tier, Item.Properties properties) {
        throw new RuntimeException("Platform error");
    }
}
