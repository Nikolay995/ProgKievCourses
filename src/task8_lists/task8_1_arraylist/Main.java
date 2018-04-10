package task8_lists.task8_1_arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        listCreator();
    }

    public static void listCreator() {
        List<Integer> myList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            myList.add(rand.nextInt(100));
        }
        System.out.println(myList + " - initial array of 10 elements");

        myList.remove(0);
        myList.remove(0);
        System.out.println(myList + " - two first elements were deleted");

        myList.remove(myList.size() - 1);
        System.out.println(myList + " - last element was deleted");


    }
}
