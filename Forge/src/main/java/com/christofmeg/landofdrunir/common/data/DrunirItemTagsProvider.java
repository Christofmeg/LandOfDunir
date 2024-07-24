package com.christofmeg.landofdrunir.common.data;

import com.christofmeg.landofdrunir.CommonConstants;
import com.christofmeg.landofdrunir.common.init.ItemRegistry;
import com.christofmeg.landofdrunir.common.init.TagRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
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

        tag(Tags.Items.RAW_MATERIALS).addTag(TagRegistry.Items.RAW_MATERIALS_GALEON);
        tag(TagRegistry.Items.RAW_MATERIALS_GALEON).add(ItemRegistry.RAW_GALEON.get());

        tag(Tags.Items.GEMS).addTag(TagRegistry.Items.GEMS_GALEON);
        tag(TagRegistry.Items.GEMS_GALEON).add(ItemRegistry.GALEON.get());

    }
}