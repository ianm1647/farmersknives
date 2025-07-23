package com.ianm1647.farmersknives.registry;

import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import java.util.List;

public record FKToolMaterial(
        TagKey<Block> incorrectBlocksForDrops, int durability, float speed, float attackDamageBonus, int enchantmentValue, TagKey<Item> repairItems
) {

    //advanced netherite

    public static final ToolMaterial NETHERITE_IRON = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2281, 12.0F, 4.0F, 15,
            TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("advancednetherite", "repairs_netherite_iron_tools")));
    public static final ToolMaterial NETHERITE_GOLD = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2313, 20.0F, 4.0F, 25,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("advancednetherite", "repairs_netherite_gold_tools")));
    public static final ToolMaterial NETHERITE_EMERALD = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2651, 29.0F, 5.0F, 20,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("advancednetherite", "repairs_netherite_emerald_tools")));
    public static final ToolMaterial NETHERITE_DIAMOND = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3092, 39.0F, 5.0F, 15,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("advancednetherite", "repairs_netherite_diamond_tools")));

/*    //betterend
    public static final ToolMaterial THALLASIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 320, 7.0F, 1.5F, 12,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("betterend", "thallasium_ingot")));
    public static final ToolMaterial TERMINITE = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1230, 8.5F, 3.0F, 14,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("betterend", "terminite_ingot")));
    public static final ToolMaterial AETERNIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2196, 10.0F, 4.5F, 18,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("betterend", "aeternium_ingot")));

    //betternether
    public static final ToolMaterial CINCINNASITE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 512, 6.0F, 2.0F, 16,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("betternether", "cincinnasite_ingot")));
    public static final ToolMaterial CINCINNASITE_DIAMOND = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1800, 8.0F, 3.5F, 14,
            () -> Ingredient.of(Items.DIAMOND)),
    public static final ToolMaterial NETHER_RUBY = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1300, 9.0F, 4.0F, 22,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("betternether", "nether_ruby")));*/

/*    //deeper and darker
    public static final ToolMaterial WARDEN = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2464, 11.0F, 7.0F, 21,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("deeperdarker", "reinforced_echo_shard")));*/

/*    //dragon loot
    public static final ToolMaterial DRAGON = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 67*37, 12.0F, 5.0F, 20,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("dragonloot", "dragon_scale")));*/

/*    // Easy Emerald Tools & More

    public static final ToolMaterial EMERALD = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 725, 8.0F, 3.0F, 10,
            () -> Ingredient.of(Items.EMERALD)),
    public static final ToolMaterial RUBY = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 960, 8.0F, 3.0F, 10,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("emerald_tools", "ruby")));
    public static final ToolMaterial AMETHYST = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 840, 8.0F, 1.5F, 25,
            () -> Ingredient.of(Items.AMETHYST_SHARD)),
    public static final ToolMaterial STEEL_ET = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 512, 7.0F, 2.0F, 9,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("emerald_tools", "steel_ingot")));
    public static final ToolMaterial OBSIDIAN = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 650, 5.5F, 1.5F, 4,
            () -> Ingredient.of(Items.OBSIDIAN)),
    public static final ToolMaterial COPPER_ET = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 250, 5.5F, 1.5F, 18,
            () -> Ingredient.of(Items.COPPER_INGOT)),*/

    //enderite
    public static final ToolMaterial ENDERITE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 4096, 15.0F, 2.0F, 17,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("enderitemod", "repairs_enderite_armor")));

/*    //gobber
    public static final ToolMaterial GOBBER = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3800, 9.0F, 9.0F, 20,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("gobber2", "gobber2_ingot")));
    public static final ToolMaterial GOBBER_NETHER = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 5200, 12.0F, 10.0F, 25,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("gobber2", "gobber2_ingot_nether")));
    public static final ToolMaterial GOBBER_END = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 8000, 9.0F, 11.0F, 30,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("gobber2", "gobber2_ingot_end")));*/

/*
    //mythic metals
    public static final ToolMaterial ADAMANTITE = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1024, 7.0F, 5F, 16,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "adamantine_ingot")));
    public static final ToolMaterial AQUARIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 455, 6.5F, 2.0F, 12,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "aquarium_ingot")));
    public static final ToolMaterial BANGLUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 260, 11.0F, 2.0F, 1,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "banglum_ingot")));
    public static final ToolMaterial LEGENDARY_BANGLUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1040, 12.0F, 4.0F, 2,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "banglum_chunk")));
    public static final ToolMaterial BRONZE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 354, 5.5F, 2.5F, 14,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "bronze_ingot")));
    public static final ToolMaterial CARMOT = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1130, 11.5F, 3.0F, 42,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "carmot_ingot")));
    public static final ToolMaterial CELESTIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2470, 25.0F, 6.0F, 26,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "celestium_ingot")));
    public static final ToolMaterial COPPER_MM = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 187, 5.0F, 1.5F, 8,
            () -> Ingredient.of(Items.COPPER_INGOT)),
    public static final ToolMaterial DURASTEEL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 820, 7.1F, 3.5F, 12,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "durasteel_ingot")));
    public static final ToolMaterial HALLOWED = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1984, 12.0F, 5.0F, 20,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "hallowed_ingot")));
    public static final ToolMaterial KYBER = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 889, 7.0F, 2.5F, 20,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "kyber_ingot")));
    public static final ToolMaterial METALLURGIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 3000, 15.0F, 8.0F, 30,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "metallurgium_ingot")));
    public static final ToolMaterial MYTHRIL = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1564, 14.3F, 3.0F, 22,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "mythril_ingot")));
    public static final ToolMaterial ORICHALCUM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2048, 6.0F, 4.0F, 16,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "orichalcum_ingot")));
    public static final ToolMaterial OSMIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 664, 7.0F, 3.0F, 13,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "osmium_ingot")));
    public static final ToolMaterial PALLADIUM = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1234, 8.0F, 3.5F, 16,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "palladium_ingot")));
    public static final ToolMaterial PROMETHEUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1472, 6.0F, 4.0F, 15,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "prometheum_ingot")));
    public static final ToolMaterial QUADRILLUM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 321, 6.0F, 2.7F, 8,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "quadrillum_ingot")));
    public static final ToolMaterial RUNITE = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1337, 8.9F, 3.3F, 17,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "runite_ingot")));
    public static final ToolMaterial STAR_PLATINUM = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1300, 9.0F, 4.0F, 18,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "star_platinum")));
    public static final ToolMaterial STEEL_MM = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 700, 6.5F, 3.0F, 11,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "steel_ingot")));
    public static final ToolMaterial STORMYX = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1305, 8.5F, 3.5F, 20,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "stormyx_ingot")));
    public static final ToolMaterial TIDESINGER = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1233, 9.0F, 4.0F, 18, TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("mythicmetals", "aquarium_ingot")));
*/

