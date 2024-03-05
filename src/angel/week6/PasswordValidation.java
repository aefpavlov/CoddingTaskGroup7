package angel.week6;

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

    public static void main(String[] args)
    {
        System.out.println("isPasswordValid(\"Ab123*8\") = " + isPasswordValid("Ab1-S"));// less than 6

    }

    public static boolean isPasswordValid ( String inpput){
        // MUST be at least have 6 characters and should not contain space
        boolean condition1 = inpput.length()>=6 && !inpput.contains(" "),
                condition2 =false,//should at least contain one upper case letter
                condition3= false, //should at least contain one lowercase letter
                condition4 =false, //should at least contain one special characters
                condition5= false ;//should at least contain a digit

        for(char each: inpput.toCharArray()){
            if (Character.isUpperCase(each))
            {
                condition2 = true;
            } else
                if(Character.isLowerCase(each))
                {
                    condition3 = true;
                } else
                    if (Character.isDigit(each)){
                        condition5 = true;
                    }
                    else {
                        condition4 = true;
                    }
        }
        return condition1 && condition2 && condition3 && condition4 && condition5;

    }



}
