package com.christofmeg.landofdrunir.common.data;

import com.christofmeg.landofdrunir.CommonConstants;
import com.christofmeg.landofdrunir.common.init.ItemRegistry;
import com.christofmeg.landofdrunir.common.init.TagRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class DrunirItemTagsProvider extends ItemTagsProvider {

    public DrunirItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, TagsProvider<Block> lookup, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, lookup.contentsGetter(), CommonConstants.MOD_ID, existingFileHelper);
    }

    @Override
    public @NotNull String getName() {
        return CommonConstants.MOD_NAME + " - Item Tags";
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider pProvider) {

        tag(TagRegistry.Items.ORES)
                .addTag(TagRegistry.Items.GALEON);

        tag(TagRegistry.Items.GALEON).add(ItemRegistry.GALEON.get());
    }
}