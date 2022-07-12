package arraylist;

// Different operations like size, sorting, removing elements etc..

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx03 {
    public static void main(String[] args) {
        ArrayList<String> listThree = new ArrayList<>();
        listThree.add("Java");
        listThree.add("C++");
        listThree.add("Python");
        listThree.add(".Net");

        System.out.println("Size of the list is "+ listThree.size());

        System.out.println("Elements of the list before sorting");
        System.out.println(listThree);

        System.out.println("Elements of the list after sorting");
        Collections.sort(listThree);
        System.out.println(listThree);

        System.out.println("Changing the element present at index 0 '"+listThree.get(0) +"' with R Systems");
        listThree.set(0,"R Systems");
        System.out.println(listThree);
    }
}