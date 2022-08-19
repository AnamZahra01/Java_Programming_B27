package day11_nested;

import java.util.Scanner;

/*
PQ-04: Declare and assign two expected numbers:
	    pin code: 1234
	    ssn: 1111
ask the user to enter the two numbers and compare them with the system values defined above. If they match print Authentication successful
if they don't match print all the reasons that authentication failed:
	if the pin code was incorrect print: Pin Code is incorrect
	if the ssn was incorrect print: Last 4 SSN numbers are incorrect
 */
public class ExpectedNumbers {
    public static void main(String[] args) {

        int pinCode = 1234;
        int ssn = 1111;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your pin code: ");
        int first = input.nextInt();
        System.out.print("Please enter your last 4 digits of SSN: ");
        int second = input.nextInt();

        if (pinCode == first && ssn == second){
            System.out.println("Authentication Successful");
        } else {
            System.out.println("Access denied");
            if (pinCode != first) { //2 seperate if statements to cover up all scenarios.
                System.out.println("Pin code is incorrect");
            }
            if (ssn != second){
                System.out.println("Last 4 numbers are incorrect");
            }
        }


    }
}
