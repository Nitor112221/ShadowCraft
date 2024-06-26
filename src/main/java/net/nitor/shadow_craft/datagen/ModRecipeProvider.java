package net.nitor.shadow_craft.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.block.ModBlocks;
import net.nitor.shadow_craft.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    private static final List<ItemLike> SHADOW_ROCK_SMELTABLES = List.of(ModBlocks.SHADOW_ROCK_ORE.get());

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {
        oreBlasting(pWriter, SHADOW_ROCK_SMELTABLES, RecipeCategory.MISC, ModItems.SHADOW_ROCK.get(), 0.25f, 100, "shadow_rock");
        oreSmelting(pWriter, SHADOW_ROCK_SMELTABLES, RecipeCategory.MISC, ModItems.SHADOW_ROCK.get(), 0.25f, 200, "shadow_rock");

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHADOW_ROCK_PICKAXE.get())
                .pattern("SSS")
                .pattern(" T ")
                .pattern(" T ")
                .define('S', ModItems.SHADOW_ROCK.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.SHADOW_ROCK.get()), has(ModItems.SHADOW_ROCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHADOW_ROCK_SWORD.get())
                .pattern("S")
                .pattern("S")
                .pattern("T")
                .define('S', ModItems.SHADOW_ROCK.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.SHADOW_ROCK.get()), has(ModItems.SHADOW_ROCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHADOW_ROCK_SHOVEL.get())
                .pattern("S")
                .pattern("T")
                .pattern("T")
                .define('S', ModItems.SHADOW_ROCK.get())
                .unlockedBy(getHasName(ModItems.SHADOW_ROCK.get()), has(ModItems.SHADOW_ROCK.get()))
                .define('T', Items.STICK)
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHADOW_ROCK_AXE.get())
                .pattern("SS")
                .pattern("ST")
                .pattern(" T")
                .define('S', ModItems.SHADOW_ROCK.get())
                .define('T', Items.STICK)
                .unlockedBy(getHasName(ModItems.SHADOW_ROCK.get()), has(ModItems.SHADOW_ROCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHADOW_HELMET.get())
                .pattern("SSS")
                .pattern("SNS")
                .pattern("SSS")
                .define('S', ModItems.SHADOW_ROCK.get())
                .define('N', Items.NETHERITE_HELMET)
                .unlockedBy(getHasName(ModItems.SHADOW_ROCK.get()), has(ModItems.SHADOW_ROCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHADOW_CHESTPLATE.get())
                .pattern("SSS")
                .pattern("SNS")
                .pattern("SSS")
                .define('S', ModItems.SHADOW_ROCK.get())
                .define('N', Items.NETHERITE_CHESTPLATE)
                .unlockedBy(getHasName(ModItems.SHADOW_ROCK.get()), has(ModItems.SHADOW_ROCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHADOW_LEGGINGS.get())
                .pattern("SSS")
                .pattern("SNS")
                .pattern("SSS")
                .define('S', ModItems.SHADOW_ROCK.get())
                .define('N', Items.NETHERITE_LEGGINGS)
                .unlockedBy(getHasName(ModItems.SHADOW_ROCK.get()), has(ModItems.SHADOW_ROCK.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.SHADOW_BOOTS.get())
                .pattern("SSS")
                .pattern("SNS")
                .pattern("SSS")
                .define('S', ModItems.SHADOW_ROCK.get())
                .define('N', Items.NETHERITE_BOOTS)
                .unlockedBy(getHasName(ModItems.SHADOW_ROCK.get()), has(ModItems.SHADOW_ROCK.get()))
                .save(pWriter);
    }

    protected static void oreSmelting(Consumer<FinishedRecipe> pWriter, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pWriter, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pWriter, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pWriter, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pWriter, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        for (ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike),
                    pCategory, pResult, pExperience, pCookingTime,
                    pSerializer).group(pGroup).unlockedBy(getHasName(itemlike),
                    has(itemlike)).save(pWriter,   ShadowCraft.MOD_ID + ":" + getItemName(pResult) + pSuffix + "_" + getItemName(itemlike));
        }

    }
}
