package net.sufia.landofdrunir.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.Boar;

public class BoarRenderer extends MobRenderer<Boar, BoarModel<Boar>> {
    public BoarRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BoarModel<>(pContext.bakeLayer(ModModelLayers.BOAR)), 0.5f);
    }
    @Override
    public ResourceLocation getTextureLocation(Boar pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/boar.png");
    }
    @Override
    public void render(Boar pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.65f, 0.65f, 0.65f);}

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
