package LeilaS.week4;

import java.util.Arrays;

public class SameLetter {
      /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/
      public static void main(String[] args) {
          String str1 = "abc";
          String str2 = "cab";

          if (sameLetters(str1, str2)) {
              System.out.println(str1 + " and " + str2 + " are build out of the same letters.");
          } else {
              System.out.println(str1 + " and " + str2 + " are not build out of the same letters.");
          }
      }

    public static boolean sameLetters(String str1, String str2) {
        str1 = str1.replaceAll(" ", "").toLowerCase();
        str2 = str2.replaceAll(" ", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }
        //convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

}
