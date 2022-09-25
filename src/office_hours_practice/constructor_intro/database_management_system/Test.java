package office_hours_practice.constructor_intro.database_management_system;

public class Test {
    public static void main(String[] args) {

        StudentDataBase dataBase = new StudentDataBase();
        System.out.println(dataBase.getAll());
        System.out.println();

        Student student6 = new Student("Zainab", 106);
        dataBase.addStudent(student6);
        System.out.println(dataBase.getAll());
        System.out.println();
        System.out.println();

        System.out.println(dataBase.getStudentsContain("a"));

        System.out.println(dataBase.getStudentIdBiggerThan(103));
        System.out.println();


        System.out.println(dataBase.deleteStudentContainsChar("a"));

        //  dataBase.deleteStudent(103);
        //System.out.println(dataBase.getAll());
        // System.out.println();

    }
}
