package net.haltocarrick.vanillamaterialresources.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.haltocarrick.vanillamaterialresources.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public  static final Block ECHO_BLOCK = registerBlock("echo_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(6f).requiresTool()), ModItemGroup.ECHO);
    public  static final Block ECHO_ORE = registerBlock("echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()),ModItemGroup.ECHO);
    public  static final Block DEEPSLATE_ECHO_ORE = registerBlock("deepslate_echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()),ModItemGroup.ECHO);
    public  static final Block NETHERRACK_ECHO_ORE = registerBlock("netherrack_echo_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.5f).requiresTool()),ModItemGroup.ECHO);


    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
    return Registry.register(Registry.BLOCK, new Identifier(VanillaMaterialResources.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(VanillaMaterialResources.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks(){
        VanillaMaterialResources.LOGGER.info("Registering Mod Blocks for" + VanillaMaterialResources.MOD_ID);
    }
}
