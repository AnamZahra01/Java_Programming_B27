package day08_scanner;
//PQ-03:
import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        double angle1 = input.nextDouble();
        double angle2 = input.nextDouble();
        double angle3 = input.nextDouble();

        double sum = angle1 + angle2 + angle3;

        boolean isTriangle = sum == 180;
        boolean isCircle = sum == 360;

        System.out.println("isCircle = " + isCircle);
        System.out.println("isTriangle = " + isTriangle);



    }
}
