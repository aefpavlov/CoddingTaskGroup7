package busraSertkaya.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {
        frequencyOfChars("AAABBCDD");
    }

    public static void frequencyOfChars(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)){
                    count++;
                }

            }
            if (result.contains(""+ch)){
                continue;
            }


            result += "" + ch + count;

        }

        System.out.print(result);




    }


}