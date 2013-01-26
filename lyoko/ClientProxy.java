package matt.lyoko;

import net.minecraftforge.client.MinecraftForgeClient;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.Mod.Instance;
import net.minecraft.src.*;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRenderInformation() 
	{  
		MinecraftForgeClient.preloadTexture("/matt/lyoko/gui/items.png");
		MinecraftForgeClient.preloadTexture("/matt/lyoko/terrain/terrain.png");
		MinecraftForgeClient.preloadTexture("/matt/lyoko/terrain/SuperCalculator.png");
		
		RenderingRegistry.addNewArmourRendererPrefix("/matt/lyoko/armor/aelita_1");
		RenderingRegistry.addNewArmourRendererPrefix("/matt/lyoko/armor/aelita_2");
		RenderingRegistry.addNewArmourRendererPrefix("/matt/lyoko/armor/odd_1");
		RenderingRegistry.addNewArmourRendererPrefix("/matt/lyoko/armor/odd_2");
		RenderingRegistry.addNewArmourRendererPrefix("/matt/lyoko/armor/ulrich_1");
		RenderingRegistry.addNewArmourRendererPrefix("/matt/lyoko/armor/ulrich_2");
		RenderingRegistry.addNewArmourRendererPrefix("/matt/lyoko/armor/yumi_1");
		RenderingRegistry.addNewArmourRendererPrefix("/matt/lyoko/armor/yumi_2");
		RenderingRegistry.addNewArmourRendererPrefix("/matt/lyoko/armor/william_1");
		RenderingRegistry.addNewArmourRendererPrefix("/matt/lyoko/armor/william_2");
		
		//RenderingRegistry.instance().registerEntityRenderingHandler(EntityTest.class, new RenderCatTest());
		RenderingRegistry.registerEntityRenderingHandler(EntityFan.class, new RenderFan());
		RenderingRegistry.registerEntityRenderingHandler(EntityEnergyField.class, new RenderEnergyField());
		RenderingRegistry.registerEntityRenderingHandler(EntityLaserArrow.class, new RenderLaserArrow());
		RenderingRegistry.registerEntityRenderingHandler(EntityBlok.class, new RenderBlok(new ModelBlok(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMegaTank.class, new RenderTank(new ModelTank(), 0.5F));
		/*
		RenderingRegistry.registerEntityRenderingHandler(EntityHornet.class, new RenderHornet(new ModelHornet(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKankrelat.class, new RenderKankrelat(new ModelKankrelat(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityKrab.class, new RenderKrab(new ModelKrab(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityLyokoCreeper.class, new RenderLyokoCreeper(new ModelLyokoCreeper(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityManta.class, new RenderManta(new ModelManta(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityTarantula.class, new RenderTarantula(new ModelTarantula(), 0.5F));
		*/
		RenderingRegistry.registerEntityRenderingHandler(EntityLaser.class, new RenderLaser(new ModelLaser(), 0.5F));
	}

	//override any other methods that need to be handled differently client side.

}