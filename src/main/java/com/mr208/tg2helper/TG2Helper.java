package com.mr208.tg2helper;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = TG2Helper.MOD_ID, name = TG2Helper.MOD_NAME, version = TG2Helper.MOD_VERS, dependencies = "required-after:techguns@[2.0.1.1]")
public class TG2Helper
{
	public static final String MOD_NAME = "TG2 Helper";
	public static final String MOD_ID = "tg2helper";
	public static final String MOD_VERS = "1.0.1";
	
	@SidedProxy(serverSide = "com.mr208.tg2helper.CommonProxy", clientSide = "com.mr208.tg2helper.ClientProxy", modId = MOD_ID)
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void onInit(FMLInitializationEvent event)
	{
		proxy.onInit(event);
	}
	
}
