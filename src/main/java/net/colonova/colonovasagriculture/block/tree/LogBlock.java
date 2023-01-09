package net.colonova.colonovasagriculture.block.tree;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class LogBlock extends RotatedPillarBlock
{
    public LogBlock()
    {
        super(BlockBehaviour.Properties.copy(Blocks.OAK_LOG));
    }
}
