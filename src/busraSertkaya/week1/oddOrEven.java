package busraSertkaya.week1;

import java.util.Scanner;

public class oddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/

    public static void main(String[] args) {
        oddOrEven(30);
    }

    public static void oddOrEven(int number){
        if (number % 2 == 0){
            System.out.println(number + " is an even number");
        }else if ((number & 2) != 0){
            System.out.println(number + " is a odd number");
        }
    }

}
