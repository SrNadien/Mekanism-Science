package com.fxd927.mekanismscience.client.gui.machine;

import com.fxd927.mekanismscience.common.tile.machine.TileEntitySeawaterPump;
import mekanism.client.gui.GuiMekanismTile;
import mekanism.client.gui.element.GuiInnerScreen;
import mekanism.client.gui.element.bar.GuiVerticalPowerBar;
import mekanism.client.gui.element.gauge.GaugeType;
import mekanism.client.gui.element.gauge.GuiFluidGauge;
import mekanism.client.gui.element.tab.GuiEnergyTab;
import mekanism.common.MekanismLang;
import mekanism.common.capabilities.energy.MachineEnergyContainer;
import mekanism.common.inventory.container.tile.MekanismTileContainer;
import mekanism.common.inventory.warning.WarningTracker;
import mekanism.common.util.text.EnergyDisplay;
import mekanism.common.util.text.TextUtils;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.fluids.FluidStack;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;

public class GuiSeawaterPump extends GuiMekanismTile<TileEntitySeawaterPump, MekanismTileContainer<TileEntitySeawaterPump>> {
    public GuiSeawaterPump(MekanismTileContainer<TileEntitySeawaterPump> container, Inventory inv, Component title) {
        super(container, inv, title);
        inventoryLabelY += 2;
        dynamicSlots = true;
    }

    @Override
    protected void addGuiElements() {
        super.addGuiElements();
        addRenderableWidget(new GuiInnerScreen(this, 54, 23, 80, 41, () -> {
            List<Component> list = new ArrayList<>();
            list.add(EnergyDisplay.of(tile.getEnergyContainer()).getTextComponent());
            FluidStack fluidStack = tile.fluidTank.getFluid();
            if (fluidStack.isEmpty()) {
                list.add(MekanismLang.NO_FLUID.translate());
            } else {
                list.add(MekanismLang.GENERIC_STORED_MB.translate(fluidStack, TextUtils.format(fluidStack.getAmount())));
            }
            return list;
        }));
        addRenderableWidget(new GuiVerticalPowerBar(this, tile.getEnergyContainer(), 164, 15))
                .warning(WarningTracker.WarningType.NOT_ENOUGH_ENERGY, () -> {
                    MachineEnergyContainer<TileEntitySeawaterPump> energyContainer = tile.getEnergyContainer();
                    return energyContainer.getEnergyPerTick().greaterThan(energyContainer.getEnergy());
                });
        addRenderableWidget(new GuiFluidGauge(() -> tile.fluidTank, () -> tile.getFluidTanks(null), GaugeType.STANDARD, this, 6, 13))
                .warning(WarningTracker.WarningType.NO_SPACE_IN_OUTPUT, () -> tile.fluidTank.getNeeded() < TileEntitySeawaterPump.SEAWATER_STACK.getAmount());

        addRenderableWidget(new GuiEnergyTab(this, () -> {
            return List.of(EnergyDisplay.of(tile.getEnergyContainer()).getTextComponent());
        }));
    }


    @Override
    protected void drawForegroundText(@Nonnull GuiGraphics matrix, int mouseX, int mouseY) {
        renderTitleText(matrix);
        drawString(matrix, playerInventoryTitle, inventoryLabelX, inventoryLabelY, titleTextColor());
        super.drawForegroundText(matrix, mouseX, mouseY);
    }
}

