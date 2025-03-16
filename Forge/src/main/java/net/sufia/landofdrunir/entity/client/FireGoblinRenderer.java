package net.sufia.landofdrunir.entity.client;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.FireGoblin;
import net.sufia.landofdrunir.entity.custom.GoblinMinor;

public class FireGoblinRenderer extends MobRenderer<FireGoblin, FireGoblinModel<FireGoblin>> {
    public FireGoblinRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new FireGoblinModel<>(pContext.bakeLayer(ModModelLayers.FIRE_GOBLIN)), 0.4f);
    }

    @Override
    public ResourceLocation getTextureLocation(FireGoblin pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/fire_goblin.png");
    }
    @Override
    public void render(FireGoblin pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}

