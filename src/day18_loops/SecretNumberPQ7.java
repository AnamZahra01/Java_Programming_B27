package day18_loops;

import java.util.Scanner;

public class SecretNumberPQ7 {
    /*
    write a program that will allow you to guess a secret number.
    Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number
    They will guess a number and get a response. They can keep guessing until they get is right
        give hints:
            number is bigger
            number is smaller

    bonus: keep track of the number of attempts it took to guess the number
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secretNumber = (int) (Math.random() * ((100 - 1) + 1)) + 1; //random number generator. src: Google
      // System.out.println(secretNumber);
       System.out.print("Guess the number: ");

       int attempts = 0;
        boolean counter = true;
        while (counter) {

            attempts++;
            int userEntered = input.nextInt();
            if (userEntered > secretNumber) {
                System.out.println("Number is smaller!!");
            } else if (userEntered < secretNumber) {
                System.out.println("Number is bigger!!");
            } else if (userEntered == secretNumber) {
                System.out.println("You win!!");
                //break;
                counter = false;
            }
       //  counter++;
        }
        System.out.println("Number of attempts: " +attempts);
    }
}
