package name.xiaohaohao_mod.world;

import com.google.common.collect.ImmutableList;
import name.xiaohaohao_mod.XiaohaohaoMod;
import name.xiaohaohao_mod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> TINGJIE_TREE_KEY=of("tingjie_tree");

    public static void bootstrap(Registerable<ConfiguredFeature<?,?>> featureRegisterable){
        register(featureRegisterable,TINGJIE_TREE_KEY,Feature.TREE,new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.TINGJIELOG),
                new StraightTrunkPlacer(4,1,1),
                BlockStateProvider.of(ModBlocks.TINGJIELEAVES),
                new BlobFoliagePlacer(ConstantIntProvider.create(3),ConstantIntProvider.create(0),3),
                new TwoLayersFeatureSize(1,0,2))
                .build());
    }


    public static RegistryKey<ConfiguredFeature<?, ?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(XiaohaohaoMod.MOD_ID,id));
    }

    public static <FC extends FeatureConfig,F extends Feature<FC>> void register(
            Registerable<ConfiguredFeature<?,?>> registerable ,RegistryKey<ConfiguredFeature<?,?>> key, F feature,FC config
    ){
        registerable.register(key,new ConfiguredFeature<FC,F>(feature,config));
    }
}
