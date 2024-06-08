package net.nitor.shadow_craft.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.nitor.shadow_craft.ShadowCraft;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_SHADOW_ROCK_TOOL = tag("needs_shadow_rock_tool");
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ShadowCraft.MOD_ID, name));
        }
    }
    public static class Items {
        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(ShadowCraft.MOD_ID, name));
        }
    }
}
