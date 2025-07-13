package designpatterns.creational.Singleton;

import javax.security.auth.login.LoginException;

public class Logger {

    private static Logger instance;

    private Logger(){}

    public static Logger log() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
