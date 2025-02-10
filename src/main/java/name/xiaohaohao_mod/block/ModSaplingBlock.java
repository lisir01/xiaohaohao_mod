package name.xiaohaohao_mod.block;

import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

import java.util.Optional;


public class ModSaplingBlock extends SaplingBlock implements Fertilizable  {

    public ModSaplingBlock(SaplingGenerator generator, Settings settings) {
        super(generator, settings);
    }


    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        return floor.isOf(ModBlocks.TINGJIE_GRASS_BLOCK);
    }
}
