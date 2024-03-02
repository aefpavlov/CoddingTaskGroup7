package angel.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */

    public static void main(String[] args)
    {
        System.out.println("sumOfDigits(\"12 java 5 apple 3\") = " + sumOfDigits("12 java 5 apple 3"));

    }

    public static int sumOfDigits (String input){
        int sum = 0;

        String [] temp = input.split(" ");
        for ( String each : temp){
            if (Character.isDigit(each.charAt(0))){
                sum+=Integer.parseInt(each);
            }
        }
        return sum;
    }
}
