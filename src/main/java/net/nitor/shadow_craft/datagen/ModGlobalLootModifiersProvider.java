package net.nitor.shadow_craft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.functions.LootItemFunctions;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceWithLootingCondition;
import net.minecraftforge.common.data.GlobalLootModifierProvider;
import net.minecraftforge.common.loot.LootTableIdCondition;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.item.ModItems;
import net.nitor.shadow_craft.loot.AddItemModifier;
import net.nitor.shadow_craft.loot.AddSusSendItemModifier;

public class ModGlobalLootModifiersProvider extends GlobalLootModifierProvider {
    public ModGlobalLootModifiersProvider(PackOutput output) {
        super(output, ShadowCraft.MOD_ID);
    }

    @Override
    protected void start() {
//        add("your_mind_from_mobs", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("entities/creeper")).build(),
//                LootItemRandomChanceWithLootingCondition.randomChanceAndLootingBoost(0.35f, 1.2f).build()}, ModItems.YOUR_MIND.get()));
//
//
//        add("flash_wand_from_jungle_temple", new AddItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("chests/jungle_temple")).build(),
//                LootItemRandomChanceCondition.randomChance(0.35f).build()}, ModItems.FLASH_WAND.get()));
//
//        add("flash_wand_from_suspicous_sand", new AddSusSendItemModifier(new LootItemCondition[] {
//                new LootTableIdCondition.Builder(new ResourceLocation("archaeology/desert_pyramid")).build()}, ModItems.FLASH_WAND.get()));


    }
}
