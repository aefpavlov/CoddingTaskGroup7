package Fulati2.week6;

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
        System.out.println(passwordValidate("Aa1*dd"));
        System.out.println(passwordValidate("Aa1ddddd"));
        System.out.println(passwordValidate("Aa1 ddddd"));

    }

    public static boolean passwordValidate(String password){
        boolean sixCharNonSpace = (password.length() >= 6 && !(password.contains(" ")));
        boolean containsUpperCase = false;
        boolean containsLowerCase = false;
        boolean containsSpecialChar = false;
        boolean containsDigit = false;

        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))){
                containsUpperCase = true;
            }
            if (Character.isLowerCase(password.charAt(i))){
                containsLowerCase = true;
            }
            if (!Character.isLetterOrDigit(password.charAt(i))){
                containsSpecialChar = true;
            }
            if (Character.isDigit(password.charAt(i))){
                containsDigit = true;
            }
        }

        return (sixCharNonSpace && containsUpperCase && containsLowerCase && containsSpecialChar && containsDigit);

    }

}
