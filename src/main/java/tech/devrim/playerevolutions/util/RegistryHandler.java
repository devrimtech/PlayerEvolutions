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
import tech.devrim.playerevolutions.blocks.UltronBlock;
import tech.devrim.playerevolutions.items.ItemBase;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, PlayerEvolutions.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, PlayerEvolutions.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items
    public static final RegistryObject<Item> ULTRON = ITEMS.register("ultron", ItemBase::new);

    // Blocks
    public static final RegistryObject<Block> ULTRON_BLOCK = BLOCKS.register("ultron_block", UltronBlock::new);

    //Block Items
    public static final RegistryObject<Item> ULTRON_BLOCK_ITEM = ITEMS.register("ultron_block", () -> new BlockItemBase(ULTRON_BLOCK.get()));
}
