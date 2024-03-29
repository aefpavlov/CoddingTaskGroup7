package LeilaS.week6;

public class FindMaximum {
   /* Write a method that can find the maximum number from an int Array
    Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99 */

    public static int findMax(int[] arr) {

            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            return max;
        }

        public static void main(String[] args) {
            int[] arr = {99, 12, 23, 32, 44, 57, 6};
            int max = findMax(arr);
            System.out.println("The maximum number is: " + max);
        }

}
