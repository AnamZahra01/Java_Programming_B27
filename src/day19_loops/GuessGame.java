package day19_loops;

import java.util.Scanner;

public class GuessGame {
    /*
    PQ7
     */
    public static void main(String[] args) {
        int secretNumber = 87;
        int inputNumber ;
        Scanner input = new Scanner(System.in);
        int attempts = 0;

        do {
            System.out.println("Guess a number: ");
            inputNumber = input.nextInt();

            if(inputNumber < secretNumber){ //50
                System.out.println("Number is higher");
            } else if (inputNumber > secretNumber) {
                System.out.println("Number is lower");
            }
            attempts++;

        } while (inputNumber != secretNumber);

        System.out.println("You guessed the number in " + attempts + " attempts");

    }
}
