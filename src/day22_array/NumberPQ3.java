package day22_array;

import java.util.Scanner;

public class NumberPQ3 {
    /*
    Create a program that will ask the user to enter a number and print the number as a word. Set a range from 0 - 15 and any number not in the range should get an invalid number message
    Ex: > 1
        one
        > 10
        ten
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if(number >= 1 && number <= 15) {
            String[] numbersInWords = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen"};
            String output = numbersInWords[number - 1];
            System.out.println(output);
        } else{
            System.out.println("Enter number from 1 to 15");
        }

    }
}
