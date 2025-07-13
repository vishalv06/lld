package designpatterns.creational.Singleton;

public class Test {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getObj();
        Singleton s2 = Singleton.getObj();
        System.out.println(s1==s2);
    }
}
