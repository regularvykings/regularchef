package net.turtlethefish.regularchef.items;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.turtlethefish.regularchef.RegularChef;

public class ModItems {

    public static final Item CARAMEL = registerItem("caramel",
            new Item(new Item.Settings()),
            ModItemGroup.REGULAR_CHEF
    );

    private static Item registerItem(String name, Item item, ItemGroup group) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return Registry.register(Registries.ITEM, new Identifier(RegularChef.MOD_ID, name), item);
    }
    public static void registerModItems() {
        RegularChef.LOGGER.debug("Registering Mod Items for " + RegularChef.MOD_ID + "...");
    }
}
