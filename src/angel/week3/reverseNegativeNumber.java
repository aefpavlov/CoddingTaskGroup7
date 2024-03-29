package angel.week3;

import java.util.Scanner;

public class reverseNegativeNumber {
    /*Write a return method that can reverse digits of a negative number and return it as int
    input: -35  output: -53 */

    public static void main(String[] args)
    {
        System.out.println("Enter whole negative number: ");
        Scanner input = new Scanner(System.in);
        int entry = input.nextInt();

        if (! (entry<0)){ // sanity check forces to enter negative number
            while (entry>0) { // loop will end when number is negative
                System.out.println("Invalid entry! Please enter negative number: ");
                entry = input.nextInt();
            }
        }

        System.out.println("You have entered : " + entry+" reversed number is "+reverseDigit(entry));

        System.out.println( digitReversed(entry));// to test second method


        input.close();
    }
    public static String reverseDigit(int number){ // will return number as String - ready to print

        String numToString = ""+number; //  number to String

        StringBuilder reversedString= new StringBuilder(); // to contain reversed number as String

        reversedString.append("-");// adding the negative sign

        for (int i=numToString.length()-1; i>0;i--){ // reversing number , just the digits.

            reversedString.append(numToString.charAt(i))  ;
        }

        return reversedString.toString() ;
    }

    public static int digitReversed(int number){ // same solution no loop
        String num = ""+number; //  number to String

        String numNoSign = num.substring(1);// number without negative sign

        StringBuilder result = new StringBuilder();

        result.append(numNoSign).reverse(); // first adds the number , them reverse it

        result.insert(0,"-"); // inserts negative sign at beginning

        return Integer.parseInt(result.toString()); // returns Int




    }

}

