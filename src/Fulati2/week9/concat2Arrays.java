package Fulati2.week9;

import java.util.Arrays;

public class concat2Arrays {
    //Write a return method that can concatenate two arrays
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] newArr = concat2Array(arr1, arr2);

        System.out.println(Arrays.toString(newArr));
    }

    public static int[] concat2Array(int[] arr1, int[] arr2){
        int[] newArr = new int[arr1.length + arr2.length];

        // Copy elements from arr1
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        // Copy elements from arr2
        for (int i = 0; i < arr2.length; i++) {
            newArr[arr1.length + i] = arr2[i];
        }

        return newArr;
    }


}