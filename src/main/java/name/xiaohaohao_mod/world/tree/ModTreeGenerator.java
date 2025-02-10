package name.xiaohaohao_mod.world.tree;


import name.xiaohaohao_mod.XiaohaohaoMod;
import name.xiaohaohao_mod.world.ModConfiguredFeatures;
import name.xiaohaohao_mod.world.ModPlaceFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModTreeGenerator {
    public static final SaplingGenerator TINGJIE_TREE =new SaplingGenerator(
            XiaohaohaoMod.MOD_ID+":tingjie_tree",
            Optional.empty(),
            Optional.of(ModConfiguredFeatures.TINGJIE_TREE_KEY),
            Optional.empty()
    );
}
