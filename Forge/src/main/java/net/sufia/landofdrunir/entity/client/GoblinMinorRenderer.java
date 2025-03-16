package net.sufia.landofdrunir.entity.client;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.GoblinMinor;
public class GoblinMinorRenderer extends MobRenderer<GoblinMinor, GoblinMinorModel<GoblinMinor>>{
    public GoblinMinorRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new GoblinMinorModel<>(pContext.bakeLayer(ModModelLayers.GOBLIN_MINOR)), 0.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(GoblinMinor pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/goblin_minor.png");
    }
    @Override
    public void render(GoblinMinor pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
