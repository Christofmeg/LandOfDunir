package com.christofmeg.landofdrunir.client.data;

import com.christofmeg.landofdrunir.CommonConstants;
import com.christofmeg.landofdrunir.common.init.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
public class DrunirItemModelProvider extends ItemModelProvider {

    public DrunirItemModelProvider(PackOutput generator, ExistingFileHelper existingFileHelper) {
        super(generator, CommonConstants.MOD_ID, existingFileHelper);
    }

    @Override
    public @NotNull String getName() {
        return CommonConstants.MOD_ID + " - ItemModel";
    }

    @Override
    protected void registerModels() {
        ItemRegistry.ITEMS.getEntries().stream().map(RegistryObject::get).forEach((this::basicItem));
    }
}
