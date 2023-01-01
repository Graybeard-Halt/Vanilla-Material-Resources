package net.haltocarrick.vanillamaterialresources.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item ECHO_INGOT = registerItem("echo_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.ECHO)));
    public static final Item ECHO_SHARD = registerItem("echo_shard",
            new Item(new FabricItemSettings().group(ModItemGroup.ECHO)));
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VanillaMaterialResources.MOD_ID, name), item);
    }

    public static void registerModItems(){
        VanillaMaterialResources.LOGGER.info("Registering Mod Items for" + VanillaMaterialResources.MOD_ID);
    }
}
