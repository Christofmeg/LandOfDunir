package net.sufia.landofdrunir.entity.client;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.sufia.landofdrunir.entity.custom.DrippyGoblin;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;

public class DrippyGoblinRenderer extends MobRenderer<DrippyGoblin, DrippyGoblinModel<DrippyGoblin>> {
    public DrippyGoblinRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new DrippyGoblinModel<>(pContext.bakeLayer(ModModelLayers.DRIPPY_GOBLIN)), 0.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(DrippyGoblin pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/drippy_goblin.png");
    }
    @Override
    public void render(DrippyGoblin pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
