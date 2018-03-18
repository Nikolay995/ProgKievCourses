package Task3_4_Exceptions_Interfaces;

public class Student extends Human {
    private int course;
    private String group;
    private int studentID;

    public Student(String name, String surname, int age, String gender, int course, String group, int studentID) {
        super(name, surname, age, gender);
        this.course = course;
        this.group = group;
        this.studentID = studentID;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Student(String name, String surname, int age, String gender) {

        super(name, surname, age, gender);
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", group='" + group + '\'' +
                ", studentID=" + studentID +
                '}';
    }
}
