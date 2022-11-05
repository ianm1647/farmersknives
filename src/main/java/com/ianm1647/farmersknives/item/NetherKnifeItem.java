package com.ianm1647.farmersknives.item;

import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import net.minecraft.block.BlockState;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import org.betterx.betternether.interfaces.InitialStackStateProvider;
import org.betterx.betternether.items.materials.BNToolMaterial;
import org.betterx.betternether.registry.NetherEnchantments;

import java.util.HashMap;
import java.util.Map;

public class NetherKnifeItem extends KnifeItem implements InitialStackStateProvider {
    static final Map<Enchantment, Integer> DEFAULT_RUBY_ENCHANTS = new HashMap();

    public NetherKnifeItem(ToolMaterial material, Settings settings) {
        super(material);
    }

    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        return super.getMiningSpeedMultiplier(stack, state);
    }

    @Override
    public void initializeState(ItemStack itemStack) {
        if (this.getMaterial() == ToolMaterials.NETHER_RUBY) {
            EnchantmentHelper.set(DEFAULT_RUBY_ENCHANTS, itemStack);
        }
    }

    static {
        DEFAULT_RUBY_ENCHANTS.put(NetherEnchantments.RUBY_FIRE, 1);
    }
}
