package Johana.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */

    public static void main(String[] args) {//it will help to execute the program

        String str = "12 java 5 apple 3";
        //str=str.replaceAll("[\\D]+"," ");//replace the non-numbers from the string with space.
        str = str.replaceAll("[\\D]]", " "); //   -->[//D] is a predefined character that matches the non-digits
        String[] numbers=str.split(" ");//split them
        int sum = 0;
        for(int i=0;i<numbers.length;i++){//use a for loop
            try{
                sum+=Integer.parseInt(numbers[i]);//returns the string as an integer number
            }
            catch( Exception e ) {
                //if the element in the array is not parse-able into Integer, Ignore it
            }
        }
        System.out.println("The sum is:"+sum);



    }



}
