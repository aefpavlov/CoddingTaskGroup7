package Fulati2.week7;


import java.util.Arrays;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/

    public static void main(String[] args) {
        int[] arr = {10, 9, 8, 7};
        sortedArrDescending(arr);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] sortedArrDescending(int[] arr){
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] < arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }


}