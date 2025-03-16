package net.sufia.landofdrunir.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.Deer;

public class DeerRenderer extends MobRenderer<Deer, DeerModel<Deer>> {
    public DeerRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DeerModel<>(pContext.bakeLayer(ModModelLayers.DEER)), 0.7f);
    }
    @Override
    public ResourceLocation getTextureLocation(Deer pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/deer.png");
    }
    @Override
    public void render(Deer pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.65f, 0.65f, 0.65f);}

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
