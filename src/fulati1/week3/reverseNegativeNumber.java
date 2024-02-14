package fulati1.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53


    public static void main(String[] args) {
        System.out.println(reverseNumber(-35));
    }

    public static int reverseNumber(int a) {
        if (a < 0) {
            int positiveA = -a;
            int reversed = 0;

            while (positiveA != 0) {
                int num = positiveA % 10;
                reversed = reversed * 10 + num;
                positiveA /= 10;
            }
            reversed *= -1;

            return reversed;
        } else {

            return a;

        }


    }
}

