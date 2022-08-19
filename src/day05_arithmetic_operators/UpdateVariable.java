package day05_arithmetic_operators;

public class UpdateVariable {
    public static void main(String[] args) {

        int a = 4;
        System.out.println( a + 10);
        System.out.println(a);

        a = a + 20; //reassigning variables.
        System.out.println(a);

        //short hand operators:
        a += 10;
        System.out.println(a);
    }
}
