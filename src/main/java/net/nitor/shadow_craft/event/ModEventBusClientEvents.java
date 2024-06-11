package net.nitor.shadow_craft.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.entity.client.ModModelLayers;
import net.nitor.shadow_craft.entity.client.ShadowSpiritModel;

@Mod.EventBusSubscriber(modid = ShadowCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(ModModelLayers.SHADOW_SPIRIT_LAYER, ShadowSpiritModel::createBodyLayer);
    }
}
