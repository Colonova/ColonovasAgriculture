package net.colonova.colonovasagriculture.helper.registry;

import net.colonova.colonovasagriculture.block.fruit.Fruit;
import net.colonova.colonovasagriculture.block.tree.*;
import net.colonova.colonovasagriculture.helper.ConstantsHelper;
import net.colonova.colonovascore.api.helper.BlockRegistryHelper;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockRegistry
{
    public static final BlockRegistryHelper<Block> BLOCKS = BlockRegistryHelper.create(ForgeRegistries.BLOCKS, ConstantsHelper.MOD_ID);
    private static final BlockRegistryHelper<Item> ITEMS = BlockRegistryHelper.create(ForgeRegistries.ITEMS, ConstantsHelper.MOD_ID);

    public static void registerBlocks(IEventBus eventBus)
    {
        BLOCKS.register("apple", Fruit::new);
        BLOCKS.register("apple_leaves", Leaves::new);
        BLOCKS.register("apple_log", LogBlock::new);
        BLOCKS.register("apple_planks", Planks::new);
        BLOCKS.register("apple_sapling", Sapling::new);
        BLOCKS.register("stripped_apple_log", StrippedLog::new);

        BLOCKS.register("banana", Fruit::new);
        BLOCKS.register("banana_leaves", Leaves::new);
        BLOCKS.register("banana_log", LogBlock::new);
        BLOCKS.register("banana_planks", Planks::new);
        BLOCKS.register("banana_sapling", Sapling::new);
        BLOCKS.register("stripped_banana_log", StrippedLog::new);

        BLOCKS.register("cherry", Fruit::new);
        BLOCKS.register("cherry_leaves", Leaves::new);
        BLOCKS.register("cherry_log", LogBlock::new);
        BLOCKS.register("cherry_planks", Planks::new);
        BLOCKS.register("cherry_sapling", Sapling::new);
        BLOCKS.register("stripped_cherry_log", StrippedLog::new);

        BLOCKS.register("coconut", Fruit::new);
        BLOCKS.register("coconut_leaves", Leaves::new);
        BLOCKS.register("coconut_log", LogBlock::new);
        BLOCKS.register("coconut_planks", Planks::new);
        BLOCKS.register("coconut_sapling", Sapling::new);
        BLOCKS.register("stripped_coconut_log", StrippedLog::new);

        BLOCKS.register("fig", Fruit::new);
        BLOCKS.register("fig_leaves", Leaves::new);
        BLOCKS.register("fig_log", LogBlock::new);
        BLOCKS.register("fig_planks", Planks::new);
        BLOCKS.register("fig_sapling", Sapling::new);
        BLOCKS.register("stripped_fig_log", StrippedLog::new);

        BLOCKS.register("lemon", Fruit::new);
        BLOCKS.register("lemon_leaves", Leaves::new);
        BLOCKS.register("lemon_log", LogBlock::new);
        BLOCKS.register("lemon_planks", Planks::new);
        BLOCKS.register("lemon_sapling", Sapling::new);
        BLOCKS.register("stripped_lemon_log", StrippedLog::new);

        BLOCKS.register("orange", Fruit::new);
        BLOCKS.register("orange_leaves", Leaves::new);
        BLOCKS.register("orange_log", LogBlock::new);
        BLOCKS.register("orange_planks", Planks::new);
        BLOCKS.register("orange_sapling", Sapling::new);
        BLOCKS.register("stripped_orange_log", StrippedLog::new);

        BLOCKS.register("pear", Fruit::new);
        BLOCKS.register("pear_leaves", Leaves::new);
        BLOCKS.register("pear_log", LogBlock::new);
        BLOCKS.register("pear_planks", Planks::new);
        BLOCKS.register("pear_sapling", Sapling::new);
        BLOCKS.register("stripped_pear_log", StrippedLog::new);

        BLOCKS.register("peach", Fruit::new);
        BLOCKS.register("peach_leaves", Leaves::new);
        BLOCKS.register("peach_log", LogBlock::new);
        BLOCKS.register("peach_planks", Planks::new);
        BLOCKS.register("peach_sapling", Sapling::new);
        BLOCKS.register("stripped_peach_log", StrippedLog::new);

        BLOCKS.register("pecan", Fruit::new);
        BLOCKS.register("pecan_leaves", Leaves::new);
        BLOCKS.register("pecan_log", LogBlock::new);
        BLOCKS.register("pecan_planks", Planks::new);
        BLOCKS.register("pecan_sapling", Sapling::new);
        BLOCKS.register("stripped_pecan_log", StrippedLog::new);

        ITEMS.register("apple", () -> new BlockItem(BLOCKS.get("apple"), new Item.Properties().stacksTo(64)));
        ITEMS.register("apple_leaves", () -> new BlockItem(BLOCKS.get("apple_leaves"), new Item.Properties().stacksTo(64)));
        ITEMS.register("apple_log", () -> new BlockItem(BLOCKS.get("apple_log"), new Item.Properties().stacksTo(64)));
        ITEMS.register("apple_planks", () -> new BlockItem(BLOCKS.get("apple_planks"), new Item.Properties().stacksTo(64)));
        ITEMS.register("apple_sapling", () -> new BlockItem(BLOCKS.get("apple_sapling"), new Item.Properties().stacksTo(64)));
        ITEMS.register("stripped_apple_log", () -> new BlockItem(BLOCKS.get("stripped_apple_log"), new Item.Properties().stacksTo(64)));

        ITEMS.register("banana", () -> new BlockItem(BLOCKS.get("banana"), new Item.Properties().stacksTo(64)));
        ITEMS.register("banana_leaves", () -> new BlockItem(BLOCKS.get("banana_leaves"), new Item.Properties().stacksTo(64)));
        ITEMS.register("banana_log", () -> new BlockItem(BLOCKS.get("banana_log"), new Item.Properties().stacksTo(64)));
        ITEMS.register("banana_planks", () -> new BlockItem(BLOCKS.get("banana_planks"), new Item.Properties().stacksTo(64)));
        ITEMS.register("banana_sapling", () -> new BlockItem(BLOCKS.get("banana_sapling"), new Item.Properties().stacksTo(64)));
        ITEMS.register("stripped_banana_log", () -> new BlockItem(BLOCKS.get("stripped_banana_log"), new Item.Properties().stacksTo(64)));
        
        ITEMS.register("cherry", () -> new BlockItem(BLOCKS.get("cherry"), new Item.Properties().stacksTo(64)));
        ITEMS.register("cherry_leaves", () -> new BlockItem(BLOCKS.get("cherry_leaves"), new Item.Properties().stacksTo(64)));
        ITEMS.register("cherry_log", () -> new BlockItem(BLOCKS.get("cherry_log"), new Item.Properties().stacksTo(64)));
        ITEMS.register("cherry_planks", () -> new BlockItem(BLOCKS.get("cherry_planks"), new Item.Properties().stacksTo(64)));
        ITEMS.register("cherry_sapling", () -> new BlockItem(BLOCKS.get("cherry_sapling"), new Item.Properties().stacksTo(64)));
        ITEMS.register("stripped_cherry_log", () -> new BlockItem(BLOCKS.get("stripped_cherry_log"), new Item.Properties().stacksTo(64)));

        ITEMS.register("coconut", () -> new BlockItem(BLOCKS.get("coconut"), new Item.Properties().stacksTo(64)));
        ITEMS.register("coconut_leaves", () -> new BlockItem(BLOCKS.get("coconut_leaves"), new Item.Properties().stacksTo(64)));
        ITEMS.register("coconut_log", () -> new BlockItem(BLOCKS.get("coconut_log"), new Item.Properties().stacksTo(64)));
        ITEMS.register("coconut_planks", () -> new BlockItem(BLOCKS.get("coconut_planks"), new Item.Properties().stacksTo(64)));
        ITEMS.register("coconut_sapling", () -> new BlockItem(BLOCKS.get("coconut_sapling"), new Item.Properties().stacksTo(64)));
        ITEMS.register("stripped_coconut_log", () -> new BlockItem(BLOCKS.get("stripped_coconut_log"), new Item.Properties().stacksTo(64)));

        ITEMS.register("fig", () -> new BlockItem(BLOCKS.get("fig"), new Item.Properties().stacksTo(64)));
        ITEMS.register("fig_leaves", () -> new BlockItem(BLOCKS.get("fig_leaves"), new Item.Properties().stacksTo(64)));
        ITEMS.register("fig_log", () -> new BlockItem(BLOCKS.get("fig_log"), new Item.Properties().stacksTo(64)));
        ITEMS.register("fig_planks", () -> new BlockItem(BLOCKS.get("fig_planks"), new Item.Properties().stacksTo(64)));
        ITEMS.register("fig_sapling", () -> new BlockItem(BLOCKS.get("fig_sapling"), new Item.Properties().stacksTo(64)));
        ITEMS.register("stripped_fig_log", () -> new BlockItem(BLOCKS.get("stripped_fig_log"), new Item.Properties().stacksTo(64)));

        ITEMS.register("lemon", () -> new BlockItem(BLOCKS.get("lemon"), new Item.Properties().stacksTo(64)));
        ITEMS.register("lemon_leaves", () -> new BlockItem(BLOCKS.get("lemon_leaves"), new Item.Properties().stacksTo(64)));
        ITEMS.register("lemon_log", () -> new BlockItem(BLOCKS.get("lemon_log"), new Item.Properties().stacksTo(64)));
        ITEMS.register("lemon_planks", () -> new BlockItem(BLOCKS.get("lemon_planks"), new Item.Properties().stacksTo(64)));
        ITEMS.register("lemon_sapling", () -> new BlockItem(BLOCKS.get("lemon_sapling"), new Item.Properties().stacksTo(64)));
        ITEMS.register("stripped_lemon_log", () -> new BlockItem(BLOCKS.get("stripped_lemon_log"), new Item.Properties().stacksTo(64)));

        ITEMS.register("orange", () -> new BlockItem(BLOCKS.get("orange"), new Item.Properties().stacksTo(64)));
        ITEMS.register("orange_leaves", () -> new BlockItem(BLOCKS.get("orange_leaves"), new Item.Properties().stacksTo(64)));
        ITEMS.register("orange_log", () -> new BlockItem(BLOCKS.get("orange_log"), new Item.Properties().stacksTo(64)));
        ITEMS.register("orange_planks", () -> new BlockItem(BLOCKS.get("orange_planks"), new Item.Properties().stacksTo(64)));
        ITEMS.register("orange_sapling", () -> new BlockItem(BLOCKS.get("orange_sapling"), new Item.Properties().stacksTo(64)));
        ITEMS.register("stripped_orange_log", () -> new BlockItem(BLOCKS.get("stripped_orange_log"), new Item.Properties().stacksTo(64)));

        ITEMS.register("pear", () -> new BlockItem(BLOCKS.get("pear"), new Item.Properties().stacksTo(64)));
        ITEMS.register("pear_leaves", () -> new BlockItem(BLOCKS.get("pear_leaves"), new Item.Properties().stacksTo(64)));
        ITEMS.register("pear_log", () -> new BlockItem(BLOCKS.get("pear_log"), new Item.Properties().stacksTo(64)));
        ITEMS.register("pear_planks", () -> new BlockItem(BLOCKS.get("pear_planks"), new Item.Properties().stacksTo(64)));
        ITEMS.register("pear_sapling", () -> new BlockItem(BLOCKS.get("pear_sapling"), new Item.Properties().stacksTo(64)));
        ITEMS.register("stripped_pear_log", () -> new BlockItem(BLOCKS.get("stripped_pear_log"), new Item.Properties().stacksTo(64)));

        ITEMS.register("peach", () -> new BlockItem(BLOCKS.get("peach"), new Item.Properties().stacksTo(64)));
        ITEMS.register("peach_leaves", () -> new BlockItem(BLOCKS.get("peach_leaves"), new Item.Properties().stacksTo(64)));
        ITEMS.register("peach_log", () -> new BlockItem(BLOCKS.get("peach_log"), new Item.Properties().stacksTo(64)));
        ITEMS.register("peach_planks", () -> new BlockItem(BLOCKS.get("peach_planks"), new Item.Properties().stacksTo(64)));
        ITEMS.register("peach_sapling", () -> new BlockItem(BLOCKS.get("peach_sapling"), new Item.Properties().stacksTo(64)));
        ITEMS.register("stripped_peach_log", () -> new BlockItem(BLOCKS.get("stripped_peach_log"), new Item.Properties().stacksTo(64)));

        ITEMS.register("pecan", () -> new BlockItem(BLOCKS.get("pecan"), new Item.Properties().stacksTo(64)));
        ITEMS.register("pecan_leaves", () -> new BlockItem(BLOCKS.get("pecan_leaves"), new Item.Properties().stacksTo(64)));
        ITEMS.register("pecan_log", () -> new BlockItem(BLOCKS.get("pecan_log"), new Item.Properties().stacksTo(64)));
        ITEMS.register("pecan_planks", () -> new BlockItem(BLOCKS.get("pecan_planks"), new Item.Properties().stacksTo(64)));
        ITEMS.register("pecan_sapling", () -> new BlockItem(BLOCKS.get("pecan_sapling"), new Item.Properties().stacksTo(64)));
        ITEMS.register("stripped_pecan_log", () -> new BlockItem(BLOCKS.get("stripped_pecan_log"), new Item.Properties().stacksTo(64)));
        
        BLOCKS.registerBlocks(eventBus);
        ITEMS.registerBlocks(eventBus);
    }
}
