package Fulati2.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
   public static void main(String[] args) {
       System.out.println(reverseStr("Fulati"));
   }

   public static String reverseStr(String str){
       String reverse = "";

       for (int i = str.length()-1; i >= 0; i--) {
           reverse += str.charAt(i);
       }
       return reverse;
   }

}