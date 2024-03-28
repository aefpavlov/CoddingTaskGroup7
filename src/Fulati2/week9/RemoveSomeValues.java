package Fulati2.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveSomeValues {
    //Given a list of Integers 1, 2, 3, 4, 5, 6 ....etc. remove all values greater than 100.

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 150; i++) { // Sample list from 1 to 150
            numbers.add(i);
        }

        removeGreaterThan100(numbers);
    }

    public static void removeGreaterThan100(List<Integer> nums){
        nums.removeIf(p -> (p > 100));

        System.out.println(nums);
    }

}