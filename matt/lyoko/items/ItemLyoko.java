package matt.lyoko.items;

import java.util.List;

import matt.lyoko.CodeLyoko;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemLyoko extends Item
{
	public ItemLyoko(int par1) {
		super(par1);
		this.setCreativeTab(CodeLyoko.LyokoTabs);
		this.setNoRepair();
	}
	
	@Override
	public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean B)
	{
		if(stack.getItem() == CodeLyoko.LaserArrow)
		{
			list.add("This is the mod's equivalent of an infinite battery.");
			list.add("Use this as a fuel cell in the Super Computer.");
		}
	}
	
	@Override
	public void updateIcons(IconRegister iconRegister)
	{
		if(this.itemID == CodeLyoko.LaserArrow.itemID)
	         iconIndex = iconRegister.registerIcon("lyoko:laserarrow");
		if(this.itemID == CodeLyoko.LyokoIngot.itemID)
	         iconIndex = iconRegister.registerIcon("lyoko:lyokoingot");
		if(this.itemID == CodeLyoko.LyokoLead.itemID)
	         iconIndex = iconRegister.registerIcon("lyoko:leadingot");
		if(this.itemID == CodeLyoko.LyokoCell.itemID)
	         iconIndex = iconRegister.registerIcon("lyoko:emptycell");
		if(this.itemID == CodeLyoko.LyokoDepletedLeadCell.itemID)
	         iconIndex = iconRegister.registerIcon("lyoko:depletedleadcell");
		if(this.itemID == CodeLyoko.Uranium.itemID)
	         iconIndex = iconRegister.registerIcon("lyoko:uraniumingot");
		if(this.itemID == CodeLyoko.LyokoDepletedUraniumCell.itemID)
	         iconIndex = iconRegister.registerIcon("lyoko:depleteduraniumcell");
	}
	
	public void onUpdate(ItemStack stack, World world, Entity ent, int par4, boolean par5)
	{
		
		if(stack.getItem() == CodeLyoko.LyokoLead || stack.getItem() == CodeLyoko.Uranium)
		{
			if(ent instanceof EntityPlayer)
			{
				if(!((EntityPlayer)ent).capabilities.isCreativeMode)
				{
					((EntityPlayer)ent).addPotionEffect((new PotionEffect(Potion.hunger.getId(), 100, 0)));
					((EntityPlayer)ent).addPotionEffect((new PotionEffect(Potion.poison.getId(), 100, 0)));
				}
			}
			else
			{
				((EntityPlayer)ent).addPotionEffect((new PotionEffect(Potion.hunger.getId(), 100, 0)));
				((EntityPlayer)ent).addPotionEffect((new PotionEffect(Potion.poison.getId(), 100, 0)));
			}
		}
	}
}