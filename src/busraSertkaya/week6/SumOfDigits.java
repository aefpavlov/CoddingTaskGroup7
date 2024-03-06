package busraSertkaya.week6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */


    public static void main(String[] args) {

        System.out.println(sumOfDigits("12 java 5 apple 3"));
    }

    public static int sumOfDigits(String str){

        String [] arr = str.split(" ");

        int sum =0;

        for (String each : arr) {
            if (Character.isDigit(each.charAt(0))){
                sum+=Integer.parseInt(each);
            }
        }
        return sum;


    }



}
