package name.xiaohaohao_mod.item;

import name.xiaohaohao_mod.XiaohaohaoMod;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item HALF_A_MILLION_MARKS= registerItems("half-a-million-marks", new Item(new Item.Settings().maxCount(1)));
    public static final Item MONEY=registerItems("money",new Item(new Item.Settings()));
    public static final Item RAW_TINGJIEMINE = registerItems("raw_tingjiemine", new Item(new Item.Settings()));
    public static final Item TINGJIEINGOT =registerItems("tingjieingot",new Item(new Item.Settings().food(ModFoodComponents.TINGJIEINGOT)));





    private static Item registerItems(String id, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(XiaohaohaoMod.MOD_ID,id), item);
    }
    public static void registerModItems(){
    }
}
