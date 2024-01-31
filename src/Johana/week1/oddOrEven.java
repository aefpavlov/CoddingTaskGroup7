package Johana.week1;

import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args) {

        int number= 6;

        boolean isEven =  number % 2 == 0;
        boolean isOdd = !isEven;
        System.out.println(number + " is an even number: " + isEven);
        System.out.println(number + " is an odd number: " + isOdd);


    }

}

   /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/


