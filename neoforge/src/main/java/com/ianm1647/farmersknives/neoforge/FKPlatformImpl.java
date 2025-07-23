package com.ianm1647.farmersknives.neoforge;

import net.minecraft.world.item.Item;

import com.ianm1647.farmersknives.neoforge.item.KnifeItemNeoForge;

public class FKPlatformImpl {
    public static Item createKnifeItem(Item.Properties properties) {
        return new KnifeItemNeoForge(properties);
    }
}
