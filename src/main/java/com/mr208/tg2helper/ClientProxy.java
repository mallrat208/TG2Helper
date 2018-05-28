package com.mr208.tg2helper;

import micdoodle8.mods.galacticraft.api.client.tabs.InventoryTabVanilla;
import micdoodle8.mods.galacticraft.api.client.tabs.TabRegistry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class ClientProxy extends CommonProxy
{
	@Override
	public void onInit(FMLInitializationEvent event)
	{
		super.onInit(event);
		
		if (TabRegistry.getTabList().size() == 0)
		{
			MinecraftForge.EVENT_BUS.register(new TabRegistry());
			TabRegistry.registerTab(new InventoryTabVanilla());
		}
		
		TabRegistry.registerTab(new InventoryTabTechguns());
	}
}
