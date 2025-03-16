package net.sufia.landofdrunir.worldgen.tree;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.worldgen.tree.custom.FirTrunkPlacer;

public class ModTrunkPlacerTypes {
    public static final DeferredRegister<TrunkPlacerType<?>> TRUNK_PLACER =
            DeferredRegister.create(Registries.TRUNK_PLACER_TYPE, DrunirMod.MODID);

    public static final RegistryObject<TrunkPlacerType<FirTrunkPlacer>> FIR_TRUNK_PLACER =
            TRUNK_PLACER.register("fir_trunk_placer", () -> new TrunkPlacerType<>(FirTrunkPlacer.CODEC));

    public static void register(IEventBus eventBus) {
        TRUNK_PLACER.register(eventBus);
    }
}
