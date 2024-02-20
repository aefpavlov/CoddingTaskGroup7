package angel.week4;

import java.util.Set;

public class RemoveDuplicates {
    /*Write a return method that can remove the duplicated values from String
        Ex:  removeDup("AAABBBCCC")  ==> ABC*/
    public static void main(String[] args)
    {
        String s1 = "AAABBBCCC", s2= "ASAASBSNNS";
        System.out.println(removeDup(s2));

    }

    public static String removeDup(String inputString){
       String resutlt="";
        for (int i = 0; i < inputString.length()-1; i++) {
            if (!resutlt.contains(""+inputString.charAt(i))){
                resutlt+=""+inputString.charAt(i);
            }
        }
        return resutlt;
    }

    //todo figure it out with Set - no duplicates

}