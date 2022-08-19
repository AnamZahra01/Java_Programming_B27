package day18_loops;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        int validPin = 1234;
        int userPin;
        int attempts = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Enter your pin");
            userPin = input.nextInt();
            attempts++;

        }while (attempts < 3 && userPin != validPin);

        if(attempts < 3 && userPin == validPin) {
            System.out.println("Logged in");
        } else {
            System.out.println("Locked accout, too many attempts");
        }
    }
}
