package Johana.week5;

public class reverse {
   /* Write a return method that can reverse  String
    Ex: Reverse("ABCD"); ==> DCBA*/

    public static void main(String[] args) {

        //The reverse() method of the StringBuilder class will allow us
        //to reverse the character sequence represented by the String.


        String name = "ABCD"; // I am declaring the String

        StringBuilder stringBuilder = new StringBuilder(name);//I created a new instance of the StringBuilder class as stringBuilder
        //using "name" string (which I have to reverse).

        String reversedString = stringBuilder.reverse().toString();//applied reverse() method on the stringBuilder instance
        //and assigned to the same stringBuilder instance (to get the reversed String).

        System.out.println(reversedString); //printed out the reversed String.
    }




    }


