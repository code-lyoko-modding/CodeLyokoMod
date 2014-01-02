/*
 * Code Lyoko Mod for Minecraft v@VERSION Copyright 2013 Cortex Modders, Matthew
 * Warren, Jacob Rhoda, and other contributors. Released under the MIT license
 * http://opensource.org/licenses/MIT
 */

package matt.lyoko.blocks;

import matt.lyoko.CodeLyoko;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class BlockLyoko extends Block
{
    public BlockLyoko()
    {
        super(Material.field_151573_f);
        // setCreativeTab
        this.func_149647_a(CodeLyoko.LyokoTabs);
        
        
        
        
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister)
    {
        int blockId = Block.func_149682_b(this);
        
        if (blockId == ModBlocks.Grass.blockID)
            this.blockIcon = par1IconRegister.registerIcon("lyoko:lyokograss");
        if (blockId == ModBlocks.Stone.blockID)
            this.blockIcon = par1IconRegister.registerIcon("lyoko:lyokostone");
        if (blockId == ModBlocks.Sand.blockID)
            this.blockIcon = par1IconRegister.registerIcon("lyoko:lyokosand");
        if (blockId == ModBlocks.Log.blockID)
            this.blockIcon = par1IconRegister.registerIcon("lyoko:lyokolog");
        if (blockId == ModBlocks.Carthage.blockID)
            this.blockIcon = par1IconRegister.registerIcon("lyoko:carthage");
        if (blockId == ModBlocks.QuantumOre.blockID)
            this.blockIcon = par1IconRegister.registerIcon("lyoko:quantumore" + (!CodeLyoko.useHDTextures ? "_16_16" : ""));
        if (blockId == ModBlocks.LeadOre.blockID)
            this.blockIcon = par1IconRegister.registerIcon("lyoko:lead");
        if (blockId == ModBlocks.UraniumOre.blockID)
            this.blockIcon = par1IconRegister.registerIcon("lyoko:uranium");
    }

    @Override
    public void onEntityWalking(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        if (this.blockID == ModBlocks.LeadOre.blockID || this.blockID == ModBlocks.UraniumOre.blockID)
        {
            if (par5Entity instanceof EntityLiving)
            {
                if (((EntityLiving) par5Entity).isPotionActive(Potion.regeneration.getId()))
                    ((EntityLiving) par5Entity).removePotionEffect(Potion.regeneration.getId());
                ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.poison.getId(), 500, 2));
                if (par5Entity instanceof EntityPlayer)
                    ((EntityPlayer) par5Entity).addPotionEffect(new PotionEffect(Potion.hunger.getId(), 500, 2));
            }
        }

        else if (this.blockID == ModBlocks.QuantumOre.blockID)
            if (par5Entity instanceof EntityLiving)
            {
                ((EntityLiving) par5Entity).clearActivePotions();
                ((EntityLiving) par5Entity).addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 500, 2));
            }
    }
}