package day03_variables;

public class VariablePractice {
    public static void main(String[] args) {

        byte age; // declared a byte variable called age
        age = 10; //assigning 10 to variable age
        System.out.println(age); //this will print the value of variable i.e. 10
        System.out.println("age"); //prints character age, not value of variable i.e. 10.

        //Quiz confusing question
        float f = 10;
        System.out.println("f = " + f);
        long l = (long)f;
        System.out.println("l = " + l);
    }
}

