package com.ianm1647.farmersknives.fabric;

import com.ianm1647.farmersknives.fabric.item.KnifeItemFabric;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tier;

public class FKPlatformImpl {
    public static Item createKnifeItem(Tier tier, Item.Properties properties) {
        return new KnifeItemFabric(tier, (new Item.Properties()).attributes(KnifeItemFabric.createAttributes(tier, 0.5F, -2.0F)));
    }
}
