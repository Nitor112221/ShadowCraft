package net.nitor.shadow_craft.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.registries.RegistryObject;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.block.ModBlocks;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ShadowCraft.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SHADOW_CRAFT = CREATIVE_MODE_TABS.register("shadow_craft_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHADOW_ROCK.get()))
                    .title(Component.translatable("creativetab.shadow_craft_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SHADOW_ROCK.get());
                        pOutput.accept(ModBlocks.SHADOW_STONE.get());
                        pOutput.accept(ModBlocks.SHADOW_ROCK_ORE.get());
                        pOutput.accept(ModItems.FLASH_WAND.get());
                        pOutput.accept(ModBlocks.MAGIC_STONE.get());
                        pOutput.accept(ModItems.CANDY.get());
                        pOutput.accept(ModItems.YOUR_MIND.get());
                        pOutput.accept(ModItems.TRAVELER_SWORD.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
