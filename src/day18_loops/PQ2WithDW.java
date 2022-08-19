package day18_loops;

import java.util.Scanner;

public class PQ2WithDW {
    /*
   write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
    */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int counter = 1;
    int positiveNumber = 0;
    int negativeNumber = 0;

        do {
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            if (number >= 0) {
                positiveNumber = positiveNumber + 1;
            } else { //number < 0
                negativeNumber = negativeNumber + 1;
            }
            counter++;
        } while (counter <= 5);

        System.out.println("Positive values: " + positiveNumber);
        System.out.println("Negative values: " + negativeNumber);

    }
}
