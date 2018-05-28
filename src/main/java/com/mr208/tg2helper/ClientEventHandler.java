package com.mr208.tg2helper;

import micdoodle8.mods.galacticraft.api.client.tabs.InventoryTabVanilla;
import micdoodle8.mods.galacticraft.api.client.tabs.TabRegistry;
import net.minecraft.client.gui.inventory.GuiInventory;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import techguns.gui.player.TGGuiTabButton;
import techguns.gui.player.TGPlayerInventoryGui;

@EventBusSubscriber(Side.CLIENT)
public class ClientEventHandler
{
	
	@SubscribeEvent(priority = EventPriority.LOW)
	public static void onGUIInitPost(GuiScreenEvent.InitGuiEvent.Post event)
	{
		if(event.getGui() instanceof GuiInventory || event.getGui() instanceof TGPlayerInventoryGui)
		{
			event.getButtonList().removeIf((button)->button instanceof TGGuiTabButton);
		}
		
		if(event.getGui() instanceof TGPlayerInventoryGui)
		{
			
				int guiLeft = (event.getGui().width - 176) / 2;
				int guiTop = (event.getGui().height - 166) / 2;
				guiLeft += TabRegistry.getPotionOffset();
				TabRegistry.updateTabValues(guiLeft, guiTop, InventoryTabTechguns.class);
				TabRegistry.addTabsToList(event.getButtonList());
		}
	}
}
