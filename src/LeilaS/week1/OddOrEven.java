package LeilaS.week1;

public class OddOrEven {
    public static void main(String[] args) {
        int number = 2;
        if (isEven(number)) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}

    /*Write  a method which can identify given number is even or odd
    Output ex:
    identify(5); ->"Odd"
    identify(6); ->"Even"*/




