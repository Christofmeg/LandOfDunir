package net.sufia.landofdrunir.entity.client;

// Made with Blockbench 4.8.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.sufia.landofdrunir.entity.animation.ModAnimationDefinitions;
import net.sufia.landofdrunir.entity.custom.Deer;

public class DeerModel<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "deer"), "main");
    private final ModelPart deer;
    private final ModelPart head;

    public DeerModel(ModelPart root) {
        this.deer = root.getChild("deer");
        this.head = root.getChild("deer").getChild("upper").getChild("head2");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition deer = partdefinition.addOrReplaceChild("deer", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, -1.0F));

        PartDefinition upper = deer.addOrReplaceChild("upper", CubeListBuilder.create(), PartPose.offset(0.0F, -17.0F, -6.0F));

        PartDefinition head2 = upper.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(1, 31).addBox(-2.5F, -10.5F, -6.0F, 5.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 1.5F, -2.0F));

        PartDefinition nose = head2.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(3, 15).addBox(-2.0F, -23.0F, -17.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.5F, 9.0F));

        PartDefinition RE = head2.addOrReplaceChild("RE", CubeListBuilder.create(), PartPose.offset(-2.0F, -9.5F, 0.25F));

        PartDefinition earright_r1 = RE.addOrReplaceChild("earright_r1", CubeListBuilder.create().texOffs(6, 9).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        PartDefinition RA = head2.addOrReplaceChild("RA", CubeListBuilder.create(), PartPose.offset(0.0F, 15.5F, 9.0F));

        PartDefinition antlersright_r1 = RA.addOrReplaceChild("antlersright_r1", CubeListBuilder.create().texOffs(44, 33).addBox(-1.5F, -8.0F, 0.0F, 7.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -26.0F, -11.0F, -0.0873F, -0.9163F, -0.6545F));

        PartDefinition LA = head2.addOrReplaceChild("LA", CubeListBuilder.create(), PartPose.offset(0.0F, 15.5F, 9.0F));

        PartDefinition antlersleft_r1 = LA.addOrReplaceChild("antlersleft_r1", CubeListBuilder.create().texOffs(29, 33).addBox(-5.5F, -8.0F, 0.0F, 7.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -26.0F, -11.0F, -0.0873F, 0.9163F, 0.6545F));

        PartDefinition LE = head2.addOrReplaceChild("LE", CubeListBuilder.create(), PartPose.offset(0.0F, 15.5F, 9.0F));

        PartDefinition earleft_r1 = LE.addOrReplaceChild("earleft_r1", CubeListBuilder.create().texOffs(6, 9).addBox(-1.0F, -1.0F, -0.5F, 2.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, -26.0F, -8.75F, 0.0F, 0.0F, 0.7854F));

        PartDefinition neck = head2.addOrReplaceChild("neck", CubeListBuilder.create().texOffs(49, 9).addBox(-2.0F, -21.0F, -10.0F, 4.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.5F, 9.0F));

        PartDefinition body = deer.addOrReplaceChild("body", CubeListBuilder.create().texOffs(1, 4).addBox(-4.0F, -19.0F, -8.0F, 8.0F, 8.0F, 18.0F, new CubeDeformation(0.0F))
                .texOffs(36, 12).addBox(-1.5F, -20.0F, 9.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition BRL = deer.addOrReplaceChild("BRL", CubeListBuilder.create().texOffs(27, 45).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -11.0F, 8.0F));

        PartDefinition BLL = deer.addOrReplaceChild("BLL", CubeListBuilder.create().texOffs(40, 45).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -11.0F, 8.0F));

        PartDefinition FRL = deer.addOrReplaceChild("FRL", CubeListBuilder.create().texOffs(1, 45).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, -11.0F, -6.0F));

        PartDefinition FLL = deer.addOrReplaceChild("FLL", CubeListBuilder.create().texOffs(14, 45).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -11.0F, -6.0F));

        return LayerDefinition.create(meshdefinition, 64, 64);
    }


    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

        this.animateWalk(ModAnimationDefinitions.DEER_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(((Deer) entity).idleAnimationState, ModAnimationDefinitions.DEER_IDLE, ageInTicks, 1f);

    }
    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        deer.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return deer;
    }
}