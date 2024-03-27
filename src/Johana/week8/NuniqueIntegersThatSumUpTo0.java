package Johana.week8;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array.
    For example,
    given N = 4,
    the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]
    (but there are many more correct answers).*/

    public static void main(String[] args) {

        int[] a = sumZero1(3);
        int[] b= sumZero(4);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

    }

        public static int[] sumZero(int N) {

            int[] result = new int[N];// Create a new array and initialize it to hold 'N' elements


                for (int i = 1; i < N; ++i) { // create a for loop to iterate over each element
                                        // Assign values from 1 to n-1 to the array elements
                    result[i] = i;
                }

            // Calculate the sum of elements from 1 to n-1
            // To ensure the sum of the entire array is zero,
            // assign the negative of this sum to the first element
            result[0] = -(N * (N - 1) / 2);

            // Return the array with elements that sum to zero
            return result;
        }

    public static int[] sumZero1(int N) {

        int[] result = new int[N];// Create a new array and initialize it to hold 'N' elements


        for (int i = 1; i < N; ++i) {
            result[i] = i;
        }

        result[0] = -(N * (N - 1) / 2);

        return result;



    }

    }



