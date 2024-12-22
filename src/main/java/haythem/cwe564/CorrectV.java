package haythem.cwe564;

public class CorrectV {
    String username = "admin"; // Entrée utilisateur
    String password = "password123"; // Entrée utilisateur

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ma_base", "root", "password")) {

        // Utilisation d'une requête préparée
        String sql = "SELECT * FROM utilisateurs WHERE nom_utilisateur = ? AND mot_de_passe = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);

        // Remplissage des paramètres de la requête
        pstmt.setString(1, username);
        pstmt.setString(2, password);

        // Exécution de la requête
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            System.out.println("Authentification réussie !");
        } else {
            System.out.println("Échec de l'authentification.");
        }

    } catch (Exception e) {
        e.printStackTrace();
    }
}
