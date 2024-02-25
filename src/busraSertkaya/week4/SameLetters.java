package busraSertkaya.week4;

public class SameLetters {
    /*Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:*/

    public static void main(String[] args) {
        same("abc",  "cba");
    }

    public static void same(String str1, String str2){
        String each = "";
        for (int i = 0; i < str1.length(); i++) {

            each = ""+str1.charAt(i);

        }

        if (str2.contains(each)){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

    }
}