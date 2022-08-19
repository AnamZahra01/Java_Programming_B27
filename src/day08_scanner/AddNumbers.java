package day08_scanner;
//PQ-01:
import java.util.Scanner;                              // importing Scanner package
public class AddNumbers {                              // Class is mandatory
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);             // Scanner object
        System.out.println("Enter number 1");
        //input.nextInt();      here no saving of input and no using
        int num1 = input.nextInt();

        System.out.println("Enter number 2");
        int num2 = input.nextInt();

        System.out.println("Sum: " + (num1 + num2));

    }
}
