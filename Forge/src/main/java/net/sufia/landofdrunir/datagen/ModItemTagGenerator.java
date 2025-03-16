package net.sufia.landofdrunir.datagen;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.init.ModBlocks;
import net.sufia.landofdrunir.init.ModItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput p_275343_, CompletableFuture<HolderLookup.Provider> p_275729_,
                               CompletableFuture<TagLookup<Block>> p_275322_, @Nullable ExistingFileHelper existingFileHelper) {
        super(p_275343_, p_275729_, p_275322_, DrunirMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(
                        ModItems.DRUNITE_HELMET.get(),
                        ModItems.DRUNITE_CHESTPLATE.get(),
                        ModItems.DRUNITE_LEGGINGS.get(),
                        ModItems.DRUNITE_BOOTS.get(),
                        ModItems.GALEON_HELMET.get(),
                        ModItems.GALEON_CHESTPLATE.get(),
                        ModItems.GALEON_LEGGINGS.get(),
                        ModItems.GALEON_BOOTS.get(),
                        ModItems.PLASMITE_HELMET.get(),
                        ModItems.PLASMITE_CHESTPLATE.get(),
                        ModItems.PLASMITE_LEGGINGS.get(),
                        ModItems.PLASMITE_BOOTS.get()
                );
        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.FIR_LOG.get().asItem())
                .add(ModBlocks.FIR_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_FIR_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_FIR_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_BIRCH_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_ACACIA_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_CHERRY_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_DARK_OAK_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_JUNGLE_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_MANGROVE_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_OAK_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_SPRUCE_LOG.get().asItem())

                .add(ModBlocks.HOLLOW_MOSSY_BIRCH_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_MOSSY_ACACIA_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_MOSSY_CHERRY_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_MOSSY_DARK_OAK_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_MOSSY_JUNGLE_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_MOSSY_MANGROVE_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_MOSSY_OAK_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_MOSSY_SPRUCE_LOG.get().asItem())
                .add(ModBlocks.HOLLOW_MOSSY_FIR_LOG.get().asItem())

                .add(ModBlocks.HOLLOW_FIR_LOG.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.FIR_PLANKS.get().asItem());
    }

}