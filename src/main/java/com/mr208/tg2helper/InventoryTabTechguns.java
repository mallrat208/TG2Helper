package com.mr208.tg2helper;

import micdoodle8.mods.galacticraft.api.client.tabs.AbstractTab;
import techguns.TGItems;
import techguns.TGPackets;
import techguns.packets.PacketOpenPlayerGUI;

public class InventoryTabTechguns extends AbstractTab
{
	public InventoryTabTechguns()
	{
		super(0, 0, 0, TGItems.PISTOL_ROUNDS.copy());
	}
	
	@Override
	public void onTabClicked()
	{
		TGPackets.network.sendToServer(new PacketOpenPlayerGUI());
	}
	
	@Override
	public boolean shouldAddToList()
	{
		return true;
	}
}
