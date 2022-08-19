package day18_loops;

import java.util.Scanner;

public class SumTillNegPQ5 {
    /*
    Write a program that calculates the sum of numbers entered by the user until user enters a negative number.
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
       boolean counter = true;

        while (counter) {

            System.out.print("Enter number: ");
            int num = input.nextInt();

            if (num > 0) {
                sum = sum + num;
            } else {
                counter = false;
            }

            System.out.println("Sum = " +sum);

      }

    }
}
