package fulati1.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("aaabbbccccccddde"));
    }


    public static String frequencyOfChars(String word) {
        String noDuplicate = "";
        for (int i = 0; i < word.length(); i++) {
            if (!noDuplicate.contains("" + word.charAt(i)))
                noDuplicate += "" + word.charAt(i);
        }
        String expectedResult = "";
        for (int j = 0; j < noDuplicate.length(); j++) {
            int conut = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == noDuplicate.charAt(j))
                    conut++;
            }
            expectedResult += noDuplicate.charAt(j) + "" + conut;
        }
        return expectedResult;
    }


}