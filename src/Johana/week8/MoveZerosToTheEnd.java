package Johana.week8;


import java.util.Arrays;

public class MoveZerosToTheEnd {
    /*Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
    Ex:
    input:  {1,0,2,0,3,0,4,0};
    output: [1, 2, 3, 4, 0, 0, 0, 0]*/

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveAllZeros(1,0,2,0,3,0,4,0)));
    }

    public static int[] moveAllZeros(int... nums) { //create a method with an integer array
                                                    //use ... when printing to make it an argument

    int[] allMoved = new int[nums.length]; // create a new array [] called "allMoved" and initialize it with the same size
    int index = 0;


        for (int each: nums) {//create a for each loop to go for the original array
            if (each != 0) { // use an if condition when the number won't be zero
                allMoved[index++] = each; // if the number is not zero I will move it into my allMoved index


            }

        }

        return allMoved;
    }


}


