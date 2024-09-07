package net.rat.asteriarebirium.item;

import net.minecraft.client.sound.Sound;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.rat.asteriarebirium.TheAsteriaRebiriumProject;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    REBIRIUM("rebirium", 4, new int[] {4, 9, 6, 4}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3f, 0.3f, () -> Ingredient.ofItems(ModItems.REBIRIUM_INGOT)),
    THEIASTEEL("theiasteel", 4, new int[] {6, 12, 8, 6}, 20, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3f, 0.4f, () -> Ingredient.ofItems(ModItems.THEIASTEEL));

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantibility;
    private final SoundEvent equipSound;
    private final float toughgness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = {11, 16, 15, 13};

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantibility, SoundEvent equipSound, float toughgness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantibility = enchantibility;
        this.equipSound = equipSound;
        this.toughgness = toughgness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public int getDurability(ArmorItem.Type type) {
        return BASE_DURABILITY[type.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getProtection(ArmorItem.Type type) {
        return protectionAmounts[type.ordinal()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantibility;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return TheAsteriaRebiriumProject.MOD_ID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughgness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
