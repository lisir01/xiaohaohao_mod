package name.xiaohaohao_mod;

import name.xiaohaohao_mod.block.ModBlocks;
import name.xiaohaohao_mod.item.ModItemGroups;
import name.xiaohaohao_mod.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XiaohaohaoMod implements ModInitializer {
	public static final String MOD_ID = "xiaohaohao_mod";




	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		ModItems.registerModItems();
		ModItemGroups.registerModItemGroups();
		ModBlocks.registerModBlocks();
		LOGGER.info("这个，这个，还有这个，统统启动！");
	}
}