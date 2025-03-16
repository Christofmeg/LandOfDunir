package net.sufia.landofdrunir.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.PortalGuardian;

public class PortalGuardianRenderer extends MobRenderer<PortalGuardian, PortalGuardianModel<PortalGuardian>> {
    public PortalGuardianRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PortalGuardianModel<>(pContext.bakeLayer(ModModelLayers.PORTAL_GUARDIAN)), 1.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(PortalGuardian pEntity) {
        return ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID, "textures/entity/portal_guardian.png");
    }
    @Override
    public void render(PortalGuardian pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
