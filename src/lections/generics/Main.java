package lections.generics;

public class Main {
    public static void main(String[] args) {

        SomeClass<Integer> sm = new SomeClass<>(100);
        sm.setSomeField(20);

        int result = 250 + sm.getSomeField();
        System.out.println(result);

        SomeClass<String> smTwo = new SomeClass<>("Hello");
        System.out.println(smTwo);

        Integer[] array = new Integer[]{7, 0, 12, 3, 8};
        Integer res = getMax(array);

        System.out.println(res);
    }

    public static <T extends Comparable<T>> T getMax(T[] array) {
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
