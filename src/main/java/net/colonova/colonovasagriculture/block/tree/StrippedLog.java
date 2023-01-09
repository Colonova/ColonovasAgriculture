package net.colonova.colonovasagriculture.block.tree;

import net.colonova.colonovascore.annotation.ColonovaBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

@ColonovaBlock
public class StrippedLog extends RotatedPillarBlock
{
    public StrippedLog()
    {
        super(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG));
    }
}
