package designpatterns.creational.Singleton;

public class DatabaseConnection {

    private static DatabaseConnection instance;
    private DatabaseConnection(){
        System.out.println("Connected to DB");
    }

    public static DatabaseConnection getInstance() {
        if (instance ==null) {
            synchronized (DatabaseConnection.class) {
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            }
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}
