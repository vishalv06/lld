package designpatterns.creational.Singleton;

public class AnalyticsTracker {

    private static AnalyticsTracker instance;
    private AnalyticsTracker(){
        System.out.println("Tracker initialized");
    }

    public static AnalyticsTracker getInstance() {
        if (instance == null) {
            synchronized (AnalyticsTracker.class) {
                if (instance == null) {
                    instance = new AnalyticsTracker();
                }
            }
        }
        return instance;
    }

    public void trackEvents(String eventName) {
        System.out.println("Tracking event: " + eventName);
    }


}
