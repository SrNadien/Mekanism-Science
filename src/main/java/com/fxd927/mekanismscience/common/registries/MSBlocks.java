package com.fxd927.mekanismscience.common.registries;

import com.fxd927.mekanismscience.common.MekanismScience;
import com.fxd927.mekanismscience.common.content.blocktype.MSMachine;
import com.fxd927.mekanismscience.common.tile.machine.TileEntityAdsorptionTypeSeawaterMetalExtractor;
import com.fxd927.mekanismscience.common.tile.machine.TileEntityOrganicLiquidExtractor;
import com.fxd927.mekanismscience.common.tile.machine.TileEntitySeawaterPump;
import mekanism.api.text.EnumColor;
import mekanism.common.block.interfaces.IColoredBlock;
import mekanism.common.block.prefab.BlockTile;
import mekanism.common.block.states.BlockStateHelper;
import mekanism.common.item.block.ItemBlockColoredName;
import mekanism.common.item.block.machine.ItemBlockMachine;
import mekanism.common.registration.impl.BlockDeferredRegister;
import mekanism.common.registration.impl.BlockRegistryObject;
import mekanism.common.resource.BlockResourceInfo;
import mekanism.common.util.EnumUtils;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.ConcretePowderBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraftforge.registries.RegistryObject;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MSBlocks {
    public static final BlockDeferredRegister BLOCKS = new BlockDeferredRegister(MekanismScience.MODID);

    public static final BlockRegistryObject<Block,BlockItem> HIGH_QUALITY_CONCRETE ;
    public static final BlockRegistryObject<Block,BlockItem> AQUA_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> BLACK_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> BLUE_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> GREEN_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> CYAN_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> DARK_RED_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> PURPLE_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> ORANGE_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> LIGHT_GRAY_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> GRAY_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> LIGHT_BLUE_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> LIME_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> RED_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> MAGENTA_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> YELLOW_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> WHITE_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> BROWN_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> PINK_HIGH_QUALITY_CONCRETE;
    public static final BlockRegistryObject<Block,BlockItem> HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> AQUA_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> BLACK_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> BLUE_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> GREEN_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> CYAN_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> DARK_RED_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> PURPLE_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> ORANGE_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> LIGHT_GRAY_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> GRAY_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> LIGHT_BLUE_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> LIME_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> RED_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> MAGENTA_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> YELLOW_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> WHITE_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> BROWN_HIGH_QUALITY_CONCRETE_POWDER;
    public static final BlockRegistryObject<Block,BlockItem> PINK_HIGH_QUALITY_CONCRETE_POWDER;

    static {
        HIGH_QUALITY_CONCRETE = BLOCKS.register("high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        AQUA_HIGH_QUALITY_CONCRETE = BLOCKS.register("aqua_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        BLACK_HIGH_QUALITY_CONCRETE = BLOCKS.register("black_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.BLACK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        BLUE_HIGH_QUALITY_CONCRETE = BLOCKS.register("blue_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        GREEN_HIGH_QUALITY_CONCRETE = BLOCKS.register("green_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.GREEN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        CYAN_HIGH_QUALITY_CONCRETE = BLOCKS.register("cyan_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.CYAN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        DARK_RED_HIGH_QUALITY_CONCRETE = BLOCKS.register("dark_red_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        PURPLE_HIGH_QUALITY_CONCRETE = BLOCKS.register("purple_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.PURPLE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        ORANGE_HIGH_QUALITY_CONCRETE = BLOCKS.register("orange_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.ORANGE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        LIGHT_GRAY_HIGH_QUALITY_CONCRETE = BLOCKS.register("light_gray_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        GRAY_HIGH_QUALITY_CONCRETE = BLOCKS.register("gray_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.GRAY).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        LIGHT_BLUE_HIGH_QUALITY_CONCRETE = BLOCKS.register("light_blue_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        LIME_HIGH_QUALITY_CONCRETE = BLOCKS.register("lime_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.LIME).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        RED_HIGH_QUALITY_CONCRETE = BLOCKS.register("red_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.RED).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        MAGENTA_HIGH_QUALITY_CONCRETE = BLOCKS.register("magenta_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.MAGENTA).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        YELLOW_HIGH_QUALITY_CONCRETE = BLOCKS.register("yellow_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.YELLOW).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        WHITE_HIGH_QUALITY_CONCRETE = BLOCKS.register("white_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        BROWN_HIGH_QUALITY_CONCRETE = BLOCKS.register("brown_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.BROWN).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        PINK_HIGH_QUALITY_CONCRETE = BLOCKS.register("pink_high_quality_concrete", () -> new Block(BlockBehaviour.Properties.of().mapColor(DyeColor.PINK).instrument(NoteBlockInstrument.BASEDRUM).requiresCorrectToolForDrops().strength(1.8F)));
        HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("high_quality_concrete_powder", () -> new ConcretePowderBlock(HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_GRAY).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        AQUA_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("aqua_high_quality_concrete_powder", () -> new ConcretePowderBlock(AQUA_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        BLACK_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("black_high_quality_concrete_powder", () -> new ConcretePowderBlock(BLACK_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.BLACK).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        BLUE_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("blue_high_quality_concrete_powder", () -> new ConcretePowderBlock(BLUE_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.BLUE).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        GREEN_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("green_high_quality_concrete_powder", () -> new ConcretePowderBlock(GREEN_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.GREEN).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        CYAN_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("cyan_high_quality_concrete_powder", () -> new ConcretePowderBlock(CYAN_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.CYAN).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        DARK_RED_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("dark_red_high_quality_concrete_powder", () -> new ConcretePowderBlock(DARK_RED_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.RED).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        PURPLE_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("purple_high_quality_concrete_powder", () -> new ConcretePowderBlock(PURPLE_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.PURPLE).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        ORANGE_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("orange_high_quality_concrete_powder", () -> new ConcretePowderBlock(ORANGE_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.ORANGE).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        LIGHT_GRAY_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("light_gray_high_quality_concrete_powder", () -> new ConcretePowderBlock(LIGHT_GRAY_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_GRAY).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        GRAY_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("gray_high_quality_concrete_powder", () -> new ConcretePowderBlock(GRAY_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.GRAY).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        LIGHT_BLUE_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("light_blue_high_quality_concrete_powder", () -> new ConcretePowderBlock(LIGHT_BLUE_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.LIGHT_BLUE).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        LIME_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("lime_high_quality_concrete_powder", () -> new ConcretePowderBlock(LIME_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.LIME).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        RED_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("red_high_quality_concrete_powder", () -> new ConcretePowderBlock(RED_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.RED).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        MAGENTA_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("magenta_high_quality_concrete_powder", () -> new ConcretePowderBlock(MAGENTA_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.MAGENTA).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        YELLOW_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("yellow_high_quality_concrete_powder", () -> new ConcretePowderBlock(YELLOW_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.YELLOW).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        WHITE_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("white_high_quality_concrete_powder", () -> new ConcretePowderBlock(WHITE_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.WHITE).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        BROWN_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("brown_high_quality_concrete_powder", () -> new ConcretePowderBlock(BROWN_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.BROWN).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
        PINK_HIGH_QUALITY_CONCRETE_POWDER = BLOCKS.register("pink_high_quality_concrete_powder", () -> new ConcretePowderBlock(PINK_HIGH_QUALITY_CONCRETE.getBlock(), BlockBehaviour.Properties.of().mapColor(DyeColor.PINK).instrument(NoteBlockInstrument.SNARE).strength(5.0F, 6.0F).sound(SoundType.SAND)));
    }

    //public static final BlockRegistryObject<BlockTile.BlockTileModel<TileEntityAdsorptionTypeSeawaterMetalExtractor,MSMachine<TileEntityAdsorptionTypeSeawaterMetalExtractor>>,ItemBlockMachine> ADSORPTION_TYPE_SEAWATER_METAL_EXTRACTOR = BLOCKS.register("adsorption_type_seawater_metal_extractor",() -> new BlockTile.BlockTileModel<>(MSBlockTypes.ADSORPTION_TYPE_SEAWATER_METAL_EXTRACTOR, properties -> properties.mapColor(BlockResourceInfo.STEEL.getMapColor())),ItemBlockMachine::new);
    //public static final BlockRegistryObject<BlockTile.BlockTileModel<TileEntityOrganicLiquidExtractor, MSMachine<TileEntityOrganicLiquidExtractor>>, ItemBlockMachine> ORGANIC_LIQUID_EXTRACTOR = BLOCKS.register("organic_liquid_extractor", () -> new BlockTile.BlockTileModel<>(MSBlockTypes.ORGANIC_LIQUID_EXTRACTOR, properties -> properties.mapColor(BlockResourceInfo.STEEL.getMapColor())), ItemBlockMachine::new);
    //public static final BlockRegistryObject<BlockTile.BlockTileModel<TileEntitySeawaterPump, MSMachine<TileEntitySeawaterPump>>, ItemBlockMachine> SEAWATER_PUMP = BLOCKS.register("seawater_pump", () -> new BlockTile.BlockTileModel<>(MSBlockTypes.SEAWATER_PUMP, properties -> properties.mapColor(BlockResourceInfo.STEEL.getMapColor())), ItemBlockMachine::new);

    private MSBlocks(){
    }
}
