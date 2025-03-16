package net.sufia.landofdrunir;

import net.minecraft.client.renderer.Sheets;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sufia.landofdrunir.entity.client.*;
import net.sufia.landofdrunir.init.ModBlocks;
import net.sufia.landofdrunir.init.ModCreativeModeTabs;
import net.sufia.landofdrunir.init.ModItems;
import net.sufia.landofdrunir.init.ModSounds;
import net.sufia.landofdrunir.init.entity.ModBlockEntities;
import net.sufia.landofdrunir.init.entity.ModEntities;
import net.sufia.landofdrunir.init.entity.client.ModBoatRenderer;
import net.sufia.landofdrunir.init.wood.ModWoodTypes;
import net.sufia.landofdrunir.worldgen.tree.ModFoliagePlacers;
import net.sufia.landofdrunir.worldgen.tree.ModTrunkPlacerTypes;

@Mod(DrunirMod.MODID)
public class DrunirMod {

    public static final String MODID = "landofdrunir";

    public DrunirMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        ModCreativeModeTabs.register(bus);
        ModItems.register(bus);
        ModBlocks.register(bus);
        ModSounds.register(bus);
        bus.addListener(this::commonSetup);
        ModEntities.register(bus);
        ModBlockEntities.register(bus);
        ModTrunkPlacerTypes.register(bus);
        ModFoliagePlacers.register(bus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
      event.enqueueWork(() -> {
          ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.RIBWORT.getId(), ModBlocks.POTTED_RIBWORT);
          ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SKUNKROOT.getId(), ModBlocks.POTTED_SKUNKROOT);
          ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PRISMATIC_SPORE.getId(), ModBlocks.POTTED_PRISMATIC_SPORE);
          ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.FLUXROOT.getId(), ModBlocks.POTTED_FLUXROOT);
          ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.GALBERRY.getId(), ModBlocks.POTTED_GALBERRY);
          ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.SUN_HOLLY.getId(), ModBlocks.POTTED_SUN_HOLLY);
      });
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(EntityRenderersEvent.RegisterRenderers event) {
            //wood types underneath
            Sheets.addWoodType(ModWoodTypes.FIR);

            //entity renderers underneath
            EntityRenderers.register(ModEntities.PORTAL_GUARDIAN.get(), PortalGuardianRenderer::new);
            EntityRenderers.register(ModEntities.DEER.get(), DeerRenderer::new);
            EntityRenderers.register(ModEntities.BOAR.get(), BoarRenderer::new);
            EntityRenderers.register(ModEntities.BULL.get(), BullRenderer::new);
            EntityRenderers.register(ModEntities.GOBLIN_MINOR.get(), GoblinMinorRenderer::new);
            EntityRenderers.register(ModEntities.FIRE_GOBLIN.get(), FireGoblinRenderer::new);
            EntityRenderers.register(ModEntities.GOBLIN_MERCHANT.get(), GoblinMerchantRenderer::new);
            EntityRenderers.register(ModEntities.DRIPPY_GOBLIN.get(), DrippyGoblinRenderer::new);
            EntityRenderers.register(ModEntities.MAGMAFIEND.get(), MagmafiendRenderer::new);
            EntityRenderers.register(ModEntities.MAGMAFIEND_FIREBALL.get(), MagmafiendFireballRenderer::new);

            EntityRenderers.register(ModEntities.LIGHTLING.get(), LightlingRenderer::new);

            //boats underneath
            EntityRenderers.register(ModEntities.MOD_BOAT.get(), pContext -> new ModBoatRenderer(pContext, false));
            EntityRenderers.register(ModEntities.MOD_CHEST_BOAT.get(), pContext -> new ModBoatRenderer(pContext, true));
        }

    }
}
