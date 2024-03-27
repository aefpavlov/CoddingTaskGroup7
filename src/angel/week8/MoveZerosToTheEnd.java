package angel.week8;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    public static void main(String[] args)
    {
        int [] test={1,0,2,0,3,0,4,0};
        System.out.println(Arrays.toString(moveZeros(test)));

    }
public static int[] moveZeros ( int[] input ){
        int[] returnArray =new int [input.length-1];
        int j=0;
        for (int i=0;i<input.length;i++){
            if(input[i]!=0){
                returnArray[j]=input[i];
                j++;
            }
        }
        return returnArray;

}
}