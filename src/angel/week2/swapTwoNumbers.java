package angel.week2;
public class swapTwoNumbers {
    //Swap two variable' values without using a third variable
    public static void main(String[] args)
    {
        int a = 10;
        int b = 5;
        System.out.println("Input values : "+a+" "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Swaped values "+a+"  "+b);
    }


}
