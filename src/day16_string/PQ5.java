package day16_string;

import java.util.Scanner;

public class PQ5 {
    /*
    [Move first word]
Given a sentence. Display the sentence with the first word moved to the end of the sentence.
    Input:
        Java is a fun language
    Output:
        is a fun language Java
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
         String sen = input.nextLine();
         System.out.println("Sentence: " + sen);

         int indexOfSpace = sen.indexOf(" ");
         int len = sen.length();

         String firstWord = sen.substring(0,indexOfSpace);
         sen = "" + sen.substring(indexOfSpace+1, len) + " " + firstWord;
        System.out.print("New Sentence: " + sen);
    }
}
