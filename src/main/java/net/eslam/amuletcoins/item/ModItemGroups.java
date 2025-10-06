package net.eslam.amuletcoins.item;

import net.eslam.amuletcoins.AmuletCoins;
import net.eslam.amuletcoins.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.util.function.Supplier;

public class ModItemGroups {
    public static final ItemGroup MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(AmuletCoins.MOD_ID, "mod_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SHINY_ORE))
                    .displayName(Text.translatable("itemgroup.amuletcoins.mod_items"))
                    .entries((displayContext, entries) -> {
                      entries.add(ModItems.RAW_SHINY_ORE);
                      entries.add(ModItems.SHINY_ORE);
                      entries.add(ModBlocks.RAW_SHINY_ORE_BLOCK);
                      entries.add(ModBlocks.SHINY_ORE_BLOCK);
                      entries.add(ModBlocks.SHINY_ROCK);
                      entries.add(ModItems.RED_GEM);
                      entries.add(ModItems.BLUE_GEM);
                      entries.add(ModItems.YELLOW_GEM);
                      entries.add(ModItems.GREEN_GEM);
                      entries.add(ModItems.RUBY);
                      entries.add(ModBlocks.RED_GEM_ORE);
                      entries.add(ModBlocks.BLUE_GEM_ORE);
                      entries.add(ModBlocks.YELLOW_GEM_ORE);
                      entries.add(ModBlocks.GREEN_GEM_ORE);
                      entries.add(ModBlocks.RUBY_ORE);
                      entries.add(ModItems.RED_SWORD);
                      entries.add(ModItems.RED_PICKAXE);
                      entries.add(ModItems.RED_AXE);
                      entries.add(ModItems.RED_HOE);
                      entries.add(ModItems.BLUE_SWORD);
                      entries.add(ModItems.BLUE_PICKAXE);
                      entries.add(ModItems.BLUE_AXE);
                      entries.add(ModItems.BLUE_HOE);
                      entries.add(ModItems.YELLOW_SWORD);
                      entries.add(ModItems.YELLOW_PICKAXE);
                      entries.add(ModItems.YELLOW_AXE);
                      entries.add(ModItems.YELLOW_HOE);
                      entries.add(ModItems.GREEN_SWORD);
                      entries.add(ModItems.GREEN_PICKAXE);
                      entries.add(ModItems.GREEN_AXE);
                      entries.add(ModItems.GREEN_HOE);
                      entries.add(ModItems.RUBY_SWORD);
                      entries.add(ModItems.RUBY_PICKAXE);
                      entries.add(ModItems.RUBY_AXE);
                      entries.add(ModItems.RUBY_HOE);
                      entries.add(ModItems.RED_COIN);
                      entries.add(ModItems.BLUE_COIN);
                      entries.add(ModItems.YELLOW_COIN);
                      entries.add(ModItems.GREEN_COIN);
                      entries.add(ModItems.RUBY_COIN);


                    }).build());



    public static void registerItemGroups() {
        AmuletCoins.LOGGER.info("Registering Iten Groups for " + AmuletCoins.MOD_ID);
    }
}
