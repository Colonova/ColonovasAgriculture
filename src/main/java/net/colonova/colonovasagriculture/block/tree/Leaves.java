package net.colonova.colonovasagriculture.block.tree;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LeavesBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class Leaves extends LeavesBlock
{
    public Leaves()
    {
        super(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES));
    }
}
