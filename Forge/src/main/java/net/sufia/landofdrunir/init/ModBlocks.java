package net.sufia.landofdrunir.init;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.block.custom.HollowLog;
import net.sufia.landofdrunir.block.custom.wood.*;
import net.sufia.landofdrunir.init.wood.ModWoodTypes;
import net.sufia.landofdrunir.worldgen.tree.FirTreeGrower;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, DrunirMod.MODID);

    public static final RegistryObject<Block> DRUNITE_ORE = registerBlock("drunite_ore",
        () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(7, 20).requiresCorrectToolForDrops().mapColor(MapColor.STONE)));

    public static final RegistryObject<Block> DRUNITE_BLOCK = registerBlock("drunite_block",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(7, 20).requiresCorrectToolForDrops().mapColor(MapColor.COLOR_BLUE)));

    public static final RegistryObject<Block> PLASMITE_ORE = registerBlock("plasmite_ore",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(11, 20).requiresCorrectToolForDrops().mapColor(MapColor.STONE)));

    public static final RegistryObject<Block> PLASMITE_BLOCK = registerBlock("plasmite_block",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(11, 20).requiresCorrectToolForDrops().mapColor(MapColor.TERRACOTTA_YELLOW)));

    public static final RegistryObject<Block> GALEON_ORE = registerBlock("galeon_ore",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(6.5f, 20).requiresCorrectToolForDrops().mapColor(MapColor.STONE)));

    public static final RegistryObject<Block> GALEON_BLOCK = registerBlock("galeon_block",
            () -> new Block(BlockBehaviour.Properties.of().sound(SoundType.STONE).strength(6.5f, 20).requiresCorrectToolForDrops().mapColor(MapColor.COLOR_RED)));

    public static final RegistryObject<Block> RIBWORT = registerBlock("ribwort",
        () -> new FlowerBlock(()-> MobEffects.WEAKNESS,5,BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_RIBWORT = BLOCKS.register("potted_ribwort",
            () -> new FlowerPotBlock(()-> ((FlowerPotBlock) Blocks.FLOWER_POT),ModBlocks.RIBWORT, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> SKUNKROOT = registerBlock("skunkroot",
            () -> new FlowerBlock(()-> MobEffects.POISON,5,BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_SKUNKROOT = BLOCKS.register("potted_skunkroot",
            () -> new FlowerPotBlock(()-> ((FlowerPotBlock) Blocks.FLOWER_POT),ModBlocks.SKUNKROOT, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> PRISMATIC_SPORE = registerBlock("prismatic_spore",
            () -> new FlowerBlock(()-> MobEffects.HEAL,5,BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_PRISMATIC_SPORE = BLOCKS.register("potted_prismatic_spore",
            () -> new FlowerPotBlock(()-> ((FlowerPotBlock) Blocks.FLOWER_POT),ModBlocks.PRISMATIC_SPORE, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> FLUXROOT = registerBlock("fluxroot",
            () -> new FlowerBlock(()-> MobEffects.SLOW_FALLING,5,BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_FLUXROOT = BLOCKS.register("potted_fluxroot",
            () -> new FlowerPotBlock(()-> ((FlowerPotBlock) Blocks.FLOWER_POT),ModBlocks.FLUXROOT, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> GALBERRY = registerBlock("galberry",
            () -> new FlowerBlock(()-> MobEffects.ABSORPTION,5,BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_GALBERRY = BLOCKS.register("potted_galberry",
            () -> new FlowerPotBlock(()-> ((FlowerPotBlock) Blocks.FLOWER_POT),ModBlocks.GALBERRY, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> SUN_HOLLY = registerBlock("sun_holly",
            () -> new FlowerBlock(()-> MobEffects.GLOWING,5,BlockBehaviour.Properties.copy(Blocks.ALLIUM).noOcclusion().noCollission()));
    public static final RegistryObject<Block> POTTED_SUN_HOLLY = BLOCKS.register("potted_sun_holly",
            () -> new FlowerPotBlock(()-> ((FlowerPotBlock) Blocks.FLOWER_POT),ModBlocks.SUN_HOLLY, BlockBehaviour.Properties.copy(Blocks.POTTED_ALLIUM).noOcclusion()));

    public static final RegistryObject<Block> FIR_LOG = registerBlock("fir_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)));
    public static final RegistryObject<Block> FIR_WOOD = registerBlock("fir_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)));
    public static final RegistryObject<Block> STRIPPED_FIR_LOG = registerBlock("stripped_fir_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)));
    public static final RegistryObject<Block> STRIPPED_FIR_WOOD = registerBlock("stripped_fir_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)));
    public static final RegistryObject<Block> HOLLOW_FIR_LOG = registerBlock("hollow_fir_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_GRAY)) {});
    public static final RegistryObject<Block> HOLLOW_ACACIA_LOG = registerBlock("hollow_acacia_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_ORANGE)) {});
    public static final RegistryObject<Block> HOLLOW_BIRCH_LOG = registerBlock("hollow_birch_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.QUARTZ)) {});
    public static final RegistryObject<Block> HOLLOW_CHERRY_LOG = registerBlock("hollow_cherry_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_PINK)) {});
    public static final RegistryObject<Block> HOLLOW_DARK_OAK_LOG = registerBlock("hollow_dark_oak_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_BROWN)) {});
    public static final RegistryObject<Block> HOLLOW_JUNGLE_LOG = registerBlock("hollow_jungle_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_ORANGE)) {});
    public static final RegistryObject<Block> HOLLOW_MANGROVE_LOG = registerBlock("hollow_mangrove_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_RED)) {});
    public static final RegistryObject<Block> HOLLOW_OAK_LOG = registerBlock("hollow_oak_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_BROWN)) {});
    public static final RegistryObject<Block> HOLLOW_SPRUCE_LOG = registerBlock("hollow_spruce_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_BROWN)) {});
    public static final RegistryObject<Block> HOLLOW_MOSSY_FIR_LOG = registerBlock("hollow_mossy_fir_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_GRAY)) {});
    public static final RegistryObject<Block> HOLLOW_MOSSY_ACACIA_LOG = registerBlock("hollow_mossy_acacia_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_ORANGE)) {});
    public static final RegistryObject<Block> HOLLOW_MOSSY_BIRCH_LOG = registerBlock("hollow_mossy_birch_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.QUARTZ)) {});
    public static final RegistryObject<Block> HOLLOW_MOSSY_CHERRY_LOG = registerBlock("hollow_mossy_cherry_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_PINK)) {});
    public static final RegistryObject<Block> HOLLOW_MOSSY_DARK_OAK_LOG = registerBlock("hollow_mossy_dark_oak_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_BROWN)) {});
    public static final RegistryObject<Block> HOLLOW_MOSSY_JUNGLE_LOG = registerBlock("hollow_mossy_jungle_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_ORANGE)) {});
    public static final RegistryObject<Block> HOLLOW_MOSSY_MANGROVE_LOG = registerBlock("hollow_mossy_mangrove_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_RED)) {});
    public static final RegistryObject<Block> HOLLOW_MOSSY_OAK_LOG = registerBlock("hollow_mossy_oak_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_BROWN)) {});
    public static final RegistryObject<Block> HOLLOW_MOSSY_SPRUCE_LOG = registerBlock("hollow_mossy_spruce_log",
            () -> new HollowLog(BlockBehaviour.Properties.copy(ModBlocks.FIR_LOG.get()).noOcclusion().strength(0.7f, 2).mapColor(MapColor.COLOR_BROWN)) {});

    public static final RegistryObject<Block> FIR_PLANKS = registerBlock("fir_planks",
            () -> new PlanksBlocks(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));
    public static final RegistryObject<Block> FIR_LEAVES = registerBlock("fir_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> FIR_STAIRS = registerBlock("fir_stairs",
            () -> new StairBlock(()-> ModBlocks.FIR_PLANKS.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.OAK_STAIRS)));
    public static final RegistryObject<Block> FIR_SLAB = registerBlock("fir_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SLAB)));
    public static final RegistryObject<Block> FIR_BUTTON = registerBlock("fir_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.OAK_BUTTON), BlockSetType.OAK, 20,true));
    public static final RegistryObject<Block> FIR_PRESSURE_PLATE = registerBlock("fir_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.OAK_PRESSURE_PLATE), BlockSetType.OAK));
    public static final RegistryObject<Block> FIR_FENCE = registerBlock("fir_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE)));
    public static final RegistryObject<Block> FIR_FENCE_GATE = registerBlock("fir_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.OAK_FENCE_GATE), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
    public static final RegistryObject<Block> FIR_DOOR = registerBlock("fir_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_DOOR), BlockSetType.OAK));
    public static final RegistryObject<Block> FIR_TRAPDOOR = registerBlock("fir_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.OAK_TRAPDOOR), BlockSetType.OAK));

    public static final RegistryObject<Block> FIR_SIGN = BLOCKS.register("fir_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.FIR));
    public static final RegistryObject<Block> FIR_WALL_SIGN = BLOCKS.register("fir_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.FIR));
    public static final RegistryObject<Block> FIR_HANGING_SIGN = BLOCKS.register("fir_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.FIR));
    public static final RegistryObject<Block> FIR_WALL_HANGING_SIGN = BLOCKS.register("fir_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.FIR));
    public static final RegistryObject<Block> FIR_SAPLING = registerBlock("fir_sapling",
            () -> new SaplingBlock(new FirTreeGrower(),BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }

}
