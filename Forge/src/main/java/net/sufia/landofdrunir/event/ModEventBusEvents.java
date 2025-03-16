package net.sufia.landofdrunir.event;

import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.*;
import net.sufia.landofdrunir.init.entity.ModEntities;

@Mod.EventBusSubscriber(modid = DrunirMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.PORTAL_GUARDIAN.get(), PortalGuardian.createAttributes().build());
        event.put(ModEntities.DEER.get(), Deer.createAttributes().build());
        event.put(ModEntities.BOAR.get(), Boar.createAttributes().build());
        event.put(ModEntities.BULL.get(), Bull.createAttributes().build());
        event.put(ModEntities.GOBLIN_MINOR.get(), GoblinMinor.createAttributes().build());
        event.put(ModEntities.FIRE_GOBLIN.get(), FireGoblin.createAttributes().build());
        event.put(ModEntities.GOBLIN_MERCHANT.get(), GoblinMerchant.createAttributes().build());
        event.put(ModEntities.DRIPPY_GOBLIN.get(), DrippyGoblin.createAttributes().build());
        event.put(ModEntities.MAGMAFIEND.get(), Magmafiend.createAttributes().build());
    }
}