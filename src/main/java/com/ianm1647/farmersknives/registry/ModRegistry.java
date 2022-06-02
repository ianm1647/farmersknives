package com.ianm1647.farmersknives.registry;

import com.ianm1647.farmersknives.FarmersKnives;
import com.ianm1647.farmersknives.item.ItemList;
import com.ianm1647.farmersknives.item.NetherKnifeItem;
import com.kwpugh.emerald_tools.init.ItemInit;
import com.nhoryzon.mc.farmersdelight.FarmersDelightMod;
import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import dqu.additionaladditions.material.GildedNetheriteToolMaterial;
import dqu.additionaladditions.material.RoseGoldToolMaterial;
import net.enderitemc.enderitemod.materials.EnderiteMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import paulevs.betternether.items.materials.BNToolMaterial;
import ru.betterend.item.material.EndToolMaterial;

public class ModRegistry {
    private static final ItemGroup group = FarmersDelightMod.ITEM_GROUP;

    public static void registerThis() {
        registerItems();
    }

    public static void registerItems() {
        if(FabricLoader.getInstance().isModLoaded("additionaladditions")) {
            ItemList.ROSE_GOLD_KNIFE = knife("rose_gold_knife", RoseGoldToolMaterial.MATERIAL,
                    new FabricItemSettings().group(group));
            ItemList.GILDED_NETHERITE_KNIFE = knife("gilded_netherite_knife", GildedNetheriteToolMaterial.MATERIAL,
                    new FabricItemSettings().group(group).fireproof());
        }
        if(FabricLoader.getInstance().isModLoaded("betterend")) {
            ItemList.AETERNIUM_KNIFE = knife("aeternium_knife", EndToolMaterial.AETERNIUM,
                    new FabricItemSettings().group(group).fireproof());
            ItemList.THALLASIUM_KNIFE = knife("thallasium_knife", EndToolMaterial.THALLASIUM,
                    new FabricItemSettings().group(group));
            ItemList.TERMINITE_KNIFE = knife("terminite_knife", EndToolMaterial.TERMINITE,
                    new FabricItemSettings().group(group));
        }
        if(FabricLoader.getInstance().isModLoaded("betternether")) {
            ItemList.CINCINNASITE_KNIFE = netherKnife("cincinnasite_knife", BNToolMaterial.CINCINNASITE);
            ItemList.CINCINNASITE_DIAMOND_KNIFE = netherKnife("cincinnasite_knife_diamond", BNToolMaterial.CINCINNASITE_DIAMOND);
            ItemList.NETHER_RUBY_KNIFE = netherKnife("nether_ruby_knife", BNToolMaterial.NETHER_RUBY);
        }
        if(FabricLoader.getInstance().isModLoaded("enderitemod")) {
            ItemList.ENDERITE_KNIFE = knife("enderite_knife", EnderiteMaterial.ENDERITE,
                    new FabricItemSettings().group(group).fireproof());
        }
        if(FabricLoader.getInstance().isModLoaded("emerald_tools")) {
            ItemList.EMERALD_KNIFE = knife("emerald_knife", ItemInit.EMERALD_TOOL_MATERIAL,
                    new FabricItemSettings().group(group));
            ItemList.RUBY_KNIFE = knife("ruby_knife", ItemInit.RUBY_TOOL_MATERIAL,
                    new FabricItemSettings().group(group));
            ItemList.AMETHYST_KNIFE = knife("amethyst_knife", ItemInit.AMETHYST_TOOL_MATERIAL,
                    new FabricItemSettings().group(group));
            ItemList.STEEL_KNIFE = knife("steel_knife", ItemInit.STEEL_TOOL_MATERIAL,
                    new FabricItemSettings().group(group));
            ItemList.OBSIDIAN_KNIFE = knife("obsidian_knife", ItemInit.OBSIDIAN_TOOL_MATERIAL,
                    new FabricItemSettings().group(group));
            ItemList.COPPER_KNIFE = knife("copper_knife", ItemInit.COPPER_TOOL_MATERIAL,
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
}
