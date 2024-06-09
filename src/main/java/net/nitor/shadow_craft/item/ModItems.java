package net.nitor.shadow_craft.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.item.custom.FlashWandItem;
import net.nitor.shadow_craft.item.custom.FuelItem;
import net.nitor.shadow_craft.item.custom.ModArmorItem;
import net.nitor.shadow_craft.item.custom.ModFoods;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ShadowCraft.MOD_ID);

    public static final RegistryObject<Item> SHADOW_ROCK = ITEMS.register("shadow_rock", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> YOUR_MIND = ITEMS.register("your_mind", () -> new FuelItem(new Item.Properties(), 800));
    public static final RegistryObject<Item> CANDY = ITEMS.register("candy", () -> new Item(new Item.Properties().food(ModFoods.CANDY)));
    public static final RegistryObject<Item> FLASH_WAND = ITEMS.register("flash_wand", () -> new FlashWandItem(new Item.Properties().durability(100)));
    public static final RegistryObject<Item> TRAVELER_SWORD = ITEMS.register("traveler_sword", () -> new SwordItem(ModToolTiers.SHADOW_ROCK,10, -2.4f, new Item.Properties().durability(2000)));
    public static final RegistryObject<Item> SHADOW_ROCK_SWORD = ITEMS.register("shadow_rock_sword", () -> new SwordItem(ModToolTiers.SHADOW_ROCK,4, 2, new Item.Properties().durability(2000)));
    public static final RegistryObject<Item> SHADOW_ROCK_PICKAXE = ITEMS.register("shadow_rock_pickaxe", () -> new PickaxeItem(ModToolTiers.SHADOW_ROCK,1, 2, new Item.Properties().durability(2000)));
    public static final RegistryObject<Item> SHADOW_ROCK_SHOVEL = ITEMS.register("shadow_rock_shovel", () -> new ShovelItem(ModToolTiers.SHADOW_ROCK,1, 2, new Item.Properties().durability(2000)));
    public static final RegistryObject<Item> SHADOW_ROCK_AXE = ITEMS.register("shadow_rock_axe", () -> new SwordItem(ModToolTiers.SHADOW_ROCK,4, 1, new Item.Properties().durability(2000)));

    public static final RegistryObject<Item> SHADOW_HELMET = ITEMS.register("shadow_helmet", () -> new ModArmorItem(ModArmorMaterials.SHADOW_ROCK,ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> SHADOW_CHESTPLATE = ITEMS.register("shadow_chestplate", () -> new ModArmorItem(ModArmorMaterials.SHADOW_ROCK,ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> SHADOW_LEGGINGS = ITEMS.register("shadow_leggings", () -> new ModArmorItem(ModArmorMaterials.SHADOW_ROCK,ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> SHADOW_BOOTS = ITEMS.register("shadow_boots", () -> new ModArmorItem(ModArmorMaterials.SHADOW_ROCK,ArmorItem.Type.BOOTS, new Item.Properties()));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
