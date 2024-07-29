package com.christofmeg.landofdrunir.common.init;

import com.christofmeg.landofdrunir.CommonConstants;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public class BlockRegistry {

    public static final DeferredRegister<Block> BLOCKS;

    public static final RegistryObject<Block> PLASMITE_ORE;

    public static void init(@Nonnull IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
    }

    static {
        BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, CommonConstants.MOD_ID);

        PLASMITE_ORE = registerBlock("plasmite_ore", () -> new DropExperienceBlock(BlockBehaviour.Properties.of()
                .mapColor(MapColor.STONE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops()
                .strength(1.0F, 1.0F), UniformInt.of(3, 7)), new Item.Properties());


    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> supplier, Item.Properties properties) {
        RegistryObject<T> block = BLOCKS.register(name, supplier);
        ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), properties));
        return block;
    }

}
