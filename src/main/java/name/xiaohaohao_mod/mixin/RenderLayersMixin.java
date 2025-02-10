package name.xiaohaohao_mod.mixin;

import name.xiaohaohao_mod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(RenderLayers.class)
public class RenderLayersMixin {
    @Shadow @Final private static Map<Block,RenderLayer> BLOCKS;

    @Inject(method = "<clinit>",at = @At("RETURN"))
    private static void onBlockInit(CallbackInfo ci){
        BLOCKS.put(ModBlocks.TINGJIESAPLING, RenderLayer.getCutout());
    }
}
