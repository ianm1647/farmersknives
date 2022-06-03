package com.ianm1647.farmersknives.item;

import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.collection.DefaultedList;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class TwilightKnifeItem extends KnifeItem {
    public TwilightKnifeItem(ToolMaterial material, Settings settings) {
        super(material, settings);
    }

    @Override
    public void appendStacks(ItemGroup group, DefaultedList<ItemStack> list) {
        if (this == ItemList.IRONWOOD_KNIFE) {
            if (this.isIn(group)) {
                ItemStack stack = new ItemStack(this);
                stack.addEnchantment(Enchantments.KNOCKBACK, 1);
                list.add(stack);
            }
        }
        if (this == ItemList.STEELEAF_KNIFE) {
            if (this.isIn(group)) {
                ItemStack stack = new ItemStack(this);
                stack.addEnchantment(Enchantments.LOOTING, 2);
                list.add(stack);
            }
        }
        if (this == ItemList.FIERY_KNIFE) {
            if (this.isIn(group)) {
                ItemStack stack = new ItemStack(this);
                list.add(stack);
            }
        }
        if (this == ItemList.KNIGHTMETAL_KNIFE) {
            if (this.isIn(group)) {
                ItemStack stack = new ItemStack(this);
                list.add(stack);
            }
        }
    }

    // fiery knife things pulled from FierySword.class
    public boolean canApplyAtEnchantingTable(ItemStack stack, Enchantment enchantment) {
        if (this == ItemList.FIERY_KNIFE) {
            return enchantment != Enchantments.FIRE_ASPECT;
        }
        return false;
    }

    public boolean isBookEnchantable(ItemStack stack, ItemStack book) {
        if (this == ItemList.FIERY_KNIFE) {
            return !EnchantmentHelper.get(book).containsKey(Enchantments.FIRE_ASPECT) && super.isEnchantable(stack);
        }
        return false;
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        boolean result = super.postHit(stack, target, attacker);
        if (this == ItemList.FIERY_KNIFE) {
            if (result && !target.getWorld().isClient() && !target.isFireImmune()) {
                target.setOnFireFor(15);
            } else {
                for (int var1 = 0; var1 < 20; ++var1) {
                    double px = target.getX() + (double) (target.getWorld().getRandom().nextFloat() * target.getWidth() * 2.0F) - (double) target.getWidth();
                    double py = target.getY() + (double) (target.getWorld().getRandom().nextFloat() * target.getHeight());
                    double pz = target.getZ() + (double) (target.getWorld().getRandom().nextFloat() * target.getWidth() * 2.0F) - (double) target.getWidth();
                    target.getWorld().addParticle(ParticleTypes.FLAME, px, py, pz, 0.02, 0.02, 0.02);
                }
            }
        }

        return result;
    }

    public static ActionResult setFireBeforeDeath(PlayerEntity player, World world, Hand hand, Entity entity, @Nullable EntityHitResult hitResult) {
        if (entity instanceof LivingEntity living) {
            if (living.getMainHandStack().isOf(ItemList.FIERY_KNIFE) && !living.isFireImmune()) {
                living.setOnFireFor(1);
            }
        }

        return ActionResult.PASS;
    }

    private static final int BONUS_DAMAGE = 2;

    //knightmetal knife things pulled from KnightmetalSword.class
    public static float onDamage(DamageSource source, LivingEntity target, float amount) {
        float newAmount = amount;
        if (!target.world.isClient) {
            Entity var5 = source.getSource();
            if (var5 instanceof LivingEntity) {
                LivingEntity living = (LivingEntity)var5;
                ItemStack weapon = living.getMainHandStack();
                if (!weapon.isEmpty()) {
                    if (target.getArmor() > 0 && (weapon.isOf(ItemList.KNIGHTMETAL_KNIFE))) {
                        if (target.getArmorVisibility() > 0.0F) {
                            int moreBonus = (int)(2.0F * target.getArmorVisibility());
                            newAmount = amount + (float)moreBonus;
                        } else {
                            newAmount = amount + 2.0F;
                        }
                        ((ServerWorld)target.world).getChunkManager().sendToNearbyPlayers(target, new EntityAnimationS2CPacket(target, 5));
                    }
                }
            }
        }

        return newAmount;
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        if (this == ItemList.FIERY_KNIFE) {
            tooltip.add(new TranslatableText("item.twilightforest.fiery_sword.tooltip").formatted(Formatting.GRAY));
        }
        if (this == ItemList.KNIGHTMETAL_KNIFE) {
            tooltip.add(new TranslatableText("item.twilightforest.knightmetal_sword.tooltip").formatted(Formatting.GRAY));
        }
    }
}
