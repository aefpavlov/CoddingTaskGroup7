package Fulati2.week3;

public class primeNumber {
     // Write a method that can check if a number is prime or not
     public static void main(String[] args) {
          isPrime(1);
          isPrime(2);
          isPrime(3);
          isPrime(4);
          isPrime(5);
          isPrime(6);
          isPrime(7);
          isPrime(8);
          isPrime(9);
          isPrime(10);
          isPrime(11);
     }

     public static void isPrime(int num) {
          if (num <= 1){
               System.out.println(num + " is NOT PRIME");
               return;
          }

          for (int i = 2; i <= Math.sqrt(num); i++) {
               if(num % i == 0){
                    System.out.println(num + " is NOT PRIME");
                    return;
               }
          }
          System.out.println(num + " is PRIME");
          return;
     }
}

