package net.sufia.landofdrunir.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.init.ModBlocks;


public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, DrunirMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.DRUNITE_BLOCK);
        blockWithItem(ModBlocks.DRUNITE_ORE);
        blockWithItem(ModBlocks.PLASMITE_BLOCK);
        blockWithItem(ModBlocks.PLASMITE_ORE);
        blockWithItem(ModBlocks.GALEON_BLOCK);
        blockWithItem(ModBlocks.GALEON_ORE);

        simpleBlockWithItem(ModBlocks.RIBWORT.get(), models().cross(blockTexture(ModBlocks.RIBWORT.get()).getPath(),
                blockTexture(ModBlocks.RIBWORT.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_RIBWORT.get(), models().singleTexture("potted_ribwort", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.RIBWORT.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.SKUNKROOT.get(), models().cross(blockTexture(ModBlocks.SKUNKROOT.get()).getPath(),
                blockTexture(ModBlocks.SKUNKROOT.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SKUNKROOT.get(), models().singleTexture("potted_skunkroot", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.SKUNKROOT.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.PRISMATIC_SPORE.get(), models().cross(blockTexture(ModBlocks.PRISMATIC_SPORE.get()).getPath(),
                blockTexture(ModBlocks.PRISMATIC_SPORE.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_PRISMATIC_SPORE.get(), models().singleTexture("potted_prismatic_spore", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.PRISMATIC_SPORE.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.FLUXROOT.get(), models().cross(blockTexture(ModBlocks.FLUXROOT.get()).getPath(),
                blockTexture(ModBlocks.FLUXROOT.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_FLUXROOT.get(), models().singleTexture("potted_fluxroot", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.FLUXROOT.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.GALBERRY.get(), models().cross(blockTexture(ModBlocks.GALBERRY.get()).getPath(),
                blockTexture(ModBlocks.GALBERRY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_GALBERRY.get(), models().singleTexture("potted_galberry", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.GALBERRY.get())).renderType("cutout"));

        simpleBlockWithItem(ModBlocks.SUN_HOLLY.get(), models().cross(blockTexture(ModBlocks.SUN_HOLLY.get()).getPath(),
                blockTexture(ModBlocks.SUN_HOLLY.get())).renderType("cutout"));
        simpleBlockWithItem(ModBlocks.POTTED_SUN_HOLLY.get(), models().singleTexture("potted_sun_holly", ResourceLocation.parse("flower_pot_cross"), "plant",
                blockTexture(ModBlocks.SUN_HOLLY.get())).renderType("cutout"));

        logBlock(((RotatedPillarBlock) ModBlocks.FIR_LOG.get()));
        axisBlock(((RotatedPillarBlock) ModBlocks.FIR_WOOD.get()), blockTexture(ModBlocks.FIR_LOG.get()), blockTexture(ModBlocks.FIR_LOG.get()));
        axisBlock((RotatedPillarBlock) ModBlocks.STRIPPED_FIR_LOG.get(), blockTexture(ModBlocks.STRIPPED_FIR_LOG.get()),
                ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID, "block/stripped_fir_log_top"));
        
        axisBlock(((RotatedPillarBlock) ModBlocks.STRIPPED_FIR_WOOD.get()), blockTexture(ModBlocks.STRIPPED_FIR_LOG.get()),
                blockTexture(ModBlocks.STRIPPED_FIR_LOG.get()));

        blockItem(ModBlocks.FIR_LOG);
        blockItem(ModBlocks.FIR_WOOD);
        blockItem(ModBlocks.STRIPPED_FIR_LOG);
        blockItem(ModBlocks.STRIPPED_FIR_WOOD);
        blockWithItem(ModBlocks.FIR_PLANKS);
        leavesBlock(ModBlocks.FIR_LEAVES);
        stairsBlock(((StairBlock) ModBlocks.FIR_STAIRS.get()), blockTexture(ModBlocks.FIR_PLANKS.get()));
        slabBlock(((SlabBlock) ModBlocks.FIR_SLAB.get()), blockTexture(ModBlocks.FIR_PLANKS.get()), blockTexture(ModBlocks.FIR_PLANKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.FIR_BUTTON.get()), blockTexture(ModBlocks.FIR_PLANKS.get()));
        pressurePlateBlock(((PressurePlateBlock) ModBlocks.FIR_PRESSURE_PLATE.get()), blockTexture(ModBlocks.FIR_PLANKS.get()));
        fenceBlock(((FenceBlock) ModBlocks.FIR_FENCE.get()), blockTexture(ModBlocks.FIR_PLANKS.get()));
        fenceGateBlock(((FenceGateBlock) ModBlocks.FIR_FENCE_GATE.get()), blockTexture(ModBlocks.FIR_PLANKS.get()));
        doorBlockWithRenderType(((DoorBlock) ModBlocks.FIR_DOOR.get()), modLoc("block/fir_door_bottom"), modLoc("block/fir_door_top"),"cutout");
        trapdoorBlockWithRenderType(((TrapDoorBlock) ModBlocks.FIR_TRAPDOOR.get()), modLoc("block/fir_trapdoor"), true,"cutout");
        signBlock(((StandingSignBlock) ModBlocks.FIR_SIGN.get()), ((WallSignBlock) ModBlocks.FIR_WALL_SIGN.get()),
                blockTexture(ModBlocks.FIR_PLANKS.get()));
        hangingSignBlock(ModBlocks.FIR_HANGING_SIGN.get(), ModBlocks.FIR_WALL_HANGING_SIGN.get(), blockTexture(ModBlocks.FIR_PLANKS.get()));
        saplingBlock(ModBlocks.FIR_SAPLING);
    }
    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ResourceLocation texture) {
        ModelFile sign = models().sign(name(signBlock), texture);
        hangingSignBlock(signBlock, wallSignBlock, sign);
    }
    private void saplingBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlock(blockRegistryObject.get(),
                models().cross(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }

    public void hangingSignBlock(Block signBlock, Block wallSignBlock, ModelFile sign) {
        simpleBlock(signBlock, sign);
        simpleBlock(wallSignBlock, sign);
    }
    private String name(Block block) {
        return key(block).getPath();
    }

    private ResourceLocation key(Block block) {
        return ForgeRegistries.BLOCKS.getKey(block);
    }
    private void leavesBlock(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(),
                models().singleTexture(ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath(), ResourceLocation.parse("minecraft:block/leaves"),
                        "all", blockTexture(blockRegistryObject.get())).renderType("cutout"));
    }
    private void blockItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile(DrunirMod.MODID +
                ":block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()) {
        });
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}