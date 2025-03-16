package net.sufia.landofdrunir.entity.client;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.GoblinMinor;
import net.sufia.landofdrunir.entity.custom.MagmafiendFireballEntity;
@OnlyIn(Dist.CLIENT)
public class MagmafiendFireballRenderer extends EntityRenderer<MagmafiendFireballEntity> {


    public MagmafiendFireballRenderer(EntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public ResourceLocation getTextureLocation(MagmafiendFireballEntity pEntity) {
        return new ResourceLocation(DrunirMod.MODID, "textures/entity/magmafiend_fireballl.png");
    }
    @Override
    public void render(MagmafiendFireballEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack,
                       MultiBufferSource pBuffer, int pPackedLight) {

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
