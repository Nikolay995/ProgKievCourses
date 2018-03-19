package Task3_4_Exceptions_Interfaces.Operations;

import Task3_4_Exceptions_Interfaces.CustomExceptions.FullGroupException;
import Task3_4_Exceptions_Interfaces.Group;
import Task3_4_Exceptions_Interfaces.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

import static Task3_4_Exceptions_Interfaces.Group.students;
import static Task3_4_Exceptions_Interfaces.View.ViewConstans.*;

public class Operations {
    public static void readUserInput() {
        System.out.println(line + mainMenu + line);
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            switch (scanner.nextInt()) {
                case 1:
                    showStudents();
                    break;
                case 2:                                  // может и намудрил, но оно работает :)
                    try {
                        if (!moreThanTen()) {
                            addStudent();
                        }
                    } catch (FullGroupException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("ok");
                    //deleteStudent();
                    break;
                case 4:
                    System.out.println("ok");
                    //sortMenu();
                    break;
                case 5:
                    System.out.println("ok");
                    //findStBySurname();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Wrong number, try again.");

            }
        }
    }

    private static void showStudents() {                                        //метод для вывода
        System.out.print(bigLine);
        for (Student st : students) {
            System.out.println(st);
        }
        System.out.println(bigLine);
    }

    private static ArrayList<Student> addStudent() throws FullGroupException { //метод для добавления

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student's name: ");
        String inputName = sc.next();

        System.out.println("Enter student's surname: ");
        String inputSurname = sc.next();

        System.out.println("Enter student's age: ");
        int inputAge = sc.nextInt();

        System.out.println("Enter student's gender (man/woman): ");
        String inputGender = sc.next();

        System.out.println("Enter student's course: ");
        int inputCourse = sc.nextInt();

        System.out.println("Enter student's group: ");
        String inputGroup = sc.next();

        System.out.println("Enter student's ID: ");
        int inputID = sc.nextInt();

        Student studentInput = new Student(inputName, inputSurname, inputAge, inputGender, inputCourse, inputGroup, inputID);
        students.add(studentInput);
        System.out.println(line);
        System.out.println("Student added successfully!");
        System.out.println(line + mainMenu + line);

        return students;
    }

    private static boolean moreThanTen() throws FullGroupException {   //проаеряем, не больше ли 10 студентов
        boolean moreThanTen = false;
        if (students.size() >= 10) {
            moreThanTen = true;
            System.out.println("More than 10");
            throw new FullGroupException();
        }
        return moreThanTen;
    }
}
