package net.sufia.landofdrunir.datagen.loot;


import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;
import net.sufia.landofdrunir.init.ModBlocks;
import net.sufia.landofdrunir.init.ModItems;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }
    @Override
    protected void generate() {

        this.add(ModBlocks.DRUNITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.DRUNITE_ORE.get(), ModItems.DRUNITE.get()));
        this.dropSelf(ModBlocks.DRUNITE_BLOCK.get());
        this.add(ModBlocks.PLASMITE_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.PLASMITE_ORE.get(), ModItems.PLASMITE.get()));
        this.dropSelf(ModBlocks.PLASMITE_BLOCK.get());
        this.add(ModBlocks.GALEON_ORE.get(),
                block -> createCopperLikeOreDrops(ModBlocks.GALEON_ORE.get(), ModItems.GALEON.get()));
        this.dropSelf(ModBlocks.GALEON_BLOCK.get());


        this.dropSelf(ModBlocks.RIBWORT.get());
        this.add(ModBlocks.POTTED_RIBWORT.get(), createPotFlowerItemTable(ModBlocks.RIBWORT.get()));

        this.dropSelf(ModBlocks.SKUNKROOT.get());
        this.add(ModBlocks.POTTED_SKUNKROOT.get(), createPotFlowerItemTable(ModBlocks.SKUNKROOT.get()));

        this.dropSelf(ModBlocks.PRISMATIC_SPORE.get());
        this.add(ModBlocks.POTTED_PRISMATIC_SPORE.get(), createPotFlowerItemTable(ModBlocks.PRISMATIC_SPORE.get()));

        this.dropSelf(ModBlocks.FLUXROOT.get());
        this.add(ModBlocks.POTTED_FLUXROOT.get(), createPotFlowerItemTable(ModBlocks.FLUXROOT.get()));

        this.dropSelf(ModBlocks.GALBERRY.get());
        this.add(ModBlocks.POTTED_GALBERRY.get(), createPotFlowerItemTable(ModBlocks.GALBERRY.get()));

        this.dropSelf(ModBlocks.SUN_HOLLY.get());
        this.add(ModBlocks.POTTED_SUN_HOLLY.get(), createPotFlowerItemTable(ModBlocks.SUN_HOLLY.get()));

        this.dropSelf(ModBlocks.FIR_PLANKS.get());
        this.dropSelf(ModBlocks.FIR_WOOD.get());
        this.dropSelf(ModBlocks.FIR_LOG.get());
        this.dropSelf(ModBlocks.STRIPPED_FIR_LOG.get());
        this.add(ModBlocks.FIR_LEAVES.get(), block ->
                createLeavesDrops(block, ModBlocks.FIR_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));
        this.dropSelf(ModBlocks.STRIPPED_FIR_WOOD.get());
        this.dropSelf(ModBlocks.FIR_STAIRS.get());
        this.dropSelf(ModBlocks.FIR_BUTTON.get());
        this.dropSelf(ModBlocks.FIR_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.FIR_TRAPDOOR.get());
        this.dropSelf(ModBlocks.FIR_FENCE_GATE.get());
        this.dropSelf(ModBlocks.FIR_FENCE.get());
        this.add(ModBlocks.FIR_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.FIR_SLAB.get()));
        this.add(ModBlocks.FIR_DOOR.get(),
                block -> createDoorTable(ModBlocks.FIR_DOOR.get()));

        this.add(ModBlocks.FIR_SIGN.get(), block ->
                createSingleItemTable(ModItems.FIR_SIGN.get()));
        this.add(ModBlocks.FIR_WALL_SIGN.get(), block ->
                createSingleItemTable(ModItems.FIR_SIGN.get()));
        this.add(ModBlocks.FIR_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.FIR_HANGING_SIGN.get()));
        this.add(ModBlocks.FIR_WALL_HANGING_SIGN.get(), block ->
                createSingleItemTable(ModItems.FIR_HANGING_SIGN.get()));
        this.dropSelf(ModBlocks.FIR_SAPLING.get());
        this.add(ModBlocks.HOLLOW_FIR_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_FIR_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_ACACIA_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_ACACIA_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_BIRCH_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_BIRCH_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_CHERRY_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_CHERRY_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_DARK_OAK_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_DARK_OAK_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_JUNGLE_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_JUNGLE_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_MANGROVE_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_MANGROVE_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_OAK_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_OAK_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_SPRUCE_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_SPRUCE_LOG.get(), Items.STICK));

        this.add(ModBlocks.HOLLOW_MOSSY_FIR_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_MOSSY_FIR_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_MOSSY_ACACIA_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_MOSSY_ACACIA_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_MOSSY_BIRCH_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_MOSSY_BIRCH_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_MOSSY_CHERRY_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_MOSSY_CHERRY_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_MOSSY_DARK_OAK_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_MOSSY_DARK_OAK_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_MOSSY_JUNGLE_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_MOSSY_JUNGLE_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_MOSSY_MANGROVE_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_MOSSY_MANGROVE_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_MOSSY_OAK_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_MOSSY_OAK_LOG.get(), Items.STICK));
        this.add(ModBlocks.HOLLOW_MOSSY_SPRUCE_LOG.get(),
                block -> createCopperLikeOreDrops(ModBlocks.HOLLOW_MOSSY_SPRUCE_LOG.get(), Items.STICK));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(1.0F, 3.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}