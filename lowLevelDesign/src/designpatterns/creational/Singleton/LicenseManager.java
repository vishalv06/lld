package designpatterns.creational.Singleton;

import java.util.HashSet;
import java.util.Set;

public class LicenseManager {

    private static LicenseManager instance;

    private Set<String> enabledFeatures;

    private LicenseManager(){
        System.out.println("License loaded");
        enabledFeatures = new HashSet<>();
        enabledFeatures.add("BASIC_REPORT");
        enabledFeatures.add("EXPORT_CSV");
        enabledFeatures.add("ANALYTICS");
    }

    public static LicenseManager getInstance() {
        if (instance == null) {
            synchronized (LicenseManager.class) {
                if (instance == null) {
                    instance = new LicenseManager();
                }
            }
        }
        return instance;
    }

    public Boolean isFeatureEnabled(String featureName) {
        return enabledFeatures.contains(featureName);
    }


}
