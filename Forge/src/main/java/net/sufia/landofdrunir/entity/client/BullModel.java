package net.sufia.landofdrunir.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.entity.animation.ModAnimationDefinitions;
import net.sufia.landofdrunir.entity.custom.Bull;
import net.sufia.landofdrunir.entity.custom.PortalGuardian;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class BullModel<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "bull"), "main");
    private final ModelPart bull;
    private final ModelPart head;

    public BullModel(ModelPart root) {
        this.bull = root.getChild("bull");
        this.head = root.getChild("bull").getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition bull = partdefinition.addOrReplaceChild("bull", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 1.0F));

        PartDefinition head = bull.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -19.0F, -10.0F));

        PartDefinition nose_r1 = head.addOrReplaceChild("nose_r1", CubeListBuilder.create().texOffs(55, 59).addBox(-2.0F, 0.7588F, -4.75F, 4.0F, 4.0F, 5.0F, new CubeDeformation(0.0F))
                .texOffs(45, 0).addBox(-4.0F, -4.2412F, -2.75F, 8.0F, 8.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2412F, -6.25F, 0.2182F, 0.0F, 0.0F));

        PartDefinition horns = head.addOrReplaceChild("horns", CubeListBuilder.create(), PartPose.offset(0.0F, 20.0F, 6.0F));

        PartDefinition hornleft = horns.addOrReplaceChild("hornleft", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -22.0F, -11.5F, -0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r1 = hornleft.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(60, 49).addBox(5.0F, -2.3599F, -4.812F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(12, 0).addBox(4.0F, -2.3599F, -0.812F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0F, 2.3589F, -0.1444F, 0.2182F, 0.0F, 0.0F));

        PartDefinition hornright = horns.addOrReplaceChild("hornright", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -22.0F, -11.5F, -0.2618F, 0.0F, 0.0F));

        PartDefinition cube_r2 = hornright.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 64).addBox(-7.0F, -2.3599F, -4.812F, 2.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
                .texOffs(14, 14).addBox(-5.0F, -2.3599F, -0.812F, 1.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 2.3589F, -0.1444F, 0.2182F, 0.0F, 0.0F));

        PartDefinition body = bull.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 0).addBox(-6.0F, -24.0F, -10.0F, 12.0F, 12.0F, 21.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(-7.0F, -25.0F, -11.0F, 14.0F, 15.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.0F, -1.0F));

        PartDefinition backll = body.addOrReplaceChild("backll", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -10.0F, 7.0F));

        PartDefinition frontll = body.addOrReplaceChild("frontll", CubeListBuilder.create().texOffs(44, 33).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, -9.0F, -9.0F));

        PartDefinition backrl = body.addOrReplaceChild("backrl", CubeListBuilder.create().texOffs(0, 33).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -9.0F, 7.0F));

        PartDefinition frontrl = body.addOrReplaceChild("frontrl", CubeListBuilder.create().texOffs(60, 33).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -9.0F, -9.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

        this.animateWalk(ModAnimationDefinitions.BULL_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(((Bull) entity).idleAnimationState, ModAnimationDefinitions.BULL_IDLE, ageInTicks, 1f);
        this.animate(((Bull) entity).attackAnimationState, ModAnimationDefinitions.BULL_ATTACK, ageInTicks, 1f);
    }
    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }


    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        bull.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }
    public ModelPart root() {
        return bull;
    }
}