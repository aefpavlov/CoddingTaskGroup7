package LeilaS.week7;


public class arrayFindMinimum {

    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("invalid info");
    }
        int min = arr[0]; // Assume the first element is the minimum
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int min = findMinimum(arr);
        System.out.println("Minimum number: " + min);


        // Write a method that can find the minimum  number from an int Array
        //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6


    }
}