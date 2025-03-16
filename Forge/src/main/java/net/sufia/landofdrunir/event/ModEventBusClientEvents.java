package net.sufia.landofdrunir.event;

import net.minecraft.client.model.BoatModel;
import net.minecraft.client.model.ChestBoatModel;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.client.*;
import net.sufia.landofdrunir.init.entity.ModBlockEntities;

@Mod.EventBusSubscriber(modid = DrunirMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.PORTAL_GUARDIAN, PortalGuardianModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.DEER, DeerModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BOAR, BoarModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.BULL, BullModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GOBLIN_MINOR, GoblinMinorModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.FIRE_GOBLIN, FireGoblinModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.GOBLIN_MERCHANT, GoblinMerchantModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.DRIPPY_GOBLIN, DrippyGoblinModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MAGMAFIEND, MagmafiendModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.MAGMAFIEND_FIREBALL, MagmafiendFireballModel::createBodyLayer);

        event.registerLayerDefinition(ModModelLayers.FIR_BOAT, BoatModel::createBodyModel);
        event.registerLayerDefinition(ModModelLayers.FIR_CHEST_BOAT, ChestBoatModel::createBodyModel);
    }
    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_SIGN.get(), SignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.MOD_HANGING_SIGN.get(), HangingSignRenderer::new);
    }
}
