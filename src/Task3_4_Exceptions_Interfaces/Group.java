package Task3_4_Exceptions_Interfaces;

import java.util.Scanner;

import static Task3_4_Exceptions_Interfaces.View.ViewConstants.bigLine;
import static Task3_4_Exceptions_Interfaces.View.ViewConstants.line;
import static Task3_4_Exceptions_Interfaces.View.ViewConstants.mainMenu;

public class Group implements Voenkomat {
    public Student[] students = new Student[10];

    public void createGroup() {
        students[0] = new Student("Ivan", "Ivanov", 17, "man", 1, "KN-11", 4962011);
        students[1] = new Student("Andrey", "Petrov", 18, "man", 2, "KN-21", 4962012);
        students[2] = new Student("Anna", "Soboleva", 18, "woman", 2, "KN-21", 4962013);
        students[3] = new Student("Mikhail", "Morozov", 19, "man", 3, "IT-113", 4962014);
        students[4] = new Student("Dmitriy", "Petrenko", 20, "man", 3, "IT-113", 4962015);
        students[5] = new Student("Andrey", "Shevchenko", 21, "man", 4, "KN-41", 4962016);
        students[6] = new Student("Marina", "Lytvynenko", 21, "woman", 4, "KN-41", 4962017);
        students[7] = new Student("Nikolay", "Ivanenko", 17, "man", 1, "KN-11", 4962018);
        students[8] = new Student("Yaroslav", "Nesterenko", 21, "man", 4, "KN-41", 4962019);
        students[9] = new Student("Petr", "Sidorov", 20, "man", 3, "IT-113", 4962020);
        ;

    }

    public void showStudents() {
        System.out.print(bigLine);
        for (int i = 0; i < students.length - 1; i++) {
            System.out.println(i + 1 + " | " + students[i]);
        }
        System.out.println(bigLine);
    }


    public void addStudent() { //метод для добавления

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
        students[students.length - 1] = studentInput;
        System.out.println(line);
        System.out.println("Student added successfully!\n");
        System.out.println(line + mainMenu + line);
    }


    @Override
    public boolean isGoingToArmy() {
        for (Student std : students) {
            if (std.getAge() >= 18 && std.getGender().equals("man")) {
                System.out.println(std.getSurname());
                return true;
            }
        }
        return false;
    }
}
