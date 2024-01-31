package fulati1.week1;

public class oddOrEven {
    public static String identifyNumber(int number) {
        if (number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args) {

        String a = identifyNumber(2);
        String b = identifyNumber(6);

        System.out.println(a);
        System.out.println(b);
    }

}


/*

Numbers - Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"

 */