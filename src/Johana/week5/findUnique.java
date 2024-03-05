package Johana.week5;



public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {

        String str = "AAABBBCCCDEF";

        String unique = ""; // declare a variable with an empty string, that will allow me to contain
        //the final result there.

        // I will get each of the characters of the string given and create conditions to check if the
        //characters are unique or not, by using for loop
        for (int i = 0; i < str.length(); i++) {//the initialization will start from zero, because index numbers start from zero
            //for the condition I will give the last index of the string
            //for the iterator I can give the increment of i

            //str.charAt(i);//passing "i" as argument to the chartAt method of the String
            // to get each of the characters

            char ch = str.charAt(i); // I will assign to the char variable "ch"

            //create a condition to know if the character is unique or not/it will be repeated for every single character

            if (str.indexOf(ch) == str.lastIndexOf(ch)){
                ; //if the index of this character is equal to the last index of this character
            //meaning that the first time the character appear in the string is also the last time it has appeared.

            unique += ch; //the character will be added and concatenated to unique

        }
    }

            System.out.println(unique); //print out the result








        }


    }





