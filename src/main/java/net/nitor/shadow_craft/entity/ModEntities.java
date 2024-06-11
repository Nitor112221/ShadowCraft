package net.nitor.shadow_craft.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.entity.custom.ShadowSpiritEntity;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ShadowCraft.MOD_ID);

    public static final RegistryObject<EntityType<ShadowSpiritEntity>> SHADOW_SPIRIT =
            ENTITY_TYPES.register("shadow_spirit", () -> EntityType.Builder.of(ShadowSpiritEntity::new, MobCategory.CREATURE).sized(0.5f, 1.5f).build("shadow_spirit"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
