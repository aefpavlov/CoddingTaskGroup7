package Fulati2.week6;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */

    public static void main(String[] args) {
        System.out.println(sumOfDigits("12java5apple3"));

        System.out.println(sumOfDigits("12 java 5 apple 3"));
    }

    public static int sumOfDigits(String str){
        int sum = 0;
        String numStore = "";

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
                numStore += str.charAt(i);
            } else {
                if (!numStore.isEmpty()) {
                    sum += Integer.parseInt(numStore);
                    numStore = "";
                }
            }
        }

        if (!numStore.isEmpty()) {
            sum += Integer.parseInt(numStore);
        }

        return sum;
    }



}
