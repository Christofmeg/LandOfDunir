package net.sufia.landofdrunir.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.sufia.landofdrunir.entity.animation.ModAnimationDefinitions;
import net.sufia.landofdrunir.entity.custom.PortalGuardian;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class PortalGuardianModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "portal_guardian"), "main");
	private final ModelPart Root;
	private final ModelPart Head;

	public PortalGuardianModel(ModelPart root) {

		this.Root = root.getChild("Root");
		this.Head = root.getChild("Root").getChild("Body").getChild("Upper").getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Root = partdefinition.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offset(0.0F, 29.0F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(40, 23).addBox(-7.0F, -1.0F, -3.0F, 14.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -21.0F, 0.0F));

		PartDefinition RightArm = Body.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -2.0F, -5.0F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(58, 70).addBox(1.0F, 4.0F, -4.0F, 6.0F, 7.5F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(9.0F, -18.0F, 0.0F));

		PartDefinition RightBottomElbow = RightArm.addOrReplaceChild("RightBottomElbow", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, 11.0F, 0.0F, 0.3491F, 0.0F, 0.0F));

		PartDefinition RightBottomElbow_r1 = RightBottomElbow.addOrReplaceChild("RightBottomElbow_r1", CubeListBuilder.create().texOffs(0, 64).addBox(-3.0F, -6.0F, -6.5F, 6.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition RightHand = RightBottomElbow.addOrReplaceChild("RightHand", CubeListBuilder.create(), PartPose.offset(0.0F, 7.0F, -3.0F));

		PartDefinition RightHand_r1 = RightHand.addOrReplaceChild("RightHand_r1", CubeListBuilder.create().texOffs(50, 38).addBox(-4.0F, 0.0F, -0.5F, 8.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9051F, -3.8096F, -0.3491F, 0.0F, 0.0F));

		PartDefinition LeftArm = Body.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 18).addBox(-8.0F, -3.0F, -5.0F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
				.texOffs(58, 70).addBox(-7.0F, 3.5F, -4.0F, 6.0F, 7.25F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -17.0F, 0.0F));

		PartDefinition LeftArmBottomElbow = LeftArm.addOrReplaceChild("LeftArmBottomElbow", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, 11.0F, 0.5F, 0.3491F, 0.0F, 0.0F));

		PartDefinition LeftArmBottomElbow_r1 = LeftArmBottomElbow.addOrReplaceChild("LeftArmBottomElbow_r1", CubeListBuilder.create().texOffs(0, 64).addBox(-3.0F, -6.0F, -6.5F, 6.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition LeftHand = LeftArmBottomElbow.addOrReplaceChild("LeftHand", CubeListBuilder.create(), PartPose.offset(0.0F, 6.0F, -2.0F));

		PartDefinition LeftHand_r1 = LeftHand.addOrReplaceChild("LeftHand_r1", CubeListBuilder.create().texOffs(50, 38).addBox(-4.0F, 0.0F, -0.5F, 8.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9051F, -4.8096F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Club = LeftHand.addOrReplaceChild("Club", CubeListBuilder.create(), PartPose.offset(0.0F, 2.0F, 0.0F));

		PartDefinition Club_r1 = Club.addOrReplaceChild("Club_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 2.0F, 2.0F, 4.0F, 4.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -13.0F, -23.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Club_r2 = Club.addOrReplaceChild("Club_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.0F, -20.0F, 2.0F, 2.0F, 36.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0F, -5.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition Upper = Body.addOrReplaceChild("Upper", CubeListBuilder.create().texOffs(0, 38).addBox(-8.5F, -11.0F, -4.0F, 17.0F, 18.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -8.0F, 0.0F));

		PartDefinition Head = Upper.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -11.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition Head_r1 = Head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 0).addBox(20.5F, -7.5F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, -16.5F, -1.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Head_r2 = Head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 18).addBox(-1.75F, -3.5F, -1.0F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, -16.5F, -1.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Head_r3 = Head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(42, 38).addBox(12.25F, 1.4F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -12.0F, -1.0F, 0.0F, 0.0F, -0.1745F));

		PartDefinition Head_r4 = Head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(42, 42).addBox(-5.25F, -1.0F, -1.0F, 6.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.0F, -12.0F, -1.0F, 0.0F, 0.0F, 0.1745F));

		PartDefinition Head_r5 = Head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(40, 0).addBox(-5.0F, -6.5F, -5.5F, 10.0F, 13.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -6.5F, -0.5F, 0.0F, 0.7854F, 0.0F));

		PartDefinition RightLeg = Root.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(28, 64).addBox(-3.0F, 0.0F, -4.0F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -19.75F, 0.0F));

		PartDefinition RightShin = RightLeg.addOrReplaceChild("RightShin", CubeListBuilder.create().texOffs(50, 52).addBox(-3.0F, -2.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 7.0F, 0.0F));

		PartDefinition LeftLeg = Root.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(28, 64).addBox(-3.0F, -1.0F, -4.0F, 7.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -18.75F, 0.0F));

		PartDefinition LeftShin = LeftLeg.addOrReplaceChild("LeftShin", CubeListBuilder.create().texOffs(50, 52).addBox(-4.0F, 0.0F, -4.0F, 7.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 4.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
       this.root().getAllParts().forEach(ModelPart::resetPose);
	   this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

	   this.animateWalk(ModAnimationDefinitions.PORTALGUARDIAN_WALK, limbSwing, limbSwingAmount, 2f, 2.5f);
	   this.animate(((PortalGuardian) entity).idleAnimationState, ModAnimationDefinitions.PORTALGUARDIAN_IDLE, ageInTicks, 1f);
		this.animate(((PortalGuardian) entity).attackAnimationState, ModAnimationDefinitions.PORTALGUARDIAN_ATTACK, ageInTicks, 1f);
	}


	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.Head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.Head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}


	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Root.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
    @Override
	public ModelPart root() {
		return Root;
	}
}