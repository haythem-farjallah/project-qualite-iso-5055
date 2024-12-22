package haythem.cwe798;

public class SecureCredentialsFromFile {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try (FileInputStream input = new FileInputStream("config.properties")) {
            // Charger les propriétés du fichier
            properties.load(input);

            String url = properties.getProperty("db.url");
            String username = properties.getProperty("db.user");
            String password = properties.getProperty("db.password");

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                System.out.println("Connexion réussie à la base de données !");
            } catch (SQLException e) {
                System.out.println("Erreur lors de la connexion : " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Erreur lors du chargement du fichier de configuration : " + e.getMessage());
        }
    }
}
