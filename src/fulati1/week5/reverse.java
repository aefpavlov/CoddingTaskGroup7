package fulati1.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {
        System.out.println(reverse("hello"));
    }


    public static String reverse(String str) {

        String newStr = ""; //A new string variable newStr is initialized to an empty string.

        for (int i = str.length() - 1; i >= 0; i--) {
            //A for loop is used to iterate through the characters of the input string in reverse order. The loop starts from str.length() - 1 and goes down to 0.

            newStr += str.charAt(i);
            //In each iteration, the character at the current index (str.charAt(i)) is concatenated to the newStr string.
        }


        return newStr;
        //Finally, the reversed string (newStr) is returned.
    }


}