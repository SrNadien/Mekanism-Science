package com.fxd927.mekanismscience.common.advancements;

import mekanism.common.Mekanism;
import mekanism.common.advancements.MekanismAdvancement;
import org.jetbrains.annotations.Nullable;

import static mekanism.common.advancements.MekanismAdvancements.PLUTONIUM;
import static mekanism.common.advancements.MekanismAdvancements.PUMP;

public class MSAdvancements {
    private static MekanismAdvancement advancement(@Nullable MekanismAdvancement parent, String name) {
        return new MekanismAdvancement(parent, Mekanism.rl(name));
    }

    public static final MekanismAdvancement NEUTRON_SOURCE = advancement(PLUTONIUM, "neutron_source");
    public static final MekanismAdvancement SEAWATER_PUMP = advancement(PUMP, "seawater_pump");

    private MSAdvancements(){
    }
}
