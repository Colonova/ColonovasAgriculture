package net.colonova.colonovasagriculture.block.tree;

import net.colonova.colonovascore.api.block.BlockBase;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class Planks extends BlockBase
{
    public Planks()
    {
        super(Material.WOOD, 2.0F, 5.0F, SoundType.WOOD);
    }
}
