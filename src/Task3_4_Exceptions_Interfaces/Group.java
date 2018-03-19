package Task3_4_Exceptions_Interfaces;

import Task3_4_Exceptions_Interfaces.CustomExceptions.FullGroupException;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    public static ArrayList<Student> students = new ArrayList<>(10);

    public static ArrayList<Student> createGroup() {
        students.add(new Student("Ivan", "Ivanov", 17, "man", 1, "KN-11", 4962011));
        students.add(new Student("Andrey", "Petrov", 18, "man", 2, "KN-21", 4962012));
        students.add(new Student("Anna", "Soboleva", 18, "woman", 2, "KN-21", 4962013));
        //students[3] = new Student("Mikhail", "Morozov", 19, "man", 3,"IT-113" ,4962014);
        students.add(new Student());
        students.add(new Student("Dmitriy", "Petrenko", 20, "man", 3, "IT-113", 4962015));
        students.add(new Student("Andrey", "Shevchenko", 21, "man", 4, "KN-41", 4962016));
        students.add(new Student("Marina", "Lytvynenko", 21, "woman", 4, "KN-41", 4962017));
        students.add(new Student("Nikolay", "Ivanenko", 17, "man", 1, "KN-11", 4962018));
        //students[8] = new Student("Anna", "Malinina", 19, "woman", 2,"IT-112" ,4962019);
        students.add(new Student());
//      students[9] = new Student("Petr", "Sidorov", 20, "man", 3,"IT-113" ,4962020);
        return students;
    }



}
