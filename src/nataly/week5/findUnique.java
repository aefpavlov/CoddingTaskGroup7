package nataly.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args) {
        unique("AAABBBCCCDEF");
    }

    public static void unique(String str) {
        String result = "";
        int count=0;

        for (int j = 0; j < str.length(); j++) {
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }

            }
            if (count==1){  //if it is unique
                result+= ""+str.charAt(j);
            }

            count=0;   //to make my counter restart
        }

        System.out.println(result);

    }



}