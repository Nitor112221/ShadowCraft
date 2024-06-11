package net.nitor.shadow_craft.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.entity.custom.ShadowSpiritEntity;

public class ShadowSpiritRenderer extends MobRenderer<ShadowSpiritEntity, ShadowSpiritModel<ShadowSpiritEntity>> {
    public ShadowSpiritRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ShadowSpiritModel<>(pContext.bakeLayer(ModModelLayers.SHADOW_SPIRIT_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(ShadowSpiritEntity pEntity) {
        return new ResourceLocation(ShadowCraft.MOD_ID, "textures/entity/shadow_spirit.png");
    }

    @Override
    public void render(ShadowSpiritEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pPoseStack, MultiBufferSource pBuffer, int pPackedLight) {
        if (pEntity.isBaby()) {
            pPoseStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pPoseStack, pBuffer, pPackedLight);
    }
}
