package task8_lists.task8_4_double_cola;

import java.util.Deque;
import java.util.Scanner;

class ColaMachine {
    void giveCola(Deque<String> colaQueue) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many Cola?");
        int number = sc.nextInt();
        String firstElement;

        for (int i = 0; i < number; i++) {
            firstElement = colaQueue.pollFirst();
            colaQueue.addLast(firstElement);
            colaQueue.addLast(firstElement);
        }

        System.out.println(colaQueue);
    }
}
