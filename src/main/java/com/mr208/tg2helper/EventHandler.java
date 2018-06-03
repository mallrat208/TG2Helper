package com.mr208.tg2helper;

import net.minecraft.entity.item.EntityItem;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import techguns.api.npc.INPCTechgunsShooter;

@EventBusSubscriber
public class EventHandler
{
	
	@SubscribeEvent
	public static void onLivingDrop(LivingDropsEvent event)
	{
		if(event.getEntity() instanceof INPCTechgunsShooter)
		{
			for(EntityItem entityItem : event.getDrops())
			{
				if(entityItem.getItem().hasTagCompound() && entityItem.getItem().getTagCompound().hasNoTags())
				{
					entityItem.getItem().setTagCompound(null);
				}
			}
		}
	}
}
