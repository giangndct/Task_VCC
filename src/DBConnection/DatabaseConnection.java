package DBConnection;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private String connection;

    private DatabaseConnection(){
        connection="Database Connection";
    }
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }

}
