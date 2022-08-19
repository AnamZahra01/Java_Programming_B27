package day16_string;

import java.util.Scanner;

public class PQ6 {
    /*
    [Middle char]

Given a String, write a program to display the middle character of a string
    a) If the length of the string is even there will be two middle characters.
    b) If the length of the string is odd there will be one middle character.

    Input:
        elephant
    Output:
        The middle characters: ph
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
         String word = input.next();

         int len = word.length();
         boolean isOdd = len % 2 != 0;
         int value = word.length() / 2;

         if(isOdd){
             System.out.println(word.charAt(value));
         } else {
             System.out.println(word.charAt(value-1) + "" + word.charAt(value));
         }


    }
}
