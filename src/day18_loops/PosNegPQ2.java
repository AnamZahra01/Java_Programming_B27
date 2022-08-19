package day18_loops;

import java.util.Scanner;

public class PosNegPQ2 {
    /*
    write a program that will ask the user to enter 5 numbers and print how many were positive and how many were negative
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int counter = 1;
        int positiveNum = 0;
        int negativeNum = 0;

        while(counter ++ <= 5) {             // counter = 1,2,3,4,5

            System.out.print("Enter a number");
            int num = input.nextInt();         // user input 5 times cz it is inside while loop

            if (num >= 0) {                    // if entered num >=0 --> 0=0+1 =1
                positiveNum = positiveNum + 1;

            } else {
                negativeNum = negativeNum + 1;
            }

        }
        System.out.println("Positive numbers: " + positiveNum);
        System.out.println("Negative numbers: " + negativeNum);

    }
}
