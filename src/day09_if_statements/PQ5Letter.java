package day09_if_statements;

import java.util.Scanner;

/*
PQ-05:  Create a char variable letter. Find and print if the character is a letter, number, or special character
	ex: p
		letter
	ex: 6
		number
	ex: $
		speical character
 */
public class PQ5Letter {
    public static void main(String[] args) {

        char letter = '@';

       // Scanner input = new Scanner(System.in);
       // System.out.println("Enter a small letter a-z, or capital letter A-Z, or number 0-9, or special character");
       // char letter = input.next().charAt(0);

        if (letter >= 'a' && letter <= 'z'){ // 26 charcters
            System.out.println(letter+ " is a Lower Case Letter");
        }
        if (letter >= 'A' && letter <= 'Z' ){
            System.out.println(letter+ " is Upper Case Letter");
        }
        if (letter >='0' && letter <= '9'){ // 10 characters
            System.out.println(letter+ " is a Number");
        }
        //(Source: Google) Special Characters Range: (32–47 / 58–64 / 91–96 / 123–126) --> (26+16+7+6+4= )
        if ((letter >= 32 && letter <= 47 )|| (letter >= 58 && letter <= 64) || (letter >= 91 && letter <= 96) || (letter >= 123 && letter <= 126)){
            System.out.println(letter+ " is Special Character");
        }

    }
}