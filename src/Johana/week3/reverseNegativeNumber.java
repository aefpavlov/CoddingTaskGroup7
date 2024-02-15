package Johana.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53
    public static void main(String[] args) {
        System.out.println(reverseInt(-35));

    }

    public static int reverseInt(int n){
        boolean isNegative = n < 0? true:false;
        if (isNegative){
            n=n*-1;
        }

        int reverse = 0;
        int lastDigit = 0;

        while(n >= 1){
            lastDigit = n % 10;// gives you the last digit
            reverse = reverse * 10 + lastDigit;//we use multiplication and addition to create a new number with digits of the old number in reverse order
            n /= 10;
        }
        return isNegative == true? reverse*-1 : reverse;
    }
}




