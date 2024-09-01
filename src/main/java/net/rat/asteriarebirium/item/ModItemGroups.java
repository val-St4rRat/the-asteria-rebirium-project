package net.rat.asteriarebirium.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rat.asteriarebirium.TheAsteriaRebiriumProject;

public class ModItemGroups {
    public static final ItemGroup REBIRIUM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheAsteriaRebiriumProject.MOD_ID, "rebirium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.rebirium"))
                    .icon(() -> new ItemStack(ModItems.REBIRIUM_INGOT)).entries((displayContext, entries) -> {

                        entries.add(ModItems.REBIRIUM_INGOT);
                        entries.add(ModItems.PHOENIX_SMITHING_TEMPLATE);
                    }).build());


    public static void registerItemGroups() {
        TheAsteriaRebiriumProject.LOGGER.info("Registering Item Groups for" + TheAsteriaRebiriumProject.MOD_ID);


    }
}
