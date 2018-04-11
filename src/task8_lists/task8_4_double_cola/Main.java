package task8_lists.task8_4_double_cola;

public class Main {

    public static void main(String[] args) {

        ColaMachine machine = new ColaMachine();
        ColaQueue queue = new ColaQueue();
        machine.giveCola(queue.createQueue());

    }

}