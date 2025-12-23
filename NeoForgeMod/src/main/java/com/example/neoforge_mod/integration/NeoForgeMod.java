package com.example.neoforge_mod;

import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.event.lifecycle.InterModEnqueueEvent;
import net.neoforged.fml.event.lifecycle.InterModProcessEvent;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;

import net.neoforged.neoforge.event.CreativeModeTabEvent;
import net.neoforged.neoforge.common.CreativeModeTabRegistry;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(NeoForgeMod.MODID)
public class NeoForgeMod {
    public static final String MODID = "neoforge_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    public static Item EXAMPLE_ITEM;

    public NeoForgeMod() {
        // Register creative tab
        CreativeModeTabRegistry.register(
            new ResourceLocation(MODID, "custom_tab"),
            builder -> builder.displayName("Example Tab").icon(() -> new ItemStack(EXAMPLE_ITEM))
        );

        // Register item
        EXAMPLE_ITEM = Registry.register(
            BuiltInRegistries.ITEM,
            new ResourceLocation(MODID, "example_item"),
            new Item(new Properties())
        );

        // Mod setup hooks...
    }
}