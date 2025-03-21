package net.sufia.landofdrunir.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.Sandstalker;

public class SandstalkerRenderer extends MobRenderer<Sandstalker, SandstalkerModel<Sandstalker>> {
    public SandstalkerRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new SandstalkerModel<>(pContext.bakeLayer(ModModelLayers.SANDSTALKER)), 1f);
    }
    @Override
    public ResourceLocation getTextureLocation(Sandstalker pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/sandstalker.png");
    }
    @Override
    public void render(Sandstalker pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}