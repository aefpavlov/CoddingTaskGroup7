package LeilaS.week4;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        System.out.println(frequencyOfChar("aaabbbbccccc"));
    }

    public static String frequencyOfChar(String str){
        String result="";
        for (int i = 0; i < str.length()-1; i++) {
             char ch = str.charAt(i);
             int count = 0;
        for (int j = 0; j < str.length(); j++) {
             if(str.charAt(j)==ch){
              count++;
        }
        }
            if(result.contains(""+ch)){
                continue;
            }
            result+=ch+""+count;
        }
        return result;
    }

    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
}
