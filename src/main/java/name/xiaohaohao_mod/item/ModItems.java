package name.xiaohaohao_mod.item;

import name.xiaohaohao_mod.XiaohaohaoMod;
import name.xiaohaohao_mod.sound.ModJukeboxSongs;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {

    public static final Item HALF_A_MILLION_MARKS= registerItems("half-a-million-marks", new Item(
            new Item.Settings()
                    .maxCount(1)));
//    50w马克的面包

    public static final Item MONEY=registerItems("money",new Item(
            new Item.Settings()));
//    银币


    public static final Item RAW_TINGJIEMINE = registerItems("raw_tingjiemine", new Item(
            new Item.Settings()));
//    婷姐粗矿

    public static final Item TINGJIEINGOT =registerItems("tingjieingot",new Item(
            new Item.Settings()));
//    婷姐锭

    public static final Item TINGJIENUGGET=registerItems("tingjienugget",new Item(
            new Item.Settings()));
//    婷姐粒

    public static final Item OXIDIZED_RAW_TINHJIEMINE=registerItems("oxidized_raw_tingjiemine",new Item(
            new Item.Settings()));
//    氧化婷姐粗矿

    public static final Item OXIDIZED_TINGJIEINGOT=registerItems("oxidized_tingjieingot",new Item(
            new Item.Settings()));
//    氧化婷姐锭

    public static final Item OXIDIZED_TINGJIENUGGET=registerItems("oxidized_tingjienugget",new Item(
            new Item.Settings()));
//    氧化婷姐粒



    public static final Item CAMERA = registerItems("camera",new Item(
            new Item.Settings()
                    .maxCount(1)));
//    照相机

    public static final Item MUSIC_PZSDBD =registerItems("music_pzsdbd",new Item(
            new Item.Settings()
                    .maxCount(1)
                    .rarity(Rarity.RARE)
                    .jukeboxPlayable(ModJukeboxSongs.PZSDBD)));
//    音乐唱片




    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(XiaohaohaoMod.MOD_ID,id), item);
    }
    public static void registerModItems(){
    }
}
