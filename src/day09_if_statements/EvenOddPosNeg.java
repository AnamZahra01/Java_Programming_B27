package day09_if_statements;

import java.util.Scanner;

public class EvenOddPosNeg {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = input.nextInt();
        String output = " ";

        if (number % 2 == 0){
            //System.out.println(number+ " is even");
            output += number+ " is even";
            if (number >= 0){
                //System.out.println(number+ " is positive");
                output += " and positive";
            } else {     // number < 0
                //System.out.println(number+ " is even an negative");
                output += " and negative";
            }


        } else {  // number % 2 != 0
           // System.out.println(number+ " is odd");
            output += number+ " is odd";
            if (number > 0){
                //System.out.println(number + " is positive odd number");
            output += " and positive";
            } else {
                //System.out.println( " and negative");
                output += " and negative";
            }
        }
        System.out.println(output);

    }
}
