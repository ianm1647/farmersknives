package com.ianm1647.farmersknives.item.compat.botania;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import net.minecraft.block.BlockState;
import net.minecraft.block.FarmlandBlock;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.NotNull;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.common.handler.PixieHandler;

public class ElementiumKnifeItem extends ManasteelKnifeItem {
    public ElementiumKnifeItem(Settings props) {
        super(BotaniaAPI.instance().getElementiumItemTier(), props);
    }

    @NotNull
    @Override
    public ActionResult useOnBlock(@NotNull ItemUsageContext context) {
        ActionResult result = super.useOnBlock(context);
        if (result.isAccepted()) {
            World world = context.getWorld();
            BlockPos pos = context.getBlockPos();
            BlockState state = world.getBlockState(pos);
            if (state.contains(FarmlandBlock.MOISTURE)) {
                world.setBlockState(pos, state.with(FarmlandBlock.MOISTURE, 7));
            }
        }
        return result;
    }

    @NotNull
    @Override
    public Multimap<EntityAttribute, EntityAttributeModifier> getAttributeModifiers(@NotNull EquipmentSlot slot) {
        Multimap<EntityAttribute, EntityAttributeModifier> ret = super.getAttributeModifiers(slot);
        if (slot == EquipmentSlot.MAINHAND) {
            ret = HashMultimap.create(ret);
            ret.put(PixieHandler.PIXIE_SPAWN_CHANCE, PixieHandler.makeModifier(slot, "Sword modifier", 0.05));
        }
        return ret;
    }
}
