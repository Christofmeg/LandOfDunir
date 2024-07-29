package com.christofmeg.landofdrunir.client.data;

import com.christofmeg.landofdrunir.CommonConstants;
import com.christofmeg.landofdrunir.common.init.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

public class DrunirBlockStateProvider extends BlockStateProvider {

    public DrunirBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, CommonConstants.MOD_ID, exFileHelper);
    }

    @Override
    public @NotNull String getName() {
        return CommonConstants.MOD_ID + " - BlockModel & BlockState";
    }

    @Override
    protected void registerStatesAndModels() {

        simpleBlock(BlockRegistry.PLASMITE_ORE.get());

    }

}
