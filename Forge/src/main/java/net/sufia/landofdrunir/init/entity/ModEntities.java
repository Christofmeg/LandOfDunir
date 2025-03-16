package net.sufia.landofdrunir.init.entity;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.entity.custom.MagmafiendFireballEntity;
import net.sufia.landofdrunir.entity.custom.*;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DrunirMod.MODID);

    public static final RegistryObject<EntityType<PortalGuardian>> PORTAL_GUARDIAN =
            ENTITY_TYPES.register("portal_guardian", () -> EntityType.Builder.of(PortalGuardian::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("portal_guardian"));

    public static final RegistryObject<EntityType<Deer>> DEER =
            ENTITY_TYPES.register("deer", () -> EntityType.Builder.of(Deer::new, MobCategory.CREATURE)
                    .sized(1f, 1.2f).build("deer"));
    public static final RegistryObject<EntityType<Boar>> BOAR =
            ENTITY_TYPES.register("boar", () -> EntityType.Builder.of(Boar::new, MobCategory.CREATURE)
                    .sized(1f, 1f).build("boar"));
    public static final RegistryObject<EntityType<Bull>> BULL =
            ENTITY_TYPES.register("bull", () -> EntityType.Builder.of(Bull::new, MobCategory.CREATURE)
                    .sized(1f, 1.5f).build("bull"));
    public static final RegistryObject<EntityType<GoblinMinor>> GOBLIN_MINOR =
            ENTITY_TYPES.register("goblin_minor", () -> EntityType.Builder.of(GoblinMinor::new, MobCategory.CREATURE)
                    .sized(0.6f, 0.8f).build("goblin_minor"));
    public static final RegistryObject<EntityType<FireGoblin>> FIRE_GOBLIN =
            ENTITY_TYPES.register("fire_goblin", () -> EntityType.Builder.of(FireGoblin::new, MobCategory.CREATURE)
                    .sized(0.6f, 0.8f).build("fire_goblin"));
        public static final RegistryObject<EntityType<GoblinMerchant>> GOBLIN_MERCHANT =
            ENTITY_TYPES.register("goblin_merchant", () -> EntityType.Builder.of(GoblinMerchant::new, MobCategory.CREATURE)
                    .sized(0.6f, 0.8f).build("goblin_merchant"));
    public static final RegistryObject<EntityType<DrippyGoblin>> DRIPPY_GOBLIN =
            ENTITY_TYPES.register("drippy_goblin", () -> EntityType.Builder.of(DrippyGoblin::new, MobCategory.CREATURE)
                    .sized(0.6f, 0.8f).build("drippy_goblin"));
    public static final RegistryObject<EntityType<Magmafiend>> MAGMAFIEND =
            ENTITY_TYPES.register("magmafiend", () -> EntityType.Builder.of(Magmafiend::new, MobCategory.CREATURE)
                    .sized(2.5f, 2.5f).build("magmafiend"));
    public static final RegistryObject<EntityType<MagmafiendFireballEntity>> MAGMAFIEND_FIREBALL =
            ENTITY_TYPES.register("magmafiend_fireball", () -> EntityType.Builder.<MagmafiendFireballEntity>of(MagmafiendFireballEntity::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("magmafiend_fireball"));



    public static final RegistryObject<EntityType<ModBoatEntity>> MOD_BOAT =
            ENTITY_TYPES.register("mod_boat", () -> EntityType.Builder.<ModBoatEntity>of(ModBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_boat"));
    public static final RegistryObject<EntityType<ModChestBoatEntity>> MOD_CHEST_BOAT =
            ENTITY_TYPES.register("mod_chest_boat", () -> EntityType.Builder.<ModChestBoatEntity>of(ModChestBoatEntity::new, MobCategory.MISC)
                    .sized(1.375f, 0.5625f).build("mod_chest_boat"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
