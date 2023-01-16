package net.turtlethefish.regularchef.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.turtlethefish.regularchef.RegularChef;
import net.turtlethefish.regularchef.block.custom.DillCropBlock;
import net.turtlethefish.regularchef.item.ModItemGroup;

public class ModBlocks {

    public static final Block SALT_DEPOSIT = registerBlock("salt_deposit",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroup.REGULAR_CHEF);

    public static final Block DEEPSLATE_SALT_DEPOSIT = registerBlock("deepslate_salt_deposit",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()), ModItemGroup.REGULAR_CHEF);

    public static final Block DILL_CROP = registerBlockWithoutItem("dill_crop_block",
            new DillCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(RegularChef.MOD_ID, name), block);
    }
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(RegularChef.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        Item item = Registry.register(Registries.ITEM, new Identifier(RegularChef.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        RegularChef.LOGGER.debug("Registering ModBlocks for " + RegularChef.MOD_ID + "...");
    }

}
