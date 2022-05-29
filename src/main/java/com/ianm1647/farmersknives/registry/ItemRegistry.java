package com.ianm1647.farmersknives.registry;

import com.exline.amethystequipment.item.AmethystToolMaterial;
import com.exline.boneequipment.item.BoneToolMaterial;
import com.exline.emeraldequipment.item.EmeraldToolMaterial;
import com.exline.exlinecopperequipment.item.CopperToolMaterial;
import com.exline.obsidianequipment.ModToolMaterials;
import com.ianm1647.farmersknives.FarmersKnives;
import com.ianm1647.farmersknives.item.ItemList;
import com.ianm1647.farmersknives.item.NetherKnifeItem;
import com.nhoryzon.mc.farmersdelight.FarmersDelightMod;
import com.nhoryzon.mc.farmersdelight.item.KnifeItem;
import dqu.additionaladditions.config.Config;
import dqu.additionaladditions.config.ConfigValues;
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

public class ItemRegistry {
    private static final ItemGroup group = FarmersDelightMod.ITEM_GROUP;

    public static void registerItems() {
        if(FabricLoader.getInstance().isModLoaded("additionaladditions")) {
            if(Config.getBool(ConfigValues.ROSE_GOLD)) {
                ItemList.ROSE_GOLD_KNIFE = knife("rose_gold_knife", RoseGoldToolMaterial.MATERIAL,
                        new FabricItemSettings().group(group));
            }
            if(Config.getBool(ConfigValues.GILDED_NETHERITE)) {
                ItemList.GILDED_NETHERITE_KNIFE = knife("gilded_netherite_knife", GildedNetheriteToolMaterial.MATERIAL,
                        new FabricItemSettings().group(group).fireproof());
            }
        }
        if(FabricLoader.getInstance().isModLoaded("amethystequipment")) {
            ItemList.AMETHYST_KNIFE = knife("amethyst_knife", AmethystToolMaterial.INSTANCE,
                    new FabricItemSettings().group(group));
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
        if(FabricLoader.getInstance().isModLoaded("boneequipment")) {
            ItemList.BONE_KNIFE = knife("bone_knife", BoneToolMaterial.INSTANCE,
                    new FabricItemSettings().group(group));
        }
        if(FabricLoader.getInstance().isModLoaded("emeraldequipment")) {
            ItemList.EMERALD_KNIFE = knife("emerald_knife", EmeraldToolMaterial.INSTANCE,
                    new FabricItemSettings().group(group));
        }
        if(FabricLoader.getInstance().isModLoaded("enderitemod")) {
            ItemList.ENDERITE_KNIFE = knife("enderite_knife", EnderiteMaterial.ENDERITE,
                    new FabricItemSettings().group(group).fireproof());
        }
        if(FabricLoader.getInstance().isModLoaded("exlinecopperequipment")) {
            ItemList.COPPER_KNIFE = knife("copper_knife", CopperToolMaterial.INSTANCE,
                    new FabricItemSettings().group(group));
        }
        if(FabricLoader.getInstance().isModLoaded("obsidianequipment")) {
            ItemList.OBSIDIAN_KNIFE = knife("obsidian_knife", ModToolMaterials.OBSIDIAN,
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
