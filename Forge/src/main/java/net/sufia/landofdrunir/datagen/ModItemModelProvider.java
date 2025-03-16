package net.sufia.landofdrunir.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.init.ModBlocks;
import net.sufia.landofdrunir.init.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, DrunirMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.DRUNITE);
        simpleItem(ModItems.GALEON);
        simpleItem(ModItems.PLASMITE);
        simpleItem(ModItems.METAL_POLE);
        simpleItem(ModItems.GOBLIN_DRIP);
        simpleItem(ModItems.MAGMATITE);


        simpleItem(ModItems.RAW_VENISON);
        simpleItem(ModItems.COOKED_VENISON);
        simpleItem(ModItems.RAW_BOAR);
        simpleItem(ModItems.COOKED_BOAR);


        handheldItem(ModItems.DRUNITE_AXE);
        handheldItem(ModItems.DRUNITE_PICKAXE);
        handheldItem(ModItems.DRUNITE_SWORD);
        handheldItem(ModItems.DRUNITE_SHOVEL);
        handheldItem(ModItems.DRUNITE_HOE);

        handheldItem(ModItems.GALEON_AXE);
        handheldItem(ModItems.GALEON_PICKAXE);
        handheldItem(ModItems.GALEON_SWORD);
        handheldItem(ModItems.GALEON_SHOVEL);
        handheldItem(ModItems.GALEON_HOE);


        handheldItem(ModItems.PLASMITE_AXE);
        handheldItem(ModItems.PLASMITE_PICKAXE);
        handheldItem(ModItems.PLASMITE_SWORD);
        handheldItem(ModItems.PLASMITE_SHOVEL);
        handheldItem(ModItems.PLASMITE_HOE);

        handheldItem(ModItems.MAGMATITE_AXE);
        handheldItem(ModItems.MAGMATITE_PICKAXE);
        handheldItem(ModItems.MAGMATITE_SWORD);
        handheldItem(ModItems.MAGMATITE_SHOVEL);
        handheldItem(ModItems.MAGMATITE_HOE);
        handheldItem(ModItems.MAGMATITE_LANCE);


        trimmedArmorItem(ModItems.DRUNITE_HELMET);
        trimmedArmorItem(ModItems.DRUNITE_CHESTPLATE);
        trimmedArmorItem(ModItems.DRUNITE_LEGGINGS);
        trimmedArmorItem(ModItems.DRUNITE_BOOTS);

        trimmedArmorItem(ModItems.GALEON_HELMET);
        trimmedArmorItem(ModItems.GALEON_CHESTPLATE);
        trimmedArmorItem(ModItems.GALEON_LEGGINGS);
        trimmedArmorItem(ModItems.GALEON_BOOTS);

        trimmedArmorItem(ModItems.PLASMITE_HELMET);
        trimmedArmorItem(ModItems.PLASMITE_CHESTPLATE);
        trimmedArmorItem(ModItems.PLASMITE_LEGGINGS);
        trimmedArmorItem(ModItems.PLASMITE_BOOTS);



        evenSimplerBlockItem(ModBlocks.DRUNITE_BLOCK);
        evenSimplerBlockItem(ModBlocks.PLASMITE_BLOCK);
        evenSimplerBlockItem(ModBlocks.GALEON_BLOCK);
        evenSimplerBlockItem(ModBlocks.DRUNITE_ORE);
        evenSimplerBlockItem(ModBlocks.GALEON_ORE);
        evenSimplerBlockItem(ModBlocks.PLASMITE_ORE);

        evenSimplerBlockItem(ModBlocks.HOLLOW_ACACIA_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_BIRCH_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_CHERRY_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_DARK_OAK_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_FIR_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_JUNGLE_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_MANGROVE_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_OAK_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_SPRUCE_LOG);

        evenSimplerBlockItem(ModBlocks.HOLLOW_MOSSY_ACACIA_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_MOSSY_BIRCH_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_MOSSY_CHERRY_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_MOSSY_DARK_OAK_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_MOSSY_FIR_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_MOSSY_JUNGLE_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_MOSSY_MANGROVE_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_MOSSY_OAK_LOG);
        evenSimplerBlockItem(ModBlocks.HOLLOW_MOSSY_SPRUCE_LOG);


        simpleBlockItemBlockTexture(ModBlocks.RIBWORT);
        simpleBlockItemBlockTexture(ModBlocks.SKUNKROOT);
        simpleBlockItemBlockTexture(ModBlocks.PRISMATIC_SPORE);
        simpleBlockItemBlockTexture(ModBlocks.FLUXROOT);
        simpleBlockItemBlockTexture(ModBlocks.GALBERRY);
        simpleBlockItemBlockTexture(ModBlocks.SUN_HOLLY);



        withExistingParent(ModItems.PORTAL_GUARDIAN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.DEER_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.BOAR_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.BULL_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.GOBLIN_MINOR_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.FIRE_GOBLIN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.GOBLIN_MERCHANT_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.DRIPPY_GOBLIN_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));
        withExistingParent(ModItems.MAGMAFIEND_EGG.getId().getPath(), mcLoc("item/template_spawn_egg"));

        simpleBlockItem(ModBlocks.FIR_DOOR);
        fenceItem(ModBlocks.FIR_FENCE, ModBlocks.FIR_PLANKS);
        buttonItem(ModBlocks.FIR_BUTTON, ModBlocks.FIR_PLANKS);
        evenSimplerBlockItem(ModBlocks.FIR_STAIRS);
        evenSimplerBlockItem(ModBlocks.FIR_SLAB);
        evenSimplerBlockItem(ModBlocks.FIR_PRESSURE_PLATE);
        evenSimplerBlockItem(ModBlocks.FIR_FENCE_GATE);
        trapdoorItem(ModBlocks.FIR_TRAPDOOR);
        simpleItem(ModItems.FIR_SIGN);
        simpleItem(ModItems.FIR_HANGING_SIGN);
        simpleItem(ModItems.FIR_BOAT);
        simpleItem(ModItems.FIR_CHEST_BOAT);
        saplingItem(ModBlocks.FIR_SAPLING);
    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = DrunirMod.MODID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.fromNamespaceAndPath(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.fromNamespaceAndPath(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }

    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID,"block/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(DrunirMod.MODID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item){
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID,"item/" + item.getId().getPath()));
    }
    private ItemModelBuilder simpleBlockItemBlockTexture(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID,"block/" + item.getId().getPath()));
    }
}