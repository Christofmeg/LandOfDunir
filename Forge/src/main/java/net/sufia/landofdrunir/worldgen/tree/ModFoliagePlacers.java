package net.sufia.landofdrunir.worldgen.tree;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.worldgen.tree.custom.FirFoliagePlacer;

public class ModFoliagePlacers {
    public static final DeferredRegister<FoliagePlacerType<?>> FOLIAGE_PLACERS =
            DeferredRegister.create(Registries.FOLIAGE_PLACER_TYPE, DrunirMod.MODID);

    public static final RegistryObject<FoliagePlacerType<FirFoliagePlacer>> FIR_FOLIAGE_PLACER =
            FOLIAGE_PLACERS.register("fir_foliage_placer", () -> new FoliagePlacerType<>(FirFoliagePlacer.CODEC));

    public static void register(IEventBus eventBus) {
        FOLIAGE_PLACERS.register(eventBus);
    }
}

