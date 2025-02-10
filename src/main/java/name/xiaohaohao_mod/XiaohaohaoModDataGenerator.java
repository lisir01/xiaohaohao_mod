package name.xiaohaohao_mod;

import name.xiaohaohao_mod.sound.ModJukeboxSongs;
import name.xiaohaohao_mod.world.ModConfiguredFeatures;
import name.xiaohaohao_mod.world.ModPlaceFeatures;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;

public class XiaohaohaoModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack= fabricDataGenerator.createPack();

//		pack.addProvider(ModWorldGen::new);

	}


	@Override
	public void buildRegistry(RegistryBuilder registryBuilder){
		registryBuilder.addRegistry(RegistryKeys.JUKEBOX_SONG, ModJukeboxSongs::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlaceFeatures::bootstrap);
	}

}
