package busraSertkaya.week6;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */

    public static void main(String[] args) {
        int[] arr = {300,99, 12, 23, 32, 44, 57, 6, 500};
        findMax(arr);


    }


    public static void findMax(int...arr){
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }



}
