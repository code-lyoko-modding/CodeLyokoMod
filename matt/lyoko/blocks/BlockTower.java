package matt.lyoko.blocks;

import java.util.Random;

import matt.lyoko.CodeLyoko;
import matt.lyoko.entities.tileentity.TileEntityTower;
import matt.lyoko.items.ModItems;
import matt.lyoko.particles.LyokoParticleEffects;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTower extends BlockContainer
{
    public BlockTower(int par1)
    {
        super(par1, Material.iron);
        this.setCreativeTab(CodeLyoko.LyokoTabs);
    }
    
    Icon inside;
    
    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("lyoko:tower");
        inside = par1IconRegister.registerIcon("lyoko:computer_0");
    }

    @Override
    public TileEntity createNewTileEntity(World var1) {
        return new TileEntityTower();
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public Icon getIcon(int side, int meta)
    {
    	if(side == 2 && meta == 0)
    	{
    		return inside;
    	}
    	else if(side == 3 && meta == 2)
    	{
    		return inside;
    	}
    	else if(side == 4 && meta == 3)
    	{
    		return inside;
    	}
    	else if(side == 5 && meta == 1)
    	{
    		return inside;
    	}
    	return this.blockIcon;
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
    {
		TileEntityTower tet = (TileEntityTower) world.getBlockTileEntity(x, y, z);

		if(!world.isRemote)
		{
			if(player.getHeldItem() != null && player.getHeldItem().getItem() == ModItems.LaserArrow)
			{
				tet.owner = "reset";
				world.markBlockForUpdate(x, y, z);
				return true;
			}
		}
		return false;
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random random)
    {
        TileEntityTower tet = (TileEntityTower) world.getBlockTileEntity(x, y, z);
        
        int meta = world.getBlockMetadata(x, y, z);
        
        Random worldRand = world.rand;
        // 1/16th of a block
        double pixelWidth = 0.0625D;

        for (int side = 0; side < 6; ++side)
        {
            double x2 = (double)((float)x + worldRand.nextFloat());
            double y2 = (double)((float)y + worldRand.nextFloat());
            double z2 = (double)((float)z + worldRand.nextFloat());

            if (side == 0 && !world.isBlockOpaqueCube(x, y + 1, z))
            {
                y2 = (double)(y + 1) + pixelWidth;
            }

            if (side == 1 && !world.isBlockOpaqueCube(x, y - 1, z))
            {
                y2 = (double)(y + 0) - pixelWidth;
            }

            if (side == 2 && !world.isBlockOpaqueCube(x, y, z + 1) && meta != 2)
            {
                z2 = (double)(z + 1) + pixelWidth;
            }

            if (side == 3 && !world.isBlockOpaqueCube(x, y, z - 1) && meta != 0)
            {
                z2 = (double)(z + 0) - pixelWidth;
            }

            if (side == 4 && !world.isBlockOpaqueCube(x + 1, y, z) && meta != 1)
            {
                x2 = (double)(x + 1) + pixelWidth;
            }

            if (side == 5 && !world.isBlockOpaqueCube(x - 1, y, z) && meta != 3)
            {
                x2 = (double)(x + 0) - pixelWidth;
            }

            if (x2 < (double)x || x2 > (double)(x + 1) || y2 < 0.0D || y2 > (double)(y + 1) || z2 < (double)z || z2 > (double)(z + 1))
            {
                if(tet.owner.equals("xana"))
                {
                    LyokoParticleEffects.spawnParticle("xana", x2, y2, z2, 0.0D, 0.0D, 0.0D);
                }
                else if(tet.owner.equals("lyoko"))
                {
                    LyokoParticleEffects.spawnParticle("lyoko", x2, y2, z2, 0.0D, 0.0D, 0.0D);
                }
                else if(tet.owner.equals("none"))
                {
                    LyokoParticleEffects.spawnParticle("deactivated", x2, y2, z2, 0.0D, 0.0D, 0.0D);
                }
                else if(tet.owner.equals("developer"))
                {
                    LyokoParticleEffects.spawnParticle("dev", x2, y2, z2, 0.0D, 0.0D, 0.0D);
                }
            }
        }
    }

    @Override
    public void onBlockPlacedBy(World par1World, int x, int y, int z, EntityLivingBase par5EntityLiving, ItemStack par6ItemStack)
    {
        int l = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            par1World.setBlockMetadataWithNotify(x, y, z, 0, 2);
        }

        if (l == 1)
        {
            par1World.setBlockMetadataWithNotify(x, y, z, 1, 2);
        }

        if (l == 2)
        {
            par1World.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 3)
        {
            par1World.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }
    }
}