package com.ianm1647.farmersknives.item.compat.botania;

import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.world.World;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.item.SortableTool;
import vazkii.botania.api.mana.ManaItemHandler;
import vazkii.botania.common.item.equipment.CustomDamageItem;
import vazkii.botania.common.item.equipment.tool.ToolCommons;

import java.util.function.Consumer;

public class ManasteelKnifeItem extends KnifeItem implements CustomDamageItem {

    public static final int MANA_PER_DAMAGE = 60;

    public ManasteelKnifeItem(Settings props) {
        this(BotaniaAPI.instance().getManasteelItemTier(), props);
    }

    public ManasteelKnifeItem(ToolMaterial mat, Settings props) {
        this(mat, 3, -1.8F, props);
    }

    public ManasteelKnifeItem(ToolMaterial mat, int attackDamage, float attackSpeed, Settings props) {
        super(mat);
    }

    @Override
    public <T extends LivingEntity> int damageItem(ItemStack stack, int amount, T entity, Consumer<T> onBroken) {
        int manaPerDamage = ((vazkii.botania.common.item.equipment.tool.manasteel.ManasteelSwordItem) stack.getItem()).getManaPerDamage();
        return ToolCommons.damageItemIfPossible(stack, amount, entity, manaPerDamage);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (!world.isClient && entity instanceof PlayerEntity player && stack.getDamage() > 0 && ManaItemHandler.instance().requestManaExactForTool(stack, player, getManaPerDamage() * 2, true)) {
            stack.setDamage(stack.getDamage() - 1);
        }
    }

    public int getManaPerDamage() {
        return MANA_PER_DAMAGE;
    }
}
