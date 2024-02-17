package nataly.week1;

public class divisionWithoutOperator {
     public static void main(String[] args) {
        int dividend = 10;
        int divisor = 2;
        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }
        System.out.println(quotient+" with a remainder of "+dividend);
    }
    //Write a method that can divide two numbers without using division operator
    public static void main(String[] args) {

    }
}
