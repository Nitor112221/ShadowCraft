package net.nitor.shadow_craft.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.item.custom.FlashWandItem;
import net.nitor.shadow_craft.item.custom.FuelItem;
import net.nitor.shadow_craft.item.custom.ModFoods;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShadowCraft.MOD_ID);

    public static final RegistryObject<Item> SHADOW_ROCK = ITEMS.register("shadow_rock", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YOUR_MIND = ITEMS.register("your_mind", () -> new FuelItem(new Item.Properties(), 800));
    public static final RegistryObject<Item> CANDY = ITEMS.register("candy", () -> new Item(new Item.Properties().food(ModFoods.CANDY)));
    public static final RegistryObject<Item> FLASH_WAND = ITEMS.register("flash_wand", () -> new FlashWandItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> TRAVELER_SWORD = ITEMS.register("traveler_sword", () -> new SwordItem(Tiers.DIAMOND,10, -2.4f, new Item.Properties().durability(2000)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
