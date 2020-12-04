package net.dries007.tfc.common.blocks.rock;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Block that can be converted into a mossy variant
 * Mossy blocks will call this on nearby blocks on random tick.
 * The destination block is responsible for checking if it can be converted to moss.
 */
public interface IMossGrowingBlock
{
    void convertToMossy(World worldIn, BlockPos pos, BlockState state, boolean needsWater);
}
