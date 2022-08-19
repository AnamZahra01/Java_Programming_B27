package day14_string;

import java.util.Scanner;

public class PQ3 {
    /*
   PQ-03:    Use scanner to read a String from the console
             Remove extra spaces in the beginning or end
             Print in all lowercase
             Print the number of characters
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Write a sentence: ");
        String sentence = input.nextLine();

        System.out.println("Length before trim: " + sentence.length());

        String newSentence = sentence.trim();
        System.out.println(newSentence.toLowerCase());
        System.out.println("Length after trim: " + newSentence.length());

    }
}
