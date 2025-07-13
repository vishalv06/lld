package designpatterns.creational.Singleton;

public class Singleton {

    private static Singleton obj;

    private Singleton(){};

    public static Singleton getObj() {
        if (obj == null) {
            synchronized (Singleton.class) {
                if (obj == null) {
                    obj = new Singleton();
                }
            }
        }
        return obj;
    }
}

