package day07_scanner;
/*
PQ-01.  Create a program that will ask the user to enter two numbers. Add the numbers and print the result

 */
import java.sql.SQLOutput;
import java.util.Scanner;        //Scanner class reads data from keyboard. Syntax: import.packageName.className;
public class AddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);           // Scanner Object

        System.out.println("Enter first number: ");       //user input1
        int firstNumber = input.nextInt();                //user input1 stored in variable "firstNumber" , syntax to call method next.int(): object.method();

        System.out.println("Enter second number: ");      //user input2
        int secondNumber = input.nextInt();               // user input2 stored in variable "secondNumber"

        int sum = firstNumber + secondNumber ;
        System.out.println("Sum: " +firstNumber+ " + " +secondNumber+ " = " +sum);

    }
}
