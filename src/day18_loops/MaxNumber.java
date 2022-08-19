package day18_loops;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int max= -2147483648;   // System.out.println(Integer.MAX_VALUE);
        int min = 2147483647; // System.out.println(Integer.MIN_VALUE);
        int num=0;

        while (num++ < 5) {      //post increment, runs 5 times | start from 0 to 4 = 5 times

            System.out.println("Enter a number");
            int inputNum = input.nextInt();

            if (inputNum > max) {
                max = inputNum; // if new number from console is bigger than current biggest number, we foiund a new max number and reassign it to the variable.
            }
            if (inputNum < min) {
                min = inputNum;
            }

            System.out.println("Max: " + max);
            System.out.println("Min: " + min);

        }
    }
}
