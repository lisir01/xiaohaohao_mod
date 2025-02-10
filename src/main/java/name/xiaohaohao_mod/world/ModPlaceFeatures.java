package name.xiaohaohao_mod.world;


import name.xiaohaohao_mod.XiaohaohaoMod;
import name.xiaohaohao_mod.world.ModConfiguredFeatures;
import name.xiaohaohao_mod.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlaceFeatures {


    public static RegistryKey<PlacedFeature> TINGJIE_TREE_PLACED_KEY = of("tingjie_tree_placed");

    public static void bootstrap(Registerable<PlacedFeature> fratureRegisterable){
        RegistryEntryLookup<ConfiguredFeature<?,?>> registryEntryLookup= fratureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(fratureRegisterable,TINGJIE_TREE_PLACED_KEY,registryEntryLookup.getOrThrow(ModConfiguredFeatures.TINGJIE_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(2,0.1f,2),
                        ModBlocks.TINGJIESAPLING));
    }

    public static RegistryKey<PlacedFeature> of(String id){
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(XiaohaohaoMod.MOD_ID,id));
    }

    public static void register(
        Registerable<PlacedFeature> featureRegisterable,
        RegistryKey<PlacedFeature> key,
        RegistryEntry<ConfiguredFeature<?,?>> feature,
        List<PlacementModifier> modifiers
    ){
        featureRegisterable.register(key,new PlacedFeature(feature,List.copyOf(modifiers)));
    }

    public static void register(
            Registerable<PlacedFeature> featureRegisterable,
            RegistryKey<PlacedFeature> key,
            RegistryEntry<ConfiguredFeature<?,?>> feature,
            PlacementModifier... modifiers
    ){
        register(featureRegisterable,key,feature,List.of(modifiers));
    }
}
