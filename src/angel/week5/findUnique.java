package angel.week5;

public class findUnique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/

    public static void main(String[] args)
    {
        String s1 ="AAABBBCCCDEF";
        System.out.println(unique(s1));
        System.out.println(unique2(s1));
    }

    public static String unique(String entry){
        // using do while loop and StringBuilder class
        StringBuilder result=new StringBuilder();
        do{
            String target = ""+entry.charAt(0); // takes first character to String

            if ( entry.length()-1 == entry.replace(target,"").length()){
            // compares length-1 to string without the target character

                result.append(entry.charAt(0));//adds char to result
            }
            entry=entry.replace(target,"");// removes all of first characters

        }while(!entry.isEmpty());

        return (result.length()==0)? "No unique characters": result.toString();
    }

    public static String unique2(String entry){
        String result = "";
        int counter =0 ;

        for(int i=0 ; i < entry.length(); i++){
            // takes one char at time  and counts it appearances
            for (int j = 0; j < entry.length() ;j++) {
                if (entry.charAt(i) == entry.charAt(j)){
                    counter ++ ;
                }
            }
            if (counter==1){// if it appears only 1 time adds it to result
                result+=entry.charAt(i);
            }
            counter=0;// reset counter for next character
        }
        return (result.isEmpty())? "No unique characters": result;
    }



}