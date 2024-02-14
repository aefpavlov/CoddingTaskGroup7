package fulati1.week3;

public class primeNumber {
    // Write a method that can check if a number is prime or not

    public static void main(String[] args) {
        primeOrNot(11);
    }


    public static void primeOrNot(int a) {

        if (a <= 0) {
            System.err.println("Invalid number");
            return;
        }

        for (int i = 2; i <= a; i++) {
            if (a % i == 0)  {
                System.out.println(a + " is not prime number");
            } else {
                System.out.println( a + " is prime number");
            }
            return;
        }


    }


}
