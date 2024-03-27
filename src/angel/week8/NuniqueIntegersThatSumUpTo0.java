package angel.week8;


import java.util.Arrays;
import java.util.Scanner;

public class NuniqueIntegersThatSumUpTo0
{
    /*Write a function:
    that, given an integer N (1 < N < 100), returns an array containing N unique integers that sum up to 0.
    The function can return any such array. For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    The answer [1, -1,1,3] would be incorrect (because value 1 occurs twice).
    For N = 3 one of the possible answers is [-1,0,1]  (but there are many more correct answers).*/
    public static void main(String[] args)
    {
        System.out.println(" Enter integer N (1 < N < 100) returns an array containing N unique integers that sum up to 0.\n");
        Scanner scanner = new Scanner(System.in);
        int entry = scanner.nextInt();

        run(entry);
        scanner.close();
    }


    public static void optionA(int n)
    {//1;2;..n;0(if odd)-n...-2;-1
        if (n <= 0 || n > 100) {
            throw new IllegalArgumentException("Invalid input:Range 1 < N < 100 ");
        }
        if (n == 1) {
            System.out.println("0");
            return;
        }
        int[] arr = new int[n];

        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            arr[i] = i + 1;
            arr[j] = -1 * arr[i];
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void optionB(int n)
    { // a ,b ...(n-1),-(a+b+(n-1))
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i <= n - 2; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }
        arr[n - 1] = -1 * sum;
        System.out.println(Arrays.toString(arr));
    }

    public static void optionC(int n)
    { // n; n-2 ; 0 ; -(n-2) ;n
        int[] arr = new int[n];
        int temp = n;
        for (int i = 0, j = n - 1; i < n / 2; i++, j--) {
            arr[i] = temp - 1;
            arr[j] = -1 * arr[i];
            temp -= 2;

        }
        System.out.println(Arrays.toString(arr));

    }

    public static void run(int n)
    {
        if (n <= 2) {
            optionA(n);
        } else {
            optionA(n);
            optionB(n);
            optionC(n);
        }
    }


}