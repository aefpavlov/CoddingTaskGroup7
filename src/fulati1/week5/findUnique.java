package fulati1.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/
    public static void main(String[] args) {

        System.out.println(uniqueStr("aabbhklca"));
    }


    public static String uniqueStr(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char existingChar = str.charAt(i);
            //Iterates through each character of the input string str. For each iteration, it retrieves the character at the current index and stores it in the variable existingChar.
            if (str.indexOf(existingChar) == str.lastIndexOf(existingChar))
                result += existingChar;

            //Checks if the current character is unique in the string. It does so by comparing the index of the first occurrence of the character (str.indexOf(existingChar)) with the index of the last occurrence of the character (str.lastIndexOf(existingChar)). If they are the same, it means the character appears only once in the string, and it is appended to the result string.

        }
        return result;
    }

}