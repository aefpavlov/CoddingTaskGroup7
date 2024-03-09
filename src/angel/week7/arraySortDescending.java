package angel.week7;


import java.util.Arrays;

public class arraySortDescending
{
    /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
      Ex: int[] arr = {10,20,7, 8, 90};
      arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 7, 8, 90};
        System.out.println("Generated Array: "+ Arrays.toString(arr));

        System.out.println("*".repeat(15));

        System.out.println("descendSort(arr) = " + Arrays.toString(descendSort(arr)));

        System.out.println("descendSort2(arr) = " + Arrays.toString(descendSort2(arr)));
    }

    public static int[] descendSort(int[] input)
    {

        for (int i = 0; i < input.length-1; i++) {
            for (int j = 0; j < input.length-i-1; j++) {
                if (input[j]<input[j+1]){
                    int temp = input[j];
                    input [j]= input [j+1];
                    input [j+1] = temp;

                }

            }

        }
        return input;
    }

    // using ascendingSort from previous task
    // create new array and read from ascendingSort backwards
    public static int[] descendSort2(int [] input){
        int [] result= new int [input.length];
        for( int i = input.length-1,j=0; i>=0;i--,j++){

            result[j]=arraySortAscending.ascendingSort(input)[i];
        }
        return result;
    }


}