package LeilaS.week3;

public class PrimeNumber {
    /*
`Write a method that can check if a number is prime or not`
     */
    // a number is prime when is divisible by 1 and itself
    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isPrime(8));//is not prime because is devisible by 2 and 4
    }
}
