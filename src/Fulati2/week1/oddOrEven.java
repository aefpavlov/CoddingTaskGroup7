package Fulati2.week1;

public class oddOrEven {
    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/
    public static String identify(int num){
        return (num % 2 == 0) ? "Even" : "Odd";
    }


    public static void main(String[] args) {
        System.out.println(identify(2));
    }
}
