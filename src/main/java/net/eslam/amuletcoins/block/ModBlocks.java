package net.eslam.amuletcoins.block;

import net.eslam.amuletcoins.AmuletCoins;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block SHINY_ORE_BLOCK = registerBlock("shiny_ore_block.json",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block RAW_SHINY_ORE_BLOCK = registerBlock("raw_shiny_ore_block",
            new Block(AbstractBlock.Settings.create().strength(4f)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block SHINY_ROCK = registerBlock("shiny_rock",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(BlockSoundGroup.NETHER_GOLD_ORE)));

    public static final Block RED_GEM_ORE = registerBlock("red_gem_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block BLUE_GEM_ORE = registerBlock("blue_gem_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block YELLOW_GEM_ORE = registerBlock("yellow_gem_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block GREEN_GEM_ORE = registerBlock("green_gem_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool()));




    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(AmuletCoins.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(AmuletCoins.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        AmuletCoins.LOGGER.info("Registering Mod Blocks for " + AmuletCoins.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.SHINY_ORE_BLOCK);
            fabricItemGroupEntries.add(ModBlocks.RAW_SHINY_ORE_BLOCK);
        });
    }
}
