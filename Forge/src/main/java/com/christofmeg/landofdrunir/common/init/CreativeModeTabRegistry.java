package com.christofmeg.landofdrunir.common.init;

import com.christofmeg.landofdrunir.CommonConstants;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nonnull;

public class CreativeModeTabRegistry {

    public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CommonConstants.MOD_ID);

    public static void init(@Nonnull IEventBus modEventBus) {
        REGISTRY.register(modEventBus);
    }

    @SuppressWarnings("unused")
    public static final RegistryObject<CreativeModeTab> TAB = REGISTRY.register(CommonConstants.MOD_ID, () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + CommonConstants.MOD_ID)).icon(
                    () -> new ItemStack(ItemRegistry.GALEON.get()))
            .displayItems((parameters, tabData) -> {
                ItemRegistry.ITEMS.getEntries().stream().map(RegistryObject::get).forEach(tabData::accept);
                BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(tabData::accept);
            })
            .build());

}