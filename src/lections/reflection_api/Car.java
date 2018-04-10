package lections.reflection_api;

public class Car {
    private double engineCap = 1.8d;
    private String name;
    private String model;
    private int age;

    public Car(double engineCap, String name, String model, int age) {
        this.engineCap = engineCap;
        this.name = name;
        this.model = model;
        this.age = age;
    }

    public Car() {
    }

    public double getEngineCap() {
        return engineCap;

    }

    public void setEngineCap(double engineCap) {
        this.engineCap = engineCap;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
