package matt.lyoko;

import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.src.*;
import java.util.Random;

public class BlockLyokoIce extends BlockBreakable
{
	public BlockLyokoIce(int par1, int par2, Material material, boolean flag)
	{
		super(par1, par2, material, flag);
		this.setCreativeTab(CreativeTabs.tabMisc);
		this.setBlockUnbreakable();
		
	}
	
	public int getRenderBlockPass()
    {
        return 1;
    }
	
	public int quantityDropped(Random par1Random)
	{
		return 1;
	}
	
	public String getTextureFile()
    {
            return "/matt/lyoko/terrain/terrain.png";
    }
}