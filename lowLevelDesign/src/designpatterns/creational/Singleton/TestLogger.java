package designpatterns.creational.Singleton;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger1 = Logger.log();
        Logger logger2 = Logger.log();
        logger1.log("Hello");
        logger2.log("Hello from another instance");
        System.out.println(logger1==logger2);

    }
}
