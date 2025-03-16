package net.sufia.landofdrunir.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.sufia.landofdrunir.block.custom.wood.ModFlammableRotatedPillarBlock;

import java.util.stream.Stream;

public class HollowLog extends ModFlammableRotatedPillarBlock {
   public static final VoxelShape SHAPE =
           Stream.of(
                   Block.box(14, 0, 0, 16, 16, 16),
                   Block.box(0, 0, 0, 2, 16, 16),
                   Block.box(2, 0, 0, 14, 16, 2),
                   Block.box(2, 0, 14, 14, 16, 16)
           ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

   public static final VoxelShape SHAPEZ =
           Stream.of(
                   Block.box(14, 0, 0, 16, 16, 16),
                   Block.box(0, 0, 0, 2, 16, 16),
                   Block.box(2, 14, 0, 14, 16, 16),
                   Block.box(2, 0, 0, 14, 2, 16)
           ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    public static final VoxelShape SHAPEX =
            Stream.of(
                    Block.box(0, 0, 0, 16, 16, 2),
                    Block.box(0, 0, 14, 16, 16, 16),
                    Block.box(0, 14, 2, 16, 16, 14),
                    Block.box(0, 0, 2, 16, 2, 14)
            ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();


    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch ((Direction.Axis)pState.getValue(AXIS)) {
            case X:
                return SHAPEX;
            case Z:
                return SHAPEZ;
            default:
                return SHAPE;
        }
    }

    public HollowLog(Properties pProperties) {
        super(pProperties);
    }
}
