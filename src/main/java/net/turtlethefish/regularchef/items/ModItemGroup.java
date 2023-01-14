package net.turtlethefish.regularchef.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.turtlethefish.regularchef.RegularChef;

public class ModItemGroup {

    public static final ItemGroup REGULAR_CHEF = FabricItemGroup.builder(
            new Identifier(RegularChef.MOD_ID, "regularchefgroup"))
            .icon(() -> new ItemStack(ModItems.CARAMEL))
            .build();

}
