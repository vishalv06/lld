package designpatterns.creational.Singleton;

import javax.xml.crypto.Data;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection1 = DatabaseConnection.getInstance();
        DatabaseConnection databaseConnection2 = DatabaseConnection.getInstance();

        databaseConnection1.query("SELECT * FROM users");
        databaseConnection2.query("SELECT * FROM orders");
        System.out.println(databaseConnection1==databaseConnection2);

    }
}
