package task8_lists.task8_4_double_cola;

import java.util.ArrayDeque;
import java.util.Deque;

public class ColaQueue {
    public Deque<String> createQueue() {

        Deque<String> colaQueue = new ArrayDeque<>();

        colaQueue.add("Sheldon");
        colaQueue.add("Leonard");
        colaQueue.add("Volovitc");
        colaQueue.add("Kutriapelli");
        colaQueue.add("Penny");

        System.out.println(colaQueue);
        return colaQueue;
    }
}
