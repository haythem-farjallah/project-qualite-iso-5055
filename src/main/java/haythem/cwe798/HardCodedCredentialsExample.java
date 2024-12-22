package haythem.cwe798;

public class HardCodedCredentialsExample {
    public static void main(String[] args) {
        // Identifiants codés en dur (vulnérable)
        String url = "jdbc:mysql://localhost:3306/qa_db";
        String username = "admin"; // Nom d'utilisateur codé en dur
        String password = "password123"; // Mot de passe codé en dur

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connexion réussie à la base de données !");
        } catch (SQLException e) {
            System.out.println("Erreur lors de la connexion : " + e.getMessage());
        }
    }
}
