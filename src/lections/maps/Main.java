package lections.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(2, "two");
        myMap.put(1, "one");
        System.out.println(myMap);
        myMap.put(5, "five");
        myMap.put(4, "four");
        myMap.put(5, "FIVE");
        System.out.println(myMap);

        myMap.remove(1);
        System.out.println(myMap);
        Set<Integer> keys = myMap.keySet();     //получаем массив с ключами
        System.out.println(keys);
        for (Integer key : keys) {
            System.out.println(key + " = " + myMap.get(key));

        }


    }
}
