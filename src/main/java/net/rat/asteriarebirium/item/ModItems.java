package net.rat.asteriarebirium.item;

import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.rat.asteriarebirium.TheAsteriaRebiriumProject;

public class ModItems {

    public static  final Item REBIRIUM_INGOT = registerItem("rebirium_ingot", new Item(new FabricItemSettings()));
    public static final Item ASTERIA_TEAR = registerItem("asteria_tear", new Item(new FabricItemSettings()));
    public static final Item STAR_KEY = registerItem("star_key", new Item(new FabricItemSettings()));
    public static final Item PHOENIX_SMITHING_TEMPLATE = registerItem("phoenix_smithing_template", new Item(new FabricItemSettings()));
    public static final Item THEIASTEEL = registerItem("theiasteel", new Item(new FabricItemSettings()));

    public static final Item REBIRIUM_PICKAXE = registerItem("rebirium_pickaxe", new PickaxeItem(ModToolMaterial.REBIRIUM_INGOT, 2, 2f, new FabricItemSettings()));
    public static final Item REBIRIUM_AXE = registerItem("rebirium_axe", new AxeItem(ModToolMaterial.REBIRIUM_INGOT, 7, 6f, new FabricItemSettings()));
    public static final Item REBIRIUM_SWORD = registerItem("rebirium_sword", new SwordItem(ModToolMaterial.REBIRIUM_INGOT, 6, 3f, new FabricItemSettings()));
    public static final Item REBIRIUM_HOE = registerItem("rebirium_hoe", new HoeItem(ModToolMaterial.REBIRIUM_INGOT, 1, 2f, new FabricItemSettings()));
    public static final Item REBIRIUM_SHOVEL = registerItem("rebirium_shovel", new ShovelItem(ModToolMaterial.REBIRIUM_INGOT, 2, 2f, new FabricItemSettings()));

    public static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(REBIRIUM_INGOT);
        entries.add(ASTERIA_TEAR);
        entries.add(STAR_KEY);
        entries.add(PHOENIX_SMITHING_TEMPLATE);
        entries.add(THEIASTEEL);
    }

    public static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TheAsteriaRebiriumProject.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TheAsteriaRebiriumProject.LOGGER.info("Registering Mod Items for" + TheAsteriaRebiriumProject.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
