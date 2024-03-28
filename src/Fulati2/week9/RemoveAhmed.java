package Fulati2.week9;


import java.util.ArrayList;
import java.util.List;

public class RemoveAhmed {
    /*Given a list of people' names: "Ahmed", "John", "Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
    */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Ahmed", "John", "Eric", "Ahmed"));
        removeAhmed(names);
    }

    public static void removeAhmed(List<String> names){
        List<String> newNameList = new ArrayList<>(names);

        newNameList.removeIf(p -> (p.toLowerCase().equals("ahmed")));

        System.out.println(newNameList.toString());

    }


}