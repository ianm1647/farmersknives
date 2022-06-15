package com.ianm1647.farmersknives.registry;

import com.ianm1647.farmersknives.FarmersKnives;
import com.ianm1647.farmersknives.item.ItemList;
import com.ianm1647.farmersknives.item.ToolMaterials;
import com.ianm1647.farmersknives.item.TwilightKnifeItem;
import com.ianm1647.farmersknives.item.NetherKnifeItem;
import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModRegistry {
    private static final ItemGroup group = ItemGroup.COMBAT;

    public static void registerThis() {
        registerItems();
    }

    public static void registerItems() {
        if (FabricLoader.getInstance().isModLoaded("additionaladditions")) {
            ItemList.ROSE_GOLD_KNIFE = knife("rose_gold_knife", ToolMaterials.ROSE_GOLD,
                    new FabricItemSettings().group(group));
            ItemList.GILDED_NETHERITE_KNIFE = knife("gilded_netherite_knife", ToolMaterials.GILDED_NETHERITE,
                    new FabricItemSettings().group(group).fireproof());
        }
        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            ItemList.AETERNIUM_KNIFE = knife("aeternium_knife", ToolMaterials.AETERNIUM,
                    new FabricItemSettings().group(group).fireproof());
            ItemList.THALLASIUM_KNIFE = knife("thallasium_knife", ToolMaterials.THALLASIUM,
                    new FabricItemSettings().group(group));
            ItemList.TERMINITE_KNIFE = knife("terminite_knife", ToolMaterials.TERMINITE,
                    new FabricItemSettings().group(group));
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            ItemList.CINCINNASITE_KNIFE = netherKnife("cincinnasite_knife", ToolMaterials.CINCINNASITE);
            ItemList.CINCINNASITE_DIAMOND_KNIFE = netherKnife("cincinnasite_knife_diamond", ToolMaterials.CINCINNASITE_DIAMOND);
            ItemList.NETHER_RUBY_KNIFE = netherKnife("nether_ruby_knife", ToolMaterials.NETHER_RUBY);
        }
        if (FabricLoader.getInstance().isModLoaded("byg")) {
            ItemList.PENDORITE_KNIFE = knife("pendorite_knife", ToolMaterials.PENDORITE,
                    new FabricItemSettings().group(group));
        }
        if (FabricLoader.getInstance().isModLoaded("dragonloot")) {
            ItemList.DRAGON_KNIFE = knife("dragon_knife", ToolMaterials.DRAGON,
                    new FabricItemSettings().group(group).fireproof());
        }
        if (FabricLoader.getInstance().isModLoaded("emerald_tools")) {
            ItemList.EMERALD_KNIFE = knife("emerald_knife", ToolMaterials.EMERALD,
                    new FabricItemSettings().group(group));
            ItemList.RUBY_KNIFE = knife("ruby_knife", ToolMaterials.RUBY,
                    new FabricItemSettings().group(group));
            ItemList.AMETHYST_KNIFE = knife("amethyst_knife", ToolMaterials.AMETHYST,
                    new FabricItemSettings().group(group));
            ItemList.OBSIDIAN_KNIFE = knife("obsidian_knife", ToolMaterials.OBSIDIAN,
                    new FabricItemSettings().group(group));
            if (!FabricLoader.getInstance().isModLoaded("mythic_metals")) {
                ItemList.STEEL_KNIFE = knife("steel_knife_et", ToolMaterials.STEEL,
                        new FabricItemSettings().group(group));
                ItemList.COPPER_KNIFE = knife("copper_knife_et", ToolMaterials.COPPER_ET,
                        new FabricItemSettings().group(group));
            }
        }
        if (FabricLoader.getInstance().isModLoaded("enderitemod")) {
            ItemList.ENDERITE_KNIFE = knife("enderite_knife", ToolMaterials.ENDERITE,
                    new FabricItemSettings().group(group).fireproof());
        }
        if (FabricLoader.getInstance().isModLoaded("gobber2")) {
            ItemList.GOBBER_KNIFE = knife("gobber_knife", ToolMaterials.GOBBER,
                    new FabricItemSettings().group(group));
            ItemList.NETHER_GOBBER_KNIFE = knife("nether_gobber_knife", ToolMaterials.GOBBER_NETHER,
                    new FabricItemSettings().group(group));
            ItemList.END_GOBBER_KNIFE = knife("end_gobber_knife", ToolMaterials.GOBBER_END,
                    new FabricItemSettings().group(group).fireproof());
        }
        if (FabricLoader.getInstance().isModLoaded("mythicmetals")) {

        }
        if (FabricLoader.getInstance().isModLoaded("twilightforest")) {
            ItemList.IRONWOOD_KNIFE = twilightKnife("ironwood_knife", ToolMaterials.IRONWOOD,
                    new FabricItemSettings().group(group));
            ItemList.FIERY_KNIFE = twilightKnife("fiery_knife", ToolMaterials.FIERY,
                    new FabricItemSettings().group(group).fireproof());
            ItemList.STEELEAF_KNIFE = twilightKnife("steeleaf_knife", ToolMaterials.STEELEAF,
                    new FabricItemSettings().group(group));
            ItemList.KNIGHTMETAL_KNIFE = twilightKnife("knightmetal_knife", ToolMaterials.KNIGHTMETAL,
                    new FabricItemSettings().group(group));
        }
    }

    private static Item knife(String name, ToolMaterial material, Item.Settings settings) {
        return Registry.register(Registry.ITEM, new Identifier(FarmersKnives.MODID, name),
                new KnifeItem(material, settings));
    }

    private static Item netherKnife(String name, ToolMaterial material) {
        return Registry.register(Registry.ITEM, new Identifier(FarmersKnives.MODID, name),
                new NetherKnifeItem(material, new FabricItemSettings().group(group)));
    }

    private static Item twilightKnife(String name, ToolMaterial material, Item.Settings settings) {
        return Registry.register(Registry.ITEM, new Identifier(FarmersKnives.MODID, name),
                new TwilightKnifeItem(material, settings));
    }
}
