package com.christofmeg.landofdrunir.common.data;

import com.christofmeg.landofdrunir.CommonConstants;
import com.christofmeg.landofdrunir.client.data.DrunirItemModelProvider;
import com.christofmeg.landofdrunir.client.data.DrunirLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

import java.util.concurrent.CompletableFuture;

@SuppressWarnings("unused")
@EventBusSubscriber(modid = CommonConstants.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DrunirDataGenerators {

    private static final String[] LOCALE_CODES = new String[] { "en_us", };

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        DataGenerator gen = event.getGenerator();
        PackOutput output = gen.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        if (event.includeClient()) {
            gen.addProvider(true, new DrunirItemModelProvider(output, existingFileHelper));
        }

        if (event.includeServer()) {
            DrunirBlockTagsProvider blockTags = gen.addProvider(true, new DrunirBlockTagsProvider(output, lookupProvider, existingFileHelper));
            gen.addProvider(true, new DrunirItemTagsProvider(output, lookupProvider, blockTags, existingFileHelper));
        }

        for (String locale : LOCALE_CODES) {
            gen.addProvider(true, new DrunirLanguageProvider(output, locale));
        }

    }

}