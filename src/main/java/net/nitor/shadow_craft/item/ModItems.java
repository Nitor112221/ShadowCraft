package net.nitor.shadow_craft.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.item.custom.FlashWandItem;
import net.nitor.shadow_craft.item.custom.ModFoods;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShadowCraft.MOD_ID);

    public static final RegistryObject<Item> SHADOW_ROCK = ITEMS.register("shadow_rock", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CANDY = ITEMS.register("candy", () -> new Item(new Item.Properties().food(ModFoods.CANDY)));
    public static final RegistryObject<Item> FLASH_WAND = ITEMS.register("flash_wand", () -> new FlashWandItem(new Item.Properties().durability(100)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
