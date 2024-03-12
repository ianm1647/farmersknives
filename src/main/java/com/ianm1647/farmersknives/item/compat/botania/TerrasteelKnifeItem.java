package com.ianm1647.farmersknives.item.compat.botania;

import com.ianm1647.farmersknives.item.ItemList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.thrown.ThrownEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.internal.ManaBurst;
import vazkii.botania.api.mana.BurstProperties;
import vazkii.botania.api.mana.LensEffectItem;
import vazkii.botania.common.entity.ManaBurstEntity;
import vazkii.botania.common.handler.BotaniaSounds;
import vazkii.botania.common.item.BotaniaItems;
import vazkii.botania.network.serverbound.LeftClickPacket;
import vazkii.botania.xplat.ClientXplatAbstractions;

import java.util.List;

public class TerrasteelKnifeItem extends ManasteelKnifeItem implements LensEffectItem {

    private static final int MANA_PER_DAMAGE = 100;

    public TerrasteelKnifeItem(Settings props) {
        super(BotaniaAPI.instance().getTerrasteelItemTier(), props);
    }

    public static void leftClick(ItemStack stack) {
        if (!stack.isEmpty() && stack.getItem() instanceof TerrasteelKnifeItem) {
            ClientXplatAbstractions.INSTANCE.sendToServer(LeftClickPacket.INSTANCE);
        }
    }

    public static ActionResult attackEntity(PlayerEntity player, World world, Hand hand, Entity target, @Nullable EntityHitResult hit) {
        if (!player.getWorld().isClient) {
            trySpawnBurst(player);
        }
        return ActionResult.PASS;
    }

    public static void trySpawnBurst(PlayerEntity player) {
        trySpawnBurst(player, player.getAttackCooldownProgress(0F));
    }

    public static void trySpawnBurst(PlayerEntity player, float attackStrength) {
        if (!player.isSpectator()
                && !player.getMainHandStack().isEmpty()
                && player.getMainHandStack().isOf(ItemList.TERRA_KNIFE)
                && attackStrength == 1) {
            ManaBurstEntity burst = getBurst(player, player.getMainHandStack());
            player.getWorld().spawnEntity(burst);
            player.getMainHandStack().damage(1, player, p -> p.sendToolBreakStatus(Hand.MAIN_HAND));
            player.getWorld().playSound(null, player.getX(), player.getY(), player.getZ(), BotaniaSounds.terraBlade, SoundCategory.PLAYERS, 1F, 1F);
        }
    }

    @Override
    public int getManaPerDamage() {
        return MANA_PER_DAMAGE;
    }

    public static ManaBurstEntity getBurst(PlayerEntity player, ItemStack stack) {
        ManaBurstEntity burst = new ManaBurstEntity(player);

        float motionModifier = 7F;

        burst.setColor(0x20FF20);
        burst.setMana(MANA_PER_DAMAGE);
        burst.setStartingMana(MANA_PER_DAMAGE);
        burst.setMinManaLoss(40);
        burst.setManaLossPerTick(4F);
        burst.setGravity(0F);
        burst.setVelocity(burst.getVelocity().multiply(motionModifier));

        burst.setSourceLens(stack.copy());
        return burst;
    }

    @Override
    public void apply(ItemStack stack, BurstProperties props, World level) {
    }

    @Override
    public boolean collideBurst(ManaBurst burst, HitResult pos, boolean isManaBlock, boolean shouldKill, ItemStack stack) {
        return shouldKill;
    }

    @Override
    public void updateBurst(ManaBurst burst, ItemStack stack) {
        ThrownEntity entity = burst.entity();
        Box axis = new Box(entity.getX(), entity.getY(), entity.getZ(), entity.lastRenderX, entity.lastRenderY, entity.lastRenderZ).expand(1);
        List<LivingEntity> entities = entity.getWorld().getNonSpectatingEntities(LivingEntity.class, axis);
        Entity thrower = entity.getOwner();

        for (LivingEntity living : entities) {
            if (living == thrower || living instanceof PlayerEntity livingPlayer && thrower instanceof PlayerEntity throwingPlayer
                    && !throwingPlayer.shouldDamagePlayer(livingPlayer)) {
                continue;
            }

            if (living.hurtTime == 0) {
                int cost = MANA_PER_DAMAGE / 3;
                int mana = burst.getMana();
                if (mana >= cost) {
                    burst.setMana(mana - cost);
                    float damage = 4F + BotaniaAPI.instance().getTerrasteelItemTier().getAttackDamage();
                    if (!burst.isFake() && !entity.getWorld().isClient) {
                        DamageSource source = living.getDamageSources().magic();
                        if (thrower instanceof PlayerEntity player) {
                            source = player.getDamageSources().playerAttack(player);
                        } else if (thrower instanceof LivingEntity livingEntity) {
                            source = livingEntity.getDamageSources().mobAttack(livingEntity);
                        }
                        living.damage(source, damage);
                        entity.discard();
                        break;
                    }
                }
            }
        }
    }

    @Override
    public boolean doParticles(ManaBurst burst, ItemStack stack) {
        return true;
    }
}
