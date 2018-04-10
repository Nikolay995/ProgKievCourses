package lections.reflection_api;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Car passat = new Car(2, "volks", "passat", 6);
        Field[] fields = Car.class.getDeclaredFields();
        Method[] methods = Car.class.getMethods();

        for (Method m : methods) {
            System.out.println(m);

        }
//        System.out.println(b.toString());
    }
}
