package Johana.week2;
public class swapTwoNumbers {
    //Swap two variable values without using a third variable

    public static void main(String[] args) {

        int a = 8;
        int b = 43;

        a = a + b;
        b = a - b; 
        a = a - b;

        System.out.println("a " + a);
        System.out.println("b " + b);

    }
}