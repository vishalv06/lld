package designpatterns.creational.Singleton;

public class TestAppManager {
    public static void main(String[] args) {
        AppManager appManager1 = AppManager.getInstance();
        AppManager appManager2 = AppManager.getInstance();
        System.out.println(appManager1==appManager2);
    }
}
