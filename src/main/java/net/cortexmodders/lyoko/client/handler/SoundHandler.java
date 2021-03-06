/*
 * Code Lyoko Mod for Minecraft ${version}
 * Copyright 2014 Cortex Modders, Matthew Warren, Jacob Rhoda, and other contributors.
 * Released under the MIT license http://opensource.org/licenses/MIT
 */

package net.cortexmodders.lyoko.client.handler;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.cortexmodders.lyoko.CodeLyoko;
import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;

public class SoundHandler
{
    /**
     * When Minecraft loads sounds, load our sounds too.
     *
     * @param event
     */
    @SubscribeEvent
    public void onSoundLoad(SoundLoadEvent event)
    {
        this.loadSound(event.manager, "scannerClose.ogg");
        this.loadSound(event.manager, "scannerOpen.ogg");
    }

    /**
     * Tries to load sounds to game.
     *
     * @param manager
     * @param file
     */
    public void loadSound(SoundManager manager, String file)
    {
        try {
            // TODO: figure out new sound system
            // manager. //(ModProperties.SOUND_PREFIX + file);
        } catch (Exception e) {
            CodeLyoko.instance.getLogger().warn("Error cannot load sound " + file);
        }
    }
}
