package day22_array.adams_only;

import java.util.Scanner;

public class Task2 {
    /*
    Given a string, return a string length 2 made of its first 2 chars.
	If the string length is less than 2, use '@' for the missing chars.

						"hello" → "he"
						"hi" 	→ "hi"
						"h"	    → "h@"
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = input.nextLine();

        String output = "";
        if(str.length() < 2){
            output = str.charAt(0) + "@";
        } else {
            output = str.charAt(0) + "" + str.charAt(1);
        }

        System.out.println(output);
    }
}
