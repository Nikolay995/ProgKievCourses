package task6_Multithreading.task6_1_Factorial;

import java.math.BigInteger;

public class Factorial implements Runnable {
    private int input;

    Factorial(int input) {
        this.input = input;
    }

    @Override
    public void run() {
        System.out.println(input + "! = " + fact(input) + " [" + Thread.currentThread().getName() + "]");
    }

    private BigInteger fact(int num) {
        if (num == 0) {
            return BigInteger.valueOf(1);
        } else
            return BigInteger.valueOf(num).multiply(fact(num - 1)); // n*fact(n-1)
    }

}
