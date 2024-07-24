package com.christofmeg.landofdrunir.common.init;

import com.christofmeg.landofdrunir.CommonConstants;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class TagRegistry {

    public static final class Blocks {
        @SuppressWarnings("unused")
        private static TagKey<Block> vanillaTag(final String path) {
            return BlockTags.create(new ResourceLocation("minecraft", path));
        }

        @SuppressWarnings("unused")
        private static TagKey<Block> modTag(final String path) {
            return BlockTags.create(new ResourceLocation(CommonConstants.MOD_ID, path));
        }

        @SuppressWarnings("unused")
        private static TagKey<Block> forgeTag(final String path) {
            return BlockTags.create(new ResourceLocation("forge", path));
        }


    }

    public static final class Items {
        @SuppressWarnings("unused")
        private static TagKey<Item> vanillaTag(final String path) {
            return ItemTags.create(new ResourceLocation("minecraft", path));
        }

        @SuppressWarnings("unused")
        private static TagKey<Item> modTag(final String path) {
            return ItemTags.create(new ResourceLocation(CommonConstants.MOD_ID, path));
        }

        @SuppressWarnings("unused")
        private static TagKey<Item> forgeTag(final String path) {
            return ItemTags.create(new ResourceLocation("forge", path));
        }

        public static TagKey<Item> ORES = forgeTag("ores");
        public static TagKey<Item> GALEON = forgeTag("ores/galeon");


    }

}