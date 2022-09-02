package office_hours_practice.custom_classes.student;

import java.time.LocalDate;

public class Student {

    String name;
    long id;
    int age;
    char gender;
    LocalDate dateOfBirth;
    static String schoolName = "CYDEO";

    public void setInfo(String name, long id, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.id = id;
        this.age = LocalDate.now().getYear() - dateOfBirth.getYear();
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", school name=" +schoolName +
                '}';
    }
}
