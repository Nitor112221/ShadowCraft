package net.nitor.shadow_craft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.Entity;
import net.nitor.shadow_craft.entity.animations.ModAnimationDefinitions;
import net.nitor.shadow_craft.entity.custom.ShadowSpiritEntity;

public class ShadowSpiritModel <T extends Entity> extends HierarchicalModel<T> {
	private final ModelPart shadow_spirit;
	private final ModelPart bone;

	public ShadowSpiritModel(ModelPart root) {
		this.shadow_spirit = root.getChild("shadow_spirit");
		this.bone = shadow_spirit.getChild("bone");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition shadow_spirit = partdefinition.addOrReplaceChild("shadow_spirit", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bone = shadow_spirit.addOrReplaceChild("bone", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, -23.0F, -3.0F, 8.0F, 16.0F, 8.0F, new CubeDeformation(0.0F))
				.texOffs(28, 51).addBox(-5.5F, -10.0F, -3.5F, 9.0F, 4.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);

		this.animateWalk(ModAnimationDefinitions.IDLE, limbSwing, limbSwingAmount, 1f, 2.5f);
		this.animate(((ShadowSpiritEntity) entity).idleAnimationState, ModAnimationDefinitions.IDLE, ageInTicks, 1f);
		this.animate(((ShadowSpiritEntity) entity).attackAnimationState, ModAnimationDefinitions.IDLE, ageInTicks, 1f);

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		shadow_spirit.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return shadow_spirit;
	}
}