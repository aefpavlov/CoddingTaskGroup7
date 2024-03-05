package Fulati2.week6;

import java.lang.reflect.Array;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */


    public static void main(String[] args) {
        int[] arr = {1, 99, 12, 23, 32, 44, 57, 6, 100};

        System.out.println(findMax(arr));
    }

    public static int findMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

}
