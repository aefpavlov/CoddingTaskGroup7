package Johana.week7;


import java.util.Arrays;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortDescending (10,20,7, 8, 90)));

    }

    public static int[] sortDescending(int... arr){//it will return me an int array/ convert the array into a variable argument ...

        for (int i = 0; i < arr.length; i++) {//loop that will start from 0 and will go until the end of the array, it will increment 1 at the time.

            for (int j = 0; j < arr.length-1; j++) {//it will help us to compare every 2 numbers

                if (arr[j] < arr[j + 1]){
                    int newV = arr[j];//create a new variable to hold my j element
                    arr[j] = arr[j +1];// swap the position
                    arr[j +1] = newV;
                }

            }

        }
        return arr;

    }


}



