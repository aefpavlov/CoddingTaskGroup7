package Johana.week6;

public class PasswordValidation {


    private String username, password; //I will create a private String and assign two instance variables



    public PasswordValidation(String username, String password) {//declare a constructor
        setUsername(username);
        setPassword(password);
    }


//declare getters and setters
    public String getUsername() {//it allows us to read the data
        return username;
    }

    public void setUsername(String username) {//it allows us to write
        this.username = username;// we use this. to distinguish the instance variable from the method
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(!isStrongPassword(password)){//we will use if condition
            System.err.println("Password \""+password+"\" is not a strong password");//it will show us that the input provided is wrong

            System.exit(1);//indicates that there was some issue which cause the program to exit
        }
        this.password = password;
    }


    public boolean isStrongPassword(String password){
        boolean p1 = password.length() >= 6 && !password.contains(" "); // it will check if the password length has 6 or more characters and does not contain space
        boolean pUppercase = false;  // contains upper case letter
        boolean pLowercase = false;  // contains lower case letter
        boolean pDigit = false;  // contains digit
        boolean pSpecial = false; // contains special character

        for (char each : password.toCharArray()) {//I will use .toCharArray method to iterate over the array using the for-each loop


            if(Character.isUpperCase(each)){
                pUppercase = true;
            }else if(Character.isLowerCase(each)){
                pLowercase = true;
            }else if(Character.isDigit(each)){
                pDigit = true;
            }else{
                pSpecial = true;
            }

        }

        return  p1 && pUppercase && pLowercase && pDigit && pSpecial;
    }






    /*String -- Password Validation Task
    1. Write a return method that can verify if a password is valid or not.
    requirements:
    1. Password MUST be at least have 6 characters and should not contain space
    2. PassWord should at least contain one upper case letter
    3. PassWord should at least contain one lowercase letter
    4. Password should at least contain one special characters
    5. Password should at least contain a digit
    if all requirements above are met, the method returns true, otherwise returns  false*/



}
