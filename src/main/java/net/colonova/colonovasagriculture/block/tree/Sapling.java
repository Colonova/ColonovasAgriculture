package net.colonova.colonovasagriculture.block.tree;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SaplingBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class Sapling extends SaplingBlock
{

    public Sapling()
    {
        super(null, BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING));
    }
}
