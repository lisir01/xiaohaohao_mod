package name.xiaohaohao_mod.block;

import name.xiaohaohao_mod.XiaohaohaoMod;
import name.xiaohaohao_mod.world.tree.ModTreeGenerator;
import net.minecraft.block.*;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.ColorCode;
import net.minecraft.util.Identifier;



public class ModBlocks {

    public static final Block TINGJIESTONE =register("tingjiestone",new Block(
            AbstractBlock.Settings.create().
            requiresTool().
            strength(3.0f,6.0f)));
//    婷姐石头

    public static final Block TINGJIECOBBLESTONE=register("tingjiecobblestone",new Block(
            AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(3.5f,6.0f)));
//    婷姐圆石

    public static final Block TINGJIELOG =register("tingjielog",new PillarBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
//    婷姐原木

    public static final Block TINGJIELEAVES = register("tingjieleaves", new LeavesBlock(AbstractBlock.Settings.copy(Blocks.OAK_LEAVES)));
//    婷姐树叶

    public static final Block TINGJIESAND = register("tingjiesand", new ColoredFallingBlock(new ColorCode(14406560),
                    AbstractBlock.Settings.create()
                            .instrument(NoteBlockInstrument.SNARE)
                            .strength(0.5f,0.5f)
                            .sounds(BlockSoundGroup.SAND)));
//    婷姐沙子

    public static final Block TINGJIE_GRASS_BLOCK=register("tingjie_grass_block",new GrassBlock(
            AbstractBlock.Settings.create()
                    .mapColor(MapColor.PALE_GREEN)
                    .ticksRandomly()
                    .strength(0.7f)
                    .sounds(BlockSoundGroup.GRASS)));
//    婷姐草方块

    public static final Block TINGJIE_DIRT=register("tingjie_dirt",new Block(
            AbstractBlock.Settings.create()
                    .strength(0.7f,0.7f)
                    .sounds(BlockSoundGroup.GRAVEL)));
//    婷姐泥土

    public static final Block TINGJIESAPLING = register("tingjiesapling", new ModSaplingBlock(
            ModTreeGenerator.TINGJIE_TREE,AbstractBlock.Settings.create()
            .noCollision()
            .ticksRandomly()
            .breakInstantly()
            .pistonBehavior(PistonBehavior.DESTROY)));
//婷姐树苗




    public static final Block TINGJIEORE = register("tingjieore",new Block(
            AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(3.5f,3.0f)));
//    白色婷姐矿

    public static final Block BLACK_TINGJIEORE =register("black_tingjieore",new Block(
            AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(5.0f,3.0f)));
//    黑色婷姐矿

    public static final Block TINGJIEBLOCK=register("tingjieblock",new Block(
            AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(5.5f,6.0f)));
//    婷姐块

    public static final Block OXIDZED_TINGJIEBLOCK=register("oxidized_tingjieblock",new Block(
            AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(5.5f,6.0f)));
//    氧化的婷姐块






//以下是方块注册时调用的方法
    public static Block register(String id, Block block) {
        registerBlockItems(id,block);
        return Registry.register(Registries.BLOCK, Identifier.of(XiaohaohaoMod.MOD_ID,id), block);
    }

    //注册方块物品的方法
    public static void registerBlockItems(String id,Block block){
        Item item = Registry.register(Registries.ITEM,Identifier.of(XiaohaohaoMod.MOD_ID,id), new BlockItem(block,new Item.Settings()));
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
    }

    public static void registerModBlocks(){

    }
}
