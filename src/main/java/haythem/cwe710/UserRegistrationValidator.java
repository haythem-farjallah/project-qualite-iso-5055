package haythem.cwe710;

public class UserRegistrationValidator {
    public boolean validateRegistrationForm(UserForm form) {
        if (form != null) {
            if (form.getUsername() != null && !form.getUsername().isEmpty()) {
                if (form.getPassword() != null && !form.getPassword().isEmpty()) {
                    if (form.getEmail() != null && !form.getEmail().isEmpty()) {
                        if (form.getAge() >= 18) {
                            if (form.getPassword().equals(form.getConfirmPassword())) {
                                if (isValidEmail(form.getEmail())) {
                                    // Tous les champs sont valides
                                    return true;
                                } else {
                                    System.out.println("Adresse e-mail invalide.");
                                }
                            } else {
                                System.out.println("Les mots de passe ne correspondent pas.");
                            }
                        } else {
                            System.out.println("L'utilisateur doit avoir au moins 18 ans.");
                        }
                    } else {
                        System.out.println("L'e-mail est requis.");
                    }
                } else {
                    System.out.println("Le mot de passe est requis.");
                }
            } else {
                System.out.println("Le nom d'utilisateur est requis.");
            }
        } else {
            System.out.println("Le formulaire est nul.");
        }
        return false;
    }

    private boolean isValidEmail(String email) {
        // Validation simplifiée de l'e-mail
        return email.contains("@");
    }

}
