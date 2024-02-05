package busraSertkaya.week2;
public class swapTwoNumbers {
    //Swap two variable' values without using a third variable

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        b = a + b;  //15
        a = b - a;  //10
        b = b - a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
