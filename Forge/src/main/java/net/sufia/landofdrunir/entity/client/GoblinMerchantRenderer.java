package net.sufia.landofdrunir.entity.client;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.GoblinMerchant;

public class GoblinMerchantRenderer extends MobRenderer<GoblinMerchant, GoblinMerchantModel<GoblinMerchant>> {
    public GoblinMerchantRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new GoblinMerchantModel<>(pContext.bakeLayer(ModModelLayers.GOBLIN_MERCHANT)), 0.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(GoblinMerchant pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/goblin_merchant.png");
    }
    @Override
    public void render(GoblinMerchant pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
