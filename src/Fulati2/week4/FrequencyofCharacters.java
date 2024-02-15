package Fulati2.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/

    public static void main(String[] args) {
        System.out.println(FrequencyOfChars("AAABBCDD"));
    }

    public static String FrequencyOfChars(String str){
        String newStr = "";
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            if(i == str.length() - 1 || str.charAt(i) != str.charAt(i+1)){
                newStr += "" + str.charAt(i) + count;
                count = 0;
            }
            count++;
        }

        return newStr;
    }

    /*public static String frequencyOfChars(String str) {
        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Iterate through the string and update the frequency map
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Create a StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();

        // Iterate through the frequency map and append character-frequency pairs to the result
        for (char c : frequencyMap.keySet()) {
            result.append(c).append(frequencyMap.get(c));
        }

        return result.toString();
    }*/

}
