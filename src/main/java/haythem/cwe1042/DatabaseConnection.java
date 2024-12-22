package haythem.cwe1042;

public class DatabaseConnection {
    // Static member data element declared outside a Singleton class
    public static Connection connection;

    public static void connect() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void disconnect() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

