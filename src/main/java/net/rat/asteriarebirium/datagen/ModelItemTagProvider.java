package net.rat.asteriarebirium.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.rat.asteriarebirium.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModelItemTagProvider  extends FabricTagProvider.ItemTagProvider{

    public ModelItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.THEIASTEEL_BOOTS, ModItems.THEIASTEEL_CHESTPLATE, ModItems.THEIASTEEL_LEGGINGS, ModItems.THEIASTEEL_SKULLCAP,
                        ModItems.REBIRIUM_CHESTPLATE, ModItems.REBIRIUM_HELMET, ModItems.REBIRIUM_PANTS, ModItems.REBIRIUM_BOOTS);

    }
}