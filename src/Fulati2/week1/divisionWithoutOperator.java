package Fulati2.week1;

public class divisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator
    public static void main(String[] args) {
        divide(2, 4);
    }

    public static void divide(int num1, int num2){

        int big, small, count = 1;
        big = Math.max(num1, num2);
        small = Math.min(num1, num2);

        while(big - small != 0){
            big -= small;
            count++;
        }

        System.out.println(count);
    }
}
