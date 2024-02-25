package LeilaS.week5;


public class Reverse {
    public static void main(String[] args) {
         /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/
        System.out.println(reverse("ABCD"));
    }
        public static String reverse(String str){
            String reverse="";
            for (int i = str.length()-1; i >=0 ; i--) {
                reverse +=  str.charAt(i);
            }
            return reverse;
        }
    }


