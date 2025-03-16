package net.sufia.landofdrunir.init;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;
import net.sufia.landofdrunir.DrunirMod;

import java.util.List;


public class ModToolTiers {

    public static final Tier GALEON = TierSortingRegistry.registerTier(
            new ForgeTier(5,2550,8f,0,10,
                    ModTags.Blocks.NEEDS_GALEON_TOOL, () -> Ingredient.of(ModItems.GALEON.get())),
            ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID, "galeon"), List.of(Tiers.NETHERITE), List.of());
    public static final Tier DRUNITE = TierSortingRegistry.registerTier(
            new ForgeTier(6,3281,15f,0,12,
            ModTags.Blocks.NEEDS_DRUNITE_TOOL, () -> Ingredient.of(ModItems.DRUNITE.get())),
            ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID, "drunite"), List.of(ModToolTiers.GALEON), List.of());

    public static final Tier PLASMITE = TierSortingRegistry.registerTier(
            new ForgeTier(7,4881,23f,0,30,
                    ModTags.Blocks.NEEDS_PLASMITE_TOOL, () -> Ingredient.of(ModItems.PLASMITE.get())),
            ResourceLocation.fromNamespaceAndPath(DrunirMod.MODID, "plasmite"), List.of(ModToolTiers.DRUNITE), List.of());
}
