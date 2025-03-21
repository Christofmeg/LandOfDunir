package net.sufia.landofdrunir.entity.custom;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class Lightling extends Monster {
    public Lightling(EntityType<? extends Lightling> type, Level pLevel) {
        super(type, pLevel);
        setMaxUpStep(0.6f);
        xpReward = 0;
        setNoAi(false);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 10)
                .add(Attributes.ATTACK_DAMAGE, 0)
                .add(Attributes.MOVEMENT_SPEED, 0.2) // Reduced speed for better balance
                .add(Attributes.ARMOR, 0)
                .add(Attributes.FOLLOW_RANGE, 10)
                .add(Attributes.KNOCKBACK_RESISTANCE, 0)
                .add(Attributes.ATTACK_KNOCKBACK, 0.3);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        // Movement-related goals
        this.goalSelector.addGoal(0, new FloatGoal(this));
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.0D, true)); // Melee attack for basic combat
        this.goalSelector.addGoal(2, new WaterAvoidingRandomStrollGoal(this, 1.0D)); // Wander around
        this.goalSelector.addGoal(3, new LookAtPlayerGoal(this, Player.class, 8.0F)); // Look at nearby players
        this.goalSelector.addGoal(4, new RandomLookAroundGoal(this)); // Randomly look around

        // Custom goal for hiding behavior
        this.goalSelector.addGoal(5, new HideFromPlayerGoal(this, 6.0D)); // Hide if player is within 6 blocks

        // Target-related goals
        this.targetSelector.addGoal(1, new HurtByTargetGoal(this)); // Retaliate when attacked
    }

    // Custom Goal for hiding when player approaches
    static class HideFromPlayerGoal extends Goal {
        private final Lightling lightling;
        private final double hideRadius;

        public HideFromPlayerGoal(Lightling lightling, double hideRadius) {
            this.lightling = lightling;
            this.hideRadius = hideRadius;
        }

        @Override
        public boolean canUse() {
            // Make sure the lightling has a valid world level
            if (lightling.level() == null) {
                return false;
            }

            Player nearestPlayer = lightling.level().getNearestPlayer(lightling, hideRadius);
            return nearestPlayer != null && !nearestPlayer.isCrouching() && lightling.distanceTo(nearestPlayer) < hideRadius;
        }

        @Override
        public void start() {
            // Find a safe spot underground or nearby, preferably an air block
            for (int yOffset = -3; yOffset <= 3; yOffset++) {
                if (lightling.level().isEmptyBlock(lightling.blockPosition().offset(0, yOffset, 0))) {
                    lightling.setPos(lightling.getX(), lightling.getY() + yOffset, lightling.getZ());
                    break;
                }
            }
        }

        @Override
        public void stop() {
            // When player leaves, bring Lightling back to the surface safely
            for (int yOffset = 1; yOffset <= 3; yOffset++) {
                if (lightling.level().isEmptyBlock(lightling.blockPosition().offset(0, yOffset, 0))) {
                    lightling.setPos(lightling.getX(), lightling.getY() + yOffset, lightling.getZ());
                    break;
                }
            }
        }

        @Override
        public boolean canContinueToUse() {
            // Make sure the lightling has a valid world level
            if (lightling.level() == null) {
                return false;
            }

            Player nearestPlayer = lightling.level().getNearestPlayer(lightling, hideRadius);
            return nearestPlayer != null && lightling.distanceTo(nearestPlayer) < hideRadius && !nearestPlayer.isCrouching();
        }
    }
}
