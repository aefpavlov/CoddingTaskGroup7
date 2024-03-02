package LeilaS.week6;

public class SumOfDigits {
    /*Write a method that can return the sum of the digits in a string
      Ex:  "12 java 5 apple 3"  ==>  20 */
    public static void main(String[] args) {
        String input = "12 java 5 apple 3";
        int sum = sumOfDigits(input);
        System.out.println("Sum of digits: " + sum);
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
