package com.ianm1647.farmersknives.registry;

import com.ianm1647.farmersknives.FKPlatform;
import com.ianm1647.farmersknives.FarmersKnives;
import com.ianm1647.farmersknives.tag.FKBlockTags;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.DamageResistant;
import net.minecraft.world.item.component.Tool;
import net.minecraft.world.item.component.Weapon;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class FKItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Item> ADVANCED_NETHERITE_ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Item> ENDERITE_MOD_ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Item> PROGRESSION_REBORN_ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Item> END_REBORN_ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> CREATIVE_TAB_KNIFE = ITEMS.register(
            "creative_tab_knife", () -> new Item(
                    new Item.Properties()
                            .stacksTo(1)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("creative_tab_knife")))
            ));

    // Advanced Netherite

    public static final RegistrySupplier<Item> NETHERITE_IRON_KNIFE = ADVANCED_NETHERITE_ITEMS.register(
            "netherite_iron_knife", () -> FKPlatform.createKnifeItem(
                    knifeItem(FKToolMaterial.NETHERITE_IRON, "netherite_iron_knife")
                            .fireResistant()
            ));
    public static final RegistrySupplier<Item> NETHERITE_GOLD_KNIFE = ADVANCED_NETHERITE_ITEMS.register(
            "netherite_gold_knife", () -> FKPlatform.createKnifeItem(
                    knifeItem(FKToolMaterial.NETHERITE_GOLD, "netherite_gold_knife")
                            .fireResistant()
            ));
    public static final RegistrySupplier<Item> NETHERITE_EMERALD_KNIFE = ADVANCED_NETHERITE_ITEMS.register(
            "netherite_emerald_knife", () -> FKPlatform.createKnifeItem(
                    knifeItem(FKToolMaterial.NETHERITE_EMERALD, "netherite_emerald_knife")
                            .fireResistant()
            ));
    public static final RegistrySupplier<Item> NETHERITE_DIAMOND_KNIFE = ADVANCED_NETHERITE_ITEMS.register(
            "netherite_diamond_knife", () -> FKPlatform.createKnifeItem(
                    knifeItem(FKToolMaterial.NETHERITE_DIAMOND, "netherite_diamond_knife")
                            .fireResistant()
            ));

    // Enderite Mod

    public static final RegistrySupplier<Item> ENDERITE_KNIFE = ENDERITE_MOD_ITEMS.register(
            "enderite_knife", () -> FKPlatform.createKnifeItem(
                    knifeItem(FKToolMaterial.ENDERITE, "enderite_knife")
                            .fireResistant()
            ));

    // End Reborn

    public static final RegistrySupplier<Item> REMNANT_KNIFE = END_REBORN_ITEMS.register(
            "remnant_knife", () -> FKPlatform.createKnifeItem(
                    knifeItem(FKToolMaterial.REMNANT, "remnant_knife")
                            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
            ));
    public static final RegistrySupplier<Item> FEATHERZEAL_KNIFE = END_REBORN_ITEMS.register(
            "featherzeal_knife", () -> FKPlatform.createKnifeItem(
                    knifeItem(FKToolMaterial.FEATHERZEAL, "featherzeal_knife")
            ));

    // Progression Reborn

    public static final RegistrySupplier<Item> ROSE_KNIFE = PROGRESSION_REBORN_ITEMS.register(
            "rose_knife", () -> FKPlatform.createKnifeItem(
                    knifeItem(FKToolMaterial.ROSE, "rose_knife")
                            .fireResistant()
            ));

    public static void init() {
        ITEMS.register();

        if (Platform.isModLoaded("advancednetherite")) {
            ADVANCED_NETHERITE_ITEMS.register();
        }

        if (Platform.isModLoaded("enderitemod")) {
            ENDERITE_MOD_ITEMS.register();
        }

        if (Platform.isModLoaded("end_reborn")) {
            END_REBORN_ITEMS.register();
        }

        if (Platform.isModLoaded("progression_reborn")) {
            PROGRESSION_REBORN_ITEMS.register();
        }
    }

    public static Item.Properties knifeItem(ToolMaterial material, String path) {
        HolderGetter<Block> holderGetter = BuiltInRegistries.acquireBootstrapRegistrationLookup(BuiltInRegistries.BLOCK);
        return new Item.Properties()
                .durability(material.durability())
                .repairable(material.repairItems())
                .enchantable(material.enchantmentValue())
                .attributes(FKPlatform.getKnifeItem(material, 0.5F, -2.0F))
                .component(DataComponents.TOOL, new Tool(
                        List.of(
                                Tool.Rule.deniesDrops(holderGetter.getOrThrow(material.incorrectBlocksForDrops())),
                                Tool.Rule.minesAndDrops(holderGetter.getOrThrow(FKBlockTags.MINEABLE_WITH_KNIFE), material.speed())
                        ), 1.0F, 1, false))
                .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id(path)))
                .component(DataComponents.WEAPON, new Weapon(2)
                );
    }
}