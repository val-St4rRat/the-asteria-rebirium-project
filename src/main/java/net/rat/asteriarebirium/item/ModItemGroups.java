package net.rat.asteriarebirium.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.rat.asteriarebirium.TheAsteriaRebiriumProject;

public class ModItemGroups {
    public static final ItemGroup ASTERIA_REBIRIUM = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheAsteriaRebiriumProject.MOD_ID, "asteria_rebirium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.asteria_rebirium"))
                    .icon(() -> new ItemStack(ModItems.PHOENIX_SMITHING_TEMPLATE)).entries((displayContext, entries) -> {

                        entries.add(ModItems.REBIRIUM_INGOT);
                        entries.add(ModItems.PHOENIX_SMITHING_TEMPLATE);
                        entries.add(ModItems.STAR_KEY);
                        entries.add(ModItems.REBIRIUM_AXE);
                        entries.add(ModItems.REBIRIUM_HOE);
                        entries.add(ModItems.REBIRIUM_PICKAXE);
                        entries.add(ModItems.REBIRIUM_SWORD);
                        entries.add(ModItems.REBIRIUM_SHOVEL);

                        entries.add(ModItems.REBIRIUM_BOOTS);
                        entries.add(ModItems.REBIRIUM_PANTS);
                        entries.add(ModItems.REBIRIUM_CHESTPLATE);
                        entries.add(ModItems.REBIRIUM_HELMET);

                        entries.add(ModItems.THEIASTEEL);
                        entries.add(ModItems.THEIASTEEL_CHESTPLATE);
                        entries.add(ModItems.THEIASTEEL_SKULLCAP);
                        entries.add(ModItems.THEIASTEEL_BOOTS);
                        entries.add(ModItems.THEIASTEEL_LEGGINGS);
                    }).build());


    public static void registerItemGroups() {
        TheAsteriaRebiriumProject.LOGGER.info("Registering Item Groups for" + TheAsteriaRebiriumProject.MOD_ID);


    }
}
