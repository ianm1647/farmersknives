package com.ianm1647.farmersknives.item;

import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.tag.TagKey;
import paulevs.betternether.interfaces.InitialStackStateProvider;
import paulevs.betternether.items.materials.BNToolMaterial;
import paulevs.betternether.registry.NetherEnchantments;

import java.util.HashMap;
import java.util.Map;

public class NetherKnifeItem extends KnifeItem implements InitialStackStateProvider {
    static final Map<Enchantment, Integer> DEFAULT_RUBY_ENCHANTS = new HashMap();

    public NetherKnifeItem(ToolMaterial material, Settings settings) {
        super(material, settings.fireproof());
    }

    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return super.getMiningSpeedMultiplier(stack, state);
    }

    @Override
    public void initializeState(ItemStack itemStack) {
        if (this.getMaterial() == BNToolMaterial.NETHER_RUBY) {
            EnchantmentHelper.set(DEFAULT_RUBY_ENCHANTS, itemStack);
        }
    }

    static {
        DEFAULT_RUBY_ENCHANTS.put(NetherEnchantments.RUBY_FIRE, 1);
    }
}
