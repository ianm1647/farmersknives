package com.ianm1647.farmersknives;

import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;

public class FKPlatform {
    @ExpectPlatform
    public static Item createKnifeItem(Item.Properties properties) {
        throw new RuntimeException("Platform error");
    }

    @ExpectPlatform
    public static ItemAttributeModifiers getKnifeItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed) {
        throw new RuntimeException("Platform error");
    }
}
