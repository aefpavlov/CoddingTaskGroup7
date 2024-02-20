package angel.week4;

public class FrequencyofCharacters {
    /*Write a return method that can find the frequency of characters
    Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2*/
    public static void main(String[] args)
    {
        String  s1= "AAABBCDD",
                s2 = "AABBABCDAD";
        System.out.println(frequencyOfChars(s2));
        System.out.println(frequencyOfChars2(s2));

    }

    public static String frequencyOfChars (String inputString){

       String result  = "";
       int counter = 0;
       for (int i = 0 ; i<= inputString.length()-1; i++){
           if (result.contains(""+inputString.charAt(+i))) {
               continue;
           }
           counter = 0;
           for ( int j=0 ; j<=inputString.length()-1;j++)
               if ( inputString.charAt(i)== inputString.charAt(j)){
                   counter++;
               }
           result+=""+inputString.charAt(i)+" "+counter+" ; ";
       }
        return result;

    }

    public static String frequencyOfChars2 (String input){
        String temp ="";
        String result ="";
        do{
            result+=""+input.charAt(0);
            temp = input.replaceAll(""+input.charAt(0),"");
            int  numRep= input.length()-temp.length();
        result +=" "+( (numRep==0)? ""+1: numRep+" ;");
        input = temp;
        temp="";
        }while (!input.isEmpty());
        return result;
    }



}