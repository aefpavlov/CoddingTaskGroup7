package Johana.week6;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */

    public static void main(String[] args) {
        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        System.out.println(maxNum(arr));//PRINT the max number from the array
    }


    public static int maxNum(int[] arr) {//iterative approach


        int max = arr[0];//here I will create a local variable max and I will initialize it with the first element of the array.
        for (int each : arr) { // use for each loop to go through each number of the array(iterate over the array)

            if (each > max) {//if each number is more than max

                max = each;//I will replace max to be equal to the number


            }

        }
        return max;//once the iteration is over, it will return me the max number.

    }
}

