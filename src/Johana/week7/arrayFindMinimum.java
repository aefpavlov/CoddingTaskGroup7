package Johana.week7;


public class arrayFindMinimum {
    // Write a method that can find the minimum  number from an int Array
    //Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6

    public static void main(String[] args) {

        int[] arr = {99, 12, 23, 32, 44, 57, 6};
        int minNum = arr[0]; //create an int variable called minNum, set the array's first member as its starting value

        for (int each: arr) {//create a for each loop to iterate over each element of the array.

            if (each < minNum) {// compare the values of the variables each and minNum. If the value of each is less than the value of minNum.
                minNum = each;
            }

        }

        System.out.println("The minimun number is " + minNum);

    }



    }

