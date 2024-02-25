package LeilaS.week5;

public class Unique {
    /*Write a return  method that can find the unique characters from the String
      Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";*/
    public static void main(String[] args) {
        System.out.println(Unique("AAABBBCCCDEF"));
    }
    public static String Unique(String str){
            String result = "";
            int count =0 ;

            for(int i=0 ; i < str.length(); i++){
                for (int j = 0; j < str.length() ;j++) {//take each char and compare with String
                    if (str.charAt(i) == str.charAt(j)){
                        count ++ ;
                    }
                }
                if (count==1){
                    result+=str.charAt(i);
                }
                count=0;
            }
        return (result.isEmpty())? "No unique characters": result;
        }
    }



