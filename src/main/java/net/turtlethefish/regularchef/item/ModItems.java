package net.turtlethefish.regularchef.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.turtlethefish.regularchef.RegularChef;
import net.turtlethefish.regularchef.block.ModBlocks;

public class ModItems {

    public static final Item SALT_CRYSTAL = registerItem("salt_crystal",
            new Item(new Item.Settings()),
            ModItemGroup.REGULAR_CHEF
    );
    public static final Item SALT_POWDER = registerItem("salt_powder",
            new Item(new Item.Settings()),
            ModItemGroup.REGULAR_CHEF
    );



    public static final Item CARAMEL = registerItem("caramel",
            new Item(new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(1.5f).build())),
            ModItemGroup.REGULAR_CHEF
    );
    public static final Item CARAMEL_SAUCE = registerItem("caramel_sauce",
            new Item(new Item.Settings()),
            ModItemGroup.REGULAR_CHEF
    );
    public static final Item BAKED_APPLE = registerItem("baked_apple",
            new Item(new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(2f).build())),
            ModItemGroup.REGULAR_CHEF
    );
    //caramel coated apple
    //apple pie

    public static final Item DILL = registerItem("dill",
            new Item(new Item.Settings()),
            ModItemGroup.REGULAR_CHEF
    );
    public static final Item FRIED_EGG = registerItem("fried_egg",
            new Item(new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(4).saturationModifier(3f).build())),
            ModItemGroup.REGULAR_CHEF
    );
    //spiced fried egg
    //omlette
    //bacon

    public static final Item POTATO_SLICE = registerItem("potato_slice",
            new Item(new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(0.2f).build())),
            ModItemGroup.REGULAR_CHEF
    );
    public static final Item BAKED_POTATO_SLICE = registerItem("baked_potato_slice",
            new Item(new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(1).saturationModifier(12f).build())),
            ModItemGroup.REGULAR_CHEF
    );
    public static final Item PRINGLE = registerItem("pringle",
            new Item(new Item.Settings()
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(9f).build())),
            ModItemGroup.REGULAR_CHEF
    );

    //tomato
    //eggplant
    //cucumber
    //pickle
    //pumpkin slice
    //baked pumpkin slice
    //baked carrot
    //baked beetroot
    //veggie salad
    //baked veggie salad
    //pizza

    //corn
    //corn syrup
    //marshmallow on a stick
    //cooked marshmallow on a stick
    //burnt marshmallow on a stick

    public static final Item DILL_SEEDS = registerItem("dill_seeds",
            new AliasedBlockItem(ModBlocks.DILL_CROP, new Item.Settings()),
            ModItemGroup.REGULAR_CHEF
    );
    //corn seeds
    //tomato seeds
    //eggplant seeds
    //cucumber seeds

    private static Item registerItem(String name, Item item, ItemGroup tab) {
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(RegularChef.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RegularChef.LOGGER.debug("Registering ModItems for " + RegularChef.MOD_ID + "...");
    }
}
