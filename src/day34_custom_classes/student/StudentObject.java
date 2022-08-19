package day34_custom_classes.student;

public class StudentObject {
    public static void main(String[] args) {
            //reference  = new object
        Student studentOne = new Student(); //creating object
        System.out.println(studentOne);

        //instance variables being assigned a value
        studentOne.name = "Olena";
        studentOne.batchNumber = 27;
        studentOne.program = "SDET";
        studentOne.grade = 99.9;

        System.out.println(studentOne);

        System.out.println(studentOne.name);
        System.out.println(studentOne.batchNumber);
        System.out.println(studentOne.program);
        System.out.println(studentOne.grade);
        studentOne.study();
        System.out.println("--------");

        Student studentTwo = new Student(); //creating new obj
        System.out.println(studentTwo.name);
        System.out.println(studentTwo.batchNumber);
        System.out.println(studentTwo.program);
        System.out.println(studentTwo.grade);
        studentTwo.study();
        System.out.println("--------");

    }
}
