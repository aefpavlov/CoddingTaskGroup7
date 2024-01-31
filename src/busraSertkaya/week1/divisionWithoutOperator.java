package busraSertkaya.week1;

public class divisionWithoutOperator {
    //Write a method that can divide two numbers without using division operator

    public static void main(String[] args) {

        divide(27,9);
    }

    public static void divide(int a, int b){
        int count = 0;

        while (a >= b){
            a-=b;
            count++;
        }

        System.out.println(count);
    }
}


