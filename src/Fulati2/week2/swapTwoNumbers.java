package Fulati2.week2;
public class swapTwoNumbers {
    //Swap two variable' values without using a third variable

    public static void main(String[] args) {
        swap(5, 10);
    }

    public static void swap(int x, int y){
        y += x;
        x = y-x;
        y -= x;

        System.out.println("x is " + x + ", y is " + y);
    }

}
