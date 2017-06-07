package kretic.potentiallamp.items;

import kretic.potentiallamp.Reference;
import net.minecraft.item.Item;

/**
 * Created by Kretic on 07/06/2017.
 */
public class ItemLamp extends Item {

    public ItemLamp () {
        setUnlocalizedName(Reference.Items.LAMP.getUnlocalizedName());
        setRegistryName(Reference.Items.LAMP.getRegistryName());
    }

}
