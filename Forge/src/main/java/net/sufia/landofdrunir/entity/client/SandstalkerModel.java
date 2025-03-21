package net.sufia.landofdrunir.entity.client;// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class SandstalkerModel<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "sandstalker"), "main");
	private final ModelPart torso;
	private final ModelPart leg_l1;
	private final ModelPart leg_r2;
	private final ModelPart leg_l2;
	private final ModelPart leg_r3;
	private final ModelPart leg_l3;
	private final ModelPart leg_r1;
	private final ModelPart head;
	private final ModelPart glaw_l;
	private final ModelPart glaw_r;

	public SandstalkerModel(ModelPart root) {
		this.torso = root.getChild("torso");
		this.leg_l1 = this.torso.getChild("leg_l1");
		this.leg_r2 = this.torso.getChild("leg_r2");
		this.leg_l2 = this.torso.getChild("leg_l2");
		this.leg_r3 = this.torso.getChild("leg_r3");
		this.leg_l3 = this.torso.getChild("leg_l3");
		this.leg_r1 = this.torso.getChild("leg_r1");
		this.head = this.torso.getChild("head");
		this.glaw_l = this.head.getChild("glaw_l");
		this.glaw_r = this.head.getChild("glaw_r");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition torso = partdefinition.addOrReplaceChild("torso", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 22.0F, -3.0F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r1 = torso.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 6.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg_l1 = torso.addOrReplaceChild("leg_l1", CubeListBuilder.create(), PartPose.offset(2.0F, 1.0F, 0.0F));

		PartDefinition cube_r2 = leg_l1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, -1.0F, -5.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg_r2 = torso.addOrReplaceChild("leg_r2", CubeListBuilder.create(), PartPose.offset(-2.0F, 1.0F, 1.6F));

		PartDefinition cube_r3 = leg_r2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-5.0F, -1.0F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, -0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg_l2 = torso.addOrReplaceChild("leg_l2", CubeListBuilder.create(), PartPose.offset(2.0F, 1.0F, 1.7F));

		PartDefinition cube_r4 = leg_l2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(48, 0).addBox(0.0F, -1.0F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, -0.2F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg_r3 = torso.addOrReplaceChild("leg_r3", CubeListBuilder.create(), PartPose.offset(-2.0F, 1.0F, 4.0F));

		PartDefinition cube_r5 = leg_r3.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(48, 0).mirror().addBox(-5.0F, -1.0F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 1.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg_l3 = torso.addOrReplaceChild("leg_l3", CubeListBuilder.create(), PartPose.offset(2.0F, 1.0F, 4.0F));

		PartDefinition cube_r6 = leg_l3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(48, 0).addBox(0.0F, -1.0F, -1.5F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 1.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leg_r1 = torso.addOrReplaceChild("leg_r1", CubeListBuilder.create(), PartPose.offset(-2.0F, 1.0F, 0.0F));

		PartDefinition cube_r7 = leg_r1.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 0).mirror().addBox(-5.0F, -1.0F, -5.0F, 5.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition head = torso.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 17).addBox(-3.0F, -3.0F, -8.0F, 6.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, 3.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition glaw_l = head.addOrReplaceChild("glaw_l", CubeListBuilder.create(), PartPose.offset(3.0F, 0.0F, -4.0F));

		PartDefinition cube_r9 = glaw_l.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(7, 17).addBox(-2.0F, 0.0F, -3.5F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 0.2179F, -2.4905F, 0.0873F, 0.0F, 0.0F));

		PartDefinition glaw_r = head.addOrReplaceChild("glaw_r", CubeListBuilder.create(), PartPose.offset(-3.0F, 0.0F, -4.0F));

		PartDefinition cube_r10 = glaw_r.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-1, 17).addBox(-1.0F, 0.0F, -6.0F, 4.0F, 0.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}