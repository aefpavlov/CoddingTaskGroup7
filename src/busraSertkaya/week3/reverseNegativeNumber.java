package busraSertkaya.week3;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53

    public static void main(String[] args) {

        System.out.println(reverseInt(-35));

    }

    public static int reverseInt(int n){
        int reverse = 0; //-53

        while(n < 0){
            int lastDigit = n % 10;                  //3
            reverse = reverse * 10 + lastDigit;     //-35
            n /= 10;
        }
        return reverse;
    }



}

