package net.haltocarrick.vanillamaterialresources.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.haltocarrick.vanillamaterialresources.VanillaMaterialResources;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup ECHO = FabricItemGroupBuilder.build(new Identifier(VanillaMaterialResources.MOD_ID, "echo"),
            () -> new ItemStack(ModItems.ECHO_INGOT));
}
