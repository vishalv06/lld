package designpatterns.creational.Singleton;

public class AppManager {
    
    private static AppManager instance = null;

    private AppManager(){}

    public static AppManager getInstance() {
        if (instance == null) {
            synchronized (AppManager.class) {
                if (instance == null) {
                    instance = new AppManager();
                }
            }
        }
        return instance;
    }
}
