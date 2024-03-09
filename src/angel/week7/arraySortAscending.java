package angel.week7;


import java.util.Arrays;

public class arraySortAscending
{
    /*Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
        Ex: int[] arr = {10, 9, 8, 7};
        arr = Sort(arr); ==>{ 7, 8, 9, 10};*/
    public static void main(String[] args)
    {
     //   int[] arr = {10, 9, 8, 7};

        int [] arr = arrayFindMinimum.randomArrayGeneratorInt(10,1,500);

        System.out.println("Generated Array: "+ Arrays.toString(arr));
        System.out.println("*".repeat(15));

        System.out.println("ascendingSort(arr) = " + Arrays.toString(ascendingSort(arr)));

        System.out.println("ascendingSort2(arr) = " + Arrays.toString(ascendingSort2(arr)));

    }

    public static int[] ascendingSort(int[] input)
    {

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                }
            }
        }
        return input;
    }

    public static int[] ascendingSort2(int [] input){
        int [] result = new int[input.length];
        for (int i = 0,j=input.length-1 ;i<input.length;i++,j--){
            result[j]=arraySortDescending.descendSort(input)[i];
        }
        return result;
    }


}