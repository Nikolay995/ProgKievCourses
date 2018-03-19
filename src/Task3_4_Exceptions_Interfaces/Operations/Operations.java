package Task3_4_Exceptions_Interfaces.Operations;
import Task3_4_Exceptions_Interfaces.CustomExceptions.FullGroupException;
import Task3_4_Exceptions_Interfaces.Student;
import java.util.Scanner;

import static Task3_4_Exceptions_Interfaces.Group.*;
import static Task3_4_Exceptions_Interfaces.View.ViewConstants.*;

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
                        if (!moreThanTen()) {        // может и намудрил, но оно работает :)
                            addStudent();
                        }
                    } catch (FullGroupException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    removeInput();
                    break;
                case 4:
                    //sortMenu();
                    break;
                case 5:
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
        for (int i = 0; i < students.size(); i++) {
            System.out.println(i + 1 + " | " + students.get(i));
        }
        System.out.println(bigLine);
    }

    private static void addStudent() throws FullGroupException { //метод для добавления

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
        System.out.println("Student added successfully!\n");
        System.out.println(line + mainMenu + line);
    }

    private static void removeInput() {
        System.out.println(line);
        System.out.println(removeMenu);
        System.out.println(line);
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            switch (scanner.nextInt()) {
                case 1:
                    removeByName();
                    break;
                case 2:
                    removeBySurname();
                    break;
                case 3:
                    //removeById();
                    break;
                case 4:
                    readUserInput();
                    break;

            }
        }
    }


    private static boolean moreThanTen() throws FullGroupException {
        boolean moreThanTen = false;
        if (students.size() >= 10) {
            moreThanTen = true;
            throw new FullGroupException();
        }
        return moreThanTen;
    }

    private static void removeByName() {
        System.out.print("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(input)) {
                students.remove(i);
                System.out.println("Student(s) was deleted\n");
                removeInput();
            } else {
                System.out.println("There is no student with this name\n");
                removeInput();
            }
        }
    }

    private static void removeBySurname() {

        System.out.print("Enter surname: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        for (Student student : students) {
            if (student.getSurname().equalsIgnoreCase(input)) {
                students.remove(student);
                System.out.println("Student was deleted\n");
                removeInput();
            } else {
                System.out.println("There is no student with this surname\n");
                removeInput();
            }
        }
    }
}



