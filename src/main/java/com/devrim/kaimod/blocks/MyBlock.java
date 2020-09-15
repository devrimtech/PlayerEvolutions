package com.devrim.kaimod.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class MyBlock extends Block {
    public MyBlock() {
        super(Block.Properties.create(Material.IRON)
                .harvestTool(ToolType.PICKAXE)
        );
    }
}
