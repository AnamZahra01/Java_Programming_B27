package office_hours_practice.custom_classes.student;

import java.time.LocalDate;

public class Runner {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Anam", 10078L, 'F', LocalDate.of(1990,7,7));
        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Zagham", 10077L, 'M', LocalDate.of(1989, 7, 24));
        System.out.println(student2);
    }
}
