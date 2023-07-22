package com.ianm1647.farmersknives.registry;

import com.ianm1647.farmersknives.FarmersKnives;
import com.ianm1647.farmersknives.item.*;
import com.nhoryzon.mc.farmersdelight.FarmersDelightMod;
import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModRegistry {
    public static void registerThis() {
        registerItems();
    }

    public static void registerItems() {
        if (FabricLoader.getInstance().isModLoaded("adabraniummod")) {
            ItemList.VIBRANIUM_KNIFE = knife("vibranium_knife", new KnifeItem(ToolMaterials.VIBRANIUM,
                    new FabricItemSettings()));
            ItemList.ADAMANTIUM_KNIFE = knife("adamantium_knife", new KnifeItem(ToolMaterials.ADAMANTIUM,
                    new FabricItemSettings()));
            ItemList.NETHER_BRICK_KNIFE = knife("nether_brick_knife", new KnifeItem(ToolMaterials.NETHER_BRICK,
                    new FabricItemSettings().fireproof()));
        }
        if (FabricLoader.getInstance().isModLoaded("additionaladditions")) {
            ItemList.ROSE_GOLD_KNIFE = knife("rose_gold_knife", new KnifeItem(ToolMaterials.ROSE_GOLD,
                    new FabricItemSettings()));
            ItemList.GILDED_NETHERITE_KNIFE = knife("gilded_netherite_knife", new KnifeItem(ToolMaterials.GILDED_NETHERITE,
                    new FabricItemSettings().fireproof()));
        }
        if (FabricLoader.getInstance().isModLoaded("advancednetherite")) {
            ItemList.NETHERITE_IRON_KNIFE = knife("netherite_iron_knife", new KnifeItem(ToolMaterials.NETHERITE_IRON,
                    new FabricItemSettings().fireproof()));
            ItemList.NETHERITE_GOLD_KNIFE = knife("netherite_gold_knife", new KnifeItem(ToolMaterials.NETHERITE_GOLD,
                    new FabricItemSettings().fireproof()));
            ItemList.NETHERITE_EMERALD_KNIFE = knife("netherite_emerald_knife", new KnifeItem(ToolMaterials.NETHERITE_EMERALD,
                    new FabricItemSettings().fireproof()));
            ItemList.NETHERITE_DIAMOND_KNIFE = knife("netherite_diamond_knife", new KnifeItem(ToolMaterials.NETHERITE_DIAMOND,
                    new FabricItemSettings().fireproof()));
        }
        if (FabricLoader.getInstance().isModLoaded("mantori")) {
            ItemList.CHITIN_KNIFE = knife("chitin_knife", new KnifeItem(ToolMaterials.CHITIN,
                    new FabricItemSettings()));
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            ItemList.AETERNIUM_KNIFE = knife("aeternium_knife", new KnifeItem(ToolMaterials.AETERNIUM,
                    new FabricItemSettings().fireproof()));
            ItemList.THALLASIUM_KNIFE = knife("thallasium_knife", new KnifeItem(ToolMaterials.THALLASIUM,
                    new FabricItemSettings()));
            ItemList.TERMINITE_KNIFE = knife("terminite_knife", new KnifeItem(ToolMaterials.TERMINITE,
                    new FabricItemSettings()));
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            ItemList.CINCINNASITE_KNIFE = knife("cincinnasite_knife", new KnifeItem(ToolMaterials.CINCINNASITE,
                    new FabricItemSettings().fireproof()));
            ItemList.CINCINNASITE_DIAMOND_KNIFE = knife("cincinnasite_knife_diamond", new KnifeItem(ToolMaterials.CINCINNASITE_DIAMOND,
                    new FabricItemSettings().fireproof()));
            ItemList.NETHER_RUBY_KNIFE = knife("nether_ruby_knife", new KnifeItem(ToolMaterials.NETHER_RUBY,
                    new FabricItemSettings().fireproof()));
        }
        if (FabricLoader.getInstance().isModLoaded("byg")) {
            ItemList.PENDORITE_KNIFE = knife("pendorite_knife", new KnifeItem(ToolMaterials.PENDORITE,
                    new FabricItemSettings()));
        }
        if (FabricLoader.getInstance().isModLoaded("conjuring")) {
            ItemList.SOUL_ALLOY_KNIFE = knife("soul_alloy_knife", new KnifeItem(ToolMaterials.SOUL_ALLOY,
                    new FabricItemSettings().fireproof()));
        }
        if (FabricLoader.getInstance().isModLoaded("deeperdarker")) {
            ItemList.WARDEN_KNIFE = knife("warden_knife", new KnifeItem(ToolMaterials.WARDEN,
                    new FabricItemSettings().fireproof()));
        }
        if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
            ItemList.DRAGON_KNIFE = knife("dragon_knife", new KnifeItem(ToolMaterials.DRAGON,
                    new FabricItemSettings().fireproof()));
        }
        if (FabricLoader.getInstance().isModLoaded("emerald_tools")) {
            ItemList.EMERALD_KNIFE = knife("emerald_knife", new KnifeItem(ToolMaterials.EMERALD,
                    new FabricItemSettings()));
            ItemList.RUBY_KNIFE = knife("ruby_knife", new KnifeItem(ToolMaterials.RUBY,
                    new FabricItemSettings()));
            ItemList.AMETHYST_KNIFE = knife("amethyst_knife", new KnifeItem(ToolMaterials.AMETHYST,
                    new FabricItemSettings()));
            ItemList.OBSIDIAN_KNIFE = knife("obsidian_knife", new KnifeItem(ToolMaterials.OBSIDIAN,
                    new FabricItemSettings()));
            if (!FabricLoader.getInstance().isModLoaded("mythic_metals")) {
                ItemList.STEEL_KNIFE_ET = knife("steel_knife_et", new KnifeItem(ToolMaterials.STEEL_ET,
                        new FabricItemSettings()));
                ItemList.COPPER_KNIFE_ET = knife("copper_knife_et", new KnifeItem(ToolMaterials.COPPER_ET,
                        new FabricItemSettings()));
            }
        }
        if (FabricLoader.getInstance().isModLoaded("enderitemod")) {
            ItemList.ENDERITE_KNIFE = knife("enderite_knife", new KnifeItem(ToolMaterials.ENDERITE,
                    new FabricItemSettings().fireproof()));
        }
        if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            ItemList.GOBBER_KNIFE = knife("gobber_knife", new KnifeItem(ToolMaterials.GOBBER,
                    new FabricItemSettings()));
            ItemList.NETHER_GOBBER_KNIFE = knife("nether_gobber_knife", new KnifeItem(ToolMaterials.GOBBER_NETHER,
                    new FabricItemSettings()));
            ItemList.END_GOBBER_KNIFE = knife("end_gobber_knife", new KnifeItem(ToolMaterials.GOBBER_END,
                    new FabricItemSettings().fireproof()));
        }
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {
            ItemList.ADAMANTITE_KNIFE = knife("adamantite_knife", new KnifeItem(ToolMaterials.ADAMANTITE,
                    new FabricItemSettings()));
            ItemList.AQUARIUM_KNIFE = knife("aquarium_knife", new KnifeItem(ToolMaterials.AQUARIUM,
                    new FabricItemSettings()));
            ItemList.BANGLUM_KNIFE = knife("banglum_knife", new KnifeItem(ToolMaterials.BANGLUM,
                    new FabricItemSettings()));
            ItemList.BRONZE_KNIFE = knife("bronze_knife", new KnifeItem(ToolMaterials.BRONZE,
                    new FabricItemSettings()));
            ItemList.CARMOT_KNIFE = knife("carmot_knife", new KnifeItem(ToolMaterials.CARMOT,
                    new FabricItemSettings()));
            ItemList.CELESTIUM_KNIFE = knife("celestium_knife", new KnifeItem(ToolMaterials.CELESTIUM,
                    new FabricItemSettings()));
            ItemList.COPPER_KNIFE_MM = knife("copper_knife_mm", new KnifeItem(ToolMaterials.COPPER_MM,
                    new FabricItemSettings()));
            ItemList.DURASTEEL_KNIFE = knife("durasteel_knife", new KnifeItem(ToolMaterials.DURASTEEL,
                    new FabricItemSettings()));
            ItemList.HALLOWED_KNIFE = knife("hallowed_knife", new KnifeItem(ToolMaterials.HALLOWED,
                    new FabricItemSettings()));
            ItemList.KYBER_KNIFE = knife("kyber_knife", new KnifeItem(ToolMaterials.KYBER,
                    new FabricItemSettings()));
            ItemList.LEGENDARY_BANGLUM_KNIFE = knife("legendary_banglum_knife", new KnifeItem(ToolMaterials.LEGENDARY_BANGLUM,
                    new FabricItemSettings()));
            ItemList.METALLURGIUM_KNIFE = knife("metallurgium_knife", new KnifeItem(ToolMaterials.METALLURGIUM,
                    new FabricItemSettings()));
            ItemList.MYTHRIL_KNIFE = knife("mythril_knife", new KnifeItem(ToolMaterials.MYTHRIL,
                    new FabricItemSettings()));
            ItemList.ORICHALCUM_KNIFE = knife("orichalcum_knife", new KnifeItem(ToolMaterials.ORICHALCUM,
                    new FabricItemSettings()));
            ItemList.OSMIUM_KNIFE = knife("osmium_knife", new KnifeItem(ToolMaterials.OSMIUM,
                    new FabricItemSettings()));
            ItemList.PALLADIUM_KNIFE = knife("palladium_knife", new KnifeItem(ToolMaterials.PALLADIUM,
                    new FabricItemSettings().fireproof()));
            ItemList.PROMETHEUM_KNIFE = knife("prometheum_knife", new KnifeItem(ToolMaterials.PROMETHEUM,
                    new FabricItemSettings()));
            ItemList.QUADRILLUM_KNIFE = knife("quadrillum_knife", new KnifeItem(ToolMaterials.QUADRILLUM,
                    new FabricItemSettings()));
            ItemList.RUNITE_KNIFE = knife("runite_knife", new KnifeItem(ToolMaterials.RUNITE,
                    new FabricItemSettings()));
            ItemList.STAR_PLATINUM_KNIFE = knife("star_platinum_knife", new KnifeItem(ToolMaterials.STAR_PLATINUM,
                    new FabricItemSettings()));
            ItemList.STEEL_KNIFE_MM = knife("steel_knife_mm", new KnifeItem(ToolMaterials.STEEL_MM,
                    new FabricItemSettings()));
            ItemList.STORMYX_KNIFE = knife("stormyx_knife", new KnifeItem(ToolMaterials.STORMYX,
                    new FabricItemSettings()));
        }
        if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
            ItemList.IRONWOOD_KNIFE = knife("ironwood_knife", new KnifeItem(ToolMaterials.IRONWOOD,
                    new FabricItemSettings()));
            ItemList.FIERY_KNIFE = knife("fiery_knife", new KnifeItem(ToolMaterials.FIERY,
                    new FabricItemSettings().fireproof()));
            ItemList.STEELEAF_KNIFE = knife("steeleaf_knife", new KnifeItem(ToolMaterials.STEELEAF,
                    new FabricItemSettings()));
            ItemList.KNIGHTMETAL_KNIFE = knife("knightmetal_knife", new KnifeItem(ToolMaterials.KNIGHTMETAL,
                    new FabricItemSettings()));
        }
        if (FabricLoader.getInstance().isModLoaded("winterly")) {
            ItemList.CRYOMARBLE_KNIFE = knife("cryomarble_knife", new KnifeItem(net.minecraft.item.ToolMaterials.DIAMOND, new FabricItemSettings()));
        }
    }

    private static Item knife(String name, Item item) {
        ItemGroupEvents.modifyEntriesEvent(FarmersDelightMod.ITEM_GROUP).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(FarmersKnives.MODID, name), item);
    }
}
