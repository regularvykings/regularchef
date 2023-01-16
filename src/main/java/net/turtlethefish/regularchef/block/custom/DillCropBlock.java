package net.turtlethefish.regularchef.block.custom;

import net.minecraft.block.CropBlock;
import net.minecraft.item.ItemConvertible;
import net.turtlethefish.regularchef.item.ModItems;

public class DillCropBlock extends CropBlock {

    public DillCropBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected ItemConvertible getSeedsItem() {
        return ModItems.DILL_SEEDS;
    }
}
