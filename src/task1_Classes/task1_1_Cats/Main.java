package task1_Classes.task1_1_Cats;

public class Main {
    public static void main(String[] args) {

        Cat vaska = new Cat("Vaska", "grey", 4);
        Cat barsik = new Cat("Barsik", "white", 5);
        Cat murka = new Cat("Murka", "black", 4);

        vaska.talk();
        barsik.sleep();
        System.out.println(murka.toString());

    }


}
