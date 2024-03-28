package Fulati2.week7;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] arr){
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]){
                min = arr[i];
            }
        }

        return min;
    }


}

