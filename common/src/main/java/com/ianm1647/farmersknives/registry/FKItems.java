package com.ianm1647.farmersknives.registry;

import com.ianm1647.farmersknives.FKPlatform;
import com.ianm1647.farmersknives.FarmersKnives;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.DamageResistant;

public class FKItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Item> ADVANCED_NETHERITE_ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Item> ENDERITE_MOD_ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Item> PROGRESSION_REBORN_ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);
    public static final DeferredRegister<Item> END_REBORN_ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);

    public static float knifeAttackDamage = 0.5F;
    public static float knifeAttackSpeed = -2F;

    public static final RegistrySupplier<Item> CREATIVE_TAB_KNIFE = ITEMS.register(
            "creative_tab_knife", () -> new Item(
                    new Item.Properties()
                            .stacksTo(1)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("creative_tab_knife")))
            ));

    // Advanced Netherite

    public static final RegistrySupplier<Item> NETHERITE_IRON_KNIFE = ADVANCED_NETHERITE_ITEMS.register(
            "netherite_iron_knife", () -> FKPlatform.createKnifeItem(
                    new Item.Properties()
                            .attributes(FKPlatform.getKnifeItem(FKToolMaterial.NETHERITE_IRON, knifeAttackDamage, knifeAttackSpeed))
                            .stacksTo(1)
                            .fireResistant()
                            .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("netherite_iron_knife")))
            ));
    public static final RegistrySupplier<Item> NETHERITE_GOLD_KNIFE = ADVANCED_NETHERITE_ITEMS.register(
            "netherite_gold_knife", () -> FKPlatform.createKnifeItem(
                    new Item.Properties()
                            .attributes(FKPlatform.getKnifeItem(FKToolMaterial.NETHERITE_GOLD, knifeAttackDamage, knifeAttackSpeed))
                            .stacksTo(1)
                            .fireResistant()
                            .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("netherite_gold_knife")))
            ));
    public static final RegistrySupplier<Item> NETHERITE_EMERALD_KNIFE = ADVANCED_NETHERITE_ITEMS.register(
            "netherite_emerald_knife", () -> FKPlatform.createKnifeItem(
                    new Item.Properties()
                            .attributes(FKPlatform.getKnifeItem(FKToolMaterial.NETHERITE_EMERALD, knifeAttackDamage, knifeAttackSpeed))
                            .stacksTo(1)
                            .fireResistant()
                            .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("netherite_emerald_knife")))
            ));
    public static final RegistrySupplier<Item> NETHERITE_DIAMOND_KNIFE = ADVANCED_NETHERITE_ITEMS.register(
            "netherite_diamond_knife", () -> FKPlatform.createKnifeItem(
                    new Item.Properties()
                            .attributes(FKPlatform.getKnifeItem(FKToolMaterial.NETHERITE_DIAMOND, knifeAttackDamage, knifeAttackSpeed))
                            .stacksTo(1)
                            .fireResistant()
                            .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("netherite_diamond_knife")))
            ));

    // Enderite Mod

    public static final RegistrySupplier<Item> ENDERITE_KNIFE = ENDERITE_MOD_ITEMS.register(
            "enderite_knife", () -> FKPlatform.createKnifeItem(
                    new Item.Properties()
                            .attributes(FKPlatform.getKnifeItem(FKToolMaterial.ENDERITE, knifeAttackDamage, knifeAttackSpeed))
                            .stacksTo(1)
                            .fireResistant()
                            .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("enderite_knife")))
            ));

    // End Reborn

    public static final RegistrySupplier<Item> REMNANT_KNIFE = END_REBORN_ITEMS.register(
            "remnant_knife", () -> FKPlatform.createKnifeItem(
                    new Item.Properties()
                            .attributes(FKPlatform.getKnifeItem(FKToolMaterial.REMNANT, knifeAttackDamage, knifeAttackSpeed))
                            .stacksTo(1)
                            .component(DataComponents.DAMAGE_RESISTANT, new DamageResistant(DamageTypeTags.IS_EXPLOSION))
                            .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("remnant_knife")))
            ));
    public static final RegistrySupplier<Item> FEATHERZEAL_KNIFE = END_REBORN_ITEMS.register(
            "featherzeal_knife", () -> FKPlatform.createKnifeItem(
                    new Item.Properties()
                            .attributes(FKPlatform.getKnifeItem(FKToolMaterial.FEATHERZEAL, knifeAttackDamage, knifeAttackSpeed))
                            .stacksTo(1)
                            .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("featherzeal_knife")))
            ));

    // Progression Reborn

    public static final RegistrySupplier<Item> COPPER_KNIFE = PROGRESSION_REBORN_ITEMS.register(
            "copper_knife", () -> FKPlatform.createKnifeItem(
                    new Item.Properties()
                            .attributes(FKPlatform.getKnifeItem(FKToolMaterial.COPPER, knifeAttackDamage, knifeAttackSpeed))
                            .stacksTo(1)
                            .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("copper_knife")))
            ));
    public static final RegistrySupplier<Item> ROSE_KNIFE = PROGRESSION_REBORN_ITEMS.register(
            "rose_knife", () -> FKPlatform.createKnifeItem(
                    new Item.Properties()
                            .attributes(FKPlatform.getKnifeItem(FKToolMaterial.ROSE, knifeAttackDamage, knifeAttackSpeed))
                            .stacksTo(1)
                            .fireResistant()
                            .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                            .setId(ResourceKey.create(Registries.ITEM, FarmersKnives.id("rose_knife")))
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
}