package net.colonova.colonovasagriculture;

import net.colonova.colonovasagriculture.helper.ConstantsHelper;
import net.colonova.colonovasagriculture.helper.registry.BlockRegistry;
import net.colonova.colonovascore.api.helper.BlockRegistryHelper;
import net.colonova.colonovascore.api.helper.ItemRegistryHelper;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

@Mod(ConstantsHelper.MOD_ID)
public class ColonovasAgriculture
{
    public static final Logger LOGGER = LogManager.getLogger();

    public ColonovasAgriculture()
    {
        BlockRegistry.registerBlocks(FMLJavaModLoadingContext.get().getModEventBus());

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::addCreative);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.Register event)
    {
        event.registerCreativeModeTab(ConstantsHelper.location("blocks"), builder ->
                builder.title(Component.translatable("itemGroup." + ConstantsHelper.MOD_ID + ".blocks"))
                .icon(() -> new ItemStack(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "cherry")))
                .displayItems(( enabledFlags, populator, hasPermissions) -> {

                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "apple"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "apple_leaves"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "apple_log"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "apple_planks"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "apple_sapling"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "stripped_apple_log"));


                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "banana"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "banana_leaves"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "banana_log"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "banana_planks"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "banana_sapling"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "stripped_banana_log"));
                    
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "cherry"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "cherry_leaves"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "cherry_log"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "cherry_planks"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "cherry_sapling"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "stripped_cherry_log"));

                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "coconut"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "coconut_leaves"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "coconut_log"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "coconut_sapling"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "stripped_coconut_log"));

                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "fig"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "fig_leaves"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "fig_log"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "fig_sapling"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "stripped_fig_log"));

                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "lemon"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "lemon_leaves"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "lemon_log"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "lemon_sapling"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "stripped_lemon_log"));

                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "orange"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "orange_leaves"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "orange_log"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "orange_sapling"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "stripped_orange_log"));

                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "pear"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "pear_leaves"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "pear_log"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "pear_sapling"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "stripped_pear_log"));

                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "peach"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "peach_leaves"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "peach_log"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "peach_sapling"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "stripped_peach_log"));

                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "pecan"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "pecan_leaves"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "pecan_log"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "pecan_sapling"));
                    populator.accept(BlockRegistry.BLOCKS.get(ConstantsHelper.MOD_ID, "stripped_pecan_log"));
                })
        );
    }

    @Mod.EventBusSubscriber(modid = ConstantsHelper.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientEvents
    {
        @SubscribeEvent
        public static void onClientSetup(final FMLClientSetupEvent event)
        {
            
        }
    }
}
