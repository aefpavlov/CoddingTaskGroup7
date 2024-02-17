package LeilaS.week4;

public class RemoveDuplicatee {
    public static void main(String[] args) {
        System.out.println(removeDuplicate("AAABBBCCC"));
    }
    /*Write a return method that can remove the duplicated values from String
       Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static String removeDuplicate(String str){
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
            result+=ch+"";
        }

        return result;
    }
}
