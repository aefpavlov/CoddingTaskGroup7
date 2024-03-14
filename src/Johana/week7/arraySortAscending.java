package Johana.week7;


import java.lang.reflect.Array;
import java.util.Arrays;

public class arraySortAscending {
    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        Ex: int[] arr = {10, 9, 8, 7};
        arr = Sort(arr); ==>{ 7, 8, 9, 10};*/

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortAscending (10, 9, 8, 7)));

    }

        public static int[] sortAscending(int... arr){//it will return me an int array as argument

            for (int i = 0; i < arr.length; i++) {//loop that will iterate

                for (int j = 0; j < arr.length-1; j++) {//nested loop

                    if (arr[j] > arr[j + 1]){//compare and swap variables
                        int newV = arr[j];//create a temporary variable
                        arr[j] = arr[j +1];
                        arr[j +1] = newV;
                    }
                    
                }
                
            }
            return arr;
            
        }


    }




