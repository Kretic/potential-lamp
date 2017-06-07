package kretic.potentiallamp;

public class Reference {

    public static final String MOD_ID = "potentiallamp";
    public static final String MOD_NAME = "Potential Lamp";
    public static final String MOD_VERSION = "1.0";
    public static final String MOD_ACCEPTED_VERSION = "[1.11.2]";

    public static final String CLIENT_PROXY_CLASS = "kretic.potentiallamp.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "kretic.potentiallamp.proxy.ServerProxy";

    public static enum Items {
        LAMP("lamp", "itemlamp");

        private String unlocalizedName;
        private String registryName;
        Items(String unlocalizedName, String registryName) {
            this.unlocalizedName = unlocalizedName;
            this.registryName = registryName;
        }

        public String getRegistryName() {
            return registryName;
        }

        public String getUnlocalizedName() {
            return unlocalizedName;
        }
    }
}
