package LeilaS.week4;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBBCCC"));
    }

    public static String removeDuplicate(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains("" + each)) {
                result += each;
            }
        }
        return result;
    }
}


