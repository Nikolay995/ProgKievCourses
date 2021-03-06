package task3_4_Exceptions_Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.*;

public class Group implements Voencom {
    private List<Student> studentArray = new ArrayList<>();
    private String groupName;

    public Group() {
        super();
        this.groupName = "unknown";
    }

    public Group(String groupName) {
        super();
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void addStudentInteractive() throws CustomException {
        try {
            String name = getName("Input student name");
            String lastName = getName("Input student lastname");
            int age = getAge();
            boolean sex = getSex("Input sex -> man or women");
            long zach = getZach("Input zach number");
            String group = this.groupName;
            Student st = new Student(name, lastName, age, sex, zach, group);
            this.addStudent(st);
        } catch (NullPointerException e) {
            System.out.println("Canceled");
            return;
        }
    }

    public void addStudent(Student student) throws CustomException {
        if (student == null) {
            throw new IllegalArgumentException("Null student");
        }
        for (int i = 0; i < studentArray.size(); i++) {
            if (studentArray.get(i) == null) {
                studentArray.set(i, student);
                return;
            }
        }
        throw new CustomException();
    }

    public Student search(String lastName) {
        for (Student student : studentArray) {
            if (student != null && student.getLastname().equals(lastName)) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(int n) {
        if (!(n >= 0 && n < studentArray.size())) {
            System.out.println("Error");
            return;
        }
        studentArray.set(n, null);
    }

    private void sort() {
        for (int i = 0; i < studentArray.size() - 1; i++) {
            for (int j = i + 1; j < studentArray.size(); j++) {
                if (compareStudent(studentArray.get(i), studentArray.get(j)) > 0) {
                    Student temp = studentArray.get(i);
                    studentArray.set(i, studentArray.get(j));
                    studentArray.set(j, temp);
                }
            }
        }
    }

    private int compareStudent(Student a, Student b) {
        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return a.getLastname().compareTo(b.getLastname());

    }

    private int getAge() throws NullPointerException {
        boolean done = false;
        int age = 0;
        for (; !done; ) {
            try {
                age = Integer.valueOf(JOptionPane.showInputDialog("Input student age"));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid ");
            }
        }
        return age;
    }

    private String getName(String message) throws NullPointerException {
        boolean done = false;
        String name = "";
        for (; !done; ) {
            try {
                name = JOptionPane.showInputDialog(message);
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    private boolean getSex(String message) throws NullPointerException {
        boolean done = false;
        boolean name = false;
        for (; !done; ) {
            try {
                name = JOptionPane.showInputDialog(message).equals("man");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    private long getZach(String message) throws NullPointerException {
        boolean done = false;
        long name = 0;
        for (; !done; ) {
            try {
                name = Long.valueOf(JOptionPane.showInputDialog(message));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Invalid format");
            }
        }
        return name;
    }

    public void sortByParametr(int i) {
        Arrays.sort(new List[]{studentArray}, new StudentComparator(i));
    }

    public void sortByParametr(int i, boolean forward) {
        Arrays.sort(new List[]{this.studentArray}, new StudentComparator(i, forward));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group: " + this.groupName).append(System.lineSeparator());
        int i = 0;

        for (Student student : studentArray) {
            if (student != null) {
                sb.append((++i) + ") ").append(student);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override
    public List<Student> getRecruter() {
        int n = 0;
        for (Student student : studentArray) {
            if (student != null && student.isSex() && student.getAge() >= 18) {
                n += 1;
            }
        }
        List<Student> studentArray = new ArrayList<>();

        int i = 0;
        for (Student student : studentArray) {
            if (student != null && student.isSex() && student.getAge() >= 18) {
                studentArray.set(i++, student);
            }
        }
        return studentArray;
    }

}