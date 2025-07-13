package designpatterns.creational.Singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {

    private static ConfigurationManager instance;

    private Map<String, String> config;
    private ConfigurationManager(){
        config = new HashMap<>();
        config.put("appName", "MyApp");
        config.put("version", "1.0");
    }

    public static ConfigurationManager getInstance() {
        if(instance==null) {
            synchronized (ConfigurationManager.class) {
                if (instance == null) {
                    instance = new ConfigurationManager();
                }
            }
        }
        return instance;
    }

    public String getConfigValue(String key) {
        return config.get(key);
    }


}
