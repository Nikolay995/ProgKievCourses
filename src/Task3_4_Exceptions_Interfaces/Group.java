package Task3_4_Exceptions_Interfaces;

public class Group {
    Student[] students = new Student[10];

    public Student[] studInit(){
        students[0] = new Student("Ivan", "Ivanov", 17, "man", 1,"KN-11" ,4962011);
        students[1] = new Student("Andrey", "Petrov", 18, "man", 2,"KN-21" ,4962012);
        students[2] = new Student("Anna", "Soboleva", 18, "woman", 2,"KN-21" ,4962013);
        students[3] = new Student("Mikhail", "Morozov", 19, "man", 3,"IT-113" ,4962014);
        students[4] = new Student("Dmitriy", "Petrenko", 20, "man", 3,"IT-113" ,4962015);
        students[5] = new Student("Andrey", "Shevchenko", 21, "man", 4,"KN-41" ,4962016);
        students[6] = new Student("Marina", "Lytvynenko", 21, "woman", 4,"KN-41" ,4962017);
        students[7] = new Student("Nikolay", "Ivanenko", 17, "man", 1,"KN-11" ,4962018);
        students[8] = new Student("Anna", "Malinina", 19, "woman", 2,"IT-112" ,4962019);
        students[9] = new Student("Petr", "Sidorov", 20, "man", 3,"IT-113" ,4962020);

        return students;
    }

}
