package com.ianm1647.farmersknives.item;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.util.function.Supplier;

public enum ToolMaterials implements ToolMaterial {

    //additional additions
    ROSE_GOLD(2, 900, 9.0F, 2.0F, 17,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    GILDED_NETHERITE(4, 2000, 9.0F, 2.0F, 24,
            () -> Ingredient.ofItems(Items.NETHERITE_INGOT)),

    //betterend
    THALLASIUM(2, 320, 7.0F, 1.5F, 12,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("betterend", "thallasium_ingot")))),
    TERMINITE(3, 1230, 8.5F, 3.0F, 14,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("betterend", "terminite_ingot")))),
    AETERNIUM(5, 2196, 10.0F, 4.5F, 18,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("betterend", "aeternium_ingot")))),

    //betternether
    CINCINNASITE(2, 512, 6.0F, 2.0F, 16,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("betternether", "cincinnasite_ingot")))),
    CINCINNASITE_DIAMOND(3, 1800, 8.0F, 3.5F, 14,
            () -> Ingredient.ofItems(Items.DIAMOND)),
    NETHER_RUBY(4, 1300, 9.0F, 4.0F, 22,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("betternether", "nether_ruby")))),

    //byg
    PENDORITE(5, 2500, 10.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("byg", "pendorite_ingot")))),

    //dragon loot
    DRAGON(5, 67*37, 12.0F, 5.0F, 20,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("dragonloot", "dragon_scale")))),

    //emerald_tools
    EMERALD(3, 725, 8.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Items.EMERALD)),
    RUBY(3, 960, 8.0F, 3.0F, 10,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("emerald_tools", "ruby")))),
    AMETHYST(3, 840, 8.0F, 1.5F, 25,
            () -> Ingredient.ofItems(Items.AMETHYST_SHARD)),
    STEEL_ET(3, 512, 7.0F, 2.0F, 9,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("emerald_tools", "steel_ingot")))),
    OBSIDIAN(3, 650, 5.5F, 1.5F, 4,
            () -> Ingredient.ofItems(Items.OBSIDIAN)),
    COPPER_ET(3, 250, 5.5F, 1.5F, 18,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),

    //enderite
    ENDERITE(4, 4096, 15.0F, 2.0F, 17,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("enderitemod", "enderite_ingot")))),

    //gobber
    GOBBER(4, 3800, 9.0F, 9.0F, 20,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("gobber2", "gobber2_ingot")))),
    GOBBER_NETHER(5, 5200, 12.0F, 10.0F, 25,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("gobber2", "gobber2_ingot_nether")))),
    GOBBER_END(6, 8000, 9.0F, 11.0F, 30,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("gobber2", "gobber2_ingot_end")))),

    //mythic metals
    ADAMANTITE(4, 1024, 7.0F, 5F, 16,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "adamantine_ingot")))),
    AQUARIUM(2, 455, 6.5F, 2.0F, 12,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "aquarium_ingot")))),
    BANGLUM(2, 260, 11.0F, 2.0F, 1,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "banglum_ingot")))),
    LEGENDARY_BANGLUM(3, 1040, 12.0F, 4.0F, 2,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "banglum_chunk")))),
    BRONZE(2, 624, 6.0F, 2.5F, 14,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "bronze_ingot")))),
    CARMOT(3, 730, 11.5F, 2.0F, 42,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "carmot_ingot")))),
    CELESTIUM(5, 2270, 16.9F, 6.0F, 26,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "celestium_ingot")))),
    COPPER_MM(1, 125, 5.0F, 1.0F, 8,
            () -> Ingredient.ofItems(Items.COPPER_INGOT)),
    DURASTEEL(3, 800, 7.0F, 3.5F, 12,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "durasteel_ingot")))),
    HALLOWED(4, 1629, 12.0F, 5.0F, 20,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "hallowed_ingot")))),
    KYBER(3, 889, 7.0F, 2.5F, 20,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "kyber_ingot")))),
    METALLURGIUM(5, 3000, 15.0F, 8.0F, 30,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "metallurgium_ingot")))),
    MYTHRIL(4, 1024, 13.0F, 3.0F, 22,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "mythril_ingot")))),
    ORICHALCUM(4, 2048, 6.0F, 4.0F, 16,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "orichalcum_ingot")))),
    OSMIUM(3, 584, 7.0F, 2.0F, 13,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "osmium_ingot")))),
    PALLADIUM(4, 1234, 8.0F, 3.5F, 16,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "palladium_ingot")))),
    PROMETHEUM(3, 1572, 6.0F, 4.0F, 15,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "prometheum_ingot")))),
    QUADRILLUM(2, 321, 5.0F, 2.5F, 8,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "quadrillum_ingot")))),
    RUNITE(3, 1337, 8.9F, 3.3F, 17,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "runite_ingot")))),
    STAR_PLATINUM(3, 1300, 9.0F, 4.0F, 18,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "star_platinum")))),
    STEEL_MM(2, 600, 6.5F, 2.5F, 12,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "steel_ingot")))),
    STORMYX(3, 1305, 8.0F, 3.5F, 20,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("mythicmetals", "stormyx_ingot")))),

    //twilight forest
    IRONWOOD(2, 512, 6.5F, 2.0F, 25,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("twilightforest", "ironwood_ingot")))),
    FIERY(4, 1024, 9.0F, 4.0F, 10,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("twilightforest", "fiery_ingot")))),
    STEELEAF(3, 131, 8.0F, 3.0F, 9,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("twilightforest", "steeleaf_ingot")))),
    KNIGHTMETAL(3, 512, 8.0F, 3.0F, 8,
            () -> Ingredient.ofItems(Registry.ITEM.get(new Identifier("twilightforest", "knightmetal_ingot")))),

    ;

    private final int miningLevel;
    private final int durability;
    private final float blockBreakSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairIngredient;

    ToolMaterials(int miningLevel, int durability, float blockBreakSpeed, float attackDamage, int enchantability, Supplier repairIngredient) {
        this.miningLevel = miningLevel;
        this.durability = durability;
        this.blockBreakSpeed = blockBreakSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.durability;
    }

    public float getMiningSpeedMultiplier() {
        return this.blockBreakSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
