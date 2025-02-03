package name.xiaohaohao_mod.item;

import name.xiaohaohao_mod.XiaohaohaoMod;
import name.xiaohaohao_mod.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MinecartItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


public class ModItemGroups {
    public static final ItemGroup XIAOHAOHAO_GROUP = Registry.register(Registries.ITEM_GROUP,Identifier.of(XiaohaohaoMod.MOD_ID,"xiaohaohao_group"),
        ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.xiaohaohao_group"))
            .icon(() -> new ItemStack(ModItems.MONEY))
            .entries((displayContext,entries) ->{
                entries.add(ModItems.MONEY);
                entries.add(ModItems.HALF_A_MILLION_MARKS);

                entries.add(ModBlocks.TINGJIESTONE);
    }).build());

    public static void registerModItemGroups(){

    }
}
