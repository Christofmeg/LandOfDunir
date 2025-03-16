package net.sufia.landofdrunir.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.Magmafiend;

public class MagmafiendRenderer extends MobRenderer<Magmafiend, MagmafiendModel<Magmafiend>> {
    public MagmafiendRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new MagmafiendModel<>(pContext.bakeLayer(ModModelLayers.MAGMAFIEND)), 1.5f);
    }
    @Override
    public ResourceLocation getTextureLocation(Magmafiend pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/magmafiend.png");
    }
    @Override
    public void render(Magmafiend pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
