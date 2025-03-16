package net.sufia.landofdrunir.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.init.ModBlocks;
import net.sufia.landofdrunir.init.ModItems;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DrunirMod.MODID);

    public static final RegistryObject<CreativeModeTab> LAND_OF_DRUNIR = CREATIVE_MODE_TABS.register("land_of_drunir_items",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DRUNITE.get()))
                    .title(Component.translatable("creativetab.land_of_drunir_items"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.HOLLOW_ACACIA_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_BIRCH_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_CHERRY_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_DARK_OAK_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_JUNGLE_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_MANGROVE_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_OAK_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_SPRUCE_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_MOSSY_ACACIA_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_MOSSY_BIRCH_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_MOSSY_CHERRY_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_MOSSY_DARK_OAK_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_MOSSY_JUNGLE_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_MOSSY_MANGROVE_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_MOSSY_OAK_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_MOSSY_SPRUCE_LOG.get());


                        pOutput.accept(ModItems.WOOD_LANCE.get());
                        pOutput.accept(ModItems.STONE_LANCE.get());
                        pOutput.accept(ModItems.GOLD_LANCE.get());
                        pOutput.accept(ModItems.IRON_LANCE.get());
                        pOutput.accept(ModItems.DIAMOND_LANCE.get());
                        pOutput.accept(ModItems.NETHERITE_LANCE.get());

                        pOutput.accept(ModItems.DRUNITE.get());
                        pOutput.accept(ModBlocks.DRUNITE_ORE.get());
                        pOutput.accept(ModBlocks.DRUNITE_BLOCK.get());

                        pOutput.accept(ModItems.DRUNITE_SWORD.get());
                        pOutput.accept(ModItems.DRUNITE_PICKAXE.get());
                        pOutput.accept(ModItems.DRUNITE_AXE.get());
                        pOutput.accept(ModItems.DRUNITE_SHOVEL.get());
                        pOutput.accept(ModItems.DRUNITE_HOE.get());

                        pOutput.accept(ModItems.DRUNITE_HELMET.get());
                        pOutput.accept(ModItems.DRUNITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.DRUNITE_LEGGINGS.get());
                        pOutput.accept(ModItems.DRUNITE_BOOTS.get());
                        pOutput.accept(ModItems.DRUNITE_LANCE.get());


                        pOutput.accept(ModItems.PLASMITE.get());
                        pOutput.accept(ModBlocks.PLASMITE_ORE.get());
                        pOutput.accept(ModBlocks.PLASMITE_BLOCK.get());

                        pOutput.accept(ModItems.PLASMITE_SWORD.get());
                        pOutput.accept(ModItems.PLASMITE_PICKAXE.get());
                        pOutput.accept(ModItems.PLASMITE_AXE.get());
                        pOutput.accept(ModItems.PLASMITE_SHOVEL.get());
                        pOutput.accept(ModItems.PLASMITE_HOE.get());

                        pOutput.accept(ModItems.PLASMITE_HELMET.get());
                        pOutput.accept(ModItems.PLASMITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.PLASMITE_LEGGINGS.get());
                        pOutput.accept(ModItems.PLASMITE_BOOTS.get());
                        pOutput.accept(ModItems.PLASMITE_LANCE.get());

                        pOutput.accept(ModItems.GALEON.get());
                        pOutput.accept(ModBlocks.GALEON_ORE.get());
                        pOutput.accept(ModBlocks.GALEON_BLOCK.get());

                        pOutput.accept(ModItems.GALEON_SWORD.get());
                        pOutput.accept(ModItems.GALEON_PICKAXE.get());
                        pOutput.accept(ModItems.GALEON_AXE.get());
                        pOutput.accept(ModItems.GALEON_SHOVEL.get());
                        pOutput.accept(ModItems.GALEON_HOE.get());

                        pOutput.accept(ModItems.GALEON_HELMET.get());
                        pOutput.accept(ModItems.GALEON_CHESTPLATE.get());
                        pOutput.accept(ModItems.GALEON_LEGGINGS.get());
                        pOutput.accept(ModItems.GALEON_BOOTS.get());
                        pOutput.accept(ModItems.GALEON_LANCE.get());

                        pOutput.accept(ModItems.METAL_POLE.get());

                        pOutput.accept(ModItems.PORTAL_GUARDIAN_EGG.get());
                        pOutput.accept(ModItems.DEER_EGG.get());
                        pOutput.accept(ModItems.BOAR_EGG.get());
                        pOutput.accept(ModItems.BULL_EGG.get());
                        pOutput.accept(ModItems.GOBLIN_MINOR_EGG.get());
                        pOutput.accept(ModItems.FIRE_GOBLIN_EGG.get());
                        pOutput.accept(ModItems.GOBLIN_MERCHANT_EGG.get());
                        pOutput.accept(ModItems.DRIPPY_GOBLIN_EGG.get());
                        pOutput.accept(ModItems.MAGMAFIEND_EGG.get());

                        pOutput.accept(ModItems.RAW_VENISON.get());
                        pOutput.accept(ModItems.COOKED_VENISON.get());
                        pOutput.accept(ModItems.RAW_BOAR.get());
                        pOutput.accept(ModItems.COOKED_BOAR.get());
                        pOutput.accept(ModItems.GOBLIN_DRIP.get());

                        pOutput.accept(ModBlocks.RIBWORT.get());
                        pOutput.accept(ModBlocks.SKUNKROOT.get());
                        pOutput.accept(ModBlocks.PRISMATIC_SPORE.get());
                        pOutput.accept(ModBlocks.FLUXROOT.get());
                        pOutput.accept(ModBlocks.GALBERRY.get());
                        pOutput.accept(ModBlocks.SUN_HOLLY.get());

                        pOutput.accept(ModBlocks.FIR_LOG.get());
                        pOutput.accept(ModBlocks.FIR_WOOD.get());
                        pOutput.accept(ModBlocks.STRIPPED_FIR_LOG.get());
                        pOutput.accept(ModBlocks.STRIPPED_FIR_WOOD.get());
                        pOutput.accept(ModBlocks.HOLLOW_FIR_LOG.get());
                        pOutput.accept(ModBlocks.HOLLOW_MOSSY_FIR_LOG.get());
                        pOutput.accept(ModBlocks.FIR_PLANKS.get());
                        pOutput.accept(ModBlocks.FIR_LEAVES.get());
                        pOutput.accept(ModBlocks.FIR_STAIRS.get());
                        pOutput.accept(ModBlocks.FIR_SLAB.get());
                        pOutput.accept(ModBlocks.FIR_BUTTON.get());
                        pOutput.accept(ModBlocks.FIR_PRESSURE_PLATE.get());
                        pOutput.accept(ModBlocks.FIR_FENCE.get());
                        pOutput.accept(ModBlocks.FIR_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.FIR_DOOR.get());
                        pOutput.accept(ModBlocks.FIR_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.FIR_SIGN.get());
                        pOutput.accept(ModBlocks.FIR_HANGING_SIGN.get());
                        pOutput.accept(ModItems.FIR_BOAT.get());
                        pOutput.accept(ModItems.FIR_CHEST_BOAT.get());
                        pOutput.accept(ModBlocks.FIR_SAPLING.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
