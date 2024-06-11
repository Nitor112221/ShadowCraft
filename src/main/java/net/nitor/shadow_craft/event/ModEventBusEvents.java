package net.nitor.shadow_craft.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.entity.ModEntities;
import net.nitor.shadow_craft.entity.client.ModModelLayers;
import net.nitor.shadow_craft.entity.client.ShadowSpiritModel;
import net.nitor.shadow_craft.entity.custom.ShadowSpiritEntity;

@Mod.EventBusSubscriber(modid = ShadowCraft.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(ModEntities.SHADOW_SPIRIT.get(), ShadowSpiritEntity.createAttributes().build());
    }
}
