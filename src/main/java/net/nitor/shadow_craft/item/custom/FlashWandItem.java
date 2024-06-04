package net.nitor.shadow_craft.item.custom;

import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class FlashWandItem extends Item {
    public FlashWandItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level pLevel, Player pPlayer, InteractionHand pUsedHand) {
        float rotation_vert = pPlayer.getRotationVector().x;
        float rotation_hor = pPlayer.getRotationVector().y;
        System.out.println(rotation_hor);
        System.out.println(rotation_vert);
        double dx = (-Math.sin(Math.toRadians(rotation_hor))) * 10;
        double dz = (Math.cos(Math.toRadians(rotation_hor))) * 10;
        double dy = (-Math.sin(Math.toRadians(rotation_vert))) * 10;
        pPlayer.teleportTo(pPlayer.getX() + dx, pPlayer.getY() + dy, pPlayer.getZ() + dz);
        pPlayer.getItemInHand(pUsedHand).hurtAndBreak(1, pPlayer, player -> player.broadcastBreakEvent(player.getUsedItemHand()));
        return super.use(pLevel, pPlayer, pUsedHand);
    }


    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        entity.kill();
        stack.hurtAndBreak(1, player, player1 -> player1.broadcastBreakEvent(player1.getUsedItemHand()));
        return true;
    }

    private void outputValuableCoordinates(BlockPos blockPos, Player player, Block block) {
        player.sendSystemMessage(Component.literal("Found " + I18n.get(block.getDescriptionId()) + " at " + "(" + blockPos.getX() + ", " + blockPos.getY() + ", " + blockPos.getZ() + ")"));
    }
}
