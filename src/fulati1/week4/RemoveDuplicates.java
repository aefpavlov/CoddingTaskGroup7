package fulati1.week4;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/


    public static void main(String[] args) {
        System.out.println(removeDuplicate("abbbbcccdddd"));
    }


    public static String removeDuplicate(String word) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (!result.contains("" + word.charAt(i)))

                result += "" + word.charAt(i);
        }

        return result;
    }


}