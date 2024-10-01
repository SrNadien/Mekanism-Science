package com.fxd927.mekanismscience.common.item.tablet;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class MuscleEnhancementTablet extends Item{
    private static final int BASE_DURATION = 12000;

    public MuscleEnhancementTablet(Item.Properties properties){
        super(properties);
    }
    @Override
    public ItemStack finishUsingItem(ItemStack stack, Level level, LivingEntity entity) {
        if (!level.isClientSide && entity instanceof Player) {
            Player player = (Player) entity;

            MobEffectInstance currentEffect = player.getEffect(MobEffects.DAMAGE_BOOST);
            player.getCooldowns().addCooldown(this,6000);

            int newDuration;
            if (currentEffect != null) {
                newDuration = currentEffect.getDuration() + BASE_DURATION;
            } else {
                newDuration = BASE_DURATION;
            }

            player.addEffect(new MobEffectInstance(MobEffects.DAMAGE_BOOST, newDuration, 1));
        }
        return super.finishUsingItem(stack, level, entity);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack stack) {
        return UseAnim.EAT;
    }

    @Override
    public int getUseDuration(ItemStack stack) {
        return 20;
    }
}
