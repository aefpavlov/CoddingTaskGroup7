package Fulati2.week8;


import java.util.Arrays;
import java.util.Random;

public class NuniqueIntegersThatSumUpTo0 {
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/

    public static void main(String[] args) {
        int N = 4;
        int[] arr = sumToZero(N);

        // Print the array
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sumToZero(int n){
        if (n <= 1 || n >= 100) {
            System.out.println("n must be between 1 and 100");
            return null;
        }

        int[] result = new int[n];
        Random rand = new Random();

        for (int i = 0; i < n - 1; i++) {
            int num = rand.nextInt(200) - 99;
            result[i] = num;
        }

        int sum = Arrays.stream(result).sum();
        result[n-1] = -sum;

        return result;
    }

}