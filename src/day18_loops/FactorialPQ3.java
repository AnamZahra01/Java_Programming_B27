package day18_loops;

import java.util.Scanner;

public class FactorialPQ3 {
    /*
    write a program that calculates the factorial of a number:
    ex: 5! = 5 * 4 * 3 * 2 * 1 = 120
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        int counter = num;        // if num =5, counter = 5;
        int fact = 1;
        while (counter > 0){      // counter = 5,4,3,2,1

            fact *= counter; // 1*5 = 5 -> 5*4 = 20 -> 20*3 = 60 -> 60*2 = 120 -> 120*1 = 120

          counter--;
        }

        System.out.println("Factorial of " +num+ " = " +num+ "! = " +fact);

    }
}
