package com.ianm1647.farmersknives.registry;

import com.ianm1647.farmersknives.FKPlatform;
import com.ianm1647.farmersknives.FarmersKnives;
import dev.architectury.platform.Platform;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class FKItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(FarmersKnives.MOD_ID, Registries.ITEM);

    public static final RegistrySupplier<Item> CREATIVE_TAB_KNIFE = ITEMS.register(
            "creative_tab_knife", () -> new Item(
                    new Item.Properties()
                            .stacksTo(1)
            ));

    public static void init() {
        ITEMS.register();

        if (Platform.isModLoaded("advancednetherite")) {
            RegistrySupplier<Item> NETHERITE_IRON_KNIFE = ITEMS.register(
                    "netherite_iron_knife", () -> FKPlatform.createKnifeItem(FKTiers.NETHERITE_IRON,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> NETHERITE_GOLD_KNIFE = ITEMS.register(
                    "netherite_gold_knife", () -> FKPlatform.createKnifeItem(FKTiers.NETHERITE_GOLD,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> NETHERITE_EMERALD_KNIFE = ITEMS.register(
                    "netherite_emerald_knife", () -> FKPlatform.createKnifeItem(FKTiers.NETHERITE_EMERALD,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> NETHERITE_DIAMOND_KNIFE = ITEMS.register(
                    "netherite_diamond_knife", () -> FKPlatform.createKnifeItem(FKTiers.NETHERITE_DIAMOND,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
        }

        if (Platform.isModLoaded("betterend")) {
            RegistrySupplier<Item> AETERNIUM_KNIFE = ITEMS.register(
                    "aeternium_knife", () -> FKPlatform.createKnifeItem(FKTiers.AETERNIUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> THALLASIUM_KNIFE = ITEMS.register(
                    "thallasium_knife", () -> FKPlatform.createKnifeItem(FKTiers.THALLASIUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> TERMINITE_KNIFE = ITEMS.register(
                    "terminite_knife", () -> FKPlatform.createKnifeItem(FKTiers.TERMINITE,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
        }

        if (Platform.isModLoaded("betternether")) {
            RegistrySupplier<Item> CINCINNASITE_KNIFE = ITEMS.register(
                    "cincinnasite_knife", () -> FKPlatform.createKnifeItem(FKTiers.CINCINNASITE,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> CINCINNASITE_DIAMOND_KNIFE = ITEMS.register(
                    "cincinnasite_diamond_knife", () -> FKPlatform.createKnifeItem(FKTiers.CINCINNASITE_DIAMOND,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> NETHER_RUBY_KNIFE = ITEMS.register(
                    "nether_ruby_knife", () -> FKPlatform.createKnifeItem(FKTiers.NETHER_RUBY,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
        }

        if (Platform.isModLoaded("deeperdarker")) {
            RegistrySupplier<Item> WARDEN_KNIFE = ITEMS.register(
                    "warden_knife", () -> FKPlatform.createKnifeItem(FKTiers.WARDEN,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
        }

        if (Platform.isModLoaded("dragonloot")) {
            RegistrySupplier<Item> DRAGON_KNIFE = ITEMS.register(
                    "dragon_knife", () -> FKPlatform.createKnifeItem(FKTiers.DRAGON,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
        }

        if (Platform.isModLoaded("emerald_tools")) {
            RegistrySupplier<Item> EMERALD_KNIFE = ITEMS.register(
                    "emerald_knife", () -> FKPlatform.createKnifeItem(FKTiers.EMERALD,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> RUBY_KNIFE = ITEMS.register(
                    "ruby_knife", () -> FKPlatform.createKnifeItem(FKTiers.RUBY,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> AMETHYST_KNIFE = ITEMS.register(
                    "amethyst_knife", () -> FKPlatform.createKnifeItem(FKTiers.AMETHYST,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> STEEL_ET_KNIFE = ITEMS.register(
                    "steel_knife_et", () -> FKPlatform.createKnifeItem(FKTiers.STEEL_ET,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> OBSIDIAN_KNIFE = ITEMS.register(
                    "obsidian_knife", () -> FKPlatform.createKnifeItem(FKTiers.OBSIDIAN,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> COPPER_ET_KNIFE = ITEMS.register(
                    "copper_knife_et", () -> FKPlatform.createKnifeItem(FKTiers.COPPER_ET,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
        }

        if (Platform.isModLoaded("enderitemod")) {
            RegistrySupplier<Item> ENDERITE_KNIFE = ITEMS.register(
                    "enderite_knife", () -> FKPlatform.createKnifeItem(FKTiers.ENDERITE,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
        }

        if (Platform.isModLoaded("gobber2")) {
            RegistrySupplier<Item> GOBBER_KNIFE = ITEMS.register(
                    "gobber_knife", () -> FKPlatform.createKnifeItem(FKTiers.GOBBER,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> GOBBER_NETHER_KNIFE = ITEMS.register(
                    "gobber_knife", () -> FKPlatform.createKnifeItem(FKTiers.GOBBER_NETHER,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB))
            );
            RegistrySupplier<Item> GOBBER_END_KNIFE = ITEMS.register(
                    "gobber_knife", () -> FKPlatform.createKnifeItem(FKTiers.GOBBER_END,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
        }
        if (Platform.isModLoaded("mythicmetals")) {
            RegistrySupplier<Item> ADAMANTITE_KNIFE = ITEMS.register(
                    "adamantite_knife", () -> FKPlatform.createKnifeItem(FKTiers.ADAMANTITE,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> AQUARIUM_KNIFE = ITEMS.register(
                    "aquarium_knife", () -> FKPlatform.createKnifeItem(FKTiers.AQUARIUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> BANGLUM_KNIFE = ITEMS.register(
                    "banglum_knife", () -> FKPlatform.createKnifeItem(FKTiers.BANGLUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> BRONZE_KNIFE = ITEMS.register(
                    "bronze_knife", () -> FKPlatform.createKnifeItem(FKTiers.BRONZE,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> CARMOT_KNIFE = ITEMS.register(
                    "carmot_knife", () -> FKPlatform.createKnifeItem(FKTiers.CARMOT,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> CELESTIUM_KNIFE = ITEMS.register(
                    "celestium_knife", () -> FKPlatform.createKnifeItem(FKTiers.CELESTIUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> COPPER_KNIFE_MM = ITEMS.register(
                    "copper_knife_mm", () -> FKPlatform.createKnifeItem(FKTiers.COPPER_MM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> DURASTEEL_KNIFE = ITEMS.register(
                    "durasteel_knife", () -> FKPlatform.createKnifeItem(FKTiers.DURASTEEL,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> HALLOWED_KNIFE = ITEMS.register(
                    "hallowed_knife", () -> FKPlatform.createKnifeItem(FKTiers.HALLOWED,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> KYBER_KNIFE = ITEMS.register(
                    "kyber_knife", () -> FKPlatform.createKnifeItem(FKTiers.KYBER,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> LEGENDARY_BANGLUM_KNIFE = ITEMS.register(
                    "legendary_banglum_knife", () -> FKPlatform.createKnifeItem(FKTiers.LEGENDARY_BANGLUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> METALLURGIUM_KNIFE = ITEMS.register(
                    "metallurgium_knife", () -> FKPlatform.createKnifeItem(FKTiers.METALLURGIUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> MYTHRIL_KNIFE = ITEMS.register(
                    "mythril_knife", () -> FKPlatform.createKnifeItem(FKTiers.MYTHRIL,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> ORICHALCUM_KNIFE = ITEMS.register(
                    "orichalcum_knife", () -> FKPlatform.createKnifeItem(FKTiers.ORICHALCUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> OSMIUM_KNIFE = ITEMS.register(
                    "osmium_knife", () -> FKPlatform.createKnifeItem(FKTiers.OSMIUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> PALLADIUM_KNIFE = ITEMS.register(
                    "palladium_knife", () -> FKPlatform.createKnifeItem(FKTiers.PALLADIUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> PROMETHEUM_KNIFE = ITEMS.register(
                    "prometheum_knife", () -> FKPlatform.createKnifeItem(FKTiers.PROMETHEUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> QUADRILLUM_KNIFE = ITEMS.register(
                    "quadrillum_knife", () -> FKPlatform.createKnifeItem(FKTiers.QUADRILLUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> RUNITE_KNIFE = ITEMS.register(
                    "runite_knife", () -> FKPlatform.createKnifeItem(FKTiers.RUNITE,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> STAR_PLATINUM_KNIFE = ITEMS.register(
                    "star_platinum_knife", () -> FKPlatform.createKnifeItem(FKTiers.STAR_PLATINUM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> STEEL_KNIFE_MM = ITEMS.register(
                    "steel_knife_mm", () -> FKPlatform.createKnifeItem(FKTiers.STEEL_MM,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> STORMYX_KNIFE = ITEMS.register(
                    "stormyx_knife", () -> FKPlatform.createKnifeItem(FKTiers.STORMYX,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> TIDESINGER_KNIFE = ITEMS.register(
                    "tidesinger_knife", () -> FKPlatform.createKnifeItem(FKTiers.TIDESINGER,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
        }

        if (Platform.isModLoaded("progression_reborn")) {
            RegistrySupplier<Item> COPPER_KNIFE = ITEMS.register(
                    "copper_knife", () -> FKPlatform.createKnifeItem(FKTiers.COPPER,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> ROSE_KNIFE = ITEMS.register(
                    "rose_knife", () -> FKPlatform.createKnifeItem(FKTiers.ROSE,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
        }

        if (Platform.isModLoaded("twilightforest")) {
            RegistrySupplier<Item> IRONWOOD_KNIFE = ITEMS.register(
                    "ironwood_knife", () -> FKPlatform.createKnifeItem(FKTiers.IRONWOOD,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));

            RegistrySupplier<Item> FIERY_KNIFE = ITEMS.register(
                    "fiery_knife", () -> FKPlatform.createKnifeItem(FKTiers.FIERY,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .fireResistant()
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> STEELEAF_KNIFE = ITEMS.register(
                    "steeleaf_knife", () -> FKPlatform.createKnifeItem(FKTiers.STEELEAF,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
            RegistrySupplier<Item> KNIGHTMETAL_KNIFE = ITEMS.register(
                    "knightmetal_knife", () -> FKPlatform.createKnifeItem(FKTiers.KNIGHTMETAL,
                            new Item.Properties()
                                    .stacksTo(1)
                                    .arch$tab(FKCreativeTab.FARMERS_KNIVES_TAB)
                    ));
        }
    }
}