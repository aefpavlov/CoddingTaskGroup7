package fulati1.week2;

public class swapTwoNumbers {
    //Swap two variable' values without using a third variable
    public static void main(String[] args) {

        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}
