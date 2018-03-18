package Task3_4_Exceptions_Interfaces.Operations;

import Task3_4_Exceptions_Interfaces.CustomExceptions.FullGroupException;
import Task3_4_Exceptions_Interfaces.Group;
import Task3_4_Exceptions_Interfaces.Student;

import java.util.Scanner;

import static Task3_4_Exceptions_Interfaces.Group.addStudent;
import static Task3_4_Exceptions_Interfaces.Group.students;
import static Task3_4_Exceptions_Interfaces.View.ViewConstans.line;
import static Task3_4_Exceptions_Interfaces.View.ViewConstans.mainMenu;

public class Operations {
    public static void readUserInput() {
        System.out.println(line + mainMenu + line);
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            switch (scanner.nextInt()) {
                case 1:
                    showStudents();
                    break;
                case 2:
                    try {
                        addStudent();
                    } catch (FullGroupException e) {
                        e.getMessage();
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

    public static void showStudents() {
        for (Student st : students) {
            System.out.println(st);
        }

    }

}
