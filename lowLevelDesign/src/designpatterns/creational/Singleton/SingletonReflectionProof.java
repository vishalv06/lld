package designpatterns.creational.Singleton;

public class SingletonReflectionProof {

    private static SingletonReflectionProof instance;

    private static boolean isInstanceCreated = false;
    private SingletonReflectionProof(){
        if (isInstanceCreated) {
            throw new RuntimeException("Singleton already created");
        }
        isInstanceCreated = true;
    }

    public static SingletonReflectionProof getInstance() {
        if (instance == null) {
            synchronized (SingletonReflectionProof.class) {
                if (instance == null) {
                    instance = new SingletonReflectionProof();
                }
            }
        }
        return instance;
    }
}
