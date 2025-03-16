// Made with Blockbench 4.9.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
package net.sufia.landofdrunir.entity.client;

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
import net.sufia.landofdrunir.entity.custom.Magmafiend;


public class MagmafiendModel<T extends Entity> extends HierarchicalModel<T> {
    // This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "magmafiend"), "main");
    private final ModelPart entity;
    private final ModelPart Head;

    public MagmafiendModel(ModelPart root) {
        this.entity = root.getChild("magma_golem");
        this.Head = root.getChild("magma_golem").getChild("body").getChild("head");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition magma_golem = partdefinition.addOrReplaceChild("magma_golem", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

        PartDefinition body = magma_golem.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 57).addBox(-9.5F, -21.5F, -9.0F, 19.0F, 22.0F, 17.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.5F, 0.0F));

        PartDefinition arm_l = body.addOrReplaceChild("arm_l", CubeListBuilder.create(), PartPose.offset(-8.4F, -18.1F, 0.0F));

        PartDefinition cube_r1 = arm_l.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(62, 23).mirror().addBox(-9.5F, -7.5F, -6.0F, 13.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 2.1F, 0.0F, 0.0F, 0.0F, -0.6545F));

        PartDefinition arm_l_joint = arm_l.addOrReplaceChild("arm_l_joint", CubeListBuilder.create(), PartPose.offset(-7.6F, 6.1F, 0.0F));

        PartDefinition cube_r2 = arm_l_joint.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(82, 0).mirror().addBox(-0.0142F, -0.0246F, -4.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.4F, 2.9F, 0.0F, 0.0F, 0.0F, -1.0036F));

        PartDefinition unterarm_l = arm_l_joint.addOrReplaceChild("unterarm_l", CubeListBuilder.create(), PartPose.offset(-3.0F, 6.0F, 0.0F));

        PartDefinition cube_r3 = unterarm_l.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-13.0142F, -1.0246F, -6.0F, 13.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.4F, -3.1F, 0.0F, 0.0F, 0.0F, -1.309F));

        PartDefinition finger_l2 = unterarm_l.addOrReplaceChild("finger_l2", CubeListBuilder.create(), PartPose.offset(-5.9F, 9.9F, 3.5F));

        PartDefinition cube_r4 = finger_l2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(74, 87).mirror().addBox(-19.0142F, -1.0246F, 1.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, -13.0F, -3.5F, 0.0F, 0.0F, -1.309F));

        PartDefinition thump = unterarm_l.addOrReplaceChild("thump", CubeListBuilder.create(), PartPose.offset(-0.4F, 7.9F, -6.0F));

        PartDefinition cube_r5 = thump.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-18.0142F, 3.9754F, -8.0F, 10.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.0F, -11.0F, 6.0F, 0.0F, 0.0F, -1.309F));

        PartDefinition finger_l = unterarm_l.addOrReplaceChild("finger_l", CubeListBuilder.create(), PartPose.offset(-5.9F, 9.9F, -4.0F));

        PartDefinition cube_r6 = finger_l.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(74, 87).mirror().addBox(-19.0142F, -1.0246F, -6.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, -13.0F, 4.0F, 0.0F, 0.0F, -1.309F));

        PartDefinition arm_r = body.addOrReplaceChild("arm_r", CubeListBuilder.create(), PartPose.offset(8.4F, -18.1F, 0.0F));

        PartDefinition cube_r7 = arm_r.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(62, 23).addBox(-3.5F, -7.5F, -6.0F, 13.0F, 11.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 2.1F, 0.0F, 0.0F, 0.0F, 0.6545F));

        PartDefinition arm_r_joint = arm_r.addOrReplaceChild("arm_r_joint", CubeListBuilder.create(), PartPose.offset(8.6F, 5.1F, 0.0F));

        PartDefinition cube_r8 = arm_r_joint.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(82, 0).addBox(-6.9858F, -0.0246F, -4.0F, 7.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.4F, 3.9F, 0.0F, 0.0F, 0.0F, 1.0036F));

        PartDefinition unterarm_r = arm_r_joint.addOrReplaceChild("unterarm_r", CubeListBuilder.create(), PartPose.offset(2.4F, 6.9F, 0.0F));

        PartDefinition cube_r9 = unterarm_r.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(0, 10).addBox(0.0142F, -1.0246F, -6.0F, 13.0F, 10.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -3.0F, 0.0F, 0.0F, 0.0F, 1.309F));

        PartDefinition finger_r = unterarm_r.addOrReplaceChild("finger_r", CubeListBuilder.create(), PartPose.offset(5.5F, 10.0F, 4.0F));

        PartDefinition cube_r10 = finger_r.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(74, 87).addBox(13.0142F, -1.0246F, 1.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, -13.0F, -4.0F, 0.0F, 0.0F, 1.309F));

        PartDefinition thump_r = unterarm_r.addOrReplaceChild("thump_r", CubeListBuilder.create(), PartPose.offset(0.0F, 8.0F, -6.0F));

        PartDefinition cube_r11 = thump_r.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 0).addBox(8.0142F, 3.9754F, -8.0F, 10.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, -11.0F, 6.0F, 0.0F, 0.0F, 1.309F));

        PartDefinition finger_r2 = unterarm_r.addOrReplaceChild("finger_r2", CubeListBuilder.create(), PartPose.offset(5.4F, 10.0F, -3.5F));

        PartDefinition cube_r12 = finger_r2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(74, 87).addBox(13.0142F, -1.0246F, -6.0F, 6.0F, 4.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.4F, -13.0F, 3.5F, 0.0F, 0.0F, 1.309F));

        PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(40, 3).addBox(-4.5F, -6.0F, -6.0F, 9.0F, 6.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -20.5F, 0.0F));

        PartDefinition leg_r = magma_golem.addOrReplaceChild("leg_r", CubeListBuilder.create(), PartPose.offset(5.0F, -24.0F, 0.5F));

        PartDefinition bone = leg_r.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.5F));

        PartDefinition cube_r13 = bone.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 33).addBox(-5.2632F, -1.7694F, -6.5F, 11.0F, 10.0F, 13.0F, new CubeDeformation(0.0F))
                .texOffs(0, 33).addBox(-5.2632F, -1.7694F, -6.5F, 11.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition leg_r_joint = leg_r.addOrReplaceChild("leg_r_joint", CubeListBuilder.create(), PartPose.offset(3.0F, 8.0F, -0.5F));

        PartDefinition cube_r14 = leg_r_joint.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(78, 71).addBox(-8.0F, -6.0F, -4.5F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 4.0F, 0.0F, 0.0F, 0.0F, -0.2182F));

        PartDefinition unterleg_r = leg_r_joint.addOrReplaceChild("unterleg_r", CubeListBuilder.create().texOffs(56, 47).addBox(-5.0F, -1.0F, -5.5F, 10.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

        PartDefinition leg_l = magma_golem.addOrReplaceChild("leg_l", CubeListBuilder.create(), PartPose.offset(-5.0F, -24.0F, 0.5F));

        PartDefinition WL = leg_l.addOrReplaceChild("WL", CubeListBuilder.create(), PartPose.offset(-7.0F, 12.0F, -0.5F));

        PartDefinition cube_r15 = WL.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 33).mirror().addBox(-1.5F, -15.0F, -6.5F, 11.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false)
                .texOffs(0, 33).mirror().addBox(-1.5F, -15.0F, -6.5F, 11.0F, 10.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition leg_l_joint = leg_l.addOrReplaceChild("leg_l_joint", CubeListBuilder.create(), PartPose.offset(-2.0F, 7.0F, -0.5F));

        PartDefinition cube_r16 = leg_l_joint.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(78, 71).mirror().addBox(0.0F, -6.0F, -4.5F, 8.0F, 6.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.2182F));

        PartDefinition unterleg_l = leg_l_joint.addOrReplaceChild("unterleg_l", CubeListBuilder.create().texOffs(56, 47).mirror().addBox(-6.0F, -1.0F, -5.5F, 10.0F, 12.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0F, 6.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.root().getAllParts().forEach(ModelPart::resetPose);
        this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);
        this.animateWalk(ModAnimationDefinitions.HEAVY_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.animate(((Magmafiend) entity).idleAnimationState, ModAnimationDefinitions.IDLE_CALM, ageInTicks, 1f);
        this.animate(((Magmafiend) entity).attackAnimationState, ModAnimationDefinitions.FIST_ATTACK2, ageInTicks, 1f);
    }
    private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
        pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
        pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

        this.Head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
        this.Head.xRot = pHeadPitch * ((float)Math.PI / 180F);
    }
    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        entity.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
    }

    @Override
    public ModelPart root() {
        return entity;
    }
}