package arraylist;

//Traverse ArrayList elements using iterator interface.

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx02 {
    public static void main(String[] args) {
        ArrayList<Integer> listTwo = new ArrayList<>();
        listTwo.add(10);
        listTwo.add(11);
        listTwo.add(12);
        listTwo.add(14);

        Iterator itrList = listTwo.iterator();
        while (itrList.hasNext()){
            System.out.println(itrList.next());
        }
    }
}
