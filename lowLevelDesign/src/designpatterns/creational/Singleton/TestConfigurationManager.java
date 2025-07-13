package designpatterns.creational.Singleton;

public class TestConfigurationManager {

    public static void main(String[] args) {
        ConfigurationManager configurationManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();
        System.out.println(configurationManager1.getConfigValue("appName"));
        System.out.println(configurationManager1.getConfigValue("version"));
        System.out.println(configurationManager1==configurationManager2);
    }
}
