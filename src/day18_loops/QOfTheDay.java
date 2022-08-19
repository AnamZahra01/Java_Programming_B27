package day18_loops;

public class QOfTheDay {
    public static void main(String[] args) {
        boolean x , z = true;
        int y = 20;
        x = (y == 10)|| (z = false);
        System.out.println("x = " + x); // true
        System.out.println("y = " + y); // 20
        System.out.println("z = " + z); //false

    }
}
