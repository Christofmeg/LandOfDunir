package net.sufia.landofdrunir.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.Lightling;

public class LightlingRenderer extends MobRenderer<Lightling, LightlingModel<Lightling>> {
    public LightlingRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new LightlingModel<>(pContext.bakeLayer(ModModelLayers.LIGHTLING)), 0.3f);
    }
    @Override
    public ResourceLocation getTextureLocation(Lightling pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/lightling.png");
    }
    @Override
    public void render(Lightling pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}