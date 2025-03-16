package net.sufia.landofdrunir.datagen;

import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.init.ModBlocks;
import net.sufia.landofdrunir.init.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import javax.swing.text.html.HTML;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, DrunirMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DRUNITE_BLOCK.get()).add(ModBlocks.DRUNITE_ORE.get()).add(ModBlocks.GALEON_BLOCK.get())
                .add(ModBlocks.GALEON_ORE.get()).add(ModBlocks.PLASMITE_BLOCK.get()).add(ModBlocks.PLASMITE_ORE.get());


        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)
                .add(ModBlocks.DRUNITE_BLOCK.get()).add(ModBlocks.DRUNITE_ORE.get()).add(ModBlocks.GALEON_BLOCK.get())
                .add(ModBlocks.GALEON_ORE.get()).add(ModBlocks.PLASMITE_BLOCK.get()).add(ModBlocks.PLASMITE_ORE.get());
        this.tag(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.FIR_LOG.get())
                .add(ModBlocks.FIR_WOOD.get())
                .add(ModBlocks.STRIPPED_FIR_LOG.get())
                .add(ModBlocks.STRIPPED_FIR_WOOD.get())

                 .add(ModBlocks.HOLLOW_FIR_LOG.get())
                 .add(ModBlocks.HOLLOW_ACACIA_LOG.get())
                .add(ModBlocks.HOLLOW_CHERRY_LOG.get())
                .add(ModBlocks.HOLLOW_DARK_OAK_LOG.get())
                .add(ModBlocks.HOLLOW_JUNGLE_LOG.get())
                .add(ModBlocks.HOLLOW_MANGROVE_LOG.get())
                .add(ModBlocks.HOLLOW_OAK_LOG.get())
                .add(ModBlocks.HOLLOW_SPRUCE_LOG.get())
                .add(ModBlocks.HOLLOW_BIRCH_LOG.get())

                .add(ModBlocks.HOLLOW_MOSSY_FIR_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_ACACIA_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_CHERRY_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_DARK_OAK_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_JUNGLE_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_MANGROVE_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_OAK_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_SPRUCE_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_BIRCH_LOG.get());

        this.tag(BlockTags.PLANKS)
                .add(ModBlocks.FIR_PLANKS.get());

        this.tag(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.FIR_FENCE.get());

        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.FIR_FENCE_GATE.get());
        this.tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.FIR_FENCE.get())
                .add(ModBlocks.FIR_FENCE_GATE.get())
                .add(ModBlocks.FIR_BUTTON.get())
                .add(ModBlocks.FIR_PRESSURE_PLATE.get())
                .add(ModBlocks.FIR_DOOR.get())
                .add(ModBlocks.FIR_TRAPDOOR.get())
                .add(ModBlocks.FIR_SLAB.get())
                .add(ModBlocks.FIR_STAIRS.get())
                .add(ModBlocks.FIR_HANGING_SIGN.get())
                .add(ModBlocks.FIR_WALL_HANGING_SIGN.get())
                .add(ModBlocks.FIR_WALL_SIGN.get())
                .add(ModBlocks.FIR_SIGN.get())
                .add(ModBlocks.HOLLOW_FIR_LOG.get())
                .add(ModBlocks.HOLLOW_DARK_OAK_LOG.get())
                .add(ModBlocks.HOLLOW_MANGROVE_LOG.get())
                .add(ModBlocks.HOLLOW_ACACIA_LOG.get())
                .add(ModBlocks.HOLLOW_CHERRY_LOG.get())
                .add(ModBlocks.HOLLOW_DARK_OAK_LOG.get())
                .add(ModBlocks.HOLLOW_OAK_LOG.get())
                .add(ModBlocks.HOLLOW_SPRUCE_LOG.get())
                .add(ModBlocks.HOLLOW_BIRCH_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_FIR_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_ACACIA_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_CHERRY_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_DARK_OAK_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_JUNGLE_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_MANGROVE_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_OAK_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_SPRUCE_LOG.get())
                .add(ModBlocks.HOLLOW_MOSSY_BIRCH_LOG.get());
    }
}