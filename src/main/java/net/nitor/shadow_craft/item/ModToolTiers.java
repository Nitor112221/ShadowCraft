package net.nitor.shadow_craft.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.util.ModTags;

import java.util.List;

public class ModToolTiers {
    public static final Tier SHADOW_ROCK = TierSortingRegistry.registerTier(
            new ForgeTier(5, 1500, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_SHADOW_ROCK_TOOL, () -> Ingredient.of(ModItems.SHADOW_ROCK.get())),
            new ResourceLocation(ShadowCraft.MOD_ID, "shadow_rock"), List.of(Tiers.NETHERITE), List.of());
}
