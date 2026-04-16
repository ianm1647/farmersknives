package com.ianm1647.farmersknives.registry;

import com.google.common.base.Suppliers;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;

import java.util.function.Supplier;

public enum FKTiers implements Tier {

    // Vanilla
    COPPER(BlockTags.INCORRECT_FOR_STONE_TOOL, 190, 5.0F, 1.0F, 13, () -> Ingredient.of(Items.COPPER_INGOT)),

    //advanced netherite
    NETHERITE_IRON(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2281, 12.0F, 4.0F, 15,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("advancednetherite", "netherite_iron_ingot")))),
    NETHERITE_GOLD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2313, 20.0F, 4.0F, 25,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("advancednetherite", "netherite_gold_ingot")))),
    NETHERITE_EMERALD(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2651, 29.0F, 5.0F, 20,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("advancednetherite", "netherite_emerald_ingot")))),
    NETHERITE_DIAMOND(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3092, 39.0F, 5.0F, 15,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("advancednetherite", "netherite_diamond_ingot")))),

    //betterend
    THALLASIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 320, 7.0F, 1.5F, 12,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("betterend", "thallasium_ingot")))),
    TERMINITE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1230, 8.5F, 3.0F, 14,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("betterend", "terminite_ingot")))),
    AETERNIUM(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2196, 10.0F, 4.5F, 18,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("betterend", "aeternium_ingot")))),

    //betternether
    CINCINNASITE(BlockTags.INCORRECT_FOR_IRON_TOOL, 512, 6.0F, 2.0F, 16,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("betternether", "cincinnasite_ingot")))),
    CINCINNASITE_DIAMOND(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1800, 8.0F, 3.5F, 14,
            () -> Ingredient.of(Items.DIAMOND)),
    NETHER_RUBY(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1300, 9.0F, 4.0F, 22,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("betternether", "nether_ruby")))),

    //deeper and darker
    WARDEN(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2464, 11.0F, 7.0F, 21,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("deeperdarker", "reinforced_echo_shard")))),

    //dragon loot
    DRAGON(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 67*37, 12.0F, 5.0F, 20,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("dragonloot", "dragon_scale")))),

    EMERALD(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 725, 8.0F, 3.0F, 10,
            () -> Ingredient.of(Items.EMERALD)),
    RUBY(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 960, 8.0F, 3.0F, 10,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("emerald_tools", "ruby")))),
    AMETHYST(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 840, 8.0F, 1.5F, 25,
            () -> Ingredient.of(Items.AMETHYST_SHARD)),
    STEEL_ET(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 512, 7.0F, 2.0F, 9,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("emerald_tools", "steel_ingot")))),
    OBSIDIAN(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 650, 5.5F, 1.5F, 4,
            () -> Ingredient.of(Items.OBSIDIAN)),
    COPPER_ET(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 250, 5.5F, 1.5F, 18,
            () -> Ingredient.of(Items.COPPER_INGOT)),

    //enderite
    ENDERITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 15.0F, 2.0F, 17,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("enderitemod", "enderite_ingot")))),

    //gobber
    GOBBER(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3800, 9.0F, 9.0F, 20,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("gobber2", "gobber2_ingot")))),
    GOBBER_NETHER(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5200, 12.0F, 10.0F, 25,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("gobber2", "gobber2_ingot_nether")))),
    GOBBER_END(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 8000, 9.0F, 11.0F, 30,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("gobber2", "gobber2_ingot_end")))),

    //mythic metals
    ADAMANTITE(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1024, 7.0F, 5F, 16,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "adamantine_ingot")))),
    AQUARIUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 455, 6.5F, 2.0F, 12,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "aquarium_ingot")))),
    BANGLUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 260, 11.0F, 2.0F, 1,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "banglum_ingot")))),
    LEGENDARY_BANGLUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1040, 12.0F, 4.0F, 2,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "banglum_chunk")))),
    BRONZE(BlockTags.INCORRECT_FOR_IRON_TOOL, 354, 5.5F, 2.5F, 14,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "bronze_ingot")))),
    CARMOT(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1130, 11.5F, 3.0F, 42,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "carmot_ingot")))),
    CELESTIUM(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2470, 25.0F, 6.0F, 26,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "celestium_ingot")))),
    COPPER_MM(BlockTags.INCORRECT_FOR_STONE_TOOL, 187, 5.0F, 1.5F, 8,
            () -> Ingredient.of(Items.COPPER_INGOT)),
    DURASTEEL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 820, 7.1F, 3.5F, 12,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "durasteel_ingot")))),
    HALLOWED(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1984, 12.0F, 5.0F, 20,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "hallowed_ingot")))),
    KYBER(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 889, 7.0F, 2.5F, 20,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "kyber_ingot")))),
    METALLURGIUM(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3000, 15.0F, 8.0F, 30,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "metallurgium_ingot")))),
    MYTHRIL(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1564, 14.3F, 3.0F, 22,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "mythril_ingot")))),
    ORICHALCUM(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2048, 6.0F, 4.0F, 16,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "orichalcum_ingot")))),
    OSMIUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 664, 7.0F, 3.0F, 13,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "osmium_ingot")))),
    PALLADIUM(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1234, 8.0F, 3.5F, 16,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "palladium_ingot")))),
    PROMETHEUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1472, 6.0F, 4.0F, 15,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "prometheum_ingot")))),
    QUADRILLUM(BlockTags.INCORRECT_FOR_IRON_TOOL, 321, 6.0F, 2.7F, 8,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "quadrillum_ingot")))),
    RUNITE(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1337, 8.9F, 3.3F, 17,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "runite_ingot")))),
    STAR_PLATINUM(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1300, 9.0F, 4.0F, 18,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "star_platinum")))),
    STEEL_MM(BlockTags.INCORRECT_FOR_IRON_TOOL, 700, 6.5F, 3.0F, 11,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "steel_ingot")))),
    STORMYX(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1305, 8.5F, 3.5F, 20,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "stormyx_ingot")))),
    TIDESINGER(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1233, 9.0F, 4.0F, 18, () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("mythicmetals", "aquarium_ingot")))),

    //twilight forest
    IRONWOOD(BlockTags.INCORRECT_FOR_IRON_TOOL, 512, 6.5F, 2.0F, 25,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_ingot")))),
    FIERY(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1024, 9.0F, 4.0F, 10,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("twilightforest", "fiery_ingot")))),
    STEELEAF(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 131, 8.0F, 3.0F, 9,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_ingot")))),
    KNIGHTMETAL(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 512, 8.0F, 3.0F, 8,
            () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("twilightforest", "knightmetal_ingot")))),

    // Progression Reborn

    ROSE(BlockTags.INCORRECT_FOR_IRON_TOOL, 281, 10.0F, 2.0F, 22, () -> Ingredient.of(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath("progression_reborn", "rose_ingot")))),

    // Create Stuff and Additions

    BRASS(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 450, 8.0F, 2.0F, 14, () -> Ingredient.of(createTag(ResourceLocation.parse("c:ingots/brass")))),
    ZINC(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 7.0F, 1.0F, 11, () -> Ingredient.of(createTag(ResourceLocation.parse("c:ingots/zinc"))));

    private static TagKey<Item> createTag(ResourceLocation resourcelocation) {
        return TagKey.create(Registries.ITEM, resourcelocation);
    }

    private final TagKey<Block> incorrectBlocksForDrops;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    private FKTiers(
            final TagKey<Block> incorrectBlockForDrops,
            final int uses,
            final float speed,
            final float damage,
            final int enchantmentValue,
            final Supplier<Ingredient> repairIngredient
    ) {
        this.incorrectBlocksForDrops = incorrectBlockForDrops;
        this.uses = uses;
        this.speed = speed;
        this.damage = damage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = Suppliers.memoize(repairIngredient::get);
    }

    @Override
    public int getUses() {
        return this.uses;
    }

    @Override
    public float getSpeed() {
        return this.speed;
    }

    @Override
    public float getAttackDamageBonus() {
        return this.damage;
    }

    @Override
    public TagKey<Block> getIncorrectBlocksForDrops() {
        return this.incorrectBlocksForDrops;
    }

    @Override
    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return (Ingredient) this.repairIngredient.get();
    }
}