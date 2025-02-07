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
                entries.add(ModItems.MONEY);
                entries.add(ModItems.HALF_A_MILLION_MARKS);

                entries.add(ModBlocks.TINGJIESTONE);
                entries.add(ModBlocks.TINGJIECOBBLESTONE);
                entries.add(ModBlocks.TINGJIESAND);
                entries.add(ModBlocks.TINGJIELOG);
                entries.add(ModBlocks.TINGJIELEAVES);


                entries.add(ModBlocks.BLACK_TINGJIEORE);
                entries.add(ModBlocks.TINGJIEORE);
                entries.add(ModItems.RAW_TINGJIEMINE);
                entries.add(ModItems.TINGJIEINGOT);
                entries.add(ModItems.TINGJIENUGGET);
                entries.add(ModBlocks.TINGJIEBLOCK);
                entries.add(ModItems.CAMERA);
                entries.add(ModItems.MUSIC_PZSDBD);




            }).build());

    public static void registerModItemGroups(){

    }
}
