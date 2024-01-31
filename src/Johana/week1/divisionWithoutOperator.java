package Johana.week1;

public class divisionWithoutOperator {
    public static void main(String[] args) {


        int a = 27;
        int b = 9;

        int count = 0;

        while (a >= b) {
            a -= b;
            count++;
        }

        System.out.println(count+" with a remainder of "+a);


    }


}

//Write a method that can divide two numbers without using division operator


