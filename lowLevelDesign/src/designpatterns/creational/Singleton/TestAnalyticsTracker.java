package designpatterns.creational.Singleton;

public class TestAnalyticsTracker {
    public static void main(String[] args) {
        AnalyticsTracker analyticsTracker1 = AnalyticsTracker.getInstance();
        AnalyticsTracker analyticsTracker2 = AnalyticsTracker.getInstance();
        analyticsTracker1.trackEvents("LOGIN");
        analyticsTracker2.trackEvents("SIGNUP");
        System.out.println(analyticsTracker1 == analyticsTracker2);

    }
}
