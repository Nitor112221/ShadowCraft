package net.nitor.shadow_craft.block.custom;

import net.minecraft.core.BlockPos;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class MagicBlock extends Block {

    public MagicBlock(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public void stepOn(Level pLevel, BlockPos pPos, BlockState pState, Entity pEntity) {
        LivingEntity livingEntity = (LivingEntity) pEntity;
        livingEntity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 40, 1));
        super.stepOn(pLevel, pPos, pState, pEntity);
    }

    @Override
    public void playerWillDestroy(Level pLevel, BlockPos pPos, BlockState pState, Player pPlayer) {
        pPlayer.hurt(pPlayer.damageSources().magic(), 4);
        super.playerWillDestroy(pLevel, pPos, pState, pPlayer);
    }
}
