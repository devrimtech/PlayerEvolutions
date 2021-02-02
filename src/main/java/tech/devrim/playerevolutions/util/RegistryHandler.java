package tech.devrim.playerevolutions.util;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import tech.devrim.playerevolutions.PlayerEvolutions;
import tech.devrim.playerevolutions.blocks.BlockItemBase;
import tech.devrim.playerevolutions.blocks.RickBlock;
import tech.devrim.playerevolutions.items.ItemBase;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PlayerEvolutions.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, PlayerEvolutions.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> RICK = ITEMS.register("rick", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> RICK_BLOCK = BLOCKS.register("rick_block", RickBlock::new);

    //Block Items
    public static final RegistryObject<Item> RICK_BLOCK_ITEM = ITEMS.register("rick_block", () -> new BlockItemBase(RICK_BLOCK.get()));
}
