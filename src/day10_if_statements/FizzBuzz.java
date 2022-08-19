package day10_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = input.nextInt();
        String output;

        if (number % 3 == 0 && number % 5 ==0){ //tricky question
            output = "FizzBuzz";
        } else if (number % 3 == 0) {
            output = "Fizz";
        } else if (number % 5 == 0){
            output = "Buzz";
        } else {
            output = "Number : " +number;
        }

        //For printing
        if (number > 0) {
            System.out.println(output);
        } else {
            System.out.println("Enter positive number greater than 0");
        }

    }
}
