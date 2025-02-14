package com.fxd927.mekanismscience.api.recipes.basic;

import com.fxd927.mekanismscience.api.recipes.AdsorptionRecipe;
import com.fxd927.mekanismscience.api.recipes.MSRecipeSerializers;
import com.fxd927.mekanismscience.api.recipes.RadiationIrradiatingRecipe;
import mekanism.api.chemical.ChemicalStack;
import mekanism.api.recipes.ingredients.ChemicalStackIngredient;
import mekanism.api.recipes.ingredients.ItemStackIngredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeSerializer;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class BasicAdsorptionRecipe extends AdsorptionRecipe {
    protected final ItemStackIngredient itemInput;
    protected final ChemicalStackIngredient chemicalInput;
    protected final ChemicalStack output;
    private final boolean perTickUsage;

    /**
     * @param itemInput     Item input.
     * @param chemicalInput Chemical input.
     * @param output        Output.
     * @param perTickUsage  Should the recipe consume the chemical input each tick it is processing.
     */
    public BasicAdsorptionRecipe(ItemStackIngredient itemInput, ChemicalStackIngredient chemicalInput, ChemicalStack output, boolean perTickUsage) {
        this.itemInput = Objects.requireNonNull(itemInput, "Item input cannot be null.");
        this.chemicalInput = Objects.requireNonNull(chemicalInput, "Chemical input cannot be null.");
        Objects.requireNonNull(output, "Output cannot be null.");
        if (output.isEmpty()) {
            throw new IllegalArgumentException("Output cannot be empty.");
        }
        this.output = output.copy();
        this.perTickUsage = perTickUsage;
    }

    @Override
    public boolean perTickUsage() {
        return perTickUsage;
    }

    @Override
    public ItemStackIngredient getItemInput() {
        return itemInput;
    }

    @Override
    public ChemicalStackIngredient getChemicalInput() {
        return chemicalInput;
    }

    @Override
    public ChemicalStack getOutput(ItemStack inputItem, ChemicalStack inputChemical) {
        return output.copy();
    }

    @Override
    public boolean test(ItemStack itemStack, ChemicalStack chemicalStack) {
        return itemInput.test(itemStack) && chemicalInput.test(chemicalStack);
    }

    @Override
    public List<ChemicalStack> getOutputDefinition() {
        return Collections.singletonList(output);
    }

    /**
     * For Serializer usage only. Do not modify the returned stack!
     *
     * @return the uncopied output definition
     */
    public ChemicalStack getOutputRaw() {
        return output;
    }

    @Override
    public RecipeSerializer<BasicAdsorptionRecipe> getSerializer() {
        return MSRecipeSerializers.ADSORPTION.get();
    }
}
