package Fulati2.week3;

import java.sql.SQLOutput;

public class reverseNegativeNumber {
    //Write a return method that can reverse digits of a negative number and return it as int
    //input: -35  output: -53
    public static void main(String[] args) {
        reverseDigit(-1929);
    }

    public static void reverseDigit(int num){
        String numStr = Integer.toString(num);
        String newNum = "" + numStr.charAt(0);
        for (int i = numStr.length()-1; i >= 1; i--) {
            newNum += numStr.charAt(i);
        }
        System.out.println(Integer.parseInt(newNum));
    }


}

