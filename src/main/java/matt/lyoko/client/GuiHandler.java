/*
 * Code Lyoko Mod for Minecraft v@VERSION Copyright 2013 Cortex Modders, Matthew
 * Warren, Jacob Rhoda, and other contributors. Released under the MIT license
 * http://opensource.org/licenses/MIT
 */

package matt.lyoko.client;

import matt.lyoko.container.ContainerSuperCalc;
import matt.lyoko.container.ContainerSuperCalcConsole;
import matt.lyoko.container.ContainerTowerConsole;
import matt.lyoko.entities.tileentity.TileEntitySuperCalc;
import matt.lyoko.entities.tileentity.TileEntitySuperCalcConsole;
import matt.lyoko.entities.tileentity.TileEntityTowerConsole;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
    // returns an instance of the Container you made earlier
    @Override
    public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.func_147438_o(x, y, z);

        if (tileEntity instanceof TileEntitySuperCalc)
            return new ContainerSuperCalc(player.inventory, (TileEntitySuperCalc) tileEntity);
        else if (tileEntity instanceof TileEntityTowerConsole)
            return new ContainerTowerConsole(player.inventory, (TileEntityTowerConsole) tileEntity);
        else if (tileEntity instanceof TileEntitySuperCalcConsole)
            return new ContainerSuperCalcConsole(player.inventory, (TileEntitySuperCalcConsole) tileEntity);

        return null;
    }

    // returns an instance of the Gui you made earlier
    @Override
    public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.func_147438_o(x, y, z);

        if (tileEntity instanceof TileEntitySuperCalc)
            return new GuiSuperCalc(player.inventory, (TileEntitySuperCalc) tileEntity);
        else if (tileEntity instanceof TileEntityTowerConsole)
            return new GuiTowerConsole(player.inventory, (TileEntityTowerConsole) tileEntity);
        else if (tileEntity instanceof TileEntitySuperCalcConsole)
            return new GuiSuperCalcConsole(player.inventory, (TileEntitySuperCalcConsole) tileEntity);

        return null;
    }
}