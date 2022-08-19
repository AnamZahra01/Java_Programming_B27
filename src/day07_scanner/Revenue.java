package day07_scanner;
/*
PQ-02.  Create a program that will ask the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.
 */
import java.util.Scanner;   //Scanner class reads data from keyboard. Syntax: import.packageName.className;
public class Revenue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Object named input
        System.out.println("Enter price: ");
        double price = input.nextDouble(); // object 'input' calls method 'nextDouble()', syntax: object.method();

        System.out.println("Enter quantity: ");
        int quantity = input.nextInt(); //object 'input' calls method 'nextInt()', and user input stores in 'quantity' variable.

        double revenue = price * quantity; //formula
        System.out.println("Revenue = " + revenue);


    }
}
