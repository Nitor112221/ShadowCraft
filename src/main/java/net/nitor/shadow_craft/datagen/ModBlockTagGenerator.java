package net.nitor.shadow_craft.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.nitor.shadow_craft.ShadowCraft;
import net.nitor.shadow_craft.block.ModBlocks;
import net.nitor.shadow_craft.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {

    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ShadowCraft.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.SHADOW_ROCK_ORE.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.SHADOW_STONE.get());
        this.tag(ModTags.Blocks.NEEDS_SHADOW_ROCK_TOOL).add(ModBlocks.MAGIC_STONE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.SHADOW_STONE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.MAGIC_STONE.get());
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(ModBlocks.MAGIC_STONE.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(ModBlocks.MAGIC_STONE.get());
    }
}
