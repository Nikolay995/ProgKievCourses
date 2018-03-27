package task1_Classes.task1_1_Cats;

public class Cat {

    private String name;
    private String color;
    private int age;

    public void talk() {
        System.out.println("Meow-meow-meow");
    }

    public void sleep() {
        System.out.println("Z-z-z-z-z-z");
    }

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat " +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ';';
    }
}
