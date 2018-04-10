package task3_4_Exceptions_Interfaces;

public class Student extends Human {
    private long iD;
    private String group;

    public Student(String name, String lastname, int age, boolean sex, long iD, String group) {
        super(name, lastname, age, sex);
        this.iD = iD;
        this.group = group;
    }

    public Student() {
        super();
    }

    public long getZach() {
        return iD;
    }

    public void setZach(long iD) {
        this.iD = iD;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student [ID=" + iD + ", group=" + group + "]" + super.toString();
    }

}