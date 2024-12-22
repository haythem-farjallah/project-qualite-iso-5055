package haythem.cwe564;

public class WrongV {
    String username = "admin"; // Entrée utilisateur
    String password = "' OR '1'='1"; // Entrée malveillante

    try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ma_base", "root", "password")) {
            Statement stmt = conn.createStatement();

            String sql = "SELECT * FROM utilisateurs WHERE nom_utilisateur = '" + username + "' AND mot_de_passe = '" + password + "'";
            System.out.println("Requête SQL : " + sql);

            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("Authentification réussie !");
            } else {
                System.out.println("Échec de l'authentification.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


}
