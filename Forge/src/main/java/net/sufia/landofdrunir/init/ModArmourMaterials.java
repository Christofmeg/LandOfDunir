package net.sufia.landofdrunir.init;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Blocks;
import net.sufia.landofdrunir.DrunirMod;

import java.util.function.Supplier;

public enum ModArmourMaterials implements ArmorMaterial {
    DRUNITE("drunite", 50, new int[]{5, 9, 7, 4}, 12,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 4f, 0.1f, ()-> Ingredient.of(ModItems.DRUNITE.get())),

    PLASMITE("plasmite", 75, new int[]{7, 10, 9, 6}, 20,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 6f, 0.15f, ()-> Ingredient.of(ModItems.PLASMITE.get())),

    GALEON("galeon", 38, new int[]{4, 6, 5, 3}, 10,
            SoundEvents.ARMOR_EQUIP_DIAMOND, 3f, 0.07f, ()-> Ingredient.of(ModItems.GALEON.get())),
    EXTRA("extra", 0, new int[]{0, 0, 0, 0}, 0,
            SoundEvents.ARMOR_EQUIP_LEATHER, 0, 0, ()-> Ingredient.of(Blocks.END_PORTAL_FRAME)),
    ;

    private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;
    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    ModArmourMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
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
        return DrunirMod.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}
