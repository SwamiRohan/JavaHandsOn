package arraylist;

// Arraylist is a dynamic array for storing elements. It is like an array but there is no size limit.
// We can add or remove element anytime.
/* Some Points About ArrayList
 1. Dynamic Array so we don't have to specify size while creating it.
 2. Can contain duplicate elements.
 3. maintains insertion order.
 4. we can access elements randomly just like array by index.
 5. We an can't create array of primitive type.
 */

import java.util.ArrayList;

// Different ways to print elements of ArrayList

public class ArrayListEx01 {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Yellow");
        listOne.add("Red");
        listOne.add("Green");

        System.out.println("First way of printing elements");
        System.out.println(listOne);
        System.out.println();

        System.out.println("Second way of printing elements");
        for (var a : listOne){
            System.out.println(a);
        }
        System.out.println();

        System.out.println("Third way of printing elements");
        listOne.forEach(System.out::println);
        System.out.println();

        System.out.println("Fourth way of printing using index");
        System.out.println(listOne.get(0));
        System.out.println(listOne.get(1));
        System.out.println(listOne.get(2));

    }
}
