package fulati1.week4;

import java.util.Arrays;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static void main(String[] args) {
        System.out.println(sameLetter("abcd","dcba"));

    }


    public static boolean sameLetter (String a, String b){
        char[] charArray1 = a.toCharArray();
        char[] charArray2 = b.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);

    }





}