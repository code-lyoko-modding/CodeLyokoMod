/*
 * Code Lyoko Mod for Minecraft v@VERSION
 *
 * Copyright 2013 Cortex Modders, Matthew Warren, Jacob Rhoda, and
 * other contributors.
 * Released under the MIT license
 * http://opensource.org/licenses/MIT
 * 
 */

package matt.lyoko.handlers;

import java.util.logging.Level;

import matt.lyoko.ModLogger;
import matt.lyoko.lib.ModProperties;
import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundHandler {

    /**
     * When Minecraft loads sounds, load our sounds too.
     * 
     * @param event
     */
    @ForgeSubscribe
    public void onSoundLoad(SoundLoadEvent event) {
        loadSound(event.manager, "scannerClose.ogg");
        loadSound(event.manager, "scannerOpen.ogg");
    }
    
    /**
     * Tries to load sounds to game.
     * 
     * @param manager
     * @param file
     */
    public void loadSound(SoundManager manager, String file) {
        try {
//            manager.addSound(ModProperties.SOUND_LOAD_PREFIX + file, this.getClass().getResource("/" + ModProperties.SOUND_LOAD_PREFIX + file));
            manager.addSound(ModProperties.SOUND_LOAD_PREFIX + file);
        } 
        catch(Exception e) {
            ModLogger.log(Level.WARNING, "Error not load sound " + file);
        }
    }
}
