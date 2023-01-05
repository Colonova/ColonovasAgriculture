package net.colonova.colonovasagriculture.helper;

import net.minecraft.resources.ResourceLocation;

public class ConstantsHelper
{
    public static final String MOD_ID ="colonovasagriculture";

    public static ResourceLocation location(String path)
    {
        return new ResourceLocation(MOD_ID, path);
    }
}
