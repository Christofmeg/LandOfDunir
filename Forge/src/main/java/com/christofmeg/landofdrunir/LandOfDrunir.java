package com.christofmeg.landofdrunir;

import com.christofmeg.landofdrunir.common.init.BlockRegistry;
import com.christofmeg.landofdrunir.common.init.CreativeModeTabRegistry;
import com.christofmeg.landofdrunir.common.init.ItemRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
@Mod(CommonConstants.MOD_ID)
public class LandOfDrunir {

    public LandOfDrunir() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        init(bus);
    }

    private void init(@Nonnull IEventBus modEventBus) {
        MinecraftForge.EVENT_BUS.register(this);
        BlockRegistry.init(modEventBus);
        ItemRegistry.init(modEventBus);
        CreativeModeTabRegistry.init(modEventBus);
    }

}