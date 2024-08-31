package net.rat.asteriarebirium.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rat.asteriarebirium.TheAsteriaRebiriumProject;

public class ModItems {

    public static  final Item REBIRIUM_INGOT = registerItem("rebirium_ingot", new Item(new FabricItemSettings()));

    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(REBIRIUM_INGOT);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheAsteriaRebiriumProject.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheAsteriaRebiriumProject.LOGGER.info("Registering Mod Items for" + TheAsteriaRebiriumProject.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
