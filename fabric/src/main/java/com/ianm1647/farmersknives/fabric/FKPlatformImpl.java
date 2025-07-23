package com.ianm1647.farmersknives.fabric;

import com.ianm1647.farmersknives.fabric.item.KnifeItemFabric;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;

public class FKPlatformImpl {
    public static Item createKnifeItem(Item.Properties properties) {
        return new KnifeItemFabric(properties);
    }

    public static ItemAttributeModifiers getKnifeItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed) {
        return KnifeItemFabric.createAttributes(toolMaterial, attackDamage, attackSpeed);
    }
}
