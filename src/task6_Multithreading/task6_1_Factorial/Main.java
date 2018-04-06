package task6_Multithreading.task6_1_Factorial;

public class Main {
    public static void main(String[] args) {
        try {
            Thread[] thread = new Thread[100];
            for (int i = 0; i < 100; i++) {
                thread[i] = new Thread(new Factorial(i));
                thread[i].start();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

