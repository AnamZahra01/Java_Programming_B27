package day18_loops;

public class DoWhileExample {
    public static void main(String[] args) {

        int i = 0; // do-while runs at-least once, no matter what.
        do {    // runs code first and checks the condition later.
            System.out.println(i);
        }while (false);

        System.out.println("------------");

        do {
            System.out.println(i);
            i++;
        }while (i <= 10);


    }
}
