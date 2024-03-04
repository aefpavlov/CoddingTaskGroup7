package angel.week6;

import java.util.Arrays;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */

    public static void main(String[] args)
    {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};

        System.out.println("ArrayMax(arr) = " + ArrayMax(arr));

        System.out.println("=".repeat(15));

        System.out.println("ArrayMax2(arr) = " + ArrayMax2(arr));

    }

    public static int ArrayMax ( int[] array){
        Arrays.sort(array);
        return array[array.length-1];
    }

    public static int ArrayMax2(int [] array){
        int result= array[0];
        for (int i=1; i<array.length;i++){
            if (array[i]>result){
                result=array[i];
            }
        }
        return result;
    }
}
