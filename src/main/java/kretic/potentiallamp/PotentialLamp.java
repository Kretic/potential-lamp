package kretic.potentiallamp;

import kretic.potentiallamp.init.ModItems;
import kretic.potentiallamp.proxy.IProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, acceptedMinecraftVersions = Reference.MOD_ACCEPTED_VERSION)
public class PotentialLamp {

    @Mod.Instance
    public static PotentialLamp instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModItems.init();
        ModItems.register();
    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init();
    }
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
