package arraylist;

// Combining two ArrayList

import java.util.ArrayList;

public class ArrayListEx04 {
    public static void main(String[] args) {
        ArrayList<Integer> listFour = new ArrayList<>();
        listFour.add(12);
        listFour.add(23);
        listFour.add(54);

        System.out.println("Elements of List One");
        listFour.forEach(System.out::println);

        // Creating another Arraylist
        ArrayList<Integer> listFive = new ArrayList<>();
        listFive.add(433);
        listFive.add(566);
        listFive.add(876);

        System.out.println("Elements of List Two");
        listFive.forEach(System.out::println);

        // combining both the list
        listFour.addAll(listFive);
        System.out.println("Updated list "+ listFour);

        // removing all new elements from list
        listFour.removeAll(listFive);

        // Removes common elements of both the list
        System.out.println("After removeAll operation ");
        System.out.println(listFour);

        // Creating another Arraylist
        ArrayList<String> listSix = new ArrayList<>();
        listSix.add("Try");
        listSix.add("Sample");
        listSix.add("Test");

        // -> CANNOT COMBINE TWO LIST OF DIFFERENT DATA TYPES IT WILL RESULT IN COMPILE TIME ERROR
        // listSix.addAll(listFive);

    }
}