/*    //twilight forest
    public static final ToolMaterial IRONWOOD = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 512, 6.5F, 2.0F, 25,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("twilightforest", "ironwood_ingot")));
    public static final ToolMaterial FIERY = new ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 1024, 9.0F, 4.0F, 10,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("twilightforest", "fiery_ingot")));
    public static final ToolMaterial STEELEAF = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 131, 8.0F, 3.0F, 9,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("twilightforest", "steeleaf_ingot")));
    public static final ToolMaterial KNIGHTMETAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 512, 8.0F, 3.0F, 8,
            TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("twilightforest", "knightmetal_ingot")));*/

    // Progression Reborn

    public static final ToolMaterial COPPER = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 190, 5.0F, 1.0F, 14, TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("progression_reborn", "copper_tool_materials")));
    public static final ToolMaterial ROSE = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 281, 10.0F, 2.0F, 22, TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("progression_reborn", "rose_tool_materials")));

    // End Reborn

    public static final net.minecraft.world.item.ToolMaterial REMNANT = new net.minecraft.world.item.ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2501, 9.0F, 4.0F, 15, TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("end_reborn", "remnant_tool_materials")));
    public static final net.minecraft.world.item.ToolMaterial FEATHERZEAL = new net.minecraft.world.item.ToolMaterial(BlockTags.INCORRECT_FOR_NETHERITE_TOOL, 2031, 10.0F, 4.0F, 15, TagKey.create(Registries.ITEM,ResourceLocation.fromNamespaceAndPath("end_reborn", "featherzeal_tool_materials")));

    private Item.Properties applyCommonProperties(Item.Properties properties) {
        return properties.durability(this.durability).repairable(this.repairItems).enchantable(this.enchantmentValue);

    }

    public Item.Properties applyToolProperties(Item.Properties properties, TagKey<Block> mineableBlocks, float attackDamage, float attackSpeed) {
        HolderGetter<Block> holderGetter = BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.BLOCK);
        return this.applyCommonProperties(properties)
                .component(
                        DataComponents.TOOL,
                        new Tool(
                                List.of(
                                        Tool.Rule.deniesDrops(holderGetter.getOrThrow(this.incorrectBlocksForDrops)),
                                        Tool.Rule.minesAndDrops(holderGetter.getOrThrow(mineableBlocks), this.speed)
                                ),
                                1.0F,
                                1,
                                true
                        )
                )
                .attributes(this.createToolAttributes(attackDamage, attackSpeed));
    }

    private ItemAttributeModifiers createToolAttributes(float attackDamage, float attackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(
                        Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, (double)(attackDamage + this.attackDamageBonus), AttributeModifier.Operation.ADD_VALUE),
                        EquipmentSlotGroup.MAINHAND
                )
                .add(
                        Attributes.ATTACK_SPEED,
                        new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, (double)attackSpeed, AttributeModifier.Operation.ADD_VALUE),
                        EquipmentSlotGroup.MAINHAND
                )
                .build();
    }

    public Item.Properties applySwordProperties(Item.Properties properties, float attackDamage, float attackSpeed) {
        HolderGetter<Block> holderGetter = BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.BLOCK);
        return this.applyCommonProperties(properties)
                .component(
                        DataComponents.TOOL,
                        new Tool(
                                List.of(
                                        Tool.Rule.minesAndDrops(HolderSet.direct(Blocks.COBWEB.builtInRegistryHolder()), 15.0F),
                                        Tool.Rule.overrideSpeed(holderGetter.getOrThrow(BlockTags.SWORD_EFFICIENT), 1.5F)
                                ),
                                1.0F,
                                2,
                                false
                        )
                )
                .attributes(this.createSwordAttributes(attackDamage, attackSpeed));
    }

    private ItemAttributeModifiers createSwordAttributes(float attackDamage, float attackSpeed) {
        return ItemAttributeModifiers.builder()
                .add(
                        Attributes.ATTACK_DAMAGE,
                        new AttributeModifier(Item.BASE_ATTACK_DAMAGE_ID, (double)(attackDamage + this.attackDamageBonus), AttributeModifier.Operation.ADD_VALUE),
                        EquipmentSlotGroup.MAINHAND
                )
                .add(
                        Attributes.ATTACK_SPEED,
                        new AttributeModifier(Item.BASE_ATTACK_SPEED_ID, (double)attackSpeed, AttributeModifier.Operation.ADD_VALUE),
                        EquipmentSlotGroup.MAINHAND
                )
                .build();
    }
}