package net.sufia.landofdrunir.init;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sufia.landofdrunir.DrunirMod;
import net.sufia.landofdrunir.init.entity.ModBoatEntity;
import net.sufia.landofdrunir.init.entity.ModEntities;
import net.sufia.landofdrunir.item.custom.LanceItem;
import net.sufia.landofdrunir.item.custom.ModBoatItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DrunirMod.MODID);

    public static final RegistryObject<Item> DRUNITE = ITEMS.register("drunite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> GOBLIN_DRIP = ITEMS.register("goblin_drip", () -> new ArmorItem(ModArmourMaterials.EXTRA, ArmorItem.Type.CHESTPLATE, new Item.Properties().stacksTo(64)));

    public static final RegistryObject<Item> PORTAL_GUARDIAN_EGG = ITEMS.register("portal_guardian_egg", () -> new ForgeSpawnEggItem(ModEntities.PORTAL_GUARDIAN, -13421773,-10066330, new Item.Properties()));

    public static final RegistryObject<Item> DEER_EGG = ITEMS.register("deer_egg", () -> new ForgeSpawnEggItem(ModEntities.DEER, -5733561, -12309484, new Item.Properties()));
    public static final RegistryObject<Item> BOAR_EGG = ITEMS.register("boar_egg", () -> new ForgeSpawnEggItem(ModEntities.BOAR, -13885178, -10734058, new Item.Properties()));
    public static final RegistryObject<Item> BULL_EGG = ITEMS.register("bull_egg", () -> new ForgeSpawnEggItem(ModEntities.BULL,  -14607082, -15527407, new Item.Properties()));
    public static final RegistryObject<Item> GOBLIN_MINOR_EGG = ITEMS.register("goblin_minor_egg", () -> new ForgeSpawnEggItem(ModEntities.GOBLIN_MINOR,  -14202065, -11123940, new Item.Properties()));
    public static final RegistryObject<Item> FIRE_GOBLIN_EGG = ITEMS.register("fire_goblin_egg", () -> new ForgeSpawnEggItem(ModEntities.FIRE_GOBLIN,  -6411248, -14463185, new Item.Properties()));
    public static final RegistryObject<Item> GOBLIN_MERCHANT_EGG = ITEMS.register("goblin_merchant_egg", () -> new ForgeSpawnEggItem(ModEntities.GOBLIN_MERCHANT,  -14202065, -14344948, new Item.Properties()));
    public static final RegistryObject<Item> DRIPPY_GOBLIN_EGG = ITEMS.register("drippy_goblin_egg", () -> new ForgeSpawnEggItem(ModEntities.DRIPPY_GOBLIN,  -8490981, -14202065, new Item.Properties()));
    public static final RegistryObject<Item> MAGMAFIEND_EGG = ITEMS.register("magmafiend_egg", () -> new ForgeSpawnEggItem(ModEntities.MAGMAFIEND,  -14085368, -11074556, new Item.Properties()));

    public static final RegistryObject<Item> RAW_VENISON = ITEMS.register("raw_venison", () -> new Item(new Item.Properties().food(ModFoods.RAW_VENISON)));
    public static final RegistryObject<Item> COOKED_VENISON = ITEMS.register("cooked_venison", () -> new Item(new Item.Properties().food(ModFoods.COOKED_VENISON)));

    public static final RegistryObject<Item> RAW_BOAR = ITEMS.register("raw_boar", () -> new Item(new Item.Properties().food(ModFoods.RAW_BOAR)));
    public static final RegistryObject<Item> COOKED_BOAR = ITEMS.register("cooked_boar", () -> new Item(new Item.Properties().food(ModFoods.COOKED_BOAR)));

    public static final RegistryObject<Item> WOOD_LANCE = ITEMS.register("wood_lance", () -> new LanceItem(Tiers.WOOD,7,-3.5f, new Item.Properties()));
    public static final RegistryObject<Item> STONE_LANCE = ITEMS.register("stone_lance", () -> new LanceItem(Tiers.STONE,7,-3.5f, new Item.Properties()));
    public static final RegistryObject<Item> GOLD_LANCE = ITEMS.register("gold_lance", () -> new LanceItem(Tiers.GOLD,7,-3.5f, new Item.Properties()));
    public static final RegistryObject<Item> IRON_LANCE = ITEMS.register("iron_lance", () -> new LanceItem(Tiers.IRON,7,-3.5f, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_LANCE = ITEMS.register("diamond_lance", () -> new LanceItem(Tiers.DIAMOND,7,-3.5f, new Item.Properties()));
    public static final RegistryObject<Item> NETHERITE_LANCE = ITEMS.register("netherite_lance", () -> new LanceItem(Tiers.NETHERITE,7,-3.5f, new Item.Properties()));

    public static final RegistryObject<Item> DRUNITE_SWORD = ITEMS.register("drunite_sword", () -> new SwordItem(ModToolTiers.DRUNITE, 10,  -2.4f,new  Item.Properties()));
    public static final RegistryObject<Item> DRUNITE_PICKAXE = ITEMS.register("drunite_pickaxe", () -> new PickaxeItem(ModToolTiers.DRUNITE, 7,  -2.8f,new  Item.Properties()));
    public static final RegistryObject<Item> DRUNITE_AXE = ITEMS.register("drunite_axe", () -> new AxeItem(ModToolTiers.DRUNITE, 11f,  -3f,new  Item.Properties()));
    public static final RegistryObject<Item> DRUNITE_SHOVEL = ITEMS.register("drunite_shovel", () -> new ShovelItem(ModToolTiers.DRUNITE, 7.5f,  -3f,new  Item.Properties()));
    public static final RegistryObject<Item> DRUNITE_HOE = ITEMS.register("drunite_hoe", () -> new HoeItem(ModToolTiers.DRUNITE, 0,  0f,new  Item.Properties()));
    public static final RegistryObject<Item> DRUNITE_LANCE = ITEMS.register("drunite_lance", () -> new LanceItem(ModToolTiers.DRUNITE,16,-3.5f, new Item.Properties()));

    public static final RegistryObject<Item> DRUNITE_HELMET = ITEMS.register("drunite_helmet", () -> new ArmorItem(ModArmourMaterials.DRUNITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> DRUNITE_CHESTPLATE = ITEMS.register("drunite_chestplate", () -> new ArmorItem(ModArmourMaterials.DRUNITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> DRUNITE_LEGGINGS = ITEMS.register("drunite_leggings", () -> new ArmorItem(ModArmourMaterials.DRUNITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> DRUNITE_BOOTS = ITEMS.register("drunite_boots", () -> new ArmorItem(ModArmourMaterials.DRUNITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> PLASMITE_SWORD = ITEMS.register("plasmite_sword", () -> new SwordItem(ModToolTiers.PLASMITE, 11,  -2.4f,new  Item.Properties()));
    public static final RegistryObject<Item> PLASMITE_PICKAXE = ITEMS.register("plasmite_pickaxe", () -> new PickaxeItem(ModToolTiers.PLASMITE, 8,  -2.8f,new  Item.Properties()));
    public static final RegistryObject<Item> PLASMITE_AXE = ITEMS.register("plasmite_axe", () -> new AxeItem(ModToolTiers.PLASMITE, 12,  -3f,new  Item.Properties()));
    public static final RegistryObject<Item> PLASMITE_SHOVEL = ITEMS.register("plasmite_shovel", () -> new ShovelItem(ModToolTiers.PLASMITE, 8.5f,  -3f,new  Item.Properties()));
    public static final RegistryObject<Item> PLASMITE_HOE = ITEMS.register("plasmite_hoe", () -> new HoeItem(ModToolTiers.PLASMITE, 0,  0,new  Item.Properties()));
    public static final RegistryObject<Item> PLASMITE_LANCE = ITEMS.register("plasmite_lance", () -> new LanceItem(ModToolTiers.PLASMITE,19,-3.5f, new Item.Properties()));
    public static final RegistryObject<Item> PLASMITE = ITEMS.register("plasmite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PLASMITE_HELMET = ITEMS.register("plasmite_helmet", () -> new ArmorItem(ModArmourMaterials.PLASMITE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> PLASMITE_CHESTPLATE = ITEMS.register("plasmite_chestplate", () -> new ArmorItem(ModArmourMaterials.PLASMITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> PLASMITE_LEGGINGS = ITEMS.register("plasmite_leggings", () -> new ArmorItem(ModArmourMaterials.PLASMITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> PLASMITE_BOOTS = ITEMS.register("plasmite_boots", () -> new ArmorItem(ModArmourMaterials.PLASMITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> GALEON = ITEMS.register("galeon", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> GALEON_SWORD = ITEMS.register("galeon_sword", () -> new SwordItem(ModToolTiers.GALEON, 8,  -2.4f,new  Item.Properties()));
    public static final RegistryObject<Item> GALEON_PICKAXE = ITEMS.register("galeon_pickaxe", () -> new PickaxeItem(ModToolTiers.GALEON, 6,  -2.8f,new  Item.Properties()));
    public static final RegistryObject<Item> GALEON_AXE = ITEMS.register("galeon_axe", () -> new AxeItem(ModToolTiers.GALEON, 9,  -3f,new  Item.Properties()));
    public static final RegistryObject<Item> GALEON_SHOVEL = ITEMS.register("galeon_shovel", () -> new ShovelItem(ModToolTiers.GALEON, 6.5f,  -3f,new  Item.Properties()));
    public static final RegistryObject<Item> GALEON_HOE = ITEMS.register("galeon_hoe", () -> new HoeItem(ModToolTiers.GALEON, 0,  0,new  Item.Properties()));
    public static final RegistryObject<Item> GALEON_LANCE = ITEMS.register("galeon_lance", () -> new LanceItem(ModToolTiers.GALEON,13,-3.5f, new Item.Properties()));

    public static final RegistryObject<Item> GALEON_HELMET = ITEMS.register("galeon_helmet", () -> new ArmorItem(ModArmourMaterials.GALEON, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> GALEON_CHESTPLATE = ITEMS.register("galeon_chestplate", () -> new ArmorItem(ModArmourMaterials.GALEON, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> GALEON_LEGGINGS = ITEMS.register("galeon_leggings", () -> new ArmorItem(ModArmourMaterials.GALEON, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> GALEON_BOOTS = ITEMS.register("galeon_boots", () -> new ArmorItem(ModArmourMaterials.GALEON, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> MAGMATITE = ITEMS.register("magmatite", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> MAGMATITE_SWORD = ITEMS.register("magmatite_sword", () -> new SwordItem(ModToolTiers.MAGMATITE, 8,  -2.4f,new  Item.Properties()));
    public static final RegistryObject<Item> MAGMATITE_PICKAXE = ITEMS.register("magmatite_pickaxe", () -> new PickaxeItem(ModToolTiers.MAGMATITE, 6,  -2.8f,new  Item.Properties()));
    public static final RegistryObject<Item> MAGMATITE_AXE = ITEMS.register("magmatite_axe", () -> new AxeItem(ModToolTiers.MAGMATITE, 9,  -3f,new  Item.Properties()));
    public static final RegistryObject<Item> MAGMATITE_SHOVEL = ITEMS.register("magmatite_shovel", () -> new ShovelItem(ModToolTiers.MAGMATITE, 6.5f,  -3f,new  Item.Properties()));
    public static final RegistryObject<Item> MAGMATITE_HOE = ITEMS.register("magmatite_hoe", () -> new HoeItem(ModToolTiers.MAGMATITE, 0,  0,new  Item.Properties()));
    public static final RegistryObject<Item> MAGMATITE_LANCE = ITEMS.register("magmatite_lance", () -> new LanceItem(ModToolTiers.MAGMATITE,13,-3.5f, new Item.Properties()));

    public static final RegistryObject<Item> METAL_POLE = ITEMS.register("metal_pole", () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> FIR_SIGN = ITEMS.register("fir_sign", () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.FIR_SIGN.get(), ModBlocks.FIR_WALL_SIGN.get()));
    public static final RegistryObject<Item> FIR_HANGING_SIGN = ITEMS.register("fir_hanging_sign", () -> new HangingSignItem(ModBlocks.FIR_HANGING_SIGN.get(), ModBlocks.FIR_WALL_HANGING_SIGN.get(),new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> FIR_BOAT = ITEMS.register("fir_boat", () -> new ModBoatItem(false, ModBoatEntity.Type.FIR, new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> FIR_CHEST_BOAT = ITEMS.register("fir_chest_boat", () -> new ModBoatItem(true, ModBoatEntity.Type.FIR, new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
