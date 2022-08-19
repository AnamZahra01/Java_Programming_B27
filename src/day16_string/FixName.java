package day16_string;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.next().toLowerCase();
        System.out.print("Enter your last name: ");
        String lastName = input.next().toLowerCase();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        System.out.println(firstName + " " +lastName);

    }
}
