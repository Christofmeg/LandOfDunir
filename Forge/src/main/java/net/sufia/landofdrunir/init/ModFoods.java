package net.sufia.landofdrunir.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties RAW_VENISON = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.3f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 500), 0.07f).meat().build();

    public static final FoodProperties COOKED_VENISON = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.8f).meat().build();

    public static final FoodProperties RAW_BOAR = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.2f).effect(() -> new MobEffectInstance(MobEffects.HUNGER, 500), 0.15f).meat().build();
    public static final FoodProperties COOKED_BOAR = new FoodProperties.Builder().nutrition(7)
            .saturationMod(0.6f).meat().build();

}