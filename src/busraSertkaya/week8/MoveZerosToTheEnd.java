package busraSertkaya.week8;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/


    public static void main(String[] args) {
        moveZeros(1,0,2,0,3,0,4,0);
    }

    public static void moveZeros(int...arr){
        int[] moved = new int[arr.length];
        int zero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                moved[zero++] = arr [i];
            }
        }
        System.out.println(Arrays.toString(moved));
    }



}