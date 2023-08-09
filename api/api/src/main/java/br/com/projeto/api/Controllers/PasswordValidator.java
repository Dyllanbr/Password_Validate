package br.com.projeto.api.Controllers;

public class PasswordValidator {

    public static boolean isValid(String password) {
        // Verifica se a senha possui nove ou mais caracteres
        if (password.length() < 9) {
            return false;
        }

        // Verifica se a senha contém espaços em branco
        if (password.contains(" ")) {
            return false;
        }

        // Verifica se a senha possui ao menos 1 número
        boolean hasNumber = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }
        if (!hasNumber) {
            return false;
        }

        // Verifica se a senha possui ao menos 1 letra minúscula
        boolean hasLowerCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
                break;
            }
        }
        if (!hasLowerCase) {
            return false;
        }

        // Verifica se a senha possui ao menos 1 letra maiúscula
        boolean hasUpperCase = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            return false;
        }

        // Verifica se a senha possui ao menos 1 caractere especial
        String specialChars = "!@#$%^&*()-+";
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (specialChars.indexOf(c) != -1) {
                hasSpecialChar = true;
                break;
            }
        }
        if (!hasSpecialChar) {
            return false;
        }

        // Verifica se a senha não possui caracteres repetidos
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (password.lastIndexOf(c) != i) {
                return false;
            }
        }

        // Se todas as verificações passarem, a senha é válida
        return true;
    }

    @Override
    public String toString() {
        return "PasswordValidator []";
    }
}
