package name.xiaohaohao_mod.item;

import name.xiaohaohao_mod.XiaohaohaoMod;
import name.xiaohaohao_mod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.*;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup XIAOHAOHAO_GROUP = Registry.register(Registries.ITEM_GROUP,Identifier.of(XiaohaohaoMod.MOD_ID,"xiaohaohao_group"),
        ItemGroup.create(null,-1).displayName(Text.translatable("itemGroup.xiaohaohao_group"))
            .icon(() -> new ItemStack(ModItems.MONEY))
            .entries((displayContext,entries) ->{
                entries.add(ModItems.MONEY);//硬币 非婷姐相关
                entries.add(ModItems.HALF_A_MILLION_MARKS);//50w马克的面包，非婷姐相关

                entries.add(ModBlocks.TINGJIESTONE);//婷姐石头
                entries.add(ModBlocks.TINGJIECOBBLESTONE);//婷姐圆石
                entries.add(ModBlocks.TINGJIESAND);//婷姐沙子
                entries.add(ModBlocks.TINGJIE_GRASS_BLOCK);//婷姐草方块
                entries.add(ModBlocks.TINGJIE_DIRT);//婷姐泥土
                entries.add(ModBlocks.TINGJIELOG);//婷姐原木
                entries.add(ModBlocks.TINGJIELEAVES);//婷姐树叶
                entries.add(ModBlocks.TINGJIESAPLING);//婷姐树苗


                entries.add(ModBlocks.BLACK_TINGJIEORE);//婷姐黑色矿物块
                entries.add(ModBlocks.TINGJIEORE);//婷姐白色矿物块
                entries.add(ModItems.RAW_TINGJIEMINE);//婷姐粗矿
                entries.add(ModItems.TINGJIEINGOT);//婷姐锭
                entries.add(ModItems.TINGJIENUGGET);//婷姐粒
                entries.add(ModBlocks.TINGJIEBLOCK);//婷姐块
                entries.add(ModItems.OXIDIZED_RAW_TINHJIEMINE);//氧化的婷姐粗矿
                entries.add(ModItems.OXIDIZED_TINGJIEINGOT);//氧化的婷姐锭
                entries.add(ModItems.OXIDIZED_TINGJIENUGGET);//氧化的婷姐粒
                entries.add(ModBlocks.OXIDZED_TINGJIEBLOCK);//氧化的婷姐矿


                entries.add(ModItems.CAMERA);//照相机
                entries.add(ModItems.MUSIC_PZSDBD);//音乐唱片




            }).build());

    public static void registerModItemGroups(){

    }
}
