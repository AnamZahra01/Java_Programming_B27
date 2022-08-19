package day16_string;

import java.util.Scanner;

public class InitialsPQ5 {
    /*
    create a program to ask the user to enter their first name and last name.
Then print the initials of the person in uppercase format.
The intials are made up of the first letters of the first and last names.

	Ex:
		james
		bond

		JB

	Ex:
		anna
		lee

		AL

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();
        System.out.println("Enter your last name");
        String lastName = input.next();

        String initials = "" + firstName.charAt(0) + lastName.charAt(0); // "" at start shows concatenation
        System.out.println(initials.toUpperCase());

        //charAt(0) and indexOf() are opposite.

    }
}
