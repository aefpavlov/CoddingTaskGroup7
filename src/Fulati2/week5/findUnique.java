package Fulati2.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {
        System.out.println(findUniqueChar("AAABBBCCCDEF"));
    }

    public static String findUniqueChar(String str){
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                newStr += str.charAt(i);
            }
        }

        return newStr;
    }

}