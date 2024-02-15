package Fulati2.week4;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/
    public static void main(String[] args) {

        System.out.println(same("abc",  "abc"));
        System.out.println(same("abc",  "abb"));
    }

    public static boolean same(String str1, String str2){
        if (str1.equals(str2)){
            return true;
        }
        return false;
    }
}