package angel.week5;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
   public static void main(String[] args)
   {
       System.out.println("reverse1(\"ABCD\") = " + reverse1("ABCD"));
       System.out.println("reverse2(\"ABCD\") = " + reverse2("ABCD"));

   }

    public static String reverse1(String entry){
      StringBuilder reversed = new StringBuilder();
       for(int i = entry.length()-1;i>=0;i--){
           //loops form last to first character
           reversed.append(entry.charAt(i));
       }
       return reversed.toString();
    }

    public static String reverse2(String entry){
       StringBuilder reversed = new StringBuilder(entry);
       reversed.reverse();// build in reverse method
       return  reversed.toString();
    }


}