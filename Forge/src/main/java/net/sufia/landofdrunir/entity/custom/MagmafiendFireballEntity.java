package net.sufia.landofdrunir.entity.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.*;
import net.minecraft.world.entity.projectile.AbstractHurtingProjectile;
import net.minecraft.world.entity.projectile.Fireball;
import net.minecraft.world.entity.projectile.LargeFireball;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.HitResult;
import net.sufia.landofdrunir.init.entity.ModEntities;

import java.awt.geom.Area;
import java.util.List;

public class MagmafiendFireballEntity extends LargeFireball {

    private int explosionpower=1;
    public MagmafiendFireballEntity(EntityType<? extends LargeFireball> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }
    public MagmafiendFireballEntity(Level pLevel) {
        super(ModEntities.MAGMAFIEND_FIREBALL.get(), pLevel);
    }



    protected void onHit(HitResult pResult) {
        super.onHit(pResult);
        if (!this.level().isClientSide) {
            boolean flag = net.minecraftforge.event.ForgeEventFactory.getMobGriefingEvent(this.level(), this.getOwner());
            this.level().explode(this, this.getX(), this.getY(), this.getZ(), (float)this.explosionpower, flag, Level.ExplosionInteraction.MOB);
            this.discard();
        }

    }
    protected void onHitEntity(EntityHitResult pResult) {
        super.onHitEntity(pResult);
        if (!this.level().isClientSide) {
            Entity entity = pResult.getEntity();
            Entity entity1 = this.getOwner();
            entity.setSecondsOnFire(5);
            entity.hurt(this.damageSources().fireball(this, entity1), 6.0F);
            if (entity1 instanceof LivingEntity) {
                this.doEnchantDamageEffects((LivingEntity)entity1, entity);
            }

        }
    }
    public boolean isPickable() {
        return false;
    }

    public boolean hurt(DamageSource pSource, float pAmount) {
        return false;
    }

    protected ParticleOptions getTrailParticle() {
        return ParticleTypes.ASH;
    }

    protected boolean shouldBurn() {
        return false;
    }
}
