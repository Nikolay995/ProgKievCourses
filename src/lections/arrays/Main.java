package lections.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        int[] a = new int[]{4, 5};
        myList.add(4);
        myList.add(-2);
        myList.add(10);
        System.out.println(myList);
        myList.add(1, 7);
        System.out.println(myList);
        myList.set(0, 11);
        System.out.println(myList);
        System.out.println(myList.get(2));
        myList.remove(0);
        System.out.println(myList);
        Collections.sort(myList);
        System.out.println(myList);

        Iterator<Integer> itr = myList.iterator();
        while (itr.hasNext()) {
            Integer temp = itr.next();
            if (temp < 0) {
                itr.remove();
            }
        }
        System.out.println();
        System.out.println(myList);

    }
}
