package com.ianm1647.farmersknives.registry;

import com.ianm1647.farmersknives.item.ItemList;
import com.nhoryzon.mc.farmersdelight.tag.Tags;
import net.fabricmc.loader.api.FabricLoader;
import ru.bclib.api.tag.TagAPI;

public class TagRegistry {

    public static void registerTags() {
        if(FabricLoader.getInstance().isModLoaded("additionaladditions")) {
            TagAPI.addItemTag(Tags.KNIVES, ItemList.ROSE_GOLD_KNIFE);
            TagAPI.addItemTag(Tags.KNIVES, ItemList.GILDED_NETHERITE_KNIFE);
        }
        if(FabricLoader.getInstance().isModLoaded("amethystequipment")) {
            TagAPI.addItemTag(Tags.KNIVES, ItemList.AMETHYST_KNIFE);
        }
        if(FabricLoader.getInstance().isModLoaded("betterend")) {
            TagAPI.addItemTag(Tags.KNIVES, ItemList.AETERNIUM_KNIFE);
            TagAPI.addItemTag(Tags.KNIVES, ItemList.THALLASIUM_KNIFE);
            TagAPI.addItemTag(Tags.KNIVES, ItemList.TERMINITE_KNIFE);
        }
        if(FabricLoader.getInstance().isModLoaded("betterend")) {
            TagAPI.addItemTag(Tags.KNIVES, ItemList.CINCINNASITE_KNIFE);
            TagAPI.addItemTag(Tags.KNIVES, ItemList.CINCINNASITE_DIAMOND_KNIFE);
            TagAPI.addItemTag(Tags.KNIVES, ItemList.NETHER_RUBY_KNIFE);
        }
        if(FabricLoader.getInstance().isModLoaded("boneequipment")) {
            TagAPI.addItemTag(Tags.KNIVES, ItemList.BONE_KNIFE);
        }
        if(FabricLoader.getInstance().isModLoaded("emeraldequipment")) {
            TagAPI.addItemTag(Tags.KNIVES, ItemList.EMERALD_KNIFE);
        }
        if(FabricLoader.getInstance().isModLoaded("enderitemod")) {
            TagAPI.addItemTag(Tags.KNIVES, ItemList.ENDERITE_KNIFE);
        }
        if(FabricLoader.getInstance().isModLoaded("exlinecopperequipment")) {
            TagAPI.addItemTag(Tags.KNIVES, ItemList.COPPER_KNIFE);
        }
        if(FabricLoader.getInstance().isModLoaded("obsidianequipment")) {
            TagAPI.addItemTag(Tags.KNIVES, ItemList.OBSIDIAN_KNIFE);
        }
    }
}
