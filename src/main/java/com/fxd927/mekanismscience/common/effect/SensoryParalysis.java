package com.fxd927.mekanismscience.common.effect;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.neoforged.neoforge.common.NeoForge;

public class SensoryParalysis extends MobEffect {
    public SensoryParalysis(MobEffectCategory mobEffectCategory, int color) {
        super(mobEffectCategory, color);
        //NeoForge.EVENT_BUS.register(this);
    }

    //@Override
    //public void applyEffectTick(LivingEntity entity, int amplifier) {
        //if (!entity.isInvulnerable()) {
            //entity.setInvulnerable(true);
        //}
    //}

    //@Override
    //public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
        //super.removeAttributeModifiers(entity, attributeMap, amplifier);
        //if (entity.isInvulnerable()) {
            //entity.setInvulnerable(false);
        //}
    //}

    //@Override
    //public boolean isDurationEffectTick(int duration, int amplifier) {
        //return true;
    //}
}
