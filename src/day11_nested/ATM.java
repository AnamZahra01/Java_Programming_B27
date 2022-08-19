package day11_nested;
//Quiz : if, no nested if statements
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int validPasscode = 7021; //passcode we need to give to log in
        System.out.println("Welcome to the ATM. Enter your card and enter your passcode");
        int userPasscode = input.nextInt(); //passcode the user inputs

        if (userPasscode == validPasscode){
            System.out.println("Logged in!\nSelect a number\n\t1-Check balance\n\t2-Withdraw\n\t3-Deposit");
            int selection = input.nextInt();

            if(selection == 1){
                System.out.println("Your balance is: $1,000,000");
            } else if (selection == 2) {
                System.out.println("How much do you want to withdraw?");
                System.out.println("withdrawing " +input.nextInt()); //withdrawing 100$
            } else if (selection == 3) {
                System.out.println("Enter the amount you want to deposit");
                int deposit = input.nextInt();
                System.out.println("Depositing $" + deposit);
            }
        } else {
            System.out.println("Invalid Passcode");
        }

    }
}
