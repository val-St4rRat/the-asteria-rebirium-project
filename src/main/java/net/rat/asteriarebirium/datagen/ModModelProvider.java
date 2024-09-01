package net.rat.asteriarebirium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.rat.asteriarebirium.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
    itemModelGenerator.register(ModItems.REBIRIUM_AXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.REBIRIUM_PICKAXE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.REBIRIUM_SWORD, Models.HANDHELD);
    itemModelGenerator.register(ModItems.REBIRIUM_HOE, Models.HANDHELD);
    itemModelGenerator.register(ModItems.REBIRIUM_SHOVEL, Models.HANDHELD);
    }
}