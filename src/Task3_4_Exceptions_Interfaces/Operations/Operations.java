package Task3_4_Exceptions_Interfaces.Operations;
import Task3_4_Exceptions_Interfaces.CustomExceptions.FullGroupException;
import Task3_4_Exceptions_Interfaces.Group;
import java.util.Scanner;

import static Task3_4_Exceptions_Interfaces.View.ViewConstants.*;

public class Operations {

    public static void readUserInput() {
        Group group = new Group();
        System.out.println(line + mainMenu + line);
        Scanner scanner = new Scanner(System.in);

        for (; ; ) {
            switch (scanner.nextInt()) {
                case 1:
                    group.showStudents();
                    break;
                case 2:
                    try {
                        if (!moreThanTen()) {
                            group.addStudent();
                        }
                    } catch (FullGroupException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    group.isGoingToArmy();
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
        Group group = new Group();
        if (group.students.length >= 10) {
            moreThanTen = true;
            throw new FullGroupException();
        }
        return moreThanTen;
    }

    private static void removeByName() {
        System.out.print("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

//        for (int i = 0; i < students.size(); i++) {
//            if (students.get(i).getName().equals(input)) {
//                students.remove(i);
//                System.out.println("Student(s) was deleted\n");
//                removeInput();
//            } else {
//                System.out.println("There is no student with this name\n");
//                removeInput();
//            }
//        }
    }

    private static void removeBySurname() {

        System.out.print("Enter surname: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

//        for (Student student : students) {
//            if (student.getSurname().equalsIgnoreCase(input)) {
//                students.remove(student);
//                System.out.println("Student was deleted\n");
//                removeInput();
//            } else {
                System.out.println("There is no student with this surname\n");
                removeInput();
            }
        }




