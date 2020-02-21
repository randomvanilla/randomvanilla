package io.github.randomvanilla.init;

import co.origamigames.sheet.SheetLib;
import io.github.randomvanilla.RandomVanilla;
import net.fabricmc.fabric.api.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.WallBlock;

public class RVBlocks {
    public static final Block FISH_BARREL = copiedBlock("fish_barrel", Blocks.SPRUCE_PLANKS);

    public static final Block STONE_WALL = block("stone_wall", new WallBlock(FabricBlockSettings.copy(Blocks.STONE).build()));

    private static Block block(String id, Block block) {
        return SheetLib.block(RandomVanilla.MOD_ID, id, block, RandomVanilla.ITEM_GROUP);
    }
    private static Block copiedBlock(String id, Block copied_block) {
        return SheetLib.copiedBlock(RandomVanilla.MOD_ID, id, copied_block, RandomVanilla.ITEM_GROUP);
    }
}
