package com.ianm1647.farmersknives.tag;

import com.ianm1647.farmersknives.FarmersKnives;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import org.jetbrains.annotations.NotNull;

public class FKBlockTags {

    public static final TagKey<Block> MINEABLE_WITH_KNIFE = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("farmersdelight", "mineable/knife"));

    @NotNull
    private static TagKey<Block> bind(@NotNull String path) {
        return TagKey.create(Registries.BLOCK, FarmersKnives.id(path));
    }
}