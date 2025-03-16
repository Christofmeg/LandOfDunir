package net.sufia.landofdrunir.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.Bull;
import net.sufia.landofdrunir.entity.custom.PortalGuardian;

public class BullRenderer extends MobRenderer<Bull, BullModel<Bull>> {
    public BullRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BullModel<>(pContext.bakeLayer(ModModelLayers.BULL)), 1f);
    }
    @Override
    public ResourceLocation getTextureLocation(Bull pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/bull.png");
    }
    @Override
    public void render(Bull pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.65f, 0.65f, 0.65f);}

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
