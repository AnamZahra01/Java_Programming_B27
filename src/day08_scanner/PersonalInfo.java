package day08_scanner;

import java.util.Scanner;
/*
ask for first name, last name, address
 */
public class PersonalInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("PLease Enter your first name: ");
        String firstName = input.next();

        System.out.println("Please Enter your last name: ");
        String lastName = input.next();

        input.nextLine(); //for enter address, or you can use all .nextlines(), or use .nextline() first and .next() at last.

        System.out.println("Please enter your address: ");
        String address = input.nextLine();

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("address = " + address);

    }
}
