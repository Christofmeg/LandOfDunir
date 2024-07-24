package com.christofmeg.landofdrunir.common.init;

import com.christofmeg.landofdrunir.CommonConstants;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;

public class ItemRegistry {

    public static final DeferredRegister<Item> ITEMS;

    public static final RegistryObject<Item> RAW_GALEON;
    public static final RegistryObject<Item> GALEON;

    public static void init(@Nonnull IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }

    static {
        ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CommonConstants.MOD_ID);

        RAW_GALEON = ITEMS.register("raw_galeon", () -> new Item(new Item.Properties()));
        GALEON = ITEMS.register("galeon", () -> new Item(new Item.Properties()));

    }

}
