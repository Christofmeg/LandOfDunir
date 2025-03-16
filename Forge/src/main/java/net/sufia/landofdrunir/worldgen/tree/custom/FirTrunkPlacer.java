package net.sufia.landofdrunir.worldgen.tree.custom;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.LevelSimulatedReader;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.configurations.TreeConfiguration;
import net.minecraft.world.level.levelgen.feature.foliageplacers.FoliagePlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacer;
import net.minecraft.world.level.levelgen.feature.trunkplacers.TrunkPlacerType;
import net.sufia.landofdrunir.worldgen.tree.ModTrunkPlacerTypes;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class FirTrunkPlacer extends TrunkPlacer {
    public static final Codec<FirTrunkPlacer> CODEC = RecordCodecBuilder.create(firTrunkPlacerInstance ->
            trunkPlacerParts(firTrunkPlacerInstance).apply(firTrunkPlacerInstance, FirTrunkPlacer::new));
    public FirTrunkPlacer(int pBaseHeight, int pHeightRandA, int pHeightRandB) {
        super(pBaseHeight, pHeightRandA, pHeightRandB);
    }

    @Override
    protected TrunkPlacerType<?> type() {
        return ModTrunkPlacerTypes.FIR_TRUNK_PLACER.get();
    }

    @Override
    public List<FoliagePlacer.FoliageAttachment> placeTrunk(LevelSimulatedReader pLevel, BiConsumer<BlockPos, BlockState> pBlockSetter, RandomSource pRandom, int pFreeTreeHeight, BlockPos pPos, TreeConfiguration pConfig) {
        setDirtAt(pLevel, pBlockSetter, pRandom, pPos.below(), pConfig);
        int height = pFreeTreeHeight + pRandom.nextInt(heightRandA, heightRandA + 3) + pRandom.nextInt(heightRandB+2, heightRandB + 3);

        for (int i = 0; i < height-3; i++) {
            placeLog(pLevel, pBlockSetter, pRandom, pPos.above(i), pConfig);

            if (i % 2 == 0 && pRandom.nextBoolean()) {
                if (pRandom.nextFloat() <= 0.5f) {
                    for (int x = 0; x < 4; x++) {
                        pBlockSetter.accept(pPos.above(i+2).relative(Direction.NORTH, x), ((BlockState)
                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
                    }
                }
                else if (pRandom.nextFloat() > 0.5f) {
                    for (int x = 0; x < 5; x++) {
                        pBlockSetter.accept(pPos.above(i+2).relative(Direction.NORTH, x), ((BlockState)
                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
                    }
                }
            }
            if(i % 2 == 0 && pRandom.nextBoolean()) {
                if (pRandom.nextFloat() <= 0.5) {
                    for (int x = 0; x < 4; x++) {
                        pBlockSetter.accept(pPos.above(i+2).relative(Direction.SOUTH, x), ((BlockState)
                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
                    }
                }
                else if (pRandom.nextFloat() > 0.5f) {
                    for (int x = 0; x < 5; x++) {
                        pBlockSetter.accept(pPos.above(i+2).relative(Direction.SOUTH, x), ((BlockState)
                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.Z))));
                    }
                }
            }
            if(i % 2 == 0 && pRandom.nextBoolean()) {
                if (pRandom.nextFloat() <= 0.5) {
                    for (int x = 0; x < 4; x++) {
                        pBlockSetter.accept(pPos.above(i+2).relative(Direction.EAST, x), ((BlockState)
                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
                    }
                }
                else if (pRandom.nextFloat() > 0.5) {
                    for (int x = 0; x < 5; x++) {
                        pBlockSetter.accept(pPos.above(i+2).relative(Direction.EAST, x), ((BlockState)
                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
                    }
                }
            }
            if(i % 2 == 0 && pRandom.nextBoolean()) {
                if (pRandom.nextFloat() <= 0.5) {
                    for (int x = 0; x < 4; x++) {
                        pBlockSetter.accept(pPos.above(i+2).relative(Direction.WEST, x), ((BlockState)
                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
                    }
                }
                else if (pRandom.nextFloat() > 0.5) {
                    for (int x = 0; x < 5; x++) {
                        pBlockSetter.accept(pPos.above(i+2).relative(Direction.WEST, x), ((BlockState)
                                Function.identity().apply(pConfig.trunkProvider.getState(pRandom, pPos).setValue(RotatedPillarBlock.AXIS, Direction.Axis.X))));
                    }
                }
            }
        }
        return ImmutableList.of(new FoliagePlacer.FoliageAttachment(pPos.above(height), 0, false));
    }
}
