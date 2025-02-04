package name.xiaohaohao_mod.block;

import name.xiaohaohao_mod.XiaohaohaoMod;
import net.minecraft.block.*;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;



public class ModBlocks {

    public static final Block TINGJIESTONE =register("tingjiestone",new Block(AbstractBlock.Settings.create().strength(3.0f,6.0f)));
    public static final Block TINGJIELOG =register("tingjielog",createLogBlock(MapColor.OAK_TAN, MapColor.SPRUCE_BROWN));
    public static final Block TINGJIELEAVES = register("tingjieleaves", createLeavesBlock(BlockSoundGroup.GRASS));


//    以下是原木注册调用的方法
    public static Block createLogBlock(MapColor topMapColor, MapColor sideMapColor) {
        return new PillarBlock(
                AbstractBlock.Settings.create()
                        .mapColor(state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? topMapColor : sideMapColor)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(2.0F)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable()
        );
    }

//    以下是树叶注册调用的方法
    public static Block createLeavesBlock(BlockSoundGroup soundGroup) {
        return new LeavesBlock(
                AbstractBlock.Settings.create()
                        .mapColor(MapColor.DARK_GREEN)
                        .strength(0.2F)
                        .ticksRandomly()
                        .sounds(soundGroup)
                        .nonOpaque()
                        .allowsSpawning(Blocks::canSpawnOnLeaves)
                        .suffocates(Blocks::never)
                        .blockVision(Blocks::never)
                        .burnable()
                        .pistonBehavior(PistonBehavior.DESTROY)
                        .solidBlock(Blocks::never)
        );
    }

//以下是普通方块注册时调用的方法
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
