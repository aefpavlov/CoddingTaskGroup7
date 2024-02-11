package Johana.week3;

import java.util.Scanner;

public class primeNumber {
     // Write a method that can check if a number is prime or not


// prime number is a number that is greater than 1 and divided by 1 or itself only.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is prime or not: ");
        int number= sc.nextInt();
        if(isPrime(number)) {
            System.out.println(number + " is prime number");
        }
        else{
            System.out.println(number + " is a non-prime number");
        }
    }

    public static boolean isPrime(int n){

        if(n <= 1){
            return false;
        }

        for(int i = 2; i < n; i++){

            if(n % i == 0){
                return false;
            }

        }

        return true;
    }

}
