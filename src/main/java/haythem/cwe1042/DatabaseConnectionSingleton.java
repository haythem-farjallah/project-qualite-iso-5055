package haythem.cwe1042;

public class DatabaseConnectionSingleton {
    // Private static instance, only initialized once
    private static DatabaseConnectionSingleton instance;
    private Connection connection;

    // Private constructor to restrict instantiation
    private DatabaseConnectionSingleton() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "username", "password");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Public method to provide global access point
    public static DatabaseConnectionSingleton getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionSingleton();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }

    public void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
