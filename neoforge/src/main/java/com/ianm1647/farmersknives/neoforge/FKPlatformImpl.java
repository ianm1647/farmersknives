package com.ianm1647.farmersknives.neoforge;

import com.ianm1647.farmersknives.neoforge.item.KnifeItemNeoForge;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class FKPlatformImpl {
    public static Item createKnifeItem(Tier tier, Item.Properties properties) {
        return new KnifeItemNeoForge(tier, properties);
    }
}
