package Fulati2.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static void main(String[] args) {
        System.out.println(removeDup("AAABBBCCC"));
    }

    public static String removeDup(String str){
        String newStr = "";

        for (int i = 0; i < str.length(); i++) {
            if(i == str.length() - 1 || str.charAt(i) != str.charAt(i+1)){
                newStr += "" + str.charAt(i);
            }
        }
        return newStr;
    }

}