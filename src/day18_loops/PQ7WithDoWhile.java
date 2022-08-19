package day18_loops;

import java.util.Scanner;

public class PQ7WithDoWhile {
    /*
     write a program that will allow you to guess a secret number.
    Define a number in the code in a specific range, for example 1-100. Then the program is for the user to guess that number
    They will guess a number and get a response. They can keep guessing until they get is right
        give hints:
            number is bigger
            number is smaller

    bonus: keep track of the number of attempts it took to guess the number
     */

/* ToDo: PQ 4,5,6,7 with Do while loop */

//    public static void main(String[] args) {
//
//        do {
//
//        }while (true);
//
//
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        int secretNum = 89;
        int inputNum ;
        int attempts = 0;

        do {
        System.out.println("Guess a number: ");
        inputNum = input.nextInt();

        if(inputNum < secretNum){ //50
        System.out.println("Number is higher");
        } else if (inputNum > secretNum) {
        System.out.println("Number is lower");
        }
        attempts++;

        } while (inputNum != secretNum);

        System.out.println("You guessed the number in " + attempts + " attempts");

        }
   }

