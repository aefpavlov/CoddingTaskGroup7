package busraSertkaya.week6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PasswordValidation {
    /*String -- Password Validation Task
    1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false*/

    public static void main(String[] args) {

        System.out.println(passwordValidation("Busra123+"));
    }

    public static boolean passwordValidation(String password) {

        if (password.length()< 6 || password.contains(" ")){
            return false;
        }

        boolean hasUpperCase = false, hasLowerCase = false, hasSpecialChar = false, hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
            } else if (!Character.isLetterOrDigit(ch)) {
                hasSpecialChar = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }else {
                return false;
            }
        }
        return hasUpperCase && hasLowerCase && hasSpecialChar && hasUpperCase && hasDigit;

    }


}
