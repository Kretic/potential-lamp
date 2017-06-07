package kretic.potentiallamp.proxy;

import kretic.potentiallamp.init.ModItems;

public class ClientProxy implements IProxy{
    @Override
    public void init() {
        ModItems.registerRenders();
    }
}
