package LeilaS.week7;


import java.util.Arrays;

public class arraySortDescending {
  /*Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
    Ex: int[] arr = {10,20,7, 8, 90};
    arr = Sort(arr); ==> {90, 20, 10, 8, 7};*/
  public static void main(String[] args) {
    int [] arr={10, 20, 7, 8, 90};
    sortDescending(arr);

  }

    public static void sortDescending(int[] arr) {
      // temporary variable, swapping elements during the sorting process
    int temp;
    // iterates through each element of the array, compares arr[i] with each element arr[j]
        for (int i = 0; i <arr.length ; i++) {
            //This is the inner loop,compares arr[i] with each element arr[j] that comes after it
            for (int j = i+1; j < arr.length; j++) {
              if(arr[i]<arr[j]){
               //we need to swap them
               temp=arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
              }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}