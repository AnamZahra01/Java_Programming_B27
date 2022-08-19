package day37_static.student;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {

        CydeoStudent.schoolInfo();

        CydeoStudent mayila = new CydeoStudent("Mayila", "Toronto", 2);
        System.out.println(mayila);
        //System.out.println(mayila.instructors); not recommended -> use Class name to access
        System.out.println(Arrays.toString(CydeoStudent.instructors));

        System.out.println(CydeoStudent.instructors[1].charAt(3));

        System.out.println(mayila.myCoffee.amountLeft);
        mayila.drink();
        System.out.println(mayila.myCoffee.amountLeft);
        System.out.println();

        CydeoStudent ali = new CydeoStudent("Ali", "Ottawa", 1);
        System.out.println(ali.myCoffee.amountLeft);
        ali.drink();
        ali.drink();
        ali.drink();
        System.out.println(ali.myCoffee.amountLeft);

    }
}
