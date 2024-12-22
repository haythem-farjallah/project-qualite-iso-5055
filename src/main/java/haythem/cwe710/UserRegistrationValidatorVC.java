package haythem.cwe710;

public class UserRegistrationValidatorVC {
    public ValidationResult validateRegistrationForm(UserForm form) {
        ValidationResult result = new ValidationResult();

        if (form == null) {
            result.addError("Le formulaire est nul.");
            return result;
        }

        validateUsername(form.getUsername(), result);
        validatePassword(form.getPassword(), form.getConfirmPassword(), result);
        validateEmail(form.getEmail(), result);
        validateAge(form.getAge(), result);

        return result;
    }

    private void validateUsername(String username, ValidationResult result) {
        if (username == null || username.isEmpty()) {
            result.addError("Le nom d'utilisateur est requis.");
        }
    }

    private void validatePassword(String password, String confirmPassword, ValidationResult result) {
        if (password == null || password.isEmpty()) {
            result.addError("Le mot de passe est requis.");
            return;
        }

        if (!password.equals(confirmPassword)) {
            result.addError("Les mots de passe ne correspondent pas.");
        }
    }

    private void validateEmail(String email, ValidationResult result) {
        if (email == null || email.isEmpty()) {
            result.addError("L'e-mail est requis.");
            return;
        }

        if (!isValidEmail(email)) {
            result.addError("Adresse e-mail invalide.");
        }
    }

    private void validateAge(int age, ValidationResult result) {
        if (age < 18) {
            result.addError("L'utilisateur doit avoir au moins 18 ans.");
        }
    }

    private boolean isValidEmail(String email) {
        // Validation simplifiée de l'e-mail
        return email.contains("@");
    }
}
