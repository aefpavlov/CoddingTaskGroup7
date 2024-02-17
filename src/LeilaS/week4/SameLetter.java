package LeilaS.week4;

public class SameLetter {
    public static void main(String[] args) {
        System.out.println(sameLetter("abc", "abb"));
    }
    /*Write a return method that check if a string is build out of the same letters as another string.
  Ex:  same("abc",  "cab"); -> true
  same("abc",  "abb"); -> false:*/
    public static boolean sameLetter(String str1, String str2){
        if(str1.equals(str2)){
            return true;
        }
        return false;
    }

}
