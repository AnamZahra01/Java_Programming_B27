package day07_scanner;
/*
PQ-03:  Create a program that will ask the user to enter 3 angle numbers ( can be floating numbers )
        Determine if the angles make a triangle, which means the angles add to 180.0 and
        Determine if the angles make a circle, which means the angles add to 360.0
 */
import java.util.Scanner;                       //Scanner CLASS reads data from keyboard
public class Angles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Object named 'input'
        System.out.println("Enter three numbers: ");
        float angle1 = input.nextFloat();        // first value stored in 'angle1'. Object 'input' calls method nextFloat() --> object.method();
        float angle2 = input.nextFloat();
        float angle3 = input.nextFloat();

        float sum = angle1 + angle2 + angle3;   // sum of three angles entered by user
        boolean isTriangle = (sum == 180);
        boolean isCircle = (sum == 360);

        System.out.println("Sum of angles = " +sum+ " \t|\t Is This Triangle ? " +isTriangle);
        System.out.println("Sum of angles = " +sum+ " \t|\t Is This Circle ? " + isCircle);
    }
}
