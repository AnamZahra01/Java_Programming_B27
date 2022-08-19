package day18_loops;

import java.util.Scanner;

public class PQ3WithDW {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt(); //5
        int counter = number;   //5
        int fact = 1;
        do {
            fact = fact * counter; // 5! = 5*4*3*2*1;

            counter--;
        }while (counter > 0);

        System.out.println("Factorial = " + fact);
    }
}
