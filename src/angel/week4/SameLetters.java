package angel.week4;

import java.util.Arrays;

public class SameLetters {
    /*
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:
    */
    public static void main(String[] args)
    {
        String s1 = "abc",
                s2 = "cab" ,
                s3 = "abb";
        System.out.println(same(s1,s2));
        System.out.println(same(s1,s3));
        System.out.println(same(s2,s1));


    }
    public static boolean same( String str1 , String str2 ){
        char[] str1Array = str1.toCharArray();
        char [] str2Array = str2.toCharArray();
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        return Arrays.equals(str1Array,str2Array );
    }

}