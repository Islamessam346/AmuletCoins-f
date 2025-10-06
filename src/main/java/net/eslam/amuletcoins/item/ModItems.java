package net.eslam.amuletcoins.item;

import net.eslam.amuletcoins.AmuletCoins;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item SHINY_ORE = registerItem("shiny_ore.json", new Item(new Item.Settings()));
    public static final Item RAW_SHINY_ORE = registerItem("raw_shiny_ore", new Item(new Item.Settings()));
    public static final Item RED_GEM = registerItem("red_gem", new Item(new Item.Settings()));
    public static final Item BLUE_GEM = registerItem("red_gem", new Item(new Item.Settings()));
    public static final Item YELLOW_GEM = registerItem("yellow_gem", new Item(new Item.Settings()));
    public static final Item GREEN_GEM = registerItem("green_gem", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item RED_SWORD = registerItem("red_sword", new Item(new Item.Settings()));
    public static final Item BLUE_SWORD = registerItem("blue_sword", new Item(new Item.Settings()));
    public static final Item YELLOW_SWORD = registerItem("yellow_sword", new Item(new Item.Settings()));
    public static final Item GREEN_SWORD = registerItem("green_sword", new Item(new Item.Settings()));
    public static final Item RUBY_SWORD = registerItem("ruby_sword", new Item(new Item.Settings()));
    public static final Item COPPER_SWORD = registerItem("copper_sword", new Item(new Item.Settings()));
    public static final Item RED_PICKAXE = registerItem("red_pickaxe", new Item(new Item.Settings()));
    public static final Item BLUE_PICKAXE = registerItem("blue_pickaxe", new Item(new Item.Settings()));
    public static final Item YELLOW_PICKAXE = registerItem("yellow-pickaxe", new Item(new Item.Settings()));
    public static final Item GREEN_PICKAXE = registerItem("green_pickaxe", new Item(new Item.Settings()));
    public static final Item RUBY_PICKAXE = registerItem("ruby_pickaxe", new Item(new Item.Settings()));
    public static final Item RED_AXE = registerItem("red_axe", new Item(new Item.Settings()));
    public static final Item BLUE_AXE = registerItem("blue_axe", new Item(new Item.Settings()));
    public static final Item YELLOW_AXE = registerItem("yellow_axe", new Item(new Item.Settings()));
    public static final Item GREEN_AXE = registerItem("green_axe", new Item(new Item.Settings()));
    public static final Item RUBY_AXE = registerItem("ruby_axe", new Item(new Item.Settings()));
    public static final Item RED_HOE = registerItem("red_hoe", new Item(new Item.Settings()));
    public static final Item BLUE_HOE = registerItem("blue_hoe", new Item(new Item.Settings()));
    public static final Item YELLOW_HOE = registerItem("yellow_hoe", new Item(new Item.Settings()));
    public static final Item GREEN_HOE = registerItem("green_hoe", new Item(new Item.Settings()));
    public static final Item RUBY_HOE = registerItem("ruby_hoe", new Item(new Item.Settings()));
    public static final Item SHINY_COIN = registerItem("shiny_coin", new Item(new Item.Settings()));
    public static final Item RED_COIN = registerItem("red-coin", new Item(new Item.Settings()));
    public static final Item BLUE_COIN = registerItem("blue_coin", new Item(new Item.Settings()));
    public static final Item YELLOW_COIN = registerItem("yellow_coin", new Item(new Item.Settings()));
    public static final Item GREEN_COIN = registerItem("green_coin", new Item(new Item.Settings()));
    public static final Item RUBY_COIN = registerItem("ruby_coin", new Item(new Item.Settings()));
    public static final Item RED_BOW = registerItem("red_bow", new Item(new Item.Settings()));
    public static final Item BLUE_BOW = registerItem("blue_bow", new Item(new Item.Settings()));
    public static final Item YELLOW_BOW = registerItem("yellow_bow", new Item(new Item.Settings()));
    public static final Item GREEN_BOW = registerItem("green_bow", new Item(new Item.Settings()));
    public static final Item RUBY_BOW = registerItem("ruby_bow", new Item(new Item.Settings()));
    public static final Item RED_TRIDENT = registerItem("red_trident", new Item(new Item.Settings()));
    public static final Item BLUE_TRIDENT = registerItem("blue_trident", new Item(new Item.Settings()));
    public static final Item YELLOW_TRIDENT = registerItem("yellow _trident", new Item(new Item.Settings()));
    public static final Item GREEN_TRIDENT = registerItem("green_trident", new Item(new Item.Settings()));
    public static final Item RUBY_TRIDENT = registerItem("ruby_trident", new Item(new Item.Settings()));
    public static final Item RED_MACE = registerItem("red_mace", new Item(new Item.Settings()));
    public static final Item BLUE_MACE = registerItem("blue_mace", new Item(new Item.Settings()));
    public static final Item YELLOW_MACE = registerItem("yellow_mace", new Item(new Item.Settings()));
    public static final Item GREEN_MACE = registerItem("green_mace", new Item(new Item.Settings()));
    public static final Item RUBY_MACE = registerItem("ruby_mace", )


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(AmuletCoins.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AmuletCoins.LOGGER.info("Registering Mod Items for " + AmuletCoins.MOD_ID);


        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SHINY_ORE);
            fabricItemGroupEntries.add(RAW_SHINY_ORE);
        });
    }
}