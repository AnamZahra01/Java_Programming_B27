package day37_static;

public class SchoolObject {
    public static void main(String[] args) {

        School.district = 149;
        School.totalTeachers = 100;
        School.totalStudents = 3000;

        School.totalTeachers--;

        System.out.println(School.district);
        System.out.println(School.totalTeachers);
        System.out.println(School.totalStudents);

        School.announcement(); //static method call using Class

       // School.lunchTime; //not Valid -> not Static
        School middle = new School();
        middle.lunchTime = 12;
        middle.lunch();

        middle.totalStudents = 5000;
        System.out.println(School.totalStudents);

    }
}
