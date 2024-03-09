package angel.week7;


import java.util.Arrays;
import java.util.Random;

public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
    public static void main(String[] args)
    {
       // int[] arr = {99, 12, 23, 32, 44, 57, 6};

        // c
        int [] arr = randomArrayGeneratorInt(5,5,500);

        System.out.println("Generated Array: "+ Arrays.toString(arr));
        System.out.println("*".repeat(15));

        System.out.println("minArray(arr) = " + minArray(arr));

        System.out.println("minArray2(arr) = " + minArray2(arr));

        System.out.println("minArray3(arr) = " + minArray3(arr));

    }

    // by comparing elements of the array
    public static int minArray( int[] input){
        int result=input[0];
        for (int i=1;i<input.length;i++){
            if(input[i]<result){ // if we find smaller number than swap it
                result=input[i];
            }
        }
        return result;
    }

    // using accedingSort from next task
    public static int minArray2(int[] input){
        // call the method from next task it will return us sorted array
        // sorted in ascending order => return smallest element ( first ) at position 0
       return arraySortAscending.ascendingSort(input)[0];
    }

    //using descending from last task
        // same logic but we return last element
    public static int minArray3(int[] input){

        return arraySortDescending.descendSort(input)[input.length-1];
    }

    /**
     * Custom Method to generate int[] Array by given size
     * and elements are in given range
     * @param size Number of elements in the array
     * @param minRange minimum int number for range
     * @param maxRange maximum int number for range
     * @return int [size] {min ~ max }
     */
    public static int[] randomArrayGeneratorInt(int size, int minRange, int maxRange) {
        if (size <= 0 || minRange > maxRange) {//sanity check
            System.out.println("*".repeat(15));
            System.out.println("Not valid range ");
            System.out.println("*".repeat(15));
            System.exit(-1);
        }

        int[] randomArray = new int[size];//size passed as parameter in the method
        Random random = new Random();


        for (int i = 0; i < size; i++) {
            // it will NOT work with for each loop
            randomArray[i] = random.nextInt(maxRange - minRange + 1) + minRange;
        }


        return randomArray;
    }

}