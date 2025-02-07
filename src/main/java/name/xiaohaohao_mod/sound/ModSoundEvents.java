package name.xiaohaohao_mod.sound;

import name.xiaohaohao_mod.XiaohaohaoMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSoundEvents {



    public static final RegistryEntry.Reference<SoundEvent> MUSIC_DISC_PZSDBD=registerReference("music_disc.pzsdbd");


    private static RegistryEntry.Reference<SoundEvent> registerReference(String name){
        Identifier id =Identifier.of(XiaohaohaoMod.MOD_ID,name);
        return Registry.registerReference(Registries.SOUND_EVENT,id,SoundEvent.of(id));
    }


    public static void registerModSoundEvents(){

    }
}
