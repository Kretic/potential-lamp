package kretic.potentiallamp.init;

import kretic.potentiallamp.Reference;
import kretic.potentiallamp.items.ItemLamp;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Kretic on 07/06/2017.
 */
public class ModItems {

    public static Item lamp;

    public static void init() {
        lamp = new ItemLamp();
    }

    public static void register() {
        GameRegistry.register(lamp);
    }

    public static void registerRenders() {
        registerRender(lamp);
    }

    private static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }
}
