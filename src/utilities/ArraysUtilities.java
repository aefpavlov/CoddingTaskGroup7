package utilities;

import java.util.Random;

public  class ArraysUtilities
{
    /**
 * Custom Method to generate int[] Array by given size
 * and elements are in given range
 * @param size Number of elements in the array
 * @param minRange minimum int number for range
 * @param maxRange maximum int number for range
 * @return int [size] {min ~ max }
 */
public static int[] randomArrayGeneratorInt(int size, int minRange, int maxRange) {
  try{
      if (size <= 0 || minRange > maxRange) {//sanity check
        System.out.println("*".repeat(15));
        System.out.println("Not valid range or size ");
        System.out.println("*".repeat(15));
        throw new IllegalArgumentException("Invalid input: Size can must be bigger than 0 , minimum range must be smaller  and different than maximum range .");
    }
  } catch (IllegalArgumentException e){
    e.printStackTrace();
  }


    int[] randomArray = new int[size];//size passed as parameter in the method
    Random random = new Random();


    for (int i = 0; i < size; i++) {
        // it will NOT work with for each loop
        randomArray[i] = random.nextInt(maxRange - minRange + 1) + minRange;
    }


    return randomArray;
}
}
