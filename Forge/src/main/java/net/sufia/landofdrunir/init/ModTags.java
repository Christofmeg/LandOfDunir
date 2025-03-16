package net.sufia.landofdrunir.init;

import net.sufia.landofdrunir.DrunirMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {


        public static final TagKey<Block> NEEDS_GALEON_TOOL = tag("needs_galeon_tool");
        public static final TagKey<Block> NEEDS_DRUNITE_TOOL = tag("needs_drunite_tool");

        public static final TagKey<Block> NEEDS_PLASMITE_TOOL = tag("needs_plasmite_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID, name));
        }
    }
}