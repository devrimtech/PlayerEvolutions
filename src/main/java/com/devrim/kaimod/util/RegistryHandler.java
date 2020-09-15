package com.devrim.kaimod.util;

import com.devrim.kaimod.blocks.BlockItemBase;
import com.devrim.kaimod.blocks.MyBlock;
import com.devrim.kaimod.items.ItemBase;
import com.devrim.kaimod.kaimod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, kaimod.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, kaimod.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    public static final RegistryObject<Item> ITEM = ITEMS.register("item", ItemBase::new);
    public static final RegistryObject<Block> MY_BLOCK = BLOCKS.register("my_block", MyBlock::new);
    public static final RegistryObject<Item> BLOCK_ITEM = ITEMS.register("my_block", () -> new BlockItemBase(MY_BLOCK.get()));
}
