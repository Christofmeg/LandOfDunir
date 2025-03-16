package net.sufia.landofdrunir.init.wood;

import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.sufia.landofdrunir.DrunirMod;

public class ModWoodTypes {
    public static final WoodType FIR = WoodType.register(new WoodType(DrunirMod.MODID + ":fir", BlockSetType.OAK));
}
