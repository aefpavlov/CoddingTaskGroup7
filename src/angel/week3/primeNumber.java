package angel.week3;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter whole  number: ");
        int entry = input.nextInt();

        System.out.println("Number you have enter "+entry+" is "+(isPrime(entry)? " Prime":" Not Prime" + " number"));

        input.close();

    }

     // Write a method that can check if a number is prime or not
   public static boolean isPrime(int number)
    {
        for (int i = 2; i < number; i++)
            // loop to divide entered numbers to all numbers until it
        {
            if((number% i) == 0) // finds other number that can divide entry => no prime
            {
                // Not Prime
                return false; // no need to continue if can be divided by other
            }
        }

        return true;//  Prime
    }

}
